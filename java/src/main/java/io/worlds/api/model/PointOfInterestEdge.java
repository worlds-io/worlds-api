package io.worlds.api.model;


public class PointOfInterestEdge implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private PointOfInterest node;
    @jakarta.validation.constraints.NotNull
    private String cursor;

    public PointOfInterestEdge() {
    }

    public PointOfInterestEdge(PointOfInterest node, String cursor) {
        this.node = node;
        this.cursor = cursor;
    }

    public PointOfInterest getNode() {
        return node;
    }
    public void setNode(PointOfInterest node) {
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }



    public static PointOfInterestEdge.Builder builder() {
        return new PointOfInterestEdge.Builder();
    }

    public static class Builder {

        private PointOfInterest node;
        private String cursor;

        public Builder() {
        }

        public Builder setNode(PointOfInterest node) {
            this.node = node;
            return this;
        }

        public Builder setCursor(String cursor) {
            this.cursor = cursor;
            return this;
        }


        public PointOfInterestEdge build() {
            return new PointOfInterestEdge(node, cursor);
        }

    }
}
