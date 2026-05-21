package io.worlds.api.model;

import java.util.Objects;

/**
 * The grouping key for a DetectionsSummaryBucket.  Fields bucketed on will be present.  All other fields will be null.
 */
public class DetectionsSummaryBucketKey implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private java.time.OffsetDateTime time;
    private Tag tag;
    private DataSource dataSource;
    private Site site;

    public DetectionsSummaryBucketKey() {
    }

    public DetectionsSummaryBucketKey(java.time.OffsetDateTime time, Tag tag, DataSource dataSource, Site site) {
        this.time = time;
        this.tag = tag;
        this.dataSource = dataSource;
        this.site = site;
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
     * The detection's tag.
     */
    public Tag getTag() {
        return tag;
    }
    /**
     * The detection's tag.
     */
    public void setTag(Tag tag) {
        this.tag = tag;
    }

    /**
     * The data source which produced the detections.
     */
    public DataSource getDataSource() {
        return dataSource;
    }
    /**
     * The data source which produced the detections.
     */
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    /**
     * The site at which the detections were captured.
     */
    public Site getSite() {
        return site;
    }
    /**
     * The site at which the detections were captured.
     */
    public void setSite(Site site) {
        this.site = site;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final DetectionsSummaryBucketKey that = (DetectionsSummaryBucketKey) obj;
        return Objects.equals(time, that.time)
            && Objects.equals(tag, that.tag)
            && Objects.equals(dataSource, that.dataSource)
            && Objects.equals(site, that.site);
    }

    @Override
    public int hashCode() {
        return Objects.hash(time, tag, dataSource, site);
    }


    public static DetectionsSummaryBucketKey.Builder builder() {
        return new DetectionsSummaryBucketKey.Builder();
    }

    public static class Builder {

        private java.time.OffsetDateTime time;
        private Tag tag;
        private DataSource dataSource;
        private Site site;

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
         * The detection's tag.
         */
        public Builder setTag(Tag tag) {
            this.tag = tag;
            return this;
        }

        /**
         * The data source which produced the detections.
         */
        public Builder setDataSource(DataSource dataSource) {
            this.dataSource = dataSource;
            return this;
        }

        /**
         * The site at which the detections were captured.
         */
        public Builder setSite(Site site) {
            this.site = site;
            return this;
        }


        public DetectionsSummaryBucketKey build() {
            return new DetectionsSummaryBucketKey(time, tag, dataSource, site);
        }

    }
}
