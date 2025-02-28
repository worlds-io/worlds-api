package io.worlds.api.model;


public class FilterEventProducerInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private org.springframework.graphql.data.ArgumentValue<FilterIDInput> id = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterStringInput> name = org.springframework.graphql.data.ArgumentValue.omitted();
    private java.util.List<FilterEventProducerInput> and;
    private java.util.List<FilterEventProducerInput> or;
    private org.springframework.graphql.data.ArgumentValue<FilterEventProducerInput> not = org.springframework.graphql.data.ArgumentValue.omitted();

    public FilterEventProducerInput() {
    }

    public FilterEventProducerInput(org.springframework.graphql.data.ArgumentValue<FilterIDInput> id, org.springframework.graphql.data.ArgumentValue<FilterStringInput> name, java.util.List<FilterEventProducerInput> and, java.util.List<FilterEventProducerInput> or, org.springframework.graphql.data.ArgumentValue<FilterEventProducerInput> not) {
        this.id = id;
        this.name = name;
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

    public java.util.List<FilterEventProducerInput> getAnd() {
        return and;
    }
    public void setAnd(java.util.List<FilterEventProducerInput> and) {
        this.and = and;
    }

    public java.util.List<FilterEventProducerInput> getOr() {
        return or;
    }
    public void setOr(java.util.List<FilterEventProducerInput> or) {
        this.or = or;
    }

    public org.springframework.graphql.data.ArgumentValue<FilterEventProducerInput> getNot() {
        return not;
    }
    public void setNot(org.springframework.graphql.data.ArgumentValue<FilterEventProducerInput> not) {
        this.not = not;
    }



    public static FilterEventProducerInput.Builder builder() {
        return new FilterEventProducerInput.Builder();
    }

    public static class Builder {

        private org.springframework.graphql.data.ArgumentValue<FilterIDInput> id = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterStringInput> name = org.springframework.graphql.data.ArgumentValue.omitted();
        private java.util.List<FilterEventProducerInput> and;
        private java.util.List<FilterEventProducerInput> or;
        private org.springframework.graphql.data.ArgumentValue<FilterEventProducerInput> not = org.springframework.graphql.data.ArgumentValue.omitted();

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

        public Builder setAnd(java.util.List<FilterEventProducerInput> and) {
            this.and = and;
            return this;
        }

        public Builder setOr(java.util.List<FilterEventProducerInput> or) {
            this.or = or;
            return this;
        }

        public Builder setNot(org.springframework.graphql.data.ArgumentValue<FilterEventProducerInput> not) {
            this.not = not;
            return this;
        }


        public FilterEventProducerInput build() {
            return new FilterEventProducerInput(id, name, and, or, not);
        }

    }
}
