package io.worlds.api.model;


/**
 * FilterActivityChronicleInput filters [ActivityChronicles]({{Types.activityChronicle}}) based on criteria described below.
Only one field should be provided per Filter object unless using an operator (`and` `or` `not`) as specified below.
 */
public class FilterActivityChronicleInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private org.springframework.graphql.data.ArgumentValue<FilterIDInput> id = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterStringInput> name = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterDateTimeOffsetInput> startTime = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterDateTimeOffsetInput> endTime = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterStringInput> timezone = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterStringInput> priority = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterStringInput> status = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterChronicleValidationStatusInput> validation = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterStringListInput> labels = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterStringListInput> locations = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterIDInput> chronicleProducerId = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterIDListInput> tagIds = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterIDListInput> siteIds = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterIDListInput> dataSourceIds = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterIDListInput> pointOfInterestIds = org.springframework.graphql.data.ArgumentValue.omitted();
    private java.util.List<FilterActivityChronicleInput> and;
    private java.util.List<FilterActivityChronicleInput> or;
    private org.springframework.graphql.data.ArgumentValue<FilterActivityChronicleInput> not = org.springframework.graphql.data.ArgumentValue.omitted();

    public FilterActivityChronicleInput() {
    }

    public FilterActivityChronicleInput(org.springframework.graphql.data.ArgumentValue<FilterIDInput> id, org.springframework.graphql.data.ArgumentValue<FilterStringInput> name, org.springframework.graphql.data.ArgumentValue<FilterDateTimeOffsetInput> startTime, org.springframework.graphql.data.ArgumentValue<FilterDateTimeOffsetInput> endTime, org.springframework.graphql.data.ArgumentValue<FilterStringInput> timezone, org.springframework.graphql.data.ArgumentValue<FilterStringInput> priority, org.springframework.graphql.data.ArgumentValue<FilterStringInput> status, org.springframework.graphql.data.ArgumentValue<FilterChronicleValidationStatusInput> validation, org.springframework.graphql.data.ArgumentValue<FilterStringListInput> labels, org.springframework.graphql.data.ArgumentValue<FilterStringListInput> locations, org.springframework.graphql.data.ArgumentValue<FilterIDInput> chronicleProducerId, org.springframework.graphql.data.ArgumentValue<FilterIDListInput> tagIds, org.springframework.graphql.data.ArgumentValue<FilterIDListInput> siteIds, org.springframework.graphql.data.ArgumentValue<FilterIDListInput> dataSourceIds, org.springframework.graphql.data.ArgumentValue<FilterIDListInput> pointOfInterestIds, java.util.List<FilterActivityChronicleInput> and, java.util.List<FilterActivityChronicleInput> or, org.springframework.graphql.data.ArgumentValue<FilterActivityChronicleInput> not) {
        this.id = id;
        this.name = name;
        this.startTime = startTime;
        this.endTime = endTime;
        this.timezone = timezone;
        this.priority = priority;
        this.status = status;
        this.validation = validation;
        this.labels = labels;
        this.locations = locations;
        this.chronicleProducerId = chronicleProducerId;
        this.tagIds = tagIds;
        this.siteIds = siteIds;
        this.dataSourceIds = dataSourceIds;
        this.pointOfInterestIds = pointOfInterestIds;
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

    public org.springframework.graphql.data.ArgumentValue<FilterDateTimeOffsetInput> getStartTime() {
        return startTime;
    }
    public void setStartTime(org.springframework.graphql.data.ArgumentValue<FilterDateTimeOffsetInput> startTime) {
        this.startTime = startTime;
    }

    public org.springframework.graphql.data.ArgumentValue<FilterDateTimeOffsetInput> getEndTime() {
        return endTime;
    }
    public void setEndTime(org.springframework.graphql.data.ArgumentValue<FilterDateTimeOffsetInput> endTime) {
        this.endTime = endTime;
    }

    public org.springframework.graphql.data.ArgumentValue<FilterStringInput> getTimezone() {
        return timezone;
    }
    public void setTimezone(org.springframework.graphql.data.ArgumentValue<FilterStringInput> timezone) {
        this.timezone = timezone;
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

    public org.springframework.graphql.data.ArgumentValue<FilterChronicleValidationStatusInput> getValidation() {
        return validation;
    }
    public void setValidation(org.springframework.graphql.data.ArgumentValue<FilterChronicleValidationStatusInput> validation) {
        this.validation = validation;
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

    public org.springframework.graphql.data.ArgumentValue<FilterIDInput> getChronicleProducerId() {
        return chronicleProducerId;
    }
    public void setChronicleProducerId(org.springframework.graphql.data.ArgumentValue<FilterIDInput> chronicleProducerId) {
        this.chronicleProducerId = chronicleProducerId;
    }

    public org.springframework.graphql.data.ArgumentValue<FilterIDListInput> getTagIds() {
        return tagIds;
    }
    public void setTagIds(org.springframework.graphql.data.ArgumentValue<FilterIDListInput> tagIds) {
        this.tagIds = tagIds;
    }

    public org.springframework.graphql.data.ArgumentValue<FilterIDListInput> getSiteIds() {
        return siteIds;
    }
    public void setSiteIds(org.springframework.graphql.data.ArgumentValue<FilterIDListInput> siteIds) {
        this.siteIds = siteIds;
    }

    public org.springframework.graphql.data.ArgumentValue<FilterIDListInput> getDataSourceIds() {
        return dataSourceIds;
    }
    public void setDataSourceIds(org.springframework.graphql.data.ArgumentValue<FilterIDListInput> dataSourceIds) {
        this.dataSourceIds = dataSourceIds;
    }

    public org.springframework.graphql.data.ArgumentValue<FilterIDListInput> getPointOfInterestIds() {
        return pointOfInterestIds;
    }
    public void setPointOfInterestIds(org.springframework.graphql.data.ArgumentValue<FilterIDListInput> pointOfInterestIds) {
        this.pointOfInterestIds = pointOfInterestIds;
    }

    public java.util.List<FilterActivityChronicleInput> getAnd() {
        return and;
    }
    public void setAnd(java.util.List<FilterActivityChronicleInput> and) {
        this.and = and;
    }

    public java.util.List<FilterActivityChronicleInput> getOr() {
        return or;
    }
    public void setOr(java.util.List<FilterActivityChronicleInput> or) {
        this.or = or;
    }

    public org.springframework.graphql.data.ArgumentValue<FilterActivityChronicleInput> getNot() {
        return not;
    }
    public void setNot(org.springframework.graphql.data.ArgumentValue<FilterActivityChronicleInput> not) {
        this.not = not;
    }



    public static FilterActivityChronicleInput.Builder builder() {
        return new FilterActivityChronicleInput.Builder();
    }

    public static class Builder {

        private org.springframework.graphql.data.ArgumentValue<FilterIDInput> id = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterStringInput> name = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterDateTimeOffsetInput> startTime = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterDateTimeOffsetInput> endTime = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterStringInput> timezone = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterStringInput> priority = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterStringInput> status = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterChronicleValidationStatusInput> validation = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterStringListInput> labels = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterStringListInput> locations = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterIDInput> chronicleProducerId = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterIDListInput> tagIds = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterIDListInput> siteIds = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterIDListInput> dataSourceIds = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterIDListInput> pointOfInterestIds = org.springframework.graphql.data.ArgumentValue.omitted();
        private java.util.List<FilterActivityChronicleInput> and;
        private java.util.List<FilterActivityChronicleInput> or;
        private org.springframework.graphql.data.ArgumentValue<FilterActivityChronicleInput> not = org.springframework.graphql.data.ArgumentValue.omitted();

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

        public Builder setStartTime(org.springframework.graphql.data.ArgumentValue<FilterDateTimeOffsetInput> startTime) {
            this.startTime = startTime;
            return this;
        }

        public Builder setEndTime(org.springframework.graphql.data.ArgumentValue<FilterDateTimeOffsetInput> endTime) {
            this.endTime = endTime;
            return this;
        }

        public Builder setTimezone(org.springframework.graphql.data.ArgumentValue<FilterStringInput> timezone) {
            this.timezone = timezone;
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

        public Builder setValidation(org.springframework.graphql.data.ArgumentValue<FilterChronicleValidationStatusInput> validation) {
            this.validation = validation;
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

        public Builder setChronicleProducerId(org.springframework.graphql.data.ArgumentValue<FilterIDInput> chronicleProducerId) {
            this.chronicleProducerId = chronicleProducerId;
            return this;
        }

        public Builder setTagIds(org.springframework.graphql.data.ArgumentValue<FilterIDListInput> tagIds) {
            this.tagIds = tagIds;
            return this;
        }

        public Builder setSiteIds(org.springframework.graphql.data.ArgumentValue<FilterIDListInput> siteIds) {
            this.siteIds = siteIds;
            return this;
        }

        public Builder setDataSourceIds(org.springframework.graphql.data.ArgumentValue<FilterIDListInput> dataSourceIds) {
            this.dataSourceIds = dataSourceIds;
            return this;
        }

        public Builder setPointOfInterestIds(org.springframework.graphql.data.ArgumentValue<FilterIDListInput> pointOfInterestIds) {
            this.pointOfInterestIds = pointOfInterestIds;
            return this;
        }

        public Builder setAnd(java.util.List<FilterActivityChronicleInput> and) {
            this.and = and;
            return this;
        }

        public Builder setOr(java.util.List<FilterActivityChronicleInput> or) {
            this.or = or;
            return this;
        }

        public Builder setNot(org.springframework.graphql.data.ArgumentValue<FilterActivityChronicleInput> not) {
            this.not = not;
            return this;
        }


        public FilterActivityChronicleInput build() {
            return new FilterActivityChronicleInput(id, name, startTime, endTime, timezone, priority, status, validation, labels, locations, chronicleProducerId, tagIds, siteIds, dataSourceIds, pointOfInterestIds, and, or, not);
        }

    }
}
