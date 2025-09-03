package io.worlds.api.model;


public class SegmentationOptionsInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private java.util.List<GeoJSONPointInput> points;
    private java.util.List<GeoJSONMultiPolygonInput> regions;

    public SegmentationOptionsInput() {
    }

    public SegmentationOptionsInput(java.util.List<GeoJSONPointInput> points, java.util.List<GeoJSONMultiPolygonInput> regions) {
        this.points = points;
        this.regions = regions;
    }

    public java.util.List<GeoJSONPointInput> getPoints() {
        return points;
    }
    public void setPoints(java.util.List<GeoJSONPointInput> points) {
        this.points = points;
    }

    public java.util.List<GeoJSONMultiPolygonInput> getRegions() {
        return regions;
    }
    public void setRegions(java.util.List<GeoJSONMultiPolygonInput> regions) {
        this.regions = regions;
    }



    public static SegmentationOptionsInput.Builder builder() {
        return new SegmentationOptionsInput.Builder();
    }

    public static class Builder {

        private java.util.List<GeoJSONPointInput> points;
        private java.util.List<GeoJSONMultiPolygonInput> regions;

        public Builder() {
        }

        public Builder setPoints(java.util.List<GeoJSONPointInput> points) {
            this.points = points;
            return this;
        }

        public Builder setRegions(java.util.List<GeoJSONMultiPolygonInput> regions) {
            this.regions = regions;
            return this;
        }


        public SegmentationOptionsInput build() {
            return new SegmentationOptionsInput(points, regions);
        }

    }
}
