package io.worlds.api.model;

import java.util.Objects;

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

    /**
     * The zone intersection.
     */
    public ZoneIntersection getMessage() {
        return message;
    }
    /**
     * The zone intersection.
     */
    public void setMessage(ZoneIntersection message) {
        this.message = message;
    }

    /**
     * The state of the intersection message. Within the message, the [`endTime`]({{Types.ZoneIntersection}}) will only be present on an [`END`]({{Types.MessageState}}) event.
     */
    public MessageState getState() {
        return state;
    }
    /**
     * The state of the intersection message. Within the message, the [`endTime`]({{Types.ZoneIntersection}}) will only be present on an [`END`]({{Types.MessageState}}) event.
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
        final ZoneIntersectionMessage that = (ZoneIntersectionMessage) obj;
        return Objects.equals(message, that.message)
            && Objects.equals(state, that.state);
    }

    @Override
    public int hashCode() {
        return Objects.hash(message, state);
    }


    public static ZoneIntersectionMessage.Builder builder() {
        return new ZoneIntersectionMessage.Builder();
    }

    public static class Builder {

        private ZoneIntersection message;
        private MessageState state;

        public Builder() {
        }

        /**
         * The zone intersection.
         */
        public Builder setMessage(ZoneIntersection message) {
            this.message = message;
            return this;
        }

        /**
         * The state of the intersection message. Within the message, the [`endTime`]({{Types.ZoneIntersection}}) will only be present on an [`END`]({{Types.MessageState}}) event.
         */
        public Builder setState(MessageState state) {
            this.state = state;
            return this;
        }


        public ZoneIntersectionMessage build() {
            return new ZoneIntersectionMessage(message, state);
        }

    }
}
