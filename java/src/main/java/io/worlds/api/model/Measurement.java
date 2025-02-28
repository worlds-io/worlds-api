package io.worlds.api.model;


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

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public Sensor getSensor() {
        return sensor;
    }
    public void setSensor(Sensor sensor) {
        this.sensor = sensor;
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

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setSensor(Sensor sensor) {
            this.sensor = sensor;
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


        public Measurement build() {
            return new Measurement(id, sensor, timestamp, value);
        }

    }
}
