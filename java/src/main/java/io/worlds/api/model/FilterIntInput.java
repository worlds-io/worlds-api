package io.worlds.api.model;

import java.util.Objects;

/**
 * `FilterIntInput` allows for filtering based on an Int parameter. Only one field should be provided per filter object.
 */
public class FilterIntInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private org.springframework.graphql.data.ArgumentValue<Integer> ne = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<Integer> eq = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<Integer> le = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<Integer> lt = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<Integer> ge = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<Integer> gt = org.springframework.graphql.data.ArgumentValue.omitted();
    private java.util.List<Integer> in;
    private java.util.List<Integer> between;
    private org.springframework.graphql.data.ArgumentValue<Boolean> attributeExists = org.springframework.graphql.data.ArgumentValue.omitted();

    public FilterIntInput() {
    }

    public FilterIntInput(org.springframework.graphql.data.ArgumentValue<Integer> ne, org.springframework.graphql.data.ArgumentValue<Integer> eq, org.springframework.graphql.data.ArgumentValue<Integer> le, org.springframework.graphql.data.ArgumentValue<Integer> lt, org.springframework.graphql.data.ArgumentValue<Integer> ge, org.springframework.graphql.data.ArgumentValue<Integer> gt, java.util.List<Integer> in, java.util.List<Integer> between, org.springframework.graphql.data.ArgumentValue<Boolean> attributeExists) {
        this.ne = ne;
        this.eq = eq;
        this.le = le;
        this.lt = lt;
        this.ge = ge;
        this.gt = gt;
        this.in = in;
        this.between = between;
        this.attributeExists = attributeExists;
    }

    public org.springframework.graphql.data.ArgumentValue<Integer> getNe() {
        return ne;
    }
    public void setNe(org.springframework.graphql.data.ArgumentValue<Integer> ne) {
        this.ne = ne;
    }

    public org.springframework.graphql.data.ArgumentValue<Integer> getEq() {
        return eq;
    }
    public void setEq(org.springframework.graphql.data.ArgumentValue<Integer> eq) {
        this.eq = eq;
    }

    public org.springframework.graphql.data.ArgumentValue<Integer> getLe() {
        return le;
    }
    public void setLe(org.springframework.graphql.data.ArgumentValue<Integer> le) {
        this.le = le;
    }

    public org.springframework.graphql.data.ArgumentValue<Integer> getLt() {
        return lt;
    }
    public void setLt(org.springframework.graphql.data.ArgumentValue<Integer> lt) {
        this.lt = lt;
    }

    public org.springframework.graphql.data.ArgumentValue<Integer> getGe() {
        return ge;
    }
    public void setGe(org.springframework.graphql.data.ArgumentValue<Integer> ge) {
        this.ge = ge;
    }

    public org.springframework.graphql.data.ArgumentValue<Integer> getGt() {
        return gt;
    }
    public void setGt(org.springframework.graphql.data.ArgumentValue<Integer> gt) {
        this.gt = gt;
    }

    public java.util.List<Integer> getIn() {
        return in;
    }
    public void setIn(java.util.List<Integer> in) {
        this.in = in;
    }

    public java.util.List<Integer> getBetween() {
        return between;
    }
    public void setBetween(java.util.List<Integer> between) {
        this.between = between;
    }

    public org.springframework.graphql.data.ArgumentValue<Boolean> getAttributeExists() {
        return attributeExists;
    }
    public void setAttributeExists(org.springframework.graphql.data.ArgumentValue<Boolean> attributeExists) {
        this.attributeExists = attributeExists;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final FilterIntInput that = (FilterIntInput) obj;
        return Objects.equals(ne, that.ne)
            && Objects.equals(eq, that.eq)
            && Objects.equals(le, that.le)
            && Objects.equals(lt, that.lt)
            && Objects.equals(ge, that.ge)
            && Objects.equals(gt, that.gt)
            && Objects.equals(in, that.in)
            && Objects.equals(between, that.between)
            && Objects.equals(attributeExists, that.attributeExists);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ne, eq, le, lt, ge, gt, in, between, attributeExists);
    }


    public static FilterIntInput.Builder builder() {
        return new FilterIntInput.Builder();
    }

    public static class Builder {

        private org.springframework.graphql.data.ArgumentValue<Integer> ne = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<Integer> eq = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<Integer> le = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<Integer> lt = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<Integer> ge = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<Integer> gt = org.springframework.graphql.data.ArgumentValue.omitted();
        private java.util.List<Integer> in;
        private java.util.List<Integer> between;
        private org.springframework.graphql.data.ArgumentValue<Boolean> attributeExists = org.springframework.graphql.data.ArgumentValue.omitted();

        public Builder() {
        }

        public Builder setNe(org.springframework.graphql.data.ArgumentValue<Integer> ne) {
            this.ne = ne;
            return this;
        }

        public Builder setEq(org.springframework.graphql.data.ArgumentValue<Integer> eq) {
            this.eq = eq;
            return this;
        }

        public Builder setLe(org.springframework.graphql.data.ArgumentValue<Integer> le) {
            this.le = le;
            return this;
        }

        public Builder setLt(org.springframework.graphql.data.ArgumentValue<Integer> lt) {
            this.lt = lt;
            return this;
        }

        public Builder setGe(org.springframework.graphql.data.ArgumentValue<Integer> ge) {
            this.ge = ge;
            return this;
        }

        public Builder setGt(org.springframework.graphql.data.ArgumentValue<Integer> gt) {
            this.gt = gt;
            return this;
        }

        public Builder setIn(java.util.List<Integer> in) {
            this.in = in;
            return this;
        }

        public Builder setBetween(java.util.List<Integer> between) {
            this.between = between;
            return this;
        }

        public Builder setAttributeExists(org.springframework.graphql.data.ArgumentValue<Boolean> attributeExists) {
            this.attributeExists = attributeExists;
            return this;
        }


        public FilterIntInput build() {
            return new FilterIntInput(ne, eq, le, lt, ge, gt, in, between, attributeExists);
        }

    }
}
