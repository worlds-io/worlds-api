package io.worlds.api.model;

import java.util.Objects;

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

    /**
     * A property that identifies the Track
     */
    public TrackProperty getIdentifier() {
        return identifier;
    }
    /**
     * A property that identifies the Track
     */
    public void setIdentifier(TrackProperty identifier) {
        this.identifier = identifier;
    }

    /**
     * Properties that describe the Track
     */
    public java.util.List<TrackProperty> getAttributes() {
        return attributes;
    }
    /**
     * Properties that describe the Track
     */
    public void setAttributes(java.util.List<TrackProperty> attributes) {
        this.attributes = attributes;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final TrackProperties that = (TrackProperties) obj;
        return Objects.equals(identifier, that.identifier)
            && Objects.equals(attributes, that.attributes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identifier, attributes);
    }


    public static TrackProperties.Builder builder() {
        return new TrackProperties.Builder();
    }

    public static class Builder {

        private TrackProperty identifier;
        private java.util.List<TrackProperty> attributes;

        public Builder() {
        }

        /**
         * A property that identifies the Track
         */
        public Builder setIdentifier(TrackProperty identifier) {
            this.identifier = identifier;
            return this;
        }

        /**
         * Properties that describe the Track
         */
        public Builder setAttributes(java.util.List<TrackProperty> attributes) {
            this.attributes = attributes;
            return this;
        }


        public TrackProperties build() {
            return new TrackProperties(identifier, attributes);
        }

    }
}
