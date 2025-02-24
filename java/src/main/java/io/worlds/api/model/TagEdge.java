package io.worlds.api.model;


public class TagEdge implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private Tag node;
    @jakarta.validation.constraints.NotNull
    private String cursor;

    public TagEdge() {
    }

    public TagEdge(Tag node, String cursor) {
        this.node = node;
        this.cursor = cursor;
    }

    public Tag getNode() {
        return node;
    }
    public void setNode(Tag node) {
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }



    public static TagEdge.Builder builder() {
        return new TagEdge.Builder();
    }

    public static class Builder {

        private Tag node;
        private String cursor;

        public Builder() {
        }

        public Builder setNode(Tag node) {
            this.node = node;
            return this;
        }

        public Builder setCursor(String cursor) {
            this.cursor = cursor;
            return this;
        }


        public TagEdge build() {
            return new TagEdge(node, cursor);
        }

    }
}
