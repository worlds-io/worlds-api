package io.worlds.api.model;


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
     * The total number of [Events]({{Types.event}}) within the bucket.
     */
    public int getTotal() {
        return total;
    }
    /**
     * The total number of [Events]({{Types.event}}) within the bucket.
     */
    public void setTotal(int total) {
        this.total = total;
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
         * The total number of [Events]({{Types.event}}) within the bucket.
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
