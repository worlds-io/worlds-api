package io.worlds.api.model;


public class Detection implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private Track track;
    @jakarta.validation.constraints.NotNull
    private java.time.OffsetDateTime timestamp;
    private Frame frame;
    private GeoJSONPolygon polygon;
    private GeoJSONPoint position;
    @jakarta.validation.constraints.NotNull
    private java.util.List<String> zoneIds;
    @jakarta.validation.constraints.NotNull
    private java.util.List<String> geofenceIds;
    private java.lang.Object metadata;
    private java.time.OffsetDateTime createdAt;
    private java.time.OffsetDateTime updatedAt;
    private Double direction;
    @Deprecated
    @jakarta.validation.constraints.NotNull
    private java.util.List<ZoneEvent> zoneEvents;
    @Deprecated
    @jakarta.validation.constraints.NotNull
    private java.util.List<GeofenceEvent> geofenceEvents;
    @Deprecated
    private String globalTrackId;
    @Deprecated
    private String deviceId;
    @Deprecated
    @jakarta.validation.constraints.NotNull
    private String tag;

    public Detection() {
    }

    public Detection(Track track, java.time.OffsetDateTime timestamp, Frame frame, GeoJSONPolygon polygon, GeoJSONPoint position, java.util.List<String> zoneIds, java.util.List<String> geofenceIds, java.lang.Object metadata, java.time.OffsetDateTime createdAt, java.time.OffsetDateTime updatedAt, Double direction, java.util.List<ZoneEvent> zoneEvents, java.util.List<GeofenceEvent> geofenceEvents, String globalTrackId, String deviceId, String tag) {
        this.track = track;
        this.timestamp = timestamp;
        this.frame = frame;
        this.polygon = polygon;
        this.position = position;
        this.zoneIds = zoneIds;
        this.geofenceIds = geofenceIds;
        this.metadata = metadata;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.direction = direction;
        this.zoneEvents = zoneEvents;
        this.geofenceEvents = geofenceEvents;
        this.globalTrackId = globalTrackId;
        this.deviceId = deviceId;
        this.tag = tag;
    }

    /**
     * id: ID! //TODO: Once we switch over to the detections table
     */
    public Track getTrack() {
        return track;
    }
    /**
     * id: ID! //TODO: Once we switch over to the detections table
     */
    public void setTrack(Track track) {
        this.track = track;
    }

    public java.time.OffsetDateTime getTimestamp() {
        return timestamp;
    }
    public void setTimestamp(java.time.OffsetDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public Frame getFrame() {
        return frame;
    }
    public void setFrame(Frame frame) {
        this.frame = frame;
    }

    public GeoJSONPolygon getPolygon() {
        return polygon;
    }
    public void setPolygon(GeoJSONPolygon polygon) {
        this.polygon = polygon;
    }

    public GeoJSONPoint getPosition() {
        return position;
    }
    public void setPosition(GeoJSONPoint position) {
        this.position = position;
    }

    public java.util.List<String> getZoneIds() {
        return zoneIds;
    }
    public void setZoneIds(java.util.List<String> zoneIds) {
        this.zoneIds = zoneIds;
    }

    public java.util.List<String> getGeofenceIds() {
        return geofenceIds;
    }
    public void setGeofenceIds(java.util.List<String> geofenceIds) {
        this.geofenceIds = geofenceIds;
    }

    public java.lang.Object getMetadata() {
        return metadata;
    }
    public void setMetadata(java.lang.Object metadata) {
        this.metadata = metadata;
    }

    public java.time.OffsetDateTime getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(java.time.OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public java.time.OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }
    public void setUpdatedAt(java.time.OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Double getDirection() {
        return direction;
    }
    public void setDirection(Double direction) {
        this.direction = direction;
    }

    @Deprecated
    public java.util.List<ZoneEvent> getZoneEvents() {
        return zoneEvents;
    }
    @Deprecated
    public void setZoneEvents(java.util.List<ZoneEvent> zoneEvents) {
        this.zoneEvents = zoneEvents;
    }

    @Deprecated
    public java.util.List<GeofenceEvent> getGeofenceEvents() {
        return geofenceEvents;
    }
    @Deprecated
    public void setGeofenceEvents(java.util.List<GeofenceEvent> geofenceEvents) {
        this.geofenceEvents = geofenceEvents;
    }

    @Deprecated
    public String getGlobalTrackId() {
        return globalTrackId;
    }
    @Deprecated
    public void setGlobalTrackId(String globalTrackId) {
        this.globalTrackId = globalTrackId;
    }

    @Deprecated
    public String getDeviceId() {
        return deviceId;
    }
    @Deprecated
    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    @Deprecated
    public String getTag() {
        return tag;
    }
    @Deprecated
    public void setTag(String tag) {
        this.tag = tag;
    }



    public static Detection.Builder builder() {
        return new Detection.Builder();
    }

    public static class Builder {

        private Track track;
        private java.time.OffsetDateTime timestamp;
        private Frame frame;
        private GeoJSONPolygon polygon;
        private GeoJSONPoint position;
        private java.util.List<String> zoneIds;
        private java.util.List<String> geofenceIds;
        private java.lang.Object metadata;
        private java.time.OffsetDateTime createdAt;
        private java.time.OffsetDateTime updatedAt;
        private Double direction;
        private java.util.List<ZoneEvent> zoneEvents;
        private java.util.List<GeofenceEvent> geofenceEvents;
        private String globalTrackId;
        private String deviceId;
        private String tag;

        public Builder() {
        }

        /**
         * id: ID! //TODO: Once we switch over to the detections table
         */
        public Builder setTrack(Track track) {
            this.track = track;
            return this;
        }

        public Builder setTimestamp(java.time.OffsetDateTime timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        public Builder setFrame(Frame frame) {
            this.frame = frame;
            return this;
        }

        public Builder setPolygon(GeoJSONPolygon polygon) {
            this.polygon = polygon;
            return this;
        }

        public Builder setPosition(GeoJSONPoint position) {
            this.position = position;
            return this;
        }

        public Builder setZoneIds(java.util.List<String> zoneIds) {
            this.zoneIds = zoneIds;
            return this;
        }

        public Builder setGeofenceIds(java.util.List<String> geofenceIds) {
            this.geofenceIds = geofenceIds;
            return this;
        }

        public Builder setMetadata(java.lang.Object metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder setCreatedAt(java.time.OffsetDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public Builder setUpdatedAt(java.time.OffsetDateTime updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        public Builder setDirection(Double direction) {
            this.direction = direction;
            return this;
        }

        @Deprecated
        public Builder setZoneEvents(java.util.List<ZoneEvent> zoneEvents) {
            this.zoneEvents = zoneEvents;
            return this;
        }

        @Deprecated
        public Builder setGeofenceEvents(java.util.List<GeofenceEvent> geofenceEvents) {
            this.geofenceEvents = geofenceEvents;
            return this;
        }

        @Deprecated
        public Builder setGlobalTrackId(String globalTrackId) {
            this.globalTrackId = globalTrackId;
            return this;
        }

        @Deprecated
        public Builder setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }

        @Deprecated
        public Builder setTag(String tag) {
            this.tag = tag;
            return this;
        }


        public Detection build() {
            return new Detection(track, timestamp, frame, polygon, position, zoneIds, geofenceIds, metadata, createdAt, updatedAt, direction, zoneEvents, geofenceEvents, globalTrackId, deviceId, tag);
        }

    }
}
