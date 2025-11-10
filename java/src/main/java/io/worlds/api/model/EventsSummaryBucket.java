package io.worlds.api.model;

import java.util.Objects;

public class EventsSummaryBucket implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private java.time.OffsetDateTime time;
    private int total;

    public EventsSummaryBucket() {
    }

    public EventsSummaryBucket(java.time.OffsetDateTime time, int total) {
        this.time = time;
        this.total = total;
    }

    /**
     * The start time of the bucket.
     */
    public java.time.OffsetDateTime getTime() {
        return time;
    }
    /**
     * The start time of the bucket.
     */
    public void setTime(java.time.OffsetDateTime time) {
        this.time = time;
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
            && Objects.equals(total, that.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(time, total);
    }


    public static EventsSummaryBucket.Builder builder() {
        return new EventsSummaryBucket.Builder();
    }

    public static class Builder {

        private java.time.OffsetDateTime time;
        private int total;

        public Builder() {
        }

        /**
         * The start time of the bucket.
         */
        public Builder setTime(java.time.OffsetDateTime time) {
            this.time = time;
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
            return new EventsSummaryBucket(time, total);
        }

    }
}
