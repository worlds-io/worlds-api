package io.worlds.api.model;


/**
 * A [GeoJSON][geojson] coordinate reference system is a way to specify how the
coordinates should be interpretted.
If no coordinate reference system is specified for a GeoJSON object, the
coordinates for a single point must be an array of either two or three
floating-point numbers, in order as follows:
1. Longitude (in degrees)
2. Latitude (in degrees)
3. Altitude (in meters, optional, assumed to be sea-level if omitted)
For more information, see the [RFC 7946, Section 4 Coordinate Reference
System][rfc7946-4] and the [GeoJSON 1.0 specification][GJ2008].
 */
public class GeoJSONCRS implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String type;
    private java.lang.Object properties;

    public GeoJSONCRS() {
    }

    public GeoJSONCRS(String type, java.lang.Object properties) {
        this.type = type;
        this.properties = properties;
    }

    /**
     * An Open Geospatial Consortium URN that indicates the coordinate reference system.
     */
    public String getType() {
        return type;
    }
    /**
     * An Open Geospatial Consortium URN that indicates the coordinate reference system.
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * An arbitrary set of properties associated with the coordinate reference system.
     */
    public java.lang.Object getProperties() {
        return properties;
    }
    /**
     * An arbitrary set of properties associated with the coordinate reference system.
     */
    public void setProperties(java.lang.Object properties) {
        this.properties = properties;
    }



    public static GeoJSONCRS.Builder builder() {
        return new GeoJSONCRS.Builder();
    }

    public static class Builder {

        private String type;
        private java.lang.Object properties;

        public Builder() {
        }

        /**
         * An Open Geospatial Consortium URN that indicates the coordinate reference system.
         */
        public Builder setType(String type) {
            this.type = type;
            return this;
        }

        /**
         * An arbitrary set of properties associated with the coordinate reference system.
         */
        public Builder setProperties(java.lang.Object properties) {
            this.properties = properties;
            return this;
        }


        public GeoJSONCRS build() {
            return new GeoJSONCRS(type, properties);
        }

    }
}
