package io.worlds.api.model;


public class VideoEdge implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private Video node;
    @jakarta.validation.constraints.NotNull
    private String cursor;

    public VideoEdge() {
    }

    public VideoEdge(Video node, String cursor) {
        this.node = node;
        this.cursor = cursor;
    }

    public Video getNode() {
        return node;
    }
    public void setNode(Video node) {
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }



    public static VideoEdge.Builder builder() {
        return new VideoEdge.Builder();
    }

    public static class Builder {

        private Video node;
        private String cursor;

        public Builder() {
        }

        public Builder setNode(Video node) {
            this.node = node;
            return this;
        }

        public Builder setCursor(String cursor) {
            this.cursor = cursor;
            return this;
        }


        public VideoEdge build() {
            return new VideoEdge(node, cursor);
        }

    }
}
