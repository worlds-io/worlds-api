package io.worlds.api.model;


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

    public EventChronicle getNode() {
        return node;
    }
    public void setNode(EventChronicle node) {
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
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

        public Builder setNode(EventChronicle node) {
            this.node = node;
            return this;
        }

        public Builder setCursor(String cursor) {
            this.cursor = cursor;
            return this;
        }


        public EventChronicleEdge build() {
            return new EventChronicleEdge(node, cursor);
        }

    }
}
