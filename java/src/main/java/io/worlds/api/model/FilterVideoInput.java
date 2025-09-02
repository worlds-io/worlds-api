package io.worlds.api.model;


/**
 * FilterVideoInput filters [videos]({{Types.video}}) based on criteria described below.
Only one field should be provided per Filter object unless using an operator (`and` `or` `not`) as specified below.
 */
public class FilterVideoInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private org.springframework.graphql.data.ArgumentValue<FilterIDInput> id = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterIDInput> dataSourceId = org.springframework.graphql.data.ArgumentValue.omitted();
    @jakarta.validation.constraints.NotNull
    private FilterDateTimeOffsetInput startTime;
    private org.springframework.graphql.data.ArgumentValue<FilterDateTimeOffsetInput> endTime = org.springframework.graphql.data.ArgumentValue.omitted();
    private java.util.List<FilterVideoInput> and;
    private java.util.List<FilterVideoInput> or;
    private org.springframework.graphql.data.ArgumentValue<FilterVideoInput> not = org.springframework.graphql.data.ArgumentValue.omitted();

    public FilterVideoInput() {
    }

    public FilterVideoInput(org.springframework.graphql.data.ArgumentValue<FilterIDInput> id, org.springframework.graphql.data.ArgumentValue<FilterIDInput> dataSourceId, FilterDateTimeOffsetInput startTime, org.springframework.graphql.data.ArgumentValue<FilterDateTimeOffsetInput> endTime, java.util.List<FilterVideoInput> and, java.util.List<FilterVideoInput> or, org.springframework.graphql.data.ArgumentValue<FilterVideoInput> not) {
        this.id = id;
        this.dataSourceId = dataSourceId;
        this.startTime = startTime;
        this.endTime = endTime;
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

    public org.springframework.graphql.data.ArgumentValue<FilterIDInput> getDataSourceId() {
        return dataSourceId;
    }
    public void setDataSourceId(org.springframework.graphql.data.ArgumentValue<FilterIDInput> dataSourceId) {
        this.dataSourceId = dataSourceId;
    }

    public FilterDateTimeOffsetInput getStartTime() {
        return startTime;
    }
    public void setStartTime(FilterDateTimeOffsetInput startTime) {
        this.startTime = startTime;
    }

    public org.springframework.graphql.data.ArgumentValue<FilterDateTimeOffsetInput> getEndTime() {
        return endTime;
    }
    public void setEndTime(org.springframework.graphql.data.ArgumentValue<FilterDateTimeOffsetInput> endTime) {
        this.endTime = endTime;
    }

    public java.util.List<FilterVideoInput> getAnd() {
        return and;
    }
    public void setAnd(java.util.List<FilterVideoInput> and) {
        this.and = and;
    }

    public java.util.List<FilterVideoInput> getOr() {
        return or;
    }
    public void setOr(java.util.List<FilterVideoInput> or) {
        this.or = or;
    }

    public org.springframework.graphql.data.ArgumentValue<FilterVideoInput> getNot() {
        return not;
    }
    public void setNot(org.springframework.graphql.data.ArgumentValue<FilterVideoInput> not) {
        this.not = not;
    }



    public static FilterVideoInput.Builder builder() {
        return new FilterVideoInput.Builder();
    }

    public static class Builder {

        private org.springframework.graphql.data.ArgumentValue<FilterIDInput> id = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterIDInput> dataSourceId = org.springframework.graphql.data.ArgumentValue.omitted();
        private FilterDateTimeOffsetInput startTime;
        private org.springframework.graphql.data.ArgumentValue<FilterDateTimeOffsetInput> endTime = org.springframework.graphql.data.ArgumentValue.omitted();
        private java.util.List<FilterVideoInput> and;
        private java.util.List<FilterVideoInput> or;
        private org.springframework.graphql.data.ArgumentValue<FilterVideoInput> not = org.springframework.graphql.data.ArgumentValue.omitted();

        public Builder() {
        }

        public Builder setId(org.springframework.graphql.data.ArgumentValue<FilterIDInput> id) {
            this.id = id;
            return this;
        }

        public Builder setDataSourceId(org.springframework.graphql.data.ArgumentValue<FilterIDInput> dataSourceId) {
            this.dataSourceId = dataSourceId;
            return this;
        }

        public Builder setStartTime(FilterDateTimeOffsetInput startTime) {
            this.startTime = startTime;
            return this;
        }

        public Builder setEndTime(org.springframework.graphql.data.ArgumentValue<FilterDateTimeOffsetInput> endTime) {
            this.endTime = endTime;
            return this;
        }

        public Builder setAnd(java.util.List<FilterVideoInput> and) {
            this.and = and;
            return this;
        }

        public Builder setOr(java.util.List<FilterVideoInput> or) {
            this.or = or;
            return this;
        }

        public Builder setNot(org.springframework.graphql.data.ArgumentValue<FilterVideoInput> not) {
            this.not = not;
            return this;
        }


        public FilterVideoInput build() {
            return new FilterVideoInput(id, dataSourceId, startTime, endTime, and, or, not);
        }

    }
}
