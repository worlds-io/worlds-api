package io.worlds.api.model;

/**
 * Types of Intersection activities for Geofences and Zones
 */
public enum ActivityType {

    INGRESS("INGRESS"),
    DWELL("DWELL"),
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
