package io.worlds.api.model;


public class Site implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private String id;
    @jakarta.validation.constraints.NotNull
    private String name;
    private GeoJSONPoint position;
    private GeoJSONMultiPolygon polygon;
    @jakarta.validation.constraints.NotNull
    private java.util.List<Device> devices;
    @jakarta.validation.constraints.NotNull
    private java.util.List<PointOfInterest> pointsOfInterest;
    @jakarta.validation.constraints.NotNull
    private java.util.List<Geofence> geofences;

    public Site() {
    }

    public Site(String id, String name, GeoJSONPoint position, GeoJSONMultiPolygon polygon, java.util.List<Device> devices, java.util.List<PointOfInterest> pointsOfInterest, java.util.List<Geofence> geofences) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.polygon = polygon;
        this.devices = devices;
        this.pointsOfInterest = pointsOfInterest;
        this.geofences = geofences;
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

    public GeoJSONPoint getPosition() {
        return position;
    }
    public void setPosition(GeoJSONPoint position) {
        this.position = position;
    }

    public GeoJSONMultiPolygon getPolygon() {
        return polygon;
    }
    public void setPolygon(GeoJSONMultiPolygon polygon) {
        this.polygon = polygon;
    }

    public java.util.List<Device> getDevices() {
        return devices;
    }
    public void setDevices(java.util.List<Device> devices) {
        this.devices = devices;
    }

    public java.util.List<PointOfInterest> getPointsOfInterest() {
        return pointsOfInterest;
    }
    public void setPointsOfInterest(java.util.List<PointOfInterest> pointsOfInterest) {
        this.pointsOfInterest = pointsOfInterest;
    }

    public java.util.List<Geofence> getGeofences() {
        return geofences;
    }
    public void setGeofences(java.util.List<Geofence> geofences) {
        this.geofences = geofences;
    }



    public static Site.Builder builder() {
        return new Site.Builder();
    }

    public static class Builder {

        private String id;
        private String name;
        private GeoJSONPoint position;
        private GeoJSONMultiPolygon polygon;
        private java.util.List<Device> devices;
        private java.util.List<PointOfInterest> pointsOfInterest;
        private java.util.List<Geofence> geofences;

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

        public Builder setPosition(GeoJSONPoint position) {
            this.position = position;
            return this;
        }

        public Builder setPolygon(GeoJSONMultiPolygon polygon) {
            this.polygon = polygon;
            return this;
        }

        public Builder setDevices(java.util.List<Device> devices) {
            this.devices = devices;
            return this;
        }

        public Builder setPointsOfInterest(java.util.List<PointOfInterest> pointsOfInterest) {
            this.pointsOfInterest = pointsOfInterest;
            return this;
        }

        public Builder setGeofences(java.util.List<Geofence> geofences) {
            this.geofences = geofences;
            return this;
        }


        public Site build() {
            return new Site(id, name, position, polygon, devices, pointsOfInterest, geofences);
        }

    }
}
