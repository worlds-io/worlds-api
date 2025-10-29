package io.worlds.api.model;


/**
 * `FilterIDListInput` allows for filtering based on a list of identifiers. Only one field should be provided per filter object.
 */
public class FilterIDListInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private java.util.List<String> eq;
    private java.util.List<String> in;

    public FilterIDListInput() {
    }

    public FilterIDListInput(java.util.List<String> eq, java.util.List<String> in) {
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



    public static FilterIDListInput.Builder builder() {
        return new FilterIDListInput.Builder();
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


        public FilterIDListInput build() {
            return new FilterIDListInput(eq, in);
        }

    }
}
