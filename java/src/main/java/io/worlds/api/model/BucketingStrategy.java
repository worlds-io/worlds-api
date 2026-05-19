package io.worlds.api.model;

/**
 * Indicates how to bucket objects.  In buckets, `total` count will differ by the bucketing strategy.
 */
public enum BucketingStrategy {

    /**
     * Bucket into all buckets where the object was active.  With this strategy, an object may be present in multiple time buckets.
     */
    ACTIVE("ACTIVE"),
    /**
     * Bucket into the bucket where the object ended. `total` will be equal to `startedCount`. `endedCount` will return as 0.
     */
    STARTED("STARTED"),
    /**
     * Bucket into the bucket where the object ended. `total` will be equal to `endedCount`. `startedCount` will return as 0.
     */
    ENDED("ENDED");

    private final String graphqlName;

    private BucketingStrategy(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
