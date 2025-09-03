package io.worlds.api.model;


public class TracksSummary implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private int total;
    @jakarta.validation.constraints.NotNull
    private java.util.List<TracksCountByTag> totalsByTag;
    private java.util.List<TracksSummaryBucket> buckets;

    public TracksSummary() {
    }

    public TracksSummary(int total, java.util.List<TracksCountByTag> totalsByTag, java.util.List<TracksSummaryBucket> buckets) {
        this.total = total;
        this.totalsByTag = totalsByTag;
        this.buckets = buckets;
    }

    /**
     * The total number of [Tracks]({{Types.track}}) within the time range.
     */
    public int getTotal() {
        return total;
    }
    /**
     * The total number of [Tracks]({{Types.track}}) within the time range.
     */
    public void setTotal(int total) {
        this.total = total;
    }

    /**
     * The count of [Tracks]({{Types.track}}) for each [Tag]({{Types.tag}}) within the time range.
     */
    public java.util.List<TracksCountByTag> getTotalsByTag() {
        return totalsByTag;
    }
    /**
     * The count of [Tracks]({{Types.track}}) for each [Tag]({{Types.tag}}) within the time range.
     */
    public void setTotalsByTag(java.util.List<TracksCountByTag> totalsByTag) {
        this.totalsByTag = totalsByTag;
    }

    /**
     * A detailed summary of each [bucket]({{Types.summarybucketsize}}) within the time range.
Summary buckets are only returned if `bucket` is provided as a query parameter to [`tracksSummary`]({{Queries.trackssummary}}).
     */
    public java.util.List<TracksSummaryBucket> getBuckets() {
        return buckets;
    }
    /**
     * A detailed summary of each [bucket]({{Types.summarybucketsize}}) within the time range.
Summary buckets are only returned if `bucket` is provided as a query parameter to [`tracksSummary`]({{Queries.trackssummary}}).
     */
    public void setBuckets(java.util.List<TracksSummaryBucket> buckets) {
        this.buckets = buckets;
    }



    public static TracksSummary.Builder builder() {
        return new TracksSummary.Builder();
    }

    public static class Builder {

        private int total;
        private java.util.List<TracksCountByTag> totalsByTag;
        private java.util.List<TracksSummaryBucket> buckets;

        public Builder() {
        }

        /**
         * The total number of [Tracks]({{Types.track}}) within the time range.
         */
        public Builder setTotal(int total) {
            this.total = total;
            return this;
        }

        /**
         * The count of [Tracks]({{Types.track}}) for each [Tag]({{Types.tag}}) within the time range.
         */
        public Builder setTotalsByTag(java.util.List<TracksCountByTag> totalsByTag) {
            this.totalsByTag = totalsByTag;
            return this;
        }

        /**
         * A detailed summary of each [bucket]({{Types.summarybucketsize}}) within the time range.
Summary buckets are only returned if `bucket` is provided as a query parameter to [`tracksSummary`]({{Queries.trackssummary}}).
         */
        public Builder setBuckets(java.util.List<TracksSummaryBucket> buckets) {
            this.buckets = buckets;
            return this;
        }


        public TracksSummary build() {
            return new TracksSummary(total, totalsByTag, buckets);
        }

    }
}
