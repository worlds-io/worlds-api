package io.worlds.api.model;


public class FilterEventChronicleInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private org.springframework.graphql.data.ArgumentValue<FilterIDInput> id = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterStringInput> name = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterDateTimeOffsetInput> startTimeFrom = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterDateTimeOffsetInput> startTimeTo = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterDateTimeOffsetInput> endTimeFrom = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterDateTimeOffsetInput> endTimeTo = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterStringInput> timezone = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterStringInput> priority = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterStringInput> status = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterStringInput> validation = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterStringListInput> labels = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterIDInput> chronicleDocumentProducerId = org.springframework.graphql.data.ArgumentValue.omitted();
    private java.util.List<FilterIDInput> tagIds;
    private java.util.List<FilterIDInput> siteIds;
    private java.util.List<FilterIDInput> dataSourceIds;
    private java.util.List<FilterIDInput> pointOfInterestIds;
    private java.util.List<FilterIDInput> activityChronicleIds;
    private java.util.List<FilterEventChronicleInput> and;
    private java.util.List<FilterEventChronicleInput> or;
    private org.springframework.graphql.data.ArgumentValue<FilterEventChronicleInput> not = org.springframework.graphql.data.ArgumentValue.omitted();

    public FilterEventChronicleInput() {
    }

    public FilterEventChronicleInput(org.springframework.graphql.data.ArgumentValue<FilterIDInput> id, org.springframework.graphql.data.ArgumentValue<FilterStringInput> name, org.springframework.graphql.data.ArgumentValue<FilterDateTimeOffsetInput> startTimeFrom, org.springframework.graphql.data.ArgumentValue<FilterDateTimeOffsetInput> startTimeTo, org.springframework.graphql.data.ArgumentValue<FilterDateTimeOffsetInput> endTimeFrom, org.springframework.graphql.data.ArgumentValue<FilterDateTimeOffsetInput> endTimeTo, org.springframework.graphql.data.ArgumentValue<FilterStringInput> timezone, org.springframework.graphql.data.ArgumentValue<FilterStringInput> priority, org.springframework.graphql.data.ArgumentValue<FilterStringInput> status, org.springframework.graphql.data.ArgumentValue<FilterStringInput> validation, org.springframework.graphql.data.ArgumentValue<FilterStringListInput> labels, org.springframework.graphql.data.ArgumentValue<FilterIDInput> chronicleDocumentProducerId, java.util.List<FilterIDInput> tagIds, java.util.List<FilterIDInput> siteIds, java.util.List<FilterIDInput> dataSourceIds, java.util.List<FilterIDInput> pointOfInterestIds, java.util.List<FilterIDInput> activityChronicleIds, java.util.List<FilterEventChronicleInput> and, java.util.List<FilterEventChronicleInput> or, org.springframework.graphql.data.ArgumentValue<FilterEventChronicleInput> not) {
        this.id = id;
        this.name = name;
        this.startTimeFrom = startTimeFrom;
        this.startTimeTo = startTimeTo;
        this.endTimeFrom = endTimeFrom;
        this.endTimeTo = endTimeTo;
        this.timezone = timezone;
        this.priority = priority;
        this.status = status;
        this.validation = validation;
        this.labels = labels;
        this.chronicleDocumentProducerId = chronicleDocumentProducerId;
        this.tagIds = tagIds;
        this.siteIds = siteIds;
        this.dataSourceIds = dataSourceIds;
        this.pointOfInterestIds = pointOfInterestIds;
        this.activityChronicleIds = activityChronicleIds;
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

    public org.springframework.graphql.data.ArgumentValue<FilterDateTimeOffsetInput> getStartTimeFrom() {
        return startTimeFrom;
    }
    public void setStartTimeFrom(org.springframework.graphql.data.ArgumentValue<FilterDateTimeOffsetInput> startTimeFrom) {
        this.startTimeFrom = startTimeFrom;
    }

    public org.springframework.graphql.data.ArgumentValue<FilterDateTimeOffsetInput> getStartTimeTo() {
        return startTimeTo;
    }
    public void setStartTimeTo(org.springframework.graphql.data.ArgumentValue<FilterDateTimeOffsetInput> startTimeTo) {
        this.startTimeTo = startTimeTo;
    }

    public org.springframework.graphql.data.ArgumentValue<FilterDateTimeOffsetInput> getEndTimeFrom() {
        return endTimeFrom;
    }
    public void setEndTimeFrom(org.springframework.graphql.data.ArgumentValue<FilterDateTimeOffsetInput> endTimeFrom) {
        this.endTimeFrom = endTimeFrom;
    }

    public org.springframework.graphql.data.ArgumentValue<FilterDateTimeOffsetInput> getEndTimeTo() {
        return endTimeTo;
    }
    public void setEndTimeTo(org.springframework.graphql.data.ArgumentValue<FilterDateTimeOffsetInput> endTimeTo) {
        this.endTimeTo = endTimeTo;
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

    public org.springframework.graphql.data.ArgumentValue<FilterStringInput> getValidation() {
        return validation;
    }
    public void setValidation(org.springframework.graphql.data.ArgumentValue<FilterStringInput> validation) {
        this.validation = validation;
    }

    public org.springframework.graphql.data.ArgumentValue<FilterStringListInput> getLabels() {
        return labels;
    }
    public void setLabels(org.springframework.graphql.data.ArgumentValue<FilterStringListInput> labels) {
        this.labels = labels;
    }

    public org.springframework.graphql.data.ArgumentValue<FilterIDInput> getChronicleDocumentProducerId() {
        return chronicleDocumentProducerId;
    }
    public void setChronicleDocumentProducerId(org.springframework.graphql.data.ArgumentValue<FilterIDInput> chronicleDocumentProducerId) {
        this.chronicleDocumentProducerId = chronicleDocumentProducerId;
    }

    public java.util.List<FilterIDInput> getTagIds() {
        return tagIds;
    }
    public void setTagIds(java.util.List<FilterIDInput> tagIds) {
        this.tagIds = tagIds;
    }

    public java.util.List<FilterIDInput> getSiteIds() {
        return siteIds;
    }
    public void setSiteIds(java.util.List<FilterIDInput> siteIds) {
        this.siteIds = siteIds;
    }

    public java.util.List<FilterIDInput> getDataSourceIds() {
        return dataSourceIds;
    }
    public void setDataSourceIds(java.util.List<FilterIDInput> dataSourceIds) {
        this.dataSourceIds = dataSourceIds;
    }

    public java.util.List<FilterIDInput> getPointOfInterestIds() {
        return pointOfInterestIds;
    }
    public void setPointOfInterestIds(java.util.List<FilterIDInput> pointOfInterestIds) {
        this.pointOfInterestIds = pointOfInterestIds;
    }

    public java.util.List<FilterIDInput> getActivityChronicleIds() {
        return activityChronicleIds;
    }
    public void setActivityChronicleIds(java.util.List<FilterIDInput> activityChronicleIds) {
        this.activityChronicleIds = activityChronicleIds;
    }

    public java.util.List<FilterEventChronicleInput> getAnd() {
        return and;
    }
    public void setAnd(java.util.List<FilterEventChronicleInput> and) {
        this.and = and;
    }

    public java.util.List<FilterEventChronicleInput> getOr() {
        return or;
    }
    public void setOr(java.util.List<FilterEventChronicleInput> or) {
        this.or = or;
    }

    public org.springframework.graphql.data.ArgumentValue<FilterEventChronicleInput> getNot() {
        return not;
    }
    public void setNot(org.springframework.graphql.data.ArgumentValue<FilterEventChronicleInput> not) {
        this.not = not;
    }



    public static FilterEventChronicleInput.Builder builder() {
        return new FilterEventChronicleInput.Builder();
    }

    public static class Builder {

        private org.springframework.graphql.data.ArgumentValue<FilterIDInput> id = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterStringInput> name = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterDateTimeOffsetInput> startTimeFrom = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterDateTimeOffsetInput> startTimeTo = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterDateTimeOffsetInput> endTimeFrom = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterDateTimeOffsetInput> endTimeTo = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterStringInput> timezone = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterStringInput> priority = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterStringInput> status = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterStringInput> validation = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterStringListInput> labels = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterIDInput> chronicleDocumentProducerId = org.springframework.graphql.data.ArgumentValue.omitted();
        private java.util.List<FilterIDInput> tagIds;
        private java.util.List<FilterIDInput> siteIds;
        private java.util.List<FilterIDInput> dataSourceIds;
        private java.util.List<FilterIDInput> pointOfInterestIds;
        private java.util.List<FilterIDInput> activityChronicleIds;
        private java.util.List<FilterEventChronicleInput> and;
        private java.util.List<FilterEventChronicleInput> or;
        private org.springframework.graphql.data.ArgumentValue<FilterEventChronicleInput> not = org.springframework.graphql.data.ArgumentValue.omitted();

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

        public Builder setStartTimeFrom(org.springframework.graphql.data.ArgumentValue<FilterDateTimeOffsetInput> startTimeFrom) {
            this.startTimeFrom = startTimeFrom;
            return this;
        }

        public Builder setStartTimeTo(org.springframework.graphql.data.ArgumentValue<FilterDateTimeOffsetInput> startTimeTo) {
            this.startTimeTo = startTimeTo;
            return this;
        }

        public Builder setEndTimeFrom(org.springframework.graphql.data.ArgumentValue<FilterDateTimeOffsetInput> endTimeFrom) {
            this.endTimeFrom = endTimeFrom;
            return this;
        }

        public Builder setEndTimeTo(org.springframework.graphql.data.ArgumentValue<FilterDateTimeOffsetInput> endTimeTo) {
            this.endTimeTo = endTimeTo;
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

        public Builder setValidation(org.springframework.graphql.data.ArgumentValue<FilterStringInput> validation) {
            this.validation = validation;
            return this;
        }

        public Builder setLabels(org.springframework.graphql.data.ArgumentValue<FilterStringListInput> labels) {
            this.labels = labels;
            return this;
        }

        public Builder setChronicleDocumentProducerId(org.springframework.graphql.data.ArgumentValue<FilterIDInput> chronicleDocumentProducerId) {
            this.chronicleDocumentProducerId = chronicleDocumentProducerId;
            return this;
        }

        public Builder setTagIds(java.util.List<FilterIDInput> tagIds) {
            this.tagIds = tagIds;
            return this;
        }

        public Builder setSiteIds(java.util.List<FilterIDInput> siteIds) {
            this.siteIds = siteIds;
            return this;
        }

        public Builder setDataSourceIds(java.util.List<FilterIDInput> dataSourceIds) {
            this.dataSourceIds = dataSourceIds;
            return this;
        }

        public Builder setPointOfInterestIds(java.util.List<FilterIDInput> pointOfInterestIds) {
            this.pointOfInterestIds = pointOfInterestIds;
            return this;
        }

        public Builder setActivityChronicleIds(java.util.List<FilterIDInput> activityChronicleIds) {
            this.activityChronicleIds = activityChronicleIds;
            return this;
        }

        public Builder setAnd(java.util.List<FilterEventChronicleInput> and) {
            this.and = and;
            return this;
        }

        public Builder setOr(java.util.List<FilterEventChronicleInput> or) {
            this.or = or;
            return this;
        }

        public Builder setNot(org.springframework.graphql.data.ArgumentValue<FilterEventChronicleInput> not) {
            this.not = not;
            return this;
        }


        public FilterEventChronicleInput build() {
            return new FilterEventChronicleInput(id, name, startTimeFrom, startTimeTo, endTimeFrom, endTimeTo, timezone, priority, status, validation, labels, chronicleDocumentProducerId, tagIds, siteIds, dataSourceIds, pointOfInterestIds, activityChronicleIds, and, or, not);
        }

    }
}
