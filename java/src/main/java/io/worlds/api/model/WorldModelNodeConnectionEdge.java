package io.worlds.api.model;

import java.util.Objects;

/**
 * One entry of a WorldModelNodeConnection.
 */
public class WorldModelNodeConnectionEdge implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private WorldModelNode node;
    @jakarta.validation.constraints.NotNull
    private String cursor;

    public WorldModelNodeConnectionEdge() {
    }

    public WorldModelNodeConnectionEdge(WorldModelNode node, String cursor) {
        this.node = node;
        this.cursor = cursor;
    }

    /**
     * The node.
     */
    public WorldModelNode getNode() {
        return node;
    }
    /**
     * The node.
     */
    public void setNode(WorldModelNode node) {
        this.node = node;
    }

    /**
     * The cursor to use with the worldModelNodes query `after` argument.
     */
    public String getCursor() {
        return cursor;
    }
    /**
     * The cursor to use with the worldModelNodes query `after` argument.
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
        final WorldModelNodeConnectionEdge that = (WorldModelNodeConnectionEdge) obj;
        return Objects.equals(node, that.node)
            && Objects.equals(cursor, that.cursor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(node, cursor);
    }


    public static WorldModelNodeConnectionEdge.Builder builder() {
        return new WorldModelNodeConnectionEdge.Builder();
    }

    public static class Builder {

        private WorldModelNode node;
        private String cursor;

        public Builder() {
        }

        /**
         * The node.
         */
        public Builder setNode(WorldModelNode node) {
            this.node = node;
            return this;
        }

        /**
         * The cursor to use with the worldModelNodes query `after` argument.
         */
        public Builder setCursor(String cursor) {
            this.cursor = cursor;
            return this;
        }


        public WorldModelNodeConnectionEdge build() {
            return new WorldModelNodeConnectionEdge(node, cursor);
        }

    }
}
