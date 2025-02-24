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
    @Deprecated
    @jakarta.validation.constraints.NotNull
    private String deviceId;

    public Zone() {
    }

    public Zone(String id, DataSource dataSource, String name, GeoJSONPolygon polygon, boolean active, String deviceId) {
        this.id = id;
        this.dataSource = dataSource;
        this.name = name;
        this.polygon = polygon;
        this.active = active;
        this.deviceId = deviceId;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public DataSource getDataSource() {
        return dataSource;
    }
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public GeoJSONPolygon getPolygon() {
        return polygon;
    }
    public void setPolygon(GeoJSONPolygon polygon) {
        this.polygon = polygon;
    }

    public boolean getActive() {
        return active;
    }
    public void setActive(boolean active) {
        this.active = active;
    }

    @Deprecated
    public String getDeviceId() {
        return deviceId;
    }
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
        private String deviceId;

        public Builder() {
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setDataSource(DataSource dataSource) {
            this.dataSource = dataSource;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setPolygon(GeoJSONPolygon polygon) {
            this.polygon = polygon;
            return this;
        }

        public Builder setActive(boolean active) {
            this.active = active;
            return this;
        }

        @Deprecated
        public Builder setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }


        public Zone build() {
            return new Zone(id, dataSource, name, polygon, active, deviceId);
        }

    }
}
