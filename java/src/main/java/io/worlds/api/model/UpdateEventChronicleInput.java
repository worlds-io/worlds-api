package io.worlds.api.model;

import java.util.Objects;

/**
 * This input type is used to update an existing [`EventChronicle`]({{Types.EventChronicle}}).
 */
public class UpdateEventChronicleInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private String id;
    private org.springframework.graphql.data.ArgumentValue<String> name = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<String> description = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<java.time.OffsetDateTime> timestamp = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<String> timezone = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<java.lang.Object> metadata = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<String> priority = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<String> status = org.springframework.graphql.data.ArgumentValue.omitted();
    private java.util.List<String> labels;
    private java.util.List<String> locations;
    private org.springframework.graphql.data.ArgumentValue<ChronicleValidationInput> validation = org.springframework.graphql.data.ArgumentValue.omitted();
    private java.util.List<String> activityChronicleIds;

    public UpdateEventChronicleInput() {
    }

    public UpdateEventChronicleInput(String id, org.springframework.graphql.data.ArgumentValue<String> name, org.springframework.graphql.data.ArgumentValue<String> description, org.springframework.graphql.data.ArgumentValue<java.time.OffsetDateTime> timestamp, org.springframework.graphql.data.ArgumentValue<String> timezone, org.springframework.graphql.data.ArgumentValue<java.lang.Object> metadata, org.springframework.graphql.data.ArgumentValue<String> priority, org.springframework.graphql.data.ArgumentValue<String> status, java.util.List<String> labels, java.util.List<String> locations, org.springframework.graphql.data.ArgumentValue<ChronicleValidationInput> validation, java.util.List<String> activityChronicleIds) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.timestamp = timestamp;
        this.timezone = timezone;
        this.metadata = metadata;
        this.priority = priority;
        this.status = status;
        this.labels = labels;
        this.locations = locations;
        this.validation = validation;
        this.activityChronicleIds = activityChronicleIds;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public org.springframework.graphql.data.ArgumentValue<String> getName() {
        return name;
    }
    public void setName(org.springframework.graphql.data.ArgumentValue<String> name) {
        this.name = name;
    }

    public org.springframework.graphql.data.ArgumentValue<String> getDescription() {
        return description;
    }
    public void setDescription(org.springframework.graphql.data.ArgumentValue<String> description) {
        this.description = description;
    }

    public org.springframework.graphql.data.ArgumentValue<java.time.OffsetDateTime> getTimestamp() {
        return timestamp;
    }
    public void setTimestamp(org.springframework.graphql.data.ArgumentValue<java.time.OffsetDateTime> timestamp) {
        this.timestamp = timestamp;
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

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final UpdateEventChronicleInput that = (UpdateEventChronicleInput) obj;
        return Objects.equals(id, that.id)
            && Objects.equals(name, that.name)
            && Objects.equals(description, that.description)
            && Objects.equals(timestamp, that.timestamp)
            && Objects.equals(timezone, that.timezone)
            && Objects.equals(metadata, that.metadata)
            && Objects.equals(priority, that.priority)
            && Objects.equals(status, that.status)
            && Objects.equals(labels, that.labels)
            && Objects.equals(locations, that.locations)
            && Objects.equals(validation, that.validation)
            && Objects.equals(activityChronicleIds, that.activityChronicleIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, timestamp, timezone, metadata, priority, status, labels, locations, validation, activityChronicleIds);
    }


    public static UpdateEventChronicleInput.Builder builder() {
        return new UpdateEventChronicleInput.Builder();
    }

    public static class Builder {

        private String id;
        private org.springframework.graphql.data.ArgumentValue<String> name = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<String> description = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<java.time.OffsetDateTime> timestamp = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<String> timezone = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<java.lang.Object> metadata = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<String> priority = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<String> status = org.springframework.graphql.data.ArgumentValue.omitted();
        private java.util.List<String> labels;
        private java.util.List<String> locations;
        private org.springframework.graphql.data.ArgumentValue<ChronicleValidationInput> validation = org.springframework.graphql.data.ArgumentValue.omitted();
        private java.util.List<String> activityChronicleIds;

        public Builder() {
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setName(org.springframework.graphql.data.ArgumentValue<String> name) {
            this.name = name;
            return this;
        }

        public Builder setDescription(org.springframework.graphql.data.ArgumentValue<String> description) {
            this.description = description;
            return this;
        }

        public Builder setTimestamp(org.springframework.graphql.data.ArgumentValue<java.time.OffsetDateTime> timestamp) {
            this.timestamp = timestamp;
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


        public UpdateEventChronicleInput build() {
            return new UpdateEventChronicleInput(id, name, description, timestamp, timezone, metadata, priority, status, labels, locations, validation, activityChronicleIds);
        }

    }
}
