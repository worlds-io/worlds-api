package io.worlds.api.model;


/**
 * A geofence event is a point-in-time representation of an interaction between a
[track]({{Types.track}}) and a
[geofence]({{Types.geofence}}). The event represents the track either
entering, leaving, or remaining within the geofence.
 */
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

    /**
     * The unique identifier of the geofence event.
     */
    public String getId() {
        return id;
    }
    /**
     * The unique identifier of the geofence event.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * The geofence indicated by the event.
     */
    public Geofence getGeofence() {
        return geofence;
    }
    /**
     * The geofence indicated by the event.
     */
    public void setGeofence(Geofence geofence) {
        this.geofence = geofence;
    }

    /**
     * The track indicated by the event.
     */
    public Track getTrack() {
        return track;
    }
    /**
     * The track indicated by the event.
     */
    public void setTrack(Track track) {
        this.track = track;
    }

    /**
     * [`geofenceEvents`]({{Queries.zoneintersections}}) is deprecated in favor of [`geofenceIntersections`]({{Queries.geofenceintersections}}),
    and `tag` will not be present on [`GeofenceIntersection`]({{Types.geofenceintersection}}).
    Use [track's tag]({{Types.track}}) instead.

    The class label of the object that triggered the geofence event, i.e person,
    car, truck, etc.
     */
    @Deprecated
    public String getTag() {
        return tag;
    }
    /**
     * [`geofenceEvents`]({{Queries.zoneintersections}}) is deprecated in favor of [`geofenceIntersections`]({{Queries.geofenceintersections}}),
    and `tag` will not be present on [`GeofenceIntersection`]({{Types.geofenceintersection}}).
    Use [track's tag]({{Types.track}}) instead.

    The class label of the object that triggered the geofence event, i.e person,
    car, truck, etc.
     */
    @Deprecated
    public void setTag(String tag) {
        this.tag = tag;
    }

    /**
     * [`geofenceEvents`]({{Queries.zoneintersections}}) is deprecated in favor of [`geofenceIntersections`]({{Queries.geofenceintersections}}),
    and `type` will not be present on [`GeofenceIntersection`]({{Types.geofenceintersection}}).\

    The type of geofence event, i.e ingress (an object entered the geofence), dwell
    (an object remained in the geofence), and egress. (an object exited the
    geofence)
     */
    @Deprecated
    public ActivityType getType() {
        return type;
    }
    /**
     * [`geofenceEvents`]({{Queries.zoneintersections}}) is deprecated in favor of [`geofenceIntersections`]({{Queries.geofenceintersections}}),
    and `type` will not be present on [`GeofenceIntersection`]({{Types.geofenceintersection}}).\

    The type of geofence event, i.e ingress (an object entered the geofence), dwell
    (an object remained in the geofence), and egress. (an object exited the
    geofence)
     */
    @Deprecated
    public void setType(ActivityType type) {
        this.type = type;
    }

    /**
     * [`geofenceEvents`]({{Queries.zoneintersections}}) is deprecated in favor of [`geofenceIntersections`]({{Queries.geofenceintersections}}),
    and `position` will not be present on [`GeofenceIntersection`]({{Types.geofenceintersection}}).

    The GeoJSON point for the position of the track at the time of the geofence
    event.
     */
    @Deprecated
    public GeoJSONPoint getPosition() {
        return position;
    }
    /**
     * [`geofenceEvents`]({{Queries.zoneintersections}}) is deprecated in favor of [`geofenceIntersections`]({{Queries.geofenceintersections}}),
    and `position` will not be present on [`GeofenceIntersection`]({{Types.geofenceintersection}}).

    The GeoJSON point for the position of the track at the time of the geofence
    event.
     */
    @Deprecated
    public void setPosition(GeoJSONPoint position) {
        this.position = position;
    }

    /**
     * [`geofenceEvents`]({{Queries.zoneintersections}}) is deprecated in favor of [`geofenceIntersections`]({{Queries.geofenceintersections}}),
    and `timestamp` will not be present on [`GeofenceIntersection`]({{Types.geofenceintersection}}).
    Use [`startTime`]({{Types.geofenceintersection}}) and [`endTime`]({{Types.geofenceintersection}}) instead.

    The timestamp at which the event occurred.
     */
    @Deprecated
    public java.time.OffsetDateTime getTimestamp() {
        return timestamp;
    }
    /**
     * [`geofenceEvents`]({{Queries.zoneintersections}}) is deprecated in favor of [`geofenceIntersections`]({{Queries.geofenceintersections}}),
    and `timestamp` will not be present on [`GeofenceIntersection`]({{Types.geofenceintersection}}).
    Use [`startTime`]({{Types.geofenceintersection}}) and [`endTime`]({{Types.geofenceintersection}}) instead.

    The timestamp at which the event occurred.
     */
    @Deprecated
    public void setTimestamp(java.time.OffsetDateTime timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * [`geofenceEvents`]({{Queries.zoneintersections}}) is deprecated in favor of [`geofenceIntersections`]({{Queries.geofenceintersections}}),
    and `metadata` will not be present on [`GeofenceIntersection`]({{Types.geofenceintersection}}).

    Any additional information about the event will be stored here.
     */
    @Deprecated
    public java.lang.Object getMetadata() {
        return metadata;
    }
    /**
     * [`geofenceEvents`]({{Queries.zoneintersections}}) is deprecated in favor of [`geofenceIntersections`]({{Queries.geofenceintersections}}),
    and `metadata` will not be present on [`GeofenceIntersection`]({{Types.geofenceintersection}}).

    Any additional information about the event will be stored here.
     */
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

        /**
         * The unique identifier of the geofence event.
         */
        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        /**
         * The geofence indicated by the event.
         */
        public Builder setGeofence(Geofence geofence) {
            this.geofence = geofence;
            return this;
        }

        /**
         * The track indicated by the event.
         */
        public Builder setTrack(Track track) {
            this.track = track;
            return this;
        }

        /**
         * [`geofenceEvents`]({{Queries.zoneintersections}}) is deprecated in favor of [`geofenceIntersections`]({{Queries.geofenceintersections}}),
    and `tag` will not be present on [`GeofenceIntersection`]({{Types.geofenceintersection}}).
    Use [track's tag]({{Types.track}}) instead.

    The class label of the object that triggered the geofence event, i.e person,
    car, truck, etc.
         */
        @Deprecated
        public Builder setTag(String tag) {
            this.tag = tag;
            return this;
        }

        /**
         * [`geofenceEvents`]({{Queries.zoneintersections}}) is deprecated in favor of [`geofenceIntersections`]({{Queries.geofenceintersections}}),
    and `type` will not be present on [`GeofenceIntersection`]({{Types.geofenceintersection}}).\

    The type of geofence event, i.e ingress (an object entered the geofence), dwell
    (an object remained in the geofence), and egress. (an object exited the
    geofence)
         */
        @Deprecated
        public Builder setType(ActivityType type) {
            this.type = type;
            return this;
        }

        /**
         * [`geofenceEvents`]({{Queries.zoneintersections}}) is deprecated in favor of [`geofenceIntersections`]({{Queries.geofenceintersections}}),
    and `position` will not be present on [`GeofenceIntersection`]({{Types.geofenceintersection}}).

    The GeoJSON point for the position of the track at the time of the geofence
    event.
         */
        @Deprecated
        public Builder setPosition(GeoJSONPoint position) {
            this.position = position;
            return this;
        }

        /**
         * [`geofenceEvents`]({{Queries.zoneintersections}}) is deprecated in favor of [`geofenceIntersections`]({{Queries.geofenceintersections}}),
    and `timestamp` will not be present on [`GeofenceIntersection`]({{Types.geofenceintersection}}).
    Use [`startTime`]({{Types.geofenceintersection}}) and [`endTime`]({{Types.geofenceintersection}}) instead.

    The timestamp at which the event occurred.
         */
        @Deprecated
        public Builder setTimestamp(java.time.OffsetDateTime timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        /**
         * [`geofenceEvents`]({{Queries.zoneintersections}}) is deprecated in favor of [`geofenceIntersections`]({{Queries.geofenceintersections}}),
    and `metadata` will not be present on [`GeofenceIntersection`]({{Types.geofenceintersection}}).

    Any additional information about the event will be stored here.
         */
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
