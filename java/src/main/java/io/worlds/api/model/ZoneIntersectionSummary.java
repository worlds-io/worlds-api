package io.worlds.api.model;

import java.util.Objects;

/**
 * Summary information for zone intersections across a time range.  Includes total count and counts by buckets.
 */
public class ZoneIntersectionSummary implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private int total;
    private int startedCount;
    private int endedCount;
    @jakarta.validation.constraints.NotNull
    private ZoneIntersectionSummaryStatistics summaryStatistics;
    private java.util.List<ZoneIntersectionSummaryBucket> buckets;

    public ZoneIntersectionSummary() {
    }

    public ZoneIntersectionSummary(int total, int startedCount, int endedCount, ZoneIntersectionSummaryStatistics summaryStatistics, java.util.List<ZoneIntersectionSummaryBucket> buckets) {
        this.total = total;
        this.startedCount = startedCount;
        this.endedCount = endedCount;
        this.summaryStatistics = summaryStatistics;
        this.buckets = buckets;
    }

    /**
     * The total number of zone intersections within the time range.
     */
    public int getTotal() {
        return total;
    }
    /**
     * The total number of zone intersections within the time range.
     */
    public void setTotal(int total) {
        this.total = total;
    }

    /**
     * The number of zone intersections which started within the time range.
     */
    public int getStartedCount() {
        return startedCount;
    }
    /**
     * The number of zone intersections which started within the time range.
     */
    public void setStartedCount(int startedCount) {
        this.startedCount = startedCount;
    }

    /**
     * The number of zone intersections which ended within the time range.
     */
    public int getEndedCount() {
        return endedCount;
    }
    /**
     * The number of zone intersections which ended within the time range.
     */
    public void setEndedCount(int endedCount) {
        this.endedCount = endedCount;
    }

    /**
     * Summary statistics for all zone intersections within the summary's time range and filters.
     */
    public ZoneIntersectionSummaryStatistics getSummaryStatistics() {
        return summaryStatistics;
    }
    /**
     * Summary statistics for all zone intersections within the summary's time range and filters.
     */
    public void setSummaryStatistics(ZoneIntersectionSummaryStatistics summaryStatistics) {
        this.summaryStatistics = summaryStatistics;
    }

    /**
     * A detailed summary of each bucket within the time range.
Summary buckets are only returned if `zoneIntersectionBucket` is provided as a query parameter to `zoneIntersectionSummary`.
     */
    public java.util.List<ZoneIntersectionSummaryBucket> getBuckets() {
        return buckets;
    }
    /**
     * A detailed summary of each bucket within the time range.
Summary buckets are only returned if `zoneIntersectionBucket` is provided as a query parameter to `zoneIntersectionSummary`.
     */
    public void setBuckets(java.util.List<ZoneIntersectionSummaryBucket> buckets) {
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
        final ZoneIntersectionSummary that = (ZoneIntersectionSummary) obj;
        return Objects.equals(total, that.total)
            && Objects.equals(startedCount, that.startedCount)
            && Objects.equals(endedCount, that.endedCount)
            && Objects.equals(summaryStatistics, that.summaryStatistics)
            && Objects.equals(buckets, that.buckets);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, startedCount, endedCount, summaryStatistics, buckets);
    }


    public static ZoneIntersectionSummary.Builder builder() {
        return new ZoneIntersectionSummary.Builder();
    }

    public static class Builder {

        private int total;
        private int startedCount;
        private int endedCount;
        private ZoneIntersectionSummaryStatistics summaryStatistics;
        private java.util.List<ZoneIntersectionSummaryBucket> buckets;

        public Builder() {
        }

        /**
         * The total number of zone intersections within the time range.
         */
        public Builder setTotal(int total) {
            this.total = total;
            return this;
        }

        /**
         * The number of zone intersections which started within the time range.
         */
        public Builder setStartedCount(int startedCount) {
            this.startedCount = startedCount;
            return this;
        }

        /**
         * The number of zone intersections which ended within the time range.
         */
        public Builder setEndedCount(int endedCount) {
            this.endedCount = endedCount;
            return this;
        }

        /**
         * Summary statistics for all zone intersections within the summary's time range and filters.
         */
        public Builder setSummaryStatistics(ZoneIntersectionSummaryStatistics summaryStatistics) {
            this.summaryStatistics = summaryStatistics;
            return this;
        }

        /**
         * A detailed summary of each bucket within the time range.
Summary buckets are only returned if `zoneIntersectionBucket` is provided as a query parameter to `zoneIntersectionSummary`.
         */
        public Builder setBuckets(java.util.List<ZoneIntersectionSummaryBucket> buckets) {
            this.buckets = buckets;
            return this;
        }


        public ZoneIntersectionSummary build() {
            return new ZoneIntersectionSummary(total, startedCount, endedCount, summaryStatistics, buckets);
        }

    }
}
