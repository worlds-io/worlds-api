package io.worlds.api.model;


public class GeoJSONMultiPolygon implements java.io.Serializable, GeoJSONGeometry {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private String type;
    private java.util.List<java.util.List<java.util.List<java.util.List<Double>>>> coordinates;
    private GeoJSONCRS crs;

    public GeoJSONMultiPolygon() {
    }

    public GeoJSONMultiPolygon(String type, java.util.List<java.util.List<java.util.List<java.util.List<Double>>>> coordinates, GeoJSONCRS crs) {
        this.type = type;
        this.coordinates = coordinates;
        this.crs = crs;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public java.util.List<java.util.List<java.util.List<java.util.List<Double>>>> getCoordinates() {
        return coordinates;
    }
    public void setCoordinates(java.util.List<java.util.List<java.util.List<java.util.List<Double>>>> coordinates) {
        this.coordinates = coordinates;
    }

    public GeoJSONCRS getCrs() {
        return crs;
    }
    public void setCrs(GeoJSONCRS crs) {
        this.crs = crs;
    }



    public static GeoJSONMultiPolygon.Builder builder() {
        return new GeoJSONMultiPolygon.Builder();
    }

    public static class Builder {

        private String type;
        private java.util.List<java.util.List<java.util.List<java.util.List<Double>>>> coordinates;
        private GeoJSONCRS crs;

        public Builder() {
        }

        public Builder setType(String type) {
            this.type = type;
            return this;
        }

        public Builder setCoordinates(java.util.List<java.util.List<java.util.List<java.util.List<Double>>>> coordinates) {
            this.coordinates = coordinates;
            return this;
        }

        public Builder setCrs(GeoJSONCRS crs) {
            this.crs = crs;
            return this;
        }


        public GeoJSONMultiPolygon build() {
            return new GeoJSONMultiPolygon(type, coordinates, crs);
        }

    }
}
