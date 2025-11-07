package io.worlds.api.model;

import java.util.Objects;

/**
 * A [GeoJSON][geojson] polygon represents a region in the world. GeoJSON is a formal
specification as defined by [RFC 7946][geojson-rfc].
 */
public class GeoJSONPolygon implements java.io.Serializable, GeoJSONGeometry {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private String type;
    private java.util.List<java.util.List<java.util.List<Double>>> coordinates;
    private GeoJSONCRS crs;

    public GeoJSONPolygon() {
    }

    public GeoJSONPolygon(String type, java.util.List<java.util.List<java.util.List<Double>>> coordinates, GeoJSONCRS crs) {
        this.type = type;
        this.coordinates = coordinates;
        this.crs = crs;
    }

    /**
     * The type of the GeoJSON node. For the GeoJSON polygon, this will be "Polygon".
     */
    public String getType() {
        return type;
    }
    /**
     * The type of the GeoJSON node. For the GeoJSON polygon, this will be "Polygon".
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * The coordinates that define the region, as determined by the `crs` (coordinate reference system).
The first element in the array represents the exterior
ring.  Any subsequent elements represent interior rings (or holes).
For more information, see [Polygons in RFC 7946](https://datatracker.ietf.org/doc/html/rfc7946#appendix-A.3).
     */
    public java.util.List<java.util.List<java.util.List<Double>>> getCoordinates() {
        return coordinates;
    }
    /**
     * The coordinates that define the region, as determined by the `crs` (coordinate reference system).
The first element in the array represents the exterior
ring.  Any subsequent elements represent interior rings (or holes).
For more information, see [Polygons in RFC 7946](https://datatracker.ietf.org/doc/html/rfc7946#appendix-A.3).
     */
    public void setCoordinates(java.util.List<java.util.List<java.util.List<Double>>> coordinates) {
        this.coordinates = coordinates;
    }

    /**
     * The coordinate reference system used for this  polygon. See
[`GeoJSONCRS`]({{Types.GeoJSONCRS}}) for more information.
     */
    public GeoJSONCRS getCrs() {
        return crs;
    }
    /**
     * The coordinate reference system used for this  polygon. See
[`GeoJSONCRS`]({{Types.GeoJSONCRS}}) for more information.
     */
    public void setCrs(GeoJSONCRS crs) {
        this.crs = crs;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final GeoJSONPolygon that = (GeoJSONPolygon) obj;
        return Objects.equals(type, that.type)
            && Objects.equals(coordinates, that.coordinates)
            && Objects.equals(crs, that.crs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, coordinates, crs);
    }


    public static GeoJSONPolygon.Builder builder() {
        return new GeoJSONPolygon.Builder();
    }

    public static class Builder {

        private String type;
        private java.util.List<java.util.List<java.util.List<Double>>> coordinates;
        private GeoJSONCRS crs;

        public Builder() {
        }

        /**
         * The type of the GeoJSON node. For the GeoJSON polygon, this will be "Polygon".
         */
        public Builder setType(String type) {
            this.type = type;
            return this;
        }

        /**
         * The coordinates that define the region, as determined by the `crs` (coordinate reference system).
The first element in the array represents the exterior
ring.  Any subsequent elements represent interior rings (or holes).
For more information, see [Polygons in RFC 7946](https://datatracker.ietf.org/doc/html/rfc7946#appendix-A.3).
         */
        public Builder setCoordinates(java.util.List<java.util.List<java.util.List<Double>>> coordinates) {
            this.coordinates = coordinates;
            return this;
        }

        /**
         * The coordinate reference system used for this  polygon. See
[`GeoJSONCRS`]({{Types.GeoJSONCRS}}) for more information.
         */
        public Builder setCrs(GeoJSONCRS crs) {
            this.crs = crs;
            return this;
        }


        public GeoJSONPolygon build() {
            return new GeoJSONPolygon(type, coordinates, crs);
        }

    }
}
