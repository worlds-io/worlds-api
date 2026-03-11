package io.worlds.api.model;

/**
 * Indicates the bucket to group activity chronicles by in an activityChronicleSummary query.
 */
public enum ActivityChronicleSummaryBucketField {

    /**
     * Bucket by the activity chronicle's priority
     */
    PRIORITY("PRIORITY"),
    /**
     * Bucket by the activity chronicle's status
     */
    STATUS("STATUS"),
    /**
     * Bucket by the activity chronicle's chronicle producer Id
     */
    CHRONICLE_PRODUCER_ID("CHRONICLE_PRODUCER_ID");

    private final String graphqlName;

    private ActivityChronicleSummaryBucketField(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
