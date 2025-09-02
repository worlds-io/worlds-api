package io.worlds.api.model;


/**
 * An `EventConnection` is the paginated results of an [`events` query]({{Queries.events}}).
See [about queries](/reference/query/#about-queries) for details on how "connection" and "edge" types are used with pagination.
 */
public class EventConnection implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private PageInfo pageInfo;
    @jakarta.validation.constraints.NotNull
    private java.util.List<EventEdge> edges;

    public EventConnection() {
    }

    public EventConnection(PageInfo pageInfo, java.util.List<EventEdge> edges) {
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
     * The resulting collection of event edges.
     */
    public java.util.List<EventEdge> getEdges() {
        return edges;
    }
    /**
     * The resulting collection of event edges.
     */
    public void setEdges(java.util.List<EventEdge> edges) {
        this.edges = edges;
    }



    public static EventConnection.Builder builder() {
        return new EventConnection.Builder();
    }

    public static class Builder {

        private PageInfo pageInfo;
        private java.util.List<EventEdge> edges;

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
         * The resulting collection of event edges.
         */
        public Builder setEdges(java.util.List<EventEdge> edges) {
            this.edges = edges;
            return this;
        }


        public EventConnection build() {
            return new EventConnection(pageInfo, edges);
        }

    }
}
