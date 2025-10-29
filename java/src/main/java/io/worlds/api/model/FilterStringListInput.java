package io.worlds.api.model;


/**
 * `FilterIDListInput` allows for filtering based on a list of identifiers. Only one field should be provided per filter object.
 */
public class FilterStringListInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private java.util.List<String> eq;
    private java.util.List<String> in;

    public FilterStringListInput() {
    }

    public FilterStringListInput(java.util.List<String> eq, java.util.List<String> in) {
        this.eq = eq;
        this.in = in;
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



    public static FilterStringListInput.Builder builder() {
        return new FilterStringListInput.Builder();
    }

    public static class Builder {

        private java.util.List<String> eq;
        private java.util.List<String> in;

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


        public FilterStringListInput build() {
            return new FilterStringListInput(eq, in);
        }

    }
}
