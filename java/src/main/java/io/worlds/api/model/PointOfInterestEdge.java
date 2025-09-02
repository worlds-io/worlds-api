package io.worlds.api.model;


/**
 * A point of interest edge is the pairing of a [PointOfInterest]({{Types.pointofinterest}}) with its query cursor.
See [about queries](/reference/query/#about-queries) for details on how "connection" and "edge" types are used with pagination.
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
     * Information about a particular [PointOfInterest]({{Types.pointofinterest}}).
     */
    public PointOfInterest getNode() {
        return node;
    }
    /**
     * Information about a particular [PointOfInterest]({{Types.pointofinterest}}).
     */
    public void setNode(PointOfInterest node) {
        this.node = node;
    }

    /**
     * The cursor to use with the [`pointsOfInterest` query]({{Queries.pointsofinterest}}) `after` argument.
     */
    public String getCursor() {
        return cursor;
    }
    /**
     * The cursor to use with the [`pointsOfInterest` query]({{Queries.pointsofinterest}}) `after` argument.
     */
    public void setCursor(String cursor) {
        this.cursor = cursor;
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
         * Information about a particular [PointOfInterest]({{Types.pointofinterest}}).
         */
        public Builder setNode(PointOfInterest node) {
            this.node = node;
            return this;
        }

        /**
         * The cursor to use with the [`pointsOfInterest` query]({{Queries.pointsofinterest}}) `after` argument.
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
