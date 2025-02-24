package io.worlds.api.model;


public class DeviceCalibration implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private String id;
    @jakarta.validation.constraints.NotNull
    private java.time.OffsetDateTime timestamp;
    @jakarta.validation.constraints.NotNull
    private java.util.List<DeviceCalibrationMarker> markers;
    private java.time.OffsetDateTime precomputeAt;

    public DeviceCalibration() {
    }

    public DeviceCalibration(String id, java.time.OffsetDateTime timestamp, java.util.List<DeviceCalibrationMarker> markers, java.time.OffsetDateTime precomputeAt) {
        this.id = id;
        this.timestamp = timestamp;
        this.markers = markers;
        this.precomputeAt = precomputeAt;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public java.time.OffsetDateTime getTimestamp() {
        return timestamp;
    }
    public void setTimestamp(java.time.OffsetDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public java.util.List<DeviceCalibrationMarker> getMarkers() {
        return markers;
    }
    public void setMarkers(java.util.List<DeviceCalibrationMarker> markers) {
        this.markers = markers;
    }

    public java.time.OffsetDateTime getPrecomputeAt() {
        return precomputeAt;
    }
    public void setPrecomputeAt(java.time.OffsetDateTime precomputeAt) {
        this.precomputeAt = precomputeAt;
    }



    public static DeviceCalibration.Builder builder() {
        return new DeviceCalibration.Builder();
    }

    public static class Builder {

        private String id;
        private java.time.OffsetDateTime timestamp;
        private java.util.List<DeviceCalibrationMarker> markers;
        private java.time.OffsetDateTime precomputeAt;

        public Builder() {
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setTimestamp(java.time.OffsetDateTime timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        public Builder setMarkers(java.util.List<DeviceCalibrationMarker> markers) {
            this.markers = markers;
            return this;
        }

        public Builder setPrecomputeAt(java.time.OffsetDateTime precomputeAt) {
            this.precomputeAt = precomputeAt;
            return this;
        }


        public DeviceCalibration build() {
            return new DeviceCalibration(id, timestamp, markers, precomputeAt);
        }

    }
}
