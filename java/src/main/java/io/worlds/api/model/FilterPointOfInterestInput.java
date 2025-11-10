package io.worlds.api.model;

import java.util.Objects;

/**
 * `FilterPointOfInterestInput` allows for filtering points of interest based on criteria described below.
Only one field should be provided per Filter object unless an operator
(`and` `or` `not`) as specified below.
 */
public class FilterPointOfInterestInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private org.springframework.graphql.data.ArgumentValue<FilterIDInput> id = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterIDInput> siteId = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterStringInput> name = org.springframework.graphql.data.ArgumentValue.omitted();
    private java.util.List<FilterPointOfInterestInput> and;
    private java.util.List<FilterPointOfInterestInput> or;
    private org.springframework.graphql.data.ArgumentValue<FilterPointOfInterestInput> not = org.springframework.graphql.data.ArgumentValue.omitted();

    public FilterPointOfInterestInput() {
    }

    public FilterPointOfInterestInput(org.springframework.graphql.data.ArgumentValue<FilterIDInput> id, org.springframework.graphql.data.ArgumentValue<FilterIDInput> siteId, org.springframework.graphql.data.ArgumentValue<FilterStringInput> name, java.util.List<FilterPointOfInterestInput> and, java.util.List<FilterPointOfInterestInput> or, org.springframework.graphql.data.ArgumentValue<FilterPointOfInterestInput> not) {
        this.id = id;
        this.siteId = siteId;
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

    public org.springframework.graphql.data.ArgumentValue<FilterIDInput> getSiteId() {
        return siteId;
    }
    public void setSiteId(org.springframework.graphql.data.ArgumentValue<FilterIDInput> siteId) {
        this.siteId = siteId;
    }

    public org.springframework.graphql.data.ArgumentValue<FilterStringInput> getName() {
        return name;
    }
    public void setName(org.springframework.graphql.data.ArgumentValue<FilterStringInput> name) {
        this.name = name;
    }

    public java.util.List<FilterPointOfInterestInput> getAnd() {
        return and;
    }
    public void setAnd(java.util.List<FilterPointOfInterestInput> and) {
        this.and = and;
    }

    public java.util.List<FilterPointOfInterestInput> getOr() {
        return or;
    }
    public void setOr(java.util.List<FilterPointOfInterestInput> or) {
        this.or = or;
    }

    public org.springframework.graphql.data.ArgumentValue<FilterPointOfInterestInput> getNot() {
        return not;
    }
    public void setNot(org.springframework.graphql.data.ArgumentValue<FilterPointOfInterestInput> not) {
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
        final FilterPointOfInterestInput that = (FilterPointOfInterestInput) obj;
        return Objects.equals(id, that.id)
            && Objects.equals(siteId, that.siteId)
            && Objects.equals(name, that.name)
            && Objects.equals(and, that.and)
            && Objects.equals(or, that.or)
            && Objects.equals(not, that.not);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, siteId, name, and, or, not);
    }


    public static FilterPointOfInterestInput.Builder builder() {
        return new FilterPointOfInterestInput.Builder();
    }

    public static class Builder {

        private org.springframework.graphql.data.ArgumentValue<FilterIDInput> id = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterIDInput> siteId = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterStringInput> name = org.springframework.graphql.data.ArgumentValue.omitted();
        private java.util.List<FilterPointOfInterestInput> and;
        private java.util.List<FilterPointOfInterestInput> or;
        private org.springframework.graphql.data.ArgumentValue<FilterPointOfInterestInput> not = org.springframework.graphql.data.ArgumentValue.omitted();

        public Builder() {
        }

        public Builder setId(org.springframework.graphql.data.ArgumentValue<FilterIDInput> id) {
            this.id = id;
            return this;
        }

        public Builder setSiteId(org.springframework.graphql.data.ArgumentValue<FilterIDInput> siteId) {
            this.siteId = siteId;
            return this;
        }

        public Builder setName(org.springframework.graphql.data.ArgumentValue<FilterStringInput> name) {
            this.name = name;
            return this;
        }

        public Builder setAnd(java.util.List<FilterPointOfInterestInput> and) {
            this.and = and;
            return this;
        }

        public Builder setOr(java.util.List<FilterPointOfInterestInput> or) {
            this.or = or;
            return this;
        }

        public Builder setNot(org.springframework.graphql.data.ArgumentValue<FilterPointOfInterestInput> not) {
            this.not = not;
            return this;
        }


        public FilterPointOfInterestInput build() {
            return new FilterPointOfInterestInput(id, siteId, name, and, or, not);
        }

    }
}
