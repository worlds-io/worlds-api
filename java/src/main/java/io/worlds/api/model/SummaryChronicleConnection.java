package io.worlds.api.model;


/**
 * An `SummaryConnection` is the paginated results of an [`summaries` query]({{Queries.summaryChronicles}}).
See [about queries](/reference/query/#about-queries) for details on how "connection" and "edge" types are used with pagination.
 */
public class SummaryChronicleConnection implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private java.util.List<SummaryChronicleEdge> edges;
    @jakarta.validation.constraints.NotNull
    private PageInfo pageInfo;

    public SummaryChronicleConnection() {
    }

    public SummaryChronicleConnection(java.util.List<SummaryChronicleEdge> edges, PageInfo pageInfo) {
        this.edges = edges;
        this.pageInfo = pageInfo;
    }

    /**
     * Pagination information for the resulting edges.
     */
    public java.util.List<SummaryChronicleEdge> getEdges() {
        return edges;
    }
    /**
     * Pagination information for the resulting edges.
     */
    public void setEdges(java.util.List<SummaryChronicleEdge> edges) {
        this.edges = edges;
    }

    /**
     * The resulting collection of summary edges.
     */
    public PageInfo getPageInfo() {
        return pageInfo;
    }
    /**
     * The resulting collection of summary edges.
     */
    public void setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }



    public static SummaryChronicleConnection.Builder builder() {
        return new SummaryChronicleConnection.Builder();
    }

    public static class Builder {

        private java.util.List<SummaryChronicleEdge> edges;
        private PageInfo pageInfo;

        public Builder() {
        }

        /**
         * Pagination information for the resulting edges.
         */
        public Builder setEdges(java.util.List<SummaryChronicleEdge> edges) {
            this.edges = edges;
            return this;
        }

        /**
         * The resulting collection of summary edges.
         */
        public Builder setPageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }


        public SummaryChronicleConnection build() {
            return new SummaryChronicleConnection(edges, pageInfo);
        }

    }
}
