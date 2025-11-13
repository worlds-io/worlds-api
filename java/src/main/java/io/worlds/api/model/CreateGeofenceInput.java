package io.worlds.api.model;

import java.util.Objects;

/**
 * Fields to create a new Geofence.
 */
public class CreateGeofenceInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private String name;
    private java.util.List<String> labels;
    @jakarta.validation.constraints.NotNull
    private String siteId;
    private org.springframework.graphql.data.ArgumentValue<String> pointOfInterestId = org.springframework.graphql.data.ArgumentValue.omitted();
    @jakarta.validation.constraints.NotNull
    private GeofenceBoundsInput bounds;
    private boolean active;

    public CreateGeofenceInput() {
    }

    public CreateGeofenceInput(String name, java.util.List<String> labels, String siteId, org.springframework.graphql.data.ArgumentValue<String> pointOfInterestId, GeofenceBoundsInput bounds, boolean active) {
        this.name = name;
        this.labels = labels;
        this.siteId = siteId;
        this.pointOfInterestId = pointOfInterestId;
        this.bounds = bounds;
        this.active = active;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public java.util.List<String> getLabels() {
        return labels;
    }
    public void setLabels(java.util.List<String> labels) {
        this.labels = labels;
    }

    public String getSiteId() {
        return siteId;
    }
    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    public org.springframework.graphql.data.ArgumentValue<String> getPointOfInterestId() {
        return pointOfInterestId;
    }
    public void setPointOfInterestId(org.springframework.graphql.data.ArgumentValue<String> pointOfInterestId) {
        this.pointOfInterestId = pointOfInterestId;
    }

    public GeofenceBoundsInput getBounds() {
        return bounds;
    }
    public void setBounds(GeofenceBoundsInput bounds) {
        this.bounds = bounds;
    }

    public boolean getActive() {
        return active;
    }
    public void setActive(boolean active) {
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
        final CreateGeofenceInput that = (CreateGeofenceInput) obj;
        return Objects.equals(name, that.name)
            && Objects.equals(labels, that.labels)
            && Objects.equals(siteId, that.siteId)
            && Objects.equals(pointOfInterestId, that.pointOfInterestId)
            && Objects.equals(bounds, that.bounds)
            && Objects.equals(active, that.active);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, labels, siteId, pointOfInterestId, bounds, active);
    }


    public static CreateGeofenceInput.Builder builder() {
        return new CreateGeofenceInput.Builder();
    }

    public static class Builder {

        private String name;
        private java.util.List<String> labels;
        private String siteId;
        private org.springframework.graphql.data.ArgumentValue<String> pointOfInterestId = org.springframework.graphql.data.ArgumentValue.omitted();
        private GeofenceBoundsInput bounds;
        private boolean active;

        public Builder() {
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setLabels(java.util.List<String> labels) {
            this.labels = labels;
            return this;
        }

        public Builder setSiteId(String siteId) {
            this.siteId = siteId;
            return this;
        }

        public Builder setPointOfInterestId(org.springframework.graphql.data.ArgumentValue<String> pointOfInterestId) {
            this.pointOfInterestId = pointOfInterestId;
            return this;
        }

        public Builder setBounds(GeofenceBoundsInput bounds) {
            this.bounds = bounds;
            return this;
        }

        public Builder setActive(boolean active) {
            this.active = active;
            return this;
        }


        public CreateGeofenceInput build() {
            return new CreateGeofenceInput(name, labels, siteId, pointOfInterestId, bounds, active);
        }

    }
}
