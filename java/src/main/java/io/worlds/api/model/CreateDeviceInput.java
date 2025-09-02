package io.worlds.api.model;


/**
 * This input type is used to create a new [`Device`]({{Types.device}}).
 */
public class CreateDeviceInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private org.springframework.graphql.data.ArgumentValue<String> siteId = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<String> pointOfInterestId = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<String> externalId = org.springframework.graphql.data.ArgumentValue.omitted();
    @jakarta.validation.constraints.NotNull
    private String name;
    private org.springframework.graphql.data.ArgumentValue<String> address = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<GeoJSONPointInput> position = org.springframework.graphql.data.ArgumentValue.omitted();
    private boolean enabled;

    public CreateDeviceInput() {
    }

    public CreateDeviceInput(org.springframework.graphql.data.ArgumentValue<String> siteId, org.springframework.graphql.data.ArgumentValue<String> pointOfInterestId, org.springframework.graphql.data.ArgumentValue<String> externalId, String name, org.springframework.graphql.data.ArgumentValue<String> address, org.springframework.graphql.data.ArgumentValue<GeoJSONPointInput> position, boolean enabled) {
        this.siteId = siteId;
        this.pointOfInterestId = pointOfInterestId;
        this.externalId = externalId;
        this.name = name;
        this.address = address;
        this.position = position;
        this.enabled = enabled;
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

    public String getName() {
        return name;
    }
    public void setName(String name) {
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

    public boolean getEnabled() {
        return enabled;
    }
    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }



    public static CreateDeviceInput.Builder builder() {
        return new CreateDeviceInput.Builder();
    }

    public static class Builder {

        private org.springframework.graphql.data.ArgumentValue<String> siteId = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<String> pointOfInterestId = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<String> externalId = org.springframework.graphql.data.ArgumentValue.omitted();
        private String name;
        private org.springframework.graphql.data.ArgumentValue<String> address = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<GeoJSONPointInput> position = org.springframework.graphql.data.ArgumentValue.omitted();
        private boolean enabled;

        public Builder() {
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

        public Builder setName(String name) {
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

        public Builder setEnabled(boolean enabled) {
            this.enabled = enabled;
            return this;
        }


        public CreateDeviceInput build() {
            return new CreateDeviceInput(siteId, pointOfInterestId, externalId, name, address, position, enabled);
        }

    }
}
