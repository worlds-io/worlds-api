package io.worlds.api.model;

/**
 * Indicates the field used for sorting a [Detections query]({{Queries.detections}}).
 */
public enum DetectionsSortField {

    /**
     * 
Sort the resulting list by [detection time]({{Types.detection}}).
     */
    DETECTION_TIME("DETECTION_TIME"),
    /**
     * 
Sort the resulting list by the corresponding Track's [unique identifier.]({{Types.detection}}).
     */
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
