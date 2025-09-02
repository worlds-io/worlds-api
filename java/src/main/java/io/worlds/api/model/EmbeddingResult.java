package io.worlds.api.model;


public class EmbeddingResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private java.util.List<Double> embedding;
    private Integer regionIndex;

    public EmbeddingResult() {
    }

    public EmbeddingResult(java.util.List<Double> embedding, Integer regionIndex) {
        this.embedding = embedding;
        this.regionIndex = regionIndex;
    }

    /**
     * The embedding vector
     */
    public java.util.List<Double> getEmbedding() {
        return embedding;
    }
    /**
     * The embedding vector
     */
    public void setEmbedding(java.util.List<Double> embedding) {
        this.embedding = embedding;
    }

    /**
     * The index of the region in the provided regions array that contains the embedding. Only applicable if `regions` was specified in the [original query]({{Types.embeddingoptionsinput}}).
     */
    public Integer getRegionIndex() {
        return regionIndex;
    }
    /**
     * The index of the region in the provided regions array that contains the embedding. Only applicable if `regions` was specified in the [original query]({{Types.embeddingoptionsinput}}).
     */
    public void setRegionIndex(Integer regionIndex) {
        this.regionIndex = regionIndex;
    }



    public static EmbeddingResult.Builder builder() {
        return new EmbeddingResult.Builder();
    }

    public static class Builder {

        private java.util.List<Double> embedding;
        private Integer regionIndex;

        public Builder() {
        }

        /**
         * The embedding vector
         */
        public Builder setEmbedding(java.util.List<Double> embedding) {
            this.embedding = embedding;
            return this;
        }

        /**
         * The index of the region in the provided regions array that contains the embedding. Only applicable if `regions` was specified in the [original query]({{Types.embeddingoptionsinput}}).
         */
        public Builder setRegionIndex(Integer regionIndex) {
            this.regionIndex = regionIndex;
            return this;
        }


        public EmbeddingResult build() {
            return new EmbeddingResult(embedding, regionIndex);
        }

    }
}
