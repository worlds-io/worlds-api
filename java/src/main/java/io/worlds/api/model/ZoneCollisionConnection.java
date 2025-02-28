package io.worlds.api.model;


public class ZoneCollisionConnection implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private PageInfo pageInfo;
    @jakarta.validation.constraints.NotNull
    private java.util.List<ZoneCollisionEdge> edges;

    public ZoneCollisionConnection() {
    }

    public ZoneCollisionConnection(PageInfo pageInfo, java.util.List<ZoneCollisionEdge> edges) {
        this.pageInfo = pageInfo;
        this.edges = edges;
    }

    public PageInfo getPageInfo() {
        return pageInfo;
    }
    public void setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }

    public java.util.List<ZoneCollisionEdge> getEdges() {
        return edges;
    }
    public void setEdges(java.util.List<ZoneCollisionEdge> edges) {
        this.edges = edges;
    }



    public static ZoneCollisionConnection.Builder builder() {
        return new ZoneCollisionConnection.Builder();
    }

    public static class Builder {

        private PageInfo pageInfo;
        private java.util.List<ZoneCollisionEdge> edges;

        public Builder() {
        }

        public Builder setPageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        public Builder setEdges(java.util.List<ZoneCollisionEdge> edges) {
            this.edges = edges;
            return this;
        }


        public ZoneCollisionConnection build() {
            return new ZoneCollisionConnection(pageInfo, edges);
        }

    }
}
