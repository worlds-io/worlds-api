package io.worlds.api.model;

import java.util.Objects;

/**
 * FilterChronicleProducerInput filters [ChronicleProducer]({{Types.ChronicleProducer}}) based on criteria described below.
Only one field should be provided per Filter object unless using an operator (`and` `or` `not`) as specified below.
 */
public class FilterChronicleProducerInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private org.springframework.graphql.data.ArgumentValue<FilterIDInput> id = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterStringInput> name = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterBooleanInput> active = org.springframework.graphql.data.ArgumentValue.omitted();
    private java.util.List<FilterChronicleProducerInput> and;
    private java.util.List<FilterChronicleProducerInput> or;
    private org.springframework.graphql.data.ArgumentValue<FilterChronicleProducerInput> not = org.springframework.graphql.data.ArgumentValue.omitted();

    public FilterChronicleProducerInput() {
    }

    public FilterChronicleProducerInput(org.springframework.graphql.data.ArgumentValue<FilterIDInput> id, org.springframework.graphql.data.ArgumentValue<FilterStringInput> name, org.springframework.graphql.data.ArgumentValue<FilterBooleanInput> active, java.util.List<FilterChronicleProducerInput> and, java.util.List<FilterChronicleProducerInput> or, org.springframework.graphql.data.ArgumentValue<FilterChronicleProducerInput> not) {
        this.id = id;
        this.name = name;
        this.active = active;
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

    public org.springframework.graphql.data.ArgumentValue<FilterBooleanInput> getActive() {
        return active;
    }
    public void setActive(org.springframework.graphql.data.ArgumentValue<FilterBooleanInput> active) {
        this.active = active;
    }

    public java.util.List<FilterChronicleProducerInput> getAnd() {
        return and;
    }
    public void setAnd(java.util.List<FilterChronicleProducerInput> and) {
        this.and = and;
    }

    public java.util.List<FilterChronicleProducerInput> getOr() {
        return or;
    }
    public void setOr(java.util.List<FilterChronicleProducerInput> or) {
        this.or = or;
    }

    public org.springframework.graphql.data.ArgumentValue<FilterChronicleProducerInput> getNot() {
        return not;
    }
    public void setNot(org.springframework.graphql.data.ArgumentValue<FilterChronicleProducerInput> not) {
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
        final FilterChronicleProducerInput that = (FilterChronicleProducerInput) obj;
        return Objects.equals(id, that.id)
            && Objects.equals(name, that.name)
            && Objects.equals(active, that.active)
            && Objects.equals(and, that.and)
            && Objects.equals(or, that.or)
            && Objects.equals(not, that.not);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, active, and, or, not);
    }


    public static FilterChronicleProducerInput.Builder builder() {
        return new FilterChronicleProducerInput.Builder();
    }

    public static class Builder {

        private org.springframework.graphql.data.ArgumentValue<FilterIDInput> id = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterStringInput> name = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterBooleanInput> active = org.springframework.graphql.data.ArgumentValue.omitted();
        private java.util.List<FilterChronicleProducerInput> and;
        private java.util.List<FilterChronicleProducerInput> or;
        private org.springframework.graphql.data.ArgumentValue<FilterChronicleProducerInput> not = org.springframework.graphql.data.ArgumentValue.omitted();

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

        public Builder setActive(org.springframework.graphql.data.ArgumentValue<FilterBooleanInput> active) {
            this.active = active;
            return this;
        }

        public Builder setAnd(java.util.List<FilterChronicleProducerInput> and) {
            this.and = and;
            return this;
        }

        public Builder setOr(java.util.List<FilterChronicleProducerInput> or) {
            this.or = or;
            return this;
        }

        public Builder setNot(org.springframework.graphql.data.ArgumentValue<FilterChronicleProducerInput> not) {
            this.not = not;
            return this;
        }


        public FilterChronicleProducerInput build() {
            return new FilterChronicleProducerInput(id, name, active, and, or, not);
        }

    }
}
