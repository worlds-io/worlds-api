package io.worlds.api.model;

import java.util.Objects;

/**
 * A point of interest edge is the pairing of a [PointOfInterest]({{Types.PointOfInterest}}) with its query cursor.
See [about queries](/guides/types/#queries) for details on how "connection" and "edge" types are used with pagination.
 */
public class PointOfInterestEdge implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private PointOfInterest node;
    @jakarta.validation.constraints.NotNull
    private String cursor;

    public PointOfInterestEdge() {
    }

    public PointOfInterestEdge(PointOfInterest node, String cursor) {
        this.node = node;
        this.cursor = cursor;
    }

    /**
     * Information about a particular [PointOfInterest]({{Types.PointOfInterest}}).
     */
    public PointOfInterest getNode() {
        return node;
    }
    /**
     * Information about a particular [PointOfInterest]({{Types.PointOfInterest}}).
     */
    public void setNode(PointOfInterest node) {
        this.node = node;
    }

    /**
     * The cursor to use with the [`pointsOfInterest` query]({{Queries.pointsOfInterest}}) `after` argument.
     */
    public String getCursor() {
        return cursor;
    }
    /**
     * The cursor to use with the [`pointsOfInterest` query]({{Queries.pointsOfInterest}}) `after` argument.
     */
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final PointOfInterestEdge that = (PointOfInterestEdge) obj;
        return Objects.equals(node, that.node)
            && Objects.equals(cursor, that.cursor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(node, cursor);
    }


    public static PointOfInterestEdge.Builder builder() {
        return new PointOfInterestEdge.Builder();
    }

    public static class Builder {

        private PointOfInterest node;
        private String cursor;

        public Builder() {
        }

        /**
         * Information about a particular [PointOfInterest]({{Types.PointOfInterest}}).
         */
        public Builder setNode(PointOfInterest node) {
            this.node = node;
            return this;
        }

        /**
         * The cursor to use with the [`pointsOfInterest` query]({{Queries.pointsOfInterest}}) `after` argument.
         */
        public Builder setCursor(String cursor) {
            this.cursor = cursor;
            return this;
        }


        public PointOfInterestEdge build() {
            return new PointOfInterestEdge(node, cursor);
        }

    }
}
