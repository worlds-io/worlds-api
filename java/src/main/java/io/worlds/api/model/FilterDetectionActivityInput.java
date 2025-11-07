package io.worlds.api.model;

import java.util.Objects;

/**
 * FilterDetectionActivityInput allows for filtering a detection activity based on criteria described below.
Only one field should be provided per Filter object unless using an operator (`and` `or` `not`) as specified below.
 */
public class FilterDetectionActivityInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private org.springframework.graphql.data.ArgumentValue<FilterIDInput> dataSourceId = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterIDInput> zoneId = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterIDInput> geofenceId = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterStringInput> tag = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterPointInput> position = org.springframework.graphql.data.ArgumentValue.omitted();
    private java.util.List<FilterDetectionActivityInput> and;
    private java.util.List<FilterDetectionActivityInput> or;
    private org.springframework.graphql.data.ArgumentValue<FilterDetectionActivityInput> not = org.springframework.graphql.data.ArgumentValue.omitted();
    @Deprecated
    private org.springframework.graphql.data.ArgumentValue<FilterIDInput> deviceId = org.springframework.graphql.data.ArgumentValue.omitted();

    public FilterDetectionActivityInput() {
    }

    public FilterDetectionActivityInput(org.springframework.graphql.data.ArgumentValue<FilterIDInput> dataSourceId, org.springframework.graphql.data.ArgumentValue<FilterIDInput> zoneId, org.springframework.graphql.data.ArgumentValue<FilterIDInput> geofenceId, org.springframework.graphql.data.ArgumentValue<FilterStringInput> tag, org.springframework.graphql.data.ArgumentValue<FilterPointInput> position, java.util.List<FilterDetectionActivityInput> and, java.util.List<FilterDetectionActivityInput> or, org.springframework.graphql.data.ArgumentValue<FilterDetectionActivityInput> not, org.springframework.graphql.data.ArgumentValue<FilterIDInput> deviceId) {
        this.dataSourceId = dataSourceId;
        this.zoneId = zoneId;
        this.geofenceId = geofenceId;
        this.tag = tag;
        this.position = position;
        this.and = and;
        this.or = or;
        this.not = not;
        this.deviceId = deviceId;
    }

    public org.springframework.graphql.data.ArgumentValue<FilterIDInput> getDataSourceId() {
        return dataSourceId;
    }
    public void setDataSourceId(org.springframework.graphql.data.ArgumentValue<FilterIDInput> dataSourceId) {
        this.dataSourceId = dataSourceId;
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

    public org.springframework.graphql.data.ArgumentValue<FilterStringInput> getTag() {
        return tag;
    }
    public void setTag(org.springframework.graphql.data.ArgumentValue<FilterStringInput> tag) {
        this.tag = tag;
    }

    public org.springframework.graphql.data.ArgumentValue<FilterPointInput> getPosition() {
        return position;
    }
    public void setPosition(org.springframework.graphql.data.ArgumentValue<FilterPointInput> position) {
        this.position = position;
    }

    public java.util.List<FilterDetectionActivityInput> getAnd() {
        return and;
    }
    public void setAnd(java.util.List<FilterDetectionActivityInput> and) {
        this.and = and;
    }

    public java.util.List<FilterDetectionActivityInput> getOr() {
        return or;
    }
    public void setOr(java.util.List<FilterDetectionActivityInput> or) {
        this.or = or;
    }

    public org.springframework.graphql.data.ArgumentValue<FilterDetectionActivityInput> getNot() {
        return not;
    }
    public void setNot(org.springframework.graphql.data.ArgumentValue<FilterDetectionActivityInput> not) {
        this.not = not;
    }

    @Deprecated
    public org.springframework.graphql.data.ArgumentValue<FilterIDInput> getDeviceId() {
        return deviceId;
    }
    @Deprecated
    public void setDeviceId(org.springframework.graphql.data.ArgumentValue<FilterIDInput> deviceId) {
        this.deviceId = deviceId;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final FilterDetectionActivityInput that = (FilterDetectionActivityInput) obj;
        return Objects.equals(dataSourceId, that.dataSourceId)
            && Objects.equals(zoneId, that.zoneId)
            && Objects.equals(geofenceId, that.geofenceId)
            && Objects.equals(tag, that.tag)
            && Objects.equals(position, that.position)
            && Objects.equals(and, that.and)
            && Objects.equals(or, that.or)
            && Objects.equals(not, that.not)
            && Objects.equals(deviceId, that.deviceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dataSourceId, zoneId, geofenceId, tag, position, and, or, not, deviceId);
    }


    public static FilterDetectionActivityInput.Builder builder() {
        return new FilterDetectionActivityInput.Builder();
    }

    public static class Builder {

        private org.springframework.graphql.data.ArgumentValue<FilterIDInput> dataSourceId = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterIDInput> zoneId = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterIDInput> geofenceId = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterStringInput> tag = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterPointInput> position = org.springframework.graphql.data.ArgumentValue.omitted();
        private java.util.List<FilterDetectionActivityInput> and;
        private java.util.List<FilterDetectionActivityInput> or;
        private org.springframework.graphql.data.ArgumentValue<FilterDetectionActivityInput> not = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterIDInput> deviceId = org.springframework.graphql.data.ArgumentValue.omitted();

        public Builder() {
        }

        public Builder setDataSourceId(org.springframework.graphql.data.ArgumentValue<FilterIDInput> dataSourceId) {
            this.dataSourceId = dataSourceId;
            return this;
        }

        public Builder setZoneId(org.springframework.graphql.data.ArgumentValue<FilterIDInput> zoneId) {
            this.zoneId = zoneId;
            return this;
        }

        public Builder setGeofenceId(org.springframework.graphql.data.ArgumentValue<FilterIDInput> geofenceId) {
            this.geofenceId = geofenceId;
            return this;
        }

        public Builder setTag(org.springframework.graphql.data.ArgumentValue<FilterStringInput> tag) {
            this.tag = tag;
            return this;
        }

        public Builder setPosition(org.springframework.graphql.data.ArgumentValue<FilterPointInput> position) {
            this.position = position;
            return this;
        }

        public Builder setAnd(java.util.List<FilterDetectionActivityInput> and) {
            this.and = and;
            return this;
        }

        public Builder setOr(java.util.List<FilterDetectionActivityInput> or) {
            this.or = or;
            return this;
        }

        public Builder setNot(org.springframework.graphql.data.ArgumentValue<FilterDetectionActivityInput> not) {
            this.not = not;
            return this;
        }

        @Deprecated
        public Builder setDeviceId(org.springframework.graphql.data.ArgumentValue<FilterIDInput> deviceId) {
            this.deviceId = deviceId;
            return this;
        }


        public FilterDetectionActivityInput build() {
            return new FilterDetectionActivityInput(dataSourceId, zoneId, geofenceId, tag, position, and, or, not, deviceId);
        }

    }
}
