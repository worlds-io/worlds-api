package io.worlds.api.model;

import java.util.Objects;

/**
 * How an update changes a list of strings. Give exactly one of `add`, `remove` or `replace`. To clear the
list, pass `null` for the whole input instead.
 */
public class StringListUpdateInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private java.util.List<String> add;
    private java.util.List<String> remove;
    private java.util.List<String> replace;

    public StringListUpdateInput() {
    }

    public StringListUpdateInput(java.util.List<String> add, java.util.List<String> remove, java.util.List<String> replace) {
        this.add = add;
        this.remove = remove;
        this.replace = replace;
    }

    public java.util.List<String> getAdd() {
        return add;
    }
    public void setAdd(java.util.List<String> add) {
        this.add = add;
    }

    public java.util.List<String> getRemove() {
        return remove;
    }
    public void setRemove(java.util.List<String> remove) {
        this.remove = remove;
    }

    public java.util.List<String> getReplace() {
        return replace;
    }
    public void setReplace(java.util.List<String> replace) {
        this.replace = replace;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final StringListUpdateInput that = (StringListUpdateInput) obj;
        return Objects.equals(add, that.add)
            && Objects.equals(remove, that.remove)
            && Objects.equals(replace, that.replace);
    }

    @Override
    public int hashCode() {
        return Objects.hash(add, remove, replace);
    }


    public static StringListUpdateInput.Builder builder() {
        return new StringListUpdateInput.Builder();
    }

    public static class Builder {

        private java.util.List<String> add;
        private java.util.List<String> remove;
        private java.util.List<String> replace;

        public Builder() {
        }

        public Builder setAdd(java.util.List<String> add) {
            this.add = add;
            return this;
        }

        public Builder setRemove(java.util.List<String> remove) {
            this.remove = remove;
            return this;
        }

        public Builder setReplace(java.util.List<String> replace) {
            this.replace = replace;
            return this;
        }


        public StringListUpdateInput build() {
            return new StringListUpdateInput(add, remove, replace);
        }

    }
}
