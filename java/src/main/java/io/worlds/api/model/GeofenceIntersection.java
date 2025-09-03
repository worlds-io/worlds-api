package io.worlds.api.model;


/**
 * A geofence intersection is a point-in-time representation of an interaction between a
[track]({{Types.track}}) and a
[geofence]({{Types.geofence}}).
 */
public class GeofenceIntersection implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private String id;
    @jakarta.validation.constraints.NotNull
    private Geofence geofence;
    @jakarta.validation.constraints.NotNull
    private Track track;
    @jakarta.validation.constraints.NotNull
    private java.time.OffsetDateTime startTime;
    private java.time.OffsetDateTime endTime;

    public GeofenceIntersection() {
    }

    public GeofenceIntersection(String id, Geofence geofence, Track track, java.time.OffsetDateTime startTime, java.time.OffsetDateTime endTime) {
        this.id = id;
        this.geofence = geofence;
        this.track = track;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    /**
     * The unique identifier of the geofence intersection.
     */
    public String getId() {
        return id;
    }
    /**
     * The unique identifier of the geofence intersection.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * The geofence indicated by the intersection.
     */
    public Geofence getGeofence() {
        return geofence;
    }
    /**
     * The geofence indicated by the intersection.
     */
    public void setGeofence(Geofence geofence) {
        this.geofence = geofence;
    }

    /**
     * The track indicated by the intersection.
     */
    public Track getTrack() {
        return track;
    }
    /**
     * The track indicated by the intersection.
     */
    public void setTrack(Track track) {
        this.track = track;
    }

    /**
     * The time at which the intersection started.
     */
    public java.time.OffsetDateTime getStartTime() {
        return startTime;
    }
    /**
     * The time at which the intersection started.
     */
    public void setStartTime(java.time.OffsetDateTime startTime) {
        this.startTime = startTime;
    }

    /**
     * The time at which the intersection ended.
     */
    public java.time.OffsetDateTime getEndTime() {
        return endTime;
    }
    /**
     * The time at which the intersection ended.
     */
    public void setEndTime(java.time.OffsetDateTime endTime) {
        this.endTime = endTime;
    }



    public static GeofenceIntersection.Builder builder() {
        return new GeofenceIntersection.Builder();
    }

    public static class Builder {

        private String id;
        private Geofence geofence;
        private Track track;
        private java.time.OffsetDateTime startTime;
        private java.time.OffsetDateTime endTime;

        public Builder() {
        }

        /**
         * The unique identifier of the geofence intersection.
         */
        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        /**
         * The geofence indicated by the intersection.
         */
        public Builder setGeofence(Geofence geofence) {
            this.geofence = geofence;
            return this;
        }

        /**
         * The track indicated by the intersection.
         */
        public Builder setTrack(Track track) {
            this.track = track;
            return this;
        }

        /**
         * The time at which the intersection started.
         */
        public Builder setStartTime(java.time.OffsetDateTime startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * The time at which the intersection ended.
         */
        public Builder setEndTime(java.time.OffsetDateTime endTime) {
            this.endTime = endTime;
            return this;
        }


        public GeofenceIntersection build() {
            return new GeofenceIntersection(id, geofence, track, startTime, endTime);
        }

    }
}
