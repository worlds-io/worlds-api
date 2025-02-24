package io.worlds.api.model;


public class EventsSummary implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private int total;
    private java.util.List<EventsSummaryBucket> buckets;

    public EventsSummary() {
    }

    public EventsSummary(int total, java.util.List<EventsSummaryBucket> buckets) {
        this.total = total;
        this.buckets = buckets;
    }

    public int getTotal() {
        return total;
    }
    public void setTotal(int total) {
        this.total = total;
    }

    public java.util.List<EventsSummaryBucket> getBuckets() {
        return buckets;
    }
    public void setBuckets(java.util.List<EventsSummaryBucket> buckets) {
        this.buckets = buckets;
    }



    public static EventsSummary.Builder builder() {
        return new EventsSummary.Builder();
    }

    public static class Builder {

        private int total;
        private java.util.List<EventsSummaryBucket> buckets;

        public Builder() {
        }

        public Builder setTotal(int total) {
            this.total = total;
            return this;
        }

        public Builder setBuckets(java.util.List<EventsSummaryBucket> buckets) {
            this.buckets = buckets;
            return this;
        }


        public EventsSummary build() {
            return new EventsSummary(total, buckets);
        }

    }
}
