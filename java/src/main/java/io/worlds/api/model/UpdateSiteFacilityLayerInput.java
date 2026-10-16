package io.worlds.api.model;

import java.util.Objects;

/**
 * Fields to update an existing SiteFacilityLayer.
 */
public class UpdateSiteFacilityLayerInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private String id;
    private org.springframework.graphql.data.ArgumentValue<String> name = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<GeoJSONPolygonInput> imageBounds = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<GeoJSONPolygonInput> geographicBounds = org.springframework.graphql.data.ArgumentValue.omitted();
    @Deprecated
    private org.springframework.graphql.data.ArgumentValue<java.lang.Object> metadata = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<JSONUpdateInput> metadataUpdate = org.springframework.graphql.data.ArgumentValue.omitted();

    public UpdateSiteFacilityLayerInput() {
    }

    public UpdateSiteFacilityLayerInput(String id, org.springframework.graphql.data.ArgumentValue<String> name, org.springframework.graphql.data.ArgumentValue<GeoJSONPolygonInput> imageBounds, org.springframework.graphql.data.ArgumentValue<GeoJSONPolygonInput> geographicBounds, org.springframework.graphql.data.ArgumentValue<java.lang.Object> metadata, org.springframework.graphql.data.ArgumentValue<JSONUpdateInput> metadataUpdate) {
        this.id = id;
        this.name = name;
        this.imageBounds = imageBounds;
        this.geographicBounds = geographicBounds;
        this.metadata = metadata;
        this.metadataUpdate = metadataUpdate;
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

    public org.springframework.graphql.data.ArgumentValue<GeoJSONPolygonInput> getImageBounds() {
        return imageBounds;
    }
    public void setImageBounds(org.springframework.graphql.data.ArgumentValue<GeoJSONPolygonInput> imageBounds) {
        this.imageBounds = imageBounds;
    }

    public org.springframework.graphql.data.ArgumentValue<GeoJSONPolygonInput> getGeographicBounds() {
        return geographicBounds;
    }
    public void setGeographicBounds(org.springframework.graphql.data.ArgumentValue<GeoJSONPolygonInput> geographicBounds) {
        this.geographicBounds = geographicBounds;
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

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final UpdateSiteFacilityLayerInput that = (UpdateSiteFacilityLayerInput) obj;
        return Objects.equals(id, that.id)
            && Objects.equals(name, that.name)
            && Objects.equals(imageBounds, that.imageBounds)
            && Objects.equals(geographicBounds, that.geographicBounds)
            && Objects.equals(metadata, that.metadata)
            && Objects.equals(metadataUpdate, that.metadataUpdate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, imageBounds, geographicBounds, metadata, metadataUpdate);
    }


    public static UpdateSiteFacilityLayerInput.Builder builder() {
        return new UpdateSiteFacilityLayerInput.Builder();
    }

    public static class Builder {

        private String id;
        private org.springframework.graphql.data.ArgumentValue<String> name = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<GeoJSONPolygonInput> imageBounds = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<GeoJSONPolygonInput> geographicBounds = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<java.lang.Object> metadata = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<JSONUpdateInput> metadataUpdate = org.springframework.graphql.data.ArgumentValue.omitted();

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

        public Builder setImageBounds(org.springframework.graphql.data.ArgumentValue<GeoJSONPolygonInput> imageBounds) {
            this.imageBounds = imageBounds;
            return this;
        }

        public Builder setGeographicBounds(org.springframework.graphql.data.ArgumentValue<GeoJSONPolygonInput> geographicBounds) {
            this.geographicBounds = geographicBounds;
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


        public UpdateSiteFacilityLayerInput build() {
            return new UpdateSiteFacilityLayerInput(id, name, imageBounds, geographicBounds, metadata, metadataUpdate);
        }

    }
}
