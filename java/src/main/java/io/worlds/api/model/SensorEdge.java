package io.worlds.api.model;


public class SensorEdge implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private Sensor node;
    @jakarta.validation.constraints.NotNull
    private String cursor;

    public SensorEdge() {
    }

    public SensorEdge(Sensor node, String cursor) {
        this.node = node;
        this.cursor = cursor;
    }

    public Sensor getNode() {
        return node;
    }
    public void setNode(Sensor node) {
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }



    public static SensorEdge.Builder builder() {
        return new SensorEdge.Builder();
    }

    public static class Builder {

        private Sensor node;
        private String cursor;

        public Builder() {
        }

        public Builder setNode(Sensor node) {
            this.node = node;
            return this;
        }

        public Builder setCursor(String cursor) {
            this.cursor = cursor;
            return this;
        }


        public SensorEdge build() {
            return new SensorEdge(node, cursor);
        }

    }
}
