package io.worlds.api.model;

import java.util.Objects;

/**
 * The pairing of an [ChronicleProducer]({{Types.ChronicleProducer}}) with its query cursor.
See [about queries](/guides/types/#queries) for details on how "connection" and "edge" types are used with pagination.
 */
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

    /**
     * Information about a particular [ChronicleProducer]({{Types.ChronicleProducer}}).
     */
    public ChronicleProducer getNode() {
        return node;
    }
    /**
     * Information about a particular [ChronicleProducer]({{Types.ChronicleProducer}}).
     */
    public void setNode(ChronicleProducer node) {
        this.node = node;
    }

    /**
     * The cursor to use with the [Query `chronicleProducers` field]({{Queries.chronicleProducers}}) `after` argument.
     */
    public String getCursor() {
        return cursor;
    }
    /**
     * The cursor to use with the [Query `chronicleProducers` field]({{Queries.chronicleProducers}}) `after` argument.
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
        final ChronicleProducerEdge that = (ChronicleProducerEdge) obj;
        return Objects.equals(node, that.node)
            && Objects.equals(cursor, that.cursor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(node, cursor);
    }


    public static ChronicleProducerEdge.Builder builder() {
        return new ChronicleProducerEdge.Builder();
    }

    public static class Builder {

        private ChronicleProducer node;
        private String cursor;

        public Builder() {
        }

        /**
         * Information about a particular [ChronicleProducer]({{Types.ChronicleProducer}}).
         */
        public Builder setNode(ChronicleProducer node) {
            this.node = node;
            return this;
        }

        /**
         * The cursor to use with the [Query `chronicleProducers` field]({{Queries.chronicleProducers}}) `after` argument.
         */
        public Builder setCursor(String cursor) {
            this.cursor = cursor;
            return this;
        }


        public ChronicleProducerEdge build() {
            return new ChronicleProducerEdge(node, cursor);
        }

    }
}
