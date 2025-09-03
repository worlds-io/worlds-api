package io.worlds.api.model;


public class ZoneIntersectionConnection implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private PageInfo pageInfo;
    @jakarta.validation.constraints.NotNull
    private java.util.List<ZoneIntersectionEdge> edges;

    public ZoneIntersectionConnection() {
    }

    public ZoneIntersectionConnection(PageInfo pageInfo, java.util.List<ZoneIntersectionEdge> edges) {
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
     * The resulting collection of zone intersections edges.
     */
    public java.util.List<ZoneIntersectionEdge> getEdges() {
        return edges;
    }
    /**
     * The resulting collection of zone intersections edges.
     */
    public void setEdges(java.util.List<ZoneIntersectionEdge> edges) {
        this.edges = edges;
    }



    public static ZoneIntersectionConnection.Builder builder() {
        return new ZoneIntersectionConnection.Builder();
    }

    public static class Builder {

        private PageInfo pageInfo;
        private java.util.List<ZoneIntersectionEdge> edges;

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
         * The resulting collection of zone intersections edges.
         */
        public Builder setEdges(java.util.List<ZoneIntersectionEdge> edges) {
            this.edges = edges;
            return this;
        }


        public ZoneIntersectionConnection build() {
            return new ZoneIntersectionConnection(pageInfo, edges);
        }

    }
}
