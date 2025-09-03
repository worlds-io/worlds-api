package io.worlds.api.model;


public class Segment implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private GeoJSONMultiPolygon polygon;
    @jakarta.validation.constraints.NotNull
    private GeoJSONPolygon box;

    public Segment() {
    }

    public Segment(GeoJSONMultiPolygon polygon, GeoJSONPolygon box) {
        this.polygon = polygon;
        this.box = box;
    }

    /**
     * The region of the image that defines the segment
     */
    public GeoJSONMultiPolygon getPolygon() {
        return polygon;
    }
    /**
     * The region of the image that defines the segment
     */
    public void setPolygon(GeoJSONMultiPolygon polygon) {
        this.polygon = polygon;
    }

    /**
     * A bounding box that covers the entire area of the segment
     */
    public GeoJSONPolygon getBox() {
        return box;
    }
    /**
     * A bounding box that covers the entire area of the segment
     */
    public void setBox(GeoJSONPolygon box) {
        this.box = box;
    }



    public static Segment.Builder builder() {
        return new Segment.Builder();
    }

    public static class Builder {

        private GeoJSONMultiPolygon polygon;
        private GeoJSONPolygon box;

        public Builder() {
        }

        /**
         * The region of the image that defines the segment
         */
        public Builder setPolygon(GeoJSONMultiPolygon polygon) {
            this.polygon = polygon;
            return this;
        }

        /**
         * A bounding box that covers the entire area of the segment
         */
        public Builder setBox(GeoJSONPolygon box) {
            this.box = box;
            return this;
        }


        public Segment build() {
            return new Segment(polygon, box);
        }

    }
}
