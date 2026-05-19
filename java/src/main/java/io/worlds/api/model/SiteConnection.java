package io.worlds.api.model;

import java.util.Objects;

public class SiteConnection implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private PageInfo pageInfo;
    @jakarta.validation.constraints.NotNull
    private java.util.List<SiteEdge> edges;
    private int totalCount;

    public SiteConnection() {
    }

    public SiteConnection(PageInfo pageInfo, java.util.List<SiteEdge> edges, int totalCount) {
        this.pageInfo = pageInfo;
        this.edges = edges;
        this.totalCount = totalCount;
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

    /**
     * The total count of sites matching the query, across all pages.
     */
    public int getTotalCount() {
        return totalCount;
    }
    /**
     * The total count of sites matching the query, across all pages.
     */
    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final SiteConnection that = (SiteConnection) obj;
        return Objects.equals(pageInfo, that.pageInfo)
            && Objects.equals(edges, that.edges)
            && Objects.equals(totalCount, that.totalCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pageInfo, edges, totalCount);
    }


    public static SiteConnection.Builder builder() {
        return new SiteConnection.Builder();
    }

    public static class Builder {

        private PageInfo pageInfo;
        private java.util.List<SiteEdge> edges;
        private int totalCount;

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

        /**
         * The total count of sites matching the query, across all pages.
         */
        public Builder setTotalCount(int totalCount) {
            this.totalCount = totalCount;
            return this;
        }


        public SiteConnection build() {
            return new SiteConnection(pageInfo, edges, totalCount);
        }

    }
}
