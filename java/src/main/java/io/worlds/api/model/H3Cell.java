package io.worlds.api.model;

import java.util.Objects;

/**
 * A `H3Cell` represents a geographical area, useful for grouping nearby points.  Refer to [the H3 documentation](https://h3geo.org/docs) for more information on the structure.
 */
public class H3Cell implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private String index;
    private GeoJSONPoint center;

    public H3Cell() {
    }

    public H3Cell(String index, GeoJSONPoint center) {
        this.index = index;
        this.center = center;
    }

    /**
     * The canonical string index of the cell.  See [the H3 docs](https://h3geo.org/docs/library/index/cell).
     */
    public String getIndex() {
        return index;
    }
    /**
     * The canonical string index of the cell.  See [the H3 docs](https://h3geo.org/docs/library/index/cell).
     */
    public void setIndex(String index) {
        this.index = index;
    }

    /**
     * The coordinates of the approximate centroid of the cell.
     */
    public GeoJSONPoint getCenter() {
        return center;
    }
    /**
     * The coordinates of the approximate centroid of the cell.
     */
    public void setCenter(GeoJSONPoint center) {
        this.center = center;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final H3Cell that = (H3Cell) obj;
        return Objects.equals(index, that.index)
            && Objects.equals(center, that.center);
    }

    @Override
    public int hashCode() {
        return Objects.hash(index, center);
    }


    public static H3Cell.Builder builder() {
        return new H3Cell.Builder();
    }

    public static class Builder {

        private String index;
        private GeoJSONPoint center;

        public Builder() {
        }

        /**
         * The canonical string index of the cell.  See [the H3 docs](https://h3geo.org/docs/library/index/cell).
         */
        public Builder setIndex(String index) {
            this.index = index;
            return this;
        }

        /**
         * The coordinates of the approximate centroid of the cell.
         */
        public Builder setCenter(GeoJSONPoint center) {
            this.center = center;
            return this;
        }


        public H3Cell build() {
            return new H3Cell(index, center);
        }

    }
}
