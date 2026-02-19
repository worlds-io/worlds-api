package io.worlds.api.model;

import java.util.Objects;

/**
 * The grouping key for an VideosSummaryBucket.  Fields bucketed on will be present.  All other fields will be null.
 */
public class VideosSummaryBucketKey implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String dataSourceId;

    public VideosSummaryBucketKey() {
    }

    public VideosSummaryBucketKey(String dataSourceId) {
        this.dataSourceId = dataSourceId;
    }

    /**
     * The `id` of the DataSource of the videos in the summary bucket.
     */
    public String getDataSourceId() {
        return dataSourceId;
    }
    /**
     * The `id` of the DataSource of the videos in the summary bucket.
     */
    public void setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final VideosSummaryBucketKey that = (VideosSummaryBucketKey) obj;
        return Objects.equals(dataSourceId, that.dataSourceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dataSourceId);
    }


    public static VideosSummaryBucketKey.Builder builder() {
        return new VideosSummaryBucketKey.Builder();
    }

    public static class Builder {

        private String dataSourceId;

        public Builder() {
        }

        /**
         * The `id` of the DataSource of the videos in the summary bucket.
         */
        public Builder setDataSourceId(String dataSourceId) {
            this.dataSourceId = dataSourceId;
            return this;
        }


        public VideosSummaryBucketKey build() {
            return new VideosSummaryBucketKey(dataSourceId);
        }

    }
}
