package io.worlds.api.model;

import java.util.Objects;

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

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final EmbeddingResponse that = (EmbeddingResponse) obj;
        return Objects.equals(results, that.results);
    }

    @Override
    public int hashCode() {
        return Objects.hash(results);
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
