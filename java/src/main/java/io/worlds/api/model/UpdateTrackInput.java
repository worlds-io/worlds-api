package io.worlds.api.model;

import java.util.Objects;

/**
 * This input type is used to update an existing [`Track`]({{Types.Track}}).
 */
public class UpdateTrackInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private String id;
    private org.springframework.graphql.data.ArgumentValue<String> tag = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<java.time.OffsetDateTime> startTime = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<java.time.OffsetDateTime> endTime = org.springframework.graphql.data.ArgumentValue.omitted();
    private java.util.List<TrackDetectionInput> detections;
    private org.springframework.graphql.data.ArgumentValue<TrackPropertiesInput> properties = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<java.lang.Object> metadata = org.springframework.graphql.data.ArgumentValue.omitted();

    public UpdateTrackInput() {
    }

    public UpdateTrackInput(String id, org.springframework.graphql.data.ArgumentValue<String> tag, org.springframework.graphql.data.ArgumentValue<java.time.OffsetDateTime> startTime, org.springframework.graphql.data.ArgumentValue<java.time.OffsetDateTime> endTime, java.util.List<TrackDetectionInput> detections, org.springframework.graphql.data.ArgumentValue<TrackPropertiesInput> properties, org.springframework.graphql.data.ArgumentValue<java.lang.Object> metadata) {
        this.id = id;
        this.tag = tag;
        this.startTime = startTime;
        this.endTime = endTime;
        this.detections = detections;
        this.properties = properties;
        this.metadata = metadata;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public org.springframework.graphql.data.ArgumentValue<String> getTag() {
        return tag;
    }
    public void setTag(org.springframework.graphql.data.ArgumentValue<String> tag) {
        this.tag = tag;
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
        final UpdateTrackInput that = (UpdateTrackInput) obj;
        return Objects.equals(id, that.id)
            && Objects.equals(tag, that.tag)
            && Objects.equals(startTime, that.startTime)
            && Objects.equals(endTime, that.endTime)
            && Objects.equals(detections, that.detections)
            && Objects.equals(properties, that.properties)
            && Objects.equals(metadata, that.metadata);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, tag, startTime, endTime, detections, properties, metadata);
    }


    public static UpdateTrackInput.Builder builder() {
        return new UpdateTrackInput.Builder();
    }

    public static class Builder {

        private String id;
        private org.springframework.graphql.data.ArgumentValue<String> tag = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<java.time.OffsetDateTime> startTime = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<java.time.OffsetDateTime> endTime = org.springframework.graphql.data.ArgumentValue.omitted();
        private java.util.List<TrackDetectionInput> detections;
        private org.springframework.graphql.data.ArgumentValue<TrackPropertiesInput> properties = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<java.lang.Object> metadata = org.springframework.graphql.data.ArgumentValue.omitted();

        public Builder() {
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setTag(org.springframework.graphql.data.ArgumentValue<String> tag) {
            this.tag = tag;
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


        public UpdateTrackInput build() {
            return new UpdateTrackInput(id, tag, startTime, endTime, detections, properties, metadata);
        }

    }
}
