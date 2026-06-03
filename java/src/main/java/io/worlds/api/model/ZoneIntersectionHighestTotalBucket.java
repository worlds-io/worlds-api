package io.worlds.api.model;

import java.util.Objects;

/**
 * A bucket selected as having the greatest `total` within its group, returned from
[`ZoneIntersectionSummary.highestTotalBuckets`]({{Types.ZoneIntersectionSummary}}).
 */
public class ZoneIntersectionHighestTotalBucket implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private ZoneIntersectionSummaryBucketKey key;
    private int total;

    public ZoneIntersectionHighestTotalBucket() {
    }

    public ZoneIntersectionHighestTotalBucket(ZoneIntersectionSummaryBucketKey key, int total) {
        this.key = key;
        this.total = total;
    }

    /**
     * The key of the winning bucket.  Only fields included in `groupBy` are populated; others are null.
     */
    public ZoneIntersectionSummaryBucketKey getKey() {
        return key;
    }
    /**
     * The key of the winning bucket.  Only fields included in `groupBy` are populated; others are null.
     */
    public void setKey(ZoneIntersectionSummaryBucketKey key) {
        this.key = key;
    }

    /**
     * The total number of zone intersections in the winning bucket.
     */
    public int getTotal() {
        return total;
    }
    /**
     * The total number of zone intersections in the winning bucket.
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
        final ZoneIntersectionHighestTotalBucket that = (ZoneIntersectionHighestTotalBucket) obj;
        return Objects.equals(key, that.key)
            && Objects.equals(total, that.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, total);
    }


    public static ZoneIntersectionHighestTotalBucket.Builder builder() {
        return new ZoneIntersectionHighestTotalBucket.Builder();
    }

    public static class Builder {

        private ZoneIntersectionSummaryBucketKey key;
        private int total;

        public Builder() {
        }

        /**
         * The key of the winning bucket.  Only fields included in `groupBy` are populated; others are null.
         */
        public Builder setKey(ZoneIntersectionSummaryBucketKey key) {
            this.key = key;
            return this;
        }

        /**
         * The total number of zone intersections in the winning bucket.
         */
        public Builder setTotal(int total) {
            this.total = total;
            return this;
        }


        public ZoneIntersectionHighestTotalBucket build() {
            return new ZoneIntersectionHighestTotalBucket(key, total);
        }

    }
}
