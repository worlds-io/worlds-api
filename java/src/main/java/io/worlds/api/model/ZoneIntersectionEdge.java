package io.worlds.api.model;

import java.util.Objects;

public class ZoneIntersectionEdge implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private ZoneIntersection node;
    @jakarta.validation.constraints.NotNull
    private String cursor;

    public ZoneIntersectionEdge() {
    }

    public ZoneIntersectionEdge(ZoneIntersection node, String cursor) {
        this.node = node;
        this.cursor = cursor;
    }

    /**
     * Information about a particular [ZoneIntersection]({{Types.ZoneIntersection}}).
     */
    public ZoneIntersection getNode() {
        return node;
    }
    /**
     * Information about a particular [ZoneIntersection]({{Types.ZoneIntersection}}).
     */
    public void setNode(ZoneIntersection node) {
        this.node = node;
    }

    /**
     * The cursor to use with the [Query `zoneIntersections` field]({{Queries.zoneIntersections}}) `after` argument.
     */
    public String getCursor() {
        return cursor;
    }
    /**
     * The cursor to use with the [Query `zoneIntersections` field]({{Queries.zoneIntersections}}) `after` argument.
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
        final ZoneIntersectionEdge that = (ZoneIntersectionEdge) obj;
        return Objects.equals(node, that.node)
            && Objects.equals(cursor, that.cursor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(node, cursor);
    }


    public static ZoneIntersectionEdge.Builder builder() {
        return new ZoneIntersectionEdge.Builder();
    }

    public static class Builder {

        private ZoneIntersection node;
        private String cursor;

        public Builder() {
        }

        /**
         * Information about a particular [ZoneIntersection]({{Types.ZoneIntersection}}).
         */
        public Builder setNode(ZoneIntersection node) {
            this.node = node;
            return this;
        }

        /**
         * The cursor to use with the [Query `zoneIntersections` field]({{Queries.zoneIntersections}}) `after` argument.
         */
        public Builder setCursor(String cursor) {
            this.cursor = cursor;
            return this;
        }


        public ZoneIntersectionEdge build() {
            return new ZoneIntersectionEdge(node, cursor);
        }

    }
}
