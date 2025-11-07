package io.worlds.api.model;

/**
 * Indicates the field used for sorting a [`geofences` query]({{Queries.geofences}}).
 */
public enum GeofencesSortField {

    /**
     * 
Sort the resulting list by the [`Geofence`](({{Types.Geofence}}))'s unique identifier.
     */
    ID("ID"),
    /**
     * 
Sort the resulting list by the [`Geofence`](({{Types.Geofence}}))'s name.
     */
    NAME("NAME");

    private final String graphqlName;

    private GeofencesSortField(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
