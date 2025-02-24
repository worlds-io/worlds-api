package io.worlds.api.model;


public class FilterPointNearInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private GeoJSONPointInput point;
    private double radius = 500.0;

    public FilterPointNearInput() {
    }

    public FilterPointNearInput(GeoJSONPointInput point, double radius) {
        this.point = point;
        this.radius = radius;
    }

    public GeoJSONPointInput getPoint() {
        return point;
    }
    public void setPoint(GeoJSONPointInput point) {
        this.point = point;
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }



    public static FilterPointNearInput.Builder builder() {
        return new FilterPointNearInput.Builder();
    }

    public static class Builder {

        private GeoJSONPointInput point;
        private double radius = 500.0;

        public Builder() {
        }

        public Builder setPoint(GeoJSONPointInput point) {
            this.point = point;
            return this;
        }

        public Builder setRadius(double radius) {
            this.radius = radius;
            return this;
        }


        public FilterPointNearInput build() {
            return new FilterPointNearInput(point, radius);
        }

    }
}
