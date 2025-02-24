package io.worlds.api.model;


public class GeofenceCollisionConnection implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private PageInfo pageInfo;
    @jakarta.validation.constraints.NotNull
    private java.util.List<GeofenceCollisionEdge> edges;

    public GeofenceCollisionConnection() {
    }

    public GeofenceCollisionConnection(PageInfo pageInfo, java.util.List<GeofenceCollisionEdge> edges) {
        this.pageInfo = pageInfo;
        this.edges = edges;
    }

    public PageInfo getPageInfo() {
        return pageInfo;
    }
    public void setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }

    public java.util.List<GeofenceCollisionEdge> getEdges() {
        return edges;
    }
    public void setEdges(java.util.List<GeofenceCollisionEdge> edges) {
        this.edges = edges;
    }



    public static GeofenceCollisionConnection.Builder builder() {
        return new GeofenceCollisionConnection.Builder();
    }

    public static class Builder {

        private PageInfo pageInfo;
        private java.util.List<GeofenceCollisionEdge> edges;

        public Builder() {
        }

        public Builder setPageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        public Builder setEdges(java.util.List<GeofenceCollisionEdge> edges) {
            this.edges = edges;
            return this;
        }


        public GeofenceCollisionConnection build() {
            return new GeofenceCollisionConnection(pageInfo, edges);
        }

    }
}
