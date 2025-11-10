package io.worlds.api.model;

import java.util.Objects;

public class GeofenceIntersectionConnection implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private PageInfo pageInfo;
    @jakarta.validation.constraints.NotNull
    private java.util.List<GeofenceIntersectionEdge> edges;

    public GeofenceIntersectionConnection() {
    }

    public GeofenceIntersectionConnection(PageInfo pageInfo, java.util.List<GeofenceIntersectionEdge> edges) {
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
     * The resulting collection of geofence intersections edges.
     */
    public java.util.List<GeofenceIntersectionEdge> getEdges() {
        return edges;
    }
    /**
     * The resulting collection of geofence intersections edges.
     */
    public void setEdges(java.util.List<GeofenceIntersectionEdge> edges) {
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
        final GeofenceIntersectionConnection that = (GeofenceIntersectionConnection) obj;
        return Objects.equals(pageInfo, that.pageInfo)
            && Objects.equals(edges, that.edges);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pageInfo, edges);
    }


    public static GeofenceIntersectionConnection.Builder builder() {
        return new GeofenceIntersectionConnection.Builder();
    }

    public static class Builder {

        private PageInfo pageInfo;
        private java.util.List<GeofenceIntersectionEdge> edges;

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
         * The resulting collection of geofence intersections edges.
         */
        public Builder setEdges(java.util.List<GeofenceIntersectionEdge> edges) {
            this.edges = edges;
            return this;
        }


        public GeofenceIntersectionConnection build() {
            return new GeofenceIntersectionConnection(pageInfo, edges);
        }

    }
}
