package io.worlds.api.model;

import java.util.Objects;

/**
 * A message containing a `Device` from a `devices` subscription.
 */
public class DeviceMessage implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private Device message;
    @jakarta.validation.constraints.NotNull
    private DeviceMessageState state;

    public DeviceMessage() {
    }

    public DeviceMessage(Device message, DeviceMessageState state) {
        this.message = message;
        this.state = state;
    }

    /**
     * The device.
     */
    public Device getMessage() {
        return message;
    }
    /**
     * The device.
     */
    public void setMessage(Device message) {
        this.message = message;
    }

    /**
     * The state of the device message.
     */
    public DeviceMessageState getState() {
        return state;
    }
    /**
     * The state of the device message.
     */
    public void setState(DeviceMessageState state) {
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
        final DeviceMessage that = (DeviceMessage) obj;
        return Objects.equals(message, that.message)
            && Objects.equals(state, that.state);
    }

    @Override
    public int hashCode() {
        return Objects.hash(message, state);
    }


    public static DeviceMessage.Builder builder() {
        return new DeviceMessage.Builder();
    }

    public static class Builder {

        private Device message;
        private DeviceMessageState state;

        public Builder() {
        }

        /**
         * The device.
         */
        public Builder setMessage(Device message) {
            this.message = message;
            return this;
        }

        /**
         * The state of the device message.
         */
        public Builder setState(DeviceMessageState state) {
            this.state = state;
            return this;
        }


        public DeviceMessage build() {
            return new DeviceMessage(message, state);
        }

    }
}
