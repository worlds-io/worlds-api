package io.worlds.api.model;


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

    public ZoneIntersection getNode() {
        return node;
    }
    public void setNode(ZoneIntersection node) {
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }



    public static ZoneIntersectionEdge.Builder builder() {
        return new ZoneIntersectionEdge.Builder();
    }

    public static class Builder {

        private ZoneIntersection node;
        private String cursor;

        public Builder() {
        }

        public Builder setNode(ZoneIntersection node) {
            this.node = node;
            return this;
        }

        public Builder setCursor(String cursor) {
            this.cursor = cursor;
            return this;
        }


        public ZoneIntersectionEdge build() {
            return new ZoneIntersectionEdge(node, cursor);
        }

    }
}
