package io.worlds.api.model;


public class TextReadingResponse implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private String text;
    private double textConfidence;

    public TextReadingResponse() {
    }

    public TextReadingResponse(String text, double textConfidence) {
        this.text = text;
        this.textConfidence = textConfidence;
    }

    /**
     * The recognized text
     */
    public String getText() {
        return text;
    }
    /**
     * The recognized text
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * The confidence score for the recognized text's accuracy.
     */
    public double getTextConfidence() {
        return textConfidence;
    }
    /**
     * The confidence score for the recognized text's accuracy.
     */
    public void setTextConfidence(double textConfidence) {
        this.textConfidence = textConfidence;
    }



    public static TextReadingResponse.Builder builder() {
        return new TextReadingResponse.Builder();
    }

    public static class Builder {

        private String text;
        private double textConfidence;

        public Builder() {
        }

        /**
         * The recognized text
         */
        public Builder setText(String text) {
            this.text = text;
            return this;
        }

        /**
         * The confidence score for the recognized text's accuracy.
         */
        public Builder setTextConfidence(double textConfidence) {
            this.textConfidence = textConfidence;
            return this;
        }


        public TextReadingResponse build() {
            return new TextReadingResponse(text, textConfidence);
        }

    }
}
