package io.worlds.api.model;


/**
 * An event edge is the pairing of an [Event]({{Types.event}}) with its query cursor.
See [about queries](/reference/query/#about-queries) for details on how "connection" and "edge" types are used with pagination.
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
     * Information about a particular [Event]({{Types.event}}).
     */
    public EventChronicle getNode() {
        return node;
    }
    /**
     * Information about a particular [Event]({{Types.event}}).
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



    public static EventChronicleEdge.Builder builder() {
        return new EventChronicleEdge.Builder();
    }

    public static class Builder {

        private EventChronicle node;
        private String cursor;

        public Builder() {
        }

        /**
         * Information about a particular [Event]({{Types.event}}).
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
