package io.worlds.api.model;


/**
 * `FilterChronicleValidationStatusInput` allows for filtering based on an chronicle's validation status. Only one field should be provided per filter object.
 */
public class FilterChronicleValidationStatusInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private org.springframework.graphql.data.ArgumentValue<ChronicleValidationStatus> eq = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<ChronicleValidationStatus> ne = org.springframework.graphql.data.ArgumentValue.omitted();
    private java.util.List<ChronicleValidationStatus> in;
    private org.springframework.graphql.data.ArgumentValue<Boolean> attributeExists = org.springframework.graphql.data.ArgumentValue.omitted();

    public FilterChronicleValidationStatusInput() {
    }

    public FilterChronicleValidationStatusInput(org.springframework.graphql.data.ArgumentValue<ChronicleValidationStatus> eq, org.springframework.graphql.data.ArgumentValue<ChronicleValidationStatus> ne, java.util.List<ChronicleValidationStatus> in, org.springframework.graphql.data.ArgumentValue<Boolean> attributeExists) {
        this.eq = eq;
        this.ne = ne;
        this.in = in;
        this.attributeExists = attributeExists;
    }

    public org.springframework.graphql.data.ArgumentValue<ChronicleValidationStatus> getEq() {
        return eq;
    }
    public void setEq(org.springframework.graphql.data.ArgumentValue<ChronicleValidationStatus> eq) {
        this.eq = eq;
    }

    public org.springframework.graphql.data.ArgumentValue<ChronicleValidationStatus> getNe() {
        return ne;
    }
    public void setNe(org.springframework.graphql.data.ArgumentValue<ChronicleValidationStatus> ne) {
        this.ne = ne;
    }

    public java.util.List<ChronicleValidationStatus> getIn() {
        return in;
    }
    public void setIn(java.util.List<ChronicleValidationStatus> in) {
        this.in = in;
    }

    public org.springframework.graphql.data.ArgumentValue<Boolean> getAttributeExists() {
        return attributeExists;
    }
    public void setAttributeExists(org.springframework.graphql.data.ArgumentValue<Boolean> attributeExists) {
        this.attributeExists = attributeExists;
    }



    public static FilterChronicleValidationStatusInput.Builder builder() {
        return new FilterChronicleValidationStatusInput.Builder();
    }

    public static class Builder {

        private org.springframework.graphql.data.ArgumentValue<ChronicleValidationStatus> eq = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<ChronicleValidationStatus> ne = org.springframework.graphql.data.ArgumentValue.omitted();
        private java.util.List<ChronicleValidationStatus> in;
        private org.springframework.graphql.data.ArgumentValue<Boolean> attributeExists = org.springframework.graphql.data.ArgumentValue.omitted();

        public Builder() {
        }

        public Builder setEq(org.springframework.graphql.data.ArgumentValue<ChronicleValidationStatus> eq) {
            this.eq = eq;
            return this;
        }

        public Builder setNe(org.springframework.graphql.data.ArgumentValue<ChronicleValidationStatus> ne) {
            this.ne = ne;
            return this;
        }

        public Builder setIn(java.util.List<ChronicleValidationStatus> in) {
            this.in = in;
            return this;
        }

        public Builder setAttributeExists(org.springframework.graphql.data.ArgumentValue<Boolean> attributeExists) {
            this.attributeExists = attributeExists;
            return this;
        }


        public FilterChronicleValidationStatusInput build() {
            return new FilterChronicleValidationStatusInput(eq, ne, in, attributeExists);
        }

    }
}
