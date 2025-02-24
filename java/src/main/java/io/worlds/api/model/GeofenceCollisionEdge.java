package io.worlds.api.model;


public class GeofenceCollisionEdge implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private GeofenceCollision node;
    @jakarta.validation.constraints.NotNull
    private String cursor;

    public GeofenceCollisionEdge() {
    }

    public GeofenceCollisionEdge(GeofenceCollision node, String cursor) {
        this.node = node;
        this.cursor = cursor;
    }

    public GeofenceCollision getNode() {
        return node;
    }
    public void setNode(GeofenceCollision node) {
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }



    public static GeofenceCollisionEdge.Builder builder() {
        return new GeofenceCollisionEdge.Builder();
    }

    public static class Builder {

        private GeofenceCollision node;
        private String cursor;

        public Builder() {
        }

        public Builder setNode(GeofenceCollision node) {
            this.node = node;
            return this;
        }

        public Builder setCursor(String cursor) {
            this.cursor = cursor;
            return this;
        }


        public GeofenceCollisionEdge build() {
            return new GeofenceCollisionEdge(node, cursor);
        }

    }
}
