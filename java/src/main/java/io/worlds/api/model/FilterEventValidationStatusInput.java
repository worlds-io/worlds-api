package io.worlds.api.model;

import java.util.Objects;

/**
 * `FilterEventValidationStatusInput` allows for filtering based on an event's validation status. Only one field should be provided per filter object.
 */
public class FilterEventValidationStatusInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private org.springframework.graphql.data.ArgumentValue<EventValidationStatus> eq = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<EventValidationStatus> ne = org.springframework.graphql.data.ArgumentValue.omitted();
    private java.util.List<EventValidationStatus> in;
    private org.springframework.graphql.data.ArgumentValue<Boolean> attributeExists = org.springframework.graphql.data.ArgumentValue.omitted();

    public FilterEventValidationStatusInput() {
    }

    public FilterEventValidationStatusInput(org.springframework.graphql.data.ArgumentValue<EventValidationStatus> eq, org.springframework.graphql.data.ArgumentValue<EventValidationStatus> ne, java.util.List<EventValidationStatus> in, org.springframework.graphql.data.ArgumentValue<Boolean> attributeExists) {
        this.eq = eq;
        this.ne = ne;
        this.in = in;
        this.attributeExists = attributeExists;
    }

    public org.springframework.graphql.data.ArgumentValue<EventValidationStatus> getEq() {
        return eq;
    }
    public void setEq(org.springframework.graphql.data.ArgumentValue<EventValidationStatus> eq) {
        this.eq = eq;
    }

    public org.springframework.graphql.data.ArgumentValue<EventValidationStatus> getNe() {
        return ne;
    }
    public void setNe(org.springframework.graphql.data.ArgumentValue<EventValidationStatus> ne) {
        this.ne = ne;
    }

    public java.util.List<EventValidationStatus> getIn() {
        return in;
    }
    public void setIn(java.util.List<EventValidationStatus> in) {
        this.in = in;
    }

    public org.springframework.graphql.data.ArgumentValue<Boolean> getAttributeExists() {
        return attributeExists;
    }
    public void setAttributeExists(org.springframework.graphql.data.ArgumentValue<Boolean> attributeExists) {
        this.attributeExists = attributeExists;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final FilterEventValidationStatusInput that = (FilterEventValidationStatusInput) obj;
        return Objects.equals(eq, that.eq)
            && Objects.equals(ne, that.ne)
            && Objects.equals(in, that.in)
            && Objects.equals(attributeExists, that.attributeExists);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eq, ne, in, attributeExists);
    }


    public static FilterEventValidationStatusInput.Builder builder() {
        return new FilterEventValidationStatusInput.Builder();
    }

    public static class Builder {

        private org.springframework.graphql.data.ArgumentValue<EventValidationStatus> eq = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<EventValidationStatus> ne = org.springframework.graphql.data.ArgumentValue.omitted();
        private java.util.List<EventValidationStatus> in;
        private org.springframework.graphql.data.ArgumentValue<Boolean> attributeExists = org.springframework.graphql.data.ArgumentValue.omitted();

        public Builder() {
        }

        public Builder setEq(org.springframework.graphql.data.ArgumentValue<EventValidationStatus> eq) {
            this.eq = eq;
            return this;
        }

        public Builder setNe(org.springframework.graphql.data.ArgumentValue<EventValidationStatus> ne) {
            this.ne = ne;
            return this;
        }

        public Builder setIn(java.util.List<EventValidationStatus> in) {
            this.in = in;
            return this;
        }

        public Builder setAttributeExists(org.springframework.graphql.data.ArgumentValue<Boolean> attributeExists) {
            this.attributeExists = attributeExists;
            return this;
        }


        public FilterEventValidationStatusInput build() {
            return new FilterEventValidationStatusInput(eq, ne, in, attributeExists);
        }

    }
}
