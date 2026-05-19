package io.worlds.api.model;

import java.util.Objects;

public class ZoneConnection implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private PageInfo pageInfo;
    @jakarta.validation.constraints.NotNull
    private java.util.List<ZoneEdge> edges;
    private int totalCount;

    public ZoneConnection() {
    }

    public ZoneConnection(PageInfo pageInfo, java.util.List<ZoneEdge> edges, int totalCount) {
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
     * The resulting collection of zone edges.
     */
    public java.util.List<ZoneEdge> getEdges() {
        return edges;
    }
    /**
     * The resulting collection of zone edges.
     */
    public void setEdges(java.util.List<ZoneEdge> edges) {
        this.edges = edges;
    }

    /**
     * The total count of zones matching the query, across all pages.
     */
    public int getTotalCount() {
        return totalCount;
    }
    /**
     * The total count of zones matching the query, across all pages.
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
        final ZoneConnection that = (ZoneConnection) obj;
        return Objects.equals(pageInfo, that.pageInfo)
            && Objects.equals(edges, that.edges)
            && Objects.equals(totalCount, that.totalCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pageInfo, edges, totalCount);
    }


    public static ZoneConnection.Builder builder() {
        return new ZoneConnection.Builder();
    }

    public static class Builder {

        private PageInfo pageInfo;
        private java.util.List<ZoneEdge> edges;
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
         * The resulting collection of zone edges.
         */
        public Builder setEdges(java.util.List<ZoneEdge> edges) {
            this.edges = edges;
            return this;
        }

        /**
         * The total count of zones matching the query, across all pages.
         */
        public Builder setTotalCount(int totalCount) {
            this.totalCount = totalCount;
            return this;
        }


        public ZoneConnection build() {
            return new ZoneConnection(pageInfo, edges, totalCount);
        }

    }
}
