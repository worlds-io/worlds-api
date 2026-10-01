package io.worlds.api.model;

import java.util.Objects;

/**
 * A page of [WorldModelNodes]({{Types.WorldModelNode}}).
 */
public class WorldModelNodeConnection implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private PageInfo pageInfo;
    @jakarta.validation.constraints.NotNull
    private java.util.List<WorldModelNodeConnectionEdge> edges;
    private int totalCount;

    public WorldModelNodeConnection() {
    }

    public WorldModelNodeConnection(PageInfo pageInfo, java.util.List<WorldModelNodeConnectionEdge> edges, int totalCount) {
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
     * The resulting page of nodes. (Pagination edges, not World Model edges.)
     */
    public java.util.List<WorldModelNodeConnectionEdge> getEdges() {
        return edges;
    }
    /**
     * The resulting page of nodes. (Pagination edges, not World Model edges.)
     */
    public void setEdges(java.util.List<WorldModelNodeConnectionEdge> edges) {
        this.edges = edges;
    }

    /**
     * The total count of nodes matching the query, across all pages.
     */
    public int getTotalCount() {
        return totalCount;
    }
    /**
     * The total count of nodes matching the query, across all pages.
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
        final WorldModelNodeConnection that = (WorldModelNodeConnection) obj;
        return Objects.equals(pageInfo, that.pageInfo)
            && Objects.equals(edges, that.edges)
            && Objects.equals(totalCount, that.totalCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pageInfo, edges, totalCount);
    }


    public static WorldModelNodeConnection.Builder builder() {
        return new WorldModelNodeConnection.Builder();
    }

    public static class Builder {

        private PageInfo pageInfo;
        private java.util.List<WorldModelNodeConnectionEdge> edges;
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
         * The resulting page of nodes. (Pagination edges, not World Model edges.)
         */
        public Builder setEdges(java.util.List<WorldModelNodeConnectionEdge> edges) {
            this.edges = edges;
            return this;
        }

        /**
         * The total count of nodes matching the query, across all pages.
         */
        public Builder setTotalCount(int totalCount) {
            this.totalCount = totalCount;
            return this;
        }


        public WorldModelNodeConnection build() {
            return new WorldModelNodeConnection(pageInfo, edges, totalCount);
        }

    }
}
