package io.worlds.api.model;

import java.util.Objects;

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
     * Information about a particular [Zone]({{Types.Zone}}).
     */
    public Zone getNode() {
        return node;
    }
    /**
     * Information about a particular [Zone]({{Types.Zone}}).
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

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final ZoneEdge that = (ZoneEdge) obj;
        return Objects.equals(node, that.node)
            && Objects.equals(cursor, that.cursor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(node, cursor);
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
         * Information about a particular [Zone]({{Types.Zone}}).
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
