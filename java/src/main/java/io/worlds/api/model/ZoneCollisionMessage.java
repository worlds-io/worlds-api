package io.worlds.api.model;


public class ZoneCollisionMessage implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private ZoneCollision message;
    private MessageState state;

    public ZoneCollisionMessage() {
    }

    public ZoneCollisionMessage(ZoneCollision message, MessageState state) {
        this.message = message;
        this.state = state;
    }

    public ZoneCollision getMessage() {
        return message;
    }
    public void setMessage(ZoneCollision message) {
        this.message = message;
    }

    public MessageState getState() {
        return state;
    }
    public void setState(MessageState state) {
        this.state = state;
    }



    public static ZoneCollisionMessage.Builder builder() {
        return new ZoneCollisionMessage.Builder();
    }

    public static class Builder {

        private ZoneCollision message;
        private MessageState state;

        public Builder() {
        }

        public Builder setMessage(ZoneCollision message) {
            this.message = message;
            return this;
        }

        public Builder setState(MessageState state) {
            this.state = state;
            return this;
        }


        public ZoneCollisionMessage build() {
            return new ZoneCollisionMessage(message, state);
        }

    }
}
