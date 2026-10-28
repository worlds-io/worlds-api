package io.worlds.api.model;

import java.util.Objects;

/**
 * `FilterIDListInput` allows for filtering based on a list of identifiers. Only one field should be provided per filter object.
Order and duplicates in the provided IDs are ignored.
IDs of objects you cannot read are ignored when matching: every operator compares against the IDs you can read, so
`containsNone` with only unreadable IDs matches every object, and `attributeExists: false` matches an object with no
linked objects you can read.
 */
public class FilterIDListInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private java.util.List<String> eq;
    @Deprecated
    private java.util.List<String> in;
    private java.util.List<String> containsAll;
    private java.util.List<String> containsAny;
    private java.util.List<String> containsNone;
    private org.springframework.graphql.data.ArgumentValue<Boolean> attributeExists = org.springframework.graphql.data.ArgumentValue.omitted();

    public FilterIDListInput() {
    }

    public FilterIDListInput(java.util.List<String> eq, java.util.List<String> in, java.util.List<String> containsAll, java.util.List<String> containsAny, java.util.List<String> containsNone, org.springframework.graphql.data.ArgumentValue<Boolean> attributeExists) {
        this.eq = eq;
        this.in = in;
        this.containsAll = containsAll;
        this.containsAny = containsAny;
        this.containsNone = containsNone;
        this.attributeExists = attributeExists;
    }

    public java.util.List<String> getEq() {
        return eq;
    }
    public void setEq(java.util.List<String> eq) {
        this.eq = eq;
    }

    @Deprecated
    public java.util.List<String> getIn() {
        return in;
    }
    @Deprecated
    public void setIn(java.util.List<String> in) {
        this.in = in;
    }

    public java.util.List<String> getContainsAll() {
        return containsAll;
    }
    public void setContainsAll(java.util.List<String> containsAll) {
        this.containsAll = containsAll;
    }

    public java.util.List<String> getContainsAny() {
        return containsAny;
    }
    public void setContainsAny(java.util.List<String> containsAny) {
        this.containsAny = containsAny;
    }

    public java.util.List<String> getContainsNone() {
        return containsNone;
    }
    public void setContainsNone(java.util.List<String> containsNone) {
        this.containsNone = containsNone;
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
            && Objects.equals(containsAll, that.containsAll)
            && Objects.equals(containsAny, that.containsAny)
            && Objects.equals(containsNone, that.containsNone)
            && Objects.equals(attributeExists, that.attributeExists);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eq, in, containsAll, containsAny, containsNone, attributeExists);
    }


    public static FilterIDListInput.Builder builder() {
        return new FilterIDListInput.Builder();
    }

    public static class Builder {

        private java.util.List<String> eq;
        private java.util.List<String> in;
        private java.util.List<String> containsAll;
        private java.util.List<String> containsAny;
        private java.util.List<String> containsNone;
        private org.springframework.graphql.data.ArgumentValue<Boolean> attributeExists = org.springframework.graphql.data.ArgumentValue.omitted();

        public Builder() {
        }

        public Builder setEq(java.util.List<String> eq) {
            this.eq = eq;
            return this;
        }

        @Deprecated
        public Builder setIn(java.util.List<String> in) {
            this.in = in;
            return this;
        }

        public Builder setContainsAll(java.util.List<String> containsAll) {
            this.containsAll = containsAll;
            return this;
        }

        public Builder setContainsAny(java.util.List<String> containsAny) {
            this.containsAny = containsAny;
            return this;
        }

        public Builder setContainsNone(java.util.List<String> containsNone) {
            this.containsNone = containsNone;
            return this;
        }

        public Builder setAttributeExists(org.springframework.graphql.data.ArgumentValue<Boolean> attributeExists) {
            this.attributeExists = attributeExists;
            return this;
        }


        public FilterIDListInput build() {
            return new FilterIDListInput(eq, in, containsAll, containsAny, containsNone, attributeExists);
        }

    }
}
