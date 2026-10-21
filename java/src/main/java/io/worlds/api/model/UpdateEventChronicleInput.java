package io.worlds.api.model;

import java.util.Objects;

/**
 * This input type is used to update an existing `EventChronicle`.
 */
public class UpdateEventChronicleInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private String id;
    private org.springframework.graphql.data.ArgumentValue<String> name = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<String> description = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<java.time.OffsetDateTime> timestamp = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<String> timezone = org.springframework.graphql.data.ArgumentValue.omitted();
    @Deprecated
    private org.springframework.graphql.data.ArgumentValue<java.lang.Object> metadata = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<JSONUpdateInput> metadataUpdate = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<String> priority = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<String> status = org.springframework.graphql.data.ArgumentValue.omitted();
    @Deprecated
    private java.util.List<String> labels;
    private org.springframework.graphql.data.ArgumentValue<StringListUpdateInput> labelsUpdate = org.springframework.graphql.data.ArgumentValue.omitted();
    @Deprecated
    private java.util.List<String> locations;
    private org.springframework.graphql.data.ArgumentValue<StringListUpdateInput> locationsUpdate = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<ChronicleValidationInput> validation = org.springframework.graphql.data.ArgumentValue.omitted();
    private java.util.List<String> activityChronicleIds;
    private org.springframework.graphql.data.ArgumentValue<IDListUpdateInput> siteIdsUpdate = org.springframework.graphql.data.ArgumentValue.omitted();

    public UpdateEventChronicleInput() {
    }

    public UpdateEventChronicleInput(String id, org.springframework.graphql.data.ArgumentValue<String> name, org.springframework.graphql.data.ArgumentValue<String> description, org.springframework.graphql.data.ArgumentValue<java.time.OffsetDateTime> timestamp, org.springframework.graphql.data.ArgumentValue<String> timezone, org.springframework.graphql.data.ArgumentValue<java.lang.Object> metadata, org.springframework.graphql.data.ArgumentValue<JSONUpdateInput> metadataUpdate, org.springframework.graphql.data.ArgumentValue<String> priority, org.springframework.graphql.data.ArgumentValue<String> status, java.util.List<String> labels, org.springframework.graphql.data.ArgumentValue<StringListUpdateInput> labelsUpdate, java.util.List<String> locations, org.springframework.graphql.data.ArgumentValue<StringListUpdateInput> locationsUpdate, org.springframework.graphql.data.ArgumentValue<ChronicleValidationInput> validation, java.util.List<String> activityChronicleIds, org.springframework.graphql.data.ArgumentValue<IDListUpdateInput> siteIdsUpdate) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.timestamp = timestamp;
        this.timezone = timezone;
        this.metadata = metadata;
        this.metadataUpdate = metadataUpdate;
        this.priority = priority;
        this.status = status;
        this.labels = labels;
        this.labelsUpdate = labelsUpdate;
        this.locations = locations;
        this.locationsUpdate = locationsUpdate;
        this.validation = validation;
        this.activityChronicleIds = activityChronicleIds;
        this.siteIdsUpdate = siteIdsUpdate;
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

    @Deprecated
    public org.springframework.graphql.data.ArgumentValue<java.lang.Object> getMetadata() {
        return metadata;
    }
    @Deprecated
    public void setMetadata(org.springframework.graphql.data.ArgumentValue<java.lang.Object> metadata) {
        this.metadata = metadata;
    }

    public org.springframework.graphql.data.ArgumentValue<JSONUpdateInput> getMetadataUpdate() {
        return metadataUpdate;
    }
    public void setMetadataUpdate(org.springframework.graphql.data.ArgumentValue<JSONUpdateInput> metadataUpdate) {
        this.metadataUpdate = metadataUpdate;
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

    @Deprecated
    public java.util.List<String> getLabels() {
        return labels;
    }
    @Deprecated
    public void setLabels(java.util.List<String> labels) {
        this.labels = labels;
    }

    public org.springframework.graphql.data.ArgumentValue<StringListUpdateInput> getLabelsUpdate() {
        return labelsUpdate;
    }
    public void setLabelsUpdate(org.springframework.graphql.data.ArgumentValue<StringListUpdateInput> labelsUpdate) {
        this.labelsUpdate = labelsUpdate;
    }

    @Deprecated
    public java.util.List<String> getLocations() {
        return locations;
    }
    @Deprecated
    public void setLocations(java.util.List<String> locations) {
        this.locations = locations;
    }

    public org.springframework.graphql.data.ArgumentValue<StringListUpdateInput> getLocationsUpdate() {
        return locationsUpdate;
    }
    public void setLocationsUpdate(org.springframework.graphql.data.ArgumentValue<StringListUpdateInput> locationsUpdate) {
        this.locationsUpdate = locationsUpdate;
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

    public org.springframework.graphql.data.ArgumentValue<IDListUpdateInput> getSiteIdsUpdate() {
        return siteIdsUpdate;
    }
    public void setSiteIdsUpdate(org.springframework.graphql.data.ArgumentValue<IDListUpdateInput> siteIdsUpdate) {
        this.siteIdsUpdate = siteIdsUpdate;
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
            && Objects.equals(metadataUpdate, that.metadataUpdate)
            && Objects.equals(priority, that.priority)
            && Objects.equals(status, that.status)
            && Objects.equals(labels, that.labels)
            && Objects.equals(labelsUpdate, that.labelsUpdate)
            && Objects.equals(locations, that.locations)
            && Objects.equals(locationsUpdate, that.locationsUpdate)
            && Objects.equals(validation, that.validation)
            && Objects.equals(activityChronicleIds, that.activityChronicleIds)
            && Objects.equals(siteIdsUpdate, that.siteIdsUpdate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, timestamp, timezone, metadata, metadataUpdate, priority, status, labels, labelsUpdate, locations, locationsUpdate, validation, activityChronicleIds, siteIdsUpdate);
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
        private org.springframework.graphql.data.ArgumentValue<JSONUpdateInput> metadataUpdate = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<String> priority = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<String> status = org.springframework.graphql.data.ArgumentValue.omitted();
        private java.util.List<String> labels;
        private org.springframework.graphql.data.ArgumentValue<StringListUpdateInput> labelsUpdate = org.springframework.graphql.data.ArgumentValue.omitted();
        private java.util.List<String> locations;
        private org.springframework.graphql.data.ArgumentValue<StringListUpdateInput> locationsUpdate = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<ChronicleValidationInput> validation = org.springframework.graphql.data.ArgumentValue.omitted();
        private java.util.List<String> activityChronicleIds;
        private org.springframework.graphql.data.ArgumentValue<IDListUpdateInput> siteIdsUpdate = org.springframework.graphql.data.ArgumentValue.omitted();

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

        @Deprecated
        public Builder setMetadata(org.springframework.graphql.data.ArgumentValue<java.lang.Object> metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder setMetadataUpdate(org.springframework.graphql.data.ArgumentValue<JSONUpdateInput> metadataUpdate) {
            this.metadataUpdate = metadataUpdate;
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

        @Deprecated
        public Builder setLabels(java.util.List<String> labels) {
            this.labels = labels;
            return this;
        }

        public Builder setLabelsUpdate(org.springframework.graphql.data.ArgumentValue<StringListUpdateInput> labelsUpdate) {
            this.labelsUpdate = labelsUpdate;
            return this;
        }

        @Deprecated
        public Builder setLocations(java.util.List<String> locations) {
            this.locations = locations;
            return this;
        }

        public Builder setLocationsUpdate(org.springframework.graphql.data.ArgumentValue<StringListUpdateInput> locationsUpdate) {
            this.locationsUpdate = locationsUpdate;
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

        public Builder setSiteIdsUpdate(org.springframework.graphql.data.ArgumentValue<IDListUpdateInput> siteIdsUpdate) {
            this.siteIdsUpdate = siteIdsUpdate;
            return this;
        }


        public UpdateEventChronicleInput build() {
            return new UpdateEventChronicleInput(id, name, description, timestamp, timezone, metadata, metadataUpdate, priority, status, labels, labelsUpdate, locations, locationsUpdate, validation, activityChronicleIds, siteIdsUpdate);
        }

    }
}
