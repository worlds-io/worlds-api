package io.worlds.api.client;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.netty.handler.ssl.SslContextBuilder;
import io.netty.handler.ssl.util.InsecureTrustManagerFactory;
import java.time.Duration;
import java.util.function.Consumer;
import javax.net.ssl.SSLException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import org.jetbrains.annotations.NotNull;
import org.springframework.graphql.client.HttpGraphQlClient;
import org.springframework.http.HttpHeaders;
import org.springframework.http.client.reactive.ReactorClientHttpConnector;
import org.springframework.web.reactive.function.client.ExchangeStrategies;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.WebClientResponseException;
import reactor.netty.http.client.HttpClient;

import java.util.Collections;

@RequiredArgsConstructor
@Slf4j
public class WorldsGraphQLClient {
    protected static final String X_TOKEN_ID = "x-token-id";
    protected static final String X_TOKEN_VALUE = "x-token-value";

    protected static final String MESSAGE_TYPE_NEXT = "\"next\"";
    protected static final String MESSAGE_TYPE_ERROR = "\"error\"";
    protected static final String MESSAGE_TYPE_COMPLETE = "\"complete\"";

    private final String apiUrl;
    private final String apiTokenId;
    private final String apiTokenValue;
    private final ObjectMapper objectMapper;

    public HttpGraphQlClient blockingClient() {
        return HttpGraphQlClient.builder(webClient()).build();
    }

    public String svcUrl(){
        String svcUrl = apiUrl;
        if (!(svcUrl.contains("/graphql"))) {
            svcUrl = svcUrl + "/graphql";
        }
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

    private WebClient webClient() {
        WebClient.Builder builder = WebClient.builder()
                .exchangeStrategies(ExchangeStrategies.builder()
                        .codecs(cfgr -> cfgr.defaultCodecs().maxInMemorySize(5 * 1024 * 1024))
                        .build())
                .baseUrl(svcUrl())
                .defaultHeaders(hdrs -> hdrs.putAll(authHeaders()))
                .filter((request, next) ->
                    next.exchange(request).doOnError(throwable -> {
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


    /**
     * Represents an active OkHttp GraphQL subscription. Call close() to terminate.
     */
    public static class WorldsGraphQLSubscription implements AutoCloseable {
        private final WebSocket webSocket;
        private volatile boolean closed = false;
        WorldsGraphQLSubscription(WebSocket webSocket) {
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

    public WorldsGraphQLSubscription subscribe(String subscriptionQuery, Consumer<JsonNode> onMessage) {
        return subscribe(subscriptionQuery, onMessage, JsonNode.class);
    }

    public <T> WorldsGraphQLSubscription subscribe(String subscriptionQuery, Consumer<T> onMessage, Class<T> type) {
        return subscribe(subscriptionQuery, onMessage, type, err -> { throw new RuntimeException(err); }, null);
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
    public <T> WorldsGraphQLSubscription subscribe(String subscriptionQuery, Consumer<T> onMessage, Class<T> type, Consumer<Throwable> onError) {
        return subscribe(subscriptionQuery, onMessage, type, onError, null);
    }

    public <T> WorldsGraphQLSubscription subscribe(
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
            public void onOpen(@NotNull WebSocket webSocket, @NotNull Response response) {
                webSocket.send(connectionInit);
            }
            @Override
            public void onMessage(@NotNull WebSocket webSocket, @NotNull String text) {
                if (!ackReceived && text.contains("connection_ack")) {
                    ackReceived = true;
                    webSocket.send(subscriptionPayload);
                } else {
                    try {
                        processMessage(webSocket, text);
                    } catch (Exception e) {
                        onError.accept(e);
                    }
                }
            }

            private void processMessage(@NotNull WebSocket webSocket, @NotNull String text) throws JsonProcessingException {
                JsonNode envelope = objectMapper.readTree(text);

                if (!envelope.has("type")) {
                    log.debug("Received non-typed message: " + text);
                    return;
                }

                switch (envelope.get("type").toString()) {
                    case MESSAGE_TYPE_NEXT -> {
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
                    case MESSAGE_TYPE_ERROR -> {
                        onError.accept(new RuntimeException("Subscription error: " + envelope.get("payload").toString()));
                    }
                    case MESSAGE_TYPE_COMPLETE -> {
                        webSocket.close(1000, "Completed");
                    }
                    default -> {
                        log.debug("Received unhandled message type: " + envelope.get("type").toString());
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
        return new WorldsGraphQLSubscription(wsRef[0]);
    }
}
