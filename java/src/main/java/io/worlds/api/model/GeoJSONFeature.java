package io.worlds.api.model;


/**
 * A [GeoJSON][geojson] feature represents any spatially bounded thing.
GeoJSON is a formal specification as defined by [RFC 7946][geojson-rfc].
 */
public class GeoJSONFeature implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private String type;
    private GeoJSONGeometry geometry;
    private java.lang.Object properties;

    public GeoJSONFeature() {
    }

    public GeoJSONFeature(String type, GeoJSONGeometry geometry, java.lang.Object properties) {
        this.type = type;
        this.geometry = geometry;
        this.properties = properties;
    }

    /**
     * The type of the GeoJSON node. For the GeoJSON feature, this will be "Feature".
     */
    public String getType() {
        return type;
    }
    /**
     * The type of the GeoJSON node. For the GeoJSON feature, this will be "Feature".
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Any supported GeoJSON geometry object.
     */
    public GeoJSONGeometry getGeometry() {
        return geometry;
    }
    /**
     * Any supported GeoJSON geometry object.
     */
    public void setGeometry(GeoJSONGeometry geometry) {
        this.geometry = geometry;
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



    public static GeoJSONFeature.Builder builder() {
        return new GeoJSONFeature.Builder();
    }

    public static class Builder {

        private String type;
        private GeoJSONGeometry geometry;
        private java.lang.Object properties;

        public Builder() {
        }

        /**
         * The type of the GeoJSON node. For the GeoJSON feature, this will be "Feature".
         */
        public Builder setType(String type) {
            this.type = type;
            return this;
        }

        /**
         * Any supported GeoJSON geometry object.
         */
        public Builder setGeometry(GeoJSONGeometry geometry) {
            this.geometry = geometry;
            return this;
        }

        /**
         * An arbitrary set of properties associated with the coordinate reference system.
         */
        public Builder setProperties(java.lang.Object properties) {
            this.properties = properties;
            return this;
        }


        public GeoJSONFeature build() {
            return new GeoJSONFeature(type, geometry, properties);
        }

    }
}
