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

    /**
     * The zone intersection.
     */
    public GeofenceIntersection getMessage() {
        return message;
    }
    /**
     * The zone intersection.
     */
    public void setMessage(GeofenceIntersection message) {
        this.message = message;
    }

    /**
     * The state of the intersection message. Within the message, the [`endTime`]({{Types.geofenceIntersection}}) will only be present on an [`END`]({{Types.messagestate}}) event.
     */
    public MessageState getState() {
        return state;
    }
    /**
     * The state of the intersection message. Within the message, the [`endTime`]({{Types.geofenceIntersection}}) will only be present on an [`END`]({{Types.messagestate}}) event.
     */
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

        /**
         * The zone intersection.
         */
        public Builder setMessage(GeofenceIntersection message) {
            this.message = message;
            return this;
        }

        /**
         * The state of the intersection message. Within the message, the [`endTime`]({{Types.geofenceIntersection}}) will only be present on an [`END`]({{Types.messagestate}}) event.
         */
        public Builder setState(MessageState state) {
            this.state = state;
            return this;
        }


        public GeofenceIntersectionMessage build() {
            return new GeofenceIntersectionMessage(message, state);
        }

    }
}
