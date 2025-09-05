package io.worlds.api.model;


/**
 * A summary chronicle summarizes across a specific timeframe.  It can reference event and activity chronicles.
 */
public class SummaryChronicle implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private String id;
    @jakarta.validation.constraints.NotNull
    private String name;
    @jakarta.validation.constraints.NotNull
    private ChronicleProducer chronicleProducer;
    private String description;
    @jakarta.validation.constraints.NotNull
    private java.time.OffsetDateTime startTime;
    @jakarta.validation.constraints.NotNull
    private java.time.OffsetDateTime endTime;
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
    private java.util.List<SummaryChronicle> eventChronicles;
    @jakarta.validation.constraints.NotNull
    private java.time.OffsetDateTime createdAt;
    @jakarta.validation.constraints.NotNull
    private java.time.OffsetDateTime updatedAt;

    public SummaryChronicle() {
    }

    public SummaryChronicle(String id, String name, ChronicleProducer chronicleProducer, String description, java.time.OffsetDateTime startTime, java.time.OffsetDateTime endTime, String timezone, java.lang.Object metadata, ChronicleValidation validation, String priority, String status, java.util.List<String> labels, java.util.List<String> locations, java.util.List<ActivityChronicle> activityChronicles, java.util.List<SummaryChronicle> eventChronicles, java.time.OffsetDateTime createdAt, java.time.OffsetDateTime updatedAt) {
        this.id = id;
        this.name = name;
        this.chronicleProducer = chronicleProducer;
        this.description = description;
        this.startTime = startTime;
        this.endTime = endTime;
        this.timezone = timezone;
        this.metadata = metadata;
        this.validation = validation;
        this.priority = priority;
        this.status = status;
        this.labels = labels;
        this.locations = locations;
        this.activityChronicles = activityChronicles;
        this.eventChronicles = eventChronicles;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    /**
     * The unique identifier for the summary.
     */
    public String getId() {
        return id;
    }
    /**
     * The unique identifier for the summary.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * The name of the summary
     */
    public String getName() {
        return name;
    }
    /**
     * The name of the summary
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * The chronicle producer that created the summary.
     */
    public ChronicleProducer getChronicleProducer() {
        return chronicleProducer;
    }
    /**
     * The chronicle producer that created the summary.
     */
    public void setChronicleProducer(ChronicleProducer chronicleProducer) {
        this.chronicleProducer = chronicleProducer;
    }

    /**
     * A text description of the summary.
     */
    public String getDescription() {
        return description;
    }
    /**
     * A text description of the summary.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * The start time of the summary.
     */
    public java.time.OffsetDateTime getStartTime() {
        return startTime;
    }
    /**
     * The start time of the summary.
     */
    public void setStartTime(java.time.OffsetDateTime startTime) {
        this.startTime = startTime;
    }

    /**
     * The end time of the summary.
     */
    public java.time.OffsetDateTime getEndTime() {
        return endTime;
    }
    /**
     * The end time of the summary.
     */
    public void setEndTime(java.time.OffsetDateTime endTime) {
        this.endTime = endTime;
    }

    /**
     * The timezone for the summary, if provided.
     */
    public String getTimezone() {
        return timezone;
    }
    /**
     * The timezone for the summary, if provided.
     */
    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    /**
     * Additional metadata associated with the summary. This may represent any JSON object structure.
     */
    public java.lang.Object getMetadata() {
        return metadata;
    }
    /**
     * Additional metadata associated with the summary. This may represent any JSON object structure.
     */
    public void setMetadata(java.lang.Object metadata) {
        this.metadata = metadata;
    }

    /**
     * Optional information to validate the accuracy of the summary.
     */
    public ChronicleValidation getValidation() {
        return validation;
    }
    /**
     * Optional information to validate the accuracy of the summary.
     */
    public void setValidation(ChronicleValidation validation) {
        this.validation = validation;
    }

    /**
     * User-defined priority of the summary.
     */
    public String getPriority() {
        return priority;
    }
    /**
     * User-defined priority of the summary.
     */
    public void setPriority(String priority) {
        this.priority = priority;
    }

    /**
     * User-defined status of the summary.
     */
    public String getStatus() {
        return status;
    }
    /**
     * User-defined status of the summary.
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Human-readable labels describing the summary.
     */
    public java.util.List<String> getLabels() {
        return labels;
    }
    /**
     * Human-readable labels describing the summary.
     */
    public void setLabels(java.util.List<String> labels) {
        this.labels = labels;
    }

    /**
     * Human-readable locations describing the summary.
     */
    public java.util.List<String> getLocations() {
        return locations;
    }
    /**
     * Human-readable locations describing the summary.
     */
    public void setLocations(java.util.List<String> locations) {
        this.locations = locations;
    }

    /**
     * Activity chronicles associated with the summary.
     */
    public java.util.List<ActivityChronicle> getActivityChronicles() {
        return activityChronicles;
    }
    /**
     * Activity chronicles associated with the summary.
     */
    public void setActivityChronicles(java.util.List<ActivityChronicle> activityChronicles) {
        this.activityChronicles = activityChronicles;
    }

    /**
     * Event chronicles associated with the summary.
     */
    public java.util.List<SummaryChronicle> getEventChronicles() {
        return eventChronicles;
    }
    /**
     * Event chronicles associated with the summary.
     */
    public void setEventChronicles(java.util.List<SummaryChronicle> eventChronicles) {
        this.eventChronicles = eventChronicles;
    }

    /**
     * Timestamp that the summary was created.
     */
    public java.time.OffsetDateTime getCreatedAt() {
        return createdAt;
    }
    /**
     * Timestamp that the summary was created.
     */
    public void setCreatedAt(java.time.OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * Timestamp that the summary was most recently updated.
     */
    public java.time.OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }
    /**
     * Timestamp that the summary was most recently updated.
     */
    public void setUpdatedAt(java.time.OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }



    public static SummaryChronicle.Builder builder() {
        return new SummaryChronicle.Builder();
    }

    public static class Builder {

        private String id;
        private String name;
        private ChronicleProducer chronicleProducer;
        private String description;
        private java.time.OffsetDateTime startTime;
        private java.time.OffsetDateTime endTime;
        private String timezone;
        private java.lang.Object metadata;
        private ChronicleValidation validation;
        private String priority;
        private String status;
        private java.util.List<String> labels;
        private java.util.List<String> locations;
        private java.util.List<ActivityChronicle> activityChronicles;
        private java.util.List<SummaryChronicle> eventChronicles;
        private java.time.OffsetDateTime createdAt;
        private java.time.OffsetDateTime updatedAt;

        public Builder() {
        }

        /**
         * The unique identifier for the summary.
         */
        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        /**
         * The name of the summary
         */
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        /**
         * The chronicle producer that created the summary.
         */
        public Builder setChronicleProducer(ChronicleProducer chronicleProducer) {
            this.chronicleProducer = chronicleProducer;
            return this;
        }

        /**
         * A text description of the summary.
         */
        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        /**
         * The start time of the summary.
         */
        public Builder setStartTime(java.time.OffsetDateTime startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * The end time of the summary.
         */
        public Builder setEndTime(java.time.OffsetDateTime endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * The timezone for the summary, if provided.
         */
        public Builder setTimezone(String timezone) {
            this.timezone = timezone;
            return this;
        }

        /**
         * Additional metadata associated with the summary. This may represent any JSON object structure.
         */
        public Builder setMetadata(java.lang.Object metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * Optional information to validate the accuracy of the summary.
         */
        public Builder setValidation(ChronicleValidation validation) {
            this.validation = validation;
            return this;
        }

        /**
         * User-defined priority of the summary.
         */
        public Builder setPriority(String priority) {
            this.priority = priority;
            return this;
        }

        /**
         * User-defined status of the summary.
         */
        public Builder setStatus(String status) {
            this.status = status;
            return this;
        }

        /**
         * Human-readable labels describing the summary.
         */
        public Builder setLabels(java.util.List<String> labels) {
            this.labels = labels;
            return this;
        }

        /**
         * Human-readable locations describing the summary.
         */
        public Builder setLocations(java.util.List<String> locations) {
            this.locations = locations;
            return this;
        }

        /**
         * Activity chronicles associated with the summary.
         */
        public Builder setActivityChronicles(java.util.List<ActivityChronicle> activityChronicles) {
            this.activityChronicles = activityChronicles;
            return this;
        }

        /**
         * Event chronicles associated with the summary.
         */
        public Builder setEventChronicles(java.util.List<SummaryChronicle> eventChronicles) {
            this.eventChronicles = eventChronicles;
            return this;
        }

        /**
         * Timestamp that the summary was created.
         */
        public Builder setCreatedAt(java.time.OffsetDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * Timestamp that the summary was most recently updated.
         */
        public Builder setUpdatedAt(java.time.OffsetDateTime updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }


        public SummaryChronicle build() {
            return new SummaryChronicle(id, name, chronicleProducer, description, startTime, endTime, timezone, metadata, validation, priority, status, labels, locations, activityChronicles, eventChronicles, createdAt, updatedAt);
        }

    }
}
