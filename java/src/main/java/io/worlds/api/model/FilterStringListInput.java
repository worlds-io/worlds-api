package io.worlds.api.model;


public class FilterStringListInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private java.util.List<String> eq;
    private java.util.List<String> in;
    private org.springframework.graphql.data.ArgumentValue<FilterStringListInput> not = org.springframework.graphql.data.ArgumentValue.omitted();

    public FilterStringListInput() {
    }

    public FilterStringListInput(java.util.List<String> eq, java.util.List<String> in, org.springframework.graphql.data.ArgumentValue<FilterStringListInput> not) {
        this.eq = eq;
        this.in = in;
        this.not = not;
    }

    public java.util.List<String> getEq() {
        return eq;
    }
    public void setEq(java.util.List<String> eq) {
        this.eq = eq;
    }

    public java.util.List<String> getIn() {
        return in;
    }
    public void setIn(java.util.List<String> in) {
        this.in = in;
    }

    public org.springframework.graphql.data.ArgumentValue<FilterStringListInput> getNot() {
        return not;
    }
    public void setNot(org.springframework.graphql.data.ArgumentValue<FilterStringListInput> not) {
        this.not = not;
    }



    public static FilterStringListInput.Builder builder() {
        return new FilterStringListInput.Builder();
    }

    public static class Builder {

        private java.util.List<String> eq;
        private java.util.List<String> in;
        private org.springframework.graphql.data.ArgumentValue<FilterStringListInput> not = org.springframework.graphql.data.ArgumentValue.omitted();

        public Builder() {
        }

        public Builder setEq(java.util.List<String> eq) {
            this.eq = eq;
            return this;
        }

        public Builder setIn(java.util.List<String> in) {
            this.in = in;
            return this;
        }

        public Builder setNot(org.springframework.graphql.data.ArgumentValue<FilterStringListInput> not) {
            this.not = not;
            return this;
        }


        public FilterStringListInput build() {
            return new FilterStringListInput(eq, in, not);
        }

    }
}
