package io.worlds.api.model;

import java.util.Objects;

/**
 * A `Measurement` is the specific output of a sensor at a given time.
 */
public class Measurement implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private String id;
    @jakarta.validation.constraints.NotNull
    private Sensor sensor;
    @jakarta.validation.constraints.NotNull
    private java.time.OffsetDateTime timestamp;
    @jakarta.validation.constraints.NotNull
    private String value;

    public Measurement() {
    }

    public Measurement(String id, Sensor sensor, java.time.OffsetDateTime timestamp, String value) {
        this.id = id;
        this.sensor = sensor;
        this.timestamp = timestamp;
        this.value = value;
    }

    /**
     * The unique identifier for the measurement.
     */
    public String getId() {
        return id;
    }
    /**
     * The unique identifier for the measurement.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * The sensor that provided the measurement.
     */
    public Sensor getSensor() {
        return sensor;
    }
    /**
     * The sensor that provided the measurement.
     */
    public void setSensor(Sensor sensor) {
        this.sensor = sensor;
    }

    /**
     * The time the measurement took place.
     */
    public java.time.OffsetDateTime getTimestamp() {
        return timestamp;
    }
    /**
     * The time the measurement took place.
     */
    public void setTimestamp(java.time.OffsetDateTime timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * The actual output of the sensor.
     */
    public String getValue() {
        return value;
    }
    /**
     * The actual output of the sensor.
     */
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
        final Measurement that = (Measurement) obj;
        return Objects.equals(id, that.id)
            && Objects.equals(sensor, that.sensor)
            && Objects.equals(timestamp, that.timestamp)
            && Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, sensor, timestamp, value);
    }


    public static Measurement.Builder builder() {
        return new Measurement.Builder();
    }

    public static class Builder {

        private String id;
        private Sensor sensor;
        private java.time.OffsetDateTime timestamp;
        private String value;

        public Builder() {
        }

        /**
         * The unique identifier for the measurement.
         */
        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        /**
         * The sensor that provided the measurement.
         */
        public Builder setSensor(Sensor sensor) {
            this.sensor = sensor;
            return this;
        }

        /**
         * The time the measurement took place.
         */
        public Builder setTimestamp(java.time.OffsetDateTime timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        /**
         * The actual output of the sensor.
         */
        public Builder setValue(String value) {
            this.value = value;
            return this;
        }


        public Measurement build() {
            return new Measurement(id, sensor, timestamp, value);
        }

    }
}
