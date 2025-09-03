package io.worlds.api.model;


/**
 * A `DetectionConnection` is the paginated results of a [`detections` query]({{Queries.detections}}).
See [about queries](/reference/query/#about-queries) for details on how "connection" and "edge" types are used with pagination.
 */
public class DetectionConnection implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private PageInfo pageInfo;
    @jakarta.validation.constraints.NotNull
    private java.util.List<DetectionEdge> edges;

    public DetectionConnection() {
    }

    public DetectionConnection(PageInfo pageInfo, java.util.List<DetectionEdge> edges) {
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
     * The resulting collection of detection edges.
     */
    public java.util.List<DetectionEdge> getEdges() {
        return edges;
    }
    /**
     * The resulting collection of detection edges.
     */
    public void setEdges(java.util.List<DetectionEdge> edges) {
        this.edges = edges;
    }



    public static DetectionConnection.Builder builder() {
        return new DetectionConnection.Builder();
    }

    public static class Builder {

        private PageInfo pageInfo;
        private java.util.List<DetectionEdge> edges;

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
         * The resulting collection of detection edges.
         */
        public Builder setEdges(java.util.List<DetectionEdge> edges) {
            this.edges = edges;
            return this;
        }


        public DetectionConnection build() {
            return new DetectionConnection(pageInfo, edges);
        }

    }
}
