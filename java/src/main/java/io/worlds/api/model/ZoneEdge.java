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

    public Zone getNode() {
        return node;
    }
    public void setNode(Zone node) {
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
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

        public Builder setNode(Zone node) {
            this.node = node;
            return this;
        }

        public Builder setCursor(String cursor) {
            this.cursor = cursor;
            return this;
        }


        public ZoneEdge build() {
            return new ZoneEdge(node, cursor);
        }

    }
}
