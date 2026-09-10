package io.worlds.api.model;

import java.util.Objects;

/**
 * Fields to create a new [SiteFacility]({{Types.SiteFacility}}).
 */
public class CreateSiteFacilityInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private String siteId;
    @jakarta.validation.constraints.NotNull
    private String name;
    private org.springframework.graphql.data.ArgumentValue<java.lang.Object> metadata = org.springframework.graphql.data.ArgumentValue.omitted();

    public CreateSiteFacilityInput() {
    }

    public CreateSiteFacilityInput(String siteId, String name, org.springframework.graphql.data.ArgumentValue<java.lang.Object> metadata) {
        this.siteId = siteId;
        this.name = name;
        this.metadata = metadata;
    }

    public String getSiteId() {
        return siteId;
    }
    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
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
        final CreateSiteFacilityInput that = (CreateSiteFacilityInput) obj;
        return Objects.equals(siteId, that.siteId)
            && Objects.equals(name, that.name)
            && Objects.equals(metadata, that.metadata);
    }

    @Override
    public int hashCode() {
        return Objects.hash(siteId, name, metadata);
    }


    public static CreateSiteFacilityInput.Builder builder() {
        return new CreateSiteFacilityInput.Builder();
    }

    public static class Builder {

        private String siteId;
        private String name;
        private org.springframework.graphql.data.ArgumentValue<java.lang.Object> metadata = org.springframework.graphql.data.ArgumentValue.omitted();

        public Builder() {
        }

        public Builder setSiteId(String siteId) {
            this.siteId = siteId;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setMetadata(org.springframework.graphql.data.ArgumentValue<java.lang.Object> metadata) {
            this.metadata = metadata;
            return this;
        }


        public CreateSiteFacilityInput build() {
            return new CreateSiteFacilityInput(siteId, name, metadata);
        }

    }
}
