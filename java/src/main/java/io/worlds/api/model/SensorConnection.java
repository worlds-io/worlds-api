package io.worlds.api.model;

import java.util.Objects;

public class SensorConnection implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private PageInfo pageInfo;
    @jakarta.validation.constraints.NotNull
    private java.util.List<SensorEdge> edges;
    private int totalCount;

    public SensorConnection() {
    }

    public SensorConnection(PageInfo pageInfo, java.util.List<SensorEdge> edges, int totalCount) {
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

    /**
     * The total count of sensors matching the query, across all pages.
     */
    public int getTotalCount() {
        return totalCount;
    }
    /**
     * The total count of sensors matching the query, across all pages.
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
        final SensorConnection that = (SensorConnection) obj;
        return Objects.equals(pageInfo, that.pageInfo)
            && Objects.equals(edges, that.edges)
            && Objects.equals(totalCount, that.totalCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pageInfo, edges, totalCount);
    }


    public static SensorConnection.Builder builder() {
        return new SensorConnection.Builder();
    }

    public static class Builder {

        private PageInfo pageInfo;
        private java.util.List<SensorEdge> edges;
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
         * The resulting collection of sensor edges.
         */
        public Builder setEdges(java.util.List<SensorEdge> edges) {
            this.edges = edges;
            return this;
        }

        /**
         * The total count of sensors matching the query, across all pages.
         */
        public Builder setTotalCount(int totalCount) {
            this.totalCount = totalCount;
            return this;
        }


        public SensorConnection build() {
            return new SensorConnection(pageInfo, edges, totalCount);
        }

    }
}
