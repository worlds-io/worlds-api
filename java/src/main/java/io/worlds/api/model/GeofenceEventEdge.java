package io.worlds.api.model;

import java.util.Objects;

public class GeofenceEventEdge implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private GeofenceEvent node;
    @jakarta.validation.constraints.NotNull
    private String cursor;

    public GeofenceEventEdge() {
    }

    public GeofenceEventEdge(GeofenceEvent node, String cursor) {
        this.node = node;
        this.cursor = cursor;
    }

    /**
     * Information about a particular [GeofenceEvent]({{Types.GeofenceEvent}}).
     */
    public GeofenceEvent getNode() {
        return node;
    }
    /**
     * Information about a particular [GeofenceEvent]({{Types.GeofenceEvent}}).
     */
    public void setNode(GeofenceEvent node) {
        this.node = node;
    }

    /**
     * The cursor to use with the [Query `geofenceEvents` field]({{Queries.geofenceEvents}}) `after` argument.
     */
    public String getCursor() {
        return cursor;
    }
    /**
     * The cursor to use with the [Query `geofenceEvents` field]({{Queries.geofenceEvents}}) `after` argument.
     */
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final GeofenceEventEdge that = (GeofenceEventEdge) obj;
        return Objects.equals(node, that.node)
            && Objects.equals(cursor, that.cursor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(node, cursor);
    }


    public static GeofenceEventEdge.Builder builder() {
        return new GeofenceEventEdge.Builder();
    }

    public static class Builder {

        private GeofenceEvent node;
        private String cursor;

        public Builder() {
        }

        /**
         * Information about a particular [GeofenceEvent]({{Types.GeofenceEvent}}).
         */
        public Builder setNode(GeofenceEvent node) {
            this.node = node;
            return this;
        }

        /**
         * The cursor to use with the [Query `geofenceEvents` field]({{Queries.geofenceEvents}}) `after` argument.
         */
        public Builder setCursor(String cursor) {
            this.cursor = cursor;
            return this;
        }


        public GeofenceEventEdge build() {
            return new GeofenceEventEdge(node, cursor);
        }

    }
}
