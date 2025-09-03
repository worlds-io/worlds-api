package io.worlds.api.model;


public class SensorConnection implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private PageInfo pageInfo;
    @jakarta.validation.constraints.NotNull
    private java.util.List<SensorEdge> edges;

    public SensorConnection() {
    }

    public SensorConnection(PageInfo pageInfo, java.util.List<SensorEdge> edges) {
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
     * The resulting collection of sensor edges.
     */
    public java.util.List<SensorEdge> getEdges() {
        return edges;
    }
    /**
     * The resulting collection of sensor edges.
     */
    public void setEdges(java.util.List<SensorEdge> edges) {
        this.edges = edges;
    }



    public static SensorConnection.Builder builder() {
        return new SensorConnection.Builder();
    }

    public static class Builder {

        private PageInfo pageInfo;
        private java.util.List<SensorEdge> edges;

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
         * The resulting collection of sensor edges.
         */
        public Builder setEdges(java.util.List<SensorEdge> edges) {
            this.edges = edges;
            return this;
        }


        public SensorConnection build() {
            return new SensorConnection(pageInfo, edges);
        }

    }
}
