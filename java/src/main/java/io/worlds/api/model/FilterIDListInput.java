package io.worlds.api.model;

import java.util.Objects;

/**
 * `FilterIDListInput` allows for filtering based on a list of identifiers. Only one field should be provided per filter object.
 */
public class FilterIDListInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private java.util.List<String> eq;
    private java.util.List<String> in;
    private org.springframework.graphql.data.ArgumentValue<Boolean> attributeExists = org.springframework.graphql.data.ArgumentValue.omitted();

    public FilterIDListInput() {
    }

    public FilterIDListInput(java.util.List<String> eq, java.util.List<String> in, org.springframework.graphql.data.ArgumentValue<Boolean> attributeExists) {
        this.eq = eq;
        this.in = in;
        this.attributeExists = attributeExists;
    }

    public java.util.List<String> getEq() {
        return eq;
    }
    public void setEq(java.util.List<String> eq) {
        this.eq = eq;
    }

    public java.util.List<String> getIn() {
        return in;
    }
    public void setIn(java.util.List<String> in) {
        this.in = in;
    }

    public org.springframework.graphql.data.ArgumentValue<Boolean> getAttributeExists() {
        return attributeExists;
    }
    public void setAttributeExists(org.springframework.graphql.data.ArgumentValue<Boolean> attributeExists) {
        this.attributeExists = attributeExists;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final FilterIDListInput that = (FilterIDListInput) obj;
        return Objects.equals(eq, that.eq)
            && Objects.equals(in, that.in)
            && Objects.equals(attributeExists, that.attributeExists);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eq, in, attributeExists);
    }


    public static FilterIDListInput.Builder builder() {
        return new FilterIDListInput.Builder();
    }

    public static class Builder {

        private java.util.List<String> eq;
        private java.util.List<String> in;
        private org.springframework.graphql.data.ArgumentValue<Boolean> attributeExists = org.springframework.graphql.data.ArgumentValue.omitted();

        public Builder() {
        }

        public Builder setEq(java.util.List<String> eq) {
            this.eq = eq;
            return this;
        }

        public Builder setIn(java.util.List<String> in) {
            this.in = in;
            return this;
        }

        public Builder setAttributeExists(org.springframework.graphql.data.ArgumentValue<Boolean> attributeExists) {
            this.attributeExists = attributeExists;
            return this;
        }


        public FilterIDListInput build() {
            return new FilterIDListInput(eq, in, attributeExists);
        }

    }
}
