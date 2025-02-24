package io.worlds.api.model;


public class PointOfInterestConnection implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private PageInfo pageInfo;
    @jakarta.validation.constraints.NotNull
    private java.util.List<PointOfInterestEdge> edges;

    public PointOfInterestConnection() {
    }

    public PointOfInterestConnection(PageInfo pageInfo, java.util.List<PointOfInterestEdge> edges) {
        this.pageInfo = pageInfo;
        this.edges = edges;
    }

    public PageInfo getPageInfo() {
        return pageInfo;
    }
    public void setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }

    public java.util.List<PointOfInterestEdge> getEdges() {
        return edges;
    }
    public void setEdges(java.util.List<PointOfInterestEdge> edges) {
        this.edges = edges;
    }



    public static PointOfInterestConnection.Builder builder() {
        return new PointOfInterestConnection.Builder();
    }

    public static class Builder {

        private PageInfo pageInfo;
        private java.util.List<PointOfInterestEdge> edges;

        public Builder() {
        }

        public Builder setPageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        public Builder setEdges(java.util.List<PointOfInterestEdge> edges) {
            this.edges = edges;
            return this;
        }


        public PointOfInterestConnection build() {
            return new PointOfInterestConnection(pageInfo, edges);
        }

    }
}
