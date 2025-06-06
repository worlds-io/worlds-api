package io.worlds.api.model;


public class FilterEventActivityInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private org.springframework.graphql.data.ArgumentValue<FilterIDInput> eventProducerId = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterStringInput> type = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterStringInput> subType = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterBooleanInput> draft = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterStringInput> priority = org.springframework.graphql.data.ArgumentValue.omitted();
    private java.util.List<FilterEventActivityInput> and;
    private java.util.List<FilterEventActivityInput> or;
    private org.springframework.graphql.data.ArgumentValue<FilterEventActivityInput> not = org.springframework.graphql.data.ArgumentValue.omitted();

    public FilterEventActivityInput() {
    }

    public FilterEventActivityInput(org.springframework.graphql.data.ArgumentValue<FilterIDInput> eventProducerId, org.springframework.graphql.data.ArgumentValue<FilterStringInput> type, org.springframework.graphql.data.ArgumentValue<FilterStringInput> subType, org.springframework.graphql.data.ArgumentValue<FilterBooleanInput> draft, org.springframework.graphql.data.ArgumentValue<FilterStringInput> priority, java.util.List<FilterEventActivityInput> and, java.util.List<FilterEventActivityInput> or, org.springframework.graphql.data.ArgumentValue<FilterEventActivityInput> not) {
        this.eventProducerId = eventProducerId;
        this.type = type;
        this.subType = subType;
        this.draft = draft;
        this.priority = priority;
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

    public java.util.List<FilterEventActivityInput> getAnd() {
        return and;
    }
    public void setAnd(java.util.List<FilterEventActivityInput> and) {
        this.and = and;
    }

    public java.util.List<FilterEventActivityInput> getOr() {
        return or;
    }
    public void setOr(java.util.List<FilterEventActivityInput> or) {
        this.or = or;
    }

    public org.springframework.graphql.data.ArgumentValue<FilterEventActivityInput> getNot() {
        return not;
    }
    public void setNot(org.springframework.graphql.data.ArgumentValue<FilterEventActivityInput> not) {
        this.not = not;
    }



    public static FilterEventActivityInput.Builder builder() {
        return new FilterEventActivityInput.Builder();
    }

    public static class Builder {

        private org.springframework.graphql.data.ArgumentValue<FilterIDInput> eventProducerId = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterStringInput> type = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterStringInput> subType = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterBooleanInput> draft = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterStringInput> priority = org.springframework.graphql.data.ArgumentValue.omitted();
        private java.util.List<FilterEventActivityInput> and;
        private java.util.List<FilterEventActivityInput> or;
        private org.springframework.graphql.data.ArgumentValue<FilterEventActivityInput> not = org.springframework.graphql.data.ArgumentValue.omitted();

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

        public Builder setDraft(org.springframework.graphql.data.ArgumentValue<FilterBooleanInput> draft) {
            this.draft = draft;
            return this;
        }

        public Builder setPriority(org.springframework.graphql.data.ArgumentValue<FilterStringInput> priority) {
            this.priority = priority;
            return this;
        }

        public Builder setAnd(java.util.List<FilterEventActivityInput> and) {
            this.and = and;
            return this;
        }

        public Builder setOr(java.util.List<FilterEventActivityInput> or) {
            this.or = or;
            return this;
        }

        public Builder setNot(org.springframework.graphql.data.ArgumentValue<FilterEventActivityInput> not) {
            this.not = not;
            return this;
        }


        public FilterEventActivityInput build() {
            return new FilterEventActivityInput(eventProducerId, type, subType, draft, priority, and, or, not);
        }

    }
}
