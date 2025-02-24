package io.worlds.api.model;


public class FilterMeasurementActivityInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private org.springframework.graphql.data.ArgumentValue<FilterIDInput> sensorId = org.springframework.graphql.data.ArgumentValue.omitted();
    private java.util.List<FilterMeasurementActivityInput> and;
    private java.util.List<FilterMeasurementActivityInput> or;
    private org.springframework.graphql.data.ArgumentValue<FilterMeasurementActivityInput> not = org.springframework.graphql.data.ArgumentValue.omitted();

    public FilterMeasurementActivityInput() {
    }

    public FilterMeasurementActivityInput(org.springframework.graphql.data.ArgumentValue<FilterIDInput> sensorId, java.util.List<FilterMeasurementActivityInput> and, java.util.List<FilterMeasurementActivityInput> or, org.springframework.graphql.data.ArgumentValue<FilterMeasurementActivityInput> not) {
        this.sensorId = sensorId;
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

    public java.util.List<FilterMeasurementActivityInput> getAnd() {
        return and;
    }
    public void setAnd(java.util.List<FilterMeasurementActivityInput> and) {
        this.and = and;
    }

    public java.util.List<FilterMeasurementActivityInput> getOr() {
        return or;
    }
    public void setOr(java.util.List<FilterMeasurementActivityInput> or) {
        this.or = or;
    }

    public org.springframework.graphql.data.ArgumentValue<FilterMeasurementActivityInput> getNot() {
        return not;
    }
    public void setNot(org.springframework.graphql.data.ArgumentValue<FilterMeasurementActivityInput> not) {
        this.not = not;
    }



    public static FilterMeasurementActivityInput.Builder builder() {
        return new FilterMeasurementActivityInput.Builder();
    }

    public static class Builder {

        private org.springframework.graphql.data.ArgumentValue<FilterIDInput> sensorId = org.springframework.graphql.data.ArgumentValue.omitted();
        private java.util.List<FilterMeasurementActivityInput> and;
        private java.util.List<FilterMeasurementActivityInput> or;
        private org.springframework.graphql.data.ArgumentValue<FilterMeasurementActivityInput> not = org.springframework.graphql.data.ArgumentValue.omitted();

        public Builder() {
        }

        public Builder setSensorId(org.springframework.graphql.data.ArgumentValue<FilterIDInput> sensorId) {
            this.sensorId = sensorId;
            return this;
        }

        public Builder setAnd(java.util.List<FilterMeasurementActivityInput> and) {
            this.and = and;
            return this;
        }

        public Builder setOr(java.util.List<FilterMeasurementActivityInput> or) {
            this.or = or;
            return this;
        }

        public Builder setNot(org.springframework.graphql.data.ArgumentValue<FilterMeasurementActivityInput> not) {
            this.not = not;
            return this;
        }


        public FilterMeasurementActivityInput build() {
            return new FilterMeasurementActivityInput(sensorId, and, or, not);
        }

    }
}
