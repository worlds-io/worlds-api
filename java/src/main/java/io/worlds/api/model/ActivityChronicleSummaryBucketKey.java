package io.worlds.api.model;

import java.util.Objects;

/**
 * The grouping key for an ActivityChronicleSummaryBucket.  Fields bucketed on will be present.  All other fields will be null.
 */
public class ActivityChronicleSummaryBucketKey implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private java.time.OffsetDateTime time;
    private String priority;
    private String status;
    private ChronicleProducer chronicleProducer;
    private Site site;
    private DataSource dataSource;
    private String validationStatus;
    private String approvalStatus;
    private java.util.List<JSONFieldBucketKey> metadata;

    public ActivityChronicleSummaryBucketKey() {
    }

    public ActivityChronicleSummaryBucketKey(java.time.OffsetDateTime time, String priority, String status, ChronicleProducer chronicleProducer, Site site, DataSource dataSource, String validationStatus, String approvalStatus, java.util.List<JSONFieldBucketKey> metadata) {
        this.time = time;
        this.priority = priority;
        this.status = status;
        this.chronicleProducer = chronicleProducer;
        this.site = site;
        this.dataSource = dataSource;
        this.validationStatus = validationStatus;
        this.approvalStatus = approvalStatus;
        this.metadata = metadata;
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
     * The `priority` of the activity chronicles in the summary bucket.
     */
    public String getPriority() {
        return priority;
    }
    /**
     * The `priority` of the activity chronicles in the summary bucket.
     */
    public void setPriority(String priority) {
        this.priority = priority;
    }

    /**
     * The `status` of the activity chronicles in the summary bucket.
     */
    public String getStatus() {
        return status;
    }
    /**
     * The `status` of the activity chronicles in the summary bucket.
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * The ChronicleProducer of the activity chronicles in the summary bucket.
     */
    public ChronicleProducer getChronicleProducer() {
        return chronicleProducer;
    }
    /**
     * The ChronicleProducer of the activity chronicles in the summary bucket.
     */
    public void setChronicleProducer(ChronicleProducer chronicleProducer) {
        this.chronicleProducer = chronicleProducer;
    }

    /**
     * The Site of the activity chronicles in the summary bucket.
     */
    public Site getSite() {
        return site;
    }
    /**
     * The Site of the activity chronicles in the summary bucket.
     */
    public void setSite(Site site) {
        this.site = site;
    }

    /**
     * The DataSource of the activity chronicles in the summary bucket.
     */
    public DataSource getDataSource() {
        return dataSource;
    }
    /**
     * The DataSource of the activity chronicles in the summary bucket.
     */
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    /**
     * The `validationStatus` of the activity chronicles in the summary bucket.
     */
    public String getValidationStatus() {
        return validationStatus;
    }
    /**
     * The `validationStatus` of the activity chronicles in the summary bucket.
     */
    public void setValidationStatus(String validationStatus) {
        this.validationStatus = validationStatus;
    }

    /**
     * The `approvalStatus` of the activity chronicles in the summary bucket.
     */
    public String getApprovalStatus() {
        return approvalStatus;
    }
    /**
     * The `approvalStatus` of the activity chronicles in the summary bucket.
     */
    public void setApprovalStatus(String approvalStatus) {
        this.approvalStatus = approvalStatus;
    }

    /**
     * The metadata values of the activity chronicles in the summary bucket.
     */
    public java.util.List<JSONFieldBucketKey> getMetadata() {
        return metadata;
    }
    /**
     * The metadata values of the activity chronicles in the summary bucket.
     */
    public void setMetadata(java.util.List<JSONFieldBucketKey> metadata) {
        this.metadata = metadata;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final ActivityChronicleSummaryBucketKey that = (ActivityChronicleSummaryBucketKey) obj;
        return Objects.equals(time, that.time)
            && Objects.equals(priority, that.priority)
            && Objects.equals(status, that.status)
            && Objects.equals(chronicleProducer, that.chronicleProducer)
            && Objects.equals(site, that.site)
            && Objects.equals(dataSource, that.dataSource)
            && Objects.equals(validationStatus, that.validationStatus)
            && Objects.equals(approvalStatus, that.approvalStatus)
            && Objects.equals(metadata, that.metadata);
    }

    @Override
    public int hashCode() {
        return Objects.hash(time, priority, status, chronicleProducer, site, dataSource, validationStatus, approvalStatus, metadata);
    }


    public static ActivityChronicleSummaryBucketKey.Builder builder() {
        return new ActivityChronicleSummaryBucketKey.Builder();
    }

    public static class Builder {

        private java.time.OffsetDateTime time;
        private String priority;
        private String status;
        private ChronicleProducer chronicleProducer;
        private Site site;
        private DataSource dataSource;
        private String validationStatus;
        private String approvalStatus;
        private java.util.List<JSONFieldBucketKey> metadata;

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
         * The `priority` of the activity chronicles in the summary bucket.
         */
        public Builder setPriority(String priority) {
            this.priority = priority;
            return this;
        }

        /**
         * The `status` of the activity chronicles in the summary bucket.
         */
        public Builder setStatus(String status) {
            this.status = status;
            return this;
        }

        /**
         * The ChronicleProducer of the activity chronicles in the summary bucket.
         */
        public Builder setChronicleProducer(ChronicleProducer chronicleProducer) {
            this.chronicleProducer = chronicleProducer;
            return this;
        }

        /**
         * The Site of the activity chronicles in the summary bucket.
         */
        public Builder setSite(Site site) {
            this.site = site;
            return this;
        }

        /**
         * The DataSource of the activity chronicles in the summary bucket.
         */
        public Builder setDataSource(DataSource dataSource) {
            this.dataSource = dataSource;
            return this;
        }

        /**
         * The `validationStatus` of the activity chronicles in the summary bucket.
         */
        public Builder setValidationStatus(String validationStatus) {
            this.validationStatus = validationStatus;
            return this;
        }

        /**
         * The `approvalStatus` of the activity chronicles in the summary bucket.
         */
        public Builder setApprovalStatus(String approvalStatus) {
            this.approvalStatus = approvalStatus;
            return this;
        }

        /**
         * The metadata values of the activity chronicles in the summary bucket.
         */
        public Builder setMetadata(java.util.List<JSONFieldBucketKey> metadata) {
            this.metadata = metadata;
            return this;
        }


        public ActivityChronicleSummaryBucketKey build() {
            return new ActivityChronicleSummaryBucketKey(time, priority, status, chronicleProducer, site, dataSource, validationStatus, approvalStatus, metadata);
        }

    }
}
