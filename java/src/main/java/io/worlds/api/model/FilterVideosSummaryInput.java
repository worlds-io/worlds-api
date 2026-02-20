package io.worlds.api.model;

import java.util.Objects;

/**
 * FilterVideosSummaryInput filters summarized by a `videosSummary` based on criteria described below.
Only one field should be provided per Filter object unless using an operator (`and` `or` `not`) as specified below.
 */
public class FilterVideosSummaryInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private org.springframework.graphql.data.ArgumentValue<FilterIDInput> dataSourceId = org.springframework.graphql.data.ArgumentValue.omitted();
    private java.util.List<FilterVideoInput> and;
    private java.util.List<FilterVideoInput> or;
    private org.springframework.graphql.data.ArgumentValue<FilterVideoInput> not = org.springframework.graphql.data.ArgumentValue.omitted();

    public FilterVideosSummaryInput() {
    }

    public FilterVideosSummaryInput(org.springframework.graphql.data.ArgumentValue<FilterIDInput> dataSourceId, java.util.List<FilterVideoInput> and, java.util.List<FilterVideoInput> or, org.springframework.graphql.data.ArgumentValue<FilterVideoInput> not) {
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

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final FilterVideosSummaryInput that = (FilterVideosSummaryInput) obj;
        return Objects.equals(dataSourceId, that.dataSourceId)
            && Objects.equals(and, that.and)
            && Objects.equals(or, that.or)
            && Objects.equals(not, that.not);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dataSourceId, and, or, not);
    }


    public static FilterVideosSummaryInput.Builder builder() {
        return new FilterVideosSummaryInput.Builder();
    }

    public static class Builder {

        private org.springframework.graphql.data.ArgumentValue<FilterIDInput> dataSourceId = org.springframework.graphql.data.ArgumentValue.omitted();
        private java.util.List<FilterVideoInput> and;
        private java.util.List<FilterVideoInput> or;
        private org.springframework.graphql.data.ArgumentValue<FilterVideoInput> not = org.springframework.graphql.data.ArgumentValue.omitted();

        public Builder() {
        }

        public Builder setDataSourceId(org.springframework.graphql.data.ArgumentValue<FilterIDInput> dataSourceId) {
            this.dataSourceId = dataSourceId;
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


        public FilterVideosSummaryInput build() {
            return new FilterVideosSummaryInput(dataSourceId, and, or, not);
        }

    }
}
