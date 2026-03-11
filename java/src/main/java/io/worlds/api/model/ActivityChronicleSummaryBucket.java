package io.worlds.api.model;

import java.util.Objects;

/**
 * Summary information for activity chronicles across a time range inside a given `ActivityChronicleSummaryBucketType`.  Includes total count and the bucketed field values.
 */
public class ActivityChronicleSummaryBucket implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private ActivityChronicleSummaryBucketKey key;
    private int total;
    @jakarta.validation.constraints.NotNull
    private ActivityChronicleSummaryStatistics summaryStatistics;

    public ActivityChronicleSummaryBucket() {
    }

    public ActivityChronicleSummaryBucket(ActivityChronicleSummaryBucketKey key, int total, ActivityChronicleSummaryStatistics summaryStatistics) {
        this.key = key;
        this.total = total;
        this.summaryStatistics = summaryStatistics;
    }

    /**
     * The key of the bucket.
     */
    public ActivityChronicleSummaryBucketKey getKey() {
        return key;
    }
    /**
     * The key of the bucket.
     */
    public void setKey(ActivityChronicleSummaryBucketKey key) {
        this.key = key;
    }

    /**
     * The total number of activity chronicles within the bucket.
     */
    public int getTotal() {
        return total;
    }
    /**
     * The total number of activity chronicles within the bucket.
     */
    public void setTotal(int total) {
        this.total = total;
    }

    /**
     * Summary statistics for all activity chronicles within the bucket.
     */
    public ActivityChronicleSummaryStatistics getSummaryStatistics() {
        return summaryStatistics;
    }
    /**
     * Summary statistics for all activity chronicles within the bucket.
     */
    public void setSummaryStatistics(ActivityChronicleSummaryStatistics summaryStatistics) {
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
        final ActivityChronicleSummaryBucket that = (ActivityChronicleSummaryBucket) obj;
        return Objects.equals(key, that.key)
            && Objects.equals(total, that.total)
            && Objects.equals(summaryStatistics, that.summaryStatistics);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, total, summaryStatistics);
    }


    public static ActivityChronicleSummaryBucket.Builder builder() {
        return new ActivityChronicleSummaryBucket.Builder();
    }

    public static class Builder {

        private ActivityChronicleSummaryBucketKey key;
        private int total;
        private ActivityChronicleSummaryStatistics summaryStatistics;

        public Builder() {
        }

        /**
         * The key of the bucket.
         */
        public Builder setKey(ActivityChronicleSummaryBucketKey key) {
            this.key = key;
            return this;
        }

        /**
         * The total number of activity chronicles within the bucket.
         */
        public Builder setTotal(int total) {
            this.total = total;
            return this;
        }

        /**
         * Summary statistics for all activity chronicles within the bucket.
         */
        public Builder setSummaryStatistics(ActivityChronicleSummaryStatistics summaryStatistics) {
            this.summaryStatistics = summaryStatistics;
            return this;
        }


        public ActivityChronicleSummaryBucket build() {
            return new ActivityChronicleSummaryBucket(key, total, summaryStatistics);
        }

    }
}
