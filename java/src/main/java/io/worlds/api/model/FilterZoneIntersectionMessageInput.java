package io.worlds.api.model;

import java.util.Objects;

/**
 * `FilterZoneIntersectionMessageInput` allows for filtering a zone intersection subscription based on criteria described below.
Only one field should be provided per Filter object unless using an operator (`and` `or` `not`) as specified below.
 */
public class FilterZoneIntersectionMessageInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private org.springframework.graphql.data.ArgumentValue<FilterIDInput> zoneId = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterIDInput> dataSourceId = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterMessageStateInput> state = org.springframework.graphql.data.ArgumentValue.omitted();
    private java.util.List<FilterZoneIntersectionMessageInput> and;
    private java.util.List<FilterZoneIntersectionMessageInput> or;
    private org.springframework.graphql.data.ArgumentValue<FilterZoneIntersectionMessageInput> not = org.springframework.graphql.data.ArgumentValue.omitted();

    public FilterZoneIntersectionMessageInput() {
    }

    public FilterZoneIntersectionMessageInput(org.springframework.graphql.data.ArgumentValue<FilterIDInput> zoneId, org.springframework.graphql.data.ArgumentValue<FilterIDInput> dataSourceId, org.springframework.graphql.data.ArgumentValue<FilterMessageStateInput> state, java.util.List<FilterZoneIntersectionMessageInput> and, java.util.List<FilterZoneIntersectionMessageInput> or, org.springframework.graphql.data.ArgumentValue<FilterZoneIntersectionMessageInput> not) {
        this.zoneId = zoneId;
        this.dataSourceId = dataSourceId;
        this.state = state;
        this.and = and;
        this.or = or;
        this.not = not;
    }

    public org.springframework.graphql.data.ArgumentValue<FilterIDInput> getZoneId() {
        return zoneId;
    }
    public void setZoneId(org.springframework.graphql.data.ArgumentValue<FilterIDInput> zoneId) {
        this.zoneId = zoneId;
    }

    public org.springframework.graphql.data.ArgumentValue<FilterIDInput> getDataSourceId() {
        return dataSourceId;
    }
    public void setDataSourceId(org.springframework.graphql.data.ArgumentValue<FilterIDInput> dataSourceId) {
        this.dataSourceId = dataSourceId;
    }

    public org.springframework.graphql.data.ArgumentValue<FilterMessageStateInput> getState() {
        return state;
    }
    public void setState(org.springframework.graphql.data.ArgumentValue<FilterMessageStateInput> state) {
        this.state = state;
    }

    public java.util.List<FilterZoneIntersectionMessageInput> getAnd() {
        return and;
    }
    public void setAnd(java.util.List<FilterZoneIntersectionMessageInput> and) {
        this.and = and;
    }

    public java.util.List<FilterZoneIntersectionMessageInput> getOr() {
        return or;
    }
    public void setOr(java.util.List<FilterZoneIntersectionMessageInput> or) {
        this.or = or;
    }

    public org.springframework.graphql.data.ArgumentValue<FilterZoneIntersectionMessageInput> getNot() {
        return not;
    }
    public void setNot(org.springframework.graphql.data.ArgumentValue<FilterZoneIntersectionMessageInput> not) {
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
        final FilterZoneIntersectionMessageInput that = (FilterZoneIntersectionMessageInput) obj;
        return Objects.equals(zoneId, that.zoneId)
            && Objects.equals(dataSourceId, that.dataSourceId)
            && Objects.equals(state, that.state)
            && Objects.equals(and, that.and)
            && Objects.equals(or, that.or)
            && Objects.equals(not, that.not);
    }

    @Override
    public int hashCode() {
        return Objects.hash(zoneId, dataSourceId, state, and, or, not);
    }


    public static FilterZoneIntersectionMessageInput.Builder builder() {
        return new FilterZoneIntersectionMessageInput.Builder();
    }

    public static class Builder {

        private org.springframework.graphql.data.ArgumentValue<FilterIDInput> zoneId = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterIDInput> dataSourceId = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterMessageStateInput> state = org.springframework.graphql.data.ArgumentValue.omitted();
        private java.util.List<FilterZoneIntersectionMessageInput> and;
        private java.util.List<FilterZoneIntersectionMessageInput> or;
        private org.springframework.graphql.data.ArgumentValue<FilterZoneIntersectionMessageInput> not = org.springframework.graphql.data.ArgumentValue.omitted();

        public Builder() {
        }

        public Builder setZoneId(org.springframework.graphql.data.ArgumentValue<FilterIDInput> zoneId) {
            this.zoneId = zoneId;
            return this;
        }

        public Builder setDataSourceId(org.springframework.graphql.data.ArgumentValue<FilterIDInput> dataSourceId) {
            this.dataSourceId = dataSourceId;
            return this;
        }

        public Builder setState(org.springframework.graphql.data.ArgumentValue<FilterMessageStateInput> state) {
            this.state = state;
            return this;
        }

        public Builder setAnd(java.util.List<FilterZoneIntersectionMessageInput> and) {
            this.and = and;
            return this;
        }

        public Builder setOr(java.util.List<FilterZoneIntersectionMessageInput> or) {
            this.or = or;
            return this;
        }

        public Builder setNot(org.springframework.graphql.data.ArgumentValue<FilterZoneIntersectionMessageInput> not) {
            this.not = not;
            return this;
        }


        public FilterZoneIntersectionMessageInput build() {
            return new FilterZoneIntersectionMessageInput(zoneId, dataSourceId, state, and, or, not);
        }

    }
}
