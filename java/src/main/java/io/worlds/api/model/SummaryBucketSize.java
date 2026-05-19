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
     * Bucket by groups of 10 minutes.  Not valid on summaries longer than 1 day.
     */
    MINUTES_10("MINUTES_10"),
    /**
     * Bucket by groups of 12 minutes.  Not valid on summaries longer than 1 day.
     */
    MINUTES_12("MINUTES_12"),
    /**
     * Bucket by groups of 15 minutes.  Not valid on summaries longer than 1 day.
     */
    MINUTES_15("MINUTES_15"),
    /**
     * Bucket by groups of 20 minutes.  Not valid on summaries longer than 1 day.
     */
    MINUTES_20("MINUTES_20"),
    /**
     * Bucket by groups of 30 minutes.  Not valid on summaries longer than 1 day.
     */
    MINUTES_30("MINUTES_30"),
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
