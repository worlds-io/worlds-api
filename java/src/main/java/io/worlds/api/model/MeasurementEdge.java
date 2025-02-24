package io.worlds.api.model;


public class MeasurementEdge implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private Measurement node;
    @jakarta.validation.constraints.NotNull
    private String cursor;

    public MeasurementEdge() {
    }

    public MeasurementEdge(Measurement node, String cursor) {
        this.node = node;
        this.cursor = cursor;
    }

    public Measurement getNode() {
        return node;
    }
    public void setNode(Measurement node) {
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }



    public static MeasurementEdge.Builder builder() {
        return new MeasurementEdge.Builder();
    }

    public static class Builder {

        private Measurement node;
        private String cursor;

        public Builder() {
        }

        public Builder setNode(Measurement node) {
            this.node = node;
            return this;
        }

        public Builder setCursor(String cursor) {
            this.cursor = cursor;
            return this;
        }


        public MeasurementEdge build() {
            return new MeasurementEdge(node, cursor);
        }

    }
}
