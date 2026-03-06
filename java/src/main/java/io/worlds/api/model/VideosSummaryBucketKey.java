package io.worlds.api.model;

import java.util.Objects;

/**
 * The grouping key for an VideosSummaryBucket.  Fields bucketed on will be present.  All other fields will be null.
 */
public class VideosSummaryBucketKey implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @Deprecated
    private String dataSourceId;
    private DataSource dataSource;

    public VideosSummaryBucketKey() {
    }

    public VideosSummaryBucketKey(String dataSourceId, DataSource dataSource) {
        this.dataSourceId = dataSourceId;
        this.dataSource = dataSource;
    }

    /**
     * The `id` of the DataSource of the videos in the summary bucket.
     */
    @Deprecated
    public String getDataSourceId() {
        return dataSourceId;
    }
    /**
     * The `id` of the DataSource of the videos in the summary bucket.
     */
    @Deprecated
    public void setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
    }

    /**
     * The DataSource of the videos in the summary bucket.
     */
    public DataSource getDataSource() {
        return dataSource;
    }
    /**
     * The DataSource of the videos in the summary bucket.
     */
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
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
        return Objects.equals(dataSourceId, that.dataSourceId)
            && Objects.equals(dataSource, that.dataSource);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dataSourceId, dataSource);
    }


    public static VideosSummaryBucketKey.Builder builder() {
        return new VideosSummaryBucketKey.Builder();
    }

    public static class Builder {

        private String dataSourceId;
        private DataSource dataSource;

        public Builder() {
        }

        /**
         * The `id` of the DataSource of the videos in the summary bucket.
         */
        @Deprecated
        public Builder setDataSourceId(String dataSourceId) {
            this.dataSourceId = dataSourceId;
            return this;
        }

        /**
         * The DataSource of the videos in the summary bucket.
         */
        public Builder setDataSource(DataSource dataSource) {
            this.dataSource = dataSource;
            return this;
        }


        public VideosSummaryBucketKey build() {
            return new VideosSummaryBucketKey(dataSourceId, dataSource);
        }

    }
}
