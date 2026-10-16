package io.worlds.api.model;

import java.util.Objects;

/**
 * How an update changes a `JSON` field. Give exactly one of `merge` or `replace`. To clear the field,
pass `null` for the whole input instead.
 */
public class JSONUpdateInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private org.springframework.graphql.data.ArgumentValue<java.lang.Object> merge = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<java.lang.Object> replace = org.springframework.graphql.data.ArgumentValue.omitted();

    public JSONUpdateInput() {
    }

    public JSONUpdateInput(org.springframework.graphql.data.ArgumentValue<java.lang.Object> merge, org.springframework.graphql.data.ArgumentValue<java.lang.Object> replace) {
        this.merge = merge;
        this.replace = replace;
    }

    public org.springframework.graphql.data.ArgumentValue<java.lang.Object> getMerge() {
        return merge;
    }
    public void setMerge(org.springframework.graphql.data.ArgumentValue<java.lang.Object> merge) {
        this.merge = merge;
    }

    public org.springframework.graphql.data.ArgumentValue<java.lang.Object> getReplace() {
        return replace;
    }
    public void setReplace(org.springframework.graphql.data.ArgumentValue<java.lang.Object> replace) {
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
        final JSONUpdateInput that = (JSONUpdateInput) obj;
        return Objects.equals(merge, that.merge)
            && Objects.equals(replace, that.replace);
    }

    @Override
    public int hashCode() {
        return Objects.hash(merge, replace);
    }


    public static JSONUpdateInput.Builder builder() {
        return new JSONUpdateInput.Builder();
    }

    public static class Builder {

        private org.springframework.graphql.data.ArgumentValue<java.lang.Object> merge = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<java.lang.Object> replace = org.springframework.graphql.data.ArgumentValue.omitted();

        public Builder() {
        }

        public Builder setMerge(org.springframework.graphql.data.ArgumentValue<java.lang.Object> merge) {
            this.merge = merge;
            return this;
        }

        public Builder setReplace(org.springframework.graphql.data.ArgumentValue<java.lang.Object> replace) {
            this.replace = replace;
            return this;
        }


        public JSONUpdateInput build() {
            return new JSONUpdateInput(merge, replace);
        }

    }
}
