package io.worlds.api.model;

import java.util.Objects;

/**
 * A detection edge is the pairing of a [Detection]({{Types.Detection}}) with its query cursor.
See [about queries](/guides/types/#queries) for details on how "connection" and "edge" types are used with pagination.
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
     * Information about a particular [Detection]({{Types.Detection}}).
     */
    public Detection getNode() {
        return node;
    }
    /**
     * Information about a particular [Detection]({{Types.Detection}}).
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

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final DetectionEdge that = (DetectionEdge) obj;
        return Objects.equals(node, that.node)
            && Objects.equals(cursor, that.cursor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(node, cursor);
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
         * Information about a particular [Detection]({{Types.Detection}}).
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
