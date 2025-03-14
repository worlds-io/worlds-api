package io.worlds.api.model;


public class FilterGeofenceIntersectionQueryInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private org.springframework.graphql.data.ArgumentValue<FilterIDInput> geofenceId = org.springframework.graphql.data.ArgumentValue.omitted();
    @jakarta.validation.constraints.NotNull
    private FilterDateTimeOffsetInput time;
    private java.util.List<FilterGeofenceIntersectionQueryInput> and;
    private java.util.List<FilterGeofenceIntersectionQueryInput> or;
    private org.springframework.graphql.data.ArgumentValue<FilterGeofenceIntersectionQueryInput> not = org.springframework.graphql.data.ArgumentValue.omitted();

    public FilterGeofenceIntersectionQueryInput() {
    }

    public FilterGeofenceIntersectionQueryInput(org.springframework.graphql.data.ArgumentValue<FilterIDInput> geofenceId, FilterDateTimeOffsetInput time, java.util.List<FilterGeofenceIntersectionQueryInput> and, java.util.List<FilterGeofenceIntersectionQueryInput> or, org.springframework.graphql.data.ArgumentValue<FilterGeofenceIntersectionQueryInput> not) {
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

    public java.util.List<FilterGeofenceIntersectionQueryInput> getAnd() {
        return and;
    }
    public void setAnd(java.util.List<FilterGeofenceIntersectionQueryInput> and) {
        this.and = and;
    }

    public java.util.List<FilterGeofenceIntersectionQueryInput> getOr() {
        return or;
    }
    public void setOr(java.util.List<FilterGeofenceIntersectionQueryInput> or) {
        this.or = or;
    }

    public org.springframework.graphql.data.ArgumentValue<FilterGeofenceIntersectionQueryInput> getNot() {
        return not;
    }
    public void setNot(org.springframework.graphql.data.ArgumentValue<FilterGeofenceIntersectionQueryInput> not) {
        this.not = not;
    }



    public static FilterGeofenceIntersectionQueryInput.Builder builder() {
        return new FilterGeofenceIntersectionQueryInput.Builder();
    }

    public static class Builder {

        private org.springframework.graphql.data.ArgumentValue<FilterIDInput> geofenceId = org.springframework.graphql.data.ArgumentValue.omitted();
        private FilterDateTimeOffsetInput time;
        private java.util.List<FilterGeofenceIntersectionQueryInput> and;
        private java.util.List<FilterGeofenceIntersectionQueryInput> or;
        private org.springframework.graphql.data.ArgumentValue<FilterGeofenceIntersectionQueryInput> not = org.springframework.graphql.data.ArgumentValue.omitted();

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

        public Builder setAnd(java.util.List<FilterGeofenceIntersectionQueryInput> and) {
            this.and = and;
            return this;
        }

        public Builder setOr(java.util.List<FilterGeofenceIntersectionQueryInput> or) {
            this.or = or;
            return this;
        }

        public Builder setNot(org.springframework.graphql.data.ArgumentValue<FilterGeofenceIntersectionQueryInput> not) {
            this.not = not;
            return this;
        }


        public FilterGeofenceIntersectionQueryInput build() {
            return new FilterGeofenceIntersectionQueryInput(geofenceId, time, and, or, not);
        }

    }
}
