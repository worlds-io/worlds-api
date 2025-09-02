package io.worlds.api.model;


/**
 * A `MeasurementConnection` is the paginated results of an [`measurements` query]({{Queries.measurements}}).
See [about queries](/reference/query/#about-queries) for details on how "connection" and "edge" types are used with pagination.
 */
public class MeasurementConnection implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private PageInfo pageInfo;
    @jakarta.validation.constraints.NotNull
    private java.util.List<MeasurementEdge> edges;

    public MeasurementConnection() {
    }

    public MeasurementConnection(PageInfo pageInfo, java.util.List<MeasurementEdge> edges) {
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
     * The resulting collection of measurement edges.
     */
    public java.util.List<MeasurementEdge> getEdges() {
        return edges;
    }
    /**
     * The resulting collection of measurement edges.
     */
    public void setEdges(java.util.List<MeasurementEdge> edges) {
        this.edges = edges;
    }



    public static MeasurementConnection.Builder builder() {
        return new MeasurementConnection.Builder();
    }

    public static class Builder {

        private PageInfo pageInfo;
        private java.util.List<MeasurementEdge> edges;

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
         * The resulting collection of measurement edges.
         */
        public Builder setEdges(java.util.List<MeasurementEdge> edges) {
            this.edges = edges;
            return this;
        }


        public MeasurementConnection build() {
            return new MeasurementConnection(pageInfo, edges);
        }

    }
}
