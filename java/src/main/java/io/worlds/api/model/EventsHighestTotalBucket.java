package io.worlds.api.model;

import java.util.Objects;

/**
 * A bucket selected as having the greatest `total` within its group, returned from
[`EventsSummary.highestTotalBuckets`]({{Types.EventsSummary}}).
 */
public class EventsHighestTotalBucket implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private EventsSummaryBucketKey key;
    private int total;

    public EventsHighestTotalBucket() {
    }

    public EventsHighestTotalBucket(EventsSummaryBucketKey key, int total) {
        this.key = key;
        this.total = total;
    }

    /**
     * The key of the winning bucket.  Only fields included in `groupBy` are populated; others are null.
     */
    public EventsSummaryBucketKey getKey() {
        return key;
    }
    /**
     * The key of the winning bucket.  Only fields included in `groupBy` are populated; others are null.
     */
    public void setKey(EventsSummaryBucketKey key) {
        this.key = key;
    }

    /**
     * The total number of [Events]({{Types.Event}}) in the winning bucket.
     */
    public int getTotal() {
        return total;
    }
    /**
     * The total number of [Events]({{Types.Event}}) in the winning bucket.
     */
    public void setTotal(int total) {
        this.total = total;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final EventsHighestTotalBucket that = (EventsHighestTotalBucket) obj;
        return Objects.equals(key, that.key)
            && Objects.equals(total, that.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, total);
    }


    public static EventsHighestTotalBucket.Builder builder() {
        return new EventsHighestTotalBucket.Builder();
    }

    public static class Builder {

        private EventsSummaryBucketKey key;
        private int total;

        public Builder() {
        }

        /**
         * The key of the winning bucket.  Only fields included in `groupBy` are populated; others are null.
         */
        public Builder setKey(EventsSummaryBucketKey key) {
            this.key = key;
            return this;
        }

        /**
         * The total number of [Events]({{Types.Event}}) in the winning bucket.
         */
        public Builder setTotal(int total) {
            this.total = total;
            return this;
        }


        public EventsHighestTotalBucket build() {
            return new EventsHighestTotalBucket(key, total);
        }

    }
}
