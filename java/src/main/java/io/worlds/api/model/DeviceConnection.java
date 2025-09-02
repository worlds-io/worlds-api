package io.worlds.api.model;


/**
 * A `DeviceConnection` is the paginated results of a [`devices` query]({{Queries.devices}}).
See [about queries](/reference/query/#about-queries) for details on how "connection" and "edge" types are used with pagination.
 */
public class DeviceConnection implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private PageInfo pageInfo;
    @jakarta.validation.constraints.NotNull
    private java.util.List<DeviceEdge> edges;

    public DeviceConnection() {
    }

    public DeviceConnection(PageInfo pageInfo, java.util.List<DeviceEdge> edges) {
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
     * The resulting collection of Device edges.
     */
    public java.util.List<DeviceEdge> getEdges() {
        return edges;
    }
    /**
     * The resulting collection of Device edges.
     */
    public void setEdges(java.util.List<DeviceEdge> edges) {
        this.edges = edges;
    }



    public static DeviceConnection.Builder builder() {
        return new DeviceConnection.Builder();
    }

    public static class Builder {

        private PageInfo pageInfo;
        private java.util.List<DeviceEdge> edges;

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
         * The resulting collection of Device edges.
         */
        public Builder setEdges(java.util.List<DeviceEdge> edges) {
            this.edges = edges;
            return this;
        }


        public DeviceConnection build() {
            return new DeviceConnection(pageInfo, edges);
        }

    }
}
