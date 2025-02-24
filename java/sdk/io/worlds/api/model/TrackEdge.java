package io.worlds.api.model;


public class TrackEdge implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private Track node;
    @jakarta.validation.constraints.NotNull
    private String cursor;

    public TrackEdge() {
    }

    public TrackEdge(Track node, String cursor) {
        this.node = node;
        this.cursor = cursor;
    }

    public Track getNode() {
        return node;
    }
    public void setNode(Track node) {
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }



    public static TrackEdge.Builder builder() {
        return new TrackEdge.Builder();
    }

    public static class Builder {

        private Track node;
        private String cursor;

        public Builder() {
        }

        public Builder setNode(Track node) {
            this.node = node;
            return this;
        }

        public Builder setCursor(String cursor) {
            this.cursor = cursor;
            return this;
        }


        public TrackEdge build() {
            return new TrackEdge(node, cursor);
        }

    }
}
