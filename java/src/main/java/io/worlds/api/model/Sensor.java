package io.worlds.api.model;


public class Sensor implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private String id;
    @jakarta.validation.constraints.NotNull
    private String name;
    private String description;
    @jakarta.validation.constraints.NotNull
    private SensorType type;
    private java.lang.Object metadata;

    public Sensor() {
    }

    public Sensor(String id, String name, String description, SensorType type, java.lang.Object metadata) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.type = type;
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

    public SensorType getType() {
        return type;
    }
    public void setType(SensorType type) {
        this.type = type;
    }

    public java.lang.Object getMetadata() {
        return metadata;
    }
    public void setMetadata(java.lang.Object metadata) {
        this.metadata = metadata;
    }



    public static Sensor.Builder builder() {
        return new Sensor.Builder();
    }

    public static class Builder {

        private String id;
        private String name;
        private String description;
        private SensorType type;
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

        public Builder setType(SensorType type) {
            this.type = type;
            return this;
        }

        public Builder setMetadata(java.lang.Object metadata) {
            this.metadata = metadata;
            return this;
        }


        public Sensor build() {
            return new Sensor(id, name, description, type, metadata);
        }

    }
}
