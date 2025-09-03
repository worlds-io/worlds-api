package io.worlds.api.model;


/**
 * A geofence is a user-defined region in world coordinates. When a
[detection]({{Types.detection}}) occurs within a geofence, or a
[track]({{Types.track}}) crosses the border of a geofence, a [geofence
event]({{Types.geofenceevent}}) is created. Geofence events, along
with [zone events]({{Types.zoneevent}}) are a key part of creating
custom business logic with Worlds.
 */
public class Geofence implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private String id;
    @jakarta.validation.constraints.NotNull
    private String name;
    @jakarta.validation.constraints.NotNull
    private GeofenceBounds bounds;
    private boolean active;

    public Geofence() {
    }

    public Geofence(String id, String name, GeofenceBounds bounds, boolean active) {
        this.id = id;
        this.name = name;
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



    public static Geofence.Builder builder() {
        return new Geofence.Builder();
    }

    public static class Builder {

        private String id;
        private String name;
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
            return new Geofence(id, name, bounds, active);
        }

    }
}
