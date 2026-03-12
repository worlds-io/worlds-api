package io.worlds.api.model;

/**
 * Indicates the type of [GeofenceEvent]({{Types.GeofenceEvent}}) or [ZoneEvent]({{Types.ZoneEvent}}) reported by a [Geofence]({{Types.Geofence}}) or a [Zone]({{Types.Zone}}).
 */
public enum ActivityType {

    /**
     * 
A detection entering a [Geofence]({{Types.Geofence}}) or a [Zone]({{Types.Zone}}).
     */
    INGRESS("INGRESS"),
    /**
     * 
A detection remaining inside a [Geofence]({{Types.Geofence}}) or a [Zone]({{Types.Zone}}).
     */
    DWELL("DWELL"),
    /**
     * 
A detection exiting a [Geofence]({{Types.Geofence}}) or a [Zone]({{Types.Zone}}).
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
