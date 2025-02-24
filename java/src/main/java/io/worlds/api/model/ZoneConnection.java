package io.worlds.api.model;


public class ZoneConnection implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private PageInfo pageInfo;
    @jakarta.validation.constraints.NotNull
    private java.util.List<ZoneEdge> edges;

    public ZoneConnection() {
    }

    public ZoneConnection(PageInfo pageInfo, java.util.List<ZoneEdge> edges) {
        this.pageInfo = pageInfo;
        this.edges = edges;
    }

    public PageInfo getPageInfo() {
        return pageInfo;
    }
    public void setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }

    public java.util.List<ZoneEdge> getEdges() {
        return edges;
    }
    public void setEdges(java.util.List<ZoneEdge> edges) {
        this.edges = edges;
    }



    public static ZoneConnection.Builder builder() {
        return new ZoneConnection.Builder();
    }

    public static class Builder {

        private PageInfo pageInfo;
        private java.util.List<ZoneEdge> edges;

        public Builder() {
        }

        public Builder setPageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        public Builder setEdges(java.util.List<ZoneEdge> edges) {
            this.edges = edges;
            return this;
        }


        public ZoneConnection build() {
            return new ZoneConnection(pageInfo, edges);
        }

    }
}
