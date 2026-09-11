package io.worlds.api.model;

import java.util.Objects;

/**
 * Fields to update an existing [SiteFacility]({{Types.SiteFacility}}).
A facility cannot be moved to another site.
 */
public class UpdateSiteFacilityInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private String id;
    private org.springframework.graphql.data.ArgumentValue<String> name = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<java.lang.Object> metadata = org.springframework.graphql.data.ArgumentValue.omitted();

    public UpdateSiteFacilityInput() {
    }

    public UpdateSiteFacilityInput(String id, org.springframework.graphql.data.ArgumentValue<String> name, org.springframework.graphql.data.ArgumentValue<java.lang.Object> metadata) {
        this.id = id;
        this.name = name;
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
        final UpdateSiteFacilityInput that = (UpdateSiteFacilityInput) obj;
        return Objects.equals(id, that.id)
            && Objects.equals(name, that.name)
            && Objects.equals(metadata, that.metadata);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, metadata);
    }


    public static UpdateSiteFacilityInput.Builder builder() {
        return new UpdateSiteFacilityInput.Builder();
    }

    public static class Builder {

        private String id;
        private org.springframework.graphql.data.ArgumentValue<String> name = org.springframework.graphql.data.ArgumentValue.omitted();
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

        public Builder setMetadata(org.springframework.graphql.data.ArgumentValue<java.lang.Object> metadata) {
            this.metadata = metadata;
            return this;
        }


        public UpdateSiteFacilityInput build() {
            return new UpdateSiteFacilityInput(id, name, metadata);
        }

    }
}
