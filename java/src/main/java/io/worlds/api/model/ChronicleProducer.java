package io.worlds.api.model;

import java.util.Objects;

/**
 * An chronicle producer represents a custom process that detects and records chronicles. Chronicles
created by an chronicle producer can represent a wide variety of time-based activities to be
used by your application's specific needs that aren't expressed natively through
detections and geofences. For instance, an chronicle producer could track detections of
hazards and people, creating an event chronicle for each case where a person was too close
to a hazard without personal protective equipment.
 */
public class ChronicleProducer implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private String id;
    @jakarta.validation.constraints.NotNull
    private String name;
    private String description;
    private String timezone;
    private boolean active;
    @jakarta.validation.constraints.NotNull
    private java.util.List<String> validationReasons;
    private java.lang.Object metadata;

    public ChronicleProducer() {
    }

    public ChronicleProducer(String id, String name, String description, String timezone, boolean active, java.util.List<String> validationReasons, java.lang.Object metadata) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.timezone = timezone;
        this.active = active;
        this.validationReasons = validationReasons;
        this.metadata = metadata;
    }

    /**
     * The unique identifier for the chronicle producer.
     */
    public String getId() {
        return id;
    }
    /**
     * The unique identifier for the chronicle producer.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * The name of the chronicle producer.
     */
    public String getName() {
        return name;
    }
    /**
     * The name of the chronicle producer.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * The text description of the chronicle producer, if provided.
     */
    public String getDescription() {
        return description;
    }
    /**
     * The text description of the chronicle producer, if provided.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * The timezone for the chronicle producer, if provided.
     */
    public String getTimezone() {
        return timezone;
    }
    /**
     * The timezone for the chronicle producer, if provided.
     */
    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    /**
     * True if the chronicle producer is currently active, otherwise false.
     */
    public boolean getActive() {
        return active;
    }
    /**
     * True if the chronicle producer is currently active, otherwise false.
     */
    public void setActive(boolean active) {
        this.active = active;
    }

    /**
     * A list of validation reasons currently used by the chronicle producer.
     */
    public java.util.List<String> getValidationReasons() {
        return validationReasons;
    }
    /**
     * A list of validation reasons currently used by the chronicle producer.
     */
    public void setValidationReasons(java.util.List<String> validationReasons) {
        this.validationReasons = validationReasons;
    }

    /**
     * Arbitrary information about the chronicle producer.
     */
    public java.lang.Object getMetadata() {
        return metadata;
    }
    /**
     * Arbitrary information about the chronicle producer.
     */
    public void setMetadata(java.lang.Object metadata) {
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
        final ChronicleProducer that = (ChronicleProducer) obj;
        return Objects.equals(id, that.id)
            && Objects.equals(name, that.name)
            && Objects.equals(description, that.description)
            && Objects.equals(timezone, that.timezone)
            && Objects.equals(active, that.active)
            && Objects.equals(validationReasons, that.validationReasons)
            && Objects.equals(metadata, that.metadata);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, timezone, active, validationReasons, metadata);
    }


    public static ChronicleProducer.Builder builder() {
        return new ChronicleProducer.Builder();
    }

    public static class Builder {

        private String id;
        private String name;
        private String description;
        private String timezone;
        private boolean active;
        private java.util.List<String> validationReasons;
        private java.lang.Object metadata;

        public Builder() {
        }

        /**
         * The unique identifier for the chronicle producer.
         */
        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        /**
         * The name of the chronicle producer.
         */
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        /**
         * The text description of the chronicle producer, if provided.
         */
        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        /**
         * The timezone for the chronicle producer, if provided.
         */
        public Builder setTimezone(String timezone) {
            this.timezone = timezone;
            return this;
        }

        /**
         * True if the chronicle producer is currently active, otherwise false.
         */
        public Builder setActive(boolean active) {
            this.active = active;
            return this;
        }

        /**
         * A list of validation reasons currently used by the chronicle producer.
         */
        public Builder setValidationReasons(java.util.List<String> validationReasons) {
            this.validationReasons = validationReasons;
            return this;
        }

        /**
         * Arbitrary information about the chronicle producer.
         */
        public Builder setMetadata(java.lang.Object metadata) {
            this.metadata = metadata;
            return this;
        }


        public ChronicleProducer build() {
            return new ChronicleProducer(id, name, description, timezone, active, validationReasons, metadata);
        }

    }
}
