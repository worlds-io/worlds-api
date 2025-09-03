package io.worlds.api.model;


/**
 * An event producer edge is the pairing of an [EventProducer]({{Types.eventProducer}}) with its query cursor.
See [about queries](/reference/query/#about-queries) for details on how "connection" and "edge" types are used with pagination.
 */
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

    /**
     * Information about a particular [EventProducer]({{Types.eventproducer}}).
     */
    public EventProducer getNode() {
        return node;
    }
    /**
     * Information about a particular [EventProducer]({{Types.eventproducer}}).
     */
    public void setNode(EventProducer node) {
        this.node = node;
    }

    /**
     * The cursor to use with the [Query `eventProducers` field]({{Queries.eventproducers}}) `after` argument.
     */
    public String getCursor() {
        return cursor;
    }
    /**
     * The cursor to use with the [Query `eventProducers` field]({{Queries.eventproducers}}) `after` argument.
     */
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

        /**
         * Information about a particular [EventProducer]({{Types.eventproducer}}).
         */
        public Builder setNode(EventProducer node) {
            this.node = node;
            return this;
        }

        /**
         * The cursor to use with the [Query `eventProducers` field]({{Queries.eventproducers}}) `after` argument.
         */
        public Builder setCursor(String cursor) {
            this.cursor = cursor;
            return this;
        }


        public EventProducerEdge build() {
            return new EventProducerEdge(node, cursor);
        }

    }
}
