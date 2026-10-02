package io.worlds.api.model;

/**
 * Indicates the field used for sorting an `eventChronicles` query.
 */
public enum EventChronicleSortField {

    /**
     * Sort the resulting list by the `eventChronicle`'s unique identifier.
     */
    ID("ID"),
    /**
     * Sort the resulting list by the `eventChronicle`'s timestamp.
     */
    TIMESTAMP("TIMESTAMP"),
    /**
     * Sort the resulting list by the `eventChronicle`'s name.
     */
    NAME("NAME"),
    /**
     * Sort the resulting list by the `eventChronicle`'s priority.
     */
    PRIORITY("PRIORITY"),
    /**
     * Sort the resulting list by the `eventChronicle`'s status.
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
