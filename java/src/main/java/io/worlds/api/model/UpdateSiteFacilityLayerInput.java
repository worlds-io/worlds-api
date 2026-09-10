package io.worlds.api.model;

import java.util.Objects;

/**
 * Fields to update an existing [SiteFacilityLayer]({{Types.SiteFacilityLayer}}).
Omitted fields are left unchanged. The layer image is not affected.
 */
public class UpdateSiteFacilityLayerInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private String id;
    private org.springframework.graphql.data.ArgumentValue<String> name = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<GeoJSONPolygonInput> imageBounds = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<java.lang.Object> metadata = org.springframework.graphql.data.ArgumentValue.omitted();

    public UpdateSiteFacilityLayerInput() {
    }

    public UpdateSiteFacilityLayerInput(String id, org.springframework.graphql.data.ArgumentValue<String> name, org.springframework.graphql.data.ArgumentValue<GeoJSONPolygonInput> imageBounds, org.springframework.graphql.data.ArgumentValue<java.lang.Object> metadata) {
        this.id = id;
        this.name = name;
        this.imageBounds = imageBounds;
        this.metadata = metadata;
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
        final UpdateSiteFacilityLayerInput that = (UpdateSiteFacilityLayerInput) obj;
        return Objects.equals(id, that.id)
            && Objects.equals(name, that.name)
            && Objects.equals(imageBounds, that.imageBounds)
            && Objects.equals(metadata, that.metadata);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, imageBounds, metadata);
    }


    public static UpdateSiteFacilityLayerInput.Builder builder() {
        return new UpdateSiteFacilityLayerInput.Builder();
    }

    public static class Builder {

        private String id;
        private org.springframework.graphql.data.ArgumentValue<String> name = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<GeoJSONPolygonInput> imageBounds = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<java.lang.Object> metadata = org.springframework.graphql.data.ArgumentValue.omitted();

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

        public Builder setMetadata(org.springframework.graphql.data.ArgumentValue<java.lang.Object> metadata) {
            this.metadata = metadata;
            return this;
        }


        public UpdateSiteFacilityLayerInput build() {
            return new UpdateSiteFacilityLayerInput(id, name, imageBounds, metadata);
        }

    }
}
