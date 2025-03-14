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

    public java.util.List<Double> getEmbedding() {
        return embedding;
    }
    public void setEmbedding(java.util.List<Double> embedding) {
        this.embedding = embedding;
    }

    public Integer getRegionIndex() {
        return regionIndex;
    }
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

        public Builder setEmbedding(java.util.List<Double> embedding) {
            this.embedding = embedding;
            return this;
        }

        public Builder setRegionIndex(Integer regionIndex) {
            this.regionIndex = regionIndex;
            return this;
        }


        public EmbeddingResult build() {
            return new EmbeddingResult(embedding, regionIndex);
        }

    }
}
