package io.worlds.api.model;

/**
 * Indicates the field used for sorting a [Tracks query]({{Queries.tracks}}).
 */
public enum TracksSortField {

    /**
     * Sort the resulting list in by its unique identifier.
     */
    ID("ID"),
    /**
     * Sort the resulting list by the track start time.
     */
    TRACK_START_TIME("TRACK_START_TIME");

    private final String graphqlName;

    private TracksSortField(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
