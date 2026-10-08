package io.worlds.api.model;

/**
 * Indicates the field used for sorting a `geofenceIntersections` query.
 */
public enum GeofenceIntersectionsSortField {

    /**
     * Sort the resulting list by the `GeofenceIntersection`'s unique identifier.
     */
    ID("ID"),
    /**
     * Sort the resulting list by the `GeofenceIntersection`'s start time.
     */
    START_TIME("START_TIME");

    private final String graphqlName;

    private GeofenceIntersectionsSortField(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
