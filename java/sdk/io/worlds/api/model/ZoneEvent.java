package io.worlds.api.model;


public class ZoneEvent implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private String id;
    @jakarta.validation.constraints.NotNull
    private Zone zone;
    @jakarta.validation.constraints.NotNull
    private Track track;
    @Deprecated
    @jakarta.validation.constraints.NotNull
    private String tag;
    @Deprecated
    @jakarta.validation.constraints.NotNull
    private ActivityType type;
    @jakarta.validation.constraints.NotNull
    private java.time.OffsetDateTime startTime;
    private java.time.OffsetDateTime endTime;
    @Deprecated
    private GeoJSONMultiPolygon polygon;

    public ZoneEvent() {
    }

    public ZoneEvent(String id, Zone zone, Track track, String tag, ActivityType type, java.time.OffsetDateTime startTime, java.time.OffsetDateTime endTime, GeoJSONMultiPolygon polygon) {
        this.id = id;
        this.zone = zone;
        this.track = track;
        this.tag = tag;
        this.type = type;
        this.startTime = startTime;
        this.endTime = endTime;
        this.polygon = polygon;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public Zone getZone() {
        return zone;
    }
    public void setZone(Zone zone) {
        this.zone = zone;
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

    @Deprecated
    public GeoJSONMultiPolygon getPolygon() {
        return polygon;
    }
    @Deprecated
    public void setPolygon(GeoJSONMultiPolygon polygon) {
        this.polygon = polygon;
    }



    public static ZoneEvent.Builder builder() {
        return new ZoneEvent.Builder();
    }

    public static class Builder {

        private String id;
        private Zone zone;
        private Track track;
        private String tag;
        private ActivityType type;
        private java.time.OffsetDateTime startTime;
        private java.time.OffsetDateTime endTime;
        private GeoJSONMultiPolygon polygon;

        public Builder() {
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setZone(Zone zone) {
            this.zone = zone;
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

        public Builder setStartTime(java.time.OffsetDateTime startTime) {
            this.startTime = startTime;
            return this;
        }

        public Builder setEndTime(java.time.OffsetDateTime endTime) {
            this.endTime = endTime;
            return this;
        }

        @Deprecated
        public Builder setPolygon(GeoJSONMultiPolygon polygon) {
            this.polygon = polygon;
            return this;
        }


        public ZoneEvent build() {
            return new ZoneEvent(id, zone, track, tag, type, startTime, endTime, polygon);
        }

    }
}
