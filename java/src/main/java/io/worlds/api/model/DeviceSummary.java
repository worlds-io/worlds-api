package io.worlds.api.model;

import java.util.Objects;

/**
 * Summary information for devices across a time range.  Includes total count and counts by buckets.
 */
public class DeviceSummary implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private int total;
    private java.util.List<DeviceSummaryBucket> buckets;

    public DeviceSummary() {
    }

    public DeviceSummary(int total, java.util.List<DeviceSummaryBucket> buckets) {
        this.total = total;
        this.buckets = buckets;
    }

    /**
     * The total number of devices within the time range.
     */
    public int getTotal() {
        return total;
    }
    /**
     * The total number of devices within the time range.
     */
    public void setTotal(int total) {
        this.total = total;
    }

    /**
     * A detailed summary of each bucket within the time range.
Summary buckets are only returned if `deviceBucket` is provided as a query parameter to `deviceSummary`.
     */
    public java.util.List<DeviceSummaryBucket> getBuckets() {
        return buckets;
    }
    /**
     * A detailed summary of each bucket within the time range.
Summary buckets are only returned if `deviceBucket` is provided as a query parameter to `deviceSummary`.
     */
    public void setBuckets(java.util.List<DeviceSummaryBucket> buckets) {
        this.buckets = buckets;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final DeviceSummary that = (DeviceSummary) obj;
        return Objects.equals(total, that.total)
            && Objects.equals(buckets, that.buckets);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, buckets);
    }


    public static DeviceSummary.Builder builder() {
        return new DeviceSummary.Builder();
    }

    public static class Builder {

        private int total;
        private java.util.List<DeviceSummaryBucket> buckets;

        public Builder() {
        }

        /**
         * The total number of devices within the time range.
         */
        public Builder setTotal(int total) {
            this.total = total;
            return this;
        }

        /**
         * A detailed summary of each bucket within the time range.
Summary buckets are only returned if `deviceBucket` is provided as a query parameter to `deviceSummary`.
         */
        public Builder setBuckets(java.util.List<DeviceSummaryBucket> buckets) {
            this.buckets = buckets;
            return this;
        }


        public DeviceSummary build() {
            return new DeviceSummary(total, buckets);
        }

    }
}
