package io.worlds.api.model;

import java.util.Objects;

/**
 * An event edge is the pairing of an [Event]({{Types.Event}}) with its query cursor.
See [about queries](/guides/types/#queries) for details on how "connection" and "edge" types are used with pagination.
 */
public class EventChronicleEdge implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private EventChronicle node;
    @jakarta.validation.constraints.NotNull
    private String cursor;

    public EventChronicleEdge() {
    }

    public EventChronicleEdge(EventChronicle node, String cursor) {
        this.node = node;
        this.cursor = cursor;
    }

    /**
     * Information about a particular [Event]({{Types.Event}}).
     */
    public EventChronicle getNode() {
        return node;
    }
    /**
     * Information about a particular [Event]({{Types.Event}}).
     */
    public void setNode(EventChronicle node) {
        this.node = node;
    }

    /**
     * The cursor to use with the [Query `events` field]({{Queries.eventChronicles}}) `after` argument.
     */
    public String getCursor() {
        return cursor;
    }
    /**
     * The cursor to use with the [Query `events` field]({{Queries.eventChronicles}}) `after` argument.
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
        final EventChronicleEdge that = (EventChronicleEdge) obj;
        return Objects.equals(node, that.node)
            && Objects.equals(cursor, that.cursor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(node, cursor);
    }


    public static EventChronicleEdge.Builder builder() {
        return new EventChronicleEdge.Builder();
    }

    public static class Builder {

        private EventChronicle node;
        private String cursor;

        public Builder() {
        }

        /**
         * Information about a particular [Event]({{Types.Event}}).
         */
        public Builder setNode(EventChronicle node) {
            this.node = node;
            return this;
        }

        /**
         * The cursor to use with the [Query `events` field]({{Queries.eventChronicles}}) `after` argument.
         */
        public Builder setCursor(String cursor) {
            this.cursor = cursor;
            return this;
        }


        public EventChronicleEdge build() {
            return new EventChronicleEdge(node, cursor);
        }

    }
}
