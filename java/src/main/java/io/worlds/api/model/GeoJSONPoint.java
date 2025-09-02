package io.worlds.api.model;


/**
 * A [GeoJSON][geojson] point represents a single position in the world. GeoJSON is a formal specification as defined by [RFC 7946][geojson-rfc].
 */
public class GeoJSONPoint implements java.io.Serializable, GeoJSONGeometry {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private String type;
    private java.util.List<Double> coordinates;
    private GeoJSONCRS crs;

    public GeoJSONPoint() {
    }

    public GeoJSONPoint(String type, java.util.List<Double> coordinates, GeoJSONCRS crs) {
        this.type = type;
        this.coordinates = coordinates;
        this.crs = crs;
    }

    /**
     * The type of the GeoJSON node. For the GeoJSON point, this will be "Point".
     */
    public String getType() {
        return type;
    }
    /**
     * The type of the GeoJSON node. For the GeoJSON point, this will be "Point".
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * The coordinates for the the GeoJSON point, as determined by the `crs` (coordinate reference system).
     */
    public java.util.List<Double> getCoordinates() {
        return coordinates;
    }
    /**
     * The coordinates for the the GeoJSON point, as determined by the `crs` (coordinate reference system).
     */
    public void setCoordinates(java.util.List<Double> coordinates) {
        this.coordinates = coordinates;
    }

    /**
     * The coordinate reference system used for this geographical position. See
[`GeoJSONCRS`]({{Types.geojsoncrs}}) for more information.
     */
    public GeoJSONCRS getCrs() {
        return crs;
    }
    /**
     * The coordinate reference system used for this geographical position. See
[`GeoJSONCRS`]({{Types.geojsoncrs}}) for more information.
     */
    public void setCrs(GeoJSONCRS crs) {
        this.crs = crs;
    }



    public static GeoJSONPoint.Builder builder() {
        return new GeoJSONPoint.Builder();
    }

    public static class Builder {

        private String type;
        private java.util.List<Double> coordinates;
        private GeoJSONCRS crs;

        public Builder() {
        }

        /**
         * The type of the GeoJSON node. For the GeoJSON point, this will be "Point".
         */
        public Builder setType(String type) {
            this.type = type;
            return this;
        }

        /**
         * The coordinates for the the GeoJSON point, as determined by the `crs` (coordinate reference system).
         */
        public Builder setCoordinates(java.util.List<Double> coordinates) {
            this.coordinates = coordinates;
            return this;
        }

        /**
         * The coordinate reference system used for this geographical position. See
[`GeoJSONCRS`]({{Types.geojsoncrs}}) for more information.
         */
        public Builder setCrs(GeoJSONCRS crs) {
            this.crs = crs;
            return this;
        }


        public GeoJSONPoint build() {
            return new GeoJSONPoint(type, coordinates, crs);
        }

    }
}
