package io.worlds.api.model;


public class FilterTrackMessageInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private org.springframework.graphql.data.ArgumentValue<FilterIDInput> dataSourceId = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterStringInput> tag = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterPointInput> position = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterTrackPropertyInput> identifier = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterTrackPropertyInput> attribute = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterMessageStateInput> state = org.springframework.graphql.data.ArgumentValue.omitted();
    private java.util.List<FilterTrackMessageInput> and;
    private java.util.List<FilterTrackMessageInput> or;
    private org.springframework.graphql.data.ArgumentValue<FilterTrackMessageInput> not = org.springframework.graphql.data.ArgumentValue.omitted();

    public FilterTrackMessageInput() {
    }

    public FilterTrackMessageInput(org.springframework.graphql.data.ArgumentValue<FilterIDInput> dataSourceId, org.springframework.graphql.data.ArgumentValue<FilterStringInput> tag, org.springframework.graphql.data.ArgumentValue<FilterPointInput> position, org.springframework.graphql.data.ArgumentValue<FilterTrackPropertyInput> identifier, org.springframework.graphql.data.ArgumentValue<FilterTrackPropertyInput> attribute, org.springframework.graphql.data.ArgumentValue<FilterMessageStateInput> state, java.util.List<FilterTrackMessageInput> and, java.util.List<FilterTrackMessageInput> or, org.springframework.graphql.data.ArgumentValue<FilterTrackMessageInput> not) {
        this.dataSourceId = dataSourceId;
        this.tag = tag;
        this.position = position;
        this.identifier = identifier;
        this.attribute = attribute;
        this.state = state;
        this.and = and;
        this.or = or;
        this.not = not;
    }

    public org.springframework.graphql.data.ArgumentValue<FilterIDInput> getDataSourceId() {
        return dataSourceId;
    }
    public void setDataSourceId(org.springframework.graphql.data.ArgumentValue<FilterIDInput> dataSourceId) {
        this.dataSourceId = dataSourceId;
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

    public org.springframework.graphql.data.ArgumentValue<FilterMessageStateInput> getState() {
        return state;
    }
    public void setState(org.springframework.graphql.data.ArgumentValue<FilterMessageStateInput> state) {
        this.state = state;
    }

    public java.util.List<FilterTrackMessageInput> getAnd() {
        return and;
    }
    public void setAnd(java.util.List<FilterTrackMessageInput> and) {
        this.and = and;
    }

    public java.util.List<FilterTrackMessageInput> getOr() {
        return or;
    }
    public void setOr(java.util.List<FilterTrackMessageInput> or) {
        this.or = or;
    }

    public org.springframework.graphql.data.ArgumentValue<FilterTrackMessageInput> getNot() {
        return not;
    }
    public void setNot(org.springframework.graphql.data.ArgumentValue<FilterTrackMessageInput> not) {
        this.not = not;
    }



    public static FilterTrackMessageInput.Builder builder() {
        return new FilterTrackMessageInput.Builder();
    }

    public static class Builder {

        private org.springframework.graphql.data.ArgumentValue<FilterIDInput> dataSourceId = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterStringInput> tag = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterPointInput> position = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterTrackPropertyInput> identifier = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterTrackPropertyInput> attribute = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterMessageStateInput> state = org.springframework.graphql.data.ArgumentValue.omitted();
        private java.util.List<FilterTrackMessageInput> and;
        private java.util.List<FilterTrackMessageInput> or;
        private org.springframework.graphql.data.ArgumentValue<FilterTrackMessageInput> not = org.springframework.graphql.data.ArgumentValue.omitted();

        public Builder() {
        }

        public Builder setDataSourceId(org.springframework.graphql.data.ArgumentValue<FilterIDInput> dataSourceId) {
            this.dataSourceId = dataSourceId;
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

        public Builder setState(org.springframework.graphql.data.ArgumentValue<FilterMessageStateInput> state) {
            this.state = state;
            return this;
        }

        public Builder setAnd(java.util.List<FilterTrackMessageInput> and) {
            this.and = and;
            return this;
        }

        public Builder setOr(java.util.List<FilterTrackMessageInput> or) {
            this.or = or;
            return this;
        }

        public Builder setNot(org.springframework.graphql.data.ArgumentValue<FilterTrackMessageInput> not) {
            this.not = not;
            return this;
        }


        public FilterTrackMessageInput build() {
            return new FilterTrackMessageInput(dataSourceId, tag, position, identifier, attribute, state, and, or, not);
        }

    }
}
