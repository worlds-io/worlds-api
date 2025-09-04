package io.worlds.api.model;


/**
 * An `ActivityConnection` is the paginated results of an [`activities` query]({{Queries.activityChronicles}}).
See [about queries](/reference/query/#about-queries) for details on how "connection" and "edge" types are used with pagination.
 */
public class ActivityChronicleConnection implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private java.util.List<ActivityChronicleEdge> edges;
    @jakarta.validation.constraints.NotNull
    private PageInfo pageInfo;

    public ActivityChronicleConnection() {
    }

    public ActivityChronicleConnection(java.util.List<ActivityChronicleEdge> edges, PageInfo pageInfo) {
        this.edges = edges;
        this.pageInfo = pageInfo;
    }

    /**
     * Pagination information for the resulting edges.
     */
    public java.util.List<ActivityChronicleEdge> getEdges() {
        return edges;
    }
    /**
     * Pagination information for the resulting edges.
     */
    public void setEdges(java.util.List<ActivityChronicleEdge> edges) {
        this.edges = edges;
    }

    /**
     * The resulting collection of activity edges.
     */
    public PageInfo getPageInfo() {
        return pageInfo;
    }
    /**
     * The resulting collection of activity edges.
     */
    public void setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }



    public static ActivityChronicleConnection.Builder builder() {
        return new ActivityChronicleConnection.Builder();
    }

    public static class Builder {

        private java.util.List<ActivityChronicleEdge> edges;
        private PageInfo pageInfo;

        public Builder() {
        }

        /**
         * Pagination information for the resulting edges.
         */
        public Builder setEdges(java.util.List<ActivityChronicleEdge> edges) {
            this.edges = edges;
            return this;
        }

        /**
         * The resulting collection of activity edges.
         */
        public Builder setPageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }


        public ActivityChronicleConnection build() {
            return new ActivityChronicleConnection(edges, pageInfo);
        }

    }
}
