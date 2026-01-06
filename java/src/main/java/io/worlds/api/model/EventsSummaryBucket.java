package io.worlds.api.model;

import java.util.Objects;

/**
 * Summary information for events across a time range inside a given `EventsSummaryBucketType`.  Includes total count and the bucketed field values.
 */
public class EventsSummaryBucket implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @Deprecated
    @jakarta.validation.constraints.NotNull
    private java.time.OffsetDateTime time;
    private EventsSummaryBucketKey key;
    private int total;
    @jakarta.validation.constraints.NotNull
    private EventsSummaryStatistics summaryStatistics;

    public EventsSummaryBucket() {
    }

    public EventsSummaryBucket(java.time.OffsetDateTime time, EventsSummaryBucketKey key, int total, EventsSummaryStatistics summaryStatistics) {
        this.time = time;
        this.key = key;
        this.total = total;
        this.summaryStatistics = summaryStatistics;
    }

    /**
     * The start time of the bucket.
     */
    @Deprecated
    public java.time.OffsetDateTime getTime() {
        return time;
    }
    /**
     * The start time of the bucket.
     */
    @Deprecated
    public void setTime(java.time.OffsetDateTime time) {
        this.time = time;
    }

    /**
     * The key of the bucket.
     */
    public EventsSummaryBucketKey getKey() {
        return key;
    }
    /**
     * The key of the bucket.
     */
    public void setKey(EventsSummaryBucketKey key) {
        this.key = key;
    }

    /**
     * The total number of [Events]({{Types.Event}}) within the bucket.
     */
    public int getTotal() {
        return total;
    }
    /**
     * The total number of [Events]({{Types.Event}}) within the bucket.
     */
    public void setTotal(int total) {
        this.total = total;
    }

    /**
     * Summary statistics for all events within the bucket.
     */
    public EventsSummaryStatistics getSummaryStatistics() {
        return summaryStatistics;
    }
    /**
     * Summary statistics for all events within the bucket.
     */
    public void setSummaryStatistics(EventsSummaryStatistics summaryStatistics) {
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
        final EventsSummaryBucket that = (EventsSummaryBucket) obj;
        return Objects.equals(time, that.time)
            && Objects.equals(key, that.key)
            && Objects.equals(total, that.total)
            && Objects.equals(summaryStatistics, that.summaryStatistics);
    }

    @Override
    public int hashCode() {
        return Objects.hash(time, key, total, summaryStatistics);
    }


    public static EventsSummaryBucket.Builder builder() {
        return new EventsSummaryBucket.Builder();
    }

    public static class Builder {

        private java.time.OffsetDateTime time;
        private EventsSummaryBucketKey key;
        private int total;
        private EventsSummaryStatistics summaryStatistics;

        public Builder() {
        }

        /**
         * The start time of the bucket.
         */
        @Deprecated
        public Builder setTime(java.time.OffsetDateTime time) {
            this.time = time;
            return this;
        }

        /**
         * The key of the bucket.
         */
        public Builder setKey(EventsSummaryBucketKey key) {
            this.key = key;
            return this;
        }

        /**
         * The total number of [Events]({{Types.Event}}) within the bucket.
         */
        public Builder setTotal(int total) {
            this.total = total;
            return this;
        }

        /**
         * Summary statistics for all events within the bucket.
         */
        public Builder setSummaryStatistics(EventsSummaryStatistics summaryStatistics) {
            this.summaryStatistics = summaryStatistics;
            return this;
        }


        public EventsSummaryBucket build() {
            return new EventsSummaryBucket(time, key, total, summaryStatistics);
        }

    }
}
