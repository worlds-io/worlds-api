package io.worlds.api.model;


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
     * Information about a particular [GeofenceIntersection]({{Types.geofenceintersection}}).
     */
    public GeofenceIntersection getNode() {
        return node;
    }
    /**
     * Information about a particular [GeofenceIntersection]({{Types.geofenceintersection}}).
     */
    public void setNode(GeofenceIntersection node) {
        this.node = node;
    }

    /**
     * The cursor to use with the [Query `geofenceIntersections` field]({{Queries.geofenceintersections}}) `after` argument.
     */
    public String getCursor() {
        return cursor;
    }
    /**
     * The cursor to use with the [Query `geofenceIntersections` field]({{Queries.geofenceintersections}}) `after` argument.
     */
    public void setCursor(String cursor) {
        this.cursor = cursor;
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
         * Information about a particular [GeofenceIntersection]({{Types.geofenceintersection}}).
         */
        public Builder setNode(GeofenceIntersection node) {
            this.node = node;
            return this;
        }

        /**
         * The cursor to use with the [Query `geofenceIntersections` field]({{Queries.geofenceintersections}}) `after` argument.
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
