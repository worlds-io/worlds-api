package io.worlds.api.model;

import java.util.Objects;

/**
 * The grouping key for an EventsSummaryBucket.  Fields bucketed on will be present.  All other fields will be null.
 */
public class EventsSummaryBucketKey implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private java.time.OffsetDateTime time;
    private String type;
    private String subType;
    private String eventProducerId;
    private String priority;
    private java.util.List<JSONFieldBucketKey> metadata;

    public EventsSummaryBucketKey() {
    }

    public EventsSummaryBucketKey(java.time.OffsetDateTime time, String type, String subType, String eventProducerId, String priority, java.util.List<JSONFieldBucketKey> metadata) {
        this.time = time;
        this.type = type;
        this.subType = subType;
        this.eventProducerId = eventProducerId;
        this.priority = priority;
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
     * The `type` of the events in the summary bucket.
     */
    public String getType() {
        return type;
    }
    /**
     * The `type` of the events in the summary bucket.
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * The `subType` of the events in the summary bucket.
     */
    public String getSubType() {
        return subType;
    }
    /**
     * The `subType` of the events in the summary bucket.
     */
    public void setSubType(String subType) {
        this.subType = subType;
    }

    /**
     * The `id` of the EventProducer of the events in the summary bucket.
     */
    public String getEventProducerId() {
        return eventProducerId;
    }
    /**
     * The `id` of the EventProducer of the events in the summary bucket.
     */
    public void setEventProducerId(String eventProducerId) {
        this.eventProducerId = eventProducerId;
    }

    /**
     * The `priority` of the events in the summary bucket.
     */
    public String getPriority() {
        return priority;
    }
    /**
     * The `priority` of the events in the summary bucket.
     */
    public void setPriority(String priority) {
        this.priority = priority;
    }

    /**
     * If provided, group the summary buckets by the values of the provided metadata fields.
     */
    public java.util.List<JSONFieldBucketKey> getMetadata() {
        return metadata;
    }
    /**
     * If provided, group the summary buckets by the values of the provided metadata fields.
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
        final EventsSummaryBucketKey that = (EventsSummaryBucketKey) obj;
        return Objects.equals(time, that.time)
            && Objects.equals(type, that.type)
            && Objects.equals(subType, that.subType)
            && Objects.equals(eventProducerId, that.eventProducerId)
            && Objects.equals(priority, that.priority)
            && Objects.equals(metadata, that.metadata);
    }

    @Override
    public int hashCode() {
        return Objects.hash(time, type, subType, eventProducerId, priority, metadata);
    }


    public static EventsSummaryBucketKey.Builder builder() {
        return new EventsSummaryBucketKey.Builder();
    }

    public static class Builder {

        private java.time.OffsetDateTime time;
        private String type;
        private String subType;
        private String eventProducerId;
        private String priority;
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
         * The `type` of the events in the summary bucket.
         */
        public Builder setType(String type) {
            this.type = type;
            return this;
        }

        /**
         * The `subType` of the events in the summary bucket.
         */
        public Builder setSubType(String subType) {
            this.subType = subType;
            return this;
        }

        /**
         * The `id` of the EventProducer of the events in the summary bucket.
         */
        public Builder setEventProducerId(String eventProducerId) {
            this.eventProducerId = eventProducerId;
            return this;
        }

        /**
         * The `priority` of the events in the summary bucket.
         */
        public Builder setPriority(String priority) {
            this.priority = priority;
            return this;
        }

        /**
         * If provided, group the summary buckets by the values of the provided metadata fields.
         */
        public Builder setMetadata(java.util.List<JSONFieldBucketKey> metadata) {
            this.metadata = metadata;
            return this;
        }


        public EventsSummaryBucketKey build() {
            return new EventsSummaryBucketKey(time, type, subType, eventProducerId, priority, metadata);
        }

    }
}
