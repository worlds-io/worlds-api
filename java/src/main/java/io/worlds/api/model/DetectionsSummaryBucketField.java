package io.worlds.api.model;

/**
 * Indicates the bucket to group detections by in a detectionsSummary query.
 */
public enum DetectionsSummaryBucketField {

    /**
     * Bucket by the detection's tag
     */
    TAG("TAG"),
    /**
     * Bucket by the detection's data source id
     */
    DATA_SOURCE_ID("DATA_SOURCE_ID"),
    /**
     * Bucket by the site of the detection
     */
    SITE("SITE");

    private final String graphqlName;

    private DetectionsSummaryBucketField(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
