package io.worlds.api.model;

import java.util.Objects;

/**
 * The grouping key for a SummaryChronicleSummaryBucket.  Fields bucketed on will be present.  All other fields will be null.
 */
public class SummaryChronicleSummaryBucketKey implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private java.time.OffsetDateTime time;
    private String name;
    private String priority;
    private String status;
    private ChronicleProducer chronicleProducer;
    private Site site;
    private String label;
    private String validationStatus;
    private java.util.List<JSONFieldBucketKey> metadata;

    public SummaryChronicleSummaryBucketKey() {
    }

    public SummaryChronicleSummaryBucketKey(java.time.OffsetDateTime time, String name, String priority, String status, ChronicleProducer chronicleProducer, Site site, String label, String validationStatus, java.util.List<JSONFieldBucketKey> metadata) {
        this.time = time;
        this.name = name;
        this.priority = priority;
        this.status = status;
        this.chronicleProducer = chronicleProducer;
        this.site = site;
        this.label = label;
        this.validationStatus = validationStatus;
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
     * The name of the summary chronicles in the summary bucket.
     */
    public String getName() {
        return name;
    }
    /**
     * The name of the summary chronicles in the summary bucket.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * The `priority` of the summary chronicles in the summary bucket.
     */
    public String getPriority() {
        return priority;
    }
    /**
     * The `priority` of the summary chronicles in the summary bucket.
     */
    public void setPriority(String priority) {
        this.priority = priority;
    }

    /**
     * The `status` of the summary chronicles in the summary bucket.
     */
    public String getStatus() {
        return status;
    }
    /**
     * The `status` of the summary chronicles in the summary bucket.
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * The ChronicleProducer of the summary chronicles in the summary bucket.
     */
    public ChronicleProducer getChronicleProducer() {
        return chronicleProducer;
    }
    /**
     * The ChronicleProducer of the summary chronicles in the summary bucket.
     */
    public void setChronicleProducer(ChronicleProducer chronicleProducer) {
        this.chronicleProducer = chronicleProducer;
    }

    /**
     * The Site of the summary chronicles in the summary bucket.
     */
    public Site getSite() {
        return site;
    }
    /**
     * The Site of the summary chronicles in the summary bucket.
     */
    public void setSite(Site site) {
        this.site = site;
    }

    /**
     * The label of the summary chronicles in the summary bucket.
     */
    public String getLabel() {
        return label;
    }
    /**
     * The label of the summary chronicles in the summary bucket.
     */
    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * The `validationStatus` of the summary chronicles in the summary bucket.
     */
    public String getValidationStatus() {
        return validationStatus;
    }
    /**
     * The `validationStatus` of the summary chronicles in the summary bucket.
     */
    public void setValidationStatus(String validationStatus) {
        this.validationStatus = validationStatus;
    }

    /**
     * The metadata values of the summary chronicles in the summary bucket.
     */
    public java.util.List<JSONFieldBucketKey> getMetadata() {
        return metadata;
    }
    /**
     * The metadata values of the summary chronicles in the summary bucket.
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
        final SummaryChronicleSummaryBucketKey that = (SummaryChronicleSummaryBucketKey) obj;
        return Objects.equals(time, that.time)
            && Objects.equals(name, that.name)
            && Objects.equals(priority, that.priority)
            && Objects.equals(status, that.status)
            && Objects.equals(chronicleProducer, that.chronicleProducer)
            && Objects.equals(site, that.site)
            && Objects.equals(label, that.label)
            && Objects.equals(validationStatus, that.validationStatus)
            && Objects.equals(metadata, that.metadata);
    }

    @Override
    public int hashCode() {
        return Objects.hash(time, name, priority, status, chronicleProducer, site, label, validationStatus, metadata);
    }


    public static SummaryChronicleSummaryBucketKey.Builder builder() {
        return new SummaryChronicleSummaryBucketKey.Builder();
    }

    public static class Builder {

        private java.time.OffsetDateTime time;
        private String name;
        private String priority;
        private String status;
        private ChronicleProducer chronicleProducer;
        private Site site;
        private String label;
        private String validationStatus;
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
         * The name of the summary chronicles in the summary bucket.
         */
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        /**
         * The `priority` of the summary chronicles in the summary bucket.
         */
        public Builder setPriority(String priority) {
            this.priority = priority;
            return this;
        }

        /**
         * The `status` of the summary chronicles in the summary bucket.
         */
        public Builder setStatus(String status) {
            this.status = status;
            return this;
        }

        /**
         * The ChronicleProducer of the summary chronicles in the summary bucket.
         */
        public Builder setChronicleProducer(ChronicleProducer chronicleProducer) {
            this.chronicleProducer = chronicleProducer;
            return this;
        }

        /**
         * The Site of the summary chronicles in the summary bucket.
         */
        public Builder setSite(Site site) {
            this.site = site;
            return this;
        }

        /**
         * The label of the summary chronicles in the summary bucket.
         */
        public Builder setLabel(String label) {
            this.label = label;
            return this;
        }

        /**
         * The `validationStatus` of the summary chronicles in the summary bucket.
         */
        public Builder setValidationStatus(String validationStatus) {
            this.validationStatus = validationStatus;
            return this;
        }

        /**
         * The metadata values of the summary chronicles in the summary bucket.
         */
        public Builder setMetadata(java.util.List<JSONFieldBucketKey> metadata) {
            this.metadata = metadata;
            return this;
        }


        public SummaryChronicleSummaryBucketKey build() {
            return new SummaryChronicleSummaryBucketKey(time, name, priority, status, chronicleProducer, site, label, validationStatus, metadata);
        }

    }
}
