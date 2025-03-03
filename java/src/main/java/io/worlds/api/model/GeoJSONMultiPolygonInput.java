package io.worlds.api.model;


public class GeoJSONMultiPolygonInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private String type = "MultiPolygon";
    private java.util.List<java.util.List<java.util.List<java.util.List<Double>>>> coordinates;
    private org.springframework.graphql.data.ArgumentValue<GeoJSONCRSInput> crs = org.springframework.graphql.data.ArgumentValue.omitted();

    public GeoJSONMultiPolygonInput() {
    }

    public GeoJSONMultiPolygonInput(String type, java.util.List<java.util.List<java.util.List<java.util.List<Double>>>> coordinates, org.springframework.graphql.data.ArgumentValue<GeoJSONCRSInput> crs) {
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

    public org.springframework.graphql.data.ArgumentValue<GeoJSONCRSInput> getCrs() {
        return crs;
    }
    public void setCrs(org.springframework.graphql.data.ArgumentValue<GeoJSONCRSInput> crs) {
        this.crs = crs;
    }



    public static GeoJSONMultiPolygonInput.Builder builder() {
        return new GeoJSONMultiPolygonInput.Builder();
    }

    public static class Builder {

        private String type = "MultiPolygon";
        private java.util.List<java.util.List<java.util.List<java.util.List<Double>>>> coordinates;
        private org.springframework.graphql.data.ArgumentValue<GeoJSONCRSInput> crs = org.springframework.graphql.data.ArgumentValue.omitted();

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

        public Builder setCrs(org.springframework.graphql.data.ArgumentValue<GeoJSONCRSInput> crs) {
            this.crs = crs;
            return this;
        }


        public GeoJSONMultiPolygonInput build() {
            return new GeoJSONMultiPolygonInput(type, coordinates, crs);
        }

    }
}
