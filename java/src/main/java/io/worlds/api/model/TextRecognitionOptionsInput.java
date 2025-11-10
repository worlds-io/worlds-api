package io.worlds.api.model;

import java.util.Objects;

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

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final TextRecognitionOptionsInput that = (TextRecognitionOptionsInput) obj;
        return Objects.equals(regions, that.regions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(regions);
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
