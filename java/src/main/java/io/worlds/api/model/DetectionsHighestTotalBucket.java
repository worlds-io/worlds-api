package io.worlds.api.model;

import java.util.Objects;

/**
 * A bucket selected as having the greatest `total` within its group, returned from
[`DetectionsSummary.highestTotalBuckets`]({{Types.DetectionsSummary}}).
 */
public class DetectionsHighestTotalBucket implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private DetectionsSummaryBucketKey key;
    private int total;

    public DetectionsHighestTotalBucket() {
    }

    public DetectionsHighestTotalBucket(DetectionsSummaryBucketKey key, int total) {
        this.key = key;
        this.total = total;
    }

    /**
     * The key of the winning bucket.  Only fields included in `groupBy` are populated; others are null.
     */
    public DetectionsSummaryBucketKey getKey() {
        return key;
    }
    /**
     * The key of the winning bucket.  Only fields included in `groupBy` are populated; others are null.
     */
    public void setKey(DetectionsSummaryBucketKey key) {
        this.key = key;
    }

    /**
     * The total number of detections in the winning bucket.
     */
    public int getTotal() {
        return total;
    }
    /**
     * The total number of detections in the winning bucket.
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
        final DetectionsHighestTotalBucket that = (DetectionsHighestTotalBucket) obj;
        return Objects.equals(key, that.key)
            && Objects.equals(total, that.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, total);
    }


    public static DetectionsHighestTotalBucket.Builder builder() {
        return new DetectionsHighestTotalBucket.Builder();
    }

    public static class Builder {

        private DetectionsSummaryBucketKey key;
        private int total;

        public Builder() {
        }

        /**
         * The key of the winning bucket.  Only fields included in `groupBy` are populated; others are null.
         */
        public Builder setKey(DetectionsSummaryBucketKey key) {
            this.key = key;
            return this;
        }

        /**
         * The total number of detections in the winning bucket.
         */
        public Builder setTotal(int total) {
            this.total = total;
            return this;
        }


        public DetectionsHighestTotalBucket build() {
            return new DetectionsHighestTotalBucket(key, total);
        }

    }
}
