package io.worlds.api.model;


public class ZoneIntersectionMessage implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private ZoneIntersection message;
    @jakarta.validation.constraints.NotNull
    private MessageState state;

    public ZoneIntersectionMessage() {
    }

    public ZoneIntersectionMessage(ZoneIntersection message, MessageState state) {
        this.message = message;
        this.state = state;
    }

    public ZoneIntersection getMessage() {
        return message;
    }
    public void setMessage(ZoneIntersection message) {
        this.message = message;
    }

    public MessageState getState() {
        return state;
    }
    public void setState(MessageState state) {
        this.state = state;
    }



    public static ZoneIntersectionMessage.Builder builder() {
        return new ZoneIntersectionMessage.Builder();
    }

    public static class Builder {

        private ZoneIntersection message;
        private MessageState state;

        public Builder() {
        }

        public Builder setMessage(ZoneIntersection message) {
            this.message = message;
            return this;
        }

        public Builder setState(MessageState state) {
            this.state = state;
            return this;
        }


        public ZoneIntersectionMessage build() {
            return new ZoneIntersectionMessage(message, state);
        }

    }
}
