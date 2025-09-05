package io.worlds.api.model;


/**
 * This input type is used to create a new [`SummaryChronicle`]({{Types.summarychronicle}}).
 */
public class CreateSummaryChronicleInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private String name;
    @jakarta.validation.constraints.NotNull
    private String chronicleProducerId;
    private org.springframework.graphql.data.ArgumentValue<String> description = org.springframework.graphql.data.ArgumentValue.omitted();
    @jakarta.validation.constraints.NotNull
    private java.time.OffsetDateTime startTime;
    @jakarta.validation.constraints.NotNull
    private java.time.OffsetDateTime endTime;
    private org.springframework.graphql.data.ArgumentValue<String> timezone = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<java.lang.Object> metadata = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<String> priority = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<String> status = org.springframework.graphql.data.ArgumentValue.omitted();
    private java.util.List<String> labels;
    private java.util.List<String> locations;
    private org.springframework.graphql.data.ArgumentValue<ChronicleValidationInput> validation = org.springframework.graphql.data.ArgumentValue.omitted();
    private java.util.List<String> activityChronicleIds;
    private java.util.List<String> eventChronicleIds;

    public CreateSummaryChronicleInput() {
    }

    public CreateSummaryChronicleInput(String name, String chronicleProducerId, org.springframework.graphql.data.ArgumentValue<String> description, java.time.OffsetDateTime startTime, java.time.OffsetDateTime endTime, org.springframework.graphql.data.ArgumentValue<String> timezone, org.springframework.graphql.data.ArgumentValue<java.lang.Object> metadata, org.springframework.graphql.data.ArgumentValue<String> priority, org.springframework.graphql.data.ArgumentValue<String> status, java.util.List<String> labels, java.util.List<String> locations, org.springframework.graphql.data.ArgumentValue<ChronicleValidationInput> validation, java.util.List<String> activityChronicleIds, java.util.List<String> eventChronicleIds) {
        this.name = name;
        this.chronicleProducerId = chronicleProducerId;
        this.description = description;
        this.startTime = startTime;
        this.endTime = endTime;
        this.timezone = timezone;
        this.metadata = metadata;
        this.priority = priority;
        this.status = status;
        this.labels = labels;
        this.locations = locations;
        this.validation = validation;
        this.activityChronicleIds = activityChronicleIds;
        this.eventChronicleIds = eventChronicleIds;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getChronicleProducerId() {
        return chronicleProducerId;
    }
    public void setChronicleProducerId(String chronicleProducerId) {
        this.chronicleProducerId = chronicleProducerId;
    }

    public org.springframework.graphql.data.ArgumentValue<String> getDescription() {
        return description;
    }
    public void setDescription(org.springframework.graphql.data.ArgumentValue<String> description) {
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

    public org.springframework.graphql.data.ArgumentValue<String> getTimezone() {
        return timezone;
    }
    public void setTimezone(org.springframework.graphql.data.ArgumentValue<String> timezone) {
        this.timezone = timezone;
    }

    public org.springframework.graphql.data.ArgumentValue<java.lang.Object> getMetadata() {
        return metadata;
    }
    public void setMetadata(org.springframework.graphql.data.ArgumentValue<java.lang.Object> metadata) {
        this.metadata = metadata;
    }

    public org.springframework.graphql.data.ArgumentValue<String> getPriority() {
        return priority;
    }
    public void setPriority(org.springframework.graphql.data.ArgumentValue<String> priority) {
        this.priority = priority;
    }

    public org.springframework.graphql.data.ArgumentValue<String> getStatus() {
        return status;
    }
    public void setStatus(org.springframework.graphql.data.ArgumentValue<String> status) {
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

    public org.springframework.graphql.data.ArgumentValue<ChronicleValidationInput> getValidation() {
        return validation;
    }
    public void setValidation(org.springframework.graphql.data.ArgumentValue<ChronicleValidationInput> validation) {
        this.validation = validation;
    }

    public java.util.List<String> getActivityChronicleIds() {
        return activityChronicleIds;
    }
    public void setActivityChronicleIds(java.util.List<String> activityChronicleIds) {
        this.activityChronicleIds = activityChronicleIds;
    }

    public java.util.List<String> getEventChronicleIds() {
        return eventChronicleIds;
    }
    public void setEventChronicleIds(java.util.List<String> eventChronicleIds) {
        this.eventChronicleIds = eventChronicleIds;
    }



    public static CreateSummaryChronicleInput.Builder builder() {
        return new CreateSummaryChronicleInput.Builder();
    }

    public static class Builder {

        private String name;
        private String chronicleProducerId;
        private org.springframework.graphql.data.ArgumentValue<String> description = org.springframework.graphql.data.ArgumentValue.omitted();
        private java.time.OffsetDateTime startTime;
        private java.time.OffsetDateTime endTime;
        private org.springframework.graphql.data.ArgumentValue<String> timezone = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<java.lang.Object> metadata = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<String> priority = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<String> status = org.springframework.graphql.data.ArgumentValue.omitted();
        private java.util.List<String> labels;
        private java.util.List<String> locations;
        private org.springframework.graphql.data.ArgumentValue<ChronicleValidationInput> validation = org.springframework.graphql.data.ArgumentValue.omitted();
        private java.util.List<String> activityChronicleIds;
        private java.util.List<String> eventChronicleIds;

        public Builder() {
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setChronicleProducerId(String chronicleProducerId) {
            this.chronicleProducerId = chronicleProducerId;
            return this;
        }

        public Builder setDescription(org.springframework.graphql.data.ArgumentValue<String> description) {
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

        public Builder setTimezone(org.springframework.graphql.data.ArgumentValue<String> timezone) {
            this.timezone = timezone;
            return this;
        }

        public Builder setMetadata(org.springframework.graphql.data.ArgumentValue<java.lang.Object> metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder setPriority(org.springframework.graphql.data.ArgumentValue<String> priority) {
            this.priority = priority;
            return this;
        }

        public Builder setStatus(org.springframework.graphql.data.ArgumentValue<String> status) {
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

        public Builder setValidation(org.springframework.graphql.data.ArgumentValue<ChronicleValidationInput> validation) {
            this.validation = validation;
            return this;
        }

        public Builder setActivityChronicleIds(java.util.List<String> activityChronicleIds) {
            this.activityChronicleIds = activityChronicleIds;
            return this;
        }

        public Builder setEventChronicleIds(java.util.List<String> eventChronicleIds) {
            this.eventChronicleIds = eventChronicleIds;
            return this;
        }


        public CreateSummaryChronicleInput build() {
            return new CreateSummaryChronicleInput(name, chronicleProducerId, description, startTime, endTime, timezone, metadata, priority, status, labels, locations, validation, activityChronicleIds, eventChronicleIds);
        }

    }
}
