package io.worlds.api.model;


/**
 * An geofence edge is the pairing of a [Geofence]({{Types.geofence}}) with its query cursor.
See [about queries](/reference/query/#about-queries) for details on how "connection" and "edge" types are used with pagination.
 */
public class GeofenceEdge implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private Geofence node;
    @jakarta.validation.constraints.NotNull
    private String cursor;

    public GeofenceEdge() {
    }

    public GeofenceEdge(Geofence node, String cursor) {
        this.node = node;
        this.cursor = cursor;
    }

    /**
     * Information about a particular [Geofence]({{Types.geofence}}).
     */
    public Geofence getNode() {
        return node;
    }
    /**
     * Information about a particular [Geofence]({{Types.geofence}}).
     */
    public void setNode(Geofence node) {
        this.node = node;
    }

    /**
     * The cursor to use with the [Query `geofences` field]({{Queries.geofences}}) `after` argument.
     */
    public String getCursor() {
        return cursor;
    }
    /**
     * The cursor to use with the [Query `geofences` field]({{Queries.geofences}}) `after` argument.
     */
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }



    public static GeofenceEdge.Builder builder() {
        return new GeofenceEdge.Builder();
    }

    public static class Builder {

        private Geofence node;
        private String cursor;

        public Builder() {
        }

        /**
         * Information about a particular [Geofence]({{Types.geofence}}).
         */
        public Builder setNode(Geofence node) {
            this.node = node;
            return this;
        }

        /**
         * The cursor to use with the [Query `geofences` field]({{Queries.geofences}}) `after` argument.
         */
        public Builder setCursor(String cursor) {
            this.cursor = cursor;
            return this;
        }


        public GeofenceEdge build() {
            return new GeofenceEdge(node, cursor);
        }

    }
}
