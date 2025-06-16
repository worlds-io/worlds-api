package io.worlds.api.model;


/**
 * Filtration for Activity subscriber statuses
 */
public class FilterMessageStateInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private org.springframework.graphql.data.ArgumentValue<MessageStateInput> eq = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<MessageStateInput> ne = org.springframework.graphql.data.ArgumentValue.omitted();
    private java.util.List<MessageStateInput> in;

    public FilterMessageStateInput() {
    }

    public FilterMessageStateInput(org.springframework.graphql.data.ArgumentValue<MessageStateInput> eq, org.springframework.graphql.data.ArgumentValue<MessageStateInput> ne, java.util.List<MessageStateInput> in) {
        this.eq = eq;
        this.ne = ne;
        this.in = in;
    }

    public org.springframework.graphql.data.ArgumentValue<MessageStateInput> getEq() {
        return eq;
    }
    public void setEq(org.springframework.graphql.data.ArgumentValue<MessageStateInput> eq) {
        this.eq = eq;
    }

    public org.springframework.graphql.data.ArgumentValue<MessageStateInput> getNe() {
        return ne;
    }
    public void setNe(org.springframework.graphql.data.ArgumentValue<MessageStateInput> ne) {
        this.ne = ne;
    }

    public java.util.List<MessageStateInput> getIn() {
        return in;
    }
    public void setIn(java.util.List<MessageStateInput> in) {
        this.in = in;
    }



    public static FilterMessageStateInput.Builder builder() {
        return new FilterMessageStateInput.Builder();
    }

    public static class Builder {

        private org.springframework.graphql.data.ArgumentValue<MessageStateInput> eq = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<MessageStateInput> ne = org.springframework.graphql.data.ArgumentValue.omitted();
        private java.util.List<MessageStateInput> in;

        public Builder() {
        }

        public Builder setEq(org.springframework.graphql.data.ArgumentValue<MessageStateInput> eq) {
            this.eq = eq;
            return this;
        }

        public Builder setNe(org.springframework.graphql.data.ArgumentValue<MessageStateInput> ne) {
            this.ne = ne;
            return this;
        }

        public Builder setIn(java.util.List<MessageStateInput> in) {
            this.in = in;
            return this;
        }


        public FilterMessageStateInput build() {
            return new FilterMessageStateInput(eq, ne, in);
        }

    }
}
