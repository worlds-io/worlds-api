package io.worlds.api.model;

/**
 * Indicates the type of [GeofenceEvent]({{Types.geofenceevent}}) or [ZoneEvent]({{Types.zoneevent}}) reported by a [Geofence]({{Types.geofence}}) or a [Zone]({{Types.zone}}).
 */
public enum ActivityType {

    /**
     * 
A detection entering a [Geofence]({{Types.geofence}}) or a [Zone]({{Types.zone}}).
     */
    INGRESS("INGRESS"),
    /**
     * 
A detection remaining inside a [Geofence]({{Types.geofence}}) or a [Zone]({{Types.zone}}).
     */
    DWELL("DWELL"),
    /**
     * 
A detection exiting a [Geofence]({{Types.geofence}}) or a [Zone]({{Types.zone}}).
     */
    EGRESS("EGRESS");

    private final String graphqlName;

    private ActivityType(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
