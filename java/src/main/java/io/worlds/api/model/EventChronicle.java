package io.worlds.api.model;

import java.util.Objects;

/**
 * An event chronicle represents an occurrence at a single point at time.
 */
public class EventChronicle implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private String id;
    @jakarta.validation.constraints.NotNull
    private ChronicleProducer chronicleProducer;
    @jakarta.validation.constraints.NotNull
    private String name;
    private String description;
    @jakarta.validation.constraints.NotNull
    private java.time.OffsetDateTime timestamp;
    private String timezone;
    private java.lang.Object metadata;
    private ChronicleValidation validation;
    private String priority;
    private String status;
    private java.util.List<String> labels;
    private java.util.List<String> locations;
    @jakarta.validation.constraints.NotNull
    private java.util.List<ActivityChronicle> activityChronicles;
    @jakarta.validation.constraints.NotNull
    private java.time.OffsetDateTime createdAt;
    @jakarta.validation.constraints.NotNull
    private java.time.OffsetDateTime updatedAt;

    public EventChronicle() {
    }

    public EventChronicle(String id, ChronicleProducer chronicleProducer, String name, String description, java.time.OffsetDateTime timestamp, String timezone, java.lang.Object metadata, ChronicleValidation validation, String priority, String status, java.util.List<String> labels, java.util.List<String> locations, java.util.List<ActivityChronicle> activityChronicles, java.time.OffsetDateTime createdAt, java.time.OffsetDateTime updatedAt) {
        this.id = id;
        this.chronicleProducer = chronicleProducer;
        this.name = name;
        this.description = description;
        this.timestamp = timestamp;
        this.timezone = timezone;
        this.metadata = metadata;
        this.validation = validation;
        this.priority = priority;
        this.status = status;
        this.labels = labels;
        this.locations = locations;
        this.activityChronicles = activityChronicles;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    /**
     * The unique identifier for the event.
     */
    public String getId() {
        return id;
    }
    /**
     * The unique identifier for the event.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * The chronicle producer that created the event.
     */
    public ChronicleProducer getChronicleProducer() {
        return chronicleProducer;
    }
    /**
     * The chronicle producer that created the event.
     */
    public void setChronicleProducer(ChronicleProducer chronicleProducer) {
        this.chronicleProducer = chronicleProducer;
    }

    /**
     * The name of the event
     */
    public String getName() {
        return name;
    }
    /**
     * The name of the event
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * A text description of the event.
     */
    public String getDescription() {
        return description;
    }
    /**
     * A text description of the event.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * The time at which the event occurred.
     */
    public java.time.OffsetDateTime getTimestamp() {
        return timestamp;
    }
    /**
     * The time at which the event occurred.
     */
    public void setTimestamp(java.time.OffsetDateTime timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * The timezone for the event, if provided.
     */
    public String getTimezone() {
        return timezone;
    }
    /**
     * The timezone for the event, if provided.
     */
    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    /**
     * Additional metadata associated with the event. This may represent any JSON object structure.
     */
    public java.lang.Object getMetadata() {
        return metadata;
    }
    /**
     * Additional metadata associated with the event. This may represent any JSON object structure.
     */
    public void setMetadata(java.lang.Object metadata) {
        this.metadata = metadata;
    }

    /**
     * Optional information to validate the accuracy of the event.
     */
    public ChronicleValidation getValidation() {
        return validation;
    }
    /**
     * Optional information to validate the accuracy of the event.
     */
    public void setValidation(ChronicleValidation validation) {
        this.validation = validation;
    }

    /**
     * User-defined priority of the event.
     */
    public String getPriority() {
        return priority;
    }
    /**
     * User-defined priority of the event.
     */
    public void setPriority(String priority) {
        this.priority = priority;
    }

    /**
     * User-defined status of the event.
     */
    public String getStatus() {
        return status;
    }
    /**
     * User-defined status of the event.
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Human-readable labels describing the event.
     */
    public java.util.List<String> getLabels() {
        return labels;
    }
    /**
     * Human-readable labels describing the event.
     */
    public void setLabels(java.util.List<String> labels) {
        this.labels = labels;
    }

    /**
     * Human-readable locations describing the event.
     */
    public java.util.List<String> getLocations() {
        return locations;
    }
    /**
     * Human-readable locations describing the event.
     */
    public void setLocations(java.util.List<String> locations) {
        this.locations = locations;
    }

    /**
     * Activity chronicles associated with the event.
     */
    public java.util.List<ActivityChronicle> getActivityChronicles() {
        return activityChronicles;
    }
    /**
     * Activity chronicles associated with the event.
     */
    public void setActivityChronicles(java.util.List<ActivityChronicle> activityChronicles) {
        this.activityChronicles = activityChronicles;
    }

    /**
     * Timestamp that the event was created.
     */
    public java.time.OffsetDateTime getCreatedAt() {
        return createdAt;
    }
    /**
     * Timestamp that the event was created.
     */
    public void setCreatedAt(java.time.OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * Timestamp that the event was most recently updated.
     */
    public java.time.OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }
    /**
     * Timestamp that the event was most recently updated.
     */
    public void setUpdatedAt(java.time.OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final EventChronicle that = (EventChronicle) obj;
        return Objects.equals(id, that.id)
            && Objects.equals(chronicleProducer, that.chronicleProducer)
            && Objects.equals(name, that.name)
            && Objects.equals(description, that.description)
            && Objects.equals(timestamp, that.timestamp)
            && Objects.equals(timezone, that.timezone)
            && Objects.equals(metadata, that.metadata)
            && Objects.equals(validation, that.validation)
            && Objects.equals(priority, that.priority)
            && Objects.equals(status, that.status)
            && Objects.equals(labels, that.labels)
            && Objects.equals(locations, that.locations)
            && Objects.equals(activityChronicles, that.activityChronicles)
            && Objects.equals(createdAt, that.createdAt)
            && Objects.equals(updatedAt, that.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, chronicleProducer, name, description, timestamp, timezone, metadata, validation, priority, status, labels, locations, activityChronicles, createdAt, updatedAt);
    }


    public static EventChronicle.Builder builder() {
        return new EventChronicle.Builder();
    }

    public static class Builder {

        private String id;
        private ChronicleProducer chronicleProducer;
        private String name;
        private String description;
        private java.time.OffsetDateTime timestamp;
        private String timezone;
        private java.lang.Object metadata;
        private ChronicleValidation validation;
        private String priority;
        private String status;
        private java.util.List<String> labels;
        private java.util.List<String> locations;
        private java.util.List<ActivityChronicle> activityChronicles;
        private java.time.OffsetDateTime createdAt;
        private java.time.OffsetDateTime updatedAt;

        public Builder() {
        }

        /**
         * The unique identifier for the event.
         */
        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        /**
         * The chronicle producer that created the event.
         */
        public Builder setChronicleProducer(ChronicleProducer chronicleProducer) {
            this.chronicleProducer = chronicleProducer;
            return this;
        }

        /**
         * The name of the event
         */
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        /**
         * A text description of the event.
         */
        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        /**
         * The time at which the event occurred.
         */
        public Builder setTimestamp(java.time.OffsetDateTime timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        /**
         * The timezone for the event, if provided.
         */
        public Builder setTimezone(String timezone) {
            this.timezone = timezone;
            return this;
        }

        /**
         * Additional metadata associated with the event. This may represent any JSON object structure.
         */
        public Builder setMetadata(java.lang.Object metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * Optional information to validate the accuracy of the event.
         */
        public Builder setValidation(ChronicleValidation validation) {
            this.validation = validation;
            return this;
        }

        /**
         * User-defined priority of the event.
         */
        public Builder setPriority(String priority) {
            this.priority = priority;
            return this;
        }

        /**
         * User-defined status of the event.
         */
        public Builder setStatus(String status) {
            this.status = status;
            return this;
        }

        /**
         * Human-readable labels describing the event.
         */
        public Builder setLabels(java.util.List<String> labels) {
            this.labels = labels;
            return this;
        }

        /**
         * Human-readable locations describing the event.
         */
        public Builder setLocations(java.util.List<String> locations) {
            this.locations = locations;
            return this;
        }

        /**
         * Activity chronicles associated with the event.
         */
        public Builder setActivityChronicles(java.util.List<ActivityChronicle> activityChronicles) {
            this.activityChronicles = activityChronicles;
            return this;
        }

        /**
         * Timestamp that the event was created.
         */
        public Builder setCreatedAt(java.time.OffsetDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * Timestamp that the event was most recently updated.
         */
        public Builder setUpdatedAt(java.time.OffsetDateTime updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }


        public EventChronicle build() {
            return new EventChronicle(id, chronicleProducer, name, description, timestamp, timezone, metadata, validation, priority, status, labels, locations, activityChronicles, createdAt, updatedAt);
        }

    }
}
