package io.worlds.api.model;

import java.util.Objects;

/**
 * Summary information for activity chronicles across a time range.  Includes total count and counts by buckets.
 */
public class ActivityChronicleSummary implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private int total;
    @jakarta.validation.constraints.NotNull
    private ActivityChronicleSummaryStatistics summaryStatistics;
    private java.util.List<ActivityChronicleSummaryBucket> buckets;

    public ActivityChronicleSummary() {
    }

    public ActivityChronicleSummary(int total, ActivityChronicleSummaryStatistics summaryStatistics, java.util.List<ActivityChronicleSummaryBucket> buckets) {
        this.total = total;
        this.summaryStatistics = summaryStatistics;
        this.buckets = buckets;
    }

    /**
     * The total number of activity chronicles within the time range.
     */
    public int getTotal() {
        return total;
    }
    /**
     * The total number of activity chronicles within the time range.
     */
    public void setTotal(int total) {
        this.total = total;
    }

    /**
     * Summary statistics for all activity chronicles within the summary's time range and filters.
     */
    public ActivityChronicleSummaryStatistics getSummaryStatistics() {
        return summaryStatistics;
    }
    /**
     * Summary statistics for all activity chronicles within the summary's time range and filters.
     */
    public void setSummaryStatistics(ActivityChronicleSummaryStatistics summaryStatistics) {
        this.summaryStatistics = summaryStatistics;
    }

    /**
     * A detailed summary of each bucket within the time range.
Summary buckets are only returned if `activityChronicleBucket` is provided as a query parameter to `activityChronicleSummary`.
     */
    public java.util.List<ActivityChronicleSummaryBucket> getBuckets() {
        return buckets;
    }
    /**
     * A detailed summary of each bucket within the time range.
Summary buckets are only returned if `activityChronicleBucket` is provided as a query parameter to `activityChronicleSummary`.
     */
    public void setBuckets(java.util.List<ActivityChronicleSummaryBucket> buckets) {
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
        final ActivityChronicleSummary that = (ActivityChronicleSummary) obj;
        return Objects.equals(total, that.total)
            && Objects.equals(summaryStatistics, that.summaryStatistics)
            && Objects.equals(buckets, that.buckets);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, summaryStatistics, buckets);
    }


    public static ActivityChronicleSummary.Builder builder() {
        return new ActivityChronicleSummary.Builder();
    }

    public static class Builder {

        private int total;
        private ActivityChronicleSummaryStatistics summaryStatistics;
        private java.util.List<ActivityChronicleSummaryBucket> buckets;

        public Builder() {
        }

        /**
         * The total number of activity chronicles within the time range.
         */
        public Builder setTotal(int total) {
            this.total = total;
            return this;
        }

        /**
         * Summary statistics for all activity chronicles within the summary's time range and filters.
         */
        public Builder setSummaryStatistics(ActivityChronicleSummaryStatistics summaryStatistics) {
            this.summaryStatistics = summaryStatistics;
            return this;
        }

        /**
         * A detailed summary of each bucket within the time range.
Summary buckets are only returned if `activityChronicleBucket` is provided as a query parameter to `activityChronicleSummary`.
         */
        public Builder setBuckets(java.util.List<ActivityChronicleSummaryBucket> buckets) {
            this.buckets = buckets;
            return this;
        }


        public ActivityChronicleSummary build() {
            return new ActivityChronicleSummary(total, summaryStatistics, buckets);
        }

    }
}
