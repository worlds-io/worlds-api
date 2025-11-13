package io.worlds.api.model;

import java.util.Objects;

/**
 * A geofence is a user-defined region in world coordinates. When a
[detection]({{Types.Detection}}) occurs within a geofence, or a
[track]({{Types.Track}}) crosses the border of a geofence, a [geofence
event]({{Types.GeofenceEvent}}) is created. Geofence events, along
with [zone events]({{Types.ZoneEvent}}) are a key part of creating
custom business logic with Worlds.
 */
public class Geofence implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private String id;
    @jakarta.validation.constraints.NotNull
    private String name;
    @jakarta.validation.constraints.NotNull
    private java.util.List<String> labels;
    private Site site;
    private PointOfInterest pointOfInterest;
    @jakarta.validation.constraints.NotNull
    private GeofenceBounds bounds;
    private boolean active;

    public Geofence() {
    }

    public Geofence(String id, String name, java.util.List<String> labels, Site site, PointOfInterest pointOfInterest, GeofenceBounds bounds, boolean active) {
        this.id = id;
        this.name = name;
        this.labels = labels;
        this.site = site;
        this.pointOfInterest = pointOfInterest;
        this.bounds = bounds;
        this.active = active;
    }

    /**
     * The unique identifier of the geofence.
     */
    public String getId() {
        return id;
    }
    /**
     * The unique identifier of the geofence.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * The display name of the geofence.
     */
    public String getName() {
        return name;
    }
    /**
     * The display name of the geofence.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Human-readable labels describing this geofence.
     */
    public java.util.List<String> getLabels() {
        return labels;
    }
    /**
     * Human-readable labels describing this geofence.
     */
    public void setLabels(java.util.List<String> labels) {
        this.labels = labels;
    }

    /**
     * The site that the geofence belongs to.
     */
    public Site getSite() {
        return site;
    }
    /**
     * The site that the geofence belongs to.
     */
    public void setSite(Site site) {
        this.site = site;
    }

    /**
     * The point of interest that the geofence belongs to.
     */
    public PointOfInterest getPointOfInterest() {
        return pointOfInterest;
    }
    /**
     * The point of interest that the geofence belongs to.
     */
    public void setPointOfInterest(PointOfInterest pointOfInterest) {
        this.pointOfInterest = pointOfInterest;
    }

    /**
     * An object that represents the bounds of the geofence.
     */
    public GeofenceBounds getBounds() {
        return bounds;
    }
    /**
     * An object that represents the bounds of the geofence.
     */
    public void setBounds(GeofenceBounds bounds) {
        this.bounds = bounds;
    }

    /**
     * True if the geofence is active, otherwise false. Geofences that are not active
will not produce events.
     */
    public boolean getActive() {
        return active;
    }
    /**
     * True if the geofence is active, otherwise false. Geofences that are not active
will not produce events.
     */
    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final Geofence that = (Geofence) obj;
        return Objects.equals(id, that.id)
            && Objects.equals(name, that.name)
            && Objects.equals(labels, that.labels)
            && Objects.equals(site, that.site)
            && Objects.equals(pointOfInterest, that.pointOfInterest)
            && Objects.equals(bounds, that.bounds)
            && Objects.equals(active, that.active);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, labels, site, pointOfInterest, bounds, active);
    }


    public static Geofence.Builder builder() {
        return new Geofence.Builder();
    }

    public static class Builder {

        private String id;
        private String name;
        private java.util.List<String> labels;
        private Site site;
        private PointOfInterest pointOfInterest;
        private GeofenceBounds bounds;
        private boolean active;

        public Builder() {
        }

        /**
         * The unique identifier of the geofence.
         */
        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        /**
         * The display name of the geofence.
         */
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        /**
         * Human-readable labels describing this geofence.
         */
        public Builder setLabels(java.util.List<String> labels) {
            this.labels = labels;
            return this;
        }

        /**
         * The site that the geofence belongs to.
         */
        public Builder setSite(Site site) {
            this.site = site;
            return this;
        }

        /**
         * The point of interest that the geofence belongs to.
         */
        public Builder setPointOfInterest(PointOfInterest pointOfInterest) {
            this.pointOfInterest = pointOfInterest;
            return this;
        }

        /**
         * An object that represents the bounds of the geofence.
         */
        public Builder setBounds(GeofenceBounds bounds) {
            this.bounds = bounds;
            return this;
        }

        /**
         * True if the geofence is active, otherwise false. Geofences that are not active
will not produce events.
         */
        public Builder setActive(boolean active) {
            this.active = active;
            return this;
        }


        public Geofence build() {
            return new Geofence(id, name, labels, site, pointOfInterest, bounds, active);
        }

    }
}
