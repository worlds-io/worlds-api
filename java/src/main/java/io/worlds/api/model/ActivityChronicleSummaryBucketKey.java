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

    public ActivityChronicleSummaryBucketKey() {
    }

    public ActivityChronicleSummaryBucketKey(java.time.OffsetDateTime time, String priority, String status, ChronicleProducer chronicleProducer) {
        this.time = time;
        this.priority = priority;
        this.status = status;
        this.chronicleProducer = chronicleProducer;
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
            && Objects.equals(chronicleProducer, that.chronicleProducer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(time, priority, status, chronicleProducer);
    }


    public static ActivityChronicleSummaryBucketKey.Builder builder() {
        return new ActivityChronicleSummaryBucketKey.Builder();
    }

    public static class Builder {

        private java.time.OffsetDateTime time;
        private String priority;
        private String status;
        private ChronicleProducer chronicleProducer;

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


        public ActivityChronicleSummaryBucketKey build() {
            return new ActivityChronicleSummaryBucketKey(time, priority, status, chronicleProducer);
        }

    }
}
