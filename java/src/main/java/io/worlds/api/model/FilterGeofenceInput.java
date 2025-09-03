package io.worlds.api.model;


/**
 * `FilterGeofenceInput` allows for filtering a geofence based on criteria described below.
Only one field should be provided per Filter object unless using an operator (`and` `or` `not`) as specified below
 */
public class FilterGeofenceInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private org.springframework.graphql.data.ArgumentValue<FilterIDInput> id = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterStringInput> name = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterBooleanInput> active = org.springframework.graphql.data.ArgumentValue.omitted();
    private java.util.List<FilterGeofenceInput> and;
    private java.util.List<FilterGeofenceInput> or;
    private org.springframework.graphql.data.ArgumentValue<FilterGeofenceInput> not = org.springframework.graphql.data.ArgumentValue.omitted();

    public FilterGeofenceInput() {
    }

    public FilterGeofenceInput(org.springframework.graphql.data.ArgumentValue<FilterIDInput> id, org.springframework.graphql.data.ArgumentValue<FilterStringInput> name, org.springframework.graphql.data.ArgumentValue<FilterBooleanInput> active, java.util.List<FilterGeofenceInput> and, java.util.List<FilterGeofenceInput> or, org.springframework.graphql.data.ArgumentValue<FilterGeofenceInput> not) {
        this.id = id;
        this.name = name;
        this.active = active;
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

    public org.springframework.graphql.data.ArgumentValue<FilterStringInput> getName() {
        return name;
    }
    public void setName(org.springframework.graphql.data.ArgumentValue<FilterStringInput> name) {
        this.name = name;
    }

    public org.springframework.graphql.data.ArgumentValue<FilterBooleanInput> getActive() {
        return active;
    }
    public void setActive(org.springframework.graphql.data.ArgumentValue<FilterBooleanInput> active) {
        this.active = active;
    }

    public java.util.List<FilterGeofenceInput> getAnd() {
        return and;
    }
    public void setAnd(java.util.List<FilterGeofenceInput> and) {
        this.and = and;
    }

    public java.util.List<FilterGeofenceInput> getOr() {
        return or;
    }
    public void setOr(java.util.List<FilterGeofenceInput> or) {
        this.or = or;
    }

    public org.springframework.graphql.data.ArgumentValue<FilterGeofenceInput> getNot() {
        return not;
    }
    public void setNot(org.springframework.graphql.data.ArgumentValue<FilterGeofenceInput> not) {
        this.not = not;
    }



    public static FilterGeofenceInput.Builder builder() {
        return new FilterGeofenceInput.Builder();
    }

    public static class Builder {

        private org.springframework.graphql.data.ArgumentValue<FilterIDInput> id = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterStringInput> name = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterBooleanInput> active = org.springframework.graphql.data.ArgumentValue.omitted();
        private java.util.List<FilterGeofenceInput> and;
        private java.util.List<FilterGeofenceInput> or;
        private org.springframework.graphql.data.ArgumentValue<FilterGeofenceInput> not = org.springframework.graphql.data.ArgumentValue.omitted();

        public Builder() {
        }

        public Builder setId(org.springframework.graphql.data.ArgumentValue<FilterIDInput> id) {
            this.id = id;
            return this;
        }

        public Builder setName(org.springframework.graphql.data.ArgumentValue<FilterStringInput> name) {
            this.name = name;
            return this;
        }

        public Builder setActive(org.springframework.graphql.data.ArgumentValue<FilterBooleanInput> active) {
            this.active = active;
            return this;
        }

        public Builder setAnd(java.util.List<FilterGeofenceInput> and) {
            this.and = and;
            return this;
        }

        public Builder setOr(java.util.List<FilterGeofenceInput> or) {
            this.or = or;
            return this;
        }

        public Builder setNot(org.springframework.graphql.data.ArgumentValue<FilterGeofenceInput> not) {
            this.not = not;
            return this;
        }


        public FilterGeofenceInput build() {
            return new FilterGeofenceInput(id, name, active, and, or, not);
        }

    }
}
