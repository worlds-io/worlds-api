package io.worlds.api.model;

import java.util.Objects;

/**
 * Fields to create a new [PointOfInterest]({{Types.PointOfInterest}})
 */
public class CreatePointOfInterestInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private String siteId;
    @jakarta.validation.constraints.NotNull
    private String name;
    @jakarta.validation.constraints.NotNull
    private GeoJSONPointInput position;
    private org.springframework.graphql.data.ArgumentValue<java.lang.Object> metadata = org.springframework.graphql.data.ArgumentValue.omitted();

    public CreatePointOfInterestInput() {
    }

    public CreatePointOfInterestInput(String siteId, String name, GeoJSONPointInput position, org.springframework.graphql.data.ArgumentValue<java.lang.Object> metadata) {
        this.siteId = siteId;
        this.name = name;
        this.position = position;
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

    public GeoJSONPointInput getPosition() {
        return position;
    }
    public void setPosition(GeoJSONPointInput position) {
        this.position = position;
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
        final CreatePointOfInterestInput that = (CreatePointOfInterestInput) obj;
        return Objects.equals(siteId, that.siteId)
            && Objects.equals(name, that.name)
            && Objects.equals(position, that.position)
            && Objects.equals(metadata, that.metadata);
    }

    @Override
    public int hashCode() {
        return Objects.hash(siteId, name, position, metadata);
    }


    public static CreatePointOfInterestInput.Builder builder() {
        return new CreatePointOfInterestInput.Builder();
    }

    public static class Builder {

        private String siteId;
        private String name;
        private GeoJSONPointInput position;
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

        public Builder setPosition(GeoJSONPointInput position) {
            this.position = position;
            return this;
        }

        public Builder setMetadata(org.springframework.graphql.data.ArgumentValue<java.lang.Object> metadata) {
            this.metadata = metadata;
            return this;
        }


        public CreatePointOfInterestInput build() {
            return new CreatePointOfInterestInput(siteId, name, position, metadata);
        }

    }
}
