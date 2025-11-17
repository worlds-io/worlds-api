package io.worlds.api.model;

import java.util.Objects;

/**
 * A `ImageConnection` is the paginated results of a [`images` query]({{Queries.images}}).
See [about queries](/guides/types/#queries) for details on how "connection" and "edge" types are used with pagination.
 */
public class ImageConnection implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private PageInfo pageInfo;
    @jakarta.validation.constraints.NotNull
    private java.util.List<ImageEdge> edges;

    public ImageConnection() {
    }

    public ImageConnection(PageInfo pageInfo, java.util.List<ImageEdge> edges) {
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
     * The resulting collection of detection edges.
     */
    public java.util.List<ImageEdge> getEdges() {
        return edges;
    }
    /**
     * The resulting collection of detection edges.
     */
    public void setEdges(java.util.List<ImageEdge> edges) {
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
        final ImageConnection that = (ImageConnection) obj;
        return Objects.equals(pageInfo, that.pageInfo)
            && Objects.equals(edges, that.edges);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pageInfo, edges);
    }


    public static ImageConnection.Builder builder() {
        return new ImageConnection.Builder();
    }

    public static class Builder {

        private PageInfo pageInfo;
        private java.util.List<ImageEdge> edges;

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
         * The resulting collection of detection edges.
         */
        public Builder setEdges(java.util.List<ImageEdge> edges) {
            this.edges = edges;
            return this;
        }


        public ImageConnection build() {
            return new ImageConnection(pageInfo, edges);
        }

    }
}
