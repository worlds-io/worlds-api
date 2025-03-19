package io.worlds.api.model;


public class Track implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private String id;
    private DataSource dataSource;
    @jakarta.validation.constraints.NotNull
    private String tag;
    @jakarta.validation.constraints.NotNull
    private java.time.OffsetDateTime startTime;
    private java.time.OffsetDateTime endTime;
    @jakarta.validation.constraints.NotNull
    private java.util.List<Detection> detections;
    private TrackProperties properties;
    private java.lang.Object metadata;
    private java.util.List<ZoneIntersection> zoneCollisions;
    private java.util.List<GeofenceIntersection> geofenceCollisions;
    @Deprecated
    private java.util.List<String> deviceIds;

    public Track() {
    }

    public Track(String id, DataSource dataSource, String tag, java.time.OffsetDateTime startTime, java.time.OffsetDateTime endTime, java.util.List<Detection> detections, TrackProperties properties, java.lang.Object metadata, java.util.List<ZoneIntersection> zoneCollisions, java.util.List<GeofenceIntersection> geofenceCollisions, java.util.List<String> deviceIds) {
        this.id = id;
        this.dataSource = dataSource;
        this.tag = tag;
        this.startTime = startTime;
        this.endTime = endTime;
        this.detections = detections;
        this.properties = properties;
        this.metadata = metadata;
        this.zoneCollisions = zoneCollisions;
        this.geofenceCollisions = geofenceCollisions;
        this.deviceIds = deviceIds;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public DataSource getDataSource() {
        return dataSource;
    }
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public String getTag() {
        return tag;
    }
    public void setTag(String tag) {
        this.tag = tag;
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

    public java.util.List<Detection> getDetections() {
        return detections;
    }
    public void setDetections(java.util.List<Detection> detections) {
        this.detections = detections;
    }

    public TrackProperties getProperties() {
        return properties;
    }
    public void setProperties(TrackProperties properties) {
        this.properties = properties;
    }

    public java.lang.Object getMetadata() {
        return metadata;
    }
    public void setMetadata(java.lang.Object metadata) {
        this.metadata = metadata;
    }

    public java.util.List<ZoneIntersection> getZoneCollisions() {
        return zoneCollisions;
    }
    public void setZoneCollisions(java.util.List<ZoneIntersection> zoneCollisions) {
        this.zoneCollisions = zoneCollisions;
    }

    public java.util.List<GeofenceIntersection> getGeofenceCollisions() {
        return geofenceCollisions;
    }
    public void setGeofenceCollisions(java.util.List<GeofenceIntersection> geofenceCollisions) {
        this.geofenceCollisions = geofenceCollisions;
    }

    @Deprecated
    public java.util.List<String> getDeviceIds() {
        return deviceIds;
    }
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
        private String tag;
        private java.time.OffsetDateTime startTime;
        private java.time.OffsetDateTime endTime;
        private java.util.List<Detection> detections;
        private TrackProperties properties;
        private java.lang.Object metadata;
        private java.util.List<ZoneIntersection> zoneCollisions;
        private java.util.List<GeofenceIntersection> geofenceCollisions;
        private java.util.List<String> deviceIds;

        public Builder() {
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setDataSource(DataSource dataSource) {
            this.dataSource = dataSource;
            return this;
        }

        public Builder setTag(String tag) {
            this.tag = tag;
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

        public Builder setDetections(java.util.List<Detection> detections) {
            this.detections = detections;
            return this;
        }

        public Builder setProperties(TrackProperties properties) {
            this.properties = properties;
            return this;
        }

        public Builder setMetadata(java.lang.Object metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder setZoneCollisions(java.util.List<ZoneIntersection> zoneCollisions) {
            this.zoneCollisions = zoneCollisions;
            return this;
        }

        public Builder setGeofenceCollisions(java.util.List<GeofenceIntersection> geofenceCollisions) {
            this.geofenceCollisions = geofenceCollisions;
            return this;
        }

        @Deprecated
        public Builder setDeviceIds(java.util.List<String> deviceIds) {
            this.deviceIds = deviceIds;
            return this;
        }


        public Track build() {
            return new Track(id, dataSource, tag, startTime, endTime, detections, properties, metadata, zoneCollisions, geofenceCollisions, deviceIds);
        }

    }
}
