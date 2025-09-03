package io.worlds.api.model;


/**
 * Fields to update an existing [PointOfInterest]({{Types.pointofinterest}})
 */
public class UpdatePointOfInterestInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private String id;
    private org.springframework.graphql.data.ArgumentValue<String> siteId = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<String> name = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<GeoJSONPointInput> position = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<java.lang.Object> metadata = org.springframework.graphql.data.ArgumentValue.omitted();

    public UpdatePointOfInterestInput() {
    }

    public UpdatePointOfInterestInput(String id, org.springframework.graphql.data.ArgumentValue<String> siteId, org.springframework.graphql.data.ArgumentValue<String> name, org.springframework.graphql.data.ArgumentValue<GeoJSONPointInput> position, org.springframework.graphql.data.ArgumentValue<java.lang.Object> metadata) {
        this.id = id;
        this.siteId = siteId;
        this.name = name;
        this.position = position;
        this.metadata = metadata;
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

    public org.springframework.graphql.data.ArgumentValue<java.lang.Object> getMetadata() {
        return metadata;
    }
    public void setMetadata(org.springframework.graphql.data.ArgumentValue<java.lang.Object> metadata) {
        this.metadata = metadata;
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

        public Builder setMetadata(org.springframework.graphql.data.ArgumentValue<java.lang.Object> metadata) {
            this.metadata = metadata;
            return this;
        }


        public UpdatePointOfInterestInput build() {
            return new UpdatePointOfInterestInput(id, siteId, name, position, metadata);
        }

    }
}
