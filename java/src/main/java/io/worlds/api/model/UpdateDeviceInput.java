package io.worlds.api.model;


public class UpdateDeviceInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private String id;
    private org.springframework.graphql.data.ArgumentValue<String> siteId = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<String> pointOfInterestId = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<String> externalId = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<String> name = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<String> address = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<GeoJSONPointInput> position = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<Boolean> enabled = org.springframework.graphql.data.ArgumentValue.omitted();

    public UpdateDeviceInput() {
    }

    public UpdateDeviceInput(String id, org.springframework.graphql.data.ArgumentValue<String> siteId, org.springframework.graphql.data.ArgumentValue<String> pointOfInterestId, org.springframework.graphql.data.ArgumentValue<String> externalId, org.springframework.graphql.data.ArgumentValue<String> name, org.springframework.graphql.data.ArgumentValue<String> address, org.springframework.graphql.data.ArgumentValue<GeoJSONPointInput> position, org.springframework.graphql.data.ArgumentValue<Boolean> enabled) {
        this.id = id;
        this.siteId = siteId;
        this.pointOfInterestId = pointOfInterestId;
        this.externalId = externalId;
        this.name = name;
        this.address = address;
        this.position = position;
        this.enabled = enabled;
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

    public org.springframework.graphql.data.ArgumentValue<String> getPointOfInterestId() {
        return pointOfInterestId;
    }
    public void setPointOfInterestId(org.springframework.graphql.data.ArgumentValue<String> pointOfInterestId) {
        this.pointOfInterestId = pointOfInterestId;
    }

    public org.springframework.graphql.data.ArgumentValue<String> getExternalId() {
        return externalId;
    }
    public void setExternalId(org.springframework.graphql.data.ArgumentValue<String> externalId) {
        this.externalId = externalId;
    }

    public org.springframework.graphql.data.ArgumentValue<String> getName() {
        return name;
    }
    public void setName(org.springframework.graphql.data.ArgumentValue<String> name) {
        this.name = name;
    }

    public org.springframework.graphql.data.ArgumentValue<String> getAddress() {
        return address;
    }
    public void setAddress(org.springframework.graphql.data.ArgumentValue<String> address) {
        this.address = address;
    }

    public org.springframework.graphql.data.ArgumentValue<GeoJSONPointInput> getPosition() {
        return position;
    }
    public void setPosition(org.springframework.graphql.data.ArgumentValue<GeoJSONPointInput> position) {
        this.position = position;
    }

    public org.springframework.graphql.data.ArgumentValue<Boolean> getEnabled() {
        return enabled;
    }
    public void setEnabled(org.springframework.graphql.data.ArgumentValue<Boolean> enabled) {
        this.enabled = enabled;
    }



    public static UpdateDeviceInput.Builder builder() {
        return new UpdateDeviceInput.Builder();
    }

    public static class Builder {

        private String id;
        private org.springframework.graphql.data.ArgumentValue<String> siteId = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<String> pointOfInterestId = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<String> externalId = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<String> name = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<String> address = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<GeoJSONPointInput> position = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<Boolean> enabled = org.springframework.graphql.data.ArgumentValue.omitted();

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

        public Builder setPointOfInterestId(org.springframework.graphql.data.ArgumentValue<String> pointOfInterestId) {
            this.pointOfInterestId = pointOfInterestId;
            return this;
        }

        public Builder setExternalId(org.springframework.graphql.data.ArgumentValue<String> externalId) {
            this.externalId = externalId;
            return this;
        }

        public Builder setName(org.springframework.graphql.data.ArgumentValue<String> name) {
            this.name = name;
            return this;
        }

        public Builder setAddress(org.springframework.graphql.data.ArgumentValue<String> address) {
            this.address = address;
            return this;
        }

        public Builder setPosition(org.springframework.graphql.data.ArgumentValue<GeoJSONPointInput> position) {
            this.position = position;
            return this;
        }

        public Builder setEnabled(org.springframework.graphql.data.ArgumentValue<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }


        public UpdateDeviceInput build() {
            return new UpdateDeviceInput(id, siteId, pointOfInterestId, externalId, name, address, position, enabled);
        }

    }
}
