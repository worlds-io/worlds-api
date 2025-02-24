package io.worlds.api.model;


public class TrackProperties implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private TrackProperty identifier;
    private java.util.List<TrackProperty> attributes;

    public TrackProperties() {
    }

    public TrackProperties(TrackProperty identifier, java.util.List<TrackProperty> attributes) {
        this.identifier = identifier;
        this.attributes = attributes;
    }

    public TrackProperty getIdentifier() {
        return identifier;
    }
    public void setIdentifier(TrackProperty identifier) {
        this.identifier = identifier;
    }

    public java.util.List<TrackProperty> getAttributes() {
        return attributes;
    }
    public void setAttributes(java.util.List<TrackProperty> attributes) {
        this.attributes = attributes;
    }



    public static TrackProperties.Builder builder() {
        return new TrackProperties.Builder();
    }

    public static class Builder {

        private TrackProperty identifier;
        private java.util.List<TrackProperty> attributes;

        public Builder() {
        }

        public Builder setIdentifier(TrackProperty identifier) {
            this.identifier = identifier;
            return this;
        }

        public Builder setAttributes(java.util.List<TrackProperty> attributes) {
            this.attributes = attributes;
            return this;
        }


        public TrackProperties build() {
            return new TrackProperties(identifier, attributes);
        }

    }
}
