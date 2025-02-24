package io.worlds.api.model;

public enum DetectionsSortField {

    DETECTION_TIME("DETECTION_TIME"),
    GLOBAL_TRACK_ID("GLOBAL_TRACK_ID");

    private final String graphqlName;

    private DetectionsSortField(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
