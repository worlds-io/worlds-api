package io.worlds.api.model;

/**
 * Indicates the field used for sorting an [`events` query]({{Queries.eventChronicles}}).
 */
public enum EventChronicleSortField {

    /**
     * 
Sort the resulting list by the [`eventChronicle`]({{Types.eventChronicle}})'s unique identifier.
     */
    ID("ID"),
    /**
     * 
Sort the resulting list by the [`eventChronicle`]({{Types.eventChronicle}})'s timestamp.
     */
    TIMESTAMP("TIMESTAMP"),
    /**
     * 
Sort the resulting list by the [`eventChronicle`]({{Types.eventChronicle}})'s name.
     */
    NAME("NAME"),
    /**
     * 
Sort the resulting list by the [`eventChronicle`]({{Types.eventChronicle}})'s priority.
     */
    PRIORITY("PRIORITY"),
    /**
     * 
Sort the resulting list by the [`eventChronicle`]({{Types.eventChronicle}})'s status.
     */
    STATUS("STATUS");

    private final String graphqlName;

    private EventChronicleSortField(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
