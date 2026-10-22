package io.worlds.api.model;

import java.util.Objects;

/**
 * Summary information for summary chronicles across a time range.  Includes total count and counts by buckets.
 */
public class SummaryChronicleSummary implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private int total;
    private int startedCount;
    private int endedCount;
    @jakarta.validation.constraints.NotNull
    private SummaryChronicleSummaryStatistics summaryStatistics;
    private java.util.List<SummaryChronicleSummaryBucket> buckets;
    @jakarta.validation.constraints.NotNull
    private java.util.List<SummaryChronicleHighestTotalBucket> highestTotalBuckets;
    private java.util.List<String> metadataKeys;

    public SummaryChronicleSummary() {
    }

    public SummaryChronicleSummary(int total, int startedCount, int endedCount, SummaryChronicleSummaryStatistics summaryStatistics, java.util.List<SummaryChronicleSummaryBucket> buckets, java.util.List<SummaryChronicleHighestTotalBucket> highestTotalBuckets, java.util.List<String> metadataKeys) {
        this.total = total;
        this.startedCount = startedCount;
        this.endedCount = endedCount;
        this.summaryStatistics = summaryStatistics;
        this.buckets = buckets;
        this.highestTotalBuckets = highestTotalBuckets;
        this.metadataKeys = metadataKeys;
    }

    /**
     * The total number of summary chronicles within the time range.
     */
    public int getTotal() {
        return total;
    }
    /**
     * The total number of summary chronicles within the time range.
     */
    public void setTotal(int total) {
        this.total = total;
    }

    /**
     * The number of summary chronicles which started in the time range.
     */
    public int getStartedCount() {
        return startedCount;
    }
    /**
     * The number of summary chronicles which started in the time range.
     */
    public void setStartedCount(int startedCount) {
        this.startedCount = startedCount;
    }

    /**
     * The number of summary chronicles which ended in the time range.
     */
    public int getEndedCount() {
        return endedCount;
    }
    /**
     * The number of summary chronicles which ended in the time range.
     */
    public void setEndedCount(int endedCount) {
        this.endedCount = endedCount;
    }

    /**
     * Summary statistics for all summary chronicles within the summary's time range and filters.
     */
    public SummaryChronicleSummaryStatistics getSummaryStatistics() {
        return summaryStatistics;
    }
    /**
     * Summary statistics for all summary chronicles within the summary's time range and filters.
     */
    public void setSummaryStatistics(SummaryChronicleSummaryStatistics summaryStatistics) {
        this.summaryStatistics = summaryStatistics;
    }

    /**
     * A detailed summary of each bucket within the time range.
Summary buckets are only returned if `summaryChronicleBucket` is provided as a query parameter to `summaryChronicleSummary`.
     */
    public java.util.List<SummaryChronicleSummaryBucket> getBuckets() {
        return buckets;
    }
    /**
     * A detailed summary of each bucket within the time range.
Summary buckets are only returned if `summaryChronicleBucket` is provided as a query parameter to `summaryChronicleSummary`.
     */
    public void setBuckets(java.util.List<SummaryChronicleSummaryBucket> buckets) {
        this.buckets = buckets;
    }

    /**
     * The bucket(s) with the greatest `total` across the parent's buckets.  Empty if no `summaryChronicleBucket`
was provided.  All tied buckets are returned per group.
     */
    public java.util.List<SummaryChronicleHighestTotalBucket> getHighestTotalBuckets() {
        return highestTotalBuckets;
    }
    /**
     * The bucket(s) with the greatest `total` across the parent's buckets.  Empty if no `summaryChronicleBucket`
was provided.  All tied buckets are returned per group.
     */
    public void setHighestTotalBuckets(java.util.List<SummaryChronicleHighestTotalBucket> highestTotalBuckets) {
        this.highestTotalBuckets = highestTotalBuckets;
    }

    /**
     * The distinct top-level keys found in the `metadata` field across all matching summary chronicles.
Useful for discovering available metadata keys that can be used for metadata bucketing.
     */
    public java.util.List<String> getMetadataKeys() {
        return metadataKeys;
    }
    /**
     * The distinct top-level keys found in the `metadata` field across all matching summary chronicles.
Useful for discovering available metadata keys that can be used for metadata bucketing.
     */
    public void setMetadataKeys(java.util.List<String> metadataKeys) {
        this.metadataKeys = metadataKeys;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final SummaryChronicleSummary that = (SummaryChronicleSummary) obj;
        return Objects.equals(total, that.total)
            && Objects.equals(startedCount, that.startedCount)
            && Objects.equals(endedCount, that.endedCount)
            && Objects.equals(summaryStatistics, that.summaryStatistics)
            && Objects.equals(buckets, that.buckets)
            && Objects.equals(highestTotalBuckets, that.highestTotalBuckets)
            && Objects.equals(metadataKeys, that.metadataKeys);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, startedCount, endedCount, summaryStatistics, buckets, highestTotalBuckets, metadataKeys);
    }


    public static SummaryChronicleSummary.Builder builder() {
        return new SummaryChronicleSummary.Builder();
    }

    public static class Builder {

        private int total;
        private int startedCount;
        private int endedCount;
        private SummaryChronicleSummaryStatistics summaryStatistics;
        private java.util.List<SummaryChronicleSummaryBucket> buckets;
        private java.util.List<SummaryChronicleHighestTotalBucket> highestTotalBuckets;
        private java.util.List<String> metadataKeys;

        public Builder() {
        }

        /**
         * The total number of summary chronicles within the time range.
         */
        public Builder setTotal(int total) {
            this.total = total;
            return this;
        }

        /**
         * The number of summary chronicles which started in the time range.
         */
        public Builder setStartedCount(int startedCount) {
            this.startedCount = startedCount;
            return this;
        }

        /**
         * The number of summary chronicles which ended in the time range.
         */
        public Builder setEndedCount(int endedCount) {
            this.endedCount = endedCount;
            return this;
        }

        /**
         * Summary statistics for all summary chronicles within the summary's time range and filters.
         */
        public Builder setSummaryStatistics(SummaryChronicleSummaryStatistics summaryStatistics) {
            this.summaryStatistics = summaryStatistics;
            return this;
        }

        /**
         * A detailed summary of each bucket within the time range.
Summary buckets are only returned if `summaryChronicleBucket` is provided as a query parameter to `summaryChronicleSummary`.
         */
        public Builder setBuckets(java.util.List<SummaryChronicleSummaryBucket> buckets) {
            this.buckets = buckets;
            return this;
        }

        /**
         * The bucket(s) with the greatest `total` across the parent's buckets.  Empty if no `summaryChronicleBucket`
was provided.  All tied buckets are returned per group.
         */
        public Builder setHighestTotalBuckets(java.util.List<SummaryChronicleHighestTotalBucket> highestTotalBuckets) {
            this.highestTotalBuckets = highestTotalBuckets;
            return this;
        }

        /**
         * The distinct top-level keys found in the `metadata` field across all matching summary chronicles.
Useful for discovering available metadata keys that can be used for metadata bucketing.
         */
        public Builder setMetadataKeys(java.util.List<String> metadataKeys) {
            this.metadataKeys = metadataKeys;
            return this;
        }


        public SummaryChronicleSummary build() {
            return new SummaryChronicleSummary(total, startedCount, endedCount, summaryStatistics, buckets, highestTotalBuckets, metadataKeys);
        }

    }
}
