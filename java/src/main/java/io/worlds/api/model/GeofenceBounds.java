package io.worlds.api.model;

import java.util.Objects;

/**
 * A `GeofenceBounds` object represents the coordinates and boundaries of a [`Geofence`]({{Types.Geofence}}).
 */
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

    /**
     * A GeoJSON polygon that represents the bounds of the geofence.
     */
    public GeoJSONPolygon getPolygon() {
        return polygon;
    }
    /**
     * A GeoJSON polygon that represents the bounds of the geofence.
     */
    public void setPolygon(GeoJSONPolygon polygon) {
        this.polygon = polygon;
    }

    /**
     * The height of the geofence, in meters, if provided.
     */
    public Double getHeight() {
        return height;
    }
    /**
     * The height of the geofence, in meters, if provided.
     */
    public void setHeight(Double height) {
        this.height = height;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final GeofenceBounds that = (GeofenceBounds) obj;
        return Objects.equals(polygon, that.polygon)
            && Objects.equals(height, that.height);
    }

    @Override
    public int hashCode() {
        return Objects.hash(polygon, height);
    }


    public static GeofenceBounds.Builder builder() {
        return new GeofenceBounds.Builder();
    }

    public static class Builder {

        private GeoJSONPolygon polygon;
        private Double height;

        public Builder() {
        }

        /**
         * A GeoJSON polygon that represents the bounds of the geofence.
         */
        public Builder setPolygon(GeoJSONPolygon polygon) {
            this.polygon = polygon;
            return this;
        }

        /**
         * The height of the geofence, in meters, if provided.
         */
        public Builder setHeight(Double height) {
            this.height = height;
            return this;
        }


        public GeofenceBounds build() {
            return new GeofenceBounds(polygon, height);
        }

    }
}
