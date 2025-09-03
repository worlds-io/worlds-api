package io.worlds.api.model;


/**
 * A `TagConnection` is the paginated result of a [`tags` query]({{Queries.tags}})
See [about queries](/reference/query/#about-queries) for details on how "connection" and "edge" types are used with pagination.
 */
public class TagConnection implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private PageInfo pageInfo;
    @jakarta.validation.constraints.NotNull
    private java.util.List<TagEdge> edges;

    public TagConnection() {
    }

    public TagConnection(PageInfo pageInfo, java.util.List<TagEdge> edges) {
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
     * The resulting collection of Tag edges.
     */
    public java.util.List<TagEdge> getEdges() {
        return edges;
    }
    /**
     * The resulting collection of Tag edges.
     */
    public void setEdges(java.util.List<TagEdge> edges) {
        this.edges = edges;
    }



    public static TagConnection.Builder builder() {
        return new TagConnection.Builder();
    }

    public static class Builder {

        private PageInfo pageInfo;
        private java.util.List<TagEdge> edges;

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
         * The resulting collection of Tag edges.
         */
        public Builder setEdges(java.util.List<TagEdge> edges) {
            this.edges = edges;
            return this;
        }


        public TagConnection build() {
            return new TagConnection(pageInfo, edges);
        }

    }
}
