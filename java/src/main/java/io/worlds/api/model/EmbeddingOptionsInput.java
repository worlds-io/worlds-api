package io.worlds.api.model;

import java.util.Objects;

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

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final EmbeddingOptionsInput that = (EmbeddingOptionsInput) obj;
        return Objects.equals(regions, that.regions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(regions);
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
