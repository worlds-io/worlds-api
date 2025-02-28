package io.worlds.api.model;


public class VideoConnection implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private PageInfo pageInfo;
    @jakarta.validation.constraints.NotNull
    private java.util.List<VideoEdge> edges;

    public VideoConnection() {
    }

    public VideoConnection(PageInfo pageInfo, java.util.List<VideoEdge> edges) {
        this.pageInfo = pageInfo;
        this.edges = edges;
    }

    public PageInfo getPageInfo() {
        return pageInfo;
    }
    public void setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }

    public java.util.List<VideoEdge> getEdges() {
        return edges;
    }
    public void setEdges(java.util.List<VideoEdge> edges) {
        this.edges = edges;
    }



    public static VideoConnection.Builder builder() {
        return new VideoConnection.Builder();
    }

    public static class Builder {

        private PageInfo pageInfo;
        private java.util.List<VideoEdge> edges;

        public Builder() {
        }

        public Builder setPageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        public Builder setEdges(java.util.List<VideoEdge> edges) {
            this.edges = edges;
            return this;
        }


        public VideoConnection build() {
            return new VideoConnection(pageInfo, edges);
        }

    }
}
