package io.worlds.api.model;

import java.util.Objects;

/**
 * The grouping key for an TracksSummaryBucket.  Fields bucketed on will be present.  All other fields will be null.
 */
public class TracksSummaryBucketKey implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private java.time.OffsetDateTime time;
    private Tag tag;
    private DataSource dataSource;
    private Site dataSourceSite;
    private Site dataSourcePointOfInterest;

    public TracksSummaryBucketKey() {
    }

    public TracksSummaryBucketKey(java.time.OffsetDateTime time, Tag tag, DataSource dataSource, Site dataSourceSite, Site dataSourcePointOfInterest) {
        this.time = time;
        this.tag = tag;
        this.dataSource = dataSource;
        this.dataSourceSite = dataSourceSite;
        this.dataSourcePointOfInterest = dataSourcePointOfInterest;
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
     * The tracks' tags.
     */
    public Tag getTag() {
        return tag;
    }
    /**
     * The tracks' tags.
     */
    public void setTag(Tag tag) {
        this.tag = tag;
    }

    /**
     * The data source which produced the tracks.
     */
    public DataSource getDataSource() {
        return dataSource;
    }
    /**
     * The data source which produced the tracks.
     */
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    /**
     * The site for data sources which produced the tracks.
     */
    public Site getDataSourceSite() {
        return dataSourceSite;
    }
    /**
     * The site for data sources which produced the tracks.
     */
    public void setDataSourceSite(Site dataSourceSite) {
        this.dataSourceSite = dataSourceSite;
    }

    /**
     * The point of interest for data sources which produced the tracks.
     */
    public Site getDataSourcePointOfInterest() {
        return dataSourcePointOfInterest;
    }
    /**
     * The point of interest for data sources which produced the tracks.
     */
    public void setDataSourcePointOfInterest(Site dataSourcePointOfInterest) {
        this.dataSourcePointOfInterest = dataSourcePointOfInterest;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final TracksSummaryBucketKey that = (TracksSummaryBucketKey) obj;
        return Objects.equals(time, that.time)
            && Objects.equals(tag, that.tag)
            && Objects.equals(dataSource, that.dataSource)
            && Objects.equals(dataSourceSite, that.dataSourceSite)
            && Objects.equals(dataSourcePointOfInterest, that.dataSourcePointOfInterest);
    }

    @Override
    public int hashCode() {
        return Objects.hash(time, tag, dataSource, dataSourceSite, dataSourcePointOfInterest);
    }


    public static TracksSummaryBucketKey.Builder builder() {
        return new TracksSummaryBucketKey.Builder();
    }

    public static class Builder {

        private java.time.OffsetDateTime time;
        private Tag tag;
        private DataSource dataSource;
        private Site dataSourceSite;
        private Site dataSourcePointOfInterest;

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
         * The tracks' tags.
         */
        public Builder setTag(Tag tag) {
            this.tag = tag;
            return this;
        }

        /**
         * The data source which produced the tracks.
         */
        public Builder setDataSource(DataSource dataSource) {
            this.dataSource = dataSource;
            return this;
        }

        /**
         * The site for data sources which produced the tracks.
         */
        public Builder setDataSourceSite(Site dataSourceSite) {
            this.dataSourceSite = dataSourceSite;
            return this;
        }

        /**
         * The point of interest for data sources which produced the tracks.
         */
        public Builder setDataSourcePointOfInterest(Site dataSourcePointOfInterest) {
            this.dataSourcePointOfInterest = dataSourcePointOfInterest;
            return this;
        }


        public TracksSummaryBucketKey build() {
            return new TracksSummaryBucketKey(time, tag, dataSource, dataSourceSite, dataSourcePointOfInterest);
        }

    }
}
