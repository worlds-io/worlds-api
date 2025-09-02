package io.worlds.api.model;


public class TextRecognitionOptionsInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private java.util.List<GeoJSONMultiPolygonInput> regions;

    public TextRecognitionOptionsInput() {
    }

    public TextRecognitionOptionsInput(java.util.List<GeoJSONMultiPolygonInput> regions) {
        this.regions = regions;
    }

    public java.util.List<GeoJSONMultiPolygonInput> getRegions() {
        return regions;
    }
    public void setRegions(java.util.List<GeoJSONMultiPolygonInput> regions) {
        this.regions = regions;
    }



    public static TextRecognitionOptionsInput.Builder builder() {
        return new TextRecognitionOptionsInput.Builder();
    }

    public static class Builder {

        private java.util.List<GeoJSONMultiPolygonInput> regions;

        public Builder() {
        }

        public Builder setRegions(java.util.List<GeoJSONMultiPolygonInput> regions) {
            this.regions = regions;
            return this;
        }


        public TextRecognitionOptionsInput build() {
            return new TextRecognitionOptionsInput(regions);
        }

    }
}
