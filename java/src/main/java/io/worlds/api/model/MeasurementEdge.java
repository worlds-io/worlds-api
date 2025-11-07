package io.worlds.api.model;

import java.util.Objects;

/**
 * An measurement edge is the pairing of an [Measurement]({{Types.Measurement}}) with its query cursor.
See [about queries](/guides/types/#queries) for details on how "connection" and "edge" types are used with pagination.
 */
public class MeasurementEdge implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private Measurement node;
    @jakarta.validation.constraints.NotNull
    private String cursor;

    public MeasurementEdge() {
    }

    public MeasurementEdge(Measurement node, String cursor) {
        this.node = node;
        this.cursor = cursor;
    }

    /**
     * Information about a particular measurement.
     */
    public Measurement getNode() {
        return node;
    }
    /**
     * Information about a particular measurement.
     */
    public void setNode(Measurement node) {
        this.node = node;
    }

    /**
     * The cursor to use with the [`measurements` query]({{Queries.measurements}}) `after` argument.
     */
    public String getCursor() {
        return cursor;
    }
    /**
     * The cursor to use with the [`measurements` query]({{Queries.measurements}}) `after` argument.
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
        final MeasurementEdge that = (MeasurementEdge) obj;
        return Objects.equals(node, that.node)
            && Objects.equals(cursor, that.cursor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(node, cursor);
    }


    public static MeasurementEdge.Builder builder() {
        return new MeasurementEdge.Builder();
    }

    public static class Builder {

        private Measurement node;
        private String cursor;

        public Builder() {
        }

        /**
         * Information about a particular measurement.
         */
        public Builder setNode(Measurement node) {
            this.node = node;
            return this;
        }

        /**
         * The cursor to use with the [`measurements` query]({{Queries.measurements}}) `after` argument.
         */
        public Builder setCursor(String cursor) {
            this.cursor = cursor;
            return this;
        }


        public MeasurementEdge build() {
            return new MeasurementEdge(node, cursor);
        }

    }
}
