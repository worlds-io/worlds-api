package io.worlds.api.model;

import java.util.Objects;

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
     * The geofence intersection.
     */
    public GeofenceIntersection getMessage() {
        return message;
    }
    /**
     * The geofence intersection.
     */
    public void setMessage(GeofenceIntersection message) {
        this.message = message;
    }

    /**
     * The state of the intersection message. Within the message, the [`endTime`]({{Types.GeofenceIntersection}}) will only be present on an [`END`]({{Types.MessageState}}) event.
     */
    public MessageState getState() {
        return state;
    }
    /**
     * The state of the intersection message. Within the message, the [`endTime`]({{Types.GeofenceIntersection}}) will only be present on an [`END`]({{Types.MessageState}}) event.
     */
    public void setState(MessageState state) {
        this.state = state;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final GeofenceIntersectionMessage that = (GeofenceIntersectionMessage) obj;
        return Objects.equals(message, that.message)
            && Objects.equals(state, that.state);
    }

    @Override
    public int hashCode() {
        return Objects.hash(message, state);
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
         * The geofence intersection.
         */
        public Builder setMessage(GeofenceIntersection message) {
            this.message = message;
            return this;
        }

        /**
         * The state of the intersection message. Within the message, the [`endTime`]({{Types.GeofenceIntersection}}) will only be present on an [`END`]({{Types.MessageState}}) event.
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
