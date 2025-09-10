package io.worlds.api.model;


/**
 * A device calibration determines how objects captured by in a video or image are geo-referenced into the real world.
 */
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

    /**
     * The unique identifier of the device calibration.
     */
    public String getId() {
        return id;
    }
    /**
     * The unique identifier of the device calibration.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * The start time of the calibration. Detections generated after this time for this device will be geo-referenced according to this calibration.
     */
    public java.time.OffsetDateTime getTimestamp() {
        return timestamp;
    }
    /**
     * The start time of the calibration. Detections generated after this time for this device will be geo-referenced according to this calibration.
     */
    public void setTimestamp(java.time.OffsetDateTime timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * The markers associated with the calibration.
     */
    public java.util.List<DeviceCalibrationMarker> getMarkers() {
        return markers;
    }
    /**
     * The markers associated with the calibration.
     */
    public void setMarkers(java.util.List<DeviceCalibrationMarker> markers) {
        this.markers = markers;
    }

    /**
     * The time the calibration was precomputed, if any.
     */
    public java.time.OffsetDateTime getPrecomputeAt() {
        return precomputeAt;
    }
    /**
     * The time the calibration was precomputed, if any.
     */
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

        /**
         * The unique identifier of the device calibration.
         */
        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        /**
         * The start time of the calibration. Detections generated after this time for this device will be geo-referenced according to this calibration.
         */
        public Builder setTimestamp(java.time.OffsetDateTime timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        /**
         * The markers associated with the calibration.
         */
        public Builder setMarkers(java.util.List<DeviceCalibrationMarker> markers) {
            this.markers = markers;
            return this;
        }

        /**
         * The time the calibration was precomputed, if any.
         */
        public Builder setPrecomputeAt(java.time.OffsetDateTime precomputeAt) {
            this.precomputeAt = precomputeAt;
            return this;
        }


        public DeviceCalibration build() {
            return new DeviceCalibration(id, timestamp, markers, precomputeAt);
        }

    }
}
