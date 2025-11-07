package io.worlds.api.model;

import java.util.Objects;

/**
 * A sensor edge is the pairing of a [Sensor]({{Types.Sensor}}) with its query cursor.
See [about queries](/guides/types/#queries) for details on how "connection" and "edge" types are used with pagination.
 */
public class SensorEdge implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private Sensor node;
    @jakarta.validation.constraints.NotNull
    private String cursor;

    public SensorEdge() {
    }

    public SensorEdge(Sensor node, String cursor) {
        this.node = node;
        this.cursor = cursor;
    }

    /**
     * Information about a particular [Sensor]({{Types.Sensor}}).
     */
    public Sensor getNode() {
        return node;
    }
    /**
     * Information about a particular [Sensor]({{Types.Sensor}}).
     */
    public void setNode(Sensor node) {
        this.node = node;
    }

    /**
     * The cursor to use with the [`sensors` query]({{Queries.sensors}}) `after` argument.
     */
    public String getCursor() {
        return cursor;
    }
    /**
     * The cursor to use with the [`sensors` query]({{Queries.sensors}}) `after` argument.
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
        final SensorEdge that = (SensorEdge) obj;
        return Objects.equals(node, that.node)
            && Objects.equals(cursor, that.cursor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(node, cursor);
    }


    public static SensorEdge.Builder builder() {
        return new SensorEdge.Builder();
    }

    public static class Builder {

        private Sensor node;
        private String cursor;

        public Builder() {
        }

        /**
         * Information about a particular [Sensor]({{Types.Sensor}}).
         */
        public Builder setNode(Sensor node) {
            this.node = node;
            return this;
        }

        /**
         * The cursor to use with the [`sensors` query]({{Queries.sensors}}) `after` argument.
         */
        public Builder setCursor(String cursor) {
            this.cursor = cursor;
            return this;
        }


        public SensorEdge build() {
            return new SensorEdge(node, cursor);
        }

    }
}
