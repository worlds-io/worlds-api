package io.worlds.api.model;


public class SummaryChronicle implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private String id;
    @jakarta.validation.constraints.NotNull
    private String name;
    @jakarta.validation.constraints.NotNull
    private ChronicleProducer documentProducer;
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
    private java.util.List<EventChronicle> eventChronicles;
    @jakarta.validation.constraints.NotNull
    private java.time.OffsetDateTime createdAt;
    @jakarta.validation.constraints.NotNull
    private java.time.OffsetDateTime updatedAt;

    public SummaryChronicle() {
    }

    public SummaryChronicle(String id, String name, ChronicleProducer documentProducer, String description, java.time.OffsetDateTime startTime, java.time.OffsetDateTime endTime, String timezone, java.lang.Object metadata, ChronicleValidation validation, String priority, String status, java.util.List<String> labels, java.util.List<String> locations, java.util.List<ActivityChronicle> activityChronicles, java.util.List<EventChronicle> eventChronicles, java.time.OffsetDateTime createdAt, java.time.OffsetDateTime updatedAt) {
        this.id = id;
        this.name = name;
        this.documentProducer = documentProducer;
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

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public ChronicleProducer getDocumentProducer() {
        return documentProducer;
    }
    public void setDocumentProducer(ChronicleProducer documentProducer) {
        this.documentProducer = documentProducer;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public java.time.OffsetDateTime getStartTime() {
        return startTime;
    }
    public void setStartTime(java.time.OffsetDateTime startTime) {
        this.startTime = startTime;
    }

    public java.time.OffsetDateTime getEndTime() {
        return endTime;
    }
    public void setEndTime(java.time.OffsetDateTime endTime) {
        this.endTime = endTime;
    }

    public String getTimezone() {
        return timezone;
    }
    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public java.lang.Object getMetadata() {
        return metadata;
    }
    public void setMetadata(java.lang.Object metadata) {
        this.metadata = metadata;
    }

    public ChronicleValidation getValidation() {
        return validation;
    }
    public void setValidation(ChronicleValidation validation) {
        this.validation = validation;
    }

    public String getPriority() {
        return priority;
    }
    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    public java.util.List<String> getLabels() {
        return labels;
    }
    public void setLabels(java.util.List<String> labels) {
        this.labels = labels;
    }

    public java.util.List<String> getLocations() {
        return locations;
    }
    public void setLocations(java.util.List<String> locations) {
        this.locations = locations;
    }

    public java.util.List<ActivityChronicle> getActivityChronicles() {
        return activityChronicles;
    }
    public void setActivityChronicles(java.util.List<ActivityChronicle> activityChronicles) {
        this.activityChronicles = activityChronicles;
    }

    public java.util.List<EventChronicle> getEventChronicles() {
        return eventChronicles;
    }
    public void setEventChronicles(java.util.List<EventChronicle> eventChronicles) {
        this.eventChronicles = eventChronicles;
    }

    public java.time.OffsetDateTime getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(java.time.OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public java.time.OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }
    public void setUpdatedAt(java.time.OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }



    public static SummaryChronicle.Builder builder() {
        return new SummaryChronicle.Builder();
    }

    public static class Builder {

        private String id;
        private String name;
        private ChronicleProducer documentProducer;
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
        private java.util.List<EventChronicle> eventChronicles;
        private java.time.OffsetDateTime createdAt;
        private java.time.OffsetDateTime updatedAt;

        public Builder() {
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setDocumentProducer(ChronicleProducer documentProducer) {
            this.documentProducer = documentProducer;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setStartTime(java.time.OffsetDateTime startTime) {
            this.startTime = startTime;
            return this;
        }

        public Builder setEndTime(java.time.OffsetDateTime endTime) {
            this.endTime = endTime;
            return this;
        }

        public Builder setTimezone(String timezone) {
            this.timezone = timezone;
            return this;
        }

        public Builder setMetadata(java.lang.Object metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder setValidation(ChronicleValidation validation) {
            this.validation = validation;
            return this;
        }

        public Builder setPriority(String priority) {
            this.priority = priority;
            return this;
        }

        public Builder setStatus(String status) {
            this.status = status;
            return this;
        }

        public Builder setLabels(java.util.List<String> labels) {
            this.labels = labels;
            return this;
        }

        public Builder setLocations(java.util.List<String> locations) {
            this.locations = locations;
            return this;
        }

        public Builder setActivityChronicles(java.util.List<ActivityChronicle> activityChronicles) {
            this.activityChronicles = activityChronicles;
            return this;
        }

        public Builder setEventChronicles(java.util.List<EventChronicle> eventChronicles) {
            this.eventChronicles = eventChronicles;
            return this;
        }

        public Builder setCreatedAt(java.time.OffsetDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public Builder setUpdatedAt(java.time.OffsetDateTime updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }


        public SummaryChronicle build() {
            return new SummaryChronicle(id, name, documentProducer, description, startTime, endTime, timezone, metadata, validation, priority, status, labels, locations, activityChronicles, eventChronicles, createdAt, updatedAt);
        }

    }
}
