package io.worlds.api.model;

import java.util.Objects;

/**
 * Summary information for videos across a time range inside a given `VideosSummaryBucketType`.  Includes total count and the bucketed field values.
 */
public class VideosSummaryBucket implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private VideosSummaryBucketKey key;
    private int total;
    @jakarta.validation.constraints.NotNull
    private VideosSummaryStatistics summaryStatistics;

    public VideosSummaryBucket() {
    }

    public VideosSummaryBucket(VideosSummaryBucketKey key, int total, VideosSummaryStatistics summaryStatistics) {
        this.key = key;
        this.total = total;
        this.summaryStatistics = summaryStatistics;
    }

    /**
     * The key of the bucket.
     */
    public VideosSummaryBucketKey getKey() {
        return key;
    }
    /**
     * The key of the bucket.
     */
    public void setKey(VideosSummaryBucketKey key) {
        this.key = key;
    }

    /**
     * The total number of [Videos]({{Types.Video}}) within the bucket.
     */
    public int getTotal() {
        return total;
    }
    /**
     * The total number of [Videos]({{Types.Video}}) within the bucket.
     */
    public void setTotal(int total) {
        this.total = total;
    }

    /**
     * Summary statistics for all videos within the bucket.
     */
    public VideosSummaryStatistics getSummaryStatistics() {
        return summaryStatistics;
    }
    /**
     * Summary statistics for all videos within the bucket.
     */
    public void setSummaryStatistics(VideosSummaryStatistics summaryStatistics) {
        this.summaryStatistics = summaryStatistics;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final VideosSummaryBucket that = (VideosSummaryBucket) obj;
        return Objects.equals(key, that.key)
            && Objects.equals(total, that.total)
            && Objects.equals(summaryStatistics, that.summaryStatistics);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, total, summaryStatistics);
    }


    public static VideosSummaryBucket.Builder builder() {
        return new VideosSummaryBucket.Builder();
    }

    public static class Builder {

        private VideosSummaryBucketKey key;
        private int total;
        private VideosSummaryStatistics summaryStatistics;

        public Builder() {
        }

        /**
         * The key of the bucket.
         */
        public Builder setKey(VideosSummaryBucketKey key) {
            this.key = key;
            return this;
        }

        /**
         * The total number of [Videos]({{Types.Video}}) within the bucket.
         */
        public Builder setTotal(int total) {
            this.total = total;
            return this;
        }

        /**
         * Summary statistics for all videos within the bucket.
         */
        public Builder setSummaryStatistics(VideosSummaryStatistics summaryStatistics) {
            this.summaryStatistics = summaryStatistics;
            return this;
        }


        public VideosSummaryBucket build() {
            return new VideosSummaryBucket(key, total, summaryStatistics);
        }

    }
}
