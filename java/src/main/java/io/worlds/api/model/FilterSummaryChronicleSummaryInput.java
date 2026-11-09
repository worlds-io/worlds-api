package io.worlds.api.model;

import java.util.Objects;

/**
 * FilterSummaryChronicleSummaryInput filters summary chronicles summarized by a `summaryChronicleSummary` query.
Only one field should be provided per Filter object unless using an operator (`and` `or` `not`) as specified below.
 */
public class FilterSummaryChronicleSummaryInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private org.springframework.graphql.data.ArgumentValue<FilterTimeRangeInput> timeRange = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterStringInput> name = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterIDInput> chronicleProducerId = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterIDListInput> siteIds = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterStringListInput> labels = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterStringListInput> locations = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterStringInput> priority = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterStringInput> status = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterChronicleValidationStatusInput> validationStatus = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterJSONFieldStringInput> metadata = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterIDListInput> activityChronicleIds = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterIDListInput> eventChronicleIds = org.springframework.graphql.data.ArgumentValue.omitted();
    private java.util.List<FilterSummaryChronicleSummaryInput> and;
    private java.util.List<FilterSummaryChronicleSummaryInput> or;
    private org.springframework.graphql.data.ArgumentValue<FilterSummaryChronicleSummaryInput> not = org.springframework.graphql.data.ArgumentValue.omitted();

    public FilterSummaryChronicleSummaryInput() {
    }

    public FilterSummaryChronicleSummaryInput(org.springframework.graphql.data.ArgumentValue<FilterTimeRangeInput> timeRange, org.springframework.graphql.data.ArgumentValue<FilterStringInput> name, org.springframework.graphql.data.ArgumentValue<FilterIDInput> chronicleProducerId, org.springframework.graphql.data.ArgumentValue<FilterIDListInput> siteIds, org.springframework.graphql.data.ArgumentValue<FilterStringListInput> labels, org.springframework.graphql.data.ArgumentValue<FilterStringListInput> locations, org.springframework.graphql.data.ArgumentValue<FilterStringInput> priority, org.springframework.graphql.data.ArgumentValue<FilterStringInput> status, org.springframework.graphql.data.ArgumentValue<FilterChronicleValidationStatusInput> validationStatus, org.springframework.graphql.data.ArgumentValue<FilterJSONFieldStringInput> metadata, org.springframework.graphql.data.ArgumentValue<FilterIDListInput> activityChronicleIds, org.springframework.graphql.data.ArgumentValue<FilterIDListInput> eventChronicleIds, java.util.List<FilterSummaryChronicleSummaryInput> and, java.util.List<FilterSummaryChronicleSummaryInput> or, org.springframework.graphql.data.ArgumentValue<FilterSummaryChronicleSummaryInput> not) {
        this.timeRange = timeRange;
        this.name = name;
        this.chronicleProducerId = chronicleProducerId;
        this.siteIds = siteIds;
        this.labels = labels;
        this.locations = locations;
        this.priority = priority;
        this.status = status;
        this.validationStatus = validationStatus;
        this.metadata = metadata;
        this.activityChronicleIds = activityChronicleIds;
        this.eventChronicleIds = eventChronicleIds;
        this.and = and;
        this.or = or;
        this.not = not;
    }

    public org.springframework.graphql.data.ArgumentValue<FilterTimeRangeInput> getTimeRange() {
        return timeRange;
    }
    public void setTimeRange(org.springframework.graphql.data.ArgumentValue<FilterTimeRangeInput> timeRange) {
        this.timeRange = timeRange;
    }

    public org.springframework.graphql.data.ArgumentValue<FilterStringInput> getName() {
        return name;
    }
    public void setName(org.springframework.graphql.data.ArgumentValue<FilterStringInput> name) {
        this.name = name;
    }

    public org.springframework.graphql.data.ArgumentValue<FilterIDInput> getChronicleProducerId() {
        return chronicleProducerId;
    }
    public void setChronicleProducerId(org.springframework.graphql.data.ArgumentValue<FilterIDInput> chronicleProducerId) {
        this.chronicleProducerId = chronicleProducerId;
    }

    public org.springframework.graphql.data.ArgumentValue<FilterIDListInput> getSiteIds() {
        return siteIds;
    }
    public void setSiteIds(org.springframework.graphql.data.ArgumentValue<FilterIDListInput> siteIds) {
        this.siteIds = siteIds;
    }

    public org.springframework.graphql.data.ArgumentValue<FilterStringListInput> getLabels() {
        return labels;
    }
    public void setLabels(org.springframework.graphql.data.ArgumentValue<FilterStringListInput> labels) {
        this.labels = labels;
    }

    public org.springframework.graphql.data.ArgumentValue<FilterStringListInput> getLocations() {
        return locations;
    }
    public void setLocations(org.springframework.graphql.data.ArgumentValue<FilterStringListInput> locations) {
        this.locations = locations;
    }

    public org.springframework.graphql.data.ArgumentValue<FilterStringInput> getPriority() {
        return priority;
    }
    public void setPriority(org.springframework.graphql.data.ArgumentValue<FilterStringInput> priority) {
        this.priority = priority;
    }

    public org.springframework.graphql.data.ArgumentValue<FilterStringInput> getStatus() {
        return status;
    }
    public void setStatus(org.springframework.graphql.data.ArgumentValue<FilterStringInput> status) {
        this.status = status;
    }

    public org.springframework.graphql.data.ArgumentValue<FilterChronicleValidationStatusInput> getValidationStatus() {
        return validationStatus;
    }
    public void setValidationStatus(org.springframework.graphql.data.ArgumentValue<FilterChronicleValidationStatusInput> validationStatus) {
        this.validationStatus = validationStatus;
    }

    public org.springframework.graphql.data.ArgumentValue<FilterJSONFieldStringInput> getMetadata() {
        return metadata;
    }
    public void setMetadata(org.springframework.graphql.data.ArgumentValue<FilterJSONFieldStringInput> metadata) {
        this.metadata = metadata;
    }

    public org.springframework.graphql.data.ArgumentValue<FilterIDListInput> getActivityChronicleIds() {
        return activityChronicleIds;
    }
    public void setActivityChronicleIds(org.springframework.graphql.data.ArgumentValue<FilterIDListInput> activityChronicleIds) {
        this.activityChronicleIds = activityChronicleIds;
    }

    public org.springframework.graphql.data.ArgumentValue<FilterIDListInput> getEventChronicleIds() {
        return eventChronicleIds;
    }
    public void setEventChronicleIds(org.springframework.graphql.data.ArgumentValue<FilterIDListInput> eventChronicleIds) {
        this.eventChronicleIds = eventChronicleIds;
    }

    public java.util.List<FilterSummaryChronicleSummaryInput> getAnd() {
        return and;
    }
    public void setAnd(java.util.List<FilterSummaryChronicleSummaryInput> and) {
        this.and = and;
    }

    public java.util.List<FilterSummaryChronicleSummaryInput> getOr() {
        return or;
    }
    public void setOr(java.util.List<FilterSummaryChronicleSummaryInput> or) {
        this.or = or;
    }

    public org.springframework.graphql.data.ArgumentValue<FilterSummaryChronicleSummaryInput> getNot() {
        return not;
    }
    public void setNot(org.springframework.graphql.data.ArgumentValue<FilterSummaryChronicleSummaryInput> not) {
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
        final FilterSummaryChronicleSummaryInput that = (FilterSummaryChronicleSummaryInput) obj;
        return Objects.equals(timeRange, that.timeRange)
            && Objects.equals(name, that.name)
            && Objects.equals(chronicleProducerId, that.chronicleProducerId)
            && Objects.equals(siteIds, that.siteIds)
            && Objects.equals(labels, that.labels)
            && Objects.equals(locations, that.locations)
            && Objects.equals(priority, that.priority)
            && Objects.equals(status, that.status)
            && Objects.equals(validationStatus, that.validationStatus)
            && Objects.equals(metadata, that.metadata)
            && Objects.equals(activityChronicleIds, that.activityChronicleIds)
            && Objects.equals(eventChronicleIds, that.eventChronicleIds)
            && Objects.equals(and, that.and)
            && Objects.equals(or, that.or)
            && Objects.equals(not, that.not);
    }

    @Override
    public int hashCode() {
        return Objects.hash(timeRange, name, chronicleProducerId, siteIds, labels, locations, priority, status, validationStatus, metadata, activityChronicleIds, eventChronicleIds, and, or, not);
    }


    public static FilterSummaryChronicleSummaryInput.Builder builder() {
        return new FilterSummaryChronicleSummaryInput.Builder();
    }

    public static class Builder {

        private org.springframework.graphql.data.ArgumentValue<FilterTimeRangeInput> timeRange = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterStringInput> name = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterIDInput> chronicleProducerId = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterIDListInput> siteIds = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterStringListInput> labels = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterStringListInput> locations = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterStringInput> priority = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterStringInput> status = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterChronicleValidationStatusInput> validationStatus = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterJSONFieldStringInput> metadata = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterIDListInput> activityChronicleIds = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterIDListInput> eventChronicleIds = org.springframework.graphql.data.ArgumentValue.omitted();
        private java.util.List<FilterSummaryChronicleSummaryInput> and;
        private java.util.List<FilterSummaryChronicleSummaryInput> or;
        private org.springframework.graphql.data.ArgumentValue<FilterSummaryChronicleSummaryInput> not = org.springframework.graphql.data.ArgumentValue.omitted();

        public Builder() {
        }

        public Builder setTimeRange(org.springframework.graphql.data.ArgumentValue<FilterTimeRangeInput> timeRange) {
            this.timeRange = timeRange;
            return this;
        }

        public Builder setName(org.springframework.graphql.data.ArgumentValue<FilterStringInput> name) {
            this.name = name;
            return this;
        }

        public Builder setChronicleProducerId(org.springframework.graphql.data.ArgumentValue<FilterIDInput> chronicleProducerId) {
            this.chronicleProducerId = chronicleProducerId;
            return this;
        }

        public Builder setSiteIds(org.springframework.graphql.data.ArgumentValue<FilterIDListInput> siteIds) {
            this.siteIds = siteIds;
            return this;
        }

        public Builder setLabels(org.springframework.graphql.data.ArgumentValue<FilterStringListInput> labels) {
            this.labels = labels;
            return this;
        }

        public Builder setLocations(org.springframework.graphql.data.ArgumentValue<FilterStringListInput> locations) {
            this.locations = locations;
            return this;
        }

        public Builder setPriority(org.springframework.graphql.data.ArgumentValue<FilterStringInput> priority) {
            this.priority = priority;
            return this;
        }

        public Builder setStatus(org.springframework.graphql.data.ArgumentValue<FilterStringInput> status) {
            this.status = status;
            return this;
        }

        public Builder setValidationStatus(org.springframework.graphql.data.ArgumentValue<FilterChronicleValidationStatusInput> validationStatus) {
            this.validationStatus = validationStatus;
            return this;
        }

        public Builder setMetadata(org.springframework.graphql.data.ArgumentValue<FilterJSONFieldStringInput> metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder setActivityChronicleIds(org.springframework.graphql.data.ArgumentValue<FilterIDListInput> activityChronicleIds) {
            this.activityChronicleIds = activityChronicleIds;
            return this;
        }

        public Builder setEventChronicleIds(org.springframework.graphql.data.ArgumentValue<FilterIDListInput> eventChronicleIds) {
            this.eventChronicleIds = eventChronicleIds;
            return this;
        }

        public Builder setAnd(java.util.List<FilterSummaryChronicleSummaryInput> and) {
            this.and = and;
            return this;
        }

        public Builder setOr(java.util.List<FilterSummaryChronicleSummaryInput> or) {
            this.or = or;
            return this;
        }

        public Builder setNot(org.springframework.graphql.data.ArgumentValue<FilterSummaryChronicleSummaryInput> not) {
            this.not = not;
            return this;
        }


        public FilterSummaryChronicleSummaryInput build() {
            return new FilterSummaryChronicleSummaryInput(timeRange, name, chronicleProducerId, siteIds, labels, locations, priority, status, validationStatus, metadata, activityChronicleIds, eventChronicleIds, and, or, not);
        }

    }
}
