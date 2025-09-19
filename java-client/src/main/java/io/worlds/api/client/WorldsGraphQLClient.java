package io.worlds.api.client;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.netty.handler.ssl.SslContextBuilder;
import io.netty.handler.ssl.util.InsecureTrustManagerFactory;
import java.time.Duration;
import java.util.function.Consumer;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLException;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import org.springframework.graphql.client.HttpGraphQlClient;
import org.springframework.graphql.client.HttpSyncGraphQlClient;
import org.springframework.http.HttpHeaders;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.http.client.reactive.ReactorClientHttpConnector;
import org.springframework.web.client.RestClient;
import org.springframework.web.reactive.function.client.ExchangeStrategies;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.WebClientResponseException;
import reactor.netty.http.client.HttpClient;

import java.security.cert.X509Certificate;
import java.util.Collections;

@RequiredArgsConstructor
@Slf4j
public class WorldsGraphQLClient {
    protected static final String X_TOKEN_ID = "x-token-id";
    protected static final String X_TOKEN_VALUE = "x-token-value";

    private final String apiUrl;
    private final String apiTokenId;
    private final String apiTokenValue;
    private final ObjectMapper objectMapper;

    public HttpSyncGraphQlClient syncClient() {
        return HttpSyncGraphQlClient.builder(restClient()).build();
    }

    public HttpGraphQlClient blockingClient() {
        return HttpGraphQlClient.builder(webClient()).build();
    }

    public String svcUrl(){
        String svcUrl = apiUrl;
        if(!(svcUrl.contains("/graphql")))
            svcUrl = svcUrl + "/graphql";
        return svcUrl;
    }

    public String socketUrl() {
        String svcUrl = svcUrl();
        svcUrl = svcUrl.replaceFirst("api", "graphql");
        if (svcUrl.startsWith("http")) {
            return svcUrl.replaceFirst("http", "ws");
        }
        return "ws://" + svcUrl;
    }

    private RestClient restClient(){
        SimpleClientHttpRequestFactory requestFactory = new SimpleClientHttpRequestFactory();
        if(svcUrl().toLowerCase().contains("https"))
            configureSSL();
        return RestClient.builder()
                .defaultHeaders(h -> h.putAll(authHeaders()))
                .baseUrl(svcUrl())
                .requestFactory(requestFactory)
                .build();
    }

    private WebClient webClient() {
        WebClient.Builder builder = WebClient.builder()
                .exchangeStrategies(ExchangeStrategies.builder()
                        .codecs(cfgr -> cfgr.defaultCodecs().maxInMemorySize(5 * 1024 * 1024))
                        .build())
                .baseUrl(svcUrl())
                .defaultHeaders(hdrs -> hdrs.putAll(authHeaders()))
                .filter((request, next) ->
                    next.exchange(request)
                        .doOnError(throwable -> {
                            if (isFatalError(throwable)) {
                                log.error("Fatal GraphQL error detected (502/503)." + throwable.getMessage());
                            }
                        })
                );

        if (svcUrl().toLowerCase().startsWith("https")) {
            HttpClient httpClient = HttpClient.create()
                    .secure(sslContextSpec -> {
                        try {
                            sslContextSpec.sslContext(SslContextBuilder.forClient()
                                    .trustManager(InsecureTrustManagerFactory.INSTANCE)
                                    .build());
                        } catch (SSLException e) {
                            throw new RuntimeException(e);
                        }
                    });
            builder.clientConnector(new ReactorClientHttpConnector(httpClient));
        }
        return builder.build();
    }

    private boolean isFatalError(Throwable throwable) {
        if (throwable instanceof WebClientResponseException ex) {
            int statusCode = ex.getStatusCode().value();
            return statusCode == 502 || statusCode == 503;
        }
        return false;
    }

    private HttpHeaders authHeaders(){
        HttpHeaders hdrs = new HttpHeaders();
        hdrs.put(X_TOKEN_ID, Collections.singletonList(apiTokenId));
        hdrs.put(X_TOKEN_VALUE, Collections.singletonList(apiTokenValue));
        return hdrs;
    }

