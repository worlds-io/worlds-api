package io.worlds.api.model;

import java.util.Objects;

/**
 * An event producer represents a custom process that detects and records events. Events
created by an event producer can represent a wide variety of time-based activities to be
used by your application's specific needs that aren't expressed natively through
detections and geofences. For instance, an event producer could track detections of
hazards and people, creating an event for each case where a person was too close
to a hazard without personal protective equipment.
 */
public class EventProducer implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private String id;
    @jakarta.validation.constraints.NotNull
    private String name;
    private String description;
    private String timezone;
    private boolean active;
    @jakarta.validation.constraints.NotNull
    private java.util.List<String> invalidReasons;
    private java.lang.Object metadata;

    public EventProducer() {
    }

    public EventProducer(String id, String name, String description, String timezone, boolean active, java.util.List<String> invalidReasons, java.lang.Object metadata) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.timezone = timezone;
        this.active = active;
        this.invalidReasons = invalidReasons;
        this.metadata = metadata;
    }

    /**
     * The unique identifier for the event producer.
     */
    public String getId() {
        return id;
    }
    /**
     * The unique identifier for the event producer.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * The name of the event producer.
     */
    public String getName() {
        return name;
    }
    /**
     * The name of the event producer.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * The text description of the event producer, if provided.
     */
    public String getDescription() {
        return description;
    }
    /**
     * The text description of the event producer, if provided.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * The timezone for the event producer, if provided.
     */
    public String getTimezone() {
        return timezone;
    }
    /**
     * The timezone for the event producer, if provided.
     */
    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    /**
     * True if the event producer is currently active, otherwise false.
     */
    public boolean getActive() {
        return active;
    }
    /**
     * True if the event producer is currently active, otherwise false.
     */
    public void setActive(boolean active) {
        this.active = active;
    }

    /**
     * A list of invalid reasons currently used by the event producer.
     */
    public java.util.List<String> getInvalidReasons() {
        return invalidReasons;
    }
    /**
     * A list of invalid reasons currently used by the event producer.
     */
    public void setInvalidReasons(java.util.List<String> invalidReasons) {
        this.invalidReasons = invalidReasons;
    }

    /**
     * Arbitrary information about the event producer.
     */
    public java.lang.Object getMetadata() {
        return metadata;
    }
    /**
     * Arbitrary information about the event producer.
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
        final EventProducer that = (EventProducer) obj;
        return Objects.equals(id, that.id)
            && Objects.equals(name, that.name)
            && Objects.equals(description, that.description)
            && Objects.equals(timezone, that.timezone)
            && Objects.equals(active, that.active)
            && Objects.equals(invalidReasons, that.invalidReasons)
            && Objects.equals(metadata, that.metadata);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, timezone, active, invalidReasons, metadata);
    }


    public static EventProducer.Builder builder() {
        return new EventProducer.Builder();
    }

    public static class Builder {

        private String id;
        private String name;
        private String description;
        private String timezone;
        private boolean active;
        private java.util.List<String> invalidReasons;
        private java.lang.Object metadata;

        public Builder() {
        }

        /**
         * The unique identifier for the event producer.
         */
        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        /**
         * The name of the event producer.
         */
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        /**
         * The text description of the event producer, if provided.
         */
        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        /**
         * The timezone for the event producer, if provided.
         */
        public Builder setTimezone(String timezone) {
            this.timezone = timezone;
            return this;
        }

        /**
         * True if the event producer is currently active, otherwise false.
         */
        public Builder setActive(boolean active) {
            this.active = active;
            return this;
        }

        /**
         * A list of invalid reasons currently used by the event producer.
         */
        public Builder setInvalidReasons(java.util.List<String> invalidReasons) {
            this.invalidReasons = invalidReasons;
            return this;
        }

        /**
         * Arbitrary information about the event producer.
         */
        public Builder setMetadata(java.lang.Object metadata) {
            this.metadata = metadata;
            return this;
        }


        public EventProducer build() {
            return new EventProducer(id, name, description, timezone, active, invalidReasons, metadata);
        }

    }
}
