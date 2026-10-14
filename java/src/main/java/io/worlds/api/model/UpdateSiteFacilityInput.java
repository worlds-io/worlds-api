package io.worlds.api.model;

import java.util.Objects;

/**
 * Fields to update an existing SiteFacility.
A facility cannot be moved to another site.
 */
public class UpdateSiteFacilityInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private String id;
    private org.springframework.graphql.data.ArgumentValue<String> name = org.springframework.graphql.data.ArgumentValue.omitted();
    @Deprecated
    private org.springframework.graphql.data.ArgumentValue<java.lang.Object> metadata = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<JSONUpdateInput> metadataUpdate = org.springframework.graphql.data.ArgumentValue.omitted();

    public UpdateSiteFacilityInput() {
    }

    public UpdateSiteFacilityInput(String id, org.springframework.graphql.data.ArgumentValue<String> name, org.springframework.graphql.data.ArgumentValue<java.lang.Object> metadata, org.springframework.graphql.data.ArgumentValue<JSONUpdateInput> metadataUpdate) {
        this.id = id;
        this.name = name;
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
        final UpdateSiteFacilityInput that = (UpdateSiteFacilityInput) obj;
        return Objects.equals(id, that.id)
            && Objects.equals(name, that.name)
            && Objects.equals(metadata, that.metadata)
            && Objects.equals(metadataUpdate, that.metadataUpdate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, metadata, metadataUpdate);
    }


    public static UpdateSiteFacilityInput.Builder builder() {
        return new UpdateSiteFacilityInput.Builder();
    }

    public static class Builder {

        private String id;
        private org.springframework.graphql.data.ArgumentValue<String> name = org.springframework.graphql.data.ArgumentValue.omitted();
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

        @Deprecated
        public Builder setMetadata(org.springframework.graphql.data.ArgumentValue<java.lang.Object> metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder setMetadataUpdate(org.springframework.graphql.data.ArgumentValue<JSONUpdateInput> metadataUpdate) {
            this.metadataUpdate = metadataUpdate;
            return this;
        }


        public UpdateSiteFacilityInput build() {
            return new UpdateSiteFacilityInput(id, name, metadata, metadataUpdate);
        }

    }
}
