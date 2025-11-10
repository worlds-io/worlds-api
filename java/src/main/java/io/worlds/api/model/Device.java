package io.worlds.api.model;

import java.util.Objects;

/**
 * A device represents a camera: a source of videos and images. These videos and images may then be processed to produce detections and tracks or to train models. For more details on detections, see [About Detections]({{Types.Detection}}).
 */
public class Device implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private String id;
    @jakarta.validation.constraints.NotNull
    private String uuid;
    private String externalId;
    @jakarta.validation.constraints.NotNull
    private String name;
    private boolean enabled;
    private String address;
    private Double frameRate;
    private GeoJSONPoint position;
    private DataSource dataSource;
    private Site site;
    @jakarta.validation.constraints.NotNull
    private java.util.List<DeviceCalibration> calibrations;
    private PointOfInterest pointOfInterest;
    private java.time.OffsetDateTime lastHeartbeat;

    public Device() {
    }

    public Device(String id, String uuid, String externalId, String name, boolean enabled, String address, Double frameRate, GeoJSONPoint position, DataSource dataSource, Site site, java.util.List<DeviceCalibration> calibrations, PointOfInterest pointOfInterest, java.time.OffsetDateTime lastHeartbeat) {
        this.id = id;
        this.uuid = uuid;
        this.externalId = externalId;
        this.name = name;
        this.enabled = enabled;
        this.address = address;
        this.frameRate = frameRate;
        this.position = position;
        this.dataSource = dataSource;
        this.site = site;
        this.calibrations = calibrations;
        this.pointOfInterest = pointOfInterest;
        this.lastHeartbeat = lastHeartbeat;
    }

    /**
     * The unique identifier of the device.
     */
    public String getId() {
        return id;
    }
    /**
     * The unique identifier of the device.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * An alternative UUID for the device.
     */
    public String getUuid() {
        return uuid;
    }
    /**
     * An alternative UUID for the device.
     */
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    /**
     * An identifier that the device may use outside of Worlds.
     */
    public String getExternalId() {
        return externalId;
    }
    /**
     * An identifier that the device may use outside of Worlds.
     */
    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    /**
     * The name of the device
     */
    public String getName() {
        return name;
    }
    /**
     * The name of the device
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * `true` if the device's feed is being persisted by Worlds.
     */
    public boolean getEnabled() {
        return enabled;
    }
    /**
     * `true` if the device's feed is being persisted by Worlds.
     */
    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * The address of the device
     */
    public String getAddress() {
        return address;
    }
    /**
     * The address of the device
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * The target frame rate for videos produced by this Device
     */
    public Double getFrameRate() {
        return frameRate;
    }
    /**
     * The target frame rate for videos produced by this Device
     */
    public void setFrameRate(Double frameRate) {
        this.frameRate = frameRate;
    }

    /**
     * The geographic location of the device
     */
    public GeoJSONPoint getPosition() {
        return position;
    }
    /**
     * The geographic location of the device
     */
    public void setPosition(GeoJSONPoint position) {
        this.position = position;
    }

    /**
     * The data source associated with this device
     */
    public DataSource getDataSource() {
        return dataSource;
    }
    /**
     * The data source associated with this device
     */
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    /**
     * The site that this device belongs to
     */
    public Site getSite() {
        return site;
    }
    /**
     * The site that this device belongs to
     */
    public void setSite(Site site) {
        this.site = site;
    }

    /**
     * The list of calibrations for the device
     */
    public java.util.List<DeviceCalibration> getCalibrations() {
        return calibrations;
    }
    /**
     * The list of calibrations for the device
     */
    public void setCalibrations(java.util.List<DeviceCalibration> calibrations) {
        this.calibrations = calibrations;
    }

    /**
     * The point of interest the device belongs to
     */
    public PointOfInterest getPointOfInterest() {
        return pointOfInterest;
    }
    /**
     * The point of interest the device belongs to
     */
    public void setPointOfInterest(PointOfInterest pointOfInterest) {
        this.pointOfInterest = pointOfInterest;
    }

    /**
     * Timestamp at which this device last received a heartbeat update.  Can be used to confirm the device is still active.
     */
    public java.time.OffsetDateTime getLastHeartbeat() {
        return lastHeartbeat;
    }
    /**
     * Timestamp at which this device last received a heartbeat update.  Can be used to confirm the device is still active.
     */
    public void setLastHeartbeat(java.time.OffsetDateTime lastHeartbeat) {
        this.lastHeartbeat = lastHeartbeat;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final Device that = (Device) obj;
        return Objects.equals(id, that.id)
            && Objects.equals(uuid, that.uuid)
            && Objects.equals(externalId, that.externalId)
            && Objects.equals(name, that.name)
            && Objects.equals(enabled, that.enabled)
            && Objects.equals(address, that.address)
            && Objects.equals(frameRate, that.frameRate)
            && Objects.equals(position, that.position)
            && Objects.equals(dataSource, that.dataSource)
            && Objects.equals(site, that.site)
            && Objects.equals(calibrations, that.calibrations)
            && Objects.equals(pointOfInterest, that.pointOfInterest)
            && Objects.equals(lastHeartbeat, that.lastHeartbeat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, uuid, externalId, name, enabled, address, frameRate, position, dataSource, site, calibrations, pointOfInterest, lastHeartbeat);
    }


    public static Device.Builder builder() {
        return new Device.Builder();
    }

    public static class Builder {

        private String id;
        private String uuid;
        private String externalId;
        private String name;
        private boolean enabled;
        private String address;
        private Double frameRate;
        private GeoJSONPoint position;
        private DataSource dataSource;
        private Site site;
        private java.util.List<DeviceCalibration> calibrations;
        private PointOfInterest pointOfInterest;
        private java.time.OffsetDateTime lastHeartbeat;

        public Builder() {
        }

        /**
         * The unique identifier of the device.
         */
        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        /**
         * An alternative UUID for the device.
         */
        public Builder setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }

        /**
         * An identifier that the device may use outside of Worlds.
         */
        public Builder setExternalId(String externalId) {
            this.externalId = externalId;
            return this;
        }

        /**
         * The name of the device
         */
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        /**
         * `true` if the device's feed is being persisted by Worlds.
         */
        public Builder setEnabled(boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        /**
         * The address of the device
         */
        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        /**
         * The target frame rate for videos produced by this Device
         */
        public Builder setFrameRate(Double frameRate) {
            this.frameRate = frameRate;
            return this;
        }

        /**
         * The geographic location of the device
         */
        public Builder setPosition(GeoJSONPoint position) {
            this.position = position;
            return this;
        }

        /**
         * The data source associated with this device
         */
        public Builder setDataSource(DataSource dataSource) {
            this.dataSource = dataSource;
            return this;
        }

        /**
         * The site that this device belongs to
         */
        public Builder setSite(Site site) {
            this.site = site;
            return this;
        }

        /**
         * The list of calibrations for the device
         */
        public Builder setCalibrations(java.util.List<DeviceCalibration> calibrations) {
            this.calibrations = calibrations;
            return this;
        }

        /**
         * The point of interest the device belongs to
         */
        public Builder setPointOfInterest(PointOfInterest pointOfInterest) {
            this.pointOfInterest = pointOfInterest;
            return this;
        }

        /**
         * Timestamp at which this device last received a heartbeat update.  Can be used to confirm the device is still active.
         */
        public Builder setLastHeartbeat(java.time.OffsetDateTime lastHeartbeat) {
            this.lastHeartbeat = lastHeartbeat;
            return this;
        }


        public Device build() {
            return new Device(id, uuid, externalId, name, enabled, address, frameRate, position, dataSource, site, calibrations, pointOfInterest, lastHeartbeat);
        }

    }
}
