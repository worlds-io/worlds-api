package io.worlds.api.model;

/**
 * Indicates the time bucket size for a summary query.
 */
public enum SummaryBucketSize {

    /**
     * Bucket by minutes.  Not valid on summaries longer than 1 day.
     */
    MINUTES("MINUTES"),
    /**
     * Bucket by hours.  Not valid on summaries longer than 7 days.
     */
    HOURS("HOURS"),
    /**
     * Bucket by days.
     */
    DAYS("DAYS");

    private final String graphqlName;

    private SummaryBucketSize(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
