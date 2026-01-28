package io.worlds.api.model;

import java.util.Objects;

/**
 * A data source is responsible for producing the videos, images and other sensor data that may eventually produce detections and tracks. For more details on detections, see [About Detections]({{Types.Detection}})
 */
public class DataSource implements java.io.Serializable, UnifiedSearchNameResponseEntity {

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
    private java.util.List<String> labels;

    public DataSource() {
    }

    public DataSource(String id, String name, DataSourceType type, Device device, java.util.List<Zone> zones, java.util.List<String> labels) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.device = device;
        this.zones = zones;
        this.labels = labels;
    }

    /**
     * The unique identifier of the data source.
     */
    public String getId() {
        return id;
    }
    /**
     * The unique identifier of the data source.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * The name of the data source
     */
    public String getName() {
        return name;
    }
    /**
     * The name of the data source
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * The type of the data source
     */
    public DataSourceType getType() {
        return type;
    }
    /**
     * The type of the data source
     */
    public void setType(DataSourceType type) {
        this.type = type;
    }

    /**
     * The device associated with this data source
     */
    public Device getDevice() {
        return device;
    }
    /**
     * The device associated with this data source
     */
    public void setDevice(Device device) {
        this.device = device;
    }

    /**
     * The zones associated with this data source
     */
    public java.util.List<Zone> getZones() {
        return zones;
    }
    /**
     * The zones associated with this data source
     */
    public void setZones(java.util.List<Zone> zones) {
        this.zones = zones;
    }

    /**
     * Human-readable labels describing this data source
     */
    public java.util.List<String> getLabels() {
        return labels;
    }
    /**
     * Human-readable labels describing this data source
     */
    public void setLabels(java.util.List<String> labels) {
        this.labels = labels;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final DataSource that = (DataSource) obj;
        return Objects.equals(id, that.id)
            && Objects.equals(name, that.name)
            && Objects.equals(type, that.type)
            && Objects.equals(device, that.device)
            && Objects.equals(zones, that.zones)
            && Objects.equals(labels, that.labels);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, type, device, zones, labels);
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
        private java.util.List<String> labels;

        public Builder() {
        }

        /**
         * The unique identifier of the data source.
         */
        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        /**
         * The name of the data source
         */
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        /**
         * The type of the data source
         */
        public Builder setType(DataSourceType type) {
            this.type = type;
            return this;
        }

        /**
         * The device associated with this data source
         */
        public Builder setDevice(Device device) {
            this.device = device;
            return this;
        }

        /**
         * The zones associated with this data source
         */
        public Builder setZones(java.util.List<Zone> zones) {
            this.zones = zones;
            return this;
        }

        /**
         * Human-readable labels describing this data source
         */
        public Builder setLabels(java.util.List<String> labels) {
            this.labels = labels;
            return this;
        }


        public DataSource build() {
            return new DataSource(id, name, type, device, zones, labels);
        }

    }
}
