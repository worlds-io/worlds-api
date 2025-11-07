package io.worlds.api.model;

import java.util.Objects;

/**
 * `FilterGeofenceIntersectionMessageInput` allows for filtering a geofence intersection subscription based on criteria described below.
Only one field should be provided per Filter object unless using an operator (`and` `or` `not`) as specified below.
 */
public class FilterGeofenceIntersectionMessageInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private org.springframework.graphql.data.ArgumentValue<FilterIDInput> geofenceId = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterStringInput> tag = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterIDInput> dataSourceId = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterMessageStateInput> state = org.springframework.graphql.data.ArgumentValue.omitted();
    private java.util.List<FilterGeofenceIntersectionMessageInput> and;
    private java.util.List<FilterGeofenceIntersectionMessageInput> or;
    private org.springframework.graphql.data.ArgumentValue<FilterGeofenceIntersectionMessageInput> not = org.springframework.graphql.data.ArgumentValue.omitted();

    public FilterGeofenceIntersectionMessageInput() {
    }

    public FilterGeofenceIntersectionMessageInput(org.springframework.graphql.data.ArgumentValue<FilterIDInput> geofenceId, org.springframework.graphql.data.ArgumentValue<FilterStringInput> tag, org.springframework.graphql.data.ArgumentValue<FilterIDInput> dataSourceId, org.springframework.graphql.data.ArgumentValue<FilterMessageStateInput> state, java.util.List<FilterGeofenceIntersectionMessageInput> and, java.util.List<FilterGeofenceIntersectionMessageInput> or, org.springframework.graphql.data.ArgumentValue<FilterGeofenceIntersectionMessageInput> not) {
        this.geofenceId = geofenceId;
        this.tag = tag;
        this.dataSourceId = dataSourceId;
        this.state = state;
        this.and = and;
        this.or = or;
        this.not = not;
    }

    public org.springframework.graphql.data.ArgumentValue<FilterIDInput> getGeofenceId() {
        return geofenceId;
    }
    public void setGeofenceId(org.springframework.graphql.data.ArgumentValue<FilterIDInput> geofenceId) {
        this.geofenceId = geofenceId;
    }

    public org.springframework.graphql.data.ArgumentValue<FilterStringInput> getTag() {
        return tag;
    }
    public void setTag(org.springframework.graphql.data.ArgumentValue<FilterStringInput> tag) {
        this.tag = tag;
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

    public java.util.List<FilterGeofenceIntersectionMessageInput> getAnd() {
        return and;
    }
    public void setAnd(java.util.List<FilterGeofenceIntersectionMessageInput> and) {
        this.and = and;
    }

    public java.util.List<FilterGeofenceIntersectionMessageInput> getOr() {
        return or;
    }
    public void setOr(java.util.List<FilterGeofenceIntersectionMessageInput> or) {
        this.or = or;
    }

    public org.springframework.graphql.data.ArgumentValue<FilterGeofenceIntersectionMessageInput> getNot() {
        return not;
    }
    public void setNot(org.springframework.graphql.data.ArgumentValue<FilterGeofenceIntersectionMessageInput> not) {
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
        final FilterGeofenceIntersectionMessageInput that = (FilterGeofenceIntersectionMessageInput) obj;
        return Objects.equals(geofenceId, that.geofenceId)
            && Objects.equals(tag, that.tag)
            && Objects.equals(dataSourceId, that.dataSourceId)
            && Objects.equals(state, that.state)
            && Objects.equals(and, that.and)
            && Objects.equals(or, that.or)
            && Objects.equals(not, that.not);
    }

    @Override
    public int hashCode() {
        return Objects.hash(geofenceId, tag, dataSourceId, state, and, or, not);
    }


    public static FilterGeofenceIntersectionMessageInput.Builder builder() {
        return new FilterGeofenceIntersectionMessageInput.Builder();
    }

    public static class Builder {

        private org.springframework.graphql.data.ArgumentValue<FilterIDInput> geofenceId = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterStringInput> tag = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterIDInput> dataSourceId = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterMessageStateInput> state = org.springframework.graphql.data.ArgumentValue.omitted();
        private java.util.List<FilterGeofenceIntersectionMessageInput> and;
        private java.util.List<FilterGeofenceIntersectionMessageInput> or;
        private org.springframework.graphql.data.ArgumentValue<FilterGeofenceIntersectionMessageInput> not = org.springframework.graphql.data.ArgumentValue.omitted();

        public Builder() {
        }

        public Builder setGeofenceId(org.springframework.graphql.data.ArgumentValue<FilterIDInput> geofenceId) {
            this.geofenceId = geofenceId;
            return this;
        }

        public Builder setTag(org.springframework.graphql.data.ArgumentValue<FilterStringInput> tag) {
            this.tag = tag;
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

        public Builder setAnd(java.util.List<FilterGeofenceIntersectionMessageInput> and) {
            this.and = and;
            return this;
        }

        public Builder setOr(java.util.List<FilterGeofenceIntersectionMessageInput> or) {
            this.or = or;
            return this;
        }

        public Builder setNot(org.springframework.graphql.data.ArgumentValue<FilterGeofenceIntersectionMessageInput> not) {
            this.not = not;
            return this;
        }


        public FilterGeofenceIntersectionMessageInput build() {
            return new FilterGeofenceIntersectionMessageInput(geofenceId, tag, dataSourceId, state, and, or, not);
        }

    }
}
