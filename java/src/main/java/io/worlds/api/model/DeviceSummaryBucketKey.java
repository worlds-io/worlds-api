package io.worlds.api.model;

import java.util.Objects;

/**
 * The grouping key for a DeviceSummaryBucket.  Fields bucketed on will be present.  All other fields will be null.
 */
public class DeviceSummaryBucketKey implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private java.time.OffsetDateTime time;
    private Site site;
    private PointOfInterest pointOfInterest;

    public DeviceSummaryBucketKey() {
    }

    public DeviceSummaryBucketKey(java.time.OffsetDateTime time, Site site, PointOfInterest pointOfInterest) {
        this.time = time;
        this.site = site;
        this.pointOfInterest = pointOfInterest;
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
     * The site of the devices in the summary bucket.
     */
    public Site getSite() {
        return site;
    }
    /**
     * The site of the devices in the summary bucket.
     */
    public void setSite(Site site) {
        this.site = site;
    }

    /**
     * The point of interest of the devices in the summary bucket.
     */
    public PointOfInterest getPointOfInterest() {
        return pointOfInterest;
    }
    /**
     * The point of interest of the devices in the summary bucket.
     */
    public void setPointOfInterest(PointOfInterest pointOfInterest) {
        this.pointOfInterest = pointOfInterest;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final DeviceSummaryBucketKey that = (DeviceSummaryBucketKey) obj;
        return Objects.equals(time, that.time)
            && Objects.equals(site, that.site)
            && Objects.equals(pointOfInterest, that.pointOfInterest);
    }

    @Override
    public int hashCode() {
        return Objects.hash(time, site, pointOfInterest);
    }


    public static DeviceSummaryBucketKey.Builder builder() {
        return new DeviceSummaryBucketKey.Builder();
    }

    public static class Builder {

        private java.time.OffsetDateTime time;
        private Site site;
        private PointOfInterest pointOfInterest;

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
         * The site of the devices in the summary bucket.
         */
        public Builder setSite(Site site) {
            this.site = site;
            return this;
        }

        /**
         * The point of interest of the devices in the summary bucket.
         */
        public Builder setPointOfInterest(PointOfInterest pointOfInterest) {
            this.pointOfInterest = pointOfInterest;
            return this;
        }


        public DeviceSummaryBucketKey build() {
            return new DeviceSummaryBucketKey(time, site, pointOfInterest);
        }

    }
}
