package io.worlds.api.model;

import java.util.Objects;

/**
 * The grouping key for a ZoneIntersectionSummaryBucket.  Fields bucketed on will be present.  All other fields will be null.
 */
public class ZoneIntersectionSummaryBucketKey implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private java.time.OffsetDateTime time;
    private String zoneName;
    private Tag tag;
    private DataSource dataSource;

    public ZoneIntersectionSummaryBucketKey() {
    }

    public ZoneIntersectionSummaryBucketKey(java.time.OffsetDateTime time, String zoneName, Tag tag, DataSource dataSource) {
        this.time = time;
        this.zoneName = zoneName;
        this.tag = tag;
        this.dataSource = dataSource;
    }

    /**
     * The start time of the summary bucket.
     */
    public java.time.OffsetDateTime getTime() {
        return time;
    }
    /**
     * The start time of the summary bucket.
     */
    public void setTime(java.time.OffsetDateTime time) {
        this.time = time;
    }

    /**
     * The zone name of the zone intersections in the summary bucket.
     */
    public String getZoneName() {
        return zoneName;
    }
    /**
     * The zone name of the zone intersections in the summary bucket.
     */
    public void setZoneName(String zoneName) {
        this.zoneName = zoneName;
    }

    /**
     * The tag of the zone intersections in the summary bucket.
     */
    public Tag getTag() {
        return tag;
    }
    /**
     * The tag of the zone intersections in the summary bucket.
     */
    public void setTag(Tag tag) {
        this.tag = tag;
    }

    /**
     * The data source of the zone intersections in the summary bucket.
     */
    public DataSource getDataSource() {
        return dataSource;
    }
    /**
     * The data source of the zone intersections in the summary bucket.
     */
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final ZoneIntersectionSummaryBucketKey that = (ZoneIntersectionSummaryBucketKey) obj;
        return Objects.equals(time, that.time)
            && Objects.equals(zoneName, that.zoneName)
            && Objects.equals(tag, that.tag)
            && Objects.equals(dataSource, that.dataSource);
    }

    @Override
    public int hashCode() {
        return Objects.hash(time, zoneName, tag, dataSource);
    }


    public static ZoneIntersectionSummaryBucketKey.Builder builder() {
        return new ZoneIntersectionSummaryBucketKey.Builder();
    }

    public static class Builder {

        private java.time.OffsetDateTime time;
        private String zoneName;
        private Tag tag;
        private DataSource dataSource;

        public Builder() {
        }

        /**
         * The start time of the summary bucket.
         */
        public Builder setTime(java.time.OffsetDateTime time) {
            this.time = time;
            return this;
        }

        /**
         * The zone name of the zone intersections in the summary bucket.
         */
        public Builder setZoneName(String zoneName) {
            this.zoneName = zoneName;
            return this;
        }

        /**
         * The tag of the zone intersections in the summary bucket.
         */
        public Builder setTag(Tag tag) {
            this.tag = tag;
            return this;
        }

        /**
         * The data source of the zone intersections in the summary bucket.
         */
        public Builder setDataSource(DataSource dataSource) {
            this.dataSource = dataSource;
            return this;
        }


        public ZoneIntersectionSummaryBucketKey build() {
            return new ZoneIntersectionSummaryBucketKey(time, zoneName, tag, dataSource);
        }

    }
}
