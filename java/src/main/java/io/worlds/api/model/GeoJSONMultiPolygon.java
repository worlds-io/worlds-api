package io.worlds.api.model;


/**
 * A [GeoJSON][geojson] multi-polygon represents any number of regions in the world.
GeoJSON is a formal specification as defined by [RFC 7946][geojson-rfc].
 */
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

    /**
     * The type of the GeoJSON node. For the GeoJSON multi-polygon, this will be "MultiPolygon".
     */
    public String getType() {
        return type;
    }
    /**
     * The type of the GeoJSON node. For the GeoJSON multi-polygon, this will be "MultiPolygon".
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * The coordinates that define the regions, as determined by the `crs` (coordinate reference system).
Each element of the outermost array represent a region; the first element in each array represents the exterior
ring.  Any subsequent elements represent interior rings (or holes).
For more information, see [MultiPolygons in RFC 7946](https://datatracker.ietf.org/doc/html/rfc7946#appendix-A.6).
     */
    public java.util.List<java.util.List<java.util.List<java.util.List<Double>>>> getCoordinates() {
        return coordinates;
    }
    /**
     * The coordinates that define the regions, as determined by the `crs` (coordinate reference system).
Each element of the outermost array represent a region; the first element in each array represents the exterior
ring.  Any subsequent elements represent interior rings (or holes).
For more information, see [MultiPolygons in RFC 7946](https://datatracker.ietf.org/doc/html/rfc7946#appendix-A.6).
     */
    public void setCoordinates(java.util.List<java.util.List<java.util.List<java.util.List<Double>>>> coordinates) {
        this.coordinates = coordinates;
    }

    /**
     * The coordinate reference system used for this multipolygon. See
[`GeoJSONCRS`]({{Types.geojsoncrs}}) for more information.
     */
    public GeoJSONCRS getCrs() {
        return crs;
    }
    /**
     * The coordinate reference system used for this multipolygon. See
[`GeoJSONCRS`]({{Types.geojsoncrs}}) for more information.
     */
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

        /**
         * The type of the GeoJSON node. For the GeoJSON multi-polygon, this will be "MultiPolygon".
         */
        public Builder setType(String type) {
            this.type = type;
            return this;
        }

        /**
         * The coordinates that define the regions, as determined by the `crs` (coordinate reference system).
Each element of the outermost array represent a region; the first element in each array represents the exterior
ring.  Any subsequent elements represent interior rings (or holes).
For more information, see [MultiPolygons in RFC 7946](https://datatracker.ietf.org/doc/html/rfc7946#appendix-A.6).
         */
        public Builder setCoordinates(java.util.List<java.util.List<java.util.List<java.util.List<Double>>>> coordinates) {
            this.coordinates = coordinates;
            return this;
        }

        /**
         * The coordinate reference system used for this multipolygon. See
[`GeoJSONCRS`]({{Types.geojsoncrs}}) for more information.
         */
        public Builder setCrs(GeoJSONCRS crs) {
            this.crs = crs;
            return this;
        }


        public GeoJSONMultiPolygon build() {
            return new GeoJSONMultiPolygon(type, coordinates, crs);
        }

    }
}
