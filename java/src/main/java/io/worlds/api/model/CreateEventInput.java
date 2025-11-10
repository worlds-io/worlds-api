package io.worlds.api.model;

import java.util.Objects;

/**
 * This input type is used to create a new [`Event`]({{Types.Event}}) for a custom event producer. See [`EventProducer`]({{Types.EventProducer}}) for more details.
 */
public class CreateEventInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private org.springframework.graphql.data.ArgumentValue<String> id = org.springframework.graphql.data.ArgumentValue.omitted();
    @jakarta.validation.constraints.NotNull
    private String eventProducerId;
    @jakarta.validation.constraints.NotNull
    private String type;
    private org.springframework.graphql.data.ArgumentValue<String> subType = org.springframework.graphql.data.ArgumentValue.omitted();
    @jakarta.validation.constraints.NotNull
    private java.time.OffsetDateTime startTime;
    private org.springframework.graphql.data.ArgumentValue<java.time.OffsetDateTime> endTime = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<GeoJSONPointInput> position = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<String> timezone = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<java.lang.Object> metadata = org.springframework.graphql.data.ArgumentValue.omitted();
    private java.util.List<CreateSnapshotInput> snapshots;
    private java.util.List<UploadImageInput> uploads;
    private java.util.List<String> imageIds;
    private java.util.List<CreateClipInput> clips;
    private java.util.List<String> trackIds;
    private org.springframework.graphql.data.ArgumentValue<EventPropertiesInput> properties = org.springframework.graphql.data.ArgumentValue.omitted();
    private boolean draft = false;
    private org.springframework.graphql.data.ArgumentValue<EventValidationInput> validation = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<String> priority = org.springframework.graphql.data.ArgumentValue.omitted();

    public CreateEventInput() {
    }

    public CreateEventInput(org.springframework.graphql.data.ArgumentValue<String> id, String eventProducerId, String type, org.springframework.graphql.data.ArgumentValue<String> subType, java.time.OffsetDateTime startTime, org.springframework.graphql.data.ArgumentValue<java.time.OffsetDateTime> endTime, org.springframework.graphql.data.ArgumentValue<GeoJSONPointInput> position, org.springframework.graphql.data.ArgumentValue<String> timezone, org.springframework.graphql.data.ArgumentValue<java.lang.Object> metadata, java.util.List<CreateSnapshotInput> snapshots, java.util.List<UploadImageInput> uploads, java.util.List<String> imageIds, java.util.List<CreateClipInput> clips, java.util.List<String> trackIds, org.springframework.graphql.data.ArgumentValue<EventPropertiesInput> properties, boolean draft, org.springframework.graphql.data.ArgumentValue<EventValidationInput> validation, org.springframework.graphql.data.ArgumentValue<String> priority) {
        this.id = id;
        this.eventProducerId = eventProducerId;
        this.type = type;
        this.subType = subType;
        this.startTime = startTime;
        this.endTime = endTime;
        this.position = position;
        this.timezone = timezone;
        this.metadata = metadata;
        this.snapshots = snapshots;
        this.uploads = uploads;
        this.imageIds = imageIds;
        this.clips = clips;
        this.trackIds = trackIds;
        this.properties = properties;
        this.draft = draft;
        this.validation = validation;
        this.priority = priority;
    }

    public org.springframework.graphql.data.ArgumentValue<String> getId() {
        return id;
    }
    public void setId(org.springframework.graphql.data.ArgumentValue<String> id) {
        this.id = id;
    }

    public String getEventProducerId() {
        return eventProducerId;
    }
    public void setEventProducerId(String eventProducerId) {
        this.eventProducerId = eventProducerId;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public org.springframework.graphql.data.ArgumentValue<String> getSubType() {
        return subType;
    }
    public void setSubType(org.springframework.graphql.data.ArgumentValue<String> subType) {
        this.subType = subType;
    }

    public java.time.OffsetDateTime getStartTime() {
        return startTime;
    }
    public void setStartTime(java.time.OffsetDateTime startTime) {
        this.startTime = startTime;
    }

    public org.springframework.graphql.data.ArgumentValue<java.time.OffsetDateTime> getEndTime() {
        return endTime;
    }
    public void setEndTime(org.springframework.graphql.data.ArgumentValue<java.time.OffsetDateTime> endTime) {
        this.endTime = endTime;
    }

    public org.springframework.graphql.data.ArgumentValue<GeoJSONPointInput> getPosition() {
        return position;
    }
    public void setPosition(org.springframework.graphql.data.ArgumentValue<GeoJSONPointInput> position) {
        this.position = position;
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

    public java.util.List<CreateSnapshotInput> getSnapshots() {
        return snapshots;
    }
    public void setSnapshots(java.util.List<CreateSnapshotInput> snapshots) {
        this.snapshots = snapshots;
    }

    public java.util.List<UploadImageInput> getUploads() {
        return uploads;
    }
    public void setUploads(java.util.List<UploadImageInput> uploads) {
        this.uploads = uploads;
    }

    public java.util.List<String> getImageIds() {
        return imageIds;
    }
    public void setImageIds(java.util.List<String> imageIds) {
        this.imageIds = imageIds;
    }

    public java.util.List<CreateClipInput> getClips() {
        return clips;
    }
    public void setClips(java.util.List<CreateClipInput> clips) {
        this.clips = clips;
    }

    public java.util.List<String> getTrackIds() {
        return trackIds;
    }
    public void setTrackIds(java.util.List<String> trackIds) {
        this.trackIds = trackIds;
    }

    public org.springframework.graphql.data.ArgumentValue<EventPropertiesInput> getProperties() {
        return properties;
    }
    public void setProperties(org.springframework.graphql.data.ArgumentValue<EventPropertiesInput> properties) {
        this.properties = properties;
    }

    public boolean getDraft() {
        return draft;
    }
    public void setDraft(boolean draft) {
        this.draft = draft;
    }

    public org.springframework.graphql.data.ArgumentValue<EventValidationInput> getValidation() {
        return validation;
    }
    public void setValidation(org.springframework.graphql.data.ArgumentValue<EventValidationInput> validation) {
        this.validation = validation;
    }

    public org.springframework.graphql.data.ArgumentValue<String> getPriority() {
        return priority;
    }
    public void setPriority(org.springframework.graphql.data.ArgumentValue<String> priority) {
        this.priority = priority;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final CreateEventInput that = (CreateEventInput) obj;
        return Objects.equals(id, that.id)
            && Objects.equals(eventProducerId, that.eventProducerId)
            && Objects.equals(type, that.type)
            && Objects.equals(subType, that.subType)
            && Objects.equals(startTime, that.startTime)
            && Objects.equals(endTime, that.endTime)
            && Objects.equals(position, that.position)
            && Objects.equals(timezone, that.timezone)
            && Objects.equals(metadata, that.metadata)
            && Objects.equals(snapshots, that.snapshots)
            && Objects.equals(uploads, that.uploads)
            && Objects.equals(imageIds, that.imageIds)
            && Objects.equals(clips, that.clips)
            && Objects.equals(trackIds, that.trackIds)
            && Objects.equals(properties, that.properties)
            && Objects.equals(draft, that.draft)
            && Objects.equals(validation, that.validation)
            && Objects.equals(priority, that.priority);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, eventProducerId, type, subType, startTime, endTime, position, timezone, metadata, snapshots, uploads, imageIds, clips, trackIds, properties, draft, validation, priority);
    }


    public static CreateEventInput.Builder builder() {
        return new CreateEventInput.Builder();
    }

    public static class Builder {

        private org.springframework.graphql.data.ArgumentValue<String> id = org.springframework.graphql.data.ArgumentValue.omitted();
        private String eventProducerId;
        private String type;
        private org.springframework.graphql.data.ArgumentValue<String> subType = org.springframework.graphql.data.ArgumentValue.omitted();
        private java.time.OffsetDateTime startTime;
        private org.springframework.graphql.data.ArgumentValue<java.time.OffsetDateTime> endTime = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<GeoJSONPointInput> position = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<String> timezone = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<java.lang.Object> metadata = org.springframework.graphql.data.ArgumentValue.omitted();
        private java.util.List<CreateSnapshotInput> snapshots;
        private java.util.List<UploadImageInput> uploads;
        private java.util.List<String> imageIds;
        private java.util.List<CreateClipInput> clips;
        private java.util.List<String> trackIds;
        private org.springframework.graphql.data.ArgumentValue<EventPropertiesInput> properties = org.springframework.graphql.data.ArgumentValue.omitted();
        private boolean draft = false;
        private org.springframework.graphql.data.ArgumentValue<EventValidationInput> validation = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<String> priority = org.springframework.graphql.data.ArgumentValue.omitted();

        public Builder() {
        }

        public Builder setId(org.springframework.graphql.data.ArgumentValue<String> id) {
            this.id = id;
            return this;
        }

        public Builder setEventProducerId(String eventProducerId) {
            this.eventProducerId = eventProducerId;
            return this;
        }

        public Builder setType(String type) {
            this.type = type;
            return this;
        }

        public Builder setSubType(org.springframework.graphql.data.ArgumentValue<String> subType) {
            this.subType = subType;
            return this;
        }

        public Builder setStartTime(java.time.OffsetDateTime startTime) {
            this.startTime = startTime;
            return this;
        }

        public Builder setEndTime(org.springframework.graphql.data.ArgumentValue<java.time.OffsetDateTime> endTime) {
            this.endTime = endTime;
            return this;
        }

        public Builder setPosition(org.springframework.graphql.data.ArgumentValue<GeoJSONPointInput> position) {
            this.position = position;
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

        public Builder setSnapshots(java.util.List<CreateSnapshotInput> snapshots) {
            this.snapshots = snapshots;
            return this;
        }

        public Builder setUploads(java.util.List<UploadImageInput> uploads) {
            this.uploads = uploads;
            return this;
        }

        public Builder setImageIds(java.util.List<String> imageIds) {
            this.imageIds = imageIds;
            return this;
        }

        public Builder setClips(java.util.List<CreateClipInput> clips) {
            this.clips = clips;
            return this;
        }

        public Builder setTrackIds(java.util.List<String> trackIds) {
            this.trackIds = trackIds;
            return this;
        }

        public Builder setProperties(org.springframework.graphql.data.ArgumentValue<EventPropertiesInput> properties) {
            this.properties = properties;
            return this;
        }

        public Builder setDraft(boolean draft) {
            this.draft = draft;
            return this;
        }

        public Builder setValidation(org.springframework.graphql.data.ArgumentValue<EventValidationInput> validation) {
            this.validation = validation;
            return this;
        }

        public Builder setPriority(org.springframework.graphql.data.ArgumentValue<String> priority) {
            this.priority = priority;
            return this;
        }


        public CreateEventInput build() {
            return new CreateEventInput(id, eventProducerId, type, subType, startTime, endTime, position, timezone, metadata, snapshots, uploads, imageIds, clips, trackIds, properties, draft, validation, priority);
        }

    }
}
