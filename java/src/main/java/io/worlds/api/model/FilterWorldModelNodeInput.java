package io.worlds.api.model;

import java.util.Objects;

/**
 * `FilterWorldModelNodeInput` narrows a worldModelNodes query.
All provided fields must match.
 */
public class FilterWorldModelNodeInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private java.util.List<String> types;
    private java.util.List<WorldModelPlane> planes;
    private org.springframework.graphql.data.ArgumentValue<String> idPrefix = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<String> labelContains = org.springframework.graphql.data.ArgumentValue.omitted();

    public FilterWorldModelNodeInput() {
    }

    public FilterWorldModelNodeInput(java.util.List<String> types, java.util.List<WorldModelPlane> planes, org.springframework.graphql.data.ArgumentValue<String> idPrefix, org.springframework.graphql.data.ArgumentValue<String> labelContains) {
        this.types = types;
        this.planes = planes;
        this.idPrefix = idPrefix;
        this.labelContains = labelContains;
    }

    public java.util.List<String> getTypes() {
        return types;
    }
    public void setTypes(java.util.List<String> types) {
        this.types = types;
    }

    public java.util.List<WorldModelPlane> getPlanes() {
        return planes;
    }
    public void setPlanes(java.util.List<WorldModelPlane> planes) {
        this.planes = planes;
    }

    public org.springframework.graphql.data.ArgumentValue<String> getIdPrefix() {
        return idPrefix;
    }
    public void setIdPrefix(org.springframework.graphql.data.ArgumentValue<String> idPrefix) {
        this.idPrefix = idPrefix;
    }

    public org.springframework.graphql.data.ArgumentValue<String> getLabelContains() {
        return labelContains;
    }
    public void setLabelContains(org.springframework.graphql.data.ArgumentValue<String> labelContains) {
        this.labelContains = labelContains;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final FilterWorldModelNodeInput that = (FilterWorldModelNodeInput) obj;
        return Objects.equals(types, that.types)
            && Objects.equals(planes, that.planes)
            && Objects.equals(idPrefix, that.idPrefix)
            && Objects.equals(labelContains, that.labelContains);
    }

    @Override
    public int hashCode() {
        return Objects.hash(types, planes, idPrefix, labelContains);
    }


    public static FilterWorldModelNodeInput.Builder builder() {
        return new FilterWorldModelNodeInput.Builder();
    }

    public static class Builder {

        private java.util.List<String> types;
        private java.util.List<WorldModelPlane> planes;
        private org.springframework.graphql.data.ArgumentValue<String> idPrefix = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<String> labelContains = org.springframework.graphql.data.ArgumentValue.omitted();

        public Builder() {
        }

        public Builder setTypes(java.util.List<String> types) {
            this.types = types;
            return this;
        }

        public Builder setPlanes(java.util.List<WorldModelPlane> planes) {
            this.planes = planes;
            return this;
        }

        public Builder setIdPrefix(org.springframework.graphql.data.ArgumentValue<String> idPrefix) {
            this.idPrefix = idPrefix;
            return this;
        }

        public Builder setLabelContains(org.springframework.graphql.data.ArgumentValue<String> labelContains) {
            this.labelContains = labelContains;
            return this;
        }


        public FilterWorldModelNodeInput build() {
            return new FilterWorldModelNodeInput(types, planes, idPrefix, labelContains);
        }

    }
}
