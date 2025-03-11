package io.worlds.api.model;


public class TextRecognitionResponse implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private java.util.List<TextRecognitionResult> results;

    public TextRecognitionResponse() {
    }

    public TextRecognitionResponse(java.util.List<TextRecognitionResult> results) {
        this.results = results;
    }

    public java.util.List<TextRecognitionResult> getResults() {
        return results;
    }
    public void setResults(java.util.List<TextRecognitionResult> results) {
        this.results = results;
    }



    public static TextRecognitionResponse.Builder builder() {
        return new TextRecognitionResponse.Builder();
    }

    public static class Builder {

        private java.util.List<TextRecognitionResult> results;

        public Builder() {
        }

        public Builder setResults(java.util.List<TextRecognitionResult> results) {
            this.results = results;
            return this;
        }


        public TextRecognitionResponse build() {
            return new TextRecognitionResponse(results);
        }

    }
}
