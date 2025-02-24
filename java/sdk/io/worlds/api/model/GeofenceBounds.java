package io.worlds.api.model;


public class GeofenceBounds implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private GeoJSONPolygon polygon;
    private Double height;

    public GeofenceBounds() {
    }

    public GeofenceBounds(GeoJSONPolygon polygon, Double height) {
        this.polygon = polygon;
        this.height = height;
    }

    public GeoJSONPolygon getPolygon() {
        return polygon;
    }
    public void setPolygon(GeoJSONPolygon polygon) {
        this.polygon = polygon;
    }

    public Double getHeight() {
        return height;
    }
    public void setHeight(Double height) {
        this.height = height;
    }



    public static GeofenceBounds.Builder builder() {
        return new GeofenceBounds.Builder();
    }

    public static class Builder {

        private GeoJSONPolygon polygon;
        private Double height;

        public Builder() {
        }

        public Builder setPolygon(GeoJSONPolygon polygon) {
            this.polygon = polygon;
            return this;
        }

        public Builder setHeight(Double height) {
            this.height = height;
            return this;
        }


        public GeofenceBounds build() {
            return new GeofenceBounds(polygon, height);
        }

    }
}
