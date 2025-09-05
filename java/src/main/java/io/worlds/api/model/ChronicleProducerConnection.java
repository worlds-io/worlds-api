package io.worlds.api.model;


/**
 * The paginated results of an [`chronicleProducers` query]({{Queries.chronicleproducers}}).
See [about queries](/reference/query/#about-queries) for details on how "connection" and "edge" types are used with pagination.
 */
public class ChronicleProducerConnection implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private java.util.List<ChronicleProducerEdge> edges;
    @jakarta.validation.constraints.NotNull
    private PageInfo pageInfo;

    public ChronicleProducerConnection() {
    }

    public ChronicleProducerConnection(java.util.List<ChronicleProducerEdge> edges, PageInfo pageInfo) {
        this.edges = edges;
        this.pageInfo = pageInfo;
    }

    /**
     * The resulting collection of chronicle producer edges.
     */
    public java.util.List<ChronicleProducerEdge> getEdges() {
        return edges;
    }
    /**
     * The resulting collection of chronicle producer edges.
     */
    public void setEdges(java.util.List<ChronicleProducerEdge> edges) {
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



    public static ChronicleProducerConnection.Builder builder() {
        return new ChronicleProducerConnection.Builder();
    }

    public static class Builder {

        private java.util.List<ChronicleProducerEdge> edges;
        private PageInfo pageInfo;

        public Builder() {
        }

        /**
         * The resulting collection of chronicle producer edges.
         */
        public Builder setEdges(java.util.List<ChronicleProducerEdge> edges) {
            this.edges = edges;
            return this;
        }

        /**
         * Pagination information for the resulting edges.
         */
        public Builder setPageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }


        public ChronicleProducerConnection build() {
            return new ChronicleProducerConnection(edges, pageInfo);
        }

    }
}
