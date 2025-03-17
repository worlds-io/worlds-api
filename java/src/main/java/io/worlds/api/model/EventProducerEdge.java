package io.worlds.api.model;


public class EventProducerEdge implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private EventProducer node;
    @jakarta.validation.constraints.NotNull
    private String cursor;

    public EventProducerEdge() {
    }

    public EventProducerEdge(EventProducer node, String cursor) {
        this.node = node;
        this.cursor = cursor;
    }

    public EventProducer getNode() {
        return node;
    }
    public void setNode(EventProducer node) {
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }



    public static EventProducerEdge.Builder builder() {
        return new EventProducerEdge.Builder();
    }

    public static class Builder {

        private EventProducer node;
        private String cursor;

        public Builder() {
        }

        public Builder setNode(EventProducer node) {
            this.node = node;
            return this;
        }

        public Builder setCursor(String cursor) {
            this.cursor = cursor;
            return this;
        }


        public EventProducerEdge build() {
            return new EventProducerEdge(node, cursor);
        }

    }
}
