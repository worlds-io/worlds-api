package io.worlds.api.model;


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

    public PageInfo getPageInfo() {
        return pageInfo;
    }
    public void setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }

    public java.util.List<EventEdge> getEdges() {
        return edges;
    }
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

        public Builder setPageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        public Builder setEdges(java.util.List<EventEdge> edges) {
            this.edges = edges;
            return this;
        }


        public EventConnection build() {
            return new EventConnection(pageInfo, edges);
        }

    }
}
