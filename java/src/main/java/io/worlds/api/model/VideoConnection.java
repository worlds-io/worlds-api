package io.worlds.api.model;


/**
 * A `VideoConnection` is the paginated result of a [`videos` query]({{Queries.videos}})
See [about queries](/reference/query/#about-queries) for details on how "connection" and "edge" types are used with pagination.
 */
public class VideoConnection implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private PageInfo pageInfo;
    @jakarta.validation.constraints.NotNull
    private java.util.List<VideoEdge> edges;

    public VideoConnection() {
    }

    public VideoConnection(PageInfo pageInfo, java.util.List<VideoEdge> edges) {
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
     * The resulting collection of Video edges.
     */
    public java.util.List<VideoEdge> getEdges() {
        return edges;
    }
    /**
     * The resulting collection of Video edges.
     */
    public void setEdges(java.util.List<VideoEdge> edges) {
        this.edges = edges;
    }



    public static VideoConnection.Builder builder() {
        return new VideoConnection.Builder();
    }

    public static class Builder {

        private PageInfo pageInfo;
        private java.util.List<VideoEdge> edges;

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
         * The resulting collection of Video edges.
         */
        public Builder setEdges(java.util.List<VideoEdge> edges) {
            this.edges = edges;
            return this;
        }


        public VideoConnection build() {
            return new VideoConnection(pageInfo, edges);
        }

    }
}
