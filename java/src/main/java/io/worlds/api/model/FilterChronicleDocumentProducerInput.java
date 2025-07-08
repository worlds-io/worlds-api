package io.worlds.api.model;


public class FilterChronicleDocumentProducerInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private org.springframework.graphql.data.ArgumentValue<FilterIDInput> id = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterStringInput> name = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterBooleanInput> active = org.springframework.graphql.data.ArgumentValue.omitted();
    private java.util.List<FilterChronicleDocumentProducerInput> and;
    private java.util.List<FilterChronicleDocumentProducerInput> or;
    private org.springframework.graphql.data.ArgumentValue<FilterChronicleDocumentProducerInput> not = org.springframework.graphql.data.ArgumentValue.omitted();

    public FilterChronicleDocumentProducerInput() {
    }

    public FilterChronicleDocumentProducerInput(org.springframework.graphql.data.ArgumentValue<FilterIDInput> id, org.springframework.graphql.data.ArgumentValue<FilterStringInput> name, org.springframework.graphql.data.ArgumentValue<FilterBooleanInput> active, java.util.List<FilterChronicleDocumentProducerInput> and, java.util.List<FilterChronicleDocumentProducerInput> or, org.springframework.graphql.data.ArgumentValue<FilterChronicleDocumentProducerInput> not) {
        this.id = id;
        this.name = name;
        this.active = active;
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

    public org.springframework.graphql.data.ArgumentValue<FilterBooleanInput> getActive() {
        return active;
    }
    public void setActive(org.springframework.graphql.data.ArgumentValue<FilterBooleanInput> active) {
        this.active = active;
    }

    public java.util.List<FilterChronicleDocumentProducerInput> getAnd() {
        return and;
    }
    public void setAnd(java.util.List<FilterChronicleDocumentProducerInput> and) {
        this.and = and;
    }

    public java.util.List<FilterChronicleDocumentProducerInput> getOr() {
        return or;
    }
    public void setOr(java.util.List<FilterChronicleDocumentProducerInput> or) {
        this.or = or;
    }

    public org.springframework.graphql.data.ArgumentValue<FilterChronicleDocumentProducerInput> getNot() {
        return not;
    }
    public void setNot(org.springframework.graphql.data.ArgumentValue<FilterChronicleDocumentProducerInput> not) {
        this.not = not;
    }



    public static FilterChronicleDocumentProducerInput.Builder builder() {
        return new FilterChronicleDocumentProducerInput.Builder();
    }

    public static class Builder {

        private org.springframework.graphql.data.ArgumentValue<FilterIDInput> id = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterStringInput> name = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterBooleanInput> active = org.springframework.graphql.data.ArgumentValue.omitted();
        private java.util.List<FilterChronicleDocumentProducerInput> and;
        private java.util.List<FilterChronicleDocumentProducerInput> or;
        private org.springframework.graphql.data.ArgumentValue<FilterChronicleDocumentProducerInput> not = org.springframework.graphql.data.ArgumentValue.omitted();

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

        public Builder setActive(org.springframework.graphql.data.ArgumentValue<FilterBooleanInput> active) {
            this.active = active;
            return this;
        }

        public Builder setAnd(java.util.List<FilterChronicleDocumentProducerInput> and) {
            this.and = and;
            return this;
        }

        public Builder setOr(java.util.List<FilterChronicleDocumentProducerInput> or) {
            this.or = or;
            return this;
        }

        public Builder setNot(org.springframework.graphql.data.ArgumentValue<FilterChronicleDocumentProducerInput> not) {
            this.not = not;
            return this;
        }


        public FilterChronicleDocumentProducerInput build() {
            return new FilterChronicleDocumentProducerInput(id, name, active, and, or, not);
        }

    }
}
