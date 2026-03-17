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
    private int startedCount;
    private int endedCount;
    @Deprecated
    @jakarta.validation.constraints.NotNull
    private java.util.List<TracksCountByTag> counts;

    public TracksSummaryBucket() {
    }

    public TracksSummaryBucket(java.time.OffsetDateTime time, TracksSummaryBucketKey key, int total, int startedCount, int endedCount, java.util.List<TracksCountByTag> counts) {
        this.time = time;
        this.key = key;
        this.total = total;
        this.startedCount = startedCount;
        this.endedCount = endedCount;
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
     * The total number of tracks within the bucket.
     */
    public int getTotal() {
        return total;
    }
    /**
     * The total number of tracks within the bucket.
     */
    public void setTotal(int total) {
        this.total = total;
    }

    /**
     * The number of tracks which started within the bucket.
     */
    public int getStartedCount() {
        return startedCount;
    }
    /**
     * The number of tracks which started within the bucket.
     */
    public void setStartedCount(int startedCount) {
        this.startedCount = startedCount;
    }

    /**
     * The number of tracks which ended within the bucket.
     */
    public int getEndedCount() {
        return endedCount;
    }
    /**
     * The number of tracks which ended within the bucket.
     */
    public void setEndedCount(int endedCount) {
        this.endedCount = endedCount;
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
            && Objects.equals(startedCount, that.startedCount)
            && Objects.equals(endedCount, that.endedCount)
            && Objects.equals(counts, that.counts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(time, key, total, startedCount, endedCount, counts);
    }


    public static TracksSummaryBucket.Builder builder() {
        return new TracksSummaryBucket.Builder();
    }

    public static class Builder {

        private java.time.OffsetDateTime time;
        private TracksSummaryBucketKey key;
        private int total;
        private int startedCount;
        private int endedCount;
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
         * The total number of tracks within the bucket.
         */
        public Builder setTotal(int total) {
            this.total = total;
            return this;
        }

        /**
         * The number of tracks which started within the bucket.
         */
        public Builder setStartedCount(int startedCount) {
            this.startedCount = startedCount;
            return this;
        }

        /**
         * The number of tracks which ended within the bucket.
         */
        public Builder setEndedCount(int endedCount) {
            this.endedCount = endedCount;
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
            return new TracksSummaryBucket(time, key, total, startedCount, endedCount, counts);
        }

    }
}
