package io.worlds.api.model;


public class Track implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private String id;
    private DataSource dataSource;
    private Video video;
    @jakarta.validation.constraints.NotNull
    private String tag;
    @jakarta.validation.constraints.NotNull
    private java.time.OffsetDateTime startTime;
    private java.time.OffsetDateTime endTime;
    @jakarta.validation.constraints.NotNull
    private java.util.List<Detection> detections;
    private TrackProperties properties;
    private java.lang.Object metadata;
    private java.util.List<ZoneIntersection> zoneIntersections;
    private java.util.List<GeofenceIntersection> geofenceIntersections;
    @Deprecated
    private java.util.List<String> deviceIds;

    public Track() {
    }

    public Track(String id, DataSource dataSource, Video video, String tag, java.time.OffsetDateTime startTime, java.time.OffsetDateTime endTime, java.util.List<Detection> detections, TrackProperties properties, java.lang.Object metadata, java.util.List<ZoneIntersection> zoneIntersections, java.util.List<GeofenceIntersection> geofenceIntersections, java.util.List<String> deviceIds) {
        this.id = id;
        this.dataSource = dataSource;
        this.video = video;
        this.tag = tag;
        this.startTime = startTime;
        this.endTime = endTime;
        this.detections = detections;
        this.properties = properties;
        this.metadata = metadata;
        this.zoneIntersections = zoneIntersections;
        this.geofenceIntersections = geofenceIntersections;
        this.deviceIds = deviceIds;
    }

    /**
     * The unique identifier for the Track.
     */
    public String getId() {
        return id;
    }
    /**
     * The unique identifier for the Track.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * The data source that captured the Track.
     */
    public DataSource getDataSource() {
        return dataSource;
    }
    /**
     * The data source that captured the Track.
     */
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    /**
     * The video that this detection was captured in
     */
    public Video getVideo() {
        return video;
    }
    /**
     * The video that this detection was captured in
     */
    public void setVideo(Video video) {
        this.video = video;
    }

    /**
     * The class label of the tracked object, i.e person, car, truck, etc.
     */
    public String getTag() {
        return tag;
    }
    /**
     * The class label of the tracked object, i.e person, car, truck, etc.
     */
    public void setTag(String tag) {
        this.tag = tag;
    }

    /**
     * The time of the first detection of the tracked object.
     */
    public java.time.OffsetDateTime getStartTime() {
        return startTime;
    }
    /**
     * The time of the first detection of the tracked object.
     */
    public void setStartTime(java.time.OffsetDateTime startTime) {
        this.startTime = startTime;
    }

    /**
     * The time of the last detection of the tracked object, or null if it is still being tracked.
     */
    public java.time.OffsetDateTime getEndTime() {
        return endTime;
    }
    /**
     * The time of the last detection of the tracked object, or null if it is still being tracked.
     */
    public void setEndTime(java.time.OffsetDateTime endTime) {
        this.endTime = endTime;
    }

    /**
     * A collection of every Detection associated with the Track.
     */
    public java.util.List<Detection> getDetections() {
        return detections;
    }
    /**
     * A collection of every Detection associated with the Track.
     */
    public void setDetections(java.util.List<Detection> detections) {
        this.detections = detections;
    }

    /**
     * The identifying and descriptive attributes of the Track
     */
    public TrackProperties getProperties() {
        return properties;
    }
    /**
     * The identifying and descriptive attributes of the Track
     */
    public void setProperties(TrackProperties properties) {
        this.properties = properties;
    }

    /**
     * Arbitrary information about the Track.
     */
    public java.lang.Object getMetadata() {
        return metadata;
    }
    /**
     * Arbitrary information about the Track.
     */
    public void setMetadata(java.lang.Object metadata) {
        this.metadata = metadata;
    }

    /**
     * Intersections triggered by this track interacting with a zone.
     */
    public java.util.List<ZoneIntersection> getZoneIntersections() {
        return zoneIntersections;
    }
    /**
     * Intersections triggered by this track interacting with a zone.
     */
    public void setZoneIntersections(java.util.List<ZoneIntersection> zoneIntersections) {
        this.zoneIntersections = zoneIntersections;
    }

    /**
     * Point-in-time representations of an interaction between the track and a geofence.
     */
    public java.util.List<GeofenceIntersection> getGeofenceIntersections() {
        return geofenceIntersections;
    }
    /**
     * Point-in-time representations of an interaction between the track and a geofence.
     */
    public void setGeofenceIntersections(java.util.List<GeofenceIntersection> geofenceIntersections) {
        this.geofenceIntersections = geofenceIntersections;
    }

    /**
     * The unique identifiers of the devices that captured the Track.
     */
    @Deprecated
    public java.util.List<String> getDeviceIds() {
        return deviceIds;
    }
    /**
     * The unique identifiers of the devices that captured the Track.
     */
    @Deprecated
    public void setDeviceIds(java.util.List<String> deviceIds) {
        this.deviceIds = deviceIds;
    }



    public static Track.Builder builder() {
        return new Track.Builder();
    }

    public static class Builder {

        private String id;
        private DataSource dataSource;
        private Video video;
        private String tag;
        private java.time.OffsetDateTime startTime;
        private java.time.OffsetDateTime endTime;
        private java.util.List<Detection> detections;
        private TrackProperties properties;
        private java.lang.Object metadata;
        private java.util.List<ZoneIntersection> zoneIntersections;
        private java.util.List<GeofenceIntersection> geofenceIntersections;
        private java.util.List<String> deviceIds;

        public Builder() {
        }

        /**
         * The unique identifier for the Track.
         */
        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        /**
         * The data source that captured the Track.
         */
        public Builder setDataSource(DataSource dataSource) {
            this.dataSource = dataSource;
            return this;
        }

        /**
         * The video that this detection was captured in
         */
        public Builder setVideo(Video video) {
            this.video = video;
            return this;
        }

        /**
         * The class label of the tracked object, i.e person, car, truck, etc.
         */
        public Builder setTag(String tag) {
            this.tag = tag;
            return this;
        }

        /**
         * The time of the first detection of the tracked object.
         */
        public Builder setStartTime(java.time.OffsetDateTime startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * The time of the last detection of the tracked object, or null if it is still being tracked.
         */
        public Builder setEndTime(java.time.OffsetDateTime endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * A collection of every Detection associated with the Track.
         */
        public Builder setDetections(java.util.List<Detection> detections) {
            this.detections = detections;
            return this;
        }

        /**
         * The identifying and descriptive attributes of the Track
         */
        public Builder setProperties(TrackProperties properties) {
            this.properties = properties;
            return this;
        }

        /**
         * Arbitrary information about the Track.
         */
        public Builder setMetadata(java.lang.Object metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * Intersections triggered by this track interacting with a zone.
         */
        public Builder setZoneIntersections(java.util.List<ZoneIntersection> zoneIntersections) {
            this.zoneIntersections = zoneIntersections;
            return this;
        }

        /**
         * Point-in-time representations of an interaction between the track and a geofence.
         */
        public Builder setGeofenceIntersections(java.util.List<GeofenceIntersection> geofenceIntersections) {
            this.geofenceIntersections = geofenceIntersections;
            return this;
        }

        /**
         * The unique identifiers of the devices that captured the Track.
         */
        @Deprecated
        public Builder setDeviceIds(java.util.List<String> deviceIds) {
            this.deviceIds = deviceIds;
            return this;
        }


        public Track build() {
            return new Track(id, dataSource, video, tag, startTime, endTime, detections, properties, metadata, zoneIntersections, geofenceIntersections, deviceIds);
        }

    }
}
