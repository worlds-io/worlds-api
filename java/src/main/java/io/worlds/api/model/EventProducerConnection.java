package io.worlds.api.model;


/**
 * An `EventProducerConnection` is the paginated results of an [`eventProducers` query]({{Queries.eventproducers}}).
See [about queries](/reference/query/#about-queries) for details on how "connection" and "edge" types are used with pagination.
 */
public class EventProducerConnection implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private PageInfo pageInfo;
    @jakarta.validation.constraints.NotNull
    private java.util.List<EventProducerEdge> edges;

    public EventProducerConnection() {
    }

    public EventProducerConnection(PageInfo pageInfo, java.util.List<EventProducerEdge> edges) {
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
     * The resulting collection of event producer edges.
     */
    public java.util.List<EventProducerEdge> getEdges() {
        return edges;
    }
    /**
     * The resulting collection of event producer edges.
     */
    public void setEdges(java.util.List<EventProducerEdge> edges) {
        this.edges = edges;
    }



    public static EventProducerConnection.Builder builder() {
        return new EventProducerConnection.Builder();
    }

    public static class Builder {

        private PageInfo pageInfo;
        private java.util.List<EventProducerEdge> edges;

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
         * The resulting collection of event producer edges.
         */
        public Builder setEdges(java.util.List<EventProducerEdge> edges) {
            this.edges = edges;
            return this;
        }


        public EventProducerConnection build() {
            return new EventProducerConnection(pageInfo, edges);
        }

    }
}
