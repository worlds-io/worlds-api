package io.worlds.api.model;


/**
 * A `DataSourceConnection` is the paginated results of a [`data sources` query]({{Queries.datasources}}).
See [about queries](/reference/query/#about-queries) for details on how "connection" and "edge" types are used with pagination.
 */
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

    /**
     * Pagination information for the resulting edges.
     */
    public PageInfo getPageInfo() {
        return pageInfo;
    }
    /**
     * Pagination information for the resulting edges.
     */
    public void setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }

    /**
     * The resulting collection of detection edges.
     */
    public java.util.List<DataSourceEdge> getEdges() {
        return edges;
    }
    /**
     * The resulting collection of detection edges.
     */
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

        /**
         * Pagination information for the resulting edges.
         */
        public Builder setPageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * The resulting collection of detection edges.
         */
        public Builder setEdges(java.util.List<DataSourceEdge> edges) {
            this.edges = edges;
            return this;
        }


        public DataSourceConnection build() {
            return new DataSourceConnection(pageInfo, edges);
        }

    }
}
