package io.worlds.api.model;


public class DetectionEdge implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private Detection node;
    @jakarta.validation.constraints.NotNull
    private String cursor;

    public DetectionEdge() {
    }

    public DetectionEdge(Detection node, String cursor) {
        this.node = node;
        this.cursor = cursor;
    }

    public Detection getNode() {
        return node;
    }
    public void setNode(Detection node) {
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }



    public static DetectionEdge.Builder builder() {
        return new DetectionEdge.Builder();
    }

    public static class Builder {

        private Detection node;
        private String cursor;

        public Builder() {
        }

        public Builder setNode(Detection node) {
            this.node = node;
            return this;
        }

        public Builder setCursor(String cursor) {
            this.cursor = cursor;
            return this;
        }


        public DetectionEdge build() {
            return new DetectionEdge(node, cursor);
        }

    }
}
