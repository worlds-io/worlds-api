package io.worlds.api.model;


public class TrackConnection implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private PageInfo pageInfo;
    @jakarta.validation.constraints.NotNull
    private java.util.List<TrackEdge> edges;

    public TrackConnection() {
    }

    public TrackConnection(PageInfo pageInfo, java.util.List<TrackEdge> edges) {
        this.pageInfo = pageInfo;
        this.edges = edges;
    }

    public PageInfo getPageInfo() {
        return pageInfo;
    }
    public void setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }

    public java.util.List<TrackEdge> getEdges() {
        return edges;
    }
    public void setEdges(java.util.List<TrackEdge> edges) {
        this.edges = edges;
    }



    public static TrackConnection.Builder builder() {
        return new TrackConnection.Builder();
    }

    public static class Builder {

        private PageInfo pageInfo;
        private java.util.List<TrackEdge> edges;

        public Builder() {
        }

        public Builder setPageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        public Builder setEdges(java.util.List<TrackEdge> edges) {
            this.edges = edges;
            return this;
        }


        public TrackConnection build() {
            return new TrackConnection(pageInfo, edges);
        }

    }
}
