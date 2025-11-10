package io.worlds.api.model;

import java.util.Objects;

/**
 * `FilterTagInput` allows for filtering tags based on criteria described below.
Only one field should be provided per Filter object unless an operator
(`and` `or` `not`) as specified below.
 */
public class FilterTagInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private org.springframework.graphql.data.ArgumentValue<FilterIDInput> id = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterStringInput> name = org.springframework.graphql.data.ArgumentValue.omitted();
    private java.util.List<FilterTagInput> and;
    private java.util.List<FilterTagInput> or;
    private org.springframework.graphql.data.ArgumentValue<FilterTagInput> not = org.springframework.graphql.data.ArgumentValue.omitted();

    public FilterTagInput() {
    }

    public FilterTagInput(org.springframework.graphql.data.ArgumentValue<FilterIDInput> id, org.springframework.graphql.data.ArgumentValue<FilterStringInput> name, java.util.List<FilterTagInput> and, java.util.List<FilterTagInput> or, org.springframework.graphql.data.ArgumentValue<FilterTagInput> not) {
        this.id = id;
        this.name = name;
        this.and = and;
        this.or = or;
        this.not = not;
    }

    public org.springframework.graphql.data.ArgumentValue<FilterIDInput> getId() {
        return id;
    }
    public void setId(org.springframework.graphql.data.ArgumentValue<FilterIDInput> id) {
        this.id = id;
    }

    public org.springframework.graphql.data.ArgumentValue<FilterStringInput> getName() {
        return name;
    }
    public void setName(org.springframework.graphql.data.ArgumentValue<FilterStringInput> name) {
        this.name = name;
    }

    public java.util.List<FilterTagInput> getAnd() {
        return and;
    }
    public void setAnd(java.util.List<FilterTagInput> and) {
        this.and = and;
    }

    public java.util.List<FilterTagInput> getOr() {
        return or;
    }
    public void setOr(java.util.List<FilterTagInput> or) {
        this.or = or;
    }

    public org.springframework.graphql.data.ArgumentValue<FilterTagInput> getNot() {
        return not;
    }
    public void setNot(org.springframework.graphql.data.ArgumentValue<FilterTagInput> not) {
        this.not = not;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final FilterTagInput that = (FilterTagInput) obj;
        return Objects.equals(id, that.id)
            && Objects.equals(name, that.name)
            && Objects.equals(and, that.and)
            && Objects.equals(or, that.or)
            && Objects.equals(not, that.not);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, and, or, not);
    }


    public static FilterTagInput.Builder builder() {
        return new FilterTagInput.Builder();
    }

    public static class Builder {

        private org.springframework.graphql.data.ArgumentValue<FilterIDInput> id = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterStringInput> name = org.springframework.graphql.data.ArgumentValue.omitted();
        private java.util.List<FilterTagInput> and;
        private java.util.List<FilterTagInput> or;
        private org.springframework.graphql.data.ArgumentValue<FilterTagInput> not = org.springframework.graphql.data.ArgumentValue.omitted();

        public Builder() {
        }

        public Builder setId(org.springframework.graphql.data.ArgumentValue<FilterIDInput> id) {
            this.id = id;
            return this;
        }

        public Builder setName(org.springframework.graphql.data.ArgumentValue<FilterStringInput> name) {
            this.name = name;
            return this;
        }

        public Builder setAnd(java.util.List<FilterTagInput> and) {
            this.and = and;
            return this;
        }

        public Builder setOr(java.util.List<FilterTagInput> or) {
            this.or = or;
            return this;
        }

        public Builder setNot(org.springframework.graphql.data.ArgumentValue<FilterTagInput> not) {
            this.not = not;
            return this;
        }


        public FilterTagInput build() {
            return new FilterTagInput(id, name, and, or, not);
        }

    }
}
