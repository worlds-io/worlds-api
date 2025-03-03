package io.worlds.api.model;


public class GeofenceCollisionMessage implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private GeofenceCollision message;
    @jakarta.validation.constraints.NotNull
    private MessageState state;

    public GeofenceCollisionMessage() {
    }

    public GeofenceCollisionMessage(GeofenceCollision message, MessageState state) {
        this.message = message;
        this.state = state;
    }

    public GeofenceCollision getMessage() {
        return message;
    }
    public void setMessage(GeofenceCollision message) {
        this.message = message;
    }

    public MessageState getState() {
        return state;
    }
    public void setState(MessageState state) {
        this.state = state;
    }



    public static GeofenceCollisionMessage.Builder builder() {
        return new GeofenceCollisionMessage.Builder();
    }

    public static class Builder {

        private GeofenceCollision message;
        private MessageState state;

        public Builder() {
        }

        public Builder setMessage(GeofenceCollision message) {
            this.message = message;
            return this;
        }

        public Builder setState(MessageState state) {
            this.state = state;
            return this;
        }


        public GeofenceCollisionMessage build() {
            return new GeofenceCollisionMessage(message, state);
        }

    }
}
