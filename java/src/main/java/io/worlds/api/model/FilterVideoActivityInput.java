package io.worlds.api.model;


/**
 * FilterEventActivityInput filters [events]({{Types.event}}) based on criteria described below.
Only one field should be provided per Filter object unless using an operator (`and` `or` `not`) as specified below.
 */
public class FilterVideoActivityInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private org.springframework.graphql.data.ArgumentValue<FilterIDInput> dataSourceId = org.springframework.graphql.data.ArgumentValue.omitted();
    private java.util.List<FilterVideoActivityInput> and;
    private java.util.List<FilterVideoActivityInput> or;
    private org.springframework.graphql.data.ArgumentValue<FilterVideoActivityInput> not = org.springframework.graphql.data.ArgumentValue.omitted();

    public FilterVideoActivityInput() {
    }

    public FilterVideoActivityInput(org.springframework.graphql.data.ArgumentValue<FilterIDInput> dataSourceId, java.util.List<FilterVideoActivityInput> and, java.util.List<FilterVideoActivityInput> or, org.springframework.graphql.data.ArgumentValue<FilterVideoActivityInput> not) {
        this.dataSourceId = dataSourceId;
        this.and = and;
        this.or = or;
        this.not = not;
    }

    public org.springframework.graphql.data.ArgumentValue<FilterIDInput> getDataSourceId() {
        return dataSourceId;
    }
    public void setDataSourceId(org.springframework.graphql.data.ArgumentValue<FilterIDInput> dataSourceId) {
        this.dataSourceId = dataSourceId;
    }

    public java.util.List<FilterVideoActivityInput> getAnd() {
        return and;
    }
    public void setAnd(java.util.List<FilterVideoActivityInput> and) {
        this.and = and;
    }

    public java.util.List<FilterVideoActivityInput> getOr() {
        return or;
    }
    public void setOr(java.util.List<FilterVideoActivityInput> or) {
        this.or = or;
    }

    public org.springframework.graphql.data.ArgumentValue<FilterVideoActivityInput> getNot() {
        return not;
    }
    public void setNot(org.springframework.graphql.data.ArgumentValue<FilterVideoActivityInput> not) {
        this.not = not;
    }



    public static FilterVideoActivityInput.Builder builder() {
        return new FilterVideoActivityInput.Builder();
    }

    public static class Builder {

        private org.springframework.graphql.data.ArgumentValue<FilterIDInput> dataSourceId = org.springframework.graphql.data.ArgumentValue.omitted();
        private java.util.List<FilterVideoActivityInput> and;
        private java.util.List<FilterVideoActivityInput> or;
        private org.springframework.graphql.data.ArgumentValue<FilterVideoActivityInput> not = org.springframework.graphql.data.ArgumentValue.omitted();

        public Builder() {
        }

        public Builder setDataSourceId(org.springframework.graphql.data.ArgumentValue<FilterIDInput> dataSourceId) {
            this.dataSourceId = dataSourceId;
            return this;
        }

        public Builder setAnd(java.util.List<FilterVideoActivityInput> and) {
            this.and = and;
            return this;
        }

        public Builder setOr(java.util.List<FilterVideoActivityInput> or) {
            this.or = or;
            return this;
        }

        public Builder setNot(org.springframework.graphql.data.ArgumentValue<FilterVideoActivityInput> not) {
            this.not = not;
            return this;
        }


        public FilterVideoActivityInput build() {
            return new FilterVideoActivityInput(dataSourceId, and, or, not);
        }

    }
}
