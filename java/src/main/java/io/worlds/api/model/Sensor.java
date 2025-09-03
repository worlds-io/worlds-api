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
    private GeoJSONPoint position;
    private String address;
    private java.lang.Object metadata;

    public Sensor() {
    }

    public Sensor(String id, String name, String description, SensorType type, GeoJSONPoint position, String address, java.lang.Object metadata) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.type = type;
        this.position = position;
        this.address = address;
        this.metadata = metadata;
    }

    /**
     * The unique identifier for the Sensor.
     */
    public String getId() {
        return id;
    }
    /**
     * The unique identifier for the Sensor.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * The name of the Sensor.
     */
    public String getName() {
        return name;
    }
    /**
     * The name of the Sensor.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * A brief description of the Sensor.
     */
    public String getDescription() {
        return description;
    }
    /**
     * A brief description of the Sensor.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * The class label of the Sensor, e.g. thermometer.
     */
    public SensorType getType() {
        return type;
    }
    /**
     * The class label of the Sensor, e.g. thermometer.
     */
    public void setType(SensorType type) {
        this.type = type;
    }

    /**
     * The geographic location of the Sensor.
     */
    public GeoJSONPoint getPosition() {
        return position;
    }
    /**
     * The geographic location of the Sensor.
     */
    public void setPosition(GeoJSONPoint position) {
        this.position = position;
    }

    /**
     * The address of the Sensor.
     */
    public String getAddress() {
        return address;
    }
    /**
     * The address of the Sensor.
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Arbitrary information about the Sensor outside of configuration.
     */
    public java.lang.Object getMetadata() {
        return metadata;
    }
    /**
     * Arbitrary information about the Sensor outside of configuration.
     */
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
        private GeoJSONPoint position;
        private String address;
        private java.lang.Object metadata;

        public Builder() {
        }

        /**
         * The unique identifier for the Sensor.
         */
        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        /**
         * The name of the Sensor.
         */
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        /**
         * A brief description of the Sensor.
         */
        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        /**
         * The class label of the Sensor, e.g. thermometer.
         */
        public Builder setType(SensorType type) {
            this.type = type;
            return this;
        }

        /**
         * The geographic location of the Sensor.
         */
        public Builder setPosition(GeoJSONPoint position) {
            this.position = position;
            return this;
        }

        /**
         * The address of the Sensor.
         */
        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        /**
         * Arbitrary information about the Sensor outside of configuration.
         */
        public Builder setMetadata(java.lang.Object metadata) {
            this.metadata = metadata;
            return this;
        }


        public Sensor build() {
            return new Sensor(id, name, description, type, position, address, metadata);
        }

    }
}
