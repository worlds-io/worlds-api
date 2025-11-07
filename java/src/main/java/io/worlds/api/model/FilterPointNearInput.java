package io.worlds.api.model;

import java.util.Objects;

/**
 * FilterPointNearInput is used to filter records with positional arguments by proximity to the specified point
 */
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

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final FilterPointNearInput that = (FilterPointNearInput) obj;
        return Objects.equals(point, that.point)
            && Objects.equals(radius, that.radius);
    }

    @Override
    public int hashCode() {
        return Objects.hash(point, radius);
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
