package io.worlds.api.model;

import java.util.Objects;

/**
 * Summary information for detections across a time range inside a given `DetectionsSummaryBucketType`.  Includes total count and the bucketed field values.
 */
public class DetectionsSummaryBucket implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private DetectionsSummaryBucketKey key;
    private int total;

    public DetectionsSummaryBucket() {
    }

    public DetectionsSummaryBucket(DetectionsSummaryBucketKey key, int total) {
        this.key = key;
        this.total = total;
    }

    /**
     * The key of the bucket.
     */
    public DetectionsSummaryBucketKey getKey() {
        return key;
    }
    /**
     * The key of the bucket.
     */
    public void setKey(DetectionsSummaryBucketKey key) {
        this.key = key;
    }

    /**
     * The total number of detections within the bucket.
     */
    public int getTotal() {
        return total;
    }
    /**
     * The total number of detections within the bucket.
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
        final DetectionsSummaryBucket that = (DetectionsSummaryBucket) obj;
        return Objects.equals(key, that.key)
            && Objects.equals(total, that.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, total);
    }


    public static DetectionsSummaryBucket.Builder builder() {
        return new DetectionsSummaryBucket.Builder();
    }

    public static class Builder {

        private DetectionsSummaryBucketKey key;
        private int total;

        public Builder() {
        }

        /**
         * The key of the bucket.
         */
        public Builder setKey(DetectionsSummaryBucketKey key) {
            this.key = key;
            return this;
        }

        /**
         * The total number of detections within the bucket.
         */
        public Builder setTotal(int total) {
            this.total = total;
            return this;
        }


        public DetectionsSummaryBucket build() {
            return new DetectionsSummaryBucket(key, total);
        }

    }
}
