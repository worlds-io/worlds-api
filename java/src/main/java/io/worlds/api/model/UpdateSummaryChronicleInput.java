package io.worlds.api.model;

import java.util.Objects;

/**
 * This input type is used to update an existing `SummaryChronicle`.
 */
public class UpdateSummaryChronicleInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private String id;
    private org.springframework.graphql.data.ArgumentValue<String> name = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<String> description = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<java.time.OffsetDateTime> startTime = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<java.time.OffsetDateTime> endTime = org.springframework.graphql.data.ArgumentValue.omitted();
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
    @Deprecated
    private java.util.List<String> activityChronicleIds;
    private org.springframework.graphql.data.ArgumentValue<IDListUpdateInput> activityChronicleIdsUpdate = org.springframework.graphql.data.ArgumentValue.omitted();
    @Deprecated
    private java.util.List<String> eventChronicleIds;
    private org.springframework.graphql.data.ArgumentValue<IDListUpdateInput> eventChronicleIdsUpdate = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<IDListUpdateInput> siteIdsUpdate = org.springframework.graphql.data.ArgumentValue.omitted();

    public UpdateSummaryChronicleInput() {
    }

    public UpdateSummaryChronicleInput(String id, org.springframework.graphql.data.ArgumentValue<String> name, org.springframework.graphql.data.ArgumentValue<String> description, org.springframework.graphql.data.ArgumentValue<java.time.OffsetDateTime> startTime, org.springframework.graphql.data.ArgumentValue<java.time.OffsetDateTime> endTime, org.springframework.graphql.data.ArgumentValue<String> timezone, org.springframework.graphql.data.ArgumentValue<java.lang.Object> metadata, org.springframework.graphql.data.ArgumentValue<JSONUpdateInput> metadataUpdate, org.springframework.graphql.data.ArgumentValue<String> priority, org.springframework.graphql.data.ArgumentValue<String> status, java.util.List<String> labels, org.springframework.graphql.data.ArgumentValue<StringListUpdateInput> labelsUpdate, java.util.List<String> locations, org.springframework.graphql.data.ArgumentValue<StringListUpdateInput> locationsUpdate, org.springframework.graphql.data.ArgumentValue<ChronicleValidationInput> validation, java.util.List<String> activityChronicleIds, org.springframework.graphql.data.ArgumentValue<IDListUpdateInput> activityChronicleIdsUpdate, java.util.List<String> eventChronicleIds, org.springframework.graphql.data.ArgumentValue<IDListUpdateInput> eventChronicleIdsUpdate, org.springframework.graphql.data.ArgumentValue<IDListUpdateInput> siteIdsUpdate) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.startTime = startTime;
        this.endTime = endTime;
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
        this.activityChronicleIdsUpdate = activityChronicleIdsUpdate;
        this.eventChronicleIds = eventChronicleIds;
        this.eventChronicleIdsUpdate = eventChronicleIdsUpdate;
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

    public org.springframework.graphql.data.ArgumentValue<java.time.OffsetDateTime> getStartTime() {
        return startTime;
    }
    public void setStartTime(org.springframework.graphql.data.ArgumentValue<java.time.OffsetDateTime> startTime) {
        this.startTime = startTime;
    }

    public org.springframework.graphql.data.ArgumentValue<java.time.OffsetDateTime> getEndTime() {
        return endTime;
    }
    public void setEndTime(org.springframework.graphql.data.ArgumentValue<java.time.OffsetDateTime> endTime) {
        this.endTime = endTime;
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

    @Deprecated
    public java.util.List<String> getActivityChronicleIds() {
        return activityChronicleIds;
    }
    @Deprecated
    public void setActivityChronicleIds(java.util.List<String> activityChronicleIds) {
        this.activityChronicleIds = activityChronicleIds;
    }

    public org.springframework.graphql.data.ArgumentValue<IDListUpdateInput> getActivityChronicleIdsUpdate() {
        return activityChronicleIdsUpdate;
    }
    public void setActivityChronicleIdsUpdate(org.springframework.graphql.data.ArgumentValue<IDListUpdateInput> activityChronicleIdsUpdate) {
        this.activityChronicleIdsUpdate = activityChronicleIdsUpdate;
    }

    @Deprecated
    public java.util.List<String> getEventChronicleIds() {
        return eventChronicleIds;
    }
    @Deprecated
    public void setEventChronicleIds(java.util.List<String> eventChronicleIds) {
        this.eventChronicleIds = eventChronicleIds;
    }

    public org.springframework.graphql.data.ArgumentValue<IDListUpdateInput> getEventChronicleIdsUpdate() {
        return eventChronicleIdsUpdate;
    }
    public void setEventChronicleIdsUpdate(org.springframework.graphql.data.ArgumentValue<IDListUpdateInput> eventChronicleIdsUpdate) {
        this.eventChronicleIdsUpdate = eventChronicleIdsUpdate;
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
        final UpdateSummaryChronicleInput that = (UpdateSummaryChronicleInput) obj;
        return Objects.equals(id, that.id)
            && Objects.equals(name, that.name)
            && Objects.equals(description, that.description)
            && Objects.equals(startTime, that.startTime)
            && Objects.equals(endTime, that.endTime)
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
            && Objects.equals(activityChronicleIdsUpdate, that.activityChronicleIdsUpdate)
            && Objects.equals(eventChronicleIds, that.eventChronicleIds)
            && Objects.equals(eventChronicleIdsUpdate, that.eventChronicleIdsUpdate)
            && Objects.equals(siteIdsUpdate, that.siteIdsUpdate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, startTime, endTime, timezone, metadata, metadataUpdate, priority, status, labels, labelsUpdate, locations, locationsUpdate, validation, activityChronicleIds, activityChronicleIdsUpdate, eventChronicleIds, eventChronicleIdsUpdate, siteIdsUpdate);
    }


    public static UpdateSummaryChronicleInput.Builder builder() {
        return new UpdateSummaryChronicleInput.Builder();
    }

    public static class Builder {

        private String id;
        private org.springframework.graphql.data.ArgumentValue<String> name = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<String> description = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<java.time.OffsetDateTime> startTime = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<java.time.OffsetDateTime> endTime = org.springframework.graphql.data.ArgumentValue.omitted();
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
        private org.springframework.graphql.data.ArgumentValue<IDListUpdateInput> activityChronicleIdsUpdate = org.springframework.graphql.data.ArgumentValue.omitted();
        private java.util.List<String> eventChronicleIds;
        private org.springframework.graphql.data.ArgumentValue<IDListUpdateInput> eventChronicleIdsUpdate = org.springframework.graphql.data.ArgumentValue.omitted();
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

        public Builder setStartTime(org.springframework.graphql.data.ArgumentValue<java.time.OffsetDateTime> startTime) {
            this.startTime = startTime;
            return this;
        }

        public Builder setEndTime(org.springframework.graphql.data.ArgumentValue<java.time.OffsetDateTime> endTime) {
            this.endTime = endTime;
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

        @Deprecated
        public Builder setActivityChronicleIds(java.util.List<String> activityChronicleIds) {
            this.activityChronicleIds = activityChronicleIds;
            return this;
        }

        public Builder setActivityChronicleIdsUpdate(org.springframework.graphql.data.ArgumentValue<IDListUpdateInput> activityChronicleIdsUpdate) {
            this.activityChronicleIdsUpdate = activityChronicleIdsUpdate;
            return this;
        }

        @Deprecated
        public Builder setEventChronicleIds(java.util.List<String> eventChronicleIds) {
            this.eventChronicleIds = eventChronicleIds;
            return this;
        }

        public Builder setEventChronicleIdsUpdate(org.springframework.graphql.data.ArgumentValue<IDListUpdateInput> eventChronicleIdsUpdate) {
            this.eventChronicleIdsUpdate = eventChronicleIdsUpdate;
            return this;
        }

        public Builder setSiteIdsUpdate(org.springframework.graphql.data.ArgumentValue<IDListUpdateInput> siteIdsUpdate) {
            this.siteIdsUpdate = siteIdsUpdate;
            return this;
        }


        public UpdateSummaryChronicleInput build() {
            return new UpdateSummaryChronicleInput(id, name, description, startTime, endTime, timezone, metadata, metadataUpdate, priority, status, labels, labelsUpdate, locations, locationsUpdate, validation, activityChronicleIds, activityChronicleIdsUpdate, eventChronicleIds, eventChronicleIdsUpdate, siteIdsUpdate);
        }

    }
}
