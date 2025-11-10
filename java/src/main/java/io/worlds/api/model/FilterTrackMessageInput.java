package io.worlds.api.model;

import java.util.Objects;

/**
 * `FilterTrackMessageInput` allows for filtering a [`tracks` subscription]({{Subscriptions.tracks}}) based on criteria described below.
Only one field should be provided per Filter object unless using an operator (`and` `or` `not`) as specified below
 */
public class FilterTrackMessageInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private org.springframework.graphql.data.ArgumentValue<FilterIDInput> id = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterIDInput> dataSourceId = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterStringInput> tag = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterPointInput> position = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterTrackPropertyInput> identifier = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterTrackPropertyInput> attribute = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterIDInput> pointOfInterestId = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterStringInput> dataSourceType = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterStringListInput> dataSourceLabels = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterMessageStateInput> state = org.springframework.graphql.data.ArgumentValue.omitted();
    private java.util.List<FilterTrackMessageInput> and;
    private java.util.List<FilterTrackMessageInput> or;
    private org.springframework.graphql.data.ArgumentValue<FilterTrackMessageInput> not = org.springframework.graphql.data.ArgumentValue.omitted();

    public FilterTrackMessageInput() {
    }

    public FilterTrackMessageInput(org.springframework.graphql.data.ArgumentValue<FilterIDInput> id, org.springframework.graphql.data.ArgumentValue<FilterIDInput> dataSourceId, org.springframework.graphql.data.ArgumentValue<FilterStringInput> tag, org.springframework.graphql.data.ArgumentValue<FilterPointInput> position, org.springframework.graphql.data.ArgumentValue<FilterTrackPropertyInput> identifier, org.springframework.graphql.data.ArgumentValue<FilterTrackPropertyInput> attribute, org.springframework.graphql.data.ArgumentValue<FilterIDInput> pointOfInterestId, org.springframework.graphql.data.ArgumentValue<FilterStringInput> dataSourceType, org.springframework.graphql.data.ArgumentValue<FilterStringListInput> dataSourceLabels, org.springframework.graphql.data.ArgumentValue<FilterMessageStateInput> state, java.util.List<FilterTrackMessageInput> and, java.util.List<FilterTrackMessageInput> or, org.springframework.graphql.data.ArgumentValue<FilterTrackMessageInput> not) {
        this.id = id;
        this.dataSourceId = dataSourceId;
        this.tag = tag;
        this.position = position;
        this.identifier = identifier;
        this.attribute = attribute;
        this.pointOfInterestId = pointOfInterestId;
        this.dataSourceType = dataSourceType;
        this.dataSourceLabels = dataSourceLabels;
        this.state = state;
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

    public org.springframework.graphql.data.ArgumentValue<FilterIDInput> getPointOfInterestId() {
        return pointOfInterestId;
    }
    public void setPointOfInterestId(org.springframework.graphql.data.ArgumentValue<FilterIDInput> pointOfInterestId) {
        this.pointOfInterestId = pointOfInterestId;
    }

    public org.springframework.graphql.data.ArgumentValue<FilterStringInput> getDataSourceType() {
        return dataSourceType;
    }
    public void setDataSourceType(org.springframework.graphql.data.ArgumentValue<FilterStringInput> dataSourceType) {
        this.dataSourceType = dataSourceType;
    }

    public org.springframework.graphql.data.ArgumentValue<FilterStringListInput> getDataSourceLabels() {
        return dataSourceLabels;
    }
    public void setDataSourceLabels(org.springframework.graphql.data.ArgumentValue<FilterStringListInput> dataSourceLabels) {
        this.dataSourceLabels = dataSourceLabels;
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

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final FilterTrackMessageInput that = (FilterTrackMessageInput) obj;
        return Objects.equals(id, that.id)
            && Objects.equals(dataSourceId, that.dataSourceId)
            && Objects.equals(tag, that.tag)
            && Objects.equals(position, that.position)
            && Objects.equals(identifier, that.identifier)
            && Objects.equals(attribute, that.attribute)
            && Objects.equals(pointOfInterestId, that.pointOfInterestId)
            && Objects.equals(dataSourceType, that.dataSourceType)
            && Objects.equals(dataSourceLabels, that.dataSourceLabels)
            && Objects.equals(state, that.state)
            && Objects.equals(and, that.and)
            && Objects.equals(or, that.or)
            && Objects.equals(not, that.not);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, dataSourceId, tag, position, identifier, attribute, pointOfInterestId, dataSourceType, dataSourceLabels, state, and, or, not);
    }


    public static FilterTrackMessageInput.Builder builder() {
        return new FilterTrackMessageInput.Builder();
    }

    public static class Builder {

        private org.springframework.graphql.data.ArgumentValue<FilterIDInput> id = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterIDInput> dataSourceId = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterStringInput> tag = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterPointInput> position = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterTrackPropertyInput> identifier = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterTrackPropertyInput> attribute = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterIDInput> pointOfInterestId = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterStringInput> dataSourceType = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterStringListInput> dataSourceLabels = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterMessageStateInput> state = org.springframework.graphql.data.ArgumentValue.omitted();
        private java.util.List<FilterTrackMessageInput> and;
        private java.util.List<FilterTrackMessageInput> or;
        private org.springframework.graphql.data.ArgumentValue<FilterTrackMessageInput> not = org.springframework.graphql.data.ArgumentValue.omitted();

        public Builder() {
        }

        public Builder setId(org.springframework.graphql.data.ArgumentValue<FilterIDInput> id) {
            this.id = id;
            return this;
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

        public Builder setPointOfInterestId(org.springframework.graphql.data.ArgumentValue<FilterIDInput> pointOfInterestId) {
            this.pointOfInterestId = pointOfInterestId;
            return this;
        }

        public Builder setDataSourceType(org.springframework.graphql.data.ArgumentValue<FilterStringInput> dataSourceType) {
            this.dataSourceType = dataSourceType;
            return this;
        }

        public Builder setDataSourceLabels(org.springframework.graphql.data.ArgumentValue<FilterStringListInput> dataSourceLabels) {
            this.dataSourceLabels = dataSourceLabels;
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
            return new FilterTrackMessageInput(id, dataSourceId, tag, position, identifier, attribute, pointOfInterestId, dataSourceType, dataSourceLabels, state, and, or, not);
        }

    }
}
