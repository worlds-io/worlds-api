package io.worlds.api.model;


public class DetectionConnection implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private PageInfo pageInfo;
    @jakarta.validation.constraints.NotNull
    private java.util.List<DetectionEdge> edges;

    public DetectionConnection() {
    }

    public DetectionConnection(PageInfo pageInfo, java.util.List<DetectionEdge> edges) {
        this.pageInfo = pageInfo;
        this.edges = edges;
    }

    public PageInfo getPageInfo() {
        return pageInfo;
    }
    public void setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }

    public java.util.List<DetectionEdge> getEdges() {
        return edges;
    }
    public void setEdges(java.util.List<DetectionEdge> edges) {
        this.edges = edges;
    }



    public static DetectionConnection.Builder builder() {
        return new DetectionConnection.Builder();
    }

    public static class Builder {

        private PageInfo pageInfo;
        private java.util.List<DetectionEdge> edges;

        public Builder() {
        }

        public Builder setPageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        public Builder setEdges(java.util.List<DetectionEdge> edges) {
            this.edges = edges;
            return this;
        }


        public DetectionConnection build() {
            return new DetectionConnection(pageInfo, edges);
        }

    }
}
