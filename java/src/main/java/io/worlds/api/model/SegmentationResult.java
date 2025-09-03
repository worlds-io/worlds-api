package io.worlds.api.model;


public class SegmentationResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private Segment segment;
    private Integer regionIndex;

    public SegmentationResult() {
    }

    public SegmentationResult(Segment segment, Integer regionIndex) {
        this.segment = segment;
        this.regionIndex = regionIndex;
    }

    /**
     * The actual segment
     */
    public Segment getSegment() {
        return segment;
    }
    /**
     * The actual segment
     */
    public void setSegment(Segment segment) {
        this.segment = segment;
    }

    /**
     * The index of the region in the provided regions array that contains the segment. Only applicable if `regions` was specified in the [original query]({{Types.segmentationoptionsinput}}).
     */
    public Integer getRegionIndex() {
        return regionIndex;
    }
    /**
     * The index of the region in the provided regions array that contains the segment. Only applicable if `regions` was specified in the [original query]({{Types.segmentationoptionsinput}}).
     */
    public void setRegionIndex(Integer regionIndex) {
        this.regionIndex = regionIndex;
    }



    public static SegmentationResult.Builder builder() {
        return new SegmentationResult.Builder();
    }

    public static class Builder {

        private Segment segment;
        private Integer regionIndex;

        public Builder() {
        }

        /**
         * The actual segment
         */
        public Builder setSegment(Segment segment) {
            this.segment = segment;
            return this;
        }

        /**
         * The index of the region in the provided regions array that contains the segment. Only applicable if `regions` was specified in the [original query]({{Types.segmentationoptionsinput}}).
         */
        public Builder setRegionIndex(Integer regionIndex) {
            this.regionIndex = regionIndex;
            return this;
        }


        public SegmentationResult build() {
            return new SegmentationResult(segment, regionIndex);
        }

    }
}
