package io.worlds.api.model;


/**
 * An `GeofenceConnection` is the paginated results of a [`geofences` query]({{Queries.geofences}}).
See [about queries](/reference/query/#about-queries) for details on how "connection" and "edge" types are used with pagination.
 */
public class GeofenceConnection implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private PageInfo pageInfo;
    @jakarta.validation.constraints.NotNull
    private java.util.List<GeofenceEdge> edges;

    public GeofenceConnection() {
    }

    public GeofenceConnection(PageInfo pageInfo, java.util.List<GeofenceEdge> edges) {
        this.pageInfo = pageInfo;
        this.edges = edges;
    }

    /**
     * Pagination information for the resulting edges.
     */
    public PageInfo getPageInfo() {
        return pageInfo;
    }
    /**
     * Pagination information for the resulting edges.
     */
    public void setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }

    /**
     * The resulting collection of geofence edges.
     */
    public java.util.List<GeofenceEdge> getEdges() {
        return edges;
    }
    /**
     * The resulting collection of geofence edges.
     */
    public void setEdges(java.util.List<GeofenceEdge> edges) {
        this.edges = edges;
    }



    public static GeofenceConnection.Builder builder() {
        return new GeofenceConnection.Builder();
    }

    public static class Builder {

        private PageInfo pageInfo;
        private java.util.List<GeofenceEdge> edges;

        public Builder() {
        }

        /**
         * Pagination information for the resulting edges.
         */
        public Builder setPageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * The resulting collection of geofence edges.
         */
        public Builder setEdges(java.util.List<GeofenceEdge> edges) {
            this.edges = edges;
            return this;
        }


        public GeofenceConnection build() {
            return new GeofenceConnection(pageInfo, edges);
        }

    }
}
