package io.worlds.api.model;

import java.util.Objects;

/**
 * Fields to create a new [SiteFacilityLayer]({{Types.SiteFacilityLayer}}).
The layer image is uploaded separately, so a newly created layer has no image.
 */
public class CreateSiteFacilityLayerInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private String siteFacilityId;
    @jakarta.validation.constraints.NotNull
    private String name;
    private org.springframework.graphql.data.ArgumentValue<GeoJSONPolygonInput> imageBounds = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<java.lang.Object> metadata = org.springframework.graphql.data.ArgumentValue.omitted();

    public CreateSiteFacilityLayerInput() {
    }

    public CreateSiteFacilityLayerInput(String siteFacilityId, String name, org.springframework.graphql.data.ArgumentValue<GeoJSONPolygonInput> imageBounds, org.springframework.graphql.data.ArgumentValue<java.lang.Object> metadata) {
        this.siteFacilityId = siteFacilityId;
        this.name = name;
        this.imageBounds = imageBounds;
        this.metadata = metadata;
    }

    public String getSiteFacilityId() {
        return siteFacilityId;
    }
    public void setSiteFacilityId(String siteFacilityId) {
        this.siteFacilityId = siteFacilityId;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
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
        final CreateSiteFacilityLayerInput that = (CreateSiteFacilityLayerInput) obj;
        return Objects.equals(siteFacilityId, that.siteFacilityId)
            && Objects.equals(name, that.name)
            && Objects.equals(imageBounds, that.imageBounds)
            && Objects.equals(metadata, that.metadata);
    }

    @Override
    public int hashCode() {
        return Objects.hash(siteFacilityId, name, imageBounds, metadata);
    }


    public static CreateSiteFacilityLayerInput.Builder builder() {
        return new CreateSiteFacilityLayerInput.Builder();
    }

    public static class Builder {

        private String siteFacilityId;
        private String name;
        private org.springframework.graphql.data.ArgumentValue<GeoJSONPolygonInput> imageBounds = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<java.lang.Object> metadata = org.springframework.graphql.data.ArgumentValue.omitted();

        public Builder() {
        }

        public Builder setSiteFacilityId(String siteFacilityId) {
            this.siteFacilityId = siteFacilityId;
            return this;
        }

        public Builder setName(String name) {
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


        public CreateSiteFacilityLayerInput build() {
            return new CreateSiteFacilityLayerInput(siteFacilityId, name, imageBounds, metadata);
        }

    }
}
