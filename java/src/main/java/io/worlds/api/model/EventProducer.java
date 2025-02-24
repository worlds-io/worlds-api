package io.worlds.api.model;


public class EventProducer implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private String id;
    @jakarta.validation.constraints.NotNull
    private String name;
    private String description;
    private String timezone;
    private boolean active;
    private java.lang.Object metadata;

    public EventProducer() {
    }

    public EventProducer(String id, String name, String description, String timezone, boolean active, java.lang.Object metadata) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.timezone = timezone;
        this.active = active;
        this.metadata = metadata;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getTimezone() {
        return timezone;
    }
    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public boolean getActive() {
        return active;
    }
    public void setActive(boolean active) {
        this.active = active;
    }

    public java.lang.Object getMetadata() {
        return metadata;
    }
    public void setMetadata(java.lang.Object metadata) {
        this.metadata = metadata;
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
        private java.lang.Object metadata;

        public Builder() {
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setTimezone(String timezone) {
            this.timezone = timezone;
            return this;
        }

        public Builder setActive(boolean active) {
            this.active = active;
            return this;
        }

        public Builder setMetadata(java.lang.Object metadata) {
            this.metadata = metadata;
            return this;
        }


        public EventProducer build() {
            return new EventProducer(id, name, description, timezone, active, metadata);
        }

    }
}
