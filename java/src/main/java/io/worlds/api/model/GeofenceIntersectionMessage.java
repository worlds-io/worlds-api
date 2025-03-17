package io.worlds.api.model;


public class GeofenceIntersectionMessage implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private GeofenceIntersection message;
    @jakarta.validation.constraints.NotNull
    private MessageState state;

    public GeofenceIntersectionMessage() {
    }

    public GeofenceIntersectionMessage(GeofenceIntersection message, MessageState state) {
        this.message = message;
        this.state = state;
    }

    public GeofenceIntersection getMessage() {
        return message;
    }
    public void setMessage(GeofenceIntersection message) {
        this.message = message;
    }

    public MessageState getState() {
        return state;
    }
    public void setState(MessageState state) {
        this.state = state;
    }



    public static GeofenceIntersectionMessage.Builder builder() {
        return new GeofenceIntersectionMessage.Builder();
    }

    public static class Builder {

        private GeofenceIntersection message;
        private MessageState state;

        public Builder() {
        }

        public Builder setMessage(GeofenceIntersection message) {
            this.message = message;
            return this;
        }

        public Builder setState(MessageState state) {
            this.state = state;
            return this;
        }


        public GeofenceIntersectionMessage build() {
            return new GeofenceIntersectionMessage(message, state);
        }

    }
}
