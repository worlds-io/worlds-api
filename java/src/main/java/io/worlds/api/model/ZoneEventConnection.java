package io.worlds.api.model;


public class ZoneEventConnection implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private PageInfo pageInfo;
    @jakarta.validation.constraints.NotNull
    private java.util.List<ZoneEventEdge> edges;

    public ZoneEventConnection() {
    }

    public ZoneEventConnection(PageInfo pageInfo, java.util.List<ZoneEventEdge> edges) {
        this.pageInfo = pageInfo;
        this.edges = edges;
    }

    public PageInfo getPageInfo() {
        return pageInfo;
    }
    public void setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }

    public java.util.List<ZoneEventEdge> getEdges() {
        return edges;
    }
    public void setEdges(java.util.List<ZoneEventEdge> edges) {
        this.edges = edges;
    }



    public static ZoneEventConnection.Builder builder() {
        return new ZoneEventConnection.Builder();
    }

    public static class Builder {

        private PageInfo pageInfo;
        private java.util.List<ZoneEventEdge> edges;

        public Builder() {
        }

        public Builder setPageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        public Builder setEdges(java.util.List<ZoneEventEdge> edges) {
            this.edges = edges;
            return this;
        }


        public ZoneEventConnection build() {
            return new ZoneEventConnection(pageInfo, edges);
        }

    }
}
