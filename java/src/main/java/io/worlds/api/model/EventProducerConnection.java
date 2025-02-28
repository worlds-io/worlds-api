package io.worlds.api.model;


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

    public PageInfo getPageInfo() {
        return pageInfo;
    }
    public void setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }

    public java.util.List<EventProducerEdge> getEdges() {
        return edges;
    }
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

        public Builder setPageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        public Builder setEdges(java.util.List<EventProducerEdge> edges) {
            this.edges = edges;
            return this;
        }


        public EventProducerConnection build() {
            return new EventProducerConnection(pageInfo, edges);
        }

    }
}
