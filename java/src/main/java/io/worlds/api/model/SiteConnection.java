package io.worlds.api.model;


public class SiteConnection implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private PageInfo pageInfo;
    @jakarta.validation.constraints.NotNull
    private java.util.List<SiteEdge> edges;

    public SiteConnection() {
    }

    public SiteConnection(PageInfo pageInfo, java.util.List<SiteEdge> edges) {
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
     * The resulting collection of site edges.
     */
    public java.util.List<SiteEdge> getEdges() {
        return edges;
    }
    /**
     * The resulting collection of site edges.
     */
    public void setEdges(java.util.List<SiteEdge> edges) {
        this.edges = edges;
    }



    public static SiteConnection.Builder builder() {
        return new SiteConnection.Builder();
    }

    public static class Builder {

        private PageInfo pageInfo;
        private java.util.List<SiteEdge> edges;

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
         * The resulting collection of site edges.
         */
        public Builder setEdges(java.util.List<SiteEdge> edges) {
            this.edges = edges;
            return this;
        }


        public SiteConnection build() {
            return new SiteConnection(pageInfo, edges);
        }

    }
}
