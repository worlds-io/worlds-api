package io.worlds.api.model;


public class DataSourceConnection implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private PageInfo pageInfo;
    @jakarta.validation.constraints.NotNull
    private java.util.List<DataSourceEdge> edges;

    public DataSourceConnection() {
    }

    public DataSourceConnection(PageInfo pageInfo, java.util.List<DataSourceEdge> edges) {
        this.pageInfo = pageInfo;
        this.edges = edges;
    }

    public PageInfo getPageInfo() {
        return pageInfo;
    }
    public void setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }

    public java.util.List<DataSourceEdge> getEdges() {
        return edges;
    }
    public void setEdges(java.util.List<DataSourceEdge> edges) {
        this.edges = edges;
    }



    public static DataSourceConnection.Builder builder() {
        return new DataSourceConnection.Builder();
    }

    public static class Builder {

        private PageInfo pageInfo;
        private java.util.List<DataSourceEdge> edges;

        public Builder() {
        }

        public Builder setPageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        public Builder setEdges(java.util.List<DataSourceEdge> edges) {
            this.edges = edges;
            return this;
        }


        public DataSourceConnection build() {
            return new DataSourceConnection(pageInfo, edges);
        }

    }
}
