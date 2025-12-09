package io.worlds.api.model;

import java.util.Objects;

/**
 * FilterImageInput allows for filtering images based on criteria described below.
Only one field should be provided per Filter object unless using an operator (`and` `or` `not`) as specified below
 */
public class FilterImageInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private org.springframework.graphql.data.ArgumentValue<FilterIDInput> id = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterIDInput> dataSourceId = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterDateTimeOffsetInput> timestamp = org.springframework.graphql.data.ArgumentValue.omitted();
    private java.util.List<FilterImageInput> and;
    private java.util.List<FilterImageInput> or;
    private org.springframework.graphql.data.ArgumentValue<FilterImageInput> not = org.springframework.graphql.data.ArgumentValue.omitted();

    public FilterImageInput() {
    }

    public FilterImageInput(org.springframework.graphql.data.ArgumentValue<FilterIDInput> id, org.springframework.graphql.data.ArgumentValue<FilterIDInput> dataSourceId, org.springframework.graphql.data.ArgumentValue<FilterDateTimeOffsetInput> timestamp, java.util.List<FilterImageInput> and, java.util.List<FilterImageInput> or, org.springframework.graphql.data.ArgumentValue<FilterImageInput> not) {
        this.id = id;
        this.dataSourceId = dataSourceId;
        this.timestamp = timestamp;
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

    public org.springframework.graphql.data.ArgumentValue<FilterDateTimeOffsetInput> getTimestamp() {
        return timestamp;
    }
    public void setTimestamp(org.springframework.graphql.data.ArgumentValue<FilterDateTimeOffsetInput> timestamp) {
        this.timestamp = timestamp;
    }

    public java.util.List<FilterImageInput> getAnd() {
        return and;
    }
    public void setAnd(java.util.List<FilterImageInput> and) {
        this.and = and;
    }

    public java.util.List<FilterImageInput> getOr() {
        return or;
    }
    public void setOr(java.util.List<FilterImageInput> or) {
        this.or = or;
    }

    public org.springframework.graphql.data.ArgumentValue<FilterImageInput> getNot() {
        return not;
    }
    public void setNot(org.springframework.graphql.data.ArgumentValue<FilterImageInput> not) {
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
        final FilterImageInput that = (FilterImageInput) obj;
        return Objects.equals(id, that.id)
            && Objects.equals(dataSourceId, that.dataSourceId)
            && Objects.equals(timestamp, that.timestamp)
            && Objects.equals(and, that.and)
            && Objects.equals(or, that.or)
            && Objects.equals(not, that.not);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, dataSourceId, timestamp, and, or, not);
    }


    public static FilterImageInput.Builder builder() {
        return new FilterImageInput.Builder();
    }

    public static class Builder {

        private org.springframework.graphql.data.ArgumentValue<FilterIDInput> id = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterIDInput> dataSourceId = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterDateTimeOffsetInput> timestamp = org.springframework.graphql.data.ArgumentValue.omitted();
        private java.util.List<FilterImageInput> and;
        private java.util.List<FilterImageInput> or;
        private org.springframework.graphql.data.ArgumentValue<FilterImageInput> not = org.springframework.graphql.data.ArgumentValue.omitted();

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

        public Builder setTimestamp(org.springframework.graphql.data.ArgumentValue<FilterDateTimeOffsetInput> timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        public Builder setAnd(java.util.List<FilterImageInput> and) {
            this.and = and;
            return this;
        }

        public Builder setOr(java.util.List<FilterImageInput> or) {
            this.or = or;
            return this;
        }

        public Builder setNot(org.springframework.graphql.data.ArgumentValue<FilterImageInput> not) {
            this.not = not;
            return this;
        }


        public FilterImageInput build() {
            return new FilterImageInput(id, dataSourceId, timestamp, and, or, not);
        }

    }
}
