package io.worlds.api.model;


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

    public Event getNode() {
        return node;
    }
    public void setNode(Event node) {
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
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

        public Builder setNode(Event node) {
            this.node = node;
            return this;
        }

        public Builder setCursor(String cursor) {
            this.cursor = cursor;
            return this;
        }


        public EventEdge build() {
            return new EventEdge(node, cursor);
        }

    }
}
