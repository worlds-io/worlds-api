package io.worlds.api.model;

import java.util.Objects;

/**
 * A `TagConnection` is the paginated result of a [`tags` query]({{Queries.tags}})
See [about queries](/guides/types/#queries) for details on how "connection" and "edge" types are used with pagination.
 */
public class TagConnection implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private PageInfo pageInfo;
    @jakarta.validation.constraints.NotNull
    private java.util.List<TagEdge> edges;
    private int totalCount;

    public TagConnection() {
    }

    public TagConnection(PageInfo pageInfo, java.util.List<TagEdge> edges, int totalCount) {
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
     * The resulting collection of Tag edges.
     */
    public java.util.List<TagEdge> getEdges() {
        return edges;
    }
    /**
     * The resulting collection of Tag edges.
     */
    public void setEdges(java.util.List<TagEdge> edges) {
        this.edges = edges;
    }

    /**
     * The total count of tags matching the query, across all pages.
     */
    public int getTotalCount() {
        return totalCount;
    }
    /**
     * The total count of tags matching the query, across all pages.
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
        final TagConnection that = (TagConnection) obj;
        return Objects.equals(pageInfo, that.pageInfo)
            && Objects.equals(edges, that.edges)
            && Objects.equals(totalCount, that.totalCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pageInfo, edges, totalCount);
    }


    public static TagConnection.Builder builder() {
        return new TagConnection.Builder();
    }

    public static class Builder {

        private PageInfo pageInfo;
        private java.util.List<TagEdge> edges;
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
         * The resulting collection of Tag edges.
         */
        public Builder setEdges(java.util.List<TagEdge> edges) {
            this.edges = edges;
            return this;
        }

        /**
         * The total count of tags matching the query, across all pages.
         */
        public Builder setTotalCount(int totalCount) {
            this.totalCount = totalCount;
            return this;
        }


        public TagConnection build() {
            return new TagConnection(pageInfo, edges, totalCount);
        }

    }
}
