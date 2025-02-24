package io.worlds.api.model;


/**
 * Standard filtration for boolean fields
 */
public class FilterBooleanInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private org.springframework.graphql.data.ArgumentValue<Boolean> eq = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<Boolean> ne = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<Boolean> attributeExists = org.springframework.graphql.data.ArgumentValue.omitted();

    public FilterBooleanInput() {
    }

    public FilterBooleanInput(org.springframework.graphql.data.ArgumentValue<Boolean> eq, org.springframework.graphql.data.ArgumentValue<Boolean> ne, org.springframework.graphql.data.ArgumentValue<Boolean> attributeExists) {
        this.eq = eq;
        this.ne = ne;
        this.attributeExists = attributeExists;
    }

    public org.springframework.graphql.data.ArgumentValue<Boolean> getEq() {
        return eq;
    }
    public void setEq(org.springframework.graphql.data.ArgumentValue<Boolean> eq) {
        this.eq = eq;
    }

    public org.springframework.graphql.data.ArgumentValue<Boolean> getNe() {
        return ne;
    }
    public void setNe(org.springframework.graphql.data.ArgumentValue<Boolean> ne) {
        this.ne = ne;
    }

    public org.springframework.graphql.data.ArgumentValue<Boolean> getAttributeExists() {
        return attributeExists;
    }
    public void setAttributeExists(org.springframework.graphql.data.ArgumentValue<Boolean> attributeExists) {
        this.attributeExists = attributeExists;
    }



    public static FilterBooleanInput.Builder builder() {
        return new FilterBooleanInput.Builder();
    }

    public static class Builder {

        private org.springframework.graphql.data.ArgumentValue<Boolean> eq = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<Boolean> ne = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<Boolean> attributeExists = org.springframework.graphql.data.ArgumentValue.omitted();

        public Builder() {
        }

        public Builder setEq(org.springframework.graphql.data.ArgumentValue<Boolean> eq) {
            this.eq = eq;
            return this;
        }

        public Builder setNe(org.springframework.graphql.data.ArgumentValue<Boolean> ne) {
            this.ne = ne;
            return this;
        }

        public Builder setAttributeExists(org.springframework.graphql.data.ArgumentValue<Boolean> attributeExists) {
            this.attributeExists = attributeExists;
            return this;
        }


        public FilterBooleanInput build() {
            return new FilterBooleanInput(eq, ne, attributeExists);
        }

    }
}
