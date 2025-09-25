package io.worlds.api.client;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import io.worlds.api.model.Event;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.graphql.client.ClientGraphQlResponse;
import org.springframework.graphql.client.GraphQlClient;
import reactor.core.publisher.Mono;

import java.time.Duration;
import java.time.Instant;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class GraphQLClientTest {
    private WorldsGraphQLClient client;
    private String tokenId;
    private String tokenValue;
    private ObjectMapper objectMapper = new ObjectMapper();

    @BeforeAll
    void setup() {
        objectMapper.registerModule(new JavaTimeModule());
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        objectMapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);

        String url = System.getenv().getOrDefault("GRAPHQL_URL", "https://api.dev.eus.azure.worlds.io/graphql");
        tokenId = System.getenv().getOrDefault("GRAPHQL_TOKEN_ID", "replace_me");
        tokenValue = System.getenv().getOrDefault("GRAPHQL_TOKEN_VALUE", "replace_me");
        client = new WorldsGraphQLClient(url, tokenId, tokenValue, objectMapper);
    }

    @Test
    @Disabled // These are not automated tests, just for manual experimentation
    void testEventsQuery() {
        // Use a 24-hour window for today in ISO-8601 format
        var end = Instant.now();
        var start = end.minus(Duration.ofHours(23));
        String query = String.format("query { events(filter: { time: { between: [\"%s\", \"%s\"] } }, first: 1) { edges { node { id type subType startTime endTime } } } }", start, end);
        GraphQlClient blocking = client.blockingClient();
        Mono<ClientGraphQlResponse> responseMono = blocking.document(query).execute();
        ClientGraphQlResponse response = responseMono.block(Duration.ofSeconds(10));
        assertNotNull(response, "Query response should not be null");
        if (!response.getErrors().isEmpty()) {
            System.err.println("GraphQL Errors: " + response.getErrors());
        }
        assertTrue(response.getErrors().isEmpty(), "Response contains errors: " + response.getErrors());
        Object data = response.getData();
        System.out.println("Events Query result: " + data);
        assertNotNull(data, "Response data should not be null");
        assertTrue(data.toString().contains("events"), "Response should contain 'events'");
    }

    @Test
    @Disabled // These are not automated tests, just for manual experimentation
    void testEventsMutation() {
        String mutation = "mutation { createEvent(input: { name: \"Test Event\" }) { id name } }";
        GraphQlClient blocking = client.blockingClient();
        Mono<ClientGraphQlResponse> responseMono = blocking.document(mutation).execute();
        ClientGraphQlResponse response = responseMono.block(Duration.ofSeconds(5));
        assertNotNull(response, "Mutation response should not be null");
        System.out.println("Events Mutation result: " + response.getData());
    }

    @Test
    @Disabled // These are not automated tests, just for manual experimentation
    void testEventsSubscription() {
        String query = "subscription { eventActivity(filter: {}) { id eventProducer { name } type subType startTime endTime } }";
        List<Event> messages = new ArrayList<>();

        var subscription = client.subscribe(query, msg -> {
            try {
                System.out.println("Received subscription message: " + objectMapper.writeValueAsString(msg));
                messages.add(msg);
            } catch (Exception jpe) {
                System.err.println("Failed to process subscription message: " + jpe.getMessage());
            }
        },
                                            Event.class,
        err -> {
            System.err.println("Subscription error: " + err.getMessage());
        });

        try {
            Thread.sleep(Duration.ofSeconds(300));
        } catch (Exception e ) {
            System.err.println("Sleep interrupted: " + e.getMessage());
        }
        Assertions.assertFalse(messages.isEmpty(), "Should receive at least one subscription message");
        subscription.dispose();
    }
}
