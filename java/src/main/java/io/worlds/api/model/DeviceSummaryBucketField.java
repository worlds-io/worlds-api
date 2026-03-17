package io.worlds.api.model;

/**
 * Indicates the bucket to group devices by in a deviceSummary query.
 */
public enum DeviceSummaryBucketField {

    /**
     * Bucket by the device's site
     */
    SITE("SITE"),
    /**
     * Bucket by the device's point of interest
     */
    POINT_OF_INTEREST("POINT_OF_INTEREST");

    private final String graphqlName;

    private DeviceSummaryBucketField(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
