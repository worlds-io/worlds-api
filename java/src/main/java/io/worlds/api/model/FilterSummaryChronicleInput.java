package io.worlds.api.model;


public class FilterSummaryChronicleInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private org.springframework.graphql.data.ArgumentValue<FilterIDInput> id = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterStringInput> name = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterDateTimeOffsetInput> startTime = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterDateTimeOffsetInput> endTime = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterStringInput> timezone = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterStringInput> priority = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterStringInput> status = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterStringInput> validation = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterStringListInput> labels = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterStringListInput> locations = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterIDInput> chronicleDocumentProducerId = org.springframework.graphql.data.ArgumentValue.omitted();
    private java.util.List<FilterIDInput> activityChronicleIds;
    private java.util.List<FilterIDInput> eventChronicleIds;
    private java.util.List<FilterSummaryChronicleInput> and;
    private java.util.List<FilterSummaryChronicleInput> or;
    private org.springframework.graphql.data.ArgumentValue<FilterSummaryChronicleInput> not = org.springframework.graphql.data.ArgumentValue.omitted();

    public FilterSummaryChronicleInput() {
    }

    public FilterSummaryChronicleInput(org.springframework.graphql.data.ArgumentValue<FilterIDInput> id, org.springframework.graphql.data.ArgumentValue<FilterStringInput> name, org.springframework.graphql.data.ArgumentValue<FilterDateTimeOffsetInput> startTime, org.springframework.graphql.data.ArgumentValue<FilterDateTimeOffsetInput> endTime, org.springframework.graphql.data.ArgumentValue<FilterStringInput> timezone, org.springframework.graphql.data.ArgumentValue<FilterStringInput> priority, org.springframework.graphql.data.ArgumentValue<FilterStringInput> status, org.springframework.graphql.data.ArgumentValue<FilterStringInput> validation, org.springframework.graphql.data.ArgumentValue<FilterStringListInput> labels, org.springframework.graphql.data.ArgumentValue<FilterStringListInput> locations, org.springframework.graphql.data.ArgumentValue<FilterIDInput> chronicleDocumentProducerId, java.util.List<FilterIDInput> activityChronicleIds, java.util.List<FilterIDInput> eventChronicleIds, java.util.List<FilterSummaryChronicleInput> and, java.util.List<FilterSummaryChronicleInput> or, org.springframework.graphql.data.ArgumentValue<FilterSummaryChronicleInput> not) {
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
        this.chronicleDocumentProducerId = chronicleDocumentProducerId;
        this.activityChronicleIds = activityChronicleIds;
        this.eventChronicleIds = eventChronicleIds;
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

    public org.springframework.graphql.data.ArgumentValue<FilterStringListInput> getLocations() {
        return locations;
    }
    public void setLocations(org.springframework.graphql.data.ArgumentValue<FilterStringListInput> locations) {
        this.locations = locations;
    }

    public org.springframework.graphql.data.ArgumentValue<FilterIDInput> getChronicleDocumentProducerId() {
        return chronicleDocumentProducerId;
    }
    public void setChronicleDocumentProducerId(org.springframework.graphql.data.ArgumentValue<FilterIDInput> chronicleDocumentProducerId) {
        this.chronicleDocumentProducerId = chronicleDocumentProducerId;
    }

    public java.util.List<FilterIDInput> getActivityChronicleIds() {
        return activityChronicleIds;
    }
    public void setActivityChronicleIds(java.util.List<FilterIDInput> activityChronicleIds) {
        this.activityChronicleIds = activityChronicleIds;
    }

    public java.util.List<FilterIDInput> getEventChronicleIds() {
        return eventChronicleIds;
    }
    public void setEventChronicleIds(java.util.List<FilterIDInput> eventChronicleIds) {
        this.eventChronicleIds = eventChronicleIds;
    }

    public java.util.List<FilterSummaryChronicleInput> getAnd() {
        return and;
    }
    public void setAnd(java.util.List<FilterSummaryChronicleInput> and) {
        this.and = and;
    }

    public java.util.List<FilterSummaryChronicleInput> getOr() {
        return or;
    }
    public void setOr(java.util.List<FilterSummaryChronicleInput> or) {
        this.or = or;
    }

    public org.springframework.graphql.data.ArgumentValue<FilterSummaryChronicleInput> getNot() {
        return not;
    }
    public void setNot(org.springframework.graphql.data.ArgumentValue<FilterSummaryChronicleInput> not) {
        this.not = not;
    }



    public static FilterSummaryChronicleInput.Builder builder() {
        return new FilterSummaryChronicleInput.Builder();
    }

    public static class Builder {

        private org.springframework.graphql.data.ArgumentValue<FilterIDInput> id = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterStringInput> name = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterDateTimeOffsetInput> startTime = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterDateTimeOffsetInput> endTime = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterStringInput> timezone = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterStringInput> priority = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterStringInput> status = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterStringInput> validation = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterStringListInput> labels = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterStringListInput> locations = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterIDInput> chronicleDocumentProducerId = org.springframework.graphql.data.ArgumentValue.omitted();
        private java.util.List<FilterIDInput> activityChronicleIds;
        private java.util.List<FilterIDInput> eventChronicleIds;
        private java.util.List<FilterSummaryChronicleInput> and;
        private java.util.List<FilterSummaryChronicleInput> or;
        private org.springframework.graphql.data.ArgumentValue<FilterSummaryChronicleInput> not = org.springframework.graphql.data.ArgumentValue.omitted();

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

        public Builder setValidation(org.springframework.graphql.data.ArgumentValue<FilterStringInput> validation) {
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

        public Builder setChronicleDocumentProducerId(org.springframework.graphql.data.ArgumentValue<FilterIDInput> chronicleDocumentProducerId) {
            this.chronicleDocumentProducerId = chronicleDocumentProducerId;
            return this;
        }

        public Builder setActivityChronicleIds(java.util.List<FilterIDInput> activityChronicleIds) {
            this.activityChronicleIds = activityChronicleIds;
            return this;
        }

        public Builder setEventChronicleIds(java.util.List<FilterIDInput> eventChronicleIds) {
            this.eventChronicleIds = eventChronicleIds;
            return this;
        }

        public Builder setAnd(java.util.List<FilterSummaryChronicleInput> and) {
            this.and = and;
            return this;
        }

        public Builder setOr(java.util.List<FilterSummaryChronicleInput> or) {
            this.or = or;
            return this;
        }

        public Builder setNot(org.springframework.graphql.data.ArgumentValue<FilterSummaryChronicleInput> not) {
            this.not = not;
            return this;
        }


        public FilterSummaryChronicleInput build() {
            return new FilterSummaryChronicleInput(id, name, startTime, endTime, timezone, priority, status, validation, labels, locations, chronicleDocumentProducerId, activityChronicleIds, eventChronicleIds, and, or, not);
        }

    }
}
