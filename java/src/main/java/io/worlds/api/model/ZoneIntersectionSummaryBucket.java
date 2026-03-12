package io.worlds.api.model;

import java.util.Objects;

/**
 * Summary information for zone intersections across a time range inside a given `ZoneIntersectionSummaryBucketType`.  Includes total count and the bucketed field values.
 */
public class ZoneIntersectionSummaryBucket implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private ZoneIntersectionSummaryBucketKey key;
    private int total;
    @jakarta.validation.constraints.NotNull
    private ZoneIntersectionSummaryStatistics summaryStatistics;

    public ZoneIntersectionSummaryBucket() {
    }

    public ZoneIntersectionSummaryBucket(ZoneIntersectionSummaryBucketKey key, int total, ZoneIntersectionSummaryStatistics summaryStatistics) {
        this.key = key;
        this.total = total;
        this.summaryStatistics = summaryStatistics;
    }

    /**
     * The key of the bucket.
     */
    public ZoneIntersectionSummaryBucketKey getKey() {
        return key;
    }
    /**
     * The key of the bucket.
     */
    public void setKey(ZoneIntersectionSummaryBucketKey key) {
        this.key = key;
    }

    /**
     * The total number of zone intersections within the bucket.
     */
    public int getTotal() {
        return total;
    }
    /**
     * The total number of zone intersections within the bucket.
     */
    public void setTotal(int total) {
        this.total = total;
    }

    /**
     * Summary statistics for all zone intersections within the bucket.
     */
    public ZoneIntersectionSummaryStatistics getSummaryStatistics() {
        return summaryStatistics;
    }
    /**
     * Summary statistics for all zone intersections within the bucket.
     */
    public void setSummaryStatistics(ZoneIntersectionSummaryStatistics summaryStatistics) {
        this.summaryStatistics = summaryStatistics;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final ZoneIntersectionSummaryBucket that = (ZoneIntersectionSummaryBucket) obj;
        return Objects.equals(key, that.key)
            && Objects.equals(total, that.total)
            && Objects.equals(summaryStatistics, that.summaryStatistics);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, total, summaryStatistics);
    }


    public static ZoneIntersectionSummaryBucket.Builder builder() {
        return new ZoneIntersectionSummaryBucket.Builder();
    }

    public static class Builder {

        private ZoneIntersectionSummaryBucketKey key;
        private int total;
        private ZoneIntersectionSummaryStatistics summaryStatistics;

        public Builder() {
        }

        /**
         * The key of the bucket.
         */
        public Builder setKey(ZoneIntersectionSummaryBucketKey key) {
            this.key = key;
            return this;
        }

        /**
         * The total number of zone intersections within the bucket.
         */
        public Builder setTotal(int total) {
            this.total = total;
            return this;
        }

        /**
         * Summary statistics for all zone intersections within the bucket.
         */
        public Builder setSummaryStatistics(ZoneIntersectionSummaryStatistics summaryStatistics) {
            this.summaryStatistics = summaryStatistics;
            return this;
        }


        public ZoneIntersectionSummaryBucket build() {
            return new ZoneIntersectionSummaryBucket(key, total, summaryStatistics);
        }

    }
}
