package io.worlds.api.model;


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
    private Site site;
    @jakarta.validation.constraints.NotNull
    private java.util.List<DeviceCalibration> calibrations;
    private PointOfInterest pointOfInterest;

    public Device() {
    }

    public Device(String id, String uuid, String externalId, String name, boolean enabled, String address, Double frameRate, GeoJSONPoint position, Site site, java.util.List<DeviceCalibration> calibrations, PointOfInterest pointOfInterest) {
        this.id = id;
        this.uuid = uuid;
        this.externalId = externalId;
        this.name = name;
        this.enabled = enabled;
        this.address = address;
        this.frameRate = frameRate;
        this.position = position;
        this.site = site;
        this.calibrations = calibrations;
        this.pointOfInterest = pointOfInterest;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getUuid() {
        return uuid;
    }
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getExternalId() {
        return externalId;
    }
    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public boolean getEnabled() {
        return enabled;
    }
    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public Double getFrameRate() {
        return frameRate;
    }
    public void setFrameRate(Double frameRate) {
        this.frameRate = frameRate;
    }

    public GeoJSONPoint getPosition() {
        return position;
    }
    public void setPosition(GeoJSONPoint position) {
        this.position = position;
    }

    public Site getSite() {
        return site;
    }
    public void setSite(Site site) {
        this.site = site;
    }

    public java.util.List<DeviceCalibration> getCalibrations() {
        return calibrations;
    }
    public void setCalibrations(java.util.List<DeviceCalibration> calibrations) {
        this.calibrations = calibrations;
    }

    public PointOfInterest getPointOfInterest() {
        return pointOfInterest;
    }
    public void setPointOfInterest(PointOfInterest pointOfInterest) {
        this.pointOfInterest = pointOfInterest;
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
        private Site site;
        private java.util.List<DeviceCalibration> calibrations;
        private PointOfInterest pointOfInterest;

        public Builder() {
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }

        public Builder setExternalId(String externalId) {
            this.externalId = externalId;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setEnabled(boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder setFrameRate(Double frameRate) {
            this.frameRate = frameRate;
            return this;
        }

        public Builder setPosition(GeoJSONPoint position) {
            this.position = position;
            return this;
        }

        public Builder setSite(Site site) {
            this.site = site;
            return this;
        }

        public Builder setCalibrations(java.util.List<DeviceCalibration> calibrations) {
            this.calibrations = calibrations;
            return this;
        }

        public Builder setPointOfInterest(PointOfInterest pointOfInterest) {
            this.pointOfInterest = pointOfInterest;
            return this;
        }


        public Device build() {
            return new Device(id, uuid, externalId, name, enabled, address, frameRate, position, site, calibrations, pointOfInterest);
        }

    }
}
