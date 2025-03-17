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

    public Segment getSegment() {
        return segment;
    }
    public void setSegment(Segment segment) {
        this.segment = segment;
    }

    public Integer getRegionIndex() {
        return regionIndex;
    }
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

        public Builder setSegment(Segment segment) {
            this.segment = segment;
            return this;
        }

        public Builder setRegionIndex(Integer regionIndex) {
            this.regionIndex = regionIndex;
            return this;
        }


        public SegmentationResult build() {
            return new SegmentationResult(segment, regionIndex);
        }

    }
}
