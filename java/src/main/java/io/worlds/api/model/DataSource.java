package io.worlds.api.model;


public class DataSource implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private String id;
    @jakarta.validation.constraints.NotNull
    private String name;
    @jakarta.validation.constraints.NotNull
    private DataSourceType type;
    private Device device;
    @jakarta.validation.constraints.NotNull
    private java.util.List<Zone> zones;

    public DataSource() {
    }

    public DataSource(String id, String name, DataSourceType type, Device device, java.util.List<Zone> zones) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.device = device;
        this.zones = zones;
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

    public DataSourceType getType() {
        return type;
    }
    public void setType(DataSourceType type) {
        this.type = type;
    }

    public Device getDevice() {
        return device;
    }
    public void setDevice(Device device) {
        this.device = device;
    }

    public java.util.List<Zone> getZones() {
        return zones;
    }
    public void setZones(java.util.List<Zone> zones) {
        this.zones = zones;
    }



    public static DataSource.Builder builder() {
        return new DataSource.Builder();
    }

    public static class Builder {

        private String id;
        private String name;
        private DataSourceType type;
        private Device device;
        private java.util.List<Zone> zones;

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

        public Builder setType(DataSourceType type) {
            this.type = type;
            return this;
        }

        public Builder setDevice(Device device) {
            this.device = device;
            return this;
        }

        public Builder setZones(java.util.List<Zone> zones) {
            this.zones = zones;
            return this;
        }


        public DataSource build() {
            return new DataSource(id, name, type, device, zones);
        }

    }
}
