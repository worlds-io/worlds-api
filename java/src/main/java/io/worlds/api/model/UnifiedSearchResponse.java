package io.worlds.api.model;

import java.util.Objects;

/**
 * The response from a `unifiedSearch` query.
 */
public class UnifiedSearchResponse implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private java.util.List<UnifiedSearchResponseEntry> entities;

    public UnifiedSearchResponse() {
    }

    public UnifiedSearchResponse(java.util.List<UnifiedSearchResponseEntry> entities) {
        this.entities = entities;
    }

    /**
     * The entities matching the search query.
     */
    public java.util.List<UnifiedSearchResponseEntry> getEntities() {
        return entities;
    }
    /**
     * The entities matching the search query.
     */
    public void setEntities(java.util.List<UnifiedSearchResponseEntry> entities) {
        this.entities = entities;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final UnifiedSearchResponse that = (UnifiedSearchResponse) obj;
        return Objects.equals(entities, that.entities);
    }

    @Override
    public int hashCode() {
        return Objects.hash(entities);
    }


    public static UnifiedSearchResponse.Builder builder() {
        return new UnifiedSearchResponse.Builder();
    }

    public static class Builder {

        private java.util.List<UnifiedSearchResponseEntry> entities;

        public Builder() {
        }

        /**
         * The entities matching the search query.
         */
        public Builder setEntities(java.util.List<UnifiedSearchResponseEntry> entities) {
            this.entities = entities;
            return this;
        }


        public UnifiedSearchResponse build() {
            return new UnifiedSearchResponse(entities);
        }

    }
}
