package io.worlds.api.model;


public class TracksSummaryBucket implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private java.time.OffsetDateTime time;
    private int total;
    @jakarta.validation.constraints.NotNull
    private java.util.List<TracksCountByTag> counts;

    public TracksSummaryBucket() {
    }

    public TracksSummaryBucket(java.time.OffsetDateTime time, int total, java.util.List<TracksCountByTag> counts) {
        this.time = time;
        this.total = total;
        this.counts = counts;
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
     * The total number of [Tracks]({{Types.track}}) within the bucket.
     */
    public int getTotal() {
        return total;
    }
    /**
     * The total number of [Tracks]({{Types.track}}) within the bucket.
     */
    public void setTotal(int total) {
        this.total = total;
    }

    /**
     * The count of [Tracks]({{Types.track}}) for each [Tag]({{Types.tag}}) within the bucket.
     */
    public java.util.List<TracksCountByTag> getCounts() {
        return counts;
    }
    /**
     * The count of [Tracks]({{Types.track}}) for each [Tag]({{Types.tag}}) within the bucket.
     */
    public void setCounts(java.util.List<TracksCountByTag> counts) {
        this.counts = counts;
    }



    public static TracksSummaryBucket.Builder builder() {
        return new TracksSummaryBucket.Builder();
    }

    public static class Builder {

        private java.time.OffsetDateTime time;
        private int total;
        private java.util.List<TracksCountByTag> counts;

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
         * The total number of [Tracks]({{Types.track}}) within the bucket.
         */
        public Builder setTotal(int total) {
            this.total = total;
            return this;
        }

        /**
         * The count of [Tracks]({{Types.track}}) for each [Tag]({{Types.tag}}) within the bucket.
         */
        public Builder setCounts(java.util.List<TracksCountByTag> counts) {
            this.counts = counts;
            return this;
        }


        public TracksSummaryBucket build() {
            return new TracksSummaryBucket(time, total, counts);
        }

    }
}
