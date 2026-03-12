package io.worlds.api.model;

/**
 * Indicates the bucket to group devices by in a deviceSummary query.
 */
public enum DeviceSummaryBucketField {

    /**
     * Bucket by the device's site Id
     */
    SITE_ID("SITE_ID"),
    /**
     * Bucket by the device's point of interest Id
     */
    POINT_OF_INTEREST_ID("POINT_OF_INTEREST_ID");

    private final String graphqlName;

    private DeviceSummaryBucketField(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
