package io.worlds.api.model;

import java.util.Objects;

public class EventsSummaryBucket implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @Deprecated
    @jakarta.validation.constraints.NotNull
    private java.time.OffsetDateTime time;
    private EventsSummaryBucketKey key;
    private int total;

    public EventsSummaryBucket() {
    }

    public EventsSummaryBucket(java.time.OffsetDateTime time, EventsSummaryBucketKey key, int total) {
        this.time = time;
        this.key = key;
        this.total = total;
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
            && Objects.equals(total, that.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(time, key, total);
    }


    public static EventsSummaryBucket.Builder builder() {
        return new EventsSummaryBucket.Builder();
    }

    public static class Builder {

        private java.time.OffsetDateTime time;
        private EventsSummaryBucketKey key;
        private int total;

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


        public EventsSummaryBucket build() {
            return new EventsSummaryBucket(time, key, total);
        }

    }
}
