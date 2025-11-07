package io.worlds.api.model;

import java.util.Objects;

public class GeofenceIntersectionEdge implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private GeofenceIntersection node;
    @jakarta.validation.constraints.NotNull
    private String cursor;

    public GeofenceIntersectionEdge() {
    }

    public GeofenceIntersectionEdge(GeofenceIntersection node, String cursor) {
        this.node = node;
        this.cursor = cursor;
    }

    /**
     * Information about a particular [GeofenceIntersection]({{Types.GeofenceIntersection}}).
     */
    public GeofenceIntersection getNode() {
        return node;
    }
    /**
     * Information about a particular [GeofenceIntersection]({{Types.GeofenceIntersection}}).
     */
    public void setNode(GeofenceIntersection node) {
        this.node = node;
    }

    /**
     * The cursor to use with the [Query `geofenceIntersections` field]({{Queries.geofenceIntersections}}) `after` argument.
     */
    public String getCursor() {
        return cursor;
    }
    /**
     * The cursor to use with the [Query `geofenceIntersections` field]({{Queries.geofenceIntersections}}) `after` argument.
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
        final GeofenceIntersectionEdge that = (GeofenceIntersectionEdge) obj;
        return Objects.equals(node, that.node)
            && Objects.equals(cursor, that.cursor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(node, cursor);
    }


    public static GeofenceIntersectionEdge.Builder builder() {
        return new GeofenceIntersectionEdge.Builder();
    }

    public static class Builder {

        private GeofenceIntersection node;
        private String cursor;

        public Builder() {
        }

        /**
         * Information about a particular [GeofenceIntersection]({{Types.GeofenceIntersection}}).
         */
        public Builder setNode(GeofenceIntersection node) {
            this.node = node;
            return this;
        }

        /**
         * The cursor to use with the [Query `geofenceIntersections` field]({{Queries.geofenceIntersections}}) `after` argument.
         */
        public Builder setCursor(String cursor) {
            this.cursor = cursor;
            return this;
        }


        public GeofenceIntersectionEdge build() {
            return new GeofenceIntersectionEdge(node, cursor);
        }

    }
}
