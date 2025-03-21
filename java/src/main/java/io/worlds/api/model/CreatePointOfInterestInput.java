package io.worlds.api.model;


public class CreatePointOfInterestInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private String siteId;
    @jakarta.validation.constraints.NotNull
    private String name;
    @jakarta.validation.constraints.NotNull
    private GeoJSONPoint position;
    private org.springframework.graphql.data.ArgumentValue<java.lang.Object> metadata = org.springframework.graphql.data.ArgumentValue.omitted();

    public CreatePointOfInterestInput() {
    }

    public CreatePointOfInterestInput(String siteId, String name, GeoJSONPoint position, org.springframework.graphql.data.ArgumentValue<java.lang.Object> metadata) {
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

    public GeoJSONPoint getPosition() {
        return position;
    }
    public void setPosition(GeoJSONPoint position) {
        this.position = position;
    }

    public org.springframework.graphql.data.ArgumentValue<java.lang.Object> getMetadata() {
        return metadata;
    }
    public void setMetadata(org.springframework.graphql.data.ArgumentValue<java.lang.Object> metadata) {
        this.metadata = metadata;
    }



    public static CreatePointOfInterestInput.Builder builder() {
        return new CreatePointOfInterestInput.Builder();
    }

    public static class Builder {

        private String siteId;
        private String name;
        private GeoJSONPoint position;
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

        public Builder setPosition(GeoJSONPoint position) {
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
