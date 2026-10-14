package io.worlds.api.model;

import java.util.Objects;

/**
 * Fields to update an existing PointOfInterest
 */
public class UpdatePointOfInterestInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private String id;
    private org.springframework.graphql.data.ArgumentValue<String> siteId = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<String> name = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<GeoJSONPointInput> position = org.springframework.graphql.data.ArgumentValue.omitted();
    @Deprecated
    private org.springframework.graphql.data.ArgumentValue<java.lang.Object> metadata = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<JSONUpdateInput> metadataUpdate = org.springframework.graphql.data.ArgumentValue.omitted();

    public UpdatePointOfInterestInput() {
    }

    public UpdatePointOfInterestInput(String id, org.springframework.graphql.data.ArgumentValue<String> siteId, org.springframework.graphql.data.ArgumentValue<String> name, org.springframework.graphql.data.ArgumentValue<GeoJSONPointInput> position, org.springframework.graphql.data.ArgumentValue<java.lang.Object> metadata, org.springframework.graphql.data.ArgumentValue<JSONUpdateInput> metadataUpdate) {
        this.id = id;
        this.siteId = siteId;
        this.name = name;
        this.position = position;
        this.metadata = metadata;
        this.metadataUpdate = metadataUpdate;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public org.springframework.graphql.data.ArgumentValue<String> getSiteId() {
        return siteId;
    }
    public void setSiteId(org.springframework.graphql.data.ArgumentValue<String> siteId) {
        this.siteId = siteId;
    }

    public org.springframework.graphql.data.ArgumentValue<String> getName() {
        return name;
    }
    public void setName(org.springframework.graphql.data.ArgumentValue<String> name) {
        this.name = name;
    }

    public org.springframework.graphql.data.ArgumentValue<GeoJSONPointInput> getPosition() {
        return position;
    }
    public void setPosition(org.springframework.graphql.data.ArgumentValue<GeoJSONPointInput> position) {
        this.position = position;
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
        final UpdatePointOfInterestInput that = (UpdatePointOfInterestInput) obj;
        return Objects.equals(id, that.id)
            && Objects.equals(siteId, that.siteId)
            && Objects.equals(name, that.name)
            && Objects.equals(position, that.position)
            && Objects.equals(metadata, that.metadata)
            && Objects.equals(metadataUpdate, that.metadataUpdate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, siteId, name, position, metadata, metadataUpdate);
    }


    public static UpdatePointOfInterestInput.Builder builder() {
        return new UpdatePointOfInterestInput.Builder();
    }

    public static class Builder {

        private String id;
        private org.springframework.graphql.data.ArgumentValue<String> siteId = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<String> name = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<GeoJSONPointInput> position = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<java.lang.Object> metadata = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<JSONUpdateInput> metadataUpdate = org.springframework.graphql.data.ArgumentValue.omitted();

        public Builder() {
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setSiteId(org.springframework.graphql.data.ArgumentValue<String> siteId) {
            this.siteId = siteId;
            return this;
        }

        public Builder setName(org.springframework.graphql.data.ArgumentValue<String> name) {
            this.name = name;
            return this;
        }

        public Builder setPosition(org.springframework.graphql.data.ArgumentValue<GeoJSONPointInput> position) {
            this.position = position;
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


        public UpdatePointOfInterestInput build() {
            return new UpdatePointOfInterestInput(id, siteId, name, position, metadata, metadataUpdate);
        }

    }
}
