package io.worlds.api.model;

/**
 * Indicates the field used for sorting a [`geofenceEvents` query]({{Queries.geofenceEvents}}).
 */
public enum GeofenceEventsSortField {

    /**
     * 
Sort the resulting list by the [`GeofenceEvent`](({{Types.GeofenceEvent}}))'s unique identifier.
     */
    ID("ID"),
    /**
     * 
Sort the resulting list by the [`GeofenceEvent`](({{Types.GeofenceEvent}}))'s timestamp.
     */
    OCCURRED("OCCURRED");

    private final String graphqlName;

    private GeofenceEventsSortField(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
