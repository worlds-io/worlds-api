package io.worlds.api.model;


/**
 * An event edge is the pairing of an [Event]({{Types.event}}) with its query cursor.
See [about queries](/reference/query/#about-queries) for details on how "connection" and "edge" types are used with pagination.
 */
public class EventEdge implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private Event node;
    @jakarta.validation.constraints.NotNull
    private String cursor;

    public EventEdge() {
    }

    public EventEdge(Event node, String cursor) {
        this.node = node;
        this.cursor = cursor;
    }

    /**
     * Information about a particular [Event]({{Types.event}}).
     */
    public Event getNode() {
        return node;
    }
    /**
     * Information about a particular [Event]({{Types.event}}).
     */
    public void setNode(Event node) {
        this.node = node;
    }

    /**
     * The cursor to use with the [Query `events` field]({{Queries.events}}) `after` argument.
     */
    public String getCursor() {
        return cursor;
    }
    /**
     * The cursor to use with the [Query `events` field]({{Queries.events}}) `after` argument.
     */
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }



    public static EventEdge.Builder builder() {
        return new EventEdge.Builder();
    }

    public static class Builder {

        private Event node;
        private String cursor;

        public Builder() {
        }

        /**
         * Information about a particular [Event]({{Types.event}}).
         */
        public Builder setNode(Event node) {
            this.node = node;
            return this;
        }

        /**
         * The cursor to use with the [Query `events` field]({{Queries.events}}) `after` argument.
         */
        public Builder setCursor(String cursor) {
            this.cursor = cursor;
            return this;
        }


        public EventEdge build() {
            return new EventEdge(node, cursor);
        }

    }
}
