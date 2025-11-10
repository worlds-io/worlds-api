package io.worlds.api.model;

import java.util.Objects;

/**
 * An event producer edge is the pairing of an [EventProducer]({{Types.EventProducer}}) with its query cursor.
See [about queries](/guides/types/#queries) for details on how "connection" and "edge" types are used with pagination.
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
     * Information about a particular [EventProducer]({{Types.EventProducer}}).
     */
    public EventProducer getNode() {
        return node;
    }
    /**
     * Information about a particular [EventProducer]({{Types.EventProducer}}).
     */
    public void setNode(EventProducer node) {
        this.node = node;
    }

    /**
     * The cursor to use with the [Query `eventProducers` field]({{Queries.eventProducers}}) `after` argument.
     */
    public String getCursor() {
        return cursor;
    }
    /**
     * The cursor to use with the [Query `eventProducers` field]({{Queries.eventProducers}}) `after` argument.
     */
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final EventProducerEdge that = (EventProducerEdge) obj;
        return Objects.equals(node, that.node)
            && Objects.equals(cursor, that.cursor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(node, cursor);
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
         * Information about a particular [EventProducer]({{Types.EventProducer}}).
         */
        public Builder setNode(EventProducer node) {
            this.node = node;
            return this;
        }

        /**
         * The cursor to use with the [Query `eventProducers` field]({{Queries.eventProducers}}) `after` argument.
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
