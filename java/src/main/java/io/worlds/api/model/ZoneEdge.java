package io.worlds.api.model;


public class ZoneEdge implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private Zone node;
    @jakarta.validation.constraints.NotNull
    private String cursor;

    public ZoneEdge() {
    }

    public ZoneEdge(Zone node, String cursor) {
        this.node = node;
        this.cursor = cursor;
    }

    /**
     * Information about a particular [Zone]({{Types.zone}}).
     */
    public Zone getNode() {
        return node;
    }
    /**
     * Information about a particular [Zone]({{Types.zone}}).
     */
    public void setNode(Zone node) {
        this.node = node;
    }

    /**
     * The cursor to use with the [Query `zones` field]({{Queries.zones}}) `after` argument.
     */
    public String getCursor() {
        return cursor;
    }
    /**
     * The cursor to use with the [Query `zones` field]({{Queries.zones}}) `after` argument.
     */
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }



    public static ZoneEdge.Builder builder() {
        return new ZoneEdge.Builder();
    }

    public static class Builder {

        private Zone node;
        private String cursor;

        public Builder() {
        }

        /**
         * Information about a particular [Zone]({{Types.zone}}).
         */
        public Builder setNode(Zone node) {
            this.node = node;
            return this;
        }

        /**
         * The cursor to use with the [Query `zones` field]({{Queries.zones}}) `after` argument.
         */
        public Builder setCursor(String cursor) {
            this.cursor = cursor;
            return this;
        }


        public ZoneEdge build() {
            return new ZoneEdge(node, cursor);
        }

    }
}
