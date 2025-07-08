package io.worlds.api.model;


/**
 * Input types for SummaryChronicle
 */
public class CreateSummaryChronicleInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private String name;
    private org.springframework.graphql.data.ArgumentValue<String> description = org.springframework.graphql.data.ArgumentValue.omitted();
    @jakarta.validation.constraints.NotNull
    private java.time.OffsetDateTime startTime;
    private org.springframework.graphql.data.ArgumentValue<java.time.OffsetDateTime> endTime = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<GeoJSONPointInput> position = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<String> timezone = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<java.lang.Object> metadata = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<String> priority = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<String> status = org.springframework.graphql.data.ArgumentValue.omitted();
    private java.util.List<String> labels;
    @jakarta.validation.constraints.NotNull
    private String chronicleDocumentProducerId;
    private org.springframework.graphql.data.ArgumentValue<ChronicleDocumentValidationInput> validation = org.springframework.graphql.data.ArgumentValue.omitted();
    private java.util.List<String> imageIds;
    private java.util.List<String> videoIds;
    private java.util.List<String> trackIds;
    private java.util.List<String> siteIds;
    private java.util.List<String> dataSourceIds;
    private java.util.List<String> tagIds;
    private java.util.List<String> pointOfInterestIds;
    @jakarta.validation.constraints.NotNull
    private java.util.List<String> activityChronicleIds;
    @jakarta.validation.constraints.NotNull
    private java.util.List<String> eventChronicleIds;

    public CreateSummaryChronicleInput() {
    }

    public CreateSummaryChronicleInput(String name, org.springframework.graphql.data.ArgumentValue<String> description, java.time.OffsetDateTime startTime, org.springframework.graphql.data.ArgumentValue<java.time.OffsetDateTime> endTime, org.springframework.graphql.data.ArgumentValue<GeoJSONPointInput> position, org.springframework.graphql.data.ArgumentValue<String> timezone, org.springframework.graphql.data.ArgumentValue<java.lang.Object> metadata, org.springframework.graphql.data.ArgumentValue<String> priority, org.springframework.graphql.data.ArgumentValue<String> status, java.util.List<String> labels, String chronicleDocumentProducerId, org.springframework.graphql.data.ArgumentValue<ChronicleDocumentValidationInput> validation, java.util.List<String> imageIds, java.util.List<String> videoIds, java.util.List<String> trackIds, java.util.List<String> siteIds, java.util.List<String> dataSourceIds, java.util.List<String> tagIds, java.util.List<String> pointOfInterestIds, java.util.List<String> activityChronicleIds, java.util.List<String> eventChronicleIds) {
        this.name = name;
        this.description = description;
        this.startTime = startTime;
        this.endTime = endTime;
        this.position = position;
        this.timezone = timezone;
        this.metadata = metadata;
        this.priority = priority;
        this.status = status;
        this.labels = labels;
        this.chronicleDocumentProducerId = chronicleDocumentProducerId;
        this.validation = validation;
        this.imageIds = imageIds;
        this.videoIds = videoIds;
        this.trackIds = trackIds;
        this.siteIds = siteIds;
        this.dataSourceIds = dataSourceIds;
        this.tagIds = tagIds;
        this.pointOfInterestIds = pointOfInterestIds;
        this.activityChronicleIds = activityChronicleIds;
        this.eventChronicleIds = eventChronicleIds;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
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

    public String getChronicleDocumentProducerId() {
        return chronicleDocumentProducerId;
    }
    public void setChronicleDocumentProducerId(String chronicleDocumentProducerId) {
        this.chronicleDocumentProducerId = chronicleDocumentProducerId;
    }

    public org.springframework.graphql.data.ArgumentValue<ChronicleDocumentValidationInput> getValidation() {
        return validation;
    }
    public void setValidation(org.springframework.graphql.data.ArgumentValue<ChronicleDocumentValidationInput> validation) {
        this.validation = validation;
    }

    public java.util.List<String> getImageIds() {
        return imageIds;
    }
    public void setImageIds(java.util.List<String> imageIds) {
        this.imageIds = imageIds;
    }

    public java.util.List<String> getVideoIds() {
        return videoIds;
    }
    public void setVideoIds(java.util.List<String> videoIds) {
        this.videoIds = videoIds;
    }

    public java.util.List<String> getTrackIds() {
        return trackIds;
    }
    public void setTrackIds(java.util.List<String> trackIds) {
        this.trackIds = trackIds;
    }

    public java.util.List<String> getSiteIds() {
        return siteIds;
    }
    public void setSiteIds(java.util.List<String> siteIds) {
        this.siteIds = siteIds;
    }

    public java.util.List<String> getDataSourceIds() {
        return dataSourceIds;
    }
    public void setDataSourceIds(java.util.List<String> dataSourceIds) {
        this.dataSourceIds = dataSourceIds;
    }

    public java.util.List<String> getTagIds() {
        return tagIds;
    }
    public void setTagIds(java.util.List<String> tagIds) {
        this.tagIds = tagIds;
    }

    public java.util.List<String> getPointOfInterestIds() {
        return pointOfInterestIds;
    }
    public void setPointOfInterestIds(java.util.List<String> pointOfInterestIds) {
        this.pointOfInterestIds = pointOfInterestIds;
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
        private org.springframework.graphql.data.ArgumentValue<String> description = org.springframework.graphql.data.ArgumentValue.omitted();
        private java.time.OffsetDateTime startTime;
        private org.springframework.graphql.data.ArgumentValue<java.time.OffsetDateTime> endTime = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<GeoJSONPointInput> position = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<String> timezone = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<java.lang.Object> metadata = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<String> priority = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<String> status = org.springframework.graphql.data.ArgumentValue.omitted();
        private java.util.List<String> labels;
        private String chronicleDocumentProducerId;
        private org.springframework.graphql.data.ArgumentValue<ChronicleDocumentValidationInput> validation = org.springframework.graphql.data.ArgumentValue.omitted();
        private java.util.List<String> imageIds;
        private java.util.List<String> videoIds;
        private java.util.List<String> trackIds;
        private java.util.List<String> siteIds;
        private java.util.List<String> dataSourceIds;
        private java.util.List<String> tagIds;
        private java.util.List<String> pointOfInterestIds;
        private java.util.List<String> activityChronicleIds;
        private java.util.List<String> eventChronicleIds;

        public Builder() {
        }

        public Builder setName(String name) {
            this.name = name;
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

        public Builder setChronicleDocumentProducerId(String chronicleDocumentProducerId) {
            this.chronicleDocumentProducerId = chronicleDocumentProducerId;
            return this;
        }

        public Builder setValidation(org.springframework.graphql.data.ArgumentValue<ChronicleDocumentValidationInput> validation) {
            this.validation = validation;
            return this;
        }

        public Builder setImageIds(java.util.List<String> imageIds) {
            this.imageIds = imageIds;
            return this;
        }

        public Builder setVideoIds(java.util.List<String> videoIds) {
            this.videoIds = videoIds;
            return this;
        }

        public Builder setTrackIds(java.util.List<String> trackIds) {
            this.trackIds = trackIds;
            return this;
        }

        public Builder setSiteIds(java.util.List<String> siteIds) {
            this.siteIds = siteIds;
            return this;
        }

        public Builder setDataSourceIds(java.util.List<String> dataSourceIds) {
            this.dataSourceIds = dataSourceIds;
            return this;
        }

        public Builder setTagIds(java.util.List<String> tagIds) {
            this.tagIds = tagIds;
            return this;
        }

        public Builder setPointOfInterestIds(java.util.List<String> pointOfInterestIds) {
            this.pointOfInterestIds = pointOfInterestIds;
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
            return new CreateSummaryChronicleInput(name, description, startTime, endTime, position, timezone, metadata, priority, status, labels, chronicleDocumentProducerId, validation, imageIds, videoIds, trackIds, siteIds, dataSourceIds, tagIds, pointOfInterestIds, activityChronicleIds, eventChronicleIds);
        }

    }
}
