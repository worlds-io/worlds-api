package io.worlds.api.model;

import java.util.Objects;

/**
 * Summary information for events across a time range.  Includes total count and counts by buckets.
 */
public class EventsSummary implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private int total;
    private java.util.List<EventsSummaryBucket> buckets;

    public EventsSummary() {
    }

    public EventsSummary(int total, java.util.List<EventsSummaryBucket> buckets) {
        this.total = total;
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
            && Objects.equals(buckets, that.buckets);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, buckets);
    }


    public static EventsSummary.Builder builder() {
        return new EventsSummary.Builder();
    }

    public static class Builder {

        private int total;
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
         * A detailed summary of each [bucket]({{Types.SummaryBucketSize}}) within the time range.
Summary buckets are only returned if `bucket` is provided as a query parameter to [`eventsSummary`]({{Queries.eventsSummary}}).
         */
        public Builder setBuckets(java.util.List<EventsSummaryBucket> buckets) {
            this.buckets = buckets;
            return this;
        }


        public EventsSummary build() {
            return new EventsSummary(total, buckets);
        }

    }
}
