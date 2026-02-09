package io.worlds.api.model;

import java.util.Objects;

/**
 * `FilterJSONFieldInput` allows for filtering based on user-defined metadata fields.
 */
public class FilterJSONFieldInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private java.util.List<String> path;
    @jakarta.validation.constraints.NotNull
    private FilterJSONFieldMode filter;

    public FilterJSONFieldInput() {
    }

    public FilterJSONFieldInput(java.util.List<String> path, FilterJSONFieldMode filter) {
        this.path = path;
        this.filter = filter;
    }

    public java.util.List<String> getPath() {
        return path;
    }
    public void setPath(java.util.List<String> path) {
        this.path = path;
    }

    public FilterJSONFieldMode getFilter() {
        return filter;
    }
    public void setFilter(FilterJSONFieldMode filter) {
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
        final FilterJSONFieldInput that = (FilterJSONFieldInput) obj;
        return Objects.equals(path, that.path)
            && Objects.equals(filter, that.filter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(path, filter);
    }


    public static FilterJSONFieldInput.Builder builder() {
        return new FilterJSONFieldInput.Builder();
    }

    public static class Builder {

        private java.util.List<String> path;
        private FilterJSONFieldMode filter;

        public Builder() {
        }

        public Builder setPath(java.util.List<String> path) {
            this.path = path;
            return this;
        }

        public Builder setFilter(FilterJSONFieldMode filter) {
            this.filter = filter;
            return this;
        }


        public FilterJSONFieldInput build() {
            return new FilterJSONFieldInput(path, filter);
        }

    }
}
