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

    /**
     * The unique identifier for the zone intersection.
     */
    public String getId() {
        return id;
    }
    /**
     * The unique identifier for the zone intersection.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * The camera zone the intersection happened in.
     */
    public Zone getZone() {
        return zone;
    }
    /**
     * The camera zone the intersection happened in.
     */
    public void setZone(Zone zone) {
        this.zone = zone;
    }

    /**
     * The track associated with the object that triggered the zone intersection.
     */
    public Track getTrack() {
        return track;
    }
    /**
     * The track associated with the object that triggered the zone intersection.
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

        /**
         * The unique identifier for the zone intersection.
         */
        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        /**
         * The camera zone the intersection happened in.
         */
        public Builder setZone(Zone zone) {
            this.zone = zone;
            return this;
        }

        /**
         * The track associated with the object that triggered the zone intersection.
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


        public ZoneIntersection build() {
            return new ZoneIntersection(id, zone, track, startTime, endTime);
        }

    }
}