    private void configureSSL(){
        try {
            TrustManager[] trustAllCerts = new TrustManager[]{
                    new X509TrustManager() {
                        public void checkClientTrusted(X509Certificate[] chain, String authType) {}
                        public void checkServerTrusted(X509Certificate[] chain, String authType) {}
                        public X509Certificate[] getAcceptedIssuers() { return new X509Certificate[0]; }
                    }
            };
            SSLContext sc = SSLContext.getInstance("SSL");
            sc.init(null, trustAllCerts, new java.security.SecureRandom());
            HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());
            HostnameVerifier defaultHostnameVerifier = HttpsURLConnection.getDefaultHostnameVerifier();
            HttpsURLConnection.setDefaultHostnameVerifier(defaultHostnameVerifier);
        } catch (Exception e) {
            log.error("Failed to configure SSL: " + e.getMessage());
        }
    }

    /**
     * Represents an active OkHttp GraphQL subscription. Call close() to terminate.
     */
    public static class OkHttpGraphQLSubscription implements AutoCloseable {
        private final WebSocket webSocket;
        private volatile boolean closed = false;
        OkHttpGraphQLSubscription(WebSocket webSocket) {
            this.webSocket = webSocket;
        }
        @Override
        public void close() {
            if (!closed) {
                webSocket.close(1000, "Closed by client");
                closed = true;
            }
        }
    }

    public OkHttpGraphQLSubscription subscribeWithOkHttp(String subscriptionQuery, Consumer<String> onMessage) {
        return subscribeWithOkHttp(subscriptionQuery, onMessage, String.class);
    }

    public <T> OkHttpGraphQLSubscription subscribeWithOkHttp(String subscriptionQuery, Consumer<T> onMessage, Class<T> type) {
        return subscribeWithOkHttp(subscriptionQuery, onMessage, type, err -> { throw new RuntimeException(err); }, null);
    }

    /**
     * Generic OkHttp GraphQL subscription with automatic JSON conversion using Jackson.
     * @param subscriptionQuery The GraphQL subscription query string
     * @param onMessage Consumer for deserialized messages of type T
     * @param onError Consumer for errors
     * @param type Class of T for deserialization
     * @param <T> Target type for deserialization
     * @return Closeable subscription
     */
    public <T> WorldsGraphQLClient.OkHttpGraphQLSubscription subscribeWithOkHttp(
            String subscriptionQuery,
            Consumer<T> onMessage,
            Class<T> type,
            Consumer<Throwable> onError
                                                                                ) {
        return subscribeWithOkHttp(subscriptionQuery, onMessage, type, onError, null);
    }

    public <T> OkHttpGraphQLSubscription subscribeWithOkHttp(
            String subscriptionQuery,
            Consumer<T> onMessage,
            Class<T> type,
            Consumer<Throwable> onError,
            Duration timeout
    ) {
        OkHttpClient okHttpClient = new OkHttpClient.Builder()
            .readTimeout(timeout != null ? timeout : Duration.ofSeconds(150))
            .build();
        Request request = new Request.Builder()
            .url(socketUrl())
            .addHeader("Sec-WebSocket-Protocol", "graphql-transport-ws")
            .build();
        String connectionInit = String.format("{\"type\":\"connection_init\",\"payload\":{\"x-token-id\":\"%s\",\"x-token-value\":\"%s\"}}", apiTokenId, apiTokenValue);
        String subscriptionPayload = String.format("{\"type\":\"subscribe\",\"id\":\"1\",\"payload\":{\"query\":\"%s\"}}", subscriptionQuery.replace("\"", "\\\""));
        final WebSocket[] wsRef = new WebSocket[1];
        wsRef[0] = okHttpClient.newWebSocket(request, new WebSocketListener() {
            boolean ackReceived = false;
            @Override
            public void onOpen(WebSocket webSocket, Response response) {
                webSocket.send(connectionInit);
            }
            @Override
            public void onMessage(WebSocket webSocket, String text) {
                if (!ackReceived && text.contains("connection_ack")) {
                    ackReceived = true;
                    webSocket.send(subscriptionPayload);
                } else {
                    try {
                        JsonNode envelope = objectMapper.readTree(text);

                        if (envelope.has("type")) {
                            switch (envelope.get("type").toString()) {
                                case "\"next\"" -> {
                                    var payload = envelope.get("payload");
                                    if (payload.has("data")) {
                                        String field = payload.get("data").fieldNames().next();
                                        T value = objectMapper.treeToValue(payload.get("data").get(field), type);
                                        onMessage.accept(value);
                                    }
                                    if (payload.has("errors")) {
                                        onError.accept(new RuntimeException(objectMapper.writeValueAsString(payload.get("errors"))));
                                    }
                                }
                                case "\"error\"" -> {
                                    onError.accept(new RuntimeException("Subscription error: " + envelope.get("payload").toString()));
                                }
                                case "\"complete\"" -> {
                                    webSocket.close(1000, "Completed");
                                }
                                default -> {
                                    log.debug("Received unhandled message type: " + envelope.get("type").toString());
                                }
                            }
                        } else {
                            log.debug("Received non-typed message: " + text);
                        }
                    } catch (Exception e) {
                        onError.accept(e);
                    }
                }
            }
            @Override
            public void onFailure(WebSocket webSocket, Throwable t, Response response) {
                onError.accept(t);
            }
            @Override
            public void onClosing(WebSocket webSocket, int code, String reason) {
                webSocket.close(code, reason);
            }
        });
        return new OkHttpGraphQLSubscription(wsRef[0]);
    }
}
