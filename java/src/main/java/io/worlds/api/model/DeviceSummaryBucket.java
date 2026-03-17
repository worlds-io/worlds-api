package io.worlds.api.model;

import java.util.Objects;

/**
 * Summary information for devices across a time range inside a given `DeviceSummaryBucketType`.  Includes total count and the bucketed field values.
 */
public class DeviceSummaryBucket implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private DeviceSummaryBucketKey key;
    private int total;

    public DeviceSummaryBucket() {
    }

    public DeviceSummaryBucket(DeviceSummaryBucketKey key, int total) {
        this.key = key;
        this.total = total;
    }

    /**
     * The key of the bucket.
     */
    public DeviceSummaryBucketKey getKey() {
        return key;
    }
    /**
     * The key of the bucket.
     */
    public void setKey(DeviceSummaryBucketKey key) {
        this.key = key;
    }

    /**
     * The total number of devices within the bucket.
     */
    public int getTotal() {
        return total;
    }
    /**
     * The total number of devices within the bucket.
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
        final DeviceSummaryBucket that = (DeviceSummaryBucket) obj;
        return Objects.equals(key, that.key)
            && Objects.equals(total, that.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, total);
    }


    public static DeviceSummaryBucket.Builder builder() {
        return new DeviceSummaryBucket.Builder();
    }

    public static class Builder {

        private DeviceSummaryBucketKey key;
        private int total;

        public Builder() {
        }

        /**
         * The key of the bucket.
         */
        public Builder setKey(DeviceSummaryBucketKey key) {
            this.key = key;
            return this;
        }

        /**
         * The total number of devices within the bucket.
         */
        public Builder setTotal(int total) {
            this.total = total;
            return this;
        }


        public DeviceSummaryBucket build() {
            return new DeviceSummaryBucket(key, total);
        }

    }
}
