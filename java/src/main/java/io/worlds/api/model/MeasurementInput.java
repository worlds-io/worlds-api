package io.worlds.api.model;


/**
 * This input type is used to create new [`Measurement`]({{Types.measurement}}) for a sensor. See [About Sensors](/reference/objects/sensors/#about-sensors) for more details.
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
