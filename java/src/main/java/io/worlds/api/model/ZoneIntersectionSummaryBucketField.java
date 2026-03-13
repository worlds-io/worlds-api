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
     * Bucket by the zone intersection's tag
     */
    TAG("TAG"),
    /**
     * Bucket by the zone intersection's data source
     */
    DATA_SOURCE("DATA_SOURCE");

    private final String graphqlName;

    private ZoneIntersectionSummaryBucketField(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
