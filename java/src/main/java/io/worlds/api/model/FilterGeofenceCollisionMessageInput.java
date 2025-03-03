package io.worlds.api.model;


public class FilterGeofenceCollisionMessageInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private org.springframework.graphql.data.ArgumentValue<FilterIDInput> geofenceId = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterStringInput> tag = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterIDInput> dataSourceId = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterMessageStateInput> state = org.springframework.graphql.data.ArgumentValue.omitted();
    private java.util.List<FilterGeofenceCollisionMessageInput> and;
    private java.util.List<FilterGeofenceCollisionMessageInput> or;
    private org.springframework.graphql.data.ArgumentValue<FilterGeofenceCollisionMessageInput> not = org.springframework.graphql.data.ArgumentValue.omitted();

    public FilterGeofenceCollisionMessageInput() {
    }

    public FilterGeofenceCollisionMessageInput(org.springframework.graphql.data.ArgumentValue<FilterIDInput> geofenceId, org.springframework.graphql.data.ArgumentValue<FilterStringInput> tag, org.springframework.graphql.data.ArgumentValue<FilterIDInput> dataSourceId, org.springframework.graphql.data.ArgumentValue<FilterMessageStateInput> state, java.util.List<FilterGeofenceCollisionMessageInput> and, java.util.List<FilterGeofenceCollisionMessageInput> or, org.springframework.graphql.data.ArgumentValue<FilterGeofenceCollisionMessageInput> not) {
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

    public java.util.List<FilterGeofenceCollisionMessageInput> getAnd() {
        return and;
    }
    public void setAnd(java.util.List<FilterGeofenceCollisionMessageInput> and) {
        this.and = and;
    }

    public java.util.List<FilterGeofenceCollisionMessageInput> getOr() {
        return or;
    }
    public void setOr(java.util.List<FilterGeofenceCollisionMessageInput> or) {
        this.or = or;
    }

    public org.springframework.graphql.data.ArgumentValue<FilterGeofenceCollisionMessageInput> getNot() {
        return not;
    }
    public void setNot(org.springframework.graphql.data.ArgumentValue<FilterGeofenceCollisionMessageInput> not) {
        this.not = not;
    }



    public static FilterGeofenceCollisionMessageInput.Builder builder() {
        return new FilterGeofenceCollisionMessageInput.Builder();
    }

    public static class Builder {

        private org.springframework.graphql.data.ArgumentValue<FilterIDInput> geofenceId = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterStringInput> tag = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterIDInput> dataSourceId = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterMessageStateInput> state = org.springframework.graphql.data.ArgumentValue.omitted();
        private java.util.List<FilterGeofenceCollisionMessageInput> and;
        private java.util.List<FilterGeofenceCollisionMessageInput> or;
        private org.springframework.graphql.data.ArgumentValue<FilterGeofenceCollisionMessageInput> not = org.springframework.graphql.data.ArgumentValue.omitted();

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

        public Builder setAnd(java.util.List<FilterGeofenceCollisionMessageInput> and) {
            this.and = and;
            return this;
        }

        public Builder setOr(java.util.List<FilterGeofenceCollisionMessageInput> or) {
            this.or = or;
            return this;
        }

        public Builder setNot(org.springframework.graphql.data.ArgumentValue<FilterGeofenceCollisionMessageInput> not) {
            this.not = not;
            return this;
        }


        public FilterGeofenceCollisionMessageInput build() {
            return new FilterGeofenceCollisionMessageInput(geofenceId, tag, dataSourceId, state, and, or, not);
        }

    }
}
