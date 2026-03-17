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
     * Bucket by the activity chronicle's chronicle producer
     */
    CHRONICLE_PRODUCER("CHRONICLE_PRODUCER"),
    /**
     * Bucket by the activity chronicle's site
     */
    SITE("SITE"),
    /**
     * Bucket by the activity chronicle's data source
     */
    DATA_SOURCE("DATA_SOURCE"),
    /**
     * Bucket by the activity chronicle's validation status
     */
    VALIDATION_STATUS("VALIDATION_STATUS"),
    /**
     * Bucket by the activity chronicle's approval status
     */
    APPROVAL_STATUS("APPROVAL_STATUS");

    private final String graphqlName;

    private ActivityChronicleSummaryBucketField(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
