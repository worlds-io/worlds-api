package io.worlds.api.client;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.netty.handler.ssl.SslContextBuilder;
import io.netty.handler.ssl.util.InsecureTrustManagerFactory;
import java.net.URI;
import java.time.Duration;
import java.util.function.Consumer;
import javax.net.ssl.SSLException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.graphql.client.HttpGraphQlClient;
import org.springframework.graphql.client.WebSocketGraphQlClient;
import org.springframework.graphql.client.WebSocketGraphQlClientInterceptor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.client.reactive.ReactorClientHttpConnector;
import org.springframework.web.reactive.function.client.ExchangeStrategies;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.WebClientResponseException;
import org.springframework.web.reactive.socket.client.ReactorNettyWebSocketClient;
import reactor.core.Disposable;
import reactor.core.publisher.Mono;
import reactor.netty.http.client.HttpClient;

import java.util.Collections;

@RequiredArgsConstructor
@Slf4j
public class WorldsGraphQLClient {
    protected static final String X_TOKEN_ID = "x-token-id";
    protected static final String X_TOKEN_VALUE = "x-token-value";

    private static final Duration DEFAULT_TIMEOUT = Duration.ofSeconds(150);
    protected static final int CLIENT_MAX_MEMORY_BYTES = 5 * 1024 * 1024;

    private final String apiUrl;
    private final String apiTokenId;
    private final String apiTokenValue;
    private final ObjectMapper objectMapper;

    public HttpGraphQlClient blockingClient() {
        return HttpGraphQlClient.builder(webClient()).build();
    }

    public WebSocketGraphQlClient webSocketClient() {
        WebSocketGraphQlClient wsClient = WebSocketGraphQlClient
                .builder(URI.create(socketUrl()), new ReactorNettyWebSocketClient(httpClient()))
                .interceptor(new WebSocketGraphQlClientInterceptor() {
                    @Override
                    public Mono<Object> connectionInitPayload() {
                        return Mono.just(authHeaders().toSingleValueMap());
                    }
                })
                .build();
        return wsClient;
    }

    public Disposable subscribe(String subscriptionQuery, Consumer<JsonNode> onMessage) {
        return subscribe(subscriptionQuery, onMessage, JsonNode.class);
    }

    public <T> Disposable subscribe(String subscriptionQuery, Consumer<T> onMessage, Class<T> type) {
        return subscribe(subscriptionQuery, onMessage, type, err -> {throw new RuntimeException(err);}, null);
    }

    /**
     * Generic OkHttp GraphQL subscription with automatic JSON conversion using Jackson.
     *
     * @param subscriptionQuery The GraphQL subscription query string
     * @param onMessage         Consumer for deserialized messages of type T
     * @param onError           Consumer for errors
     * @param type              Class of T for deserialization
     * @param <T>               Target type for deserialization
     *
     * @return Closeable subscription
     */
    public <T> Disposable subscribe(String subscriptionQuery, Consumer<T> onMessage, Class<T> type,
                                    Consumer<Throwable> onError) {
        return subscribe(subscriptionQuery, onMessage, type, onError, null);
    }

    public <T> Disposable subscribe(String subscriptionQuery, Consumer<T> onMessage, Class<T> type,
                                    Consumer<Throwable> onError, Duration timeout) {
        WebSocketGraphQlClient wsClient = webSocketClient();

        return wsClient.document(subscriptionQuery).executeSubscription()
                       .doOnError(onError::accept)
                       .timeout(timeout != null ? timeout : DEFAULT_TIMEOUT)
                       .doOnNext(resp -> {
                           try {
                               JsonNode dataNode = objectMapper.valueToTree(resp.getData());

                               if (dataNode == null || dataNode.isNull()) {
                                   onError.accept(new RuntimeException("Received null data in subscription response"));
                                   return;
                               }
                               var contentField = dataNode.fieldNames().next();
                               if (contentField == null) {
                                   onError.accept(new RuntimeException("No content field found in subscription data"));
                                   return;
                               }
                               JsonNode contentNode = dataNode.get(contentField);
                               if (contentNode == null || contentNode.isNull()) {
                                   onError.accept(new RuntimeException("Content field is null in subscription data"));
                                   return;
                               }
                               T value = objectMapper.treeToValue(contentNode, type);
                               onMessage.accept(value);
                           } catch (JsonProcessingException jpe) {
                               onError.accept(jpe);
                           }
                       }).subscribe();
    }

    private WebClient webClient() {
        WebClient.Builder builder = WebClient.builder()
                .exchangeStrategies(ExchangeStrategies.builder()
                                                      .codecs(cfgr -> cfgr.defaultCodecs().maxInMemorySize(CLIENT_MAX_MEMORY_BYTES))
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

        if (secure()) {
            builder.clientConnector(new ReactorClientHttpConnector(httpClient()));
        }
        return builder.build();
    }

    private boolean secure() {
        return apiUrl.toLowerCase().startsWith("https");
    }

    private String svcUrl() {
        String svcUrl = apiUrl;
        if (!(svcUrl.contains("/graphql"))) {
            svcUrl = svcUrl + "/graphql";
        }
        return svcUrl;
    }

    private String socketUrl() {
        String svcUrl = svcUrl();
        svcUrl = svcUrl.replaceFirst("api", "graphql");
        if (svcUrl.startsWith("http")) {
            return svcUrl.replaceFirst("http", "ws");
        }
        return "ws://" + svcUrl;
    }

    private boolean isFatalError(Throwable throwable) {
        if (throwable instanceof WebClientResponseException ex) {
            int statusCode = ex.getStatusCode().value();
            return statusCode == 502 || statusCode == 503;
        }
        return false;
    }

    private HttpHeaders authHeaders() {
        HttpHeaders hdrs = new HttpHeaders();
        hdrs.put(X_TOKEN_ID, Collections.singletonList(apiTokenId));
        hdrs.put(X_TOKEN_VALUE, Collections.singletonList(apiTokenValue));
        return hdrs;
    }

    private HttpClient httpClient() {
        HttpClient httpClient = HttpClient.create();
        if (secure()) {
            httpClient.secure(sslContextSpec -> {
                try {
                    sslContextSpec.sslContext(SslContextBuilder.forClient()
                                                               .trustManager(InsecureTrustManagerFactory.INSTANCE)
                                                               .build());
                } catch (SSLException e) {
                    throw new RuntimeException(e);
                }
            });
        }
        return httpClient;
    }
}