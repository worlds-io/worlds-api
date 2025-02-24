package io.worlds.api.model;


public class GeofenceEventEdge implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private GeofenceEvent node;
    @jakarta.validation.constraints.NotNull
    private String cursor;

    public GeofenceEventEdge() {
    }

    public GeofenceEventEdge(GeofenceEvent node, String cursor) {
        this.node = node;
        this.cursor = cursor;
    }

    public GeofenceEvent getNode() {
        return node;
    }
    public void setNode(GeofenceEvent node) {
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }



    public static GeofenceEventEdge.Builder builder() {
        return new GeofenceEventEdge.Builder();
    }

    public static class Builder {

        private GeofenceEvent node;
        private String cursor;

        public Builder() {
        }

        public Builder setNode(GeofenceEvent node) {
            this.node = node;
            return this;
        }

        public Builder setCursor(String cursor) {
            this.cursor = cursor;
            return this;
        }


        public GeofenceEventEdge build() {
            return new GeofenceEventEdge(node, cursor);
        }

    }
}
