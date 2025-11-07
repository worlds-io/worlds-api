package io.worlds.api.model;

import java.util.Objects;

public class ZoneEventEdge implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private ZoneEvent node;
    @jakarta.validation.constraints.NotNull
    private String cursor;

    public ZoneEventEdge() {
    }

    public ZoneEventEdge(ZoneEvent node, String cursor) {
        this.node = node;
        this.cursor = cursor;
    }

    /**
     * Information about a particular [ZoneEvent]({{Types.ZoneEvent}}).
     */
    public ZoneEvent getNode() {
        return node;
    }
    /**
     * Information about a particular [ZoneEvent]({{Types.ZoneEvent}}).
     */
    public void setNode(ZoneEvent node) {
        this.node = node;
    }

    /**
     * The cursor to use with the [Query `zoneEvents` field]({{Queries.zoneEvents}}) `after` argument.
     */
    public String getCursor() {
        return cursor;
    }
    /**
     * The cursor to use with the [Query `zoneEvents` field]({{Queries.zoneEvents}}) `after` argument.
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
        final ZoneEventEdge that = (ZoneEventEdge) obj;
        return Objects.equals(node, that.node)
            && Objects.equals(cursor, that.cursor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(node, cursor);
    }


    public static ZoneEventEdge.Builder builder() {
        return new ZoneEventEdge.Builder();
    }

    public static class Builder {

        private ZoneEvent node;
        private String cursor;

        public Builder() {
        }

        /**
         * Information about a particular [ZoneEvent]({{Types.ZoneEvent}}).
         */
        public Builder setNode(ZoneEvent node) {
            this.node = node;
            return this;
        }

        /**
         * The cursor to use with the [Query `zoneEvents` field]({{Queries.zoneEvents}}) `after` argument.
         */
        public Builder setCursor(String cursor) {
            this.cursor = cursor;
            return this;
        }


        public ZoneEventEdge build() {
            return new ZoneEventEdge(node, cursor);
        }

    }
}
