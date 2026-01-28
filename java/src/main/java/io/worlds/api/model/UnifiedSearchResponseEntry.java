package io.worlds.api.model;

import java.util.Objects;

/**
 * A single entity from a `unifiedSearch` query, along with additional information specific to the entity.
 */
public class UnifiedSearchResponseEntry implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private UnifiedSearchNameResponseEntity entity;
    private double similarityScore;
    @jakarta.validation.constraints.NotNull
    private String context;

    public UnifiedSearchResponseEntry() {
    }

    public UnifiedSearchResponseEntry(UnifiedSearchNameResponseEntity entity, double similarityScore, String context) {
        this.entity = entity;
        this.similarityScore = similarityScore;
        this.context = context;
    }

    /**
     * The entity matching the query.
     */
    public UnifiedSearchNameResponseEntity getEntity() {
        return entity;
    }
    /**
     * The entity matching the query.
     */
    public void setEntity(UnifiedSearchNameResponseEntity entity) {
        this.entity = entity;
    }

    /**
     * The cosine similarity of the entity to the query string, in the range [0, 1].
     */
    public double getSimilarityScore() {
        return similarityScore;
    }
    /**
     * The cosine similarity of the entity to the query string, in the range [0, 1].
     */
    public void setSimilarityScore(double similarityScore) {
        this.similarityScore = similarityScore;
    }

    /**
     * A textual description of the entity, plus parent information if relevant.
     */
    public String getContext() {
        return context;
    }
    /**
     * A textual description of the entity, plus parent information if relevant.
     */
    public void setContext(String context) {
        this.context = context;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final UnifiedSearchResponseEntry that = (UnifiedSearchResponseEntry) obj;
        return Objects.equals(entity, that.entity)
            && Objects.equals(similarityScore, that.similarityScore)
            && Objects.equals(context, that.context);
    }

    @Override
    public int hashCode() {
        return Objects.hash(entity, similarityScore, context);
    }


    public static UnifiedSearchResponseEntry.Builder builder() {
        return new UnifiedSearchResponseEntry.Builder();
    }

    public static class Builder {

        private UnifiedSearchNameResponseEntity entity;
        private double similarityScore;
        private String context;

        public Builder() {
        }

        /**
         * The entity matching the query.
         */
        public Builder setEntity(UnifiedSearchNameResponseEntity entity) {
            this.entity = entity;
            return this;
        }

        /**
         * The cosine similarity of the entity to the query string, in the range [0, 1].
         */
        public Builder setSimilarityScore(double similarityScore) {
            this.similarityScore = similarityScore;
            return this;
        }

        /**
         * A textual description of the entity, plus parent information if relevant.
         */
        public Builder setContext(String context) {
            this.context = context;
            return this;
        }


        public UnifiedSearchResponseEntry build() {
            return new UnifiedSearchResponseEntry(entity, similarityScore, context);
        }

    }
}
