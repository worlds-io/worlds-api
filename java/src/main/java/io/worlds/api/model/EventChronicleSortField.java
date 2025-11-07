package io.worlds.api.model;

/**
 * Indicates the field used for sorting an [`eventChronicles` query]({{Queries.eventChronicles}}).
 */
public enum EventChronicleSortField {

    /**
     * 
Sort the resulting list by the [`eventChronicle`]({{Types.EventChronicle}})'s unique identifier.
     */
    ID("ID"),
    /**
     * 
Sort the resulting list by the [`eventChronicle`]({{Types.EventChronicle}})'s timestamp.
     */
    TIMESTAMP("TIMESTAMP"),
    /**
     * 
Sort the resulting list by the [`eventChronicle`]({{Types.EventChronicle}})'s name.
     */
    NAME("NAME"),
    /**
     * 
Sort the resulting list by the [`eventChronicle`]({{Types.EventChronicle}})'s priority.
     */
    PRIORITY("PRIORITY"),
    /**
     * 
Sort the resulting list by the [`eventChronicle`]({{Types.EventChronicle}})'s status.
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
