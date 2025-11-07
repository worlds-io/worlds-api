package io.worlds.api.model;

import java.util.Objects;

public class SegmentationResponse implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private java.util.List<SegmentationResult> results;

    public SegmentationResponse() {
    }

    public SegmentationResponse(java.util.List<SegmentationResult> results) {
        this.results = results;
    }

    /**
     * The list of segments
     */
    public java.util.List<SegmentationResult> getResults() {
        return results;
    }
    /**
     * The list of segments
     */
    public void setResults(java.util.List<SegmentationResult> results) {
        this.results = results;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final SegmentationResponse that = (SegmentationResponse) obj;
        return Objects.equals(results, that.results);
    }

    @Override
    public int hashCode() {
        return Objects.hash(results);
    }


    public static SegmentationResponse.Builder builder() {
        return new SegmentationResponse.Builder();
    }

    public static class Builder {

        private java.util.List<SegmentationResult> results;

        public Builder() {
        }

        /**
         * The list of segments
         */
        public Builder setResults(java.util.List<SegmentationResult> results) {
            this.results = results;
            return this;
        }


        public SegmentationResponse build() {
            return new SegmentationResponse(results);
        }

    }
}
