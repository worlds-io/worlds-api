package io.worlds.api.model;

/**
 * Indicates the time bucket size for a summary query.
 */
public enum SummaryBucketSize {

    /**
     * Bucket by minutes.  Only one time bucket type should be provided.
     */
    MINUTES("MINUTES"),
    /**
     * Bucket by hours.  Only one time bucket type should be provided.
     */
    HOURS("HOURS");

    private final String graphqlName;

    private SummaryBucketSize(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
