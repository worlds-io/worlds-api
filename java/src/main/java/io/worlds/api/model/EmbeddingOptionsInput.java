package io.worlds.api.model;


public class EmbeddingOptionsInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private java.util.List<GeoJSONMultiPolygonInput> regions;

    public EmbeddingOptionsInput() {
    }

    public EmbeddingOptionsInput(java.util.List<GeoJSONMultiPolygonInput> regions) {
        this.regions = regions;
    }

    public java.util.List<GeoJSONMultiPolygonInput> getRegions() {
        return regions;
    }
    public void setRegions(java.util.List<GeoJSONMultiPolygonInput> regions) {
        this.regions = regions;
    }



    public static EmbeddingOptionsInput.Builder builder() {
        return new EmbeddingOptionsInput.Builder();
    }

    public static class Builder {

        private java.util.List<GeoJSONMultiPolygonInput> regions;

        public Builder() {
        }

        public Builder setRegions(java.util.List<GeoJSONMultiPolygonInput> regions) {
            this.regions = regions;
            return this;
        }


        public EmbeddingOptionsInput build() {
            return new EmbeddingOptionsInput(regions);
        }

    }
}
