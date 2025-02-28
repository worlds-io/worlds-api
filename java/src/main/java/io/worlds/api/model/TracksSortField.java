package io.worlds.api.model;

public enum TracksSortField {

    ID("ID"),
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
