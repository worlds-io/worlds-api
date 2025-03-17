package io.worlds.api.model;


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

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public Geofence getGeofence() {
        return geofence;
    }
    public void setGeofence(Geofence geofence) {
        this.geofence = geofence;
    }

    public Track getTrack() {
        return track;
    }
    public void setTrack(Track track) {
        this.track = track;
    }

    public java.time.OffsetDateTime getStartTime() {
        return startTime;
    }
    public void setStartTime(java.time.OffsetDateTime startTime) {
        this.startTime = startTime;
    }

    public java.time.OffsetDateTime getEndTime() {
        return endTime;
    }
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

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setGeofence(Geofence geofence) {
            this.geofence = geofence;
            return this;
        }

        public Builder setTrack(Track track) {
            this.track = track;
            return this;
        }

        public Builder setStartTime(java.time.OffsetDateTime startTime) {
            this.startTime = startTime;
            return this;
        }

        public Builder setEndTime(java.time.OffsetDateTime endTime) {
            this.endTime = endTime;
            return this;
        }


        public GeofenceIntersection build() {
            return new GeofenceIntersection(id, geofence, track, startTime, endTime);
        }

    }
}
