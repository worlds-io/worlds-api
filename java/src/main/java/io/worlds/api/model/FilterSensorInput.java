package io.worlds.api.model;


public class FilterSensorInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private org.springframework.graphql.data.ArgumentValue<FilterIDInput> id = org.springframework.graphql.data.ArgumentValue.omitted();
    @jakarta.validation.constraints.NotNull
    private FilterStringInput name;
    @jakarta.validation.constraints.NotNull
    private FilterStringInput type;
    @jakarta.validation.constraints.NotNull
    private FilterPointInput position;
    private java.util.List<FilterMeasurementInput> and;
    private java.util.List<FilterMeasurementInput> or;
    private org.springframework.graphql.data.ArgumentValue<FilterMeasurementInput> not = org.springframework.graphql.data.ArgumentValue.omitted();

    public FilterSensorInput() {
    }

    public FilterSensorInput(org.springframework.graphql.data.ArgumentValue<FilterIDInput> id, FilterStringInput name, FilterStringInput type, FilterPointInput position, java.util.List<FilterMeasurementInput> and, java.util.List<FilterMeasurementInput> or, org.springframework.graphql.data.ArgumentValue<FilterMeasurementInput> not) {
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

    public FilterStringInput getName() {
        return name;
    }
    public void setName(FilterStringInput name) {
        this.name = name;
    }

    public FilterStringInput getType() {
        return type;
    }
    public void setType(FilterStringInput type) {
        this.type = type;
    }

    public FilterPointInput getPosition() {
        return position;
    }
    public void setPosition(FilterPointInput position) {
        this.position = position;
    }

    public java.util.List<FilterMeasurementInput> getAnd() {
        return and;
    }
    public void setAnd(java.util.List<FilterMeasurementInput> and) {
        this.and = and;
    }

    public java.util.List<FilterMeasurementInput> getOr() {
        return or;
    }
    public void setOr(java.util.List<FilterMeasurementInput> or) {
        this.or = or;
    }

    public org.springframework.graphql.data.ArgumentValue<FilterMeasurementInput> getNot() {
        return not;
    }
    public void setNot(org.springframework.graphql.data.ArgumentValue<FilterMeasurementInput> not) {
        this.not = not;
    }



    public static FilterSensorInput.Builder builder() {
        return new FilterSensorInput.Builder();
    }

    public static class Builder {

        private org.springframework.graphql.data.ArgumentValue<FilterIDInput> id = org.springframework.graphql.data.ArgumentValue.omitted();
        private FilterStringInput name;
        private FilterStringInput type;
        private FilterPointInput position;
        private java.util.List<FilterMeasurementInput> and;
        private java.util.List<FilterMeasurementInput> or;
        private org.springframework.graphql.data.ArgumentValue<FilterMeasurementInput> not = org.springframework.graphql.data.ArgumentValue.omitted();

        public Builder() {
        }

        public Builder setId(org.springframework.graphql.data.ArgumentValue<FilterIDInput> id) {
            this.id = id;
            return this;
        }

        public Builder setName(FilterStringInput name) {
            this.name = name;
            return this;
        }

        public Builder setType(FilterStringInput type) {
            this.type = type;
            return this;
        }

        public Builder setPosition(FilterPointInput position) {
            this.position = position;
            return this;
        }

        public Builder setAnd(java.util.List<FilterMeasurementInput> and) {
            this.and = and;
            return this;
        }

        public Builder setOr(java.util.List<FilterMeasurementInput> or) {
            this.or = or;
            return this;
        }

        public Builder setNot(org.springframework.graphql.data.ArgumentValue<FilterMeasurementInput> not) {
            this.not = not;
            return this;
        }


        public FilterSensorInput build() {
            return new FilterSensorInput(id, name, type, position, and, or, not);
        }

    }
}
