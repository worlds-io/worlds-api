package io.worlds.api.model;


public class FilterEventChronicleInputSubscription implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private org.springframework.graphql.data.ArgumentValue<FilterIDInput> id = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterStringInput> name = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterStringInput> description = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterDateTimeOffsetInput> startTime = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterDateTimeOffsetInput> endTime = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterStringInput> timezone = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterStringInput> priority = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterStringInput> status = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterIDInput> chronicleDocumentProducerId = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterStringInput> validation = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterStringListInput> labels = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterIDListInput> siteIds = org.springframework.graphql.data.ArgumentValue.omitted();
    private java.util.List<FilterIDListInput> dataSourceIds;
    private org.springframework.graphql.data.ArgumentValue<FilterIDListInput> tagIds = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterIDListInput> pointOfInterestIds = org.springframework.graphql.data.ArgumentValue.omitted();
    private java.util.List<FilterEventChronicleInputSubscription> and;
    private java.util.List<FilterEventChronicleInputSubscription> or;
    private org.springframework.graphql.data.ArgumentValue<FilterEventChronicleInputSubscription> not = org.springframework.graphql.data.ArgumentValue.omitted();

    public FilterEventChronicleInputSubscription() {
    }

    public FilterEventChronicleInputSubscription(org.springframework.graphql.data.ArgumentValue<FilterIDInput> id, org.springframework.graphql.data.ArgumentValue<FilterStringInput> name, org.springframework.graphql.data.ArgumentValue<FilterStringInput> description, org.springframework.graphql.data.ArgumentValue<FilterDateTimeOffsetInput> startTime, org.springframework.graphql.data.ArgumentValue<FilterDateTimeOffsetInput> endTime, org.springframework.graphql.data.ArgumentValue<FilterStringInput> timezone, org.springframework.graphql.data.ArgumentValue<FilterStringInput> priority, org.springframework.graphql.data.ArgumentValue<FilterStringInput> status, org.springframework.graphql.data.ArgumentValue<FilterIDInput> chronicleDocumentProducerId, org.springframework.graphql.data.ArgumentValue<FilterStringInput> validation, org.springframework.graphql.data.ArgumentValue<FilterStringListInput> labels, org.springframework.graphql.data.ArgumentValue<FilterIDListInput> siteIds, java.util.List<FilterIDListInput> dataSourceIds, org.springframework.graphql.data.ArgumentValue<FilterIDListInput> tagIds, org.springframework.graphql.data.ArgumentValue<FilterIDListInput> pointOfInterestIds, java.util.List<FilterEventChronicleInputSubscription> and, java.util.List<FilterEventChronicleInputSubscription> or, org.springframework.graphql.data.ArgumentValue<FilterEventChronicleInputSubscription> not) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.startTime = startTime;
        this.endTime = endTime;
        this.timezone = timezone;
        this.priority = priority;
        this.status = status;
        this.chronicleDocumentProducerId = chronicleDocumentProducerId;
        this.validation = validation;
        this.labels = labels;
        this.siteIds = siteIds;
        this.dataSourceIds = dataSourceIds;
        this.tagIds = tagIds;
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

    public org.springframework.graphql.data.ArgumentValue<FilterStringInput> getDescription() {
        return description;
    }
    public void setDescription(org.springframework.graphql.data.ArgumentValue<FilterStringInput> description) {
        this.description = description;
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

    public org.springframework.graphql.data.ArgumentValue<FilterIDInput> getChronicleDocumentProducerId() {
        return chronicleDocumentProducerId;
    }
    public void setChronicleDocumentProducerId(org.springframework.graphql.data.ArgumentValue<FilterIDInput> chronicleDocumentProducerId) {
        this.chronicleDocumentProducerId = chronicleDocumentProducerId;
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

    public org.springframework.graphql.data.ArgumentValue<FilterIDListInput> getSiteIds() {
        return siteIds;
    }
    public void setSiteIds(org.springframework.graphql.data.ArgumentValue<FilterIDListInput> siteIds) {
        this.siteIds = siteIds;
    }

    public java.util.List<FilterIDListInput> getDataSourceIds() {
        return dataSourceIds;
    }
    public void setDataSourceIds(java.util.List<FilterIDListInput> dataSourceIds) {
        this.dataSourceIds = dataSourceIds;
    }

    public org.springframework.graphql.data.ArgumentValue<FilterIDListInput> getTagIds() {
        return tagIds;
    }
    public void setTagIds(org.springframework.graphql.data.ArgumentValue<FilterIDListInput> tagIds) {
        this.tagIds = tagIds;
    }

    public org.springframework.graphql.data.ArgumentValue<FilterIDListInput> getPointOfInterestIds() {
        return pointOfInterestIds;
    }
    public void setPointOfInterestIds(org.springframework.graphql.data.ArgumentValue<FilterIDListInput> pointOfInterestIds) {
        this.pointOfInterestIds = pointOfInterestIds;
    }

    public java.util.List<FilterEventChronicleInputSubscription> getAnd() {
        return and;
    }
    public void setAnd(java.util.List<FilterEventChronicleInputSubscription> and) {
        this.and = and;
    }

    public java.util.List<FilterEventChronicleInputSubscription> getOr() {
        return or;
    }
    public void setOr(java.util.List<FilterEventChronicleInputSubscription> or) {
        this.or = or;
    }

    public org.springframework.graphql.data.ArgumentValue<FilterEventChronicleInputSubscription> getNot() {
        return not;
    }
    public void setNot(org.springframework.graphql.data.ArgumentValue<FilterEventChronicleInputSubscription> not) {
        this.not = not;
    }



    public static FilterEventChronicleInputSubscription.Builder builder() {
        return new FilterEventChronicleInputSubscription.Builder();
    }

    public static class Builder {

        private org.springframework.graphql.data.ArgumentValue<FilterIDInput> id = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterStringInput> name = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterStringInput> description = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterDateTimeOffsetInput> startTime = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterDateTimeOffsetInput> endTime = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterStringInput> timezone = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterStringInput> priority = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterStringInput> status = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterIDInput> chronicleDocumentProducerId = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterStringInput> validation = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterStringListInput> labels = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterIDListInput> siteIds = org.springframework.graphql.data.ArgumentValue.omitted();
        private java.util.List<FilterIDListInput> dataSourceIds;
        private org.springframework.graphql.data.ArgumentValue<FilterIDListInput> tagIds = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterIDListInput> pointOfInterestIds = org.springframework.graphql.data.ArgumentValue.omitted();
        private java.util.List<FilterEventChronicleInputSubscription> and;
        private java.util.List<FilterEventChronicleInputSubscription> or;
        private org.springframework.graphql.data.ArgumentValue<FilterEventChronicleInputSubscription> not = org.springframework.graphql.data.ArgumentValue.omitted();

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

        public Builder setDescription(org.springframework.graphql.data.ArgumentValue<FilterStringInput> description) {
            this.description = description;
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

        public Builder setChronicleDocumentProducerId(org.springframework.graphql.data.ArgumentValue<FilterIDInput> chronicleDocumentProducerId) {
            this.chronicleDocumentProducerId = chronicleDocumentProducerId;
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

        public Builder setSiteIds(org.springframework.graphql.data.ArgumentValue<FilterIDListInput> siteIds) {
            this.siteIds = siteIds;
            return this;
        }

        public Builder setDataSourceIds(java.util.List<FilterIDListInput> dataSourceIds) {
            this.dataSourceIds = dataSourceIds;
            return this;
        }

        public Builder setTagIds(org.springframework.graphql.data.ArgumentValue<FilterIDListInput> tagIds) {
            this.tagIds = tagIds;
            return this;
        }

        public Builder setPointOfInterestIds(org.springframework.graphql.data.ArgumentValue<FilterIDListInput> pointOfInterestIds) {
            this.pointOfInterestIds = pointOfInterestIds;
            return this;
        }

        public Builder setAnd(java.util.List<FilterEventChronicleInputSubscription> and) {
            this.and = and;
            return this;
        }

        public Builder setOr(java.util.List<FilterEventChronicleInputSubscription> or) {
            this.or = or;
            return this;
        }

        public Builder setNot(org.springframework.graphql.data.ArgumentValue<FilterEventChronicleInputSubscription> not) {
            this.not = not;
            return this;
        }


        public FilterEventChronicleInputSubscription build() {
            return new FilterEventChronicleInputSubscription(id, name, description, startTime, endTime, timezone, priority, status, chronicleDocumentProducerId, validation, labels, siteIds, dataSourceIds, tagIds, pointOfInterestIds, and, or, not);
        }

    }
}
