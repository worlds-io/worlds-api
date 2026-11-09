package io.worlds.api.model;

import java.util.Objects;

/**
 * Summary information for summary chronicles across a time range inside a given `SummaryChronicleSummaryBucketType`.  Includes total count and the bucketed field values.
 */
public class SummaryChronicleSummaryBucket implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private SummaryChronicleSummaryBucketKey key;
    private int total;
    private int startedCount;
    private int endedCount;
    @jakarta.validation.constraints.NotNull
    private SummaryChronicleSummaryStatistics summaryStatistics;

    public SummaryChronicleSummaryBucket() {
    }

    public SummaryChronicleSummaryBucket(SummaryChronicleSummaryBucketKey key, int total, int startedCount, int endedCount, SummaryChronicleSummaryStatistics summaryStatistics) {
        this.key = key;
        this.total = total;
        this.startedCount = startedCount;
        this.endedCount = endedCount;
        this.summaryStatistics = summaryStatistics;
    }

    /**
     * The key of the bucket.
     */
    public SummaryChronicleSummaryBucketKey getKey() {
        return key;
    }
    /**
     * The key of the bucket.
     */
    public void setKey(SummaryChronicleSummaryBucketKey key) {
        this.key = key;
    }

    /**
     * The total number of summary chronicles within the bucket.
     */
    public int getTotal() {
        return total;
    }
    /**
     * The total number of summary chronicles within the bucket.
     */
    public void setTotal(int total) {
        this.total = total;
    }

    /**
     * The number of summary chronicles which started in the bucket.
     */
    public int getStartedCount() {
        return startedCount;
    }
    /**
     * The number of summary chronicles which started in the bucket.
     */
    public void setStartedCount(int startedCount) {
        this.startedCount = startedCount;
    }

    /**
     * The number of summary chronicles which ended in the bucket.
     */
    public int getEndedCount() {
        return endedCount;
    }
    /**
     * The number of summary chronicles which ended in the bucket.
     */
    public void setEndedCount(int endedCount) {
        this.endedCount = endedCount;
    }

    /**
     * Summary statistics for all summary chronicles within the bucket.
     */
    public SummaryChronicleSummaryStatistics getSummaryStatistics() {
        return summaryStatistics;
    }
    /**
     * Summary statistics for all summary chronicles within the bucket.
     */
    public void setSummaryStatistics(SummaryChronicleSummaryStatistics summaryStatistics) {
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
        final SummaryChronicleSummaryBucket that = (SummaryChronicleSummaryBucket) obj;
        return Objects.equals(key, that.key)
            && Objects.equals(total, that.total)
            && Objects.equals(startedCount, that.startedCount)
            && Objects.equals(endedCount, that.endedCount)
            && Objects.equals(summaryStatistics, that.summaryStatistics);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, total, startedCount, endedCount, summaryStatistics);
    }


    public static SummaryChronicleSummaryBucket.Builder builder() {
        return new SummaryChronicleSummaryBucket.Builder();
    }

    public static class Builder {

        private SummaryChronicleSummaryBucketKey key;
        private int total;
        private int startedCount;
        private int endedCount;
        private SummaryChronicleSummaryStatistics summaryStatistics;

        public Builder() {
        }

        /**
         * The key of the bucket.
         */
        public Builder setKey(SummaryChronicleSummaryBucketKey key) {
            this.key = key;
            return this;
        }

        /**
         * The total number of summary chronicles within the bucket.
         */
        public Builder setTotal(int total) {
            this.total = total;
            return this;
        }

        /**
         * The number of summary chronicles which started in the bucket.
         */
        public Builder setStartedCount(int startedCount) {
            this.startedCount = startedCount;
            return this;
        }

        /**
         * The number of summary chronicles which ended in the bucket.
         */
        public Builder setEndedCount(int endedCount) {
            this.endedCount = endedCount;
            return this;
        }

        /**
         * Summary statistics for all summary chronicles within the bucket.
         */
        public Builder setSummaryStatistics(SummaryChronicleSummaryStatistics summaryStatistics) {
            this.summaryStatistics = summaryStatistics;
            return this;
        }


        public SummaryChronicleSummaryBucket build() {
            return new SummaryChronicleSummaryBucket(key, total, startedCount, endedCount, summaryStatistics);
        }

    }
}
