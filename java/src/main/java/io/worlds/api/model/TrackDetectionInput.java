package io.worlds.api.model;


public class TrackDetectionInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private java.time.OffsetDateTime timestamp;
    private org.springframework.graphql.data.ArgumentValue<GeoJSONPointInput> position = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<GeoJSONPolygonInput> polygon = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<java.lang.Object> metadata = org.springframework.graphql.data.ArgumentValue.omitted();

    public TrackDetectionInput() {
    }

    public TrackDetectionInput(java.time.OffsetDateTime timestamp, org.springframework.graphql.data.ArgumentValue<GeoJSONPointInput> position, org.springframework.graphql.data.ArgumentValue<GeoJSONPolygonInput> polygon, org.springframework.graphql.data.ArgumentValue<java.lang.Object> metadata) {
        this.timestamp = timestamp;
        this.position = position;
        this.polygon = polygon;
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

    public org.springframework.graphql.data.ArgumentValue<java.lang.Object> getMetadata() {
        return metadata;
    }
    public void setMetadata(org.springframework.graphql.data.ArgumentValue<java.lang.Object> metadata) {
        this.metadata = metadata;
    }



    public static TrackDetectionInput.Builder builder() {
        return new TrackDetectionInput.Builder();
    }

    public static class Builder {

        private java.time.OffsetDateTime timestamp;
        private org.springframework.graphql.data.ArgumentValue<GeoJSONPointInput> position = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<GeoJSONPolygonInput> polygon = org.springframework.graphql.data.ArgumentValue.omitted();
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

        public Builder setMetadata(org.springframework.graphql.data.ArgumentValue<java.lang.Object> metadata) {
            this.metadata = metadata;
            return this;
        }


        public TrackDetectionInput build() {
            return new TrackDetectionInput(timestamp, position, polygon, metadata);
        }

    }
}
