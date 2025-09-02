package io.worlds.api.model;


public class TrackMessage implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private Track message;
    @jakarta.validation.constraints.NotNull
    private MessageState state;

    public TrackMessage() {
    }

    public TrackMessage(Track message, MessageState state) {
        this.message = message;
        this.state = state;
    }

    /**
     * The track.
     */
    public Track getMessage() {
        return message;
    }
    /**
     * The track.
     */
    public void setMessage(Track message) {
        this.message = message;
    }

    /**
     * The state of the track message.
     */
    public MessageState getState() {
        return state;
    }
    /**
     * The state of the track message.
     */
    public void setState(MessageState state) {
        this.state = state;
    }



    public static TrackMessage.Builder builder() {
        return new TrackMessage.Builder();
    }

    public static class Builder {

        private Track message;
        private MessageState state;

        public Builder() {
        }

        /**
         * The track.
         */
        public Builder setMessage(Track message) {
            this.message = message;
            return this;
        }

        /**
         * The state of the track message.
         */
        public Builder setState(MessageState state) {
            this.state = state;
            return this;
        }


        public TrackMessage build() {
            return new TrackMessage(message, state);
        }

    }
}
