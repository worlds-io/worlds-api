package io.worlds.api.model;


public class ChronicleDocumentProducerEdge implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private ChronicleDocumentProducer node;
    @jakarta.validation.constraints.NotNull
    private String cursor;

    public ChronicleDocumentProducerEdge() {
    }

    public ChronicleDocumentProducerEdge(ChronicleDocumentProducer node, String cursor) {
        this.node = node;
        this.cursor = cursor;
    }

    public ChronicleDocumentProducer getNode() {
        return node;
    }
    public void setNode(ChronicleDocumentProducer node) {
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }



    public static ChronicleDocumentProducerEdge.Builder builder() {
        return new ChronicleDocumentProducerEdge.Builder();
    }

    public static class Builder {

        private ChronicleDocumentProducer node;
        private String cursor;

        public Builder() {
        }

        public Builder setNode(ChronicleDocumentProducer node) {
            this.node = node;
            return this;
        }

        public Builder setCursor(String cursor) {
            this.cursor = cursor;
            return this;
        }


        public ChronicleDocumentProducerEdge build() {
            return new ChronicleDocumentProducerEdge(node, cursor);
        }

    }
}
