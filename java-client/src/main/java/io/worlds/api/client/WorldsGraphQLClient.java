/**
 * WorldsGraphQLClient provides convenient access to GraphQL APIs over HTTP and WebSocket.
 * <p>
 * Supports authentication via custom headers and configurable SSL certificate validation.
 * <p>
 * <b>Security Note:</b> The {@code disableCertValidation} flag should only be enabled in development environments.
 * In production, ensure certificate validation is enabled to prevent MITM attacks.
 */
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
import lombok.Setter;
import lombok.experimental.Accessors;
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
@Accessors(fluent = true)
@Setter
public class WorldsGraphQLClient {
    /** Header name for token ID authentication. */
    protected static final String X_TOKEN_ID = "x-token-id";
    /** Header name for token value authentication. */
    protected static final String X_TOKEN_VALUE = "x-token-value";

    /** Default timeout for GraphQL operations. */
    private static final Duration DEFAULT_TIMEOUT = Duration.ofSeconds(150);
    /** Maximum memory for client responses. */
    protected static final int CLIENT_MAX_MEMORY_BYTES = 5 * 1024 * 1024;

    /** Base API URL. */
    private final String apiUrl;
    /** API token ID for authentication. */
    private final String apiTokenId;
    /** API token value for authentication. */
    private final String apiTokenValue;
    /** Jackson ObjectMapper for JSON serialization/deserialization. */
    private final ObjectMapper objectMapper;

    /**
     * If true, disables SSL certificate validation (insecure; for development only).
     */
    private boolean disableCertValidation = false;

    /**
     * Creates a blocking HTTP GraphQL client.
     *
     * @return configured HttpGraphQlClient instance
     */
    public HttpGraphQlClient blockingClient() {
        return HttpGraphQlClient.builder(webClient()).build();
    }

    /**
     * Creates a WebSocket GraphQL client with authentication headers.
     *
     * @return configured WebSocketGraphQlClient instance
     */
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

    /**
     * Subscribes to a GraphQL subscription and receives messages as JsonNode.
     *
     * @param subscriptionQuery GraphQL subscription query string
     * @param onMessage         Consumer for received messages
     * @return Disposable handle for the subscription
     */
    public Disposable subscribe(String subscriptionQuery, Consumer<JsonNode> onMessage) {
        return subscribe(subscriptionQuery, onMessage, JsonNode.class);
    }

    /**
     * Subscribes to a GraphQL subscription and receives messages as the specified type.
     *
     * @param subscriptionQuery GraphQL subscription query string
     * @param onMessage         Consumer for received messages
     * @param type              Class of the message type
     * @param <T>               Target type for deserialization
     * @return Disposable handle for the subscription
     */
    public <T> Disposable subscribe(String subscriptionQuery, Consumer<T> onMessage, Class<T> type) {
        return subscribe(subscriptionQuery, onMessage, type, err -> {throw new RuntimeException("Subscription error", err);}, null);
    }

    /**
     * Subscribes to a GraphQL subscription with custom error handling.
     *
     * @param subscriptionQuery GraphQL subscription query string
     * @param onMessage         Consumer for received messages
     * @param type              Class of the message type
     * @param onError           Consumer for errors
     * @param <T>               Target type for deserialization
     * @return Disposable handle for the subscription
     */
    public <T> Disposable subscribe(String subscriptionQuery, Consumer<T> onMessage, Class<T> type,
                                    Consumer<Throwable> onError) {
        return subscribe(subscriptionQuery, onMessage, type, onError, null);
    }

    /**
     * Subscribes to a GraphQL subscription with custom error handling and timeout.
     *
     * @param subscriptionQuery GraphQL subscription query string
     * @param onMessage         Consumer for received messages
     * @param type              Class of the message type
     * @param onError           Consumer for errors
     * @param timeout           Subscription timeout duration (optional)
     * @param <T>               Target type for deserialization
     * @return Disposable handle for the subscription
     */
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

    /**
     * Builds a WebClient for HTTP GraphQL requests with authentication and optional SSL configuration.
     *
     * @return configured WebClient instance
     */
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

    /**
     * Determines if the API URL is secure (HTTPS).
     *
     * @return true if HTTPS, false otherwise
     */
    private boolean secure() {
        return apiUrl.toLowerCase().startsWith("https");
    }

    /**
     * Returns the service URL for GraphQL requests.
     *
     * @return GraphQL endpoint URL
     */
    private String svcUrl() {
        String svcUrl = apiUrl;
        if (!(svcUrl.contains("/graphql"))) {
            svcUrl = svcUrl + "/graphql";
        }
        return svcUrl;
    }

    /**
     * Returns the WebSocket URL for GraphQL subscriptions.
     *
     * @return WebSocket endpoint URL
     */
    private String socketUrl() {
        String svcUrl = svcUrl();
        svcUrl = svcUrl.replaceFirst("api", "graphql");
        if (svcUrl.startsWith("http")) {
            return svcUrl.replaceFirst("http", "ws");
        }
        return "ws://" + svcUrl;
    }

    /**
     * Checks if the given Throwable is a fatal HTTP error (502/503).
     *
     * @param throwable the error to check
     * @return true if fatal error, false otherwise
     */
    private boolean isFatalError(Throwable throwable) {
        if (throwable instanceof WebClientResponseException ex) {
            int statusCode = ex.getStatusCode().value();
            return statusCode == 502 || statusCode == 503;
        }
        return false;
    }

    /**
     * Builds authentication headers for API requests.
     *
     * @return HttpHeaders containing authentication information
     */
    private HttpHeaders authHeaders() {
        HttpHeaders hdrs = new HttpHeaders();
        hdrs.put(X_TOKEN_ID, Collections.singletonList(apiTokenId));
        hdrs.put(X_TOKEN_VALUE, Collections.singletonList(apiTokenValue));
        return hdrs;
    }

    /**
     * Builds a Reactor Netty HttpClient with optional SSL certificate validation.
     *
     * @return configured HttpClient instance
     */
    private HttpClient httpClient() {
        HttpClient httpClient = HttpClient.create();
        if (secure()) {
            httpClient.secure(sslContextSpec -> {
                try {
                    var sslContextBuilder = SslContextBuilder.forClient();
                    if (disableCertValidation) {
                        sslContextBuilder.trustManager(InsecureTrustManagerFactory.INSTANCE);
                    }
                    sslContextSpec.sslContext(sslContextBuilder.build());
                } catch (SSLException e) {
                    throw new RuntimeException(e);
                }
            });
        }
        return httpClient;
    }
}