package io.worlds.api.model;


public class TrackPropertiesInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private org.springframework.graphql.data.ArgumentValue<TrackPropertyInput> identifier = org.springframework.graphql.data.ArgumentValue.omitted();
    private java.util.List<TrackPropertyInput> attributes;

    public TrackPropertiesInput() {
    }

    public TrackPropertiesInput(org.springframework.graphql.data.ArgumentValue<TrackPropertyInput> identifier, java.util.List<TrackPropertyInput> attributes) {
        this.identifier = identifier;
        this.attributes = attributes;
    }

    public org.springframework.graphql.data.ArgumentValue<TrackPropertyInput> getIdentifier() {
        return identifier;
    }
    public void setIdentifier(org.springframework.graphql.data.ArgumentValue<TrackPropertyInput> identifier) {
        this.identifier = identifier;
    }

    public java.util.List<TrackPropertyInput> getAttributes() {
        return attributes;
    }
    public void setAttributes(java.util.List<TrackPropertyInput> attributes) {
        this.attributes = attributes;
    }



    public static TrackPropertiesInput.Builder builder() {
        return new TrackPropertiesInput.Builder();
    }

    public static class Builder {

        private org.springframework.graphql.data.ArgumentValue<TrackPropertyInput> identifier = org.springframework.graphql.data.ArgumentValue.omitted();
        private java.util.List<TrackPropertyInput> attributes;

        public Builder() {
        }

        public Builder setIdentifier(org.springframework.graphql.data.ArgumentValue<TrackPropertyInput> identifier) {
            this.identifier = identifier;
            return this;
        }

        public Builder setAttributes(java.util.List<TrackPropertyInput> attributes) {
            this.attributes = attributes;
            return this;
        }


        public TrackPropertiesInput build() {
            return new TrackPropertiesInput(identifier, attributes);
        }

    }
}
