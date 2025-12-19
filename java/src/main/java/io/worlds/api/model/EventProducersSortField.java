package io.worlds.api.model;

/**
 * Indicates the field used for sorting an [`eventProducers` query]({{Queries.eventProducers}}).
 */
public enum EventProducersSortField {

    /**
     * Sort the resulting list by the [`EventProducer`](({{Types.EventProducer}}))'s unique identifier.
     */
    ID("ID"),
    /**
     * Sort the resulting list by the [`EventProducer`](({{Types.EventProducer}}))'s name.
     */
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
