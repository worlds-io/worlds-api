package io.worlds.api.model;


/**
 * An `EventConnection` is the paginated results of an [`events` query]({{Queries.eventChronicles}}).
See [about queries](/reference/query/#about-queries) for details on how "connection" and "edge" types are used with pagination.
 */
public class EventChronicleConnection implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private java.util.List<EventChronicleEdge> edges;
    @jakarta.validation.constraints.NotNull
    private PageInfo pageInfo;

    public EventChronicleConnection() {
    }

    public EventChronicleConnection(java.util.List<EventChronicleEdge> edges, PageInfo pageInfo) {
        this.edges = edges;
        this.pageInfo = pageInfo;
    }

    /**
     * Pagination information for the resulting edges.
     */
    public java.util.List<EventChronicleEdge> getEdges() {
        return edges;
    }
    /**
     * Pagination information for the resulting edges.
     */
    public void setEdges(java.util.List<EventChronicleEdge> edges) {
        this.edges = edges;
    }

    /**
     * The resulting collection of event edges.
     */
    public PageInfo getPageInfo() {
        return pageInfo;
    }
    /**
     * The resulting collection of event edges.
     */
    public void setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }



    public static EventChronicleConnection.Builder builder() {
        return new EventChronicleConnection.Builder();
    }

    public static class Builder {

        private java.util.List<EventChronicleEdge> edges;
        private PageInfo pageInfo;

        public Builder() {
        }

        /**
         * Pagination information for the resulting edges.
         */
        public Builder setEdges(java.util.List<EventChronicleEdge> edges) {
            this.edges = edges;
            return this;
        }

        /**
         * The resulting collection of event edges.
         */
        public Builder setPageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }


        public EventChronicleConnection build() {
            return new EventChronicleConnection(edges, pageInfo);
        }

    }
}
