package io.worlds.api.model;


public class ZoneCollisionEdge implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private ZoneCollision node;
    @jakarta.validation.constraints.NotNull
    private String cursor;

    public ZoneCollisionEdge() {
    }

    public ZoneCollisionEdge(ZoneCollision node, String cursor) {
        this.node = node;
        this.cursor = cursor;
    }

    public ZoneCollision getNode() {
        return node;
    }
    public void setNode(ZoneCollision node) {
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }



    public static ZoneCollisionEdge.Builder builder() {
        return new ZoneCollisionEdge.Builder();
    }

    public static class Builder {

        private ZoneCollision node;
        private String cursor;

        public Builder() {
        }

        public Builder setNode(ZoneCollision node) {
            this.node = node;
            return this;
        }

        public Builder setCursor(String cursor) {
            this.cursor = cursor;
            return this;
        }


        public ZoneCollisionEdge build() {
            return new ZoneCollisionEdge(node, cursor);
        }

    }
}
