package io.worlds.api.model;

import java.util.Objects;

/**
 * A `MeasurementConnection` is the paginated results of an [`measurements` query]({{Queries.measurements}}).
See [about queries](/guides/types/#queries) for details on how "connection" and "edge" types are used with pagination.
 */
public class MeasurementConnection implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private PageInfo pageInfo;
    @jakarta.validation.constraints.NotNull
    private java.util.List<MeasurementEdge> edges;
    private int totalCount;

    public MeasurementConnection() {
    }

    public MeasurementConnection(PageInfo pageInfo, java.util.List<MeasurementEdge> edges, int totalCount) {
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

    /**
     * The total count of measurements matching the query, across all pages.
     */
    public int getTotalCount() {
        return totalCount;
    }
    /**
     * The total count of measurements matching the query, across all pages.
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
        final MeasurementConnection that = (MeasurementConnection) obj;
        return Objects.equals(pageInfo, that.pageInfo)
            && Objects.equals(edges, that.edges)
            && Objects.equals(totalCount, that.totalCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pageInfo, edges, totalCount);
    }


    public static MeasurementConnection.Builder builder() {
        return new MeasurementConnection.Builder();
    }

    public static class Builder {

        private PageInfo pageInfo;
        private java.util.List<MeasurementEdge> edges;
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
         * The resulting collection of measurement edges.
         */
        public Builder setEdges(java.util.List<MeasurementEdge> edges) {
            this.edges = edges;
            return this;
        }

        /**
         * The total count of measurements matching the query, across all pages.
         */
        public Builder setTotalCount(int totalCount) {
            this.totalCount = totalCount;
            return this;
        }


        public MeasurementConnection build() {
            return new MeasurementConnection(pageInfo, edges, totalCount);
        }

    }
}
