package io.worlds.api.model;


/**
 * A sensor edge is the pairing of a [Sensor]({{Types.sensor}}) with its query cursor.
See [about queries](/reference/query/#about-queries) for details on how "connection" and "edge" types are used with pagination.
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
     * Information about a particular [Sensor]({{Types.sensor}}).
     */
    public Sensor getNode() {
        return node;
    }
    /**
     * Information about a particular [Sensor]({{Types.sensor}}).
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



    public static SensorEdge.Builder builder() {
        return new SensorEdge.Builder();
    }

    public static class Builder {

        private Sensor node;
        private String cursor;

        public Builder() {
        }

        /**
         * Information about a particular [Sensor]({{Types.sensor}}).
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
