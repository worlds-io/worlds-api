package io.worlds.api.model;

import java.util.Objects;

/**
 * `FilterStringListInput` allows for filtering based on a list of strings. Only one field should be provided per filter object.
Order and duplicates in the provided strings are ignored.
 */
public class FilterStringListInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private java.util.List<String> eq;
    @Deprecated
    private java.util.List<String> in;
    private java.util.List<String> containsAll;
    private java.util.List<String> containsAny;
    private java.util.List<String> containsNone;

    public FilterStringListInput() {
    }

    public FilterStringListInput(java.util.List<String> eq, java.util.List<String> in, java.util.List<String> containsAll, java.util.List<String> containsAny, java.util.List<String> containsNone) {
        this.eq = eq;
        this.in = in;
        this.containsAll = containsAll;
        this.containsAny = containsAny;
        this.containsNone = containsNone;
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

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final FilterStringListInput that = (FilterStringListInput) obj;
        return Objects.equals(eq, that.eq)
            && Objects.equals(in, that.in)
            && Objects.equals(containsAll, that.containsAll)
            && Objects.equals(containsAny, that.containsAny)
            && Objects.equals(containsNone, that.containsNone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eq, in, containsAll, containsAny, containsNone);
    }


    public static FilterStringListInput.Builder builder() {
        return new FilterStringListInput.Builder();
    }

    public static class Builder {

        private java.util.List<String> eq;
        private java.util.List<String> in;
        private java.util.List<String> containsAll;
        private java.util.List<String> containsAny;
        private java.util.List<String> containsNone;

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


        public FilterStringListInput build() {
            return new FilterStringListInput(eq, in, containsAll, containsAny, containsNone);
        }

    }
}
