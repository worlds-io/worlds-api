package io.worlds.api.model;


public class GeofenceEventConnection implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private PageInfo pageInfo;
    @jakarta.validation.constraints.NotNull
    private java.util.List<GeofenceEventEdge> edges;

    public GeofenceEventConnection() {
    }

    public GeofenceEventConnection(PageInfo pageInfo, java.util.List<GeofenceEventEdge> edges) {
        this.pageInfo = pageInfo;
        this.edges = edges;
    }

    public PageInfo getPageInfo() {
        return pageInfo;
    }
    public void setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }

    public java.util.List<GeofenceEventEdge> getEdges() {
        return edges;
    }
    public void setEdges(java.util.List<GeofenceEventEdge> edges) {
        this.edges = edges;
    }



    public static GeofenceEventConnection.Builder builder() {
        return new GeofenceEventConnection.Builder();
    }

    public static class Builder {

        private PageInfo pageInfo;
        private java.util.List<GeofenceEventEdge> edges;

        public Builder() {
        }

        public Builder setPageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        public Builder setEdges(java.util.List<GeofenceEventEdge> edges) {
            this.edges = edges;
            return this;
        }


        public GeofenceEventConnection build() {
            return new GeofenceEventConnection(pageInfo, edges);
        }

    }
}
