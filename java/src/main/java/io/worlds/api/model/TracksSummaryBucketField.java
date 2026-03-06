package io.worlds.api.model;

/**
 * Indicates the bucket to group tracks by in an tracksSummary query.
 */
public enum TracksSummaryBucketField {

    /**
     * Bucket by the track's type
     */
    TAG("TAG"),
    /**
     * Bucket by the track's dataSource id
     */
    DATA_SOURCE_ID("DATA_SOURCE_ID"),
    /**
     * Bucket by the site of the track's dataSource
     */
    DATA_SOURCE_SITE("DATA_SOURCE_SITE"),
    /**
     * Bucket by the point of interest of the track's dataSource
     */
    DATA_SOURCE_POINT_OF_INTEREST("DATA_SOURCE_POINT_OF_INTEREST");

    private final String graphqlName;

    private TracksSummaryBucketField(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
