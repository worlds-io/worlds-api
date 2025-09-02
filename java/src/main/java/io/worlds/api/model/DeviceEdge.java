package io.worlds.api.model;


/**
 * A device edge is the pairing of a [Device]({{Types.device}}) with its query cursor.
See [about queries](/reference/query/#about-queries) for details on how "connection" and "edge" types are used with pagination.
 */
public class DeviceEdge implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private Device node;
    @jakarta.validation.constraints.NotNull
    private String cursor;

    public DeviceEdge() {
    }

    public DeviceEdge(Device node, String cursor) {
        this.node = node;
        this.cursor = cursor;
    }

    /**
     * Information about a particular [Device]({{Types.device}}).
     */
    public Device getNode() {
        return node;
    }
    /**
     * Information about a particular [Device]({{Types.device}}).
     */
    public void setNode(Device node) {
        this.node = node;
    }

    /**
     * The cursor to use with the [Query `devices` field]({{Queries.devices}}) `after` argument.
     */
    public String getCursor() {
        return cursor;
    }
    /**
     * The cursor to use with the [Query `devices` field]({{Queries.devices}}) `after` argument.
     */
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }



    public static DeviceEdge.Builder builder() {
        return new DeviceEdge.Builder();
    }

    public static class Builder {

        private Device node;
        private String cursor;

        public Builder() {
        }

        /**
         * Information about a particular [Device]({{Types.device}}).
         */
        public Builder setNode(Device node) {
            this.node = node;
            return this;
        }

        /**
         * The cursor to use with the [Query `devices` field]({{Queries.devices}}) `after` argument.
         */
        public Builder setCursor(String cursor) {
            this.cursor = cursor;
            return this;
        }


        public DeviceEdge build() {
            return new DeviceEdge(node, cursor);
        }

    }
}
