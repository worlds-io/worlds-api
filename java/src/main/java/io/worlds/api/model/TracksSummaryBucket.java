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

    public java.time.OffsetDateTime getTime() {
        return time;
    }
    public void setTime(java.time.OffsetDateTime time) {
        this.time = time;
    }

    public int getTotal() {
        return total;
    }
    public void setTotal(int total) {
        this.total = total;
    }

    public java.util.List<TracksCountByTag> getCounts() {
        return counts;
    }
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

        public Builder setTime(java.time.OffsetDateTime time) {
            this.time = time;
            return this;
        }

        public Builder setTotal(int total) {
            this.total = total;
            return this;
        }

        public Builder setCounts(java.util.List<TracksCountByTag> counts) {
            this.counts = counts;
            return this;
        }


        public TracksSummaryBucket build() {
            return new TracksSummaryBucket(time, total, counts);
        }

    }
}
