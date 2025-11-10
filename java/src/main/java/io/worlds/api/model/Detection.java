package io.worlds.api.model;

import java.util.Objects;

/**
 * Detections are the lowest level unit of computer vision primitive within Worlds.
A detection represents a single frame of a recognized object, which then has
additional data associated with it, including its position, track, and
interactions with zones and geofences.
 */
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
    private java.util.List<Zone> zones;
    @jakarta.validation.constraints.NotNull
    private java.util.List<Geofence> geofences;
    private java.lang.Object metadata;
    private java.time.OffsetDateTime createdAt;
    private java.time.OffsetDateTime updatedAt;
    private Double direction;
    @Deprecated
    @jakarta.validation.constraints.NotNull
    private java.util.List<String> geofenceIds;
    @Deprecated
    @jakarta.validation.constraints.NotNull
    private java.util.List<String> zoneIds;
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

    public Detection(Track track, java.time.OffsetDateTime timestamp, Frame frame, GeoJSONPolygon polygon, GeoJSONPoint position, java.util.List<Zone> zones, java.util.List<Geofence> geofences, java.lang.Object metadata, java.time.OffsetDateTime createdAt, java.time.OffsetDateTime updatedAt, Double direction, java.util.List<String> geofenceIds, java.util.List<String> zoneIds, java.util.List<ZoneEvent> zoneEvents, java.util.List<GeofenceEvent> geofenceEvents, String globalTrackId, String deviceId, String tag) {
        this.track = track;
        this.timestamp = timestamp;
        this.frame = frame;
        this.polygon = polygon;
        this.position = position;
        this.zones = zones;
        this.geofences = geofences;
        this.metadata = metadata;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.direction = direction;
        this.geofenceIds = geofenceIds;
        this.zoneIds = zoneIds;
        this.zoneEvents = zoneEvents;
        this.geofenceEvents = geofenceEvents;
        this.globalTrackId = globalTrackId;
        this.deviceId = deviceId;
        this.tag = tag;
    }

    /**
     * The track that is associated with the detection.
     */
    public Track getTrack() {
        return track;
    }
    /**
     * The track that is associated with the detection.
     */
    public void setTrack(Track track) {
        this.track = track;
    }

    /**
     * The time at which the detection occurred.
     */
    public java.time.OffsetDateTime getTimestamp() {
        return timestamp;
    }
    /**
     * The time at which the detection occurred.
     */
    public void setTimestamp(java.time.OffsetDateTime timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * Information about the video frame in which this detection was captured
     */
    public Frame getFrame() {
        return frame;
    }
    /**
     * Information about the video frame in which this detection was captured
     */
    public void setFrame(Frame frame) {
        this.frame = frame;
    }

    /**
     * A GeoJSON polygon that represents the spatial bounds of the detection.
     */
    public GeoJSONPolygon getPolygon() {
        return polygon;
    }
    /**
     * A GeoJSON polygon that represents the spatial bounds of the detection.
     */
    public void setPolygon(GeoJSONPolygon polygon) {
        this.polygon = polygon;
    }

    /**
     * A GeoJSON point that represents the location of the detection in the world. This value may be `null` if the camera that captured the detection hasn't been calibrated. It may also be `null` if the location cannot be calculated (i.e the detected object is in the sky).
     */
    public GeoJSONPoint getPosition() {
        return position;
    }
    /**
     * A GeoJSON point that represents the location of the detection in the world. This value may be `null` if the camera that captured the detection hasn't been calibrated. It may also be `null` if the location cannot be calculated (i.e the detected object is in the sky).
     */
    public void setPosition(GeoJSONPoint position) {
        this.position = position;
    }

    /**
     * A list of [Zones]({{Types.Zone}}) with which the detection intersects.
     */
    public java.util.List<Zone> getZones() {
        return zones;
    }
    /**
     * A list of [Zones]({{Types.Zone}}) with which the detection intersects.
     */
    public void setZones(java.util.List<Zone> zones) {
        this.zones = zones;
    }

    /**
     * A list of [Geofences]({{Types.Geofence}}) with which the detection intersects.
     */
    public java.util.List<Geofence> getGeofences() {
        return geofences;
    }
    /**
     * A list of [Geofences]({{Types.Geofence}}) with which the detection intersects.
     */
    public void setGeofences(java.util.List<Geofence> geofences) {
        this.geofences = geofences;
    }

    /**
     * Arbitrary metadata associated with the detection.
     */
    public java.lang.Object getMetadata() {
        return metadata;
    }
    /**
     * Arbitrary metadata associated with the detection.
     */
    public void setMetadata(java.lang.Object metadata) {
        this.metadata = metadata;
    }

    /**
     * Timestamp that the detection was created. May be delayed from the
`timestamp` due to post-processing video feeds or other latency.
     */
    public java.time.OffsetDateTime getCreatedAt() {
        return createdAt;
    }
    /**
     * Timestamp that the detection was created. May be delayed from the
`timestamp` due to post-processing video feeds or other latency.
     */
    public void setCreatedAt(java.time.OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * Timestamp that the detection was most recently updated.
     */
    public java.time.OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }
    /**
     * Timestamp that the detection was most recently updated.
     */
    public void setUpdatedAt(java.time.OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * The direction in which the detection is moving, represented in degrees.
     */
    public Double getDirection() {
        return direction;
    }
    /**
     * The direction in which the detection is moving, represented in degrees.
     */
    public void setDirection(Double direction) {
        this.direction = direction;
    }

    /**
     * A list of [geofence]({{Queries.geofence}}) unique identifiers with which the
detection intersects.
     */
    @Deprecated
    public java.util.List<String> getGeofenceIds() {
        return geofenceIds;
    }
    /**
     * A list of [geofence]({{Queries.geofence}}) unique identifiers with which the
detection intersects.
     */
    @Deprecated
    public void setGeofenceIds(java.util.List<String> geofenceIds) {
        this.geofenceIds = geofenceIds;
    }

    /**
     * A list of [zone]({{Queries.zone}}) unique identifiers with which the
detection intersects.
     */
    @Deprecated
    public java.util.List<String> getZoneIds() {
        return zoneIds;
    }
    /**
     * A list of [zone]({{Queries.zone}}) unique identifiers with which the
detection intersects.
     */
    @Deprecated
    public void setZoneIds(java.util.List<String> zoneIds) {
        this.zoneIds = zoneIds;
    }

    /**
     * A list of zone events related to this detection.
     */
    @Deprecated
    public java.util.List<ZoneEvent> getZoneEvents() {
        return zoneEvents;
    }
    /**
     * A list of zone events related to this detection.
     */
    @Deprecated
    public void setZoneEvents(java.util.List<ZoneEvent> zoneEvents) {
        this.zoneEvents = zoneEvents;
    }

    /**
     * A list of geofence events related to this detection.
     */
    @Deprecated
    public java.util.List<GeofenceEvent> getGeofenceEvents() {
        return geofenceEvents;
    }
    /**
     * A list of geofence events related to this detection.
     */
    @Deprecated
    public void setGeofenceEvents(java.util.List<GeofenceEvent> geofenceEvents) {
        this.geofenceEvents = geofenceEvents;
    }

    /**
     * The global track id that governs the detection, if any.
     */
    @Deprecated
    public String getGlobalTrackId() {
        return globalTrackId;
    }
    /**
     * The global track id that governs the detection, if any.
     */
    @Deprecated
    public void setGlobalTrackId(String globalTrackId) {
        this.globalTrackId = globalTrackId;
    }

    /**
     * The unique identifier of the device where the detection occurred.
     */
    @Deprecated
    public String getDeviceId() {
        return deviceId;
    }
    /**
     * The unique identifier of the device where the detection occurred.
     */
    @Deprecated
    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    /**
     * The class label of the detected object, i.e person, car, truck, etc.
     */
    @Deprecated
    public String getTag() {
        return tag;
    }
    /**
     * The class label of the detected object, i.e person, car, truck, etc.
     */
    @Deprecated
    public void setTag(String tag) {
        this.tag = tag;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final Detection that = (Detection) obj;
        return Objects.equals(track, that.track)
            && Objects.equals(timestamp, that.timestamp)
            && Objects.equals(frame, that.frame)
            && Objects.equals(polygon, that.polygon)
            && Objects.equals(position, that.position)
            && Objects.equals(zones, that.zones)
            && Objects.equals(geofences, that.geofences)
            && Objects.equals(metadata, that.metadata)
            && Objects.equals(createdAt, that.createdAt)
            && Objects.equals(updatedAt, that.updatedAt)
            && Objects.equals(direction, that.direction)
            && Objects.equals(geofenceIds, that.geofenceIds)
            && Objects.equals(zoneIds, that.zoneIds)
            && Objects.equals(zoneEvents, that.zoneEvents)
            && Objects.equals(geofenceEvents, that.geofenceEvents)
            && Objects.equals(globalTrackId, that.globalTrackId)
            && Objects.equals(deviceId, that.deviceId)
            && Objects.equals(tag, that.tag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(track, timestamp, frame, polygon, position, zones, geofences, metadata, createdAt, updatedAt, direction, geofenceIds, zoneIds, zoneEvents, geofenceEvents, globalTrackId, deviceId, tag);
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
        private java.util.List<Zone> zones;
        private java.util.List<Geofence> geofences;
        private java.lang.Object metadata;
        private java.time.OffsetDateTime createdAt;
        private java.time.OffsetDateTime updatedAt;
        private Double direction;
        private java.util.List<String> geofenceIds;
        private java.util.List<String> zoneIds;
        private java.util.List<ZoneEvent> zoneEvents;
        private java.util.List<GeofenceEvent> geofenceEvents;
        private String globalTrackId;
        private String deviceId;
        private String tag;

        public Builder() {
        }

        /**
         * The track that is associated with the detection.
         */
        public Builder setTrack(Track track) {
            this.track = track;
            return this;
        }

        /**
         * The time at which the detection occurred.
         */
        public Builder setTimestamp(java.time.OffsetDateTime timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        /**
         * Information about the video frame in which this detection was captured
         */
        public Builder setFrame(Frame frame) {
            this.frame = frame;
            return this;
        }

        /**
         * A GeoJSON polygon that represents the spatial bounds of the detection.
         */
        public Builder setPolygon(GeoJSONPolygon polygon) {
            this.polygon = polygon;
            return this;
        }

        /**
         * A GeoJSON point that represents the location of the detection in the world. This value may be `null` if the camera that captured the detection hasn't been calibrated. It may also be `null` if the location cannot be calculated (i.e the detected object is in the sky).
         */
        public Builder setPosition(GeoJSONPoint position) {
            this.position = position;
            return this;
        }

        /**
         * A list of [Zones]({{Types.Zone}}) with which the detection intersects.
         */
        public Builder setZones(java.util.List<Zone> zones) {
            this.zones = zones;
            return this;
        }

        /**
         * A list of [Geofences]({{Types.Geofence}}) with which the detection intersects.
         */
        public Builder setGeofences(java.util.List<Geofence> geofences) {
            this.geofences = geofences;
            return this;
        }

        /**
         * Arbitrary metadata associated with the detection.
         */
        public Builder setMetadata(java.lang.Object metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * Timestamp that the detection was created. May be delayed from the
`timestamp` due to post-processing video feeds or other latency.
         */
        public Builder setCreatedAt(java.time.OffsetDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * Timestamp that the detection was most recently updated.
         */
        public Builder setUpdatedAt(java.time.OffsetDateTime updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        /**
         * The direction in which the detection is moving, represented in degrees.
         */
        public Builder setDirection(Double direction) {
            this.direction = direction;
            return this;
        }

        /**
         * A list of [geofence]({{Queries.geofence}}) unique identifiers with which the
detection intersects.
         */
        @Deprecated
        public Builder setGeofenceIds(java.util.List<String> geofenceIds) {
            this.geofenceIds = geofenceIds;
            return this;
        }

        /**
         * A list of [zone]({{Queries.zone}}) unique identifiers with which the
detection intersects.
         */
        @Deprecated
        public Builder setZoneIds(java.util.List<String> zoneIds) {
            this.zoneIds = zoneIds;
            return this;
        }

        /**
         * A list of zone events related to this detection.
         */
        @Deprecated
        public Builder setZoneEvents(java.util.List<ZoneEvent> zoneEvents) {
            this.zoneEvents = zoneEvents;
            return this;
        }

        /**
         * A list of geofence events related to this detection.
         */
        @Deprecated
        public Builder setGeofenceEvents(java.util.List<GeofenceEvent> geofenceEvents) {
            this.geofenceEvents = geofenceEvents;
            return this;
        }

        /**
         * The global track id that governs the detection, if any.
         */
        @Deprecated
        public Builder setGlobalTrackId(String globalTrackId) {
            this.globalTrackId = globalTrackId;
            return this;
        }

        /**
         * The unique identifier of the device where the detection occurred.
         */
        @Deprecated
        public Builder setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }

        /**
         * The class label of the detected object, i.e person, car, truck, etc.
         */
        @Deprecated
        public Builder setTag(String tag) {
            this.tag = tag;
            return this;
        }


        public Detection build() {
            return new Detection(track, timestamp, frame, polygon, position, zones, geofences, metadata, createdAt, updatedAt, direction, geofenceIds, zoneIds, zoneEvents, geofenceEvents, globalTrackId, deviceId, tag);
        }

    }
}
