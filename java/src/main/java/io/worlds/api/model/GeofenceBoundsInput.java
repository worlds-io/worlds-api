package io.worlds.api.model;

import java.util.Objects;

public class GeofenceBoundsInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private GeoJSONPolygonInput polygon;

    public GeofenceBoundsInput() {
    }

    public GeofenceBoundsInput(GeoJSONPolygonInput polygon) {
        this.polygon = polygon;
    }

    public GeoJSONPolygonInput getPolygon() {
        return polygon;
    }
    public void setPolygon(GeoJSONPolygonInput polygon) {
        this.polygon = polygon;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final GeofenceBoundsInput that = (GeofenceBoundsInput) obj;
        return Objects.equals(polygon, that.polygon);
    }

    @Override
    public int hashCode() {
        return Objects.hash(polygon);
    }


    public static GeofenceBoundsInput.Builder builder() {
        return new GeofenceBoundsInput.Builder();
    }

    public static class Builder {

        private GeoJSONPolygonInput polygon;

        public Builder() {
        }

        public Builder setPolygon(GeoJSONPolygonInput polygon) {
            this.polygon = polygon;
            return this;
        }


        public GeofenceBoundsInput build() {
            return new GeofenceBoundsInput(polygon);
        }

    }
}
