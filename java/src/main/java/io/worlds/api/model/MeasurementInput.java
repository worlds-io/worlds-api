package io.worlds.api.model;

import java.util.Objects;

/**
 * This input type is used to create new [`Measurement`]({{Types.Measurement}}) for a sensor. See [`Sensor`]({{Types.Sensor}}) for more details.
 */
public class MeasurementInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private String sensorId;
    @jakarta.validation.constraints.NotNull
    private java.time.OffsetDateTime timestamp;
    @jakarta.validation.constraints.NotNull
    private String value;

    public MeasurementInput() {
    }

    public MeasurementInput(String sensorId, java.time.OffsetDateTime timestamp, String value) {
        this.sensorId = sensorId;
        this.timestamp = timestamp;
        this.value = value;
    }

    public String getSensorId() {
        return sensorId;
    }
    public void setSensorId(String sensorId) {
        this.sensorId = sensorId;
    }

    public java.time.OffsetDateTime getTimestamp() {
        return timestamp;
    }
    public void setTimestamp(java.time.OffsetDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public String getValue() {
        return value;
    }
    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final MeasurementInput that = (MeasurementInput) obj;
        return Objects.equals(sensorId, that.sensorId)
            && Objects.equals(timestamp, that.timestamp)
            && Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sensorId, timestamp, value);
    }


    public static MeasurementInput.Builder builder() {
        return new MeasurementInput.Builder();
    }

    public static class Builder {

        private String sensorId;
        private java.time.OffsetDateTime timestamp;
        private String value;

        public Builder() {
        }

        public Builder setSensorId(String sensorId) {
            this.sensorId = sensorId;
            return this;
        }

        public Builder setTimestamp(java.time.OffsetDateTime timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        public Builder setValue(String value) {
            this.value = value;
            return this;
        }


        public MeasurementInput build() {
            return new MeasurementInput(sensorId, timestamp, value);
        }

    }
}
