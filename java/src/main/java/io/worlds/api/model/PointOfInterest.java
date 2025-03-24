package io.worlds.api.model;


public class PointOfInterest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private String id;
    @jakarta.validation.constraints.NotNull
    private Site site;
    @jakarta.validation.constraints.NotNull
    private String name;
    @jakarta.validation.constraints.NotNull
    private GeoJSONPoint position;
    @jakarta.validation.constraints.NotNull
    private java.util.List<Device> devices;
    @jakarta.validation.constraints.NotNull
    private java.util.List<Geofence> geofences;
    private java.lang.Object metadata;

    public PointOfInterest() {
    }

    public PointOfInterest(String id, Site site, String name, GeoJSONPoint position, java.util.List<Device> devices, java.util.List<Geofence> geofences, java.lang.Object metadata) {
        this.id = id;
        this.site = site;
        this.name = name;
        this.position = position;
        this.devices = devices;
        this.geofences = geofences;
        this.metadata = metadata;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public Site getSite() {
        return site;
    }
    public void setSite(Site site) {
        this.site = site;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public GeoJSONPoint getPosition() {
        return position;
    }
    public void setPosition(GeoJSONPoint position) {
        this.position = position;
    }

    public java.util.List<Device> getDevices() {
        return devices;
    }
    public void setDevices(java.util.List<Device> devices) {
        this.devices = devices;
    }

    public java.util.List<Geofence> getGeofences() {
        return geofences;
    }
    public void setGeofences(java.util.List<Geofence> geofences) {
        this.geofences = geofences;
    }

    public java.lang.Object getMetadata() {
        return metadata;
    }
    public void setMetadata(java.lang.Object metadata) {
        this.metadata = metadata;
    }



    public static PointOfInterest.Builder builder() {
        return new PointOfInterest.Builder();
    }

    public static class Builder {

        private String id;
        private Site site;
        private String name;
        private GeoJSONPoint position;
        private java.util.List<Device> devices;
        private java.util.List<Geofence> geofences;
        private java.lang.Object metadata;

        public Builder() {
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setSite(Site site) {
            this.site = site;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setPosition(GeoJSONPoint position) {
            this.position = position;
            return this;
        }

        public Builder setDevices(java.util.List<Device> devices) {
            this.devices = devices;
            return this;
        }

        public Builder setGeofences(java.util.List<Geofence> geofences) {
            this.geofences = geofences;
            return this;
        }

        public Builder setMetadata(java.lang.Object metadata) {
            this.metadata = metadata;
            return this;
        }


        public PointOfInterest build() {
            return new PointOfInterest(id, site, name, position, devices, geofences, metadata);
        }

    }
}
