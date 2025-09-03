package io.worlds.api.model;


/**
 * DeviceCalibrationMarker represents a reference point used in device calibration. Markers consist of a point in an image and their corresponding point in the real world.
 */
public class DeviceCalibrationMarker implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private String id;
    @jakarta.validation.constraints.NotNull
    private String name;
    @jakarta.validation.constraints.NotNull
    private GeoJSONPoint position;
    @jakarta.validation.constraints.NotNull
    private GeoJSONPoint pixel;

    public DeviceCalibrationMarker() {
    }

    public DeviceCalibrationMarker(String id, String name, GeoJSONPoint position, GeoJSONPoint pixel) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.pixel = pixel;
    }

    /**
     * The unique identifier of the calibration marker.
     */
    public String getId() {
        return id;
    }
    /**
     * The unique identifier of the calibration marker.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * The name of the calibration marker.
     */
    public String getName() {
        return name;
    }
    /**
     * The name of the calibration marker.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * The corresponding geographic position for the marker.
     */
    public GeoJSONPoint getPosition() {
        return position;
    }
    /**
     * The corresponding geographic position for the marker.
     */
    public void setPosition(GeoJSONPoint position) {
        this.position = position;
    }

    /**
     * The corresponding point in the video for the marker.
     */
    public GeoJSONPoint getPixel() {
        return pixel;
    }
    /**
     * The corresponding point in the video for the marker.
     */
    public void setPixel(GeoJSONPoint pixel) {
        this.pixel = pixel;
    }



    public static DeviceCalibrationMarker.Builder builder() {
        return new DeviceCalibrationMarker.Builder();
    }

    public static class Builder {

        private String id;
        private String name;
        private GeoJSONPoint position;
        private GeoJSONPoint pixel;

        public Builder() {
        }

        /**
         * The unique identifier of the calibration marker.
         */
        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        /**
         * The name of the calibration marker.
         */
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        /**
         * The corresponding geographic position for the marker.
         */
        public Builder setPosition(GeoJSONPoint position) {
            this.position = position;
            return this;
        }

        /**
         * The corresponding point in the video for the marker.
         */
        public Builder setPixel(GeoJSONPoint pixel) {
            this.pixel = pixel;
            return this;
        }


        public DeviceCalibrationMarker build() {
            return new DeviceCalibrationMarker(id, name, position, pixel);
        }

    }
}
