package io.worlds.api.model;

/**
 * Indicates the field used for sorting an [`chronicleProducers` query]({{Queries.chronicleProducers}}).
 */
public enum ChronicleProducersSortField {

    /**
     * Sort the resulting list by the [`ChronicleProducer`]({{Types.ChronicleProducer}})'s unique identifier.
     */
    ID("ID"),
    /**
     * Sort the resulting list by the [`ChronicleProducer`]({{Types.ChronicleProducer}})'s name.
     */
    NAME("NAME");

    private final String graphqlName;

    private ChronicleProducersSortField(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
