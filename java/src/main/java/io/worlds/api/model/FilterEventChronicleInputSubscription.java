package io.worlds.api.model;


public class FilterEventChronicleInputSubscription implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private org.springframework.graphql.data.ArgumentValue<FilterIDInput> id = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterStringInput> name = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterDateTimeOffsetInput> timestamp = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterStringInput> timezone = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterStringInput> priority = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterStringInput> status = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterIDInput> chronicleProducerId = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterStringInput> validation = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterStringListInput> labels = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterStringListInput> locations = org.springframework.graphql.data.ArgumentValue.omitted();
    private java.util.List<FilterEventChronicleInputSubscription> and;
    private java.util.List<FilterEventChronicleInputSubscription> or;
    private org.springframework.graphql.data.ArgumentValue<FilterEventChronicleInputSubscription> not = org.springframework.graphql.data.ArgumentValue.omitted();

    public FilterEventChronicleInputSubscription() {
    }

    public FilterEventChronicleInputSubscription(org.springframework.graphql.data.ArgumentValue<FilterIDInput> id, org.springframework.graphql.data.ArgumentValue<FilterStringInput> name, org.springframework.graphql.data.ArgumentValue<FilterDateTimeOffsetInput> timestamp, org.springframework.graphql.data.ArgumentValue<FilterStringInput> timezone, org.springframework.graphql.data.ArgumentValue<FilterStringInput> priority, org.springframework.graphql.data.ArgumentValue<FilterStringInput> status, org.springframework.graphql.data.ArgumentValue<FilterIDInput> chronicleProducerId, org.springframework.graphql.data.ArgumentValue<FilterStringInput> validation, org.springframework.graphql.data.ArgumentValue<FilterStringListInput> labels, org.springframework.graphql.data.ArgumentValue<FilterStringListInput> locations, java.util.List<FilterEventChronicleInputSubscription> and, java.util.List<FilterEventChronicleInputSubscription> or, org.springframework.graphql.data.ArgumentValue<FilterEventChronicleInputSubscription> not) {
        this.id = id;
        this.name = name;
        this.timestamp = timestamp;
        this.timezone = timezone;
        this.priority = priority;
        this.status = status;
        this.chronicleProducerId = chronicleProducerId;
        this.validation = validation;
        this.labels = labels;
        this.locations = locations;
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

    public org.springframework.graphql.data.ArgumentValue<FilterIDInput> getChronicleProducerId() {
        return chronicleProducerId;
    }
    public void setChronicleProducerId(org.springframework.graphql.data.ArgumentValue<FilterIDInput> chronicleProducerId) {
        this.chronicleProducerId = chronicleProducerId;
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
        private org.springframework.graphql.data.ArgumentValue<FilterDateTimeOffsetInput> timestamp = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterStringInput> timezone = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterStringInput> priority = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterStringInput> status = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterIDInput> chronicleProducerId = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterStringInput> validation = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterStringListInput> labels = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterStringListInput> locations = org.springframework.graphql.data.ArgumentValue.omitted();
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

        public Builder setChronicleProducerId(org.springframework.graphql.data.ArgumentValue<FilterIDInput> chronicleProducerId) {
            this.chronicleProducerId = chronicleProducerId;
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
            return new FilterEventChronicleInputSubscription(id, name, timestamp, timezone, priority, status, chronicleProducerId, validation, labels, locations, and, or, not);
        }

    }
}
