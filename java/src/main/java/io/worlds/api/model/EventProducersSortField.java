package io.worlds.api.model;

public enum EventProducersSortField {

    ID("ID"),
    EVENT_PRODUCER_NAME("EVENT_PRODUCER_NAME");

    private final String graphqlName;

    private EventProducersSortField(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
