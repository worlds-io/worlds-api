package io.worlds.api.model;


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

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public GeoJSONPoint getPosition() {
        return position;
    }
    public void setPosition(GeoJSONPoint position) {
        this.position = position;
    }

    public GeoJSONPoint getPixel() {
        return pixel;
    }
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

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setPosition(GeoJSONPoint position) {
            this.position = position;
            return this;
        }

        public Builder setPixel(GeoJSONPoint pixel) {
            this.pixel = pixel;
            return this;
        }


        public DeviceCalibrationMarker build() {
            return new DeviceCalibrationMarker(id, name, position, pixel);
        }

    }
}
