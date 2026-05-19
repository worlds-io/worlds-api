package io.worlds.api.model;

/**
 * Indicates the bucket to group activity chronicles by in an activityChronicleSummary query.
 */
public enum ActivityChronicleSummaryBucketField {

    /**
     * Bucket by the activity chronicle's name
     */
    NAME("NAME"),
    /**
     * Bucket by the activity chronicle's description
     */
    DESCRIPTION("DESCRIPTION"),
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
     * Bucket by the activity chronicle's sites. An activity can have multiple sites, so one activity may be counted in multiple buckets.
     */
    SITE("SITE"),
    /**
     * Bucket by the activity chronicle's data sources. An activity can have multiple data sources, so one activity may be counted in multiple buckets.
     */
    DATA_SOURCE("DATA_SOURCE"),
    /**
     * Bucket by the activity chronicle's labels. An activity can have multiple labels, so one activity may be counted in multiple buckets.
     */
    LABEL("LABEL"),
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
