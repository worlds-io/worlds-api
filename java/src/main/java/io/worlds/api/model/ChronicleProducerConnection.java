package io.worlds.api.model;

import java.util.Objects;

/**
 * The paginated results of an [`chronicleProducers` query]({{Queries.chronicleProducers}}).
See [about queries](/guides/types/#queries) for details on how "connection" and "edge" types are used with pagination.
 */
public class ChronicleProducerConnection implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private java.util.List<ChronicleProducerEdge> edges;
    @jakarta.validation.constraints.NotNull
    private PageInfo pageInfo;
    private int totalCount;

    public ChronicleProducerConnection() {
    }

    public ChronicleProducerConnection(java.util.List<ChronicleProducerEdge> edges, PageInfo pageInfo, int totalCount) {
        this.edges = edges;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    /**
     * The resulting collection of chronicle producer edges.
     */
    public java.util.List<ChronicleProducerEdge> getEdges() {
        return edges;
    }
    /**
     * The resulting collection of chronicle producer edges.
     */
    public void setEdges(java.util.List<ChronicleProducerEdge> edges) {
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
     * The total count of chronicle producers matching the query, across all pages.
     */
    public int getTotalCount() {
        return totalCount;
    }
    /**
     * The total count of chronicle producers matching the query, across all pages.
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
        final ChronicleProducerConnection that = (ChronicleProducerConnection) obj;
        return Objects.equals(edges, that.edges)
            && Objects.equals(pageInfo, that.pageInfo)
            && Objects.equals(totalCount, that.totalCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(edges, pageInfo, totalCount);
    }


    public static ChronicleProducerConnection.Builder builder() {
        return new ChronicleProducerConnection.Builder();
    }

    public static class Builder {

        private java.util.List<ChronicleProducerEdge> edges;
        private PageInfo pageInfo;
        private int totalCount;

        public Builder() {
        }

        /**
         * The resulting collection of chronicle producer edges.
         */
        public Builder setEdges(java.util.List<ChronicleProducerEdge> edges) {
            this.edges = edges;
            return this;
        }

        /**
         * Pagination information for the resulting edges.
         */
        public Builder setPageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * The total count of chronicle producers matching the query, across all pages.
         */
        public Builder setTotalCount(int totalCount) {
            this.totalCount = totalCount;
            return this;
        }


        public ChronicleProducerConnection build() {
            return new ChronicleProducerConnection(edges, pageInfo, totalCount);
        }

    }
}
