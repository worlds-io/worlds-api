package io.worlds.api.model;

import java.util.Objects;

/**
 * This type represents the input data needed to initialize a [GeoJSON polygon]({{Types.GeoJSONPolygon}}).
 */
public class GeoJSONPolygonInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private String type = "Polygon";
    private java.util.List<java.util.List<java.util.List<Double>>> coordinates;
    private org.springframework.graphql.data.ArgumentValue<GeoJSONCRSInput> crs = org.springframework.graphql.data.ArgumentValue.omitted();

    public GeoJSONPolygonInput() {
    }

    public GeoJSONPolygonInput(String type, java.util.List<java.util.List<java.util.List<Double>>> coordinates, org.springframework.graphql.data.ArgumentValue<GeoJSONCRSInput> crs) {
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

    public java.util.List<java.util.List<java.util.List<Double>>> getCoordinates() {
        return coordinates;
    }
    public void setCoordinates(java.util.List<java.util.List<java.util.List<Double>>> coordinates) {
        this.coordinates = coordinates;
    }

    public org.springframework.graphql.data.ArgumentValue<GeoJSONCRSInput> getCrs() {
        return crs;
    }
    public void setCrs(org.springframework.graphql.data.ArgumentValue<GeoJSONCRSInput> crs) {
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
        final GeoJSONPolygonInput that = (GeoJSONPolygonInput) obj;
        return Objects.equals(type, that.type)
            && Objects.equals(coordinates, that.coordinates)
            && Objects.equals(crs, that.crs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, coordinates, crs);
    }


    public static GeoJSONPolygonInput.Builder builder() {
        return new GeoJSONPolygonInput.Builder();
    }

    public static class Builder {

        private String type = "Polygon";
        private java.util.List<java.util.List<java.util.List<Double>>> coordinates;
        private org.springframework.graphql.data.ArgumentValue<GeoJSONCRSInput> crs = org.springframework.graphql.data.ArgumentValue.omitted();

        public Builder() {
        }

        public Builder setType(String type) {
            this.type = type;
            return this;
        }

        public Builder setCoordinates(java.util.List<java.util.List<java.util.List<Double>>> coordinates) {
            this.coordinates = coordinates;
            return this;
        }

        public Builder setCrs(org.springframework.graphql.data.ArgumentValue<GeoJSONCRSInput> crs) {
            this.crs = crs;
            return this;
        }


        public GeoJSONPolygonInput build() {
            return new GeoJSONPolygonInput(type, coordinates, crs);
        }

    }
}
