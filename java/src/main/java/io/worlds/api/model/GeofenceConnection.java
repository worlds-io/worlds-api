package io.worlds.api.model;


public class GeofenceConnection implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private PageInfo pageInfo;
    @jakarta.validation.constraints.NotNull
    private java.util.List<GeofenceEdge> edges;

    public GeofenceConnection() {
    }

    public GeofenceConnection(PageInfo pageInfo, java.util.List<GeofenceEdge> edges) {
        this.pageInfo = pageInfo;
        this.edges = edges;
    }

    public PageInfo getPageInfo() {
        return pageInfo;
    }
    public void setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }

    public java.util.List<GeofenceEdge> getEdges() {
        return edges;
    }
    public void setEdges(java.util.List<GeofenceEdge> edges) {
        this.edges = edges;
    }



    public static GeofenceConnection.Builder builder() {
        return new GeofenceConnection.Builder();
    }

    public static class Builder {

        private PageInfo pageInfo;
        private java.util.List<GeofenceEdge> edges;

        public Builder() {
        }

        public Builder setPageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        public Builder setEdges(java.util.List<GeofenceEdge> edges) {
            this.edges = edges;
            return this;
        }


        public GeofenceConnection build() {
            return new GeofenceConnection(pageInfo, edges);
        }

    }
}
