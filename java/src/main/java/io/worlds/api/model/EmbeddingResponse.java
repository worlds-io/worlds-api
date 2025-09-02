package io.worlds.api.model;


public class EmbeddingResponse implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private java.util.List<EmbeddingResult> results;

    public EmbeddingResponse() {
    }

    public EmbeddingResponse(java.util.List<EmbeddingResult> results) {
        this.results = results;
    }

    /**
     * The list of embeddings
     */
    public java.util.List<EmbeddingResult> getResults() {
        return results;
    }
    /**
     * The list of embeddings
     */
    public void setResults(java.util.List<EmbeddingResult> results) {
        this.results = results;
    }



    public static EmbeddingResponse.Builder builder() {
        return new EmbeddingResponse.Builder();
    }

    public static class Builder {

        private java.util.List<EmbeddingResult> results;

        public Builder() {
        }

        /**
         * The list of embeddings
         */
        public Builder setResults(java.util.List<EmbeddingResult> results) {
            this.results = results;
            return this;
        }


        public EmbeddingResponse build() {
            return new EmbeddingResponse(results);
        }

    }
}
