package io.worlds.api.model;

import java.util.Objects;

/**
 * An `SummaryConnection` is the paginated results of an [`summaries` query]({{Queries.summaryChronicles}}).
See [about queries](/guides/types/#queries) for details on how "connection" and "edge" types are used with pagination.
 */
public class SummaryChronicleConnection implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private java.util.List<SummaryChronicleEdge> edges;
    @jakarta.validation.constraints.NotNull
    private PageInfo pageInfo;
    private int totalCount;

    public SummaryChronicleConnection() {
    }

    public SummaryChronicleConnection(java.util.List<SummaryChronicleEdge> edges, PageInfo pageInfo, int totalCount) {
        this.edges = edges;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    /**
     * Pagination information for the resulting edges.
     */
    public java.util.List<SummaryChronicleEdge> getEdges() {
        return edges;
    }
    /**
     * Pagination information for the resulting edges.
     */
    public void setEdges(java.util.List<SummaryChronicleEdge> edges) {
        this.edges = edges;
    }

    /**
     * The resulting collection of summary edges.
     */
    public PageInfo getPageInfo() {
        return pageInfo;
    }
    /**
     * The resulting collection of summary edges.
     */
    public void setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }

    /**
     * The total count of summaries matching the query, across all pages.
     */
    public int getTotalCount() {
        return totalCount;
    }
    /**
     * The total count of summaries matching the query, across all pages.
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
        final SummaryChronicleConnection that = (SummaryChronicleConnection) obj;
        return Objects.equals(edges, that.edges)
            && Objects.equals(pageInfo, that.pageInfo)
            && Objects.equals(totalCount, that.totalCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(edges, pageInfo, totalCount);
    }


    public static SummaryChronicleConnection.Builder builder() {
        return new SummaryChronicleConnection.Builder();
    }

    public static class Builder {

        private java.util.List<SummaryChronicleEdge> edges;
        private PageInfo pageInfo;
        private int totalCount;

        public Builder() {
        }

        /**
         * Pagination information for the resulting edges.
         */
        public Builder setEdges(java.util.List<SummaryChronicleEdge> edges) {
            this.edges = edges;
            return this;
        }

        /**
         * The resulting collection of summary edges.
         */
        public Builder setPageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * The total count of summaries matching the query, across all pages.
         */
        public Builder setTotalCount(int totalCount) {
            this.totalCount = totalCount;
            return this;
        }


        public SummaryChronicleConnection build() {
            return new SummaryChronicleConnection(edges, pageInfo, totalCount);
        }

    }
}
