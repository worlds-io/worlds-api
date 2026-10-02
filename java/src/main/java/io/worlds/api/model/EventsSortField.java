package io.worlds.api.model;

/**
 * Indicates the field used for sorting an `events` query.
 */
public enum EventsSortField {

    /**
     * Sort the resulting list by the `Event`'s unique identifier.
     */
    ID("ID"),
    /**
     * Sort the resulting list by the `Event`'s start time.
     */
    START_TIME("START_TIME");

    private final String graphqlName;

    private EventsSortField(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
