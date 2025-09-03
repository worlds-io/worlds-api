package io.worlds.api.model;


/**
 * FilterEventInput filters [events]({{Types.event}}) based on criteria described below.
Only one field should be provided per Filter object unless using an operator (`and` `or` `not`) as specified below.
 */
public class FilterEventInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private org.springframework.graphql.data.ArgumentValue<FilterIDInput> eventProducerId = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterStringInput> type = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterStringInput> subType = org.springframework.graphql.data.ArgumentValue.omitted();
    @jakarta.validation.constraints.NotNull
    private FilterDateTimeOffsetInput time;
    private org.springframework.graphql.data.ArgumentValue<FilterBooleanInput> draft = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterStringInput> priority = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterEventValidationStatusInput> validation = org.springframework.graphql.data.ArgumentValue.omitted();
    private java.util.List<FilterEventInput> and;
    private java.util.List<FilterEventInput> or;
    private org.springframework.graphql.data.ArgumentValue<FilterEventInput> not = org.springframework.graphql.data.ArgumentValue.omitted();

    public FilterEventInput() {
    }

    public FilterEventInput(org.springframework.graphql.data.ArgumentValue<FilterIDInput> eventProducerId, org.springframework.graphql.data.ArgumentValue<FilterStringInput> type, org.springframework.graphql.data.ArgumentValue<FilterStringInput> subType, FilterDateTimeOffsetInput time, org.springframework.graphql.data.ArgumentValue<FilterBooleanInput> draft, org.springframework.graphql.data.ArgumentValue<FilterStringInput> priority, org.springframework.graphql.data.ArgumentValue<FilterEventValidationStatusInput> validation, java.util.List<FilterEventInput> and, java.util.List<FilterEventInput> or, org.springframework.graphql.data.ArgumentValue<FilterEventInput> not) {
        this.eventProducerId = eventProducerId;
        this.type = type;
        this.subType = subType;
        this.time = time;
        this.draft = draft;
        this.priority = priority;
        this.validation = validation;
        this.and = and;
        this.or = or;
        this.not = not;
    }

    public org.springframework.graphql.data.ArgumentValue<FilterIDInput> getEventProducerId() {
        return eventProducerId;
    }
    public void setEventProducerId(org.springframework.graphql.data.ArgumentValue<FilterIDInput> eventProducerId) {
        this.eventProducerId = eventProducerId;
    }

    public org.springframework.graphql.data.ArgumentValue<FilterStringInput> getType() {
        return type;
    }
    public void setType(org.springframework.graphql.data.ArgumentValue<FilterStringInput> type) {
        this.type = type;
    }

    public org.springframework.graphql.data.ArgumentValue<FilterStringInput> getSubType() {
        return subType;
    }
    public void setSubType(org.springframework.graphql.data.ArgumentValue<FilterStringInput> subType) {
        this.subType = subType;
    }

    public FilterDateTimeOffsetInput getTime() {
        return time;
    }
    public void setTime(FilterDateTimeOffsetInput time) {
        this.time = time;
    }

    public org.springframework.graphql.data.ArgumentValue<FilterBooleanInput> getDraft() {
        return draft;
    }
    public void setDraft(org.springframework.graphql.data.ArgumentValue<FilterBooleanInput> draft) {
        this.draft = draft;
    }

    public org.springframework.graphql.data.ArgumentValue<FilterStringInput> getPriority() {
        return priority;
    }
    public void setPriority(org.springframework.graphql.data.ArgumentValue<FilterStringInput> priority) {
        this.priority = priority;
    }

    public org.springframework.graphql.data.ArgumentValue<FilterEventValidationStatusInput> getValidation() {
        return validation;
    }
    public void setValidation(org.springframework.graphql.data.ArgumentValue<FilterEventValidationStatusInput> validation) {
        this.validation = validation;
    }

    public java.util.List<FilterEventInput> getAnd() {
        return and;
    }
    public void setAnd(java.util.List<FilterEventInput> and) {
        this.and = and;
    }

    public java.util.List<FilterEventInput> getOr() {
        return or;
    }
    public void setOr(java.util.List<FilterEventInput> or) {
        this.or = or;
    }

    public org.springframework.graphql.data.ArgumentValue<FilterEventInput> getNot() {
        return not;
    }
    public void setNot(org.springframework.graphql.data.ArgumentValue<FilterEventInput> not) {
        this.not = not;
    }



    public static FilterEventInput.Builder builder() {
        return new FilterEventInput.Builder();
    }

    public static class Builder {

        private org.springframework.graphql.data.ArgumentValue<FilterIDInput> eventProducerId = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterStringInput> type = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterStringInput> subType = org.springframework.graphql.data.ArgumentValue.omitted();
        private FilterDateTimeOffsetInput time;
        private org.springframework.graphql.data.ArgumentValue<FilterBooleanInput> draft = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterStringInput> priority = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterEventValidationStatusInput> validation = org.springframework.graphql.data.ArgumentValue.omitted();
        private java.util.List<FilterEventInput> and;
        private java.util.List<FilterEventInput> or;
        private org.springframework.graphql.data.ArgumentValue<FilterEventInput> not = org.springframework.graphql.data.ArgumentValue.omitted();

        public Builder() {
        }

        public Builder setEventProducerId(org.springframework.graphql.data.ArgumentValue<FilterIDInput> eventProducerId) {
            this.eventProducerId = eventProducerId;
            return this;
        }

        public Builder setType(org.springframework.graphql.data.ArgumentValue<FilterStringInput> type) {
            this.type = type;
            return this;
        }

        public Builder setSubType(org.springframework.graphql.data.ArgumentValue<FilterStringInput> subType) {
            this.subType = subType;
            return this;
        }

        public Builder setTime(FilterDateTimeOffsetInput time) {
            this.time = time;
            return this;
        }

        public Builder setDraft(org.springframework.graphql.data.ArgumentValue<FilterBooleanInput> draft) {
            this.draft = draft;
            return this;
        }

        public Builder setPriority(org.springframework.graphql.data.ArgumentValue<FilterStringInput> priority) {
            this.priority = priority;
            return this;
        }

        public Builder setValidation(org.springframework.graphql.data.ArgumentValue<FilterEventValidationStatusInput> validation) {
            this.validation = validation;
            return this;
        }

        public Builder setAnd(java.util.List<FilterEventInput> and) {
            this.and = and;
            return this;
        }

        public Builder setOr(java.util.List<FilterEventInput> or) {
            this.or = or;
            return this;
        }

        public Builder setNot(org.springframework.graphql.data.ArgumentValue<FilterEventInput> not) {
            this.not = not;
            return this;
        }


        public FilterEventInput build() {
            return new FilterEventInput(eventProducerId, type, subType, time, draft, priority, validation, and, or, not);
        }

    }
}
