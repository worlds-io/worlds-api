package io.worlds.api.model;

import java.util.Objects;

/**
 * `FilterJSONFieldStringInput` allows for filtering based on user-defined metadata fields, treating all values as strings.
 */
public class FilterJSONFieldStringInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private java.util.List<String> path;
    @jakarta.validation.constraints.NotNull
    private FilterStringInput filter;

    public FilterJSONFieldStringInput() {
    }

    public FilterJSONFieldStringInput(java.util.List<String> path, FilterStringInput filter) {
        this.path = path;
        this.filter = filter;
    }

    public java.util.List<String> getPath() {
        return path;
    }
    public void setPath(java.util.List<String> path) {
        this.path = path;
    }

    public FilterStringInput getFilter() {
        return filter;
    }
    public void setFilter(FilterStringInput filter) {
        this.filter = filter;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final FilterJSONFieldStringInput that = (FilterJSONFieldStringInput) obj;
        return Objects.equals(path, that.path)
            && Objects.equals(filter, that.filter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(path, filter);
    }


    public static FilterJSONFieldStringInput.Builder builder() {
        return new FilterJSONFieldStringInput.Builder();
    }

    public static class Builder {

        private java.util.List<String> path;
        private FilterStringInput filter;

        public Builder() {
        }

        public Builder setPath(java.util.List<String> path) {
            this.path = path;
            return this;
        }

        public Builder setFilter(FilterStringInput filter) {
            this.filter = filter;
            return this;
        }


        public FilterJSONFieldStringInput build() {
            return new FilterJSONFieldStringInput(path, filter);
        }

    }
}
