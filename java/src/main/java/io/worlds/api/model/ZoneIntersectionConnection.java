package io.worlds.api.model;


public class ZoneIntersectionConnection implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private PageInfo pageInfo;
    @jakarta.validation.constraints.NotNull
    private java.util.List<ZoneIntersectionEdge> edges;

    public ZoneIntersectionConnection() {
    }

    public ZoneIntersectionConnection(PageInfo pageInfo, java.util.List<ZoneIntersectionEdge> edges) {
        this.pageInfo = pageInfo;
        this.edges = edges;
    }

    public PageInfo getPageInfo() {
        return pageInfo;
    }
    public void setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }

    public java.util.List<ZoneIntersectionEdge> getEdges() {
        return edges;
    }
    public void setEdges(java.util.List<ZoneIntersectionEdge> edges) {
        this.edges = edges;
    }



    public static ZoneIntersectionConnection.Builder builder() {
        return new ZoneIntersectionConnection.Builder();
    }

    public static class Builder {

        private PageInfo pageInfo;
        private java.util.List<ZoneIntersectionEdge> edges;

        public Builder() {
        }

        public Builder setPageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        public Builder setEdges(java.util.List<ZoneIntersectionEdge> edges) {
            this.edges = edges;
            return this;
        }


        public ZoneIntersectionConnection build() {
            return new ZoneIntersectionConnection(pageInfo, edges);
        }

    }
}
