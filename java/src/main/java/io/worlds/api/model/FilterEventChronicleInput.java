package io.worlds.api.model;


public class FilterEventChronicleInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private org.springframework.graphql.data.ArgumentValue<FilterIDInput> id = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterStringInput> name = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterDateTimeOffsetInput> timestamp = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterStringInput> timezone = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterStringInput> priority = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterStringInput> status = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterStringInput> validation = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterStringListInput> labels = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterStringListInput> locations = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterIDInput> chronicleProducerId = org.springframework.graphql.data.ArgumentValue.omitted();
    private java.util.List<FilterIDInput> activityChronicleIds;
    private java.util.List<FilterEventChronicleInput> and;
    private java.util.List<FilterEventChronicleInput> or;
    private org.springframework.graphql.data.ArgumentValue<FilterEventChronicleInput> not = org.springframework.graphql.data.ArgumentValue.omitted();

    public FilterEventChronicleInput() {
    }

    public FilterEventChronicleInput(org.springframework.graphql.data.ArgumentValue<FilterIDInput> id, org.springframework.graphql.data.ArgumentValue<FilterStringInput> name, org.springframework.graphql.data.ArgumentValue<FilterDateTimeOffsetInput> timestamp, org.springframework.graphql.data.ArgumentValue<FilterStringInput> timezone, org.springframework.graphql.data.ArgumentValue<FilterStringInput> priority, org.springframework.graphql.data.ArgumentValue<FilterStringInput> status, org.springframework.graphql.data.ArgumentValue<FilterStringInput> validation, org.springframework.graphql.data.ArgumentValue<FilterStringListInput> labels, org.springframework.graphql.data.ArgumentValue<FilterStringListInput> locations, org.springframework.graphql.data.ArgumentValue<FilterIDInput> chronicleProducerId, java.util.List<FilterIDInput> activityChronicleIds, java.util.List<FilterEventChronicleInput> and, java.util.List<FilterEventChronicleInput> or, org.springframework.graphql.data.ArgumentValue<FilterEventChronicleInput> not) {
        this.id = id;
        this.name = name;
        this.timestamp = timestamp;
        this.timezone = timezone;
        this.priority = priority;
        this.status = status;
        this.validation = validation;
        this.labels = labels;
        this.locations = locations;
        this.chronicleProducerId = chronicleProducerId;
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

    public org.springframework.graphql.data.ArgumentValue<FilterDateTimeOffsetInput> getTimestamp() {
        return timestamp;
    }
    public void setTimestamp(org.springframework.graphql.data.ArgumentValue<FilterDateTimeOffsetInput> timestamp) {
        this.timestamp = timestamp;
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

    public org.springframework.graphql.data.ArgumentValue<FilterIDInput> getChronicleProducerId() {
        return chronicleProducerId;
    }
    public void setChronicleProducerId(org.springframework.graphql.data.ArgumentValue<FilterIDInput> chronicleProducerId) {
        this.chronicleProducerId = chronicleProducerId;
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
        private org.springframework.graphql.data.ArgumentValue<FilterDateTimeOffsetInput> timestamp = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterStringInput> timezone = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterStringInput> priority = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterStringInput> status = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterStringInput> validation = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterStringListInput> labels = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterStringListInput> locations = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterIDInput> chronicleProducerId = org.springframework.graphql.data.ArgumentValue.omitted();
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

        public Builder setTimestamp(org.springframework.graphql.data.ArgumentValue<FilterDateTimeOffsetInput> timestamp) {
            this.timestamp = timestamp;
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

        public Builder setChronicleProducerId(org.springframework.graphql.data.ArgumentValue<FilterIDInput> chronicleProducerId) {
            this.chronicleProducerId = chronicleProducerId;
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
            return new FilterEventChronicleInput(id, name, timestamp, timezone, priority, status, validation, labels, locations, chronicleProducerId, activityChronicleIds, and, or, not);
        }

    }
}
