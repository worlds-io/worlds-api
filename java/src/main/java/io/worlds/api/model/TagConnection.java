package io.worlds.api.model;


public class TagConnection implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private PageInfo pageInfo;
    @jakarta.validation.constraints.NotNull
    private java.util.List<TagEdge> edges;

    public TagConnection() {
    }

    public TagConnection(PageInfo pageInfo, java.util.List<TagEdge> edges) {
        this.pageInfo = pageInfo;
        this.edges = edges;
    }

    public PageInfo getPageInfo() {
        return pageInfo;
    }
    public void setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }

    public java.util.List<TagEdge> getEdges() {
        return edges;
    }
    public void setEdges(java.util.List<TagEdge> edges) {
        this.edges = edges;
    }



    public static TagConnection.Builder builder() {
        return new TagConnection.Builder();
    }

    public static class Builder {

        private PageInfo pageInfo;
        private java.util.List<TagEdge> edges;

        public Builder() {
        }

        public Builder setPageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        public Builder setEdges(java.util.List<TagEdge> edges) {
            this.edges = edges;
            return this;
        }


        public TagConnection build() {
            return new TagConnection(pageInfo, edges);
        }

    }
}
