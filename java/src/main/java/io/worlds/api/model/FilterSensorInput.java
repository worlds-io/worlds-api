package io.worlds.api.model;

import java.util.Objects;

/**
 * FilterSensorInput filters [sensors]({{Types.Sensor}}) based on criteria described below.
Only one field should be provided per Filter object unless using an operator (`and` `or` `not`) as specified below.
 */
public class FilterSensorInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private org.springframework.graphql.data.ArgumentValue<FilterIDInput> id = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterStringInput> name = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterStringInput> type = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterPointInput> position = org.springframework.graphql.data.ArgumentValue.omitted();
    private java.util.List<FilterSensorInput> and;
    private java.util.List<FilterSensorInput> or;
    private org.springframework.graphql.data.ArgumentValue<FilterSensorInput> not = org.springframework.graphql.data.ArgumentValue.omitted();

    public FilterSensorInput() {
    }

    public FilterSensorInput(org.springframework.graphql.data.ArgumentValue<FilterIDInput> id, org.springframework.graphql.data.ArgumentValue<FilterStringInput> name, org.springframework.graphql.data.ArgumentValue<FilterStringInput> type, org.springframework.graphql.data.ArgumentValue<FilterPointInput> position, java.util.List<FilterSensorInput> and, java.util.List<FilterSensorInput> or, org.springframework.graphql.data.ArgumentValue<FilterSensorInput> not) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.position = position;
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

    public org.springframework.graphql.data.ArgumentValue<FilterStringInput> getType() {
        return type;
    }
    public void setType(org.springframework.graphql.data.ArgumentValue<FilterStringInput> type) {
        this.type = type;
    }

    public org.springframework.graphql.data.ArgumentValue<FilterPointInput> getPosition() {
        return position;
    }
    public void setPosition(org.springframework.graphql.data.ArgumentValue<FilterPointInput> position) {
        this.position = position;
    }

    public java.util.List<FilterSensorInput> getAnd() {
        return and;
    }
    public void setAnd(java.util.List<FilterSensorInput> and) {
        this.and = and;
    }

    public java.util.List<FilterSensorInput> getOr() {
        return or;
    }
    public void setOr(java.util.List<FilterSensorInput> or) {
        this.or = or;
    }

    public org.springframework.graphql.data.ArgumentValue<FilterSensorInput> getNot() {
        return not;
    }
    public void setNot(org.springframework.graphql.data.ArgumentValue<FilterSensorInput> not) {
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
        final FilterSensorInput that = (FilterSensorInput) obj;
        return Objects.equals(id, that.id)
            && Objects.equals(name, that.name)
            && Objects.equals(type, that.type)
            && Objects.equals(position, that.position)
            && Objects.equals(and, that.and)
            && Objects.equals(or, that.or)
            && Objects.equals(not, that.not);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, type, position, and, or, not);
    }


    public static FilterSensorInput.Builder builder() {
        return new FilterSensorInput.Builder();
    }

    public static class Builder {

        private org.springframework.graphql.data.ArgumentValue<FilterIDInput> id = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterStringInput> name = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterStringInput> type = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterPointInput> position = org.springframework.graphql.data.ArgumentValue.omitted();
        private java.util.List<FilterSensorInput> and;
        private java.util.List<FilterSensorInput> or;
        private org.springframework.graphql.data.ArgumentValue<FilterSensorInput> not = org.springframework.graphql.data.ArgumentValue.omitted();

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

        public Builder setType(org.springframework.graphql.data.ArgumentValue<FilterStringInput> type) {
            this.type = type;
            return this;
        }

        public Builder setPosition(org.springframework.graphql.data.ArgumentValue<FilterPointInput> position) {
            this.position = position;
            return this;
        }

        public Builder setAnd(java.util.List<FilterSensorInput> and) {
            this.and = and;
            return this;
        }

        public Builder setOr(java.util.List<FilterSensorInput> or) {
            this.or = or;
            return this;
        }

        public Builder setNot(org.springframework.graphql.data.ArgumentValue<FilterSensorInput> not) {
            this.not = not;
            return this;
        }


        public FilterSensorInput build() {
            return new FilterSensorInput(id, name, type, position, and, or, not);
        }

    }
}
