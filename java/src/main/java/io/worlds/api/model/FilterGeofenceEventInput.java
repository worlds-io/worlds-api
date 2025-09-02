package io.worlds.api.model;


/**
 * `FilterGeofenceEventInput` allows for filtering a geofence event based on criteria described below.
Only one field should be provided per Filter object unless using an operator (`and` `or` `not`) as specified below
 */
public class FilterGeofenceEventInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private org.springframework.graphql.data.ArgumentValue<FilterIDInput> geofenceId = org.springframework.graphql.data.ArgumentValue.omitted();
    @jakarta.validation.constraints.NotNull
    private FilterDateTimeOffsetInput time;
    private java.util.List<FilterGeofenceEventInput> and;
    private java.util.List<FilterGeofenceEventInput> or;
    private org.springframework.graphql.data.ArgumentValue<FilterGeofenceEventInput> not = org.springframework.graphql.data.ArgumentValue.omitted();

    public FilterGeofenceEventInput() {
    }

    public FilterGeofenceEventInput(org.springframework.graphql.data.ArgumentValue<FilterIDInput> geofenceId, FilterDateTimeOffsetInput time, java.util.List<FilterGeofenceEventInput> and, java.util.List<FilterGeofenceEventInput> or, org.springframework.graphql.data.ArgumentValue<FilterGeofenceEventInput> not) {
        this.geofenceId = geofenceId;
        this.time = time;
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

    public FilterDateTimeOffsetInput getTime() {
        return time;
    }
    public void setTime(FilterDateTimeOffsetInput time) {
        this.time = time;
    }

    public java.util.List<FilterGeofenceEventInput> getAnd() {
        return and;
    }
    public void setAnd(java.util.List<FilterGeofenceEventInput> and) {
        this.and = and;
    }

    public java.util.List<FilterGeofenceEventInput> getOr() {
        return or;
    }
    public void setOr(java.util.List<FilterGeofenceEventInput> or) {
        this.or = or;
    }

    public org.springframework.graphql.data.ArgumentValue<FilterGeofenceEventInput> getNot() {
        return not;
    }
    public void setNot(org.springframework.graphql.data.ArgumentValue<FilterGeofenceEventInput> not) {
        this.not = not;
    }



    public static FilterGeofenceEventInput.Builder builder() {
        return new FilterGeofenceEventInput.Builder();
    }

    public static class Builder {

        private org.springframework.graphql.data.ArgumentValue<FilterIDInput> geofenceId = org.springframework.graphql.data.ArgumentValue.omitted();
        private FilterDateTimeOffsetInput time;
        private java.util.List<FilterGeofenceEventInput> and;
        private java.util.List<FilterGeofenceEventInput> or;
        private org.springframework.graphql.data.ArgumentValue<FilterGeofenceEventInput> not = org.springframework.graphql.data.ArgumentValue.omitted();

        public Builder() {
        }

        public Builder setGeofenceId(org.springframework.graphql.data.ArgumentValue<FilterIDInput> geofenceId) {
            this.geofenceId = geofenceId;
            return this;
        }

        public Builder setTime(FilterDateTimeOffsetInput time) {
            this.time = time;
            return this;
        }

        public Builder setAnd(java.util.List<FilterGeofenceEventInput> and) {
            this.and = and;
            return this;
        }

        public Builder setOr(java.util.List<FilterGeofenceEventInput> or) {
            this.or = or;
            return this;
        }

        public Builder setNot(org.springframework.graphql.data.ArgumentValue<FilterGeofenceEventInput> not) {
            this.not = not;
            return this;
        }


        public FilterGeofenceEventInput build() {
            return new FilterGeofenceEventInput(geofenceId, time, and, or, not);
        }

    }
}
