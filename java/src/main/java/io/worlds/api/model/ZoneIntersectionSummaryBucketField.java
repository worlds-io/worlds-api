package io.worlds.api.model;

/**
 * Indicates the bucket to group zone intersections by in a zoneIntersectionSummary query.
 */
public enum ZoneIntersectionSummaryBucketField {

    /**
     * Bucket by the zone's name
     */
    ZONE_NAME("ZONE_NAME"),
    /**
     * Bucket by the zone intersection's class Id
     */
    CLASS_ID("CLASS_ID"),
    /**
     * Bucket by the zone intersection's data source Id
     */
    DATA_SOURCE_ID("DATA_SOURCE_ID");

    private final String graphqlName;

    private ZoneIntersectionSummaryBucketField(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
