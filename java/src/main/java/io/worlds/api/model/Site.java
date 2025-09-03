package io.worlds.api.model;


/**
 * A site represents a business location, such as an office building, a facility or a campus. Sites can be used to logically and geospatially group various objects and events that share a physical space, such as [Devices]({{Types.devices}}), [Geofences]({{Types.geofences}}).
 */
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

    /**
     * The unique identifier of the site.
     */
    public String getId() {
        return id;
    }
    /**
     * The unique identifier of the site.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * The name of the site.
     */
    public String getName() {
        return name;
    }
    /**
     * The name of the site.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * The geographic location of the site
     */
    public GeoJSONPoint getPosition() {
        return position;
    }
    /**
     * The geographic location of the site
     */
    public void setPosition(GeoJSONPoint position) {
        this.position = position;
    }

    /**
     * The geographic shape of the site
     */
    public GeoJSONMultiPolygon getPolygon() {
        return polygon;
    }
    /**
     * The geographic shape of the site
     */
    public void setPolygon(GeoJSONMultiPolygon polygon) {
        this.polygon = polygon;
    }

    /**
     * The devices that are associated with the site
     */
    public java.util.List<Device> getDevices() {
        return devices;
    }
    /**
     * The devices that are associated with the site
     */
    public void setDevices(java.util.List<Device> devices) {
        this.devices = devices;
    }

    /**
     * The points of interest that are associated with this site
     */
    public java.util.List<PointOfInterest> getPointsOfInterest() {
        return pointsOfInterest;
    }
    /**
     * The points of interest that are associated with this site
     */
    public void setPointsOfInterest(java.util.List<PointOfInterest> pointsOfInterest) {
        this.pointsOfInterest = pointsOfInterest;
    }

    /**
     * The geofences that are associated with this site
     */
    public java.util.List<Geofence> getGeofences() {
        return geofences;
    }
    /**
     * The geofences that are associated with this site
     */
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

        /**
         * The unique identifier of the site.
         */
        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        /**
         * The name of the site.
         */
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        /**
         * The geographic location of the site
         */
        public Builder setPosition(GeoJSONPoint position) {
            this.position = position;
            return this;
        }

        /**
         * The geographic shape of the site
         */
        public Builder setPolygon(GeoJSONMultiPolygon polygon) {
            this.polygon = polygon;
            return this;
        }

        /**
         * The devices that are associated with the site
         */
        public Builder setDevices(java.util.List<Device> devices) {
            this.devices = devices;
            return this;
        }

        /**
         * The points of interest that are associated with this site
         */
        public Builder setPointsOfInterest(java.util.List<PointOfInterest> pointsOfInterest) {
            this.pointsOfInterest = pointsOfInterest;
            return this;
        }

        /**
         * The geofences that are associated with this site
         */
        public Builder setGeofences(java.util.List<Geofence> geofences) {
            this.geofences = geofences;
            return this;
        }


        public Site build() {
            return new Site(id, name, position, polygon, devices, pointsOfInterest, geofences);
        }

    }
}
