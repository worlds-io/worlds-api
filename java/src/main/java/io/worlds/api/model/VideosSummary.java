package io.worlds.api.model;

import java.util.Objects;

/**
 * Summary information for videos across a time range.  Includes total count and counts by buckets.
 */
public class VideosSummary implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private int total;
    @jakarta.validation.constraints.NotNull
    private VideosSummaryStatistics summaryStatistics;
    private java.util.List<VideosSummaryBucket> buckets;

    public VideosSummary() {
    }

    public VideosSummary(int total, VideosSummaryStatistics summaryStatistics, java.util.List<VideosSummaryBucket> buckets) {
        this.total = total;
        this.summaryStatistics = summaryStatistics;
        this.buckets = buckets;
    }

    /**
     * The total number of [Videos]({{Types.Video}}) within the time range.
     */
    public int getTotal() {
        return total;
    }
    /**
     * The total number of [Videos]({{Types.Video}}) within the time range.
     */
    public void setTotal(int total) {
        this.total = total;
    }

    /**
     * Summary statistics for all videos within the summary's time range and filters.
     */
    public VideosSummaryStatistics getSummaryStatistics() {
        return summaryStatistics;
    }
    /**
     * Summary statistics for all videos within the summary's time range and filters.
     */
    public void setSummaryStatistics(VideosSummaryStatistics summaryStatistics) {
        this.summaryStatistics = summaryStatistics;
    }

    /**
     * A detailed summary of each [bucket]({{Types.SummaryBucketSize}}) within the time range.
Summary buckets are only returned if `bucket` is provided as a query parameter to [`videosSummary`]({{Queries.videosSummary}}).
     */
    public java.util.List<VideosSummaryBucket> getBuckets() {
        return buckets;
    }
    /**
     * A detailed summary of each [bucket]({{Types.SummaryBucketSize}}) within the time range.
Summary buckets are only returned if `bucket` is provided as a query parameter to [`videosSummary`]({{Queries.videosSummary}}).
     */
    public void setBuckets(java.util.List<VideosSummaryBucket> buckets) {
        this.buckets = buckets;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final VideosSummary that = (VideosSummary) obj;
        return Objects.equals(total, that.total)
            && Objects.equals(summaryStatistics, that.summaryStatistics)
            && Objects.equals(buckets, that.buckets);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, summaryStatistics, buckets);
    }


    public static VideosSummary.Builder builder() {
        return new VideosSummary.Builder();
    }

    public static class Builder {

        private int total;
        private VideosSummaryStatistics summaryStatistics;
        private java.util.List<VideosSummaryBucket> buckets;

        public Builder() {
        }

        /**
         * The total number of [Videos]({{Types.Video}}) within the time range.
         */
        public Builder setTotal(int total) {
            this.total = total;
            return this;
        }

        /**
         * Summary statistics for all videos within the summary's time range and filters.
         */
        public Builder setSummaryStatistics(VideosSummaryStatistics summaryStatistics) {
            this.summaryStatistics = summaryStatistics;
            return this;
        }

        /**
         * A detailed summary of each [bucket]({{Types.SummaryBucketSize}}) within the time range.
Summary buckets are only returned if `bucket` is provided as a query parameter to [`videosSummary`]({{Queries.videosSummary}}).
         */
        public Builder setBuckets(java.util.List<VideosSummaryBucket> buckets) {
            this.buckets = buckets;
            return this;
        }


        public VideosSummary build() {
            return new VideosSummary(total, summaryStatistics, buckets);
        }

    }
}
