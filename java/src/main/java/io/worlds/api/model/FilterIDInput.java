package io.worlds.api.model;


/**
 * `FilterIDInput` allows for filtering based on an ID parameter. Only one field should be provided per filter object.
 */
public class FilterIDInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private org.springframework.graphql.data.ArgumentValue<String> ne = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<String> eq = org.springframework.graphql.data.ArgumentValue.omitted();
    private java.util.List<String> in;

    public FilterIDInput() {
    }

    public FilterIDInput(org.springframework.graphql.data.ArgumentValue<String> ne, org.springframework.graphql.data.ArgumentValue<String> eq, java.util.List<String> in) {
        this.ne = ne;
        this.eq = eq;
        this.in = in;
    }

    public org.springframework.graphql.data.ArgumentValue<String> getNe() {
        return ne;
    }
    public void setNe(org.springframework.graphql.data.ArgumentValue<String> ne) {
        this.ne = ne;
    }

    public org.springframework.graphql.data.ArgumentValue<String> getEq() {
        return eq;
    }
    public void setEq(org.springframework.graphql.data.ArgumentValue<String> eq) {
        this.eq = eq;
    }

    public java.util.List<String> getIn() {
        return in;
    }
    public void setIn(java.util.List<String> in) {
        this.in = in;
    }



    public static FilterIDInput.Builder builder() {
        return new FilterIDInput.Builder();
    }

    public static class Builder {

        private org.springframework.graphql.data.ArgumentValue<String> ne = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<String> eq = org.springframework.graphql.data.ArgumentValue.omitted();
        private java.util.List<String> in;

        public Builder() {
        }

        public Builder setNe(org.springframework.graphql.data.ArgumentValue<String> ne) {
            this.ne = ne;
            return this;
        }

        public Builder setEq(org.springframework.graphql.data.ArgumentValue<String> eq) {
            this.eq = eq;
            return this;
        }

        public Builder setIn(java.util.List<String> in) {
            this.in = in;
            return this;
        }


        public FilterIDInput build() {
            return new FilterIDInput(ne, eq, in);
        }

    }
}
