package io.worlds.api.model;


public class FilterIDListInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private java.util.List<String> equals;
    private java.util.List<String> in;
    private org.springframework.graphql.data.ArgumentValue<FilterIDListInput> not = org.springframework.graphql.data.ArgumentValue.omitted();

    public FilterIDListInput() {
    }

    public FilterIDListInput(java.util.List<String> equals, java.util.List<String> in, org.springframework.graphql.data.ArgumentValue<FilterIDListInput> not) {
        this.equals = equals;
        this.in = in;
        this.not = not;
    }

    public java.util.List<String> getEquals() {
        return equals;
    }
    public void setEquals(java.util.List<String> equals) {
        this.equals = equals;
    }

    public java.util.List<String> getIn() {
        return in;
    }
    public void setIn(java.util.List<String> in) {
        this.in = in;
    }

    public org.springframework.graphql.data.ArgumentValue<FilterIDListInput> getNot() {
        return not;
    }
    public void setNot(org.springframework.graphql.data.ArgumentValue<FilterIDListInput> not) {
        this.not = not;
    }



    public static FilterIDListInput.Builder builder() {
        return new FilterIDListInput.Builder();
    }

    public static class Builder {

        private java.util.List<String> equals;
        private java.util.List<String> in;
        private org.springframework.graphql.data.ArgumentValue<FilterIDListInput> not = org.springframework.graphql.data.ArgumentValue.omitted();

        public Builder() {
        }

        public Builder setEquals(java.util.List<String> equals) {
            this.equals = equals;
            return this;
        }

        public Builder setIn(java.util.List<String> in) {
            this.in = in;
            return this;
        }

        public Builder setNot(org.springframework.graphql.data.ArgumentValue<FilterIDListInput> not) {
            this.not = not;
            return this;
        }


        public FilterIDListInput build() {
            return new FilterIDListInput(equals, in, not);
        }

    }
}
