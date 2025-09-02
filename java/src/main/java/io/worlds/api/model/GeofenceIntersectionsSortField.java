package io.worlds.api.model;

/**
 * Indicates the field used for sorting a [`geofenceIntersections` query]({{Queries.geofenceintersections}}).
 */
public enum GeofenceIntersectionsSortField {

    /**
     * 
Sort the resulting list by the [`GeofenceIntersection`](({{Types.geofenceIntersection}}))'s unique identifier.
     */
    ID("ID"),
    /**
     * 
Sort the resulting list by the [`GeofenceIntersection`](({{Types.geofenceIntersection}}))'s start time.
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
