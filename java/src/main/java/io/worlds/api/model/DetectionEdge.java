package io.worlds.api.model;


/**
 * A detection edge is the pairing of a [Detection]({{Types.detection}}) with its query cursor.
See [about queries](/reference/query/#about-queries) for details on how "connection" and "edge" types are used with pagination.
 */
public class DetectionEdge implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private Detection node;
    @jakarta.validation.constraints.NotNull
    private String cursor;

    public DetectionEdge() {
    }

    public DetectionEdge(Detection node, String cursor) {
        this.node = node;
        this.cursor = cursor;
    }

    /**
     * Information about a particular [Detection]({{Types.detection}}).
     */
    public Detection getNode() {
        return node;
    }
    /**
     * Information about a particular [Detection]({{Types.detection}}).
     */
    public void setNode(Detection node) {
        this.node = node;
    }

    /**
     * The cursor to use with the [`detections` query]({{Queries.detections}}) `after` argument.
     */
    public String getCursor() {
        return cursor;
    }
    /**
     * The cursor to use with the [`detections` query]({{Queries.detections}}) `after` argument.
     */
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }



    public static DetectionEdge.Builder builder() {
        return new DetectionEdge.Builder();
    }

    public static class Builder {

        private Detection node;
        private String cursor;

        public Builder() {
        }

        /**
         * Information about a particular [Detection]({{Types.detection}}).
         */
        public Builder setNode(Detection node) {
            this.node = node;
            return this;
        }

        /**
         * The cursor to use with the [`detections` query]({{Queries.detections}}) `after` argument.
         */
        public Builder setCursor(String cursor) {
            this.cursor = cursor;
            return this;
        }


        public DetectionEdge build() {
            return new DetectionEdge(node, cursor);
        }

    }
}
