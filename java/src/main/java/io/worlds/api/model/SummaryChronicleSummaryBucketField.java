package io.worlds.api.model;

/**
 * Indicates the bucket to group summary chronicles by in a `summaryChronicleSummary` query.
 */
public enum SummaryChronicleSummaryBucketField {

    /**
     * Bucket by the summary chronicle's name
     */
    NAME("NAME"),
    /**
     * Bucket by the summary chronicle's priority
     */
    PRIORITY("PRIORITY"),
    /**
     * Bucket by the summary chronicle's status
     */
    STATUS("STATUS"),
    /**
     * Bucket by the summary chronicle's chronicle producer
     */
    CHRONICLE_PRODUCER("CHRONICLE_PRODUCER"),
    /**
     * Bucket by the summary chronicle's sites. A summary chronicle can have multiple sites, so one summary chronicle may be counted in multiple buckets.
     */
    SITE("SITE"),
    /**
     * Bucket by the summary chronicle's labels. A summary chronicle can have multiple labels, so one summary chronicle may be counted in multiple buckets.
     */
    LABEL("LABEL"),
    /**
     * Bucket by the summary chronicle's validation status
     */
    VALIDATION_STATUS("VALIDATION_STATUS");

    private final String graphqlName;

    private SummaryChronicleSummaryBucketField(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
