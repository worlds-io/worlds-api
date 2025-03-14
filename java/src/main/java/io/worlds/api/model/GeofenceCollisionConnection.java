package io.worlds.api.model;


public class GeofenceIntersectionConnection implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private PageInfo pageInfo;
    @jakarta.validation.constraints.NotNull
    private java.util.List<GeofenceIntersectionEdge> edges;

    public GeofenceIntersectionConnection() {
    }

    public GeofenceIntersectionConnection(PageInfo pageInfo, java.util.List<GeofenceIntersectionEdge> edges) {
        this.pageInfo = pageInfo;
        this.edges = edges;
    }

    public PageInfo getPageInfo() {
        return pageInfo;
    }
    public void setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }

    public java.util.List<GeofenceIntersectionEdge> getEdges() {
        return edges;
    }
    public void setEdges(java.util.List<GeofenceIntersectionEdge> edges) {
        this.edges = edges;
    }



    public static GeofenceIntersectionConnection.Builder builder() {
        return new GeofenceIntersectionConnection.Builder();
    }

    public static class Builder {

        private PageInfo pageInfo;
        private java.util.List<GeofenceIntersectionEdge> edges;

        public Builder() {
        }

        public Builder setPageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        public Builder setEdges(java.util.List<GeofenceIntersectionEdge> edges) {
            this.edges = edges;
            return this;
        }


        public GeofenceIntersectionConnection build() {
            return new GeofenceIntersectionConnection(pageInfo, edges);
        }

    }
}
