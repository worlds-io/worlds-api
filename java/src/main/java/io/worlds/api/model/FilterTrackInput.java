package io.worlds.api.model;

import java.util.Objects;

/**
 * `FilterTrackInput` allows for filtering a [`tracks` query]({{Queries.tracks}}) based on criteria described below.
Only one field should be provided per Filter object unless using an operator (`and` `or` `not`) as specified below
 */
public class FilterTrackInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private org.springframework.graphql.data.ArgumentValue<FilterIDInput> id = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterIDInput> dataSourceId = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterDateTimeOffsetInput> time = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterTimeRangeInput> timeRange = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterStringInput> tag = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterPointInput> position = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterTrackPropertyInput> identifier = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterTrackPropertyInput> attribute = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterIDInput> pointOfInterestId = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterIDInput> siteId = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterIDInput> modelId = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterStringInput> dataSourceType = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterStringListInput> dataSourceLabels = org.springframework.graphql.data.ArgumentValue.omitted();
    private java.util.List<FilterTrackInput> and;
    private java.util.List<FilterTrackInput> or;
    private org.springframework.graphql.data.ArgumentValue<FilterTrackInput> not = org.springframework.graphql.data.ArgumentValue.omitted();
    @Deprecated
    private org.springframework.graphql.data.ArgumentValue<FilterIDInput> deviceId = org.springframework.graphql.data.ArgumentValue.omitted();

    public FilterTrackInput() {
    }

    public FilterTrackInput(org.springframework.graphql.data.ArgumentValue<FilterIDInput> id, org.springframework.graphql.data.ArgumentValue<FilterIDInput> dataSourceId, org.springframework.graphql.data.ArgumentValue<FilterDateTimeOffsetInput> time, org.springframework.graphql.data.ArgumentValue<FilterTimeRangeInput> timeRange, org.springframework.graphql.data.ArgumentValue<FilterStringInput> tag, org.springframework.graphql.data.ArgumentValue<FilterPointInput> position, org.springframework.graphql.data.ArgumentValue<FilterTrackPropertyInput> identifier, org.springframework.graphql.data.ArgumentValue<FilterTrackPropertyInput> attribute, org.springframework.graphql.data.ArgumentValue<FilterIDInput> pointOfInterestId, org.springframework.graphql.data.ArgumentValue<FilterIDInput> siteId, org.springframework.graphql.data.ArgumentValue<FilterIDInput> modelId, org.springframework.graphql.data.ArgumentValue<FilterStringInput> dataSourceType, org.springframework.graphql.data.ArgumentValue<FilterStringListInput> dataSourceLabels, java.util.List<FilterTrackInput> and, java.util.List<FilterTrackInput> or, org.springframework.graphql.data.ArgumentValue<FilterTrackInput> not, org.springframework.graphql.data.ArgumentValue<FilterIDInput> deviceId) {
        this.id = id;
        this.dataSourceId = dataSourceId;
        this.time = time;
        this.timeRange = timeRange;
        this.tag = tag;
        this.position = position;
        this.identifier = identifier;
        this.attribute = attribute;
        this.pointOfInterestId = pointOfInterestId;
        this.siteId = siteId;
        this.modelId = modelId;
        this.dataSourceType = dataSourceType;
        this.dataSourceLabels = dataSourceLabels;
        this.and = and;
        this.or = or;
        this.not = not;
        this.deviceId = deviceId;
    }

    public org.springframework.graphql.data.ArgumentValue<FilterIDInput> getId() {
        return id;
    }
    public void setId(org.springframework.graphql.data.ArgumentValue<FilterIDInput> id) {
        this.id = id;
    }

    public org.springframework.graphql.data.ArgumentValue<FilterIDInput> getDataSourceId() {
        return dataSourceId;
    }
    public void setDataSourceId(org.springframework.graphql.data.ArgumentValue<FilterIDInput> dataSourceId) {
        this.dataSourceId = dataSourceId;
    }

    public org.springframework.graphql.data.ArgumentValue<FilterDateTimeOffsetInput> getTime() {
        return time;
    }
    public void setTime(org.springframework.graphql.data.ArgumentValue<FilterDateTimeOffsetInput> time) {
        this.time = time;
    }

    public org.springframework.graphql.data.ArgumentValue<FilterTimeRangeInput> getTimeRange() {
        return timeRange;
    }
    public void setTimeRange(org.springframework.graphql.data.ArgumentValue<FilterTimeRangeInput> timeRange) {
        this.timeRange = timeRange;
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

    public org.springframework.graphql.data.ArgumentValue<FilterTrackPropertyInput> getIdentifier() {
        return identifier;
    }
    public void setIdentifier(org.springframework.graphql.data.ArgumentValue<FilterTrackPropertyInput> identifier) {
        this.identifier = identifier;
    }

    public org.springframework.graphql.data.ArgumentValue<FilterTrackPropertyInput> getAttribute() {
        return attribute;
    }
    public void setAttribute(org.springframework.graphql.data.ArgumentValue<FilterTrackPropertyInput> attribute) {
        this.attribute = attribute;
    }

    public org.springframework.graphql.data.ArgumentValue<FilterIDInput> getPointOfInterestId() {
        return pointOfInterestId;
    }
    public void setPointOfInterestId(org.springframework.graphql.data.ArgumentValue<FilterIDInput> pointOfInterestId) {
        this.pointOfInterestId = pointOfInterestId;
    }

    public org.springframework.graphql.data.ArgumentValue<FilterIDInput> getSiteId() {
        return siteId;
    }
    public void setSiteId(org.springframework.graphql.data.ArgumentValue<FilterIDInput> siteId) {
        this.siteId = siteId;
    }

    public org.springframework.graphql.data.ArgumentValue<FilterIDInput> getModelId() {
        return modelId;
    }
    public void setModelId(org.springframework.graphql.data.ArgumentValue<FilterIDInput> modelId) {
        this.modelId = modelId;
    }

    public org.springframework.graphql.data.ArgumentValue<FilterStringInput> getDataSourceType() {
        return dataSourceType;
    }
    public void setDataSourceType(org.springframework.graphql.data.ArgumentValue<FilterStringInput> dataSourceType) {
        this.dataSourceType = dataSourceType;
    }

    public org.springframework.graphql.data.ArgumentValue<FilterStringListInput> getDataSourceLabels() {
        return dataSourceLabels;
    }
    public void setDataSourceLabels(org.springframework.graphql.data.ArgumentValue<FilterStringListInput> dataSourceLabels) {
        this.dataSourceLabels = dataSourceLabels;
    }

    public java.util.List<FilterTrackInput> getAnd() {
        return and;
    }
    public void setAnd(java.util.List<FilterTrackInput> and) {
        this.and = and;
    }

    public java.util.List<FilterTrackInput> getOr() {
        return or;
    }
    public void setOr(java.util.List<FilterTrackInput> or) {
        this.or = or;
    }

    public org.springframework.graphql.data.ArgumentValue<FilterTrackInput> getNot() {
        return not;
    }
    public void setNot(org.springframework.graphql.data.ArgumentValue<FilterTrackInput> not) {
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
        final FilterTrackInput that = (FilterTrackInput) obj;
        return Objects.equals(id, that.id)
            && Objects.equals(dataSourceId, that.dataSourceId)
            && Objects.equals(time, that.time)
            && Objects.equals(timeRange, that.timeRange)
            && Objects.equals(tag, that.tag)
            && Objects.equals(position, that.position)
            && Objects.equals(identifier, that.identifier)
            && Objects.equals(attribute, that.attribute)
            && Objects.equals(pointOfInterestId, that.pointOfInterestId)
            && Objects.equals(siteId, that.siteId)
            && Objects.equals(modelId, that.modelId)
            && Objects.equals(dataSourceType, that.dataSourceType)
            && Objects.equals(dataSourceLabels, that.dataSourceLabels)
            && Objects.equals(and, that.and)
            && Objects.equals(or, that.or)
            && Objects.equals(not, that.not)
            && Objects.equals(deviceId, that.deviceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, dataSourceId, time, timeRange, tag, position, identifier, attribute, pointOfInterestId, siteId, modelId, dataSourceType, dataSourceLabels, and, or, not, deviceId);
    }


    public static FilterTrackInput.Builder builder() {
        return new FilterTrackInput.Builder();
    }

    public static class Builder {

        private org.springframework.graphql.data.ArgumentValue<FilterIDInput> id = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterIDInput> dataSourceId = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterDateTimeOffsetInput> time = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterTimeRangeInput> timeRange = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterStringInput> tag = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterPointInput> position = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterTrackPropertyInput> identifier = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterTrackPropertyInput> attribute = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterIDInput> pointOfInterestId = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterIDInput> siteId = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterIDInput> modelId = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterStringInput> dataSourceType = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterStringListInput> dataSourceLabels = org.springframework.graphql.data.ArgumentValue.omitted();
        private java.util.List<FilterTrackInput> and;
        private java.util.List<FilterTrackInput> or;
        private org.springframework.graphql.data.ArgumentValue<FilterTrackInput> not = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterIDInput> deviceId = org.springframework.graphql.data.ArgumentValue.omitted();

        public Builder() {
        }

        public Builder setId(org.springframework.graphql.data.ArgumentValue<FilterIDInput> id) {
            this.id = id;
            return this;
        }

        public Builder setDataSourceId(org.springframework.graphql.data.ArgumentValue<FilterIDInput> dataSourceId) {
            this.dataSourceId = dataSourceId;
            return this;
        }

        public Builder setTime(org.springframework.graphql.data.ArgumentValue<FilterDateTimeOffsetInput> time) {
            this.time = time;
            return this;
        }

        public Builder setTimeRange(org.springframework.graphql.data.ArgumentValue<FilterTimeRangeInput> timeRange) {
            this.timeRange = timeRange;
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

        public Builder setIdentifier(org.springframework.graphql.data.ArgumentValue<FilterTrackPropertyInput> identifier) {
            this.identifier = identifier;
            return this;
        }

        public Builder setAttribute(org.springframework.graphql.data.ArgumentValue<FilterTrackPropertyInput> attribute) {
            this.attribute = attribute;
            return this;
        }

        public Builder setPointOfInterestId(org.springframework.graphql.data.ArgumentValue<FilterIDInput> pointOfInterestId) {
            this.pointOfInterestId = pointOfInterestId;
            return this;
        }

        public Builder setSiteId(org.springframework.graphql.data.ArgumentValue<FilterIDInput> siteId) {
            this.siteId = siteId;
            return this;
        }

        public Builder setModelId(org.springframework.graphql.data.ArgumentValue<FilterIDInput> modelId) {
            this.modelId = modelId;
            return this;
        }

        public Builder setDataSourceType(org.springframework.graphql.data.ArgumentValue<FilterStringInput> dataSourceType) {
            this.dataSourceType = dataSourceType;
            return this;
        }

        public Builder setDataSourceLabels(org.springframework.graphql.data.ArgumentValue<FilterStringListInput> dataSourceLabels) {
            this.dataSourceLabels = dataSourceLabels;
            return this;
        }

        public Builder setAnd(java.util.List<FilterTrackInput> and) {
            this.and = and;
            return this;
        }

        public Builder setOr(java.util.List<FilterTrackInput> or) {
            this.or = or;
            return this;
        }

        public Builder setNot(org.springframework.graphql.data.ArgumentValue<FilterTrackInput> not) {
            this.not = not;
            return this;
        }

        @Deprecated
        public Builder setDeviceId(org.springframework.graphql.data.ArgumentValue<FilterIDInput> deviceId) {
            this.deviceId = deviceId;
            return this;
        }


        public FilterTrackInput build() {
            return new FilterTrackInput(id, dataSourceId, time, timeRange, tag, position, identifier, attribute, pointOfInterestId, siteId, modelId, dataSourceType, dataSourceLabels, and, or, not, deviceId);
        }

    }
}
