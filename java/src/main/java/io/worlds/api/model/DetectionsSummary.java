package io.worlds.api.model;

import java.util.Objects;

/**
 * Summary information for detections across a time range.  Includes total count and counts by buckets.
 */
public class DetectionsSummary implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private int total;
    private java.util.List<DetectionsSummaryBucket> buckets;
    @jakarta.validation.constraints.NotNull
    private java.util.List<DetectionsHighestTotalBucket> highestTotalBuckets;

    public DetectionsSummary() {
    }

    public DetectionsSummary(int total, java.util.List<DetectionsSummaryBucket> buckets, java.util.List<DetectionsHighestTotalBucket> highestTotalBuckets) {
        this.total = total;
        this.buckets = buckets;
        this.highestTotalBuckets = highestTotalBuckets;
    }

    /**
     * The total number of detections within the time range.
     */
    public int getTotal() {
        return total;
    }
    /**
     * The total number of detections within the time range.
     */
    public void setTotal(int total) {
        this.total = total;
    }

    /**
     * A detailed summary of each bucket within the time range.
Summary buckets are only returned if `detectionsBucket` is provided as a query parameter to `detectionsSummary`.
     */
    public java.util.List<DetectionsSummaryBucket> getBuckets() {
        return buckets;
    }
    /**
     * A detailed summary of each bucket within the time range.
Summary buckets are only returned if `detectionsBucket` is provided as a query parameter to `detectionsSummary`.
     */
    public void setBuckets(java.util.List<DetectionsSummaryBucket> buckets) {
        this.buckets = buckets;
    }

    /**
     * The bucket(s) with the greatest `total` across the parent's buckets.  Empty if no `detectionsBucket`
was provided.  All tied buckets are returned per group.
     */
    public java.util.List<DetectionsHighestTotalBucket> getHighestTotalBuckets() {
        return highestTotalBuckets;
    }
    /**
     * The bucket(s) with the greatest `total` across the parent's buckets.  Empty if no `detectionsBucket`
was provided.  All tied buckets are returned per group.
     */
    public void setHighestTotalBuckets(java.util.List<DetectionsHighestTotalBucket> highestTotalBuckets) {
        this.highestTotalBuckets = highestTotalBuckets;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final DetectionsSummary that = (DetectionsSummary) obj;
        return Objects.equals(total, that.total)
            && Objects.equals(buckets, that.buckets)
            && Objects.equals(highestTotalBuckets, that.highestTotalBuckets);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, buckets, highestTotalBuckets);
    }


    public static DetectionsSummary.Builder builder() {
        return new DetectionsSummary.Builder();
    }

    public static class Builder {

        private int total;
        private java.util.List<DetectionsSummaryBucket> buckets;
        private java.util.List<DetectionsHighestTotalBucket> highestTotalBuckets;

        public Builder() {
        }

        /**
         * The total number of detections within the time range.
         */
        public Builder setTotal(int total) {
            this.total = total;
            return this;
        }

        /**
         * A detailed summary of each bucket within the time range.
Summary buckets are only returned if `detectionsBucket` is provided as a query parameter to `detectionsSummary`.
         */
        public Builder setBuckets(java.util.List<DetectionsSummaryBucket> buckets) {
            this.buckets = buckets;
            return this;
        }

        /**
         * The bucket(s) with the greatest `total` across the parent's buckets.  Empty if no `detectionsBucket`
was provided.  All tied buckets are returned per group.
         */
        public Builder setHighestTotalBuckets(java.util.List<DetectionsHighestTotalBucket> highestTotalBuckets) {
            this.highestTotalBuckets = highestTotalBuckets;
            return this;
        }


        public DetectionsSummary build() {
            return new DetectionsSummary(total, buckets, highestTotalBuckets);
        }

    }
}
