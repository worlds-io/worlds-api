package io.worlds.api.model;

import java.util.Objects;

public class TracksSummaryBucket implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @Deprecated
    @jakarta.validation.constraints.NotNull
    private java.time.OffsetDateTime time;
    @jakarta.validation.constraints.NotNull
    private TracksSummaryBucketKey key;
    private int total;
    @Deprecated
    @jakarta.validation.constraints.NotNull
    private java.util.List<TracksCountByTag> counts;

    public TracksSummaryBucket() {
    }

    public TracksSummaryBucket(java.time.OffsetDateTime time, TracksSummaryBucketKey key, int total, java.util.List<TracksCountByTag> counts) {
        this.time = time;
        this.key = key;
        this.total = total;
        this.counts = counts;
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
    public TracksSummaryBucketKey getKey() {
        return key;
    }
    /**
     * The key of the bucket.
     */
    public void setKey(TracksSummaryBucketKey key) {
        this.key = key;
    }

    /**
     * The total number of [Tracks]({{Types.Track}}) within the bucket.
     */
    public int getTotal() {
        return total;
    }
    /**
     * The total number of [Tracks]({{Types.Track}}) within the bucket.
     */
    public void setTotal(int total) {
        this.total = total;
    }

    /**
     * The count of [Tracks]({{Types.Track}}) for each [Tag]({{Types.Tag}}) within the bucket.
     */
    @Deprecated
    public java.util.List<TracksCountByTag> getCounts() {
        return counts;
    }
    /**
     * The count of [Tracks]({{Types.Track}}) for each [Tag]({{Types.Tag}}) within the bucket.
     */
    @Deprecated
    public void setCounts(java.util.List<TracksCountByTag> counts) {
        this.counts = counts;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final TracksSummaryBucket that = (TracksSummaryBucket) obj;
        return Objects.equals(time, that.time)
            && Objects.equals(key, that.key)
            && Objects.equals(total, that.total)
            && Objects.equals(counts, that.counts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(time, key, total, counts);
    }


    public static TracksSummaryBucket.Builder builder() {
        return new TracksSummaryBucket.Builder();
    }

    public static class Builder {

        private java.time.OffsetDateTime time;
        private TracksSummaryBucketKey key;
        private int total;
        private java.util.List<TracksCountByTag> counts;

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
        public Builder setKey(TracksSummaryBucketKey key) {
            this.key = key;
            return this;
        }

        /**
         * The total number of [Tracks]({{Types.Track}}) within the bucket.
         */
        public Builder setTotal(int total) {
            this.total = total;
            return this;
        }

        /**
         * The count of [Tracks]({{Types.Track}}) for each [Tag]({{Types.Tag}}) within the bucket.
         */
        @Deprecated
        public Builder setCounts(java.util.List<TracksCountByTag> counts) {
            this.counts = counts;
            return this;
        }


        public TracksSummaryBucket build() {
            return new TracksSummaryBucket(time, key, total, counts);
        }

    }
}
