package io.worlds.api.model;


public class FilterGeofenceCollisionQueryInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private org.springframework.graphql.data.ArgumentValue<FilterIDInput> geofenceId = org.springframework.graphql.data.ArgumentValue.omitted();
    @jakarta.validation.constraints.NotNull
    private FilterDateTimeOffsetInput time;
    private java.util.List<FilterGeofenceCollisionQueryInput> and;
    private java.util.List<FilterGeofenceCollisionQueryInput> or;
    private org.springframework.graphql.data.ArgumentValue<FilterGeofenceCollisionQueryInput> not = org.springframework.graphql.data.ArgumentValue.omitted();

    public FilterGeofenceCollisionQueryInput() {
    }

    public FilterGeofenceCollisionQueryInput(org.springframework.graphql.data.ArgumentValue<FilterIDInput> geofenceId, FilterDateTimeOffsetInput time, java.util.List<FilterGeofenceCollisionQueryInput> and, java.util.List<FilterGeofenceCollisionQueryInput> or, org.springframework.graphql.data.ArgumentValue<FilterGeofenceCollisionQueryInput> not) {
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

    public java.util.List<FilterGeofenceCollisionQueryInput> getAnd() {
        return and;
    }
    public void setAnd(java.util.List<FilterGeofenceCollisionQueryInput> and) {
        this.and = and;
    }

    public java.util.List<FilterGeofenceCollisionQueryInput> getOr() {
        return or;
    }
    public void setOr(java.util.List<FilterGeofenceCollisionQueryInput> or) {
        this.or = or;
    }

    public org.springframework.graphql.data.ArgumentValue<FilterGeofenceCollisionQueryInput> getNot() {
        return not;
    }
    public void setNot(org.springframework.graphql.data.ArgumentValue<FilterGeofenceCollisionQueryInput> not) {
        this.not = not;
    }



    public static FilterGeofenceCollisionQueryInput.Builder builder() {
        return new FilterGeofenceCollisionQueryInput.Builder();
    }

    public static class Builder {

        private org.springframework.graphql.data.ArgumentValue<FilterIDInput> geofenceId = org.springframework.graphql.data.ArgumentValue.omitted();
        private FilterDateTimeOffsetInput time;
        private java.util.List<FilterGeofenceCollisionQueryInput> and;
        private java.util.List<FilterGeofenceCollisionQueryInput> or;
        private org.springframework.graphql.data.ArgumentValue<FilterGeofenceCollisionQueryInput> not = org.springframework.graphql.data.ArgumentValue.omitted();

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

        public Builder setAnd(java.util.List<FilterGeofenceCollisionQueryInput> and) {
            this.and = and;
            return this;
        }

        public Builder setOr(java.util.List<FilterGeofenceCollisionQueryInput> or) {
            this.or = or;
            return this;
        }

        public Builder setNot(org.springframework.graphql.data.ArgumentValue<FilterGeofenceCollisionQueryInput> not) {
            this.not = not;
            return this;
        }


        public FilterGeofenceCollisionQueryInput build() {
            return new FilterGeofenceCollisionQueryInput(geofenceId, time, and, or, not);
        }

    }
}
