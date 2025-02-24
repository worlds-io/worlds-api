package io.worlds.api.model;


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

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public java.lang.Object getProperties() {
        return properties;
    }
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

        public Builder setType(String type) {
            this.type = type;
            return this;
        }

        public Builder setProperties(java.lang.Object properties) {
            this.properties = properties;
            return this;
        }


        public GeoJSONCRS build() {
            return new GeoJSONCRS(type, properties);
        }

    }
}
