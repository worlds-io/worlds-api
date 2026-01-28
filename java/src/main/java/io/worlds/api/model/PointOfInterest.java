package io.worlds.api.model;

import java.util.Objects;

/**
 * A point of interest is a designated area within a Site, used to subdivide a location into meaningful sections. Each POI belongs to a single [Site]({{Types.Site}}) and can contain multiple [Devices]({{Types.Device}}).
 */
public class PointOfInterest implements java.io.Serializable, UnifiedSearchNameResponseEntity {

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

    /**
     * The unique identifier of the point of interest.
     */
    public String getId() {
        return id;
    }
    /**
     * The unique identifier of the point of interest.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * The site the point of interest belongs to.
     */
    public Site getSite() {
        return site;
    }
    /**
     * The site the point of interest belongs to.
     */
    public void setSite(Site site) {
        this.site = site;
    }

    /**
     * The name of the point of interest.
     */
    public String getName() {
        return name;
    }
    /**
     * The name of the point of interest.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * The geographic position of the point of interest
     */
    public GeoJSONPoint getPosition() {
        return position;
    }
    /**
     * The geographic position of the point of interest
     */
    public void setPosition(GeoJSONPoint position) {
        this.position = position;
    }

    /**
     * The devices located within the point of interest.
     */
    public java.util.List<Device> getDevices() {
        return devices;
    }
    /**
     * The devices located within the point of interest.
     */
    public void setDevices(java.util.List<Device> devices) {
        this.devices = devices;
    }

    /**
     * The geofences located within the point of interest
     */
    public java.util.List<Geofence> getGeofences() {
        return geofences;
    }
    /**
     * The geofences located within the point of interest
     */
    public void setGeofences(java.util.List<Geofence> geofences) {
        this.geofences = geofences;
    }

    /**
     * The metadata associated with the point of interest.
     */
    public java.lang.Object getMetadata() {
        return metadata;
    }
    /**
     * The metadata associated with the point of interest.
     */
    public void setMetadata(java.lang.Object metadata) {
        this.metadata = metadata;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final PointOfInterest that = (PointOfInterest) obj;
        return Objects.equals(id, that.id)
            && Objects.equals(site, that.site)
            && Objects.equals(name, that.name)
            && Objects.equals(position, that.position)
            && Objects.equals(devices, that.devices)
            && Objects.equals(geofences, that.geofences)
            && Objects.equals(metadata, that.metadata);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, site, name, position, devices, geofences, metadata);
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

        /**
         * The unique identifier of the point of interest.
         */
        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        /**
         * The site the point of interest belongs to.
         */
        public Builder setSite(Site site) {
            this.site = site;
            return this;
        }

        /**
         * The name of the point of interest.
         */
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        /**
         * The geographic position of the point of interest
         */
        public Builder setPosition(GeoJSONPoint position) {
            this.position = position;
            return this;
        }

        /**
         * The devices located within the point of interest.
         */
        public Builder setDevices(java.util.List<Device> devices) {
            this.devices = devices;
            return this;
        }

        /**
         * The geofences located within the point of interest
         */
        public Builder setGeofences(java.util.List<Geofence> geofences) {
            this.geofences = geofences;
            return this;
        }

        /**
         * The metadata associated with the point of interest.
         */
        public Builder setMetadata(java.lang.Object metadata) {
            this.metadata = metadata;
            return this;
        }


        public PointOfInterest build() {
            return new PointOfInterest(id, site, name, position, devices, geofences, metadata);
        }

    }
}
