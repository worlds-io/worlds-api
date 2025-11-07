package io.worlds.api.model;

import java.util.Objects;

public class PointOfInterestConnection implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private PageInfo pageInfo;
    @jakarta.validation.constraints.NotNull
    private java.util.List<PointOfInterestEdge> edges;

    public PointOfInterestConnection() {
    }

    public PointOfInterestConnection(PageInfo pageInfo, java.util.List<PointOfInterestEdge> edges) {
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
    public java.util.List<PointOfInterestEdge> getEdges() {
        return edges;
    }
    /**
     * The resulting collection of site edges.
     */
    public void setEdges(java.util.List<PointOfInterestEdge> edges) {
        this.edges = edges;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final PointOfInterestConnection that = (PointOfInterestConnection) obj;
        return Objects.equals(pageInfo, that.pageInfo)
            && Objects.equals(edges, that.edges);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pageInfo, edges);
    }


    public static PointOfInterestConnection.Builder builder() {
        return new PointOfInterestConnection.Builder();
    }

    public static class Builder {

        private PageInfo pageInfo;
        private java.util.List<PointOfInterestEdge> edges;

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
        public Builder setEdges(java.util.List<PointOfInterestEdge> edges) {
            this.edges = edges;
            return this;
        }


        public PointOfInterestConnection build() {
            return new PointOfInterestConnection(pageInfo, edges);
        }

    }
}
