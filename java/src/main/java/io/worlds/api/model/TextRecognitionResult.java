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

    public TextDetection getTextDetection() {
        return textDetection;
    }
    public void setTextDetection(TextDetection textDetection) {
        this.textDetection = textDetection;
    }

    public Integer getRegionIndex() {
        return regionIndex;
    }
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

        public Builder setTextDetection(TextDetection textDetection) {
            this.textDetection = textDetection;
            return this;
        }

        public Builder setRegionIndex(Integer regionIndex) {
            this.regionIndex = regionIndex;
            return this;
        }


        public TextRecognitionResult build() {
            return new TextRecognitionResult(textDetection, regionIndex);
        }

    }
}
