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

    public int getTotal() {
        return total;
    }
    public void setTotal(int total) {
        this.total = total;
    }

    public java.util.List<TracksCountByTag> getTotalsByTag() {
        return totalsByTag;
    }
    public void setTotalsByTag(java.util.List<TracksCountByTag> totalsByTag) {
        this.totalsByTag = totalsByTag;
    }

    public java.util.List<TracksSummaryBucket> getBuckets() {
        return buckets;
    }
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

        public Builder setTotal(int total) {
            this.total = total;
            return this;
        }

        public Builder setTotalsByTag(java.util.List<TracksCountByTag> totalsByTag) {
            this.totalsByTag = totalsByTag;
            return this;
        }

        public Builder setBuckets(java.util.List<TracksSummaryBucket> buckets) {
            this.buckets = buckets;
            return this;
        }


        public TracksSummary build() {
            return new TracksSummary(total, totalsByTag, buckets);
        }

    }
}
