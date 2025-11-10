package io.worlds.api.model;

import java.util.Objects;

/**
 * This input type is used to create a new [`Track`]({{Types.Track}}).
 */
public class CreateTrackInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private org.springframework.graphql.data.ArgumentValue<String> id = org.springframework.graphql.data.ArgumentValue.omitted();
    @jakarta.validation.constraints.NotNull
    private String dataSourceId;
    @jakarta.validation.constraints.NotNull
    private String tag;
    @jakarta.validation.constraints.NotNull
    private java.time.OffsetDateTime startTime;
    private org.springframework.graphql.data.ArgumentValue<java.time.OffsetDateTime> endTime = org.springframework.graphql.data.ArgumentValue.omitted();
    @jakarta.validation.constraints.NotNull
    private java.util.List<TrackDetectionInput> detections;
    private org.springframework.graphql.data.ArgumentValue<TrackPropertiesInput> properties = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<java.lang.Object> metadata = org.springframework.graphql.data.ArgumentValue.omitted();

    public CreateTrackInput() {
    }

    public CreateTrackInput(org.springframework.graphql.data.ArgumentValue<String> id, String dataSourceId, String tag, java.time.OffsetDateTime startTime, org.springframework.graphql.data.ArgumentValue<java.time.OffsetDateTime> endTime, java.util.List<TrackDetectionInput> detections, org.springframework.graphql.data.ArgumentValue<TrackPropertiesInput> properties, org.springframework.graphql.data.ArgumentValue<java.lang.Object> metadata) {
        this.id = id;
        this.dataSourceId = dataSourceId;
        this.tag = tag;
        this.startTime = startTime;
        this.endTime = endTime;
        this.detections = detections;
        this.properties = properties;
        this.metadata = metadata;
    }

    public org.springframework.graphql.data.ArgumentValue<String> getId() {
        return id;
    }
    public void setId(org.springframework.graphql.data.ArgumentValue<String> id) {
        this.id = id;
    }

    public String getDataSourceId() {
        return dataSourceId;
    }
    public void setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
    }

    public String getTag() {
        return tag;
    }
    public void setTag(String tag) {
        this.tag = tag;
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

    public java.util.List<TrackDetectionInput> getDetections() {
        return detections;
    }
    public void setDetections(java.util.List<TrackDetectionInput> detections) {
        this.detections = detections;
    }

    public org.springframework.graphql.data.ArgumentValue<TrackPropertiesInput> getProperties() {
        return properties;
    }
    public void setProperties(org.springframework.graphql.data.ArgumentValue<TrackPropertiesInput> properties) {
        this.properties = properties;
    }

    public org.springframework.graphql.data.ArgumentValue<java.lang.Object> getMetadata() {
        return metadata;
    }
    public void setMetadata(org.springframework.graphql.data.ArgumentValue<java.lang.Object> metadata) {
        this.metadata = metadata;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final CreateTrackInput that = (CreateTrackInput) obj;
        return Objects.equals(id, that.id)
            && Objects.equals(dataSourceId, that.dataSourceId)
            && Objects.equals(tag, that.tag)
            && Objects.equals(startTime, that.startTime)
            && Objects.equals(endTime, that.endTime)
            && Objects.equals(detections, that.detections)
            && Objects.equals(properties, that.properties)
            && Objects.equals(metadata, that.metadata);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, dataSourceId, tag, startTime, endTime, detections, properties, metadata);
    }


    public static CreateTrackInput.Builder builder() {
        return new CreateTrackInput.Builder();
    }

    public static class Builder {

        private org.springframework.graphql.data.ArgumentValue<String> id = org.springframework.graphql.data.ArgumentValue.omitted();
        private String dataSourceId;
        private String tag;
        private java.time.OffsetDateTime startTime;
        private org.springframework.graphql.data.ArgumentValue<java.time.OffsetDateTime> endTime = org.springframework.graphql.data.ArgumentValue.omitted();
        private java.util.List<TrackDetectionInput> detections;
        private org.springframework.graphql.data.ArgumentValue<TrackPropertiesInput> properties = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<java.lang.Object> metadata = org.springframework.graphql.data.ArgumentValue.omitted();

        public Builder() {
        }

        public Builder setId(org.springframework.graphql.data.ArgumentValue<String> id) {
            this.id = id;
            return this;
        }

        public Builder setDataSourceId(String dataSourceId) {
            this.dataSourceId = dataSourceId;
            return this;
        }

        public Builder setTag(String tag) {
            this.tag = tag;
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

        public Builder setDetections(java.util.List<TrackDetectionInput> detections) {
            this.detections = detections;
            return this;
        }

        public Builder setProperties(org.springframework.graphql.data.ArgumentValue<TrackPropertiesInput> properties) {
            this.properties = properties;
            return this;
        }

        public Builder setMetadata(org.springframework.graphql.data.ArgumentValue<java.lang.Object> metadata) {
            this.metadata = metadata;
            return this;
        }


        public CreateTrackInput build() {
            return new CreateTrackInput(id, dataSourceId, tag, startTime, endTime, detections, properties, metadata);
        }

    }
}
