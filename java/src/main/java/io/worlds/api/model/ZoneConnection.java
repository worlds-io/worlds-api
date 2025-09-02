package io.worlds.api.model;


public class ZoneConnection implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private PageInfo pageInfo;
    @jakarta.validation.constraints.NotNull
    private java.util.List<ZoneEdge> edges;

    public ZoneConnection() {
    }

    public ZoneConnection(PageInfo pageInfo, java.util.List<ZoneEdge> edges) {
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
     * The resulting collection of zone edges.
     */
    public java.util.List<ZoneEdge> getEdges() {
        return edges;
    }
    /**
     * The resulting collection of zone edges.
     */
    public void setEdges(java.util.List<ZoneEdge> edges) {
        this.edges = edges;
    }



    public static ZoneConnection.Builder builder() {
        return new ZoneConnection.Builder();
    }

    public static class Builder {

        private PageInfo pageInfo;
        private java.util.List<ZoneEdge> edges;

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
         * The resulting collection of zone edges.
         */
        public Builder setEdges(java.util.List<ZoneEdge> edges) {
            this.edges = edges;
            return this;
        }


        public ZoneConnection build() {
            return new ZoneConnection(pageInfo, edges);
        }

    }
}
