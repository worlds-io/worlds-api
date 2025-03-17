package io.worlds.api.model;


/**
 * Standard filtration for DateTimeOffset fields
 */
public class FilterDateTimeOffsetInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private org.springframework.graphql.data.ArgumentValue<java.time.OffsetDateTime> eq = org.springframework.graphql.data.ArgumentValue.omitted();
    private java.util.List<java.time.OffsetDateTime> between;
    private org.springframework.graphql.data.ArgumentValue<Boolean> attributeExists = org.springframework.graphql.data.ArgumentValue.omitted();

    public FilterDateTimeOffsetInput() {
    }

    public FilterDateTimeOffsetInput(org.springframework.graphql.data.ArgumentValue<java.time.OffsetDateTime> eq, java.util.List<java.time.OffsetDateTime> between, org.springframework.graphql.data.ArgumentValue<Boolean> attributeExists) {
        this.eq = eq;
        this.between = between;
        this.attributeExists = attributeExists;
    }

    public org.springframework.graphql.data.ArgumentValue<java.time.OffsetDateTime> getEq() {
        return eq;
    }
    public void setEq(org.springframework.graphql.data.ArgumentValue<java.time.OffsetDateTime> eq) {
        this.eq = eq;
    }

    public java.util.List<java.time.OffsetDateTime> getBetween() {
        return between;
    }
    public void setBetween(java.util.List<java.time.OffsetDateTime> between) {
        this.between = between;
    }

    public org.springframework.graphql.data.ArgumentValue<Boolean> getAttributeExists() {
        return attributeExists;
    }
    public void setAttributeExists(org.springframework.graphql.data.ArgumentValue<Boolean> attributeExists) {
        this.attributeExists = attributeExists;
    }



    public static FilterDateTimeOffsetInput.Builder builder() {
        return new FilterDateTimeOffsetInput.Builder();
    }

    public static class Builder {

        private org.springframework.graphql.data.ArgumentValue<java.time.OffsetDateTime> eq = org.springframework.graphql.data.ArgumentValue.omitted();
        private java.util.List<java.time.OffsetDateTime> between;
        private org.springframework.graphql.data.ArgumentValue<Boolean> attributeExists = org.springframework.graphql.data.ArgumentValue.omitted();

        public Builder() {
        }

        public Builder setEq(org.springframework.graphql.data.ArgumentValue<java.time.OffsetDateTime> eq) {
            this.eq = eq;
            return this;
        }

        public Builder setBetween(java.util.List<java.time.OffsetDateTime> between) {
            this.between = between;
            return this;
        }

        public Builder setAttributeExists(org.springframework.graphql.data.ArgumentValue<Boolean> attributeExists) {
            this.attributeExists = attributeExists;
            return this;
        }


        public FilterDateTimeOffsetInput build() {
            return new FilterDateTimeOffsetInput(eq, between, attributeExists);
        }

    }
}
