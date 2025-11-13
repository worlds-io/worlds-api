package io.worlds.api.model;

import java.util.Objects;

/**
 * `FilterGeofenceInput` allows for filtering a [geofence]({{Types.Geofence}}) based on criteria described below.
Only one field should be provided per Filter object unless using an operator (`and` `or` `not`) as specified below
 */
public class FilterGeofenceInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private org.springframework.graphql.data.ArgumentValue<FilterIDInput> id = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterStringInput> name = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterBooleanInput> active = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterIDInput> siteId = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterIDInput> pointOfInterestId = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterStringListInput> labels = org.springframework.graphql.data.ArgumentValue.omitted();
    private java.util.List<FilterGeofenceInput> and;
    private java.util.List<FilterGeofenceInput> or;
    private org.springframework.graphql.data.ArgumentValue<FilterGeofenceInput> not = org.springframework.graphql.data.ArgumentValue.omitted();

    public FilterGeofenceInput() {
    }

    public FilterGeofenceInput(org.springframework.graphql.data.ArgumentValue<FilterIDInput> id, org.springframework.graphql.data.ArgumentValue<FilterStringInput> name, org.springframework.graphql.data.ArgumentValue<FilterBooleanInput> active, org.springframework.graphql.data.ArgumentValue<FilterIDInput> siteId, org.springframework.graphql.data.ArgumentValue<FilterIDInput> pointOfInterestId, org.springframework.graphql.data.ArgumentValue<FilterStringListInput> labels, java.util.List<FilterGeofenceInput> and, java.util.List<FilterGeofenceInput> or, org.springframework.graphql.data.ArgumentValue<FilterGeofenceInput> not) {
        this.id = id;
        this.name = name;
        this.active = active;
        this.siteId = siteId;
        this.pointOfInterestId = pointOfInterestId;
        this.labels = labels;
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

    public org.springframework.graphql.data.ArgumentValue<FilterIDInput> getSiteId() {
        return siteId;
    }
    public void setSiteId(org.springframework.graphql.data.ArgumentValue<FilterIDInput> siteId) {
        this.siteId = siteId;
    }

    public org.springframework.graphql.data.ArgumentValue<FilterIDInput> getPointOfInterestId() {
        return pointOfInterestId;
    }
    public void setPointOfInterestId(org.springframework.graphql.data.ArgumentValue<FilterIDInput> pointOfInterestId) {
        this.pointOfInterestId = pointOfInterestId;
    }

    public org.springframework.graphql.data.ArgumentValue<FilterStringListInput> getLabels() {
        return labels;
    }
    public void setLabels(org.springframework.graphql.data.ArgumentValue<FilterStringListInput> labels) {
        this.labels = labels;
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

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final FilterGeofenceInput that = (FilterGeofenceInput) obj;
        return Objects.equals(id, that.id)
            && Objects.equals(name, that.name)
            && Objects.equals(active, that.active)
            && Objects.equals(siteId, that.siteId)
            && Objects.equals(pointOfInterestId, that.pointOfInterestId)
            && Objects.equals(labels, that.labels)
            && Objects.equals(and, that.and)
            && Objects.equals(or, that.or)
            && Objects.equals(not, that.not);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, active, siteId, pointOfInterestId, labels, and, or, not);
    }


    public static FilterGeofenceInput.Builder builder() {
        return new FilterGeofenceInput.Builder();
    }

    public static class Builder {

        private org.springframework.graphql.data.ArgumentValue<FilterIDInput> id = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterStringInput> name = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterBooleanInput> active = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterIDInput> siteId = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterIDInput> pointOfInterestId = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterStringListInput> labels = org.springframework.graphql.data.ArgumentValue.omitted();
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

        public Builder setSiteId(org.springframework.graphql.data.ArgumentValue<FilterIDInput> siteId) {
            this.siteId = siteId;
            return this;
        }

        public Builder setPointOfInterestId(org.springframework.graphql.data.ArgumentValue<FilterIDInput> pointOfInterestId) {
            this.pointOfInterestId = pointOfInterestId;
            return this;
        }

        public Builder setLabels(org.springframework.graphql.data.ArgumentValue<FilterStringListInput> labels) {
            this.labels = labels;
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
            return new FilterGeofenceInput(id, name, active, siteId, pointOfInterestId, labels, and, or, not);
        }

    }
}
