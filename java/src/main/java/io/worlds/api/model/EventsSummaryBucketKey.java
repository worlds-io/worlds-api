package io.worlds.api.model;

import java.util.Objects;

/**
 * The grouping key for an EventsSummaryBucket.  Fields bucketed on will be present.  All other fields will be null.
 */
public class EventsSummaryBucketKey implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private java.time.OffsetDateTime time;
    private SummaryBucketSize timeStep;
    private String type;
    private String subType;
    private String eventProducerId;

    public EventsSummaryBucketKey() {
    }

    public EventsSummaryBucketKey(java.time.OffsetDateTime time, SummaryBucketSize timeStep, String type, String subType, String eventProducerId) {
        this.time = time;
        this.timeStep = timeStep;
        this.type = type;
        this.subType = subType;
        this.eventProducerId = eventProducerId;
    }

    public java.time.OffsetDateTime getTime() {
        return time;
    }
    public void setTime(java.time.OffsetDateTime time) {
        this.time = time;
    }

    public SummaryBucketSize getTimeStep() {
        return timeStep;
    }
    public void setTimeStep(SummaryBucketSize timeStep) {
        this.timeStep = timeStep;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public String getSubType() {
        return subType;
    }
    public void setSubType(String subType) {
        this.subType = subType;
    }

    public String getEventProducerId() {
        return eventProducerId;
    }
    public void setEventProducerId(String eventProducerId) {
        this.eventProducerId = eventProducerId;
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
            && Objects.equals(timeStep, that.timeStep)
            && Objects.equals(type, that.type)
            && Objects.equals(subType, that.subType)
            && Objects.equals(eventProducerId, that.eventProducerId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(time, timeStep, type, subType, eventProducerId);
    }


    public static EventsSummaryBucketKey.Builder builder() {
        return new EventsSummaryBucketKey.Builder();
    }

    public static class Builder {

        private java.time.OffsetDateTime time;
        private SummaryBucketSize timeStep;
        private String type;
        private String subType;
        private String eventProducerId;

        public Builder() {
        }

        public Builder setTime(java.time.OffsetDateTime time) {
            this.time = time;
            return this;
        }

        public Builder setTimeStep(SummaryBucketSize timeStep) {
            this.timeStep = timeStep;
            return this;
        }

        public Builder setType(String type) {
            this.type = type;
            return this;
        }

        public Builder setSubType(String subType) {
            this.subType = subType;
            return this;
        }

        public Builder setEventProducerId(String eventProducerId) {
            this.eventProducerId = eventProducerId;
            return this;
        }


        public EventsSummaryBucketKey build() {
            return new EventsSummaryBucketKey(time, timeStep, type, subType, eventProducerId);
        }

    }
}
