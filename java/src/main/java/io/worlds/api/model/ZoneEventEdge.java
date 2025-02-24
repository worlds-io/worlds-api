package io.worlds.api.model;


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

    public ZoneEvent getNode() {
        return node;
    }
    public void setNode(ZoneEvent node) {
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }



    public static ZoneEventEdge.Builder builder() {
        return new ZoneEventEdge.Builder();
    }

    public static class Builder {

        private ZoneEvent node;
        private String cursor;

        public Builder() {
        }

        public Builder setNode(ZoneEvent node) {
            this.node = node;
            return this;
        }

        public Builder setCursor(String cursor) {
            this.cursor = cursor;
            return this;
        }


        public ZoneEventEdge build() {
            return new ZoneEventEdge(node, cursor);
        }

    }
}
