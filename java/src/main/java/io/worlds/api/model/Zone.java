package io.worlds.api.model;


public class Zone implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private String id;
    private DataSource dataSource;
    @jakarta.validation.constraints.NotNull
    private String name;
    @jakarta.validation.constraints.NotNull
    private GeoJSONPolygon polygon;
    private boolean active;
    private java.time.OffsetDateTime createdAt;
    private java.time.OffsetDateTime updatedAt;
    @Deprecated
    @jakarta.validation.constraints.NotNull
    private String deviceId;

    public Zone() {
    }

    public Zone(String id, DataSource dataSource, String name, GeoJSONPolygon polygon, boolean active, java.time.OffsetDateTime createdAt, java.time.OffsetDateTime updatedAt, String deviceId) {
        this.id = id;
        this.dataSource = dataSource;
        this.name = name;
        this.polygon = polygon;
        this.active = active;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.deviceId = deviceId;
    }

    /**
     * The unique identifier for the camera zone.
     */
    public String getId() {
        return id;
    }
    /**
     * The unique identifier for the camera zone.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * The data source that owns the zone
     */
    public DataSource getDataSource() {
        return dataSource;
    }
    /**
     * The data source that owns the zone
     */
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    /**
     * The name given to the camera zone.
     */
    public String getName() {
        return name;
    }
    /**
     * The name given to the camera zone.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * The geometrical boundry of the camera zone.
     */
    public GeoJSONPolygon getPolygon() {
        return polygon;
    }
    /**
     * The geometrical boundry of the camera zone.
     */
    public void setPolygon(GeoJSONPolygon polygon) {
        this.polygon = polygon;
    }

    /**
     * True if the zone is currently active, otherwise false.
     */
    public boolean getActive() {
        return active;
    }
    /**
     * True if the zone is currently active, otherwise false.
     */
    public void setActive(boolean active) {
        this.active = active;
    }

    /**
     * The timestamp the zone was created at.
     */
    public java.time.OffsetDateTime getCreatedAt() {
        return createdAt;
    }
    /**
     * The timestamp the zone was created at.
     */
    public void setCreatedAt(java.time.OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * The timestamp the zone was most recently updated.
     */
    public java.time.OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }
    /**
     * The timestamp the zone was most recently updated.
     */
    public void setUpdatedAt(java.time.OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * The unique identifier for the camera the zone belongs to.
     */
    @Deprecated
    public String getDeviceId() {
        return deviceId;
    }
    /**
     * The unique identifier for the camera the zone belongs to.
     */
    @Deprecated
    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }



    public static Zone.Builder builder() {
        return new Zone.Builder();
    }

    public static class Builder {

        private String id;
        private DataSource dataSource;
        private String name;
        private GeoJSONPolygon polygon;
        private boolean active;
        private java.time.OffsetDateTime createdAt;
        private java.time.OffsetDateTime updatedAt;
        private String deviceId;

        public Builder() {
        }

        /**
         * The unique identifier for the camera zone.
         */
        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        /**
         * The data source that owns the zone
         */
        public Builder setDataSource(DataSource dataSource) {
            this.dataSource = dataSource;
            return this;
        }

        /**
         * The name given to the camera zone.
         */
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        /**
         * The geometrical boundry of the camera zone.
         */
        public Builder setPolygon(GeoJSONPolygon polygon) {
            this.polygon = polygon;
            return this;
        }

        /**
         * True if the zone is currently active, otherwise false.
         */
        public Builder setActive(boolean active) {
            this.active = active;
            return this;
        }

        /**
         * The timestamp the zone was created at.
         */
        public Builder setCreatedAt(java.time.OffsetDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * The timestamp the zone was most recently updated.
         */
        public Builder setUpdatedAt(java.time.OffsetDateTime updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        /**
         * The unique identifier for the camera the zone belongs to.
         */
        @Deprecated
        public Builder setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }


        public Zone build() {
            return new Zone(id, dataSource, name, polygon, active, createdAt, updatedAt, deviceId);
        }

    }
}
