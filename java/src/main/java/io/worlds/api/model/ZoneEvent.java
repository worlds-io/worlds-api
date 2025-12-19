package io.worlds.api.model;

import java.util.Objects;

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

    /**
     * The unique idenifier for the zone event.
     */
    public String getId() {
        return id;
    }
    /**
     * The unique idenifier for the zone event.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * The camera zone the event happened in.
     */
    public Zone getZone() {
        return zone;
    }
    /**
     * The camera zone the event happened in.
     */
    public void setZone(Zone zone) {
        this.zone = zone;
    }

    /**
     * The track associated with the object that triggered the zone event.
     */
    public Track getTrack() {
        return track;
    }
    /**
     * The track associated with the object that triggered the zone event.
     */
    public void setTrack(Track track) {
        this.track = track;
    }

    /**
     * [`zoneEvents`]({{Queries.zoneEvents}}) is deprecated in favor of [`zoneIntersections`]({{Queries.zoneIntersections}}),
and `tag` will not be present on [`ZoneIntersection`]({{Types.ZoneIntersection}}).
Use [track's tag]({{Types.Track}}) instead.

The class label of the object that triggered the zone event, i.e person, car, truck, etc.
     */
    @Deprecated
    public String getTag() {
        return tag;
    }
    /**
     * [`zoneEvents`]({{Queries.zoneEvents}}) is deprecated in favor of [`zoneIntersections`]({{Queries.zoneIntersections}}),
and `tag` will not be present on [`ZoneIntersection`]({{Types.ZoneIntersection}}).
Use [track's tag]({{Types.Track}}) instead.

The class label of the object that triggered the zone event, i.e person, car, truck, etc.
     */
    @Deprecated
    public void setTag(String tag) {
        this.tag = tag;
    }

    /**
     * [`zoneEvents`]({{Queries.zoneEvents}}) is deprecated in favor of [`zoneIntersections`]({{Queries.zoneIntersections}}),
and `type` will not be present on [`ZoneIntersection`]({{Types.ZoneIntersection}}).

The type of zone event, i.e ingress (an object entered the zone), dwell (an object remained in the zone), and egress.
(an object exited the zone)
     */
    @Deprecated
    public ActivityType getType() {
        return type;
    }
    /**
     * [`zoneEvents`]({{Queries.zoneEvents}}) is deprecated in favor of [`zoneIntersections`]({{Queries.zoneIntersections}}),
and `type` will not be present on [`ZoneIntersection`]({{Types.ZoneIntersection}}).

The type of zone event, i.e ingress (an object entered the zone), dwell (an object remained in the zone), and egress.
(an object exited the zone)
     */
    @Deprecated
    public void setType(ActivityType type) {
        this.type = type;
    }

    /**
     * The time at which the event started.
     */
    public java.time.OffsetDateTime getStartTime() {
        return startTime;
    }
    /**
     * The time at which the event started.
     */
    public void setStartTime(java.time.OffsetDateTime startTime) {
        this.startTime = startTime;
    }

    /**
     * The time at which the event ended.
     */
    public java.time.OffsetDateTime getEndTime() {
        return endTime;
    }
    /**
     * The time at which the event ended.
     */
    public void setEndTime(java.time.OffsetDateTime endTime) {
        this.endTime = endTime;
    }

    /**
     * [`zoneEvents`]({{Queries.zoneEvents}}) is deprecated in favor of [`zoneIntersections`]({{Queries.zoneIntersections}}),
and `polygon` will not be present on [`ZoneIntersection`]({{Types.ZoneIntersection}}).

The two-dimensional shape of the detection that triggered the event.
     */
    @Deprecated
    public GeoJSONMultiPolygon getPolygon() {
        return polygon;
    }
    /**
     * [`zoneEvents`]({{Queries.zoneEvents}}) is deprecated in favor of [`zoneIntersections`]({{Queries.zoneIntersections}}),
and `polygon` will not be present on [`ZoneIntersection`]({{Types.ZoneIntersection}}).

The two-dimensional shape of the detection that triggered the event.
     */
    @Deprecated
    public void setPolygon(GeoJSONMultiPolygon polygon) {
        this.polygon = polygon;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final ZoneEvent that = (ZoneEvent) obj;
        return Objects.equals(id, that.id)
            && Objects.equals(zone, that.zone)
            && Objects.equals(track, that.track)
            && Objects.equals(tag, that.tag)
            && Objects.equals(type, that.type)
            && Objects.equals(startTime, that.startTime)
            && Objects.equals(endTime, that.endTime)
            && Objects.equals(polygon, that.polygon);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, zone, track, tag, type, startTime, endTime, polygon);
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

        /**
         * The unique idenifier for the zone event.
         */
        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        /**
         * The camera zone the event happened in.
         */
        public Builder setZone(Zone zone) {
            this.zone = zone;
            return this;
        }

        /**
         * The track associated with the object that triggered the zone event.
         */
        public Builder setTrack(Track track) {
            this.track = track;
            return this;
        }

        /**
         * [`zoneEvents`]({{Queries.zoneEvents}}) is deprecated in favor of [`zoneIntersections`]({{Queries.zoneIntersections}}),
and `tag` will not be present on [`ZoneIntersection`]({{Types.ZoneIntersection}}).
Use [track's tag]({{Types.Track}}) instead.

The class label of the object that triggered the zone event, i.e person, car, truck, etc.
         */
        @Deprecated
        public Builder setTag(String tag) {
            this.tag = tag;
            return this;
        }

        /**
         * [`zoneEvents`]({{Queries.zoneEvents}}) is deprecated in favor of [`zoneIntersections`]({{Queries.zoneIntersections}}),
and `type` will not be present on [`ZoneIntersection`]({{Types.ZoneIntersection}}).

The type of zone event, i.e ingress (an object entered the zone), dwell (an object remained in the zone), and egress.
(an object exited the zone)
         */
        @Deprecated
        public Builder setType(ActivityType type) {
            this.type = type;
            return this;
        }

        /**
         * The time at which the event started.
         */
        public Builder setStartTime(java.time.OffsetDateTime startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * The time at which the event ended.
         */
        public Builder setEndTime(java.time.OffsetDateTime endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * [`zoneEvents`]({{Queries.zoneEvents}}) is deprecated in favor of [`zoneIntersections`]({{Queries.zoneIntersections}}),
and `polygon` will not be present on [`ZoneIntersection`]({{Types.ZoneIntersection}}).

The two-dimensional shape of the detection that triggered the event.
         */
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
