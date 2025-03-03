package io.worlds.api.model;


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

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public GeoJSONGeometry getGeometry() {
        return geometry;
    }
    public void setGeometry(GeoJSONGeometry geometry) {
        this.geometry = geometry;
    }

    public java.lang.Object getProperties() {
        return properties;
    }
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

        public Builder setType(String type) {
            this.type = type;
            return this;
        }

        public Builder setGeometry(GeoJSONGeometry geometry) {
            this.geometry = geometry;
            return this;
        }

        public Builder setProperties(java.lang.Object properties) {
            this.properties = properties;
            return this;
        }


        public GeoJSONFeature build() {
            return new GeoJSONFeature(type, geometry, properties);
        }

    }
}
