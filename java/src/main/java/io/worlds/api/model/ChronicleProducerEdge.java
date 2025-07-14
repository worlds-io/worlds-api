package io.worlds.api.model;


public class ChronicleProducerEdge implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private ChronicleProducer node;
    @jakarta.validation.constraints.NotNull
    private String cursor;

    public ChronicleProducerEdge() {
    }

    public ChronicleProducerEdge(ChronicleProducer node, String cursor) {
        this.node = node;
        this.cursor = cursor;
    }

    public ChronicleProducer getNode() {
        return node;
    }
    public void setNode(ChronicleProducer node) {
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }



    public static ChronicleProducerEdge.Builder builder() {
        return new ChronicleProducerEdge.Builder();
    }

    public static class Builder {

        private ChronicleProducer node;
        private String cursor;

        public Builder() {
        }

        public Builder setNode(ChronicleProducer node) {
            this.node = node;
            return this;
        }

        public Builder setCursor(String cursor) {
            this.cursor = cursor;
            return this;
        }


        public ChronicleProducerEdge build() {
            return new ChronicleProducerEdge(node, cursor);
        }

    }
}
