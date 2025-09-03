package io.worlds.api.model;


public class GeofenceEventConnection implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private PageInfo pageInfo;
    @jakarta.validation.constraints.NotNull
    private java.util.List<GeofenceEventEdge> edges;

    public GeofenceEventConnection() {
    }

    public GeofenceEventConnection(PageInfo pageInfo, java.util.List<GeofenceEventEdge> edges) {
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
     * The resulting collection of geofence events edges.
     */
    public java.util.List<GeofenceEventEdge> getEdges() {
        return edges;
    }
    /**
     * The resulting collection of geofence events edges.
     */
    public void setEdges(java.util.List<GeofenceEventEdge> edges) {
        this.edges = edges;
    }



    public static GeofenceEventConnection.Builder builder() {
        return new GeofenceEventConnection.Builder();
    }

    public static class Builder {

        private PageInfo pageInfo;
        private java.util.List<GeofenceEventEdge> edges;

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
         * The resulting collection of geofence events edges.
         */
        public Builder setEdges(java.util.List<GeofenceEventEdge> edges) {
            this.edges = edges;
            return this;
        }


        public GeofenceEventConnection build() {
            return new GeofenceEventConnection(pageInfo, edges);
        }

    }
}
