package io.worlds.api.model;

/**
 * Indicates the field used for sorting a [zoneIntersections query]({{Queries.zoneintersections}}).
 */
public enum ZoneIntersectionsSortField {

    /**
     * Sort the resulting list in by its unique identifier.
     */
    ID("ID"),
    /**
     * Sort the resulting list by the intersection start time.
     */
    START_TIME("START_TIME");

    private final String graphqlName;

    private ZoneIntersectionsSortField(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
