package io.worlds.api.model;


public class FilterDetectionInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private org.springframework.graphql.data.ArgumentValue<FilterIDInput> dataSourceId = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterIDInput> zoneId = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterIDInput> geofenceId = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterStringInput> tag = org.springframework.graphql.data.ArgumentValue.omitted();
    @jakarta.validation.constraints.NotNull
    private FilterDateTimeOffsetInput time;
    private org.springframework.graphql.data.ArgumentValue<FilterPointInput> position = org.springframework.graphql.data.ArgumentValue.omitted();
    private java.util.List<FilterDetectionInput> and;
    private java.util.List<FilterDetectionInput> or;
    private org.springframework.graphql.data.ArgumentValue<FilterDetectionInput> not = org.springframework.graphql.data.ArgumentValue.omitted();
    @Deprecated
    private org.springframework.graphql.data.ArgumentValue<FilterIDInput> deviceId = org.springframework.graphql.data.ArgumentValue.omitted();

    public FilterDetectionInput() {
    }

    public FilterDetectionInput(org.springframework.graphql.data.ArgumentValue<FilterIDInput> dataSourceId, org.springframework.graphql.data.ArgumentValue<FilterIDInput> zoneId, org.springframework.graphql.data.ArgumentValue<FilterIDInput> geofenceId, org.springframework.graphql.data.ArgumentValue<FilterStringInput> tag, FilterDateTimeOffsetInput time, org.springframework.graphql.data.ArgumentValue<FilterPointInput> position, java.util.List<FilterDetectionInput> and, java.util.List<FilterDetectionInput> or, org.springframework.graphql.data.ArgumentValue<FilterDetectionInput> not, org.springframework.graphql.data.ArgumentValue<FilterIDInput> deviceId) {
        this.dataSourceId = dataSourceId;
        this.zoneId = zoneId;
        this.geofenceId = geofenceId;
        this.tag = tag;
        this.time = time;
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

    public java.util.List<FilterDetectionInput> getAnd() {
        return and;
    }
    public void setAnd(java.util.List<FilterDetectionInput> and) {
        this.and = and;
    }

    public java.util.List<FilterDetectionInput> getOr() {
        return or;
    }
    public void setOr(java.util.List<FilterDetectionInput> or) {
        this.or = or;
    }

    public org.springframework.graphql.data.ArgumentValue<FilterDetectionInput> getNot() {
        return not;
    }
    public void setNot(org.springframework.graphql.data.ArgumentValue<FilterDetectionInput> not) {
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



    public static FilterDetectionInput.Builder builder() {
        return new FilterDetectionInput.Builder();
    }

    public static class Builder {

        private org.springframework.graphql.data.ArgumentValue<FilterIDInput> dataSourceId = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterIDInput> zoneId = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterIDInput> geofenceId = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterStringInput> tag = org.springframework.graphql.data.ArgumentValue.omitted();
        private FilterDateTimeOffsetInput time;
        private org.springframework.graphql.data.ArgumentValue<FilterPointInput> position = org.springframework.graphql.data.ArgumentValue.omitted();
        private java.util.List<FilterDetectionInput> and;
        private java.util.List<FilterDetectionInput> or;
        private org.springframework.graphql.data.ArgumentValue<FilterDetectionInput> not = org.springframework.graphql.data.ArgumentValue.omitted();
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

        public Builder setTime(FilterDateTimeOffsetInput time) {
            this.time = time;
            return this;
        }

        public Builder setPosition(org.springframework.graphql.data.ArgumentValue<FilterPointInput> position) {
            this.position = position;
            return this;
        }

        public Builder setAnd(java.util.List<FilterDetectionInput> and) {
            this.and = and;
            return this;
        }

        public Builder setOr(java.util.List<FilterDetectionInput> or) {
            this.or = or;
            return this;
        }

        public Builder setNot(org.springframework.graphql.data.ArgumentValue<FilterDetectionInput> not) {
            this.not = not;
            return this;
        }

        @Deprecated
        public Builder setDeviceId(org.springframework.graphql.data.ArgumentValue<FilterIDInput> deviceId) {
            this.deviceId = deviceId;
            return this;
        }


        public FilterDetectionInput build() {
            return new FilterDetectionInput(dataSourceId, zoneId, geofenceId, tag, time, position, and, or, not, deviceId);
        }

    }
}
