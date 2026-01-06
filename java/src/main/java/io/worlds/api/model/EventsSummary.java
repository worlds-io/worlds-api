package io.worlds.api.model;

import java.util.Objects;

/**
 * Summary information for events across a time range.  Includes total count and counts by buckets.
 */
public class EventsSummary implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private int total;
    @jakarta.validation.constraints.NotNull
    private EventsSummaryStatistics summaryStatistics;
    private java.util.List<EventsSummaryBucket> buckets;

    public EventsSummary() {
    }

    public EventsSummary(int total, EventsSummaryStatistics summaryStatistics, java.util.List<EventsSummaryBucket> buckets) {
        this.total = total;
        this.summaryStatistics = summaryStatistics;
        this.buckets = buckets;
    }

    /**
     * The total number of [Events]({{Types.Event}}) within the time range.
     */
    public int getTotal() {
        return total;
    }
    /**
     * The total number of [Events]({{Types.Event}}) within the time range.
     */
    public void setTotal(int total) {
        this.total = total;
    }

    /**
     * Summary statistics for all events within the summary's time range and filters.
     */
    public EventsSummaryStatistics getSummaryStatistics() {
        return summaryStatistics;
    }
    /**
     * Summary statistics for all events within the summary's time range and filters.
     */
    public void setSummaryStatistics(EventsSummaryStatistics summaryStatistics) {
        this.summaryStatistics = summaryStatistics;
    }

    /**
     * A detailed summary of each [bucket]({{Types.SummaryBucketSize}}) within the time range.
Summary buckets are only returned if `bucket` is provided as a query parameter to [`eventsSummary`]({{Queries.eventsSummary}}).
     */
    public java.util.List<EventsSummaryBucket> getBuckets() {
        return buckets;
    }
    /**
     * A detailed summary of each [bucket]({{Types.SummaryBucketSize}}) within the time range.
Summary buckets are only returned if `bucket` is provided as a query parameter to [`eventsSummary`]({{Queries.eventsSummary}}).
     */
    public void setBuckets(java.util.List<EventsSummaryBucket> buckets) {
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
        final EventsSummary that = (EventsSummary) obj;
        return Objects.equals(total, that.total)
            && Objects.equals(summaryStatistics, that.summaryStatistics)
            && Objects.equals(buckets, that.buckets);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, summaryStatistics, buckets);
    }


    public static EventsSummary.Builder builder() {
        return new EventsSummary.Builder();
    }

    public static class Builder {

        private int total;
        private EventsSummaryStatistics summaryStatistics;
        private java.util.List<EventsSummaryBucket> buckets;

        public Builder() {
        }

        /**
         * The total number of [Events]({{Types.Event}}) within the time range.
         */
        public Builder setTotal(int total) {
            this.total = total;
            return this;
        }

        /**
         * Summary statistics for all events within the summary's time range and filters.
         */
        public Builder setSummaryStatistics(EventsSummaryStatistics summaryStatistics) {
            this.summaryStatistics = summaryStatistics;
            return this;
        }

        /**
         * A detailed summary of each [bucket]({{Types.SummaryBucketSize}}) within the time range.
Summary buckets are only returned if `bucket` is provided as a query parameter to [`eventsSummary`]({{Queries.eventsSummary}}).
         */
        public Builder setBuckets(java.util.List<EventsSummaryBucket> buckets) {
            this.buckets = buckets;
            return this;
        }


        public EventsSummary build() {
            return new EventsSummary(total, summaryStatistics, buckets);
        }

    }
}
