package io.worlds.api.model;

/**
 * Indicates the bucket to group videos by in an videosSummary query.
 */
public enum VideosSummaryBucketField {

    /**
     * Bucket by the video's data source Id
     */
    DATA_SOURCE_ID("DATA_SOURCE_ID");

    private final String graphqlName;

    private VideosSummaryBucketField(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
