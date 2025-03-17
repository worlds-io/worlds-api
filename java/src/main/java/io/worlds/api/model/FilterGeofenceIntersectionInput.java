package io.worlds.api.model;


public class FilterGeofenceIntersectionInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private org.springframework.graphql.data.ArgumentValue<FilterIDInput> geofenceId = org.springframework.graphql.data.ArgumentValue.omitted();
    @jakarta.validation.constraints.NotNull
    private FilterDateTimeOffsetInput time;
    private java.util.List<FilterGeofenceIntersectionInput> and;
    private java.util.List<FilterGeofenceIntersectionInput> or;
    private org.springframework.graphql.data.ArgumentValue<FilterGeofenceIntersectionInput> not = org.springframework.graphql.data.ArgumentValue.omitted();

    public FilterGeofenceIntersectionInput() {
    }

    public FilterGeofenceIntersectionInput(org.springframework.graphql.data.ArgumentValue<FilterIDInput> geofenceId, FilterDateTimeOffsetInput time, java.util.List<FilterGeofenceIntersectionInput> and, java.util.List<FilterGeofenceIntersectionInput> or, org.springframework.graphql.data.ArgumentValue<FilterGeofenceIntersectionInput> not) {
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

    public java.util.List<FilterGeofenceIntersectionInput> getAnd() {
        return and;
    }
    public void setAnd(java.util.List<FilterGeofenceIntersectionInput> and) {
        this.and = and;
    }

    public java.util.List<FilterGeofenceIntersectionInput> getOr() {
        return or;
    }
    public void setOr(java.util.List<FilterGeofenceIntersectionInput> or) {
        this.or = or;
    }

    public org.springframework.graphql.data.ArgumentValue<FilterGeofenceIntersectionInput> getNot() {
        return not;
    }
    public void setNot(org.springframework.graphql.data.ArgumentValue<FilterGeofenceIntersectionInput> not) {
        this.not = not;
    }



    public static FilterGeofenceIntersectionInput.Builder builder() {
        return new FilterGeofenceIntersectionInput.Builder();
    }

    public static class Builder {

        private org.springframework.graphql.data.ArgumentValue<FilterIDInput> geofenceId = org.springframework.graphql.data.ArgumentValue.omitted();
        private FilterDateTimeOffsetInput time;
        private java.util.List<FilterGeofenceIntersectionInput> and;
        private java.util.List<FilterGeofenceIntersectionInput> or;
        private org.springframework.graphql.data.ArgumentValue<FilterGeofenceIntersectionInput> not = org.springframework.graphql.data.ArgumentValue.omitted();

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

        public Builder setAnd(java.util.List<FilterGeofenceIntersectionInput> and) {
            this.and = and;
            return this;
        }

        public Builder setOr(java.util.List<FilterGeofenceIntersectionInput> or) {
            this.or = or;
            return this;
        }

        public Builder setNot(org.springframework.graphql.data.ArgumentValue<FilterGeofenceIntersectionInput> not) {
            this.not = not;
            return this;
        }


        public FilterGeofenceIntersectionInput build() {
            return new FilterGeofenceIntersectionInput(geofenceId, time, and, or, not);
        }

    }
}
