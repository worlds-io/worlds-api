package io.worlds.api.model;


public class ZoneIntersection implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private String id;
    @jakarta.validation.constraints.NotNull
    private Zone zone;
    @jakarta.validation.constraints.NotNull
    private Track track;
    @jakarta.validation.constraints.NotNull
    private java.time.OffsetDateTime startTime;
    private java.time.OffsetDateTime endTime;

    public ZoneIntersection() {
    }

    public ZoneIntersection(String id, Zone zone, Track track, java.time.OffsetDateTime startTime, java.time.OffsetDateTime endTime) {
        this.id = id;
        this.zone = zone;
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



    public static ZoneIntersection.Builder builder() {
        return new ZoneIntersection.Builder();
    }

    public static class Builder {

        private String id;
        private Zone zone;
        private Track track;
        private java.time.OffsetDateTime startTime;
        private java.time.OffsetDateTime endTime;

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

        public Builder setStartTime(java.time.OffsetDateTime startTime) {
            this.startTime = startTime;
            return this;
        }

        public Builder setEndTime(java.time.OffsetDateTime endTime) {
            this.endTime = endTime;
            return this;
        }


        public ZoneIntersection build() {
            return new ZoneIntersection(id, zone, track, startTime, endTime);
        }

    }
}
