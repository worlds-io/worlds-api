package io.worlds.api.model;

import java.util.Objects;

/**
 * An `GeofenceConnection` is the paginated results of a [`geofences` query]({{Queries.geofences}}).
See [about queries](/guides/types/#queries) for details on how "connection" and "edge" types are used with pagination.
 */
public class GeofenceConnection implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private PageInfo pageInfo;
    @jakarta.validation.constraints.NotNull
    private java.util.List<GeofenceEdge> edges;
    private int totalCount;

    public GeofenceConnection() {
    }

    public GeofenceConnection(PageInfo pageInfo, java.util.List<GeofenceEdge> edges, int totalCount) {
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
     * The resulting collection of geofence edges.
     */
    public java.util.List<GeofenceEdge> getEdges() {
        return edges;
    }
    /**
     * The resulting collection of geofence edges.
     */
    public void setEdges(java.util.List<GeofenceEdge> edges) {
        this.edges = edges;
    }

    /**
     * The total count of geofences matching the query, across all pages.
     */
    public int getTotalCount() {
        return totalCount;
    }
    /**
     * The total count of geofences matching the query, across all pages.
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
        final GeofenceConnection that = (GeofenceConnection) obj;
        return Objects.equals(pageInfo, that.pageInfo)
            && Objects.equals(edges, that.edges)
            && Objects.equals(totalCount, that.totalCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pageInfo, edges, totalCount);
    }


    public static GeofenceConnection.Builder builder() {
        return new GeofenceConnection.Builder();
    }

    public static class Builder {

        private PageInfo pageInfo;
        private java.util.List<GeofenceEdge> edges;
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
         * The resulting collection of geofence edges.
         */
        public Builder setEdges(java.util.List<GeofenceEdge> edges) {
            this.edges = edges;
            return this;
        }

        /**
         * The total count of geofences matching the query, across all pages.
         */
        public Builder setTotalCount(int totalCount) {
            this.totalCount = totalCount;
            return this;
        }


        public GeofenceConnection build() {
            return new GeofenceConnection(pageInfo, edges, totalCount);
        }

    }
}
