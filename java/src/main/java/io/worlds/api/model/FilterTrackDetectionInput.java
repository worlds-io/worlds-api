package io.worlds.api.model;

import java.util.Objects;

/**
 * FilterTrackDetectionInput allows for filtering a track's detections based on criteria described below.
Tracks will only contain detections with a matching trackId.
Only one field should be provided per Filter object unless using an operator (`and` `or` `not`) as specified below
 */
public class FilterTrackDetectionInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private org.springframework.graphql.data.ArgumentValue<FilterIDInput> zoneId = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterIDInput> geofenceId = org.springframework.graphql.data.ArgumentValue.omitted();
    @jakarta.validation.constraints.NotNull
    private FilterDateTimeOffsetInput time;
    private org.springframework.graphql.data.ArgumentValue<FilterPointInput> position = org.springframework.graphql.data.ArgumentValue.omitted();
    private java.util.List<FilterTrackDetectionInput> and;
    private java.util.List<FilterTrackDetectionInput> or;
    private org.springframework.graphql.data.ArgumentValue<FilterTrackDetectionInput> not = org.springframework.graphql.data.ArgumentValue.omitted();

    public FilterTrackDetectionInput() {
    }

    public FilterTrackDetectionInput(org.springframework.graphql.data.ArgumentValue<FilterIDInput> zoneId, org.springframework.graphql.data.ArgumentValue<FilterIDInput> geofenceId, FilterDateTimeOffsetInput time, org.springframework.graphql.data.ArgumentValue<FilterPointInput> position, java.util.List<FilterTrackDetectionInput> and, java.util.List<FilterTrackDetectionInput> or, org.springframework.graphql.data.ArgumentValue<FilterTrackDetectionInput> not) {
        this.zoneId = zoneId;
        this.geofenceId = geofenceId;
        this.time = time;
        this.position = position;
        this.and = and;
        this.or = or;
        this.not = not;
    }

    public org.springframework.graphql.data.ArgumentValue<FilterIDInput> getZoneId() {
        return zoneId;
    }
    public void setZoneId(org.springframework.graphql.data.ArgumentValue<FilterIDInput> zoneId) {
        this.zoneId = zoneId;
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

    public org.springframework.graphql.data.ArgumentValue<FilterPointInput> getPosition() {
        return position;
    }
    public void setPosition(org.springframework.graphql.data.ArgumentValue<FilterPointInput> position) {
        this.position = position;
    }

    public java.util.List<FilterTrackDetectionInput> getAnd() {
        return and;
    }
    public void setAnd(java.util.List<FilterTrackDetectionInput> and) {
        this.and = and;
    }

    public java.util.List<FilterTrackDetectionInput> getOr() {
        return or;
    }
    public void setOr(java.util.List<FilterTrackDetectionInput> or) {
        this.or = or;
    }

    public org.springframework.graphql.data.ArgumentValue<FilterTrackDetectionInput> getNot() {
        return not;
    }
    public void setNot(org.springframework.graphql.data.ArgumentValue<FilterTrackDetectionInput> not) {
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
        final FilterTrackDetectionInput that = (FilterTrackDetectionInput) obj;
        return Objects.equals(zoneId, that.zoneId)
            && Objects.equals(geofenceId, that.geofenceId)
            && Objects.equals(time, that.time)
            && Objects.equals(position, that.position)
            && Objects.equals(and, that.and)
            && Objects.equals(or, that.or)
            && Objects.equals(not, that.not);
    }

    @Override
    public int hashCode() {
        return Objects.hash(zoneId, geofenceId, time, position, and, or, not);
    }


    public static FilterTrackDetectionInput.Builder builder() {
        return new FilterTrackDetectionInput.Builder();
    }

    public static class Builder {

        private org.springframework.graphql.data.ArgumentValue<FilterIDInput> zoneId = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterIDInput> geofenceId = org.springframework.graphql.data.ArgumentValue.omitted();
        private FilterDateTimeOffsetInput time;
        private org.springframework.graphql.data.ArgumentValue<FilterPointInput> position = org.springframework.graphql.data.ArgumentValue.omitted();
        private java.util.List<FilterTrackDetectionInput> and;
        private java.util.List<FilterTrackDetectionInput> or;
        private org.springframework.graphql.data.ArgumentValue<FilterTrackDetectionInput> not = org.springframework.graphql.data.ArgumentValue.omitted();

        public Builder() {
        }

        public Builder setZoneId(org.springframework.graphql.data.ArgumentValue<FilterIDInput> zoneId) {
            this.zoneId = zoneId;
            return this;
        }

        public Builder setGeofenceId(org.springframework.graphql.data.ArgumentValue<FilterIDInput> geofenceId) {
            this.geofenceId = geofenceId;
            return this;
        }

        public Builder setTime(FilterDateTimeOffsetInput time) {
            this.time = time;
            return this;
        }

        public Builder setPosition(org.springframework.graphql.data.ArgumentValue<FilterPointInput> position) {
            this.position = position;
            return this;
        }

        public Builder setAnd(java.util.List<FilterTrackDetectionInput> and) {
            this.and = and;
            return this;
        }

        public Builder setOr(java.util.List<FilterTrackDetectionInput> or) {
            this.or = or;
            return this;
        }

        public Builder setNot(org.springframework.graphql.data.ArgumentValue<FilterTrackDetectionInput> not) {
            this.not = not;
            return this;
        }


        public FilterTrackDetectionInput build() {
            return new FilterTrackDetectionInput(zoneId, geofenceId, time, position, and, or, not);
        }

    }
}
