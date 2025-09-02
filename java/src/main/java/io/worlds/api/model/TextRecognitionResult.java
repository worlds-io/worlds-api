package io.worlds.api.model;


public class TextRecognitionResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private TextDetection textDetection;
    private Integer regionIndex;

    public TextRecognitionResult() {
    }

    public TextRecognitionResult(TextDetection textDetection, Integer regionIndex) {
        this.textDetection = textDetection;
        this.regionIndex = regionIndex;
    }

    /**
     * The actual detected text
     */
    public TextDetection getTextDetection() {
        return textDetection;
    }
    /**
     * The actual detected text
     */
    public void setTextDetection(TextDetection textDetection) {
        this.textDetection = textDetection;
    }

    /**
     * The index of the region in the provided regions array that contains the text detection. Only applicable if `regions` was specified in the [original query]({{Types.textrecognitionoptionsinput}}}).
     */
    public Integer getRegionIndex() {
        return regionIndex;
    }
    /**
     * The index of the region in the provided regions array that contains the text detection. Only applicable if `regions` was specified in the [original query]({{Types.textrecognitionoptionsinput}}}).
     */
    public void setRegionIndex(Integer regionIndex) {
        this.regionIndex = regionIndex;
    }



    public static TextRecognitionResult.Builder builder() {
        return new TextRecognitionResult.Builder();
    }

    public static class Builder {

        private TextDetection textDetection;
        private Integer regionIndex;

        public Builder() {
        }

        /**
         * The actual detected text
         */
        public Builder setTextDetection(TextDetection textDetection) {
            this.textDetection = textDetection;
            return this;
        }

        /**
         * The index of the region in the provided regions array that contains the text detection. Only applicable if `regions` was specified in the [original query]({{Types.textrecognitionoptionsinput}}}).
         */
        public Builder setRegionIndex(Integer regionIndex) {
            this.regionIndex = regionIndex;
            return this;
        }


        public TextRecognitionResult build() {
            return new TextRecognitionResult(textDetection, regionIndex);
        }

    }
}
