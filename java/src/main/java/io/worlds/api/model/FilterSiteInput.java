package io.worlds.api.model;


/**
 * FilterSiteInput filters [sites]({{Types.site}}) based on criteria described below.
Only one field should be provided per Filter object unless using an operator (`and` `or` `not`) as specified below.
 */
public class FilterSiteInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private org.springframework.graphql.data.ArgumentValue<FilterIDInput> id = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterStringInput> name = org.springframework.graphql.data.ArgumentValue.omitted();
    private java.util.List<FilterSiteInput> and;
    private java.util.List<FilterSiteInput> or;
    private org.springframework.graphql.data.ArgumentValue<FilterSiteInput> not = org.springframework.graphql.data.ArgumentValue.omitted();

    public FilterSiteInput() {
    }

    public FilterSiteInput(org.springframework.graphql.data.ArgumentValue<FilterIDInput> id, org.springframework.graphql.data.ArgumentValue<FilterStringInput> name, java.util.List<FilterSiteInput> and, java.util.List<FilterSiteInput> or, org.springframework.graphql.data.ArgumentValue<FilterSiteInput> not) {
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

    public java.util.List<FilterSiteInput> getAnd() {
        return and;
    }
    public void setAnd(java.util.List<FilterSiteInput> and) {
        this.and = and;
    }

    public java.util.List<FilterSiteInput> getOr() {
        return or;
    }
    public void setOr(java.util.List<FilterSiteInput> or) {
        this.or = or;
    }

    public org.springframework.graphql.data.ArgumentValue<FilterSiteInput> getNot() {
        return not;
    }
    public void setNot(org.springframework.graphql.data.ArgumentValue<FilterSiteInput> not) {
        this.not = not;
    }



    public static FilterSiteInput.Builder builder() {
        return new FilterSiteInput.Builder();
    }

    public static class Builder {

        private org.springframework.graphql.data.ArgumentValue<FilterIDInput> id = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterStringInput> name = org.springframework.graphql.data.ArgumentValue.omitted();
        private java.util.List<FilterSiteInput> and;
        private java.util.List<FilterSiteInput> or;
        private org.springframework.graphql.data.ArgumentValue<FilterSiteInput> not = org.springframework.graphql.data.ArgumentValue.omitted();

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

        public Builder setAnd(java.util.List<FilterSiteInput> and) {
            this.and = and;
            return this;
        }

        public Builder setOr(java.util.List<FilterSiteInput> or) {
            this.or = or;
            return this;
        }

        public Builder setNot(org.springframework.graphql.data.ArgumentValue<FilterSiteInput> not) {
            this.not = not;
            return this;
        }


        public FilterSiteInput build() {
            return new FilterSiteInput(id, name, and, or, not);
        }

    }
}
