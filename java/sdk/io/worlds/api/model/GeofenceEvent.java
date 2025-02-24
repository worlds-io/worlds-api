package io.worlds.api.model;


public class GeofenceEvent implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private String id;
    @jakarta.validation.constraints.NotNull
    private Geofence geofence;
    @jakarta.validation.constraints.NotNull
    private Track track;
    @Deprecated
    @jakarta.validation.constraints.NotNull
    private String tag;
    @Deprecated
    @jakarta.validation.constraints.NotNull
    private ActivityType type;
    @Deprecated
    @jakarta.validation.constraints.NotNull
    private GeoJSONPoint position;
    @Deprecated
    @jakarta.validation.constraints.NotNull
    private java.time.OffsetDateTime timestamp;
    @Deprecated
    private java.lang.Object metadata;

    public GeofenceEvent() {
    }

    public GeofenceEvent(String id, Geofence geofence, Track track, String tag, ActivityType type, GeoJSONPoint position, java.time.OffsetDateTime timestamp, java.lang.Object metadata) {
        this.id = id;
        this.geofence = geofence;
        this.track = track;
        this.tag = tag;
        this.type = type;
        this.position = position;
        this.timestamp = timestamp;
        this.metadata = metadata;
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

    @Deprecated
    public String getTag() {
        return tag;
    }
    @Deprecated
    public void setTag(String tag) {
        this.tag = tag;
    }

    @Deprecated
    public ActivityType getType() {
        return type;
    }
    @Deprecated
    public void setType(ActivityType type) {
        this.type = type;
    }

    @Deprecated
    public GeoJSONPoint getPosition() {
        return position;
    }
    @Deprecated
    public void setPosition(GeoJSONPoint position) {
        this.position = position;
    }

    @Deprecated
    public java.time.OffsetDateTime getTimestamp() {
        return timestamp;
    }
    @Deprecated
    public void setTimestamp(java.time.OffsetDateTime timestamp) {
        this.timestamp = timestamp;
    }

    @Deprecated
    public java.lang.Object getMetadata() {
        return metadata;
    }
    @Deprecated
    public void setMetadata(java.lang.Object metadata) {
        this.metadata = metadata;
    }



    public static GeofenceEvent.Builder builder() {
        return new GeofenceEvent.Builder();
    }

    public static class Builder {

        private String id;
        private Geofence geofence;
        private Track track;
        private String tag;
        private ActivityType type;
        private GeoJSONPoint position;
        private java.time.OffsetDateTime timestamp;
        private java.lang.Object metadata;

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

        @Deprecated
        public Builder setTag(String tag) {
            this.tag = tag;
            return this;
        }

        @Deprecated
        public Builder setType(ActivityType type) {
            this.type = type;
            return this;
        }

        @Deprecated
        public Builder setPosition(GeoJSONPoint position) {
            this.position = position;
            return this;
        }

        @Deprecated
        public Builder setTimestamp(java.time.OffsetDateTime timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        @Deprecated
        public Builder setMetadata(java.lang.Object metadata) {
            this.metadata = metadata;
            return this;
        }


        public GeofenceEvent build() {
            return new GeofenceEvent(id, geofence, track, tag, type, position, timestamp, metadata);
        }

    }
}
