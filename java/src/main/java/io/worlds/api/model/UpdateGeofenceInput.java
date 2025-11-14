package io.worlds.api.model;

import java.util.Objects;

/**
 * Fields to update an existing Geofence.
 */
public class UpdateGeofenceInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private String id;
    private org.springframework.graphql.data.ArgumentValue<String> name = org.springframework.graphql.data.ArgumentValue.omitted();
    private java.util.List<String> labels;
    private org.springframework.graphql.data.ArgumentValue<String> siteId = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<String> pointOfInterestId = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<GeofenceBoundsInput> bounds = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<Boolean> active = org.springframework.graphql.data.ArgumentValue.omitted();

    public UpdateGeofenceInput() {
    }

    public UpdateGeofenceInput(String id, org.springframework.graphql.data.ArgumentValue<String> name, java.util.List<String> labels, org.springframework.graphql.data.ArgumentValue<String> siteId, org.springframework.graphql.data.ArgumentValue<String> pointOfInterestId, org.springframework.graphql.data.ArgumentValue<GeofenceBoundsInput> bounds, org.springframework.graphql.data.ArgumentValue<Boolean> active) {
        this.id = id;
        this.name = name;
        this.labels = labels;
        this.siteId = siteId;
        this.pointOfInterestId = pointOfInterestId;
        this.bounds = bounds;
        this.active = active;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public org.springframework.graphql.data.ArgumentValue<String> getName() {
        return name;
    }
    public void setName(org.springframework.graphql.data.ArgumentValue<String> name) {
        this.name = name;
    }

    public java.util.List<String> getLabels() {
        return labels;
    }
    public void setLabels(java.util.List<String> labels) {
        this.labels = labels;
    }

    public org.springframework.graphql.data.ArgumentValue<String> getSiteId() {
        return siteId;
    }
    public void setSiteId(org.springframework.graphql.data.ArgumentValue<String> siteId) {
        this.siteId = siteId;
    }

    public org.springframework.graphql.data.ArgumentValue<String> getPointOfInterestId() {
        return pointOfInterestId;
    }
    public void setPointOfInterestId(org.springframework.graphql.data.ArgumentValue<String> pointOfInterestId) {
        this.pointOfInterestId = pointOfInterestId;
    }

    public org.springframework.graphql.data.ArgumentValue<GeofenceBoundsInput> getBounds() {
        return bounds;
    }
    public void setBounds(org.springframework.graphql.data.ArgumentValue<GeofenceBoundsInput> bounds) {
        this.bounds = bounds;
    }

    public org.springframework.graphql.data.ArgumentValue<Boolean> getActive() {
        return active;
    }
    public void setActive(org.springframework.graphql.data.ArgumentValue<Boolean> active) {
        this.active = active;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final UpdateGeofenceInput that = (UpdateGeofenceInput) obj;
        return Objects.equals(id, that.id)
            && Objects.equals(name, that.name)
            && Objects.equals(labels, that.labels)
            && Objects.equals(siteId, that.siteId)
            && Objects.equals(pointOfInterestId, that.pointOfInterestId)
            && Objects.equals(bounds, that.bounds)
            && Objects.equals(active, that.active);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, labels, siteId, pointOfInterestId, bounds, active);
    }


    public static UpdateGeofenceInput.Builder builder() {
        return new UpdateGeofenceInput.Builder();
    }

    public static class Builder {

        private String id;
        private org.springframework.graphql.data.ArgumentValue<String> name = org.springframework.graphql.data.ArgumentValue.omitted();
        private java.util.List<String> labels;
        private org.springframework.graphql.data.ArgumentValue<String> siteId = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<String> pointOfInterestId = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<GeofenceBoundsInput> bounds = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<Boolean> active = org.springframework.graphql.data.ArgumentValue.omitted();

        public Builder() {
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setName(org.springframework.graphql.data.ArgumentValue<String> name) {
            this.name = name;
            return this;
        }

        public Builder setLabels(java.util.List<String> labels) {
            this.labels = labels;
            return this;
        }

        public Builder setSiteId(org.springframework.graphql.data.ArgumentValue<String> siteId) {
            this.siteId = siteId;
            return this;
        }

        public Builder setPointOfInterestId(org.springframework.graphql.data.ArgumentValue<String> pointOfInterestId) {
            this.pointOfInterestId = pointOfInterestId;
            return this;
        }

        public Builder setBounds(org.springframework.graphql.data.ArgumentValue<GeofenceBoundsInput> bounds) {
            this.bounds = bounds;
            return this;
        }

        public Builder setActive(org.springframework.graphql.data.ArgumentValue<Boolean> active) {
            this.active = active;
            return this;
        }


        public UpdateGeofenceInput build() {
            return new UpdateGeofenceInput(id, name, labels, siteId, pointOfInterestId, bounds, active);
        }

    }
}
