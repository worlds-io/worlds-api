package io.worlds.api.model;

import java.util.Objects;

/**
 * This type is used to create a new [`Detection`]({{Types.Detection}}) when [creating]({{Types.CreateTrackInput}}) or [updating]({{Types.UpdateTrackInput}}) a [`Track`]({{Types.Track}})
 */
public class TrackDetectionInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private java.time.OffsetDateTime timestamp;
    private org.springframework.graphql.data.ArgumentValue<GeoJSONPointInput> position = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<GeoJSONPolygonInput> polygon = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<Double> direction = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<java.lang.Object> metadata = org.springframework.graphql.data.ArgumentValue.omitted();

    public TrackDetectionInput() {
    }

    public TrackDetectionInput(java.time.OffsetDateTime timestamp, org.springframework.graphql.data.ArgumentValue<GeoJSONPointInput> position, org.springframework.graphql.data.ArgumentValue<GeoJSONPolygonInput> polygon, org.springframework.graphql.data.ArgumentValue<Double> direction, org.springframework.graphql.data.ArgumentValue<java.lang.Object> metadata) {
        this.timestamp = timestamp;
        this.position = position;
        this.polygon = polygon;
        this.direction = direction;
        this.metadata = metadata;
    }

    public java.time.OffsetDateTime getTimestamp() {
        return timestamp;
    }
    public void setTimestamp(java.time.OffsetDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public org.springframework.graphql.data.ArgumentValue<GeoJSONPointInput> getPosition() {
        return position;
    }
    public void setPosition(org.springframework.graphql.data.ArgumentValue<GeoJSONPointInput> position) {
        this.position = position;
    }

    public org.springframework.graphql.data.ArgumentValue<GeoJSONPolygonInput> getPolygon() {
        return polygon;
    }
    public void setPolygon(org.springframework.graphql.data.ArgumentValue<GeoJSONPolygonInput> polygon) {
        this.polygon = polygon;
    }

    public org.springframework.graphql.data.ArgumentValue<Double> getDirection() {
        return direction;
    }
    public void setDirection(org.springframework.graphql.data.ArgumentValue<Double> direction) {
        this.direction = direction;
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
        final TrackDetectionInput that = (TrackDetectionInput) obj;
        return Objects.equals(timestamp, that.timestamp)
            && Objects.equals(position, that.position)
            && Objects.equals(polygon, that.polygon)
            && Objects.equals(direction, that.direction)
            && Objects.equals(metadata, that.metadata);
    }

    @Override
    public int hashCode() {
        return Objects.hash(timestamp, position, polygon, direction, metadata);
    }


    public static TrackDetectionInput.Builder builder() {
        return new TrackDetectionInput.Builder();
    }

    public static class Builder {

        private java.time.OffsetDateTime timestamp;
        private org.springframework.graphql.data.ArgumentValue<GeoJSONPointInput> position = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<GeoJSONPolygonInput> polygon = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<Double> direction = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<java.lang.Object> metadata = org.springframework.graphql.data.ArgumentValue.omitted();

        public Builder() {
        }

        public Builder setTimestamp(java.time.OffsetDateTime timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        public Builder setPosition(org.springframework.graphql.data.ArgumentValue<GeoJSONPointInput> position) {
            this.position = position;
            return this;
        }

        public Builder setPolygon(org.springframework.graphql.data.ArgumentValue<GeoJSONPolygonInput> polygon) {
            this.polygon = polygon;
            return this;
        }

        public Builder setDirection(org.springframework.graphql.data.ArgumentValue<Double> direction) {
            this.direction = direction;
            return this;
        }

        public Builder setMetadata(org.springframework.graphql.data.ArgumentValue<java.lang.Object> metadata) {
            this.metadata = metadata;
            return this;
        }


        public TrackDetectionInput build() {
            return new TrackDetectionInput(timestamp, position, polygon, direction, metadata);
        }

    }
}
