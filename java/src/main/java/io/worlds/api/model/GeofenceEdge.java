package io.worlds.api.model;


public class GeofenceEdge implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private Geofence node;
    @jakarta.validation.constraints.NotNull
    private String cursor;

    public GeofenceEdge() {
    }

    public GeofenceEdge(Geofence node, String cursor) {
        this.node = node;
        this.cursor = cursor;
    }

    public Geofence getNode() {
        return node;
    }
    public void setNode(Geofence node) {
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }



    public static GeofenceEdge.Builder builder() {
        return new GeofenceEdge.Builder();
    }

    public static class Builder {

        private Geofence node;
        private String cursor;

        public Builder() {
        }

        public Builder setNode(Geofence node) {
            this.node = node;
            return this;
        }

        public Builder setCursor(String cursor) {
            this.cursor = cursor;
            return this;
        }


        public GeofenceEdge build() {
            return new GeofenceEdge(node, cursor);
        }

    }
}
