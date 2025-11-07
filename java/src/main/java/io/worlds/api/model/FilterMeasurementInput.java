package io.worlds.api.model;

import java.util.Objects;

/**
 * `FilterMeasurementInput` allows for filtering measurement of a sensor on criteria described below.
Only one field should be provided per Filter object unless using an operator (`and` `or` `not`) as specified below
 */
public class FilterMeasurementInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private org.springframework.graphql.data.ArgumentValue<FilterIDInput> sensorId = org.springframework.graphql.data.ArgumentValue.omitted();
    @jakarta.validation.constraints.NotNull
    private FilterDateTimeOffsetInput time;
    private java.util.List<FilterMeasurementInput> and;
    private java.util.List<FilterMeasurementInput> or;
    private org.springframework.graphql.data.ArgumentValue<FilterMeasurementInput> not = org.springframework.graphql.data.ArgumentValue.omitted();

    public FilterMeasurementInput() {
    }

    public FilterMeasurementInput(org.springframework.graphql.data.ArgumentValue<FilterIDInput> sensorId, FilterDateTimeOffsetInput time, java.util.List<FilterMeasurementInput> and, java.util.List<FilterMeasurementInput> or, org.springframework.graphql.data.ArgumentValue<FilterMeasurementInput> not) {
        this.sensorId = sensorId;
        this.time = time;
        this.and = and;
        this.or = or;
        this.not = not;
    }

    public org.springframework.graphql.data.ArgumentValue<FilterIDInput> getSensorId() {
        return sensorId;
    }
    public void setSensorId(org.springframework.graphql.data.ArgumentValue<FilterIDInput> sensorId) {
        this.sensorId = sensorId;
    }

    public FilterDateTimeOffsetInput getTime() {
        return time;
    }
    public void setTime(FilterDateTimeOffsetInput time) {
        this.time = time;
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

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final FilterMeasurementInput that = (FilterMeasurementInput) obj;
        return Objects.equals(sensorId, that.sensorId)
            && Objects.equals(time, that.time)
            && Objects.equals(and, that.and)
            && Objects.equals(or, that.or)
            && Objects.equals(not, that.not);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sensorId, time, and, or, not);
    }


    public static FilterMeasurementInput.Builder builder() {
        return new FilterMeasurementInput.Builder();
    }

    public static class Builder {

        private org.springframework.graphql.data.ArgumentValue<FilterIDInput> sensorId = org.springframework.graphql.data.ArgumentValue.omitted();
        private FilterDateTimeOffsetInput time;
        private java.util.List<FilterMeasurementInput> and;
        private java.util.List<FilterMeasurementInput> or;
        private org.springframework.graphql.data.ArgumentValue<FilterMeasurementInput> not = org.springframework.graphql.data.ArgumentValue.omitted();

        public Builder() {
        }

        public Builder setSensorId(org.springframework.graphql.data.ArgumentValue<FilterIDInput> sensorId) {
            this.sensorId = sensorId;
            return this;
        }

        public Builder setTime(FilterDateTimeOffsetInput time) {
            this.time = time;
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


        public FilterMeasurementInput build() {
            return new FilterMeasurementInput(sensorId, time, and, or, not);
        }

    }
}
