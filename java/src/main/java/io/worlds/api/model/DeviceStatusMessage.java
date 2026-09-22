package io.worlds.api.model;

import java.util.Objects;

/**
 * A message from a `deviceStatus` subscription describing one device's current status.
 */
public class DeviceStatusMessage implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private Device device;
    @jakarta.validation.constraints.NotNull
    private DeviceStatus status;
    private java.time.OffsetDateTime lastHeartbeat;
    @jakarta.validation.constraints.NotNull
    private java.time.OffsetDateTime timestamp;
    @jakarta.validation.constraints.NotNull
    private MessageState state;

    public DeviceStatusMessage() {
    }

    public DeviceStatusMessage(Device device, DeviceStatus status, java.time.OffsetDateTime lastHeartbeat, java.time.OffsetDateTime timestamp, MessageState state) {
        this.device = device;
        this.status = status;
        this.lastHeartbeat = lastHeartbeat;
        this.timestamp = timestamp;
        this.state = state;
    }

    /**
     * The device whose status is reported.
     */
    public Device getDevice() {
        return device;
    }
    /**
     * The device whose status is reported.
     */
    public void setDevice(Device device) {
        this.device = device;
    }

    /**
     * The status of the device at `timestamp`.
     */
    public DeviceStatus getStatus() {
        return status;
    }
    /**
     * The status of the device at `timestamp`.
     */
    public void setStatus(DeviceStatus status) {
        this.status = status;
    }

    /**
     * The most recent heartbeat received from the device, if any.
     */
    public java.time.OffsetDateTime getLastHeartbeat() {
        return lastHeartbeat;
    }
    /**
     * The most recent heartbeat received from the device, if any.
     */
    public void setLastHeartbeat(java.time.OffsetDateTime lastHeartbeat) {
        this.lastHeartbeat = lastHeartbeat;
    }

    /**
     * When the status was evaluated.
     */
    public java.time.OffsetDateTime getTimestamp() {
        return timestamp;
    }
    /**
     * When the status was evaluated.
     */
    public void setTimestamp(java.time.OffsetDateTime timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * `START` for the baseline emitted on subscribe, `UPDATE` for a status transition, `END` when the
device stops matching the filter, is disabled, or is deleted and will not be reported again.
     */
    public MessageState getState() {
        return state;
    }
    /**
     * `START` for the baseline emitted on subscribe, `UPDATE` for a status transition, `END` when the
device stops matching the filter, is disabled, or is deleted and will not be reported again.
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
        final DeviceStatusMessage that = (DeviceStatusMessage) obj;
        return Objects.equals(device, that.device)
            && Objects.equals(status, that.status)
            && Objects.equals(lastHeartbeat, that.lastHeartbeat)
            && Objects.equals(timestamp, that.timestamp)
            && Objects.equals(state, that.state);
    }

    @Override
    public int hashCode() {
        return Objects.hash(device, status, lastHeartbeat, timestamp, state);
    }


    public static DeviceStatusMessage.Builder builder() {
        return new DeviceStatusMessage.Builder();
    }

    public static class Builder {

        private Device device;
        private DeviceStatus status;
        private java.time.OffsetDateTime lastHeartbeat;
        private java.time.OffsetDateTime timestamp;
        private MessageState state;

        public Builder() {
        }

        /**
         * The device whose status is reported.
         */
        public Builder setDevice(Device device) {
            this.device = device;
            return this;
        }

        /**
         * The status of the device at `timestamp`.
         */
        public Builder setStatus(DeviceStatus status) {
            this.status = status;
            return this;
        }

        /**
         * The most recent heartbeat received from the device, if any.
         */
        public Builder setLastHeartbeat(java.time.OffsetDateTime lastHeartbeat) {
            this.lastHeartbeat = lastHeartbeat;
            return this;
        }

        /**
         * When the status was evaluated.
         */
        public Builder setTimestamp(java.time.OffsetDateTime timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        /**
         * `START` for the baseline emitted on subscribe, `UPDATE` for a status transition, `END` when the
device stops matching the filter, is disabled, or is deleted and will not be reported again.
         */
        public Builder setState(MessageState state) {
            this.state = state;
            return this;
        }


        public DeviceStatusMessage build() {
            return new DeviceStatusMessage(device, status, lastHeartbeat, timestamp, state);
        }

    }
}
