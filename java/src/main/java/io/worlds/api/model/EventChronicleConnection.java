package io.worlds.api.model;


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

    public java.util.List<EventChronicleEdge> getEdges() {
        return edges;
    }
    public void setEdges(java.util.List<EventChronicleEdge> edges) {
        this.edges = edges;
    }

    public PageInfo getPageInfo() {
        return pageInfo;
    }
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

        public Builder setEdges(java.util.List<EventChronicleEdge> edges) {
            this.edges = edges;
            return this;
        }

        public Builder setPageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }


        public EventChronicleConnection build() {
            return new EventChronicleConnection(edges, pageInfo);
        }

    }
}
