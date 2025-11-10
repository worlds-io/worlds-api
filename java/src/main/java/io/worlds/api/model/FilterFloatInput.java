package io.worlds.api.model;

import java.util.Objects;

/**
 * `FilterFloatInput` allows for filtering based on a Float parameter. Only one field  should be provided per filter object.
 */
public class FilterFloatInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private org.springframework.graphql.data.ArgumentValue<Double> ne = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<Double> eq = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<Double> le = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<Double> lt = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<Double> ge = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<Double> gt = org.springframework.graphql.data.ArgumentValue.omitted();
    private java.util.List<Double> in;
    private java.util.List<Double> between;
    private org.springframework.graphql.data.ArgumentValue<Boolean> attributeExists = org.springframework.graphql.data.ArgumentValue.omitted();

    public FilterFloatInput() {
    }

    public FilterFloatInput(org.springframework.graphql.data.ArgumentValue<Double> ne, org.springframework.graphql.data.ArgumentValue<Double> eq, org.springframework.graphql.data.ArgumentValue<Double> le, org.springframework.graphql.data.ArgumentValue<Double> lt, org.springframework.graphql.data.ArgumentValue<Double> ge, org.springframework.graphql.data.ArgumentValue<Double> gt, java.util.List<Double> in, java.util.List<Double> between, org.springframework.graphql.data.ArgumentValue<Boolean> attributeExists) {
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

    public org.springframework.graphql.data.ArgumentValue<Double> getNe() {
        return ne;
    }
    public void setNe(org.springframework.graphql.data.ArgumentValue<Double> ne) {
        this.ne = ne;
    }

    public org.springframework.graphql.data.ArgumentValue<Double> getEq() {
        return eq;
    }
    public void setEq(org.springframework.graphql.data.ArgumentValue<Double> eq) {
        this.eq = eq;
    }

    public org.springframework.graphql.data.ArgumentValue<Double> getLe() {
        return le;
    }
    public void setLe(org.springframework.graphql.data.ArgumentValue<Double> le) {
        this.le = le;
    }

    public org.springframework.graphql.data.ArgumentValue<Double> getLt() {
        return lt;
    }
    public void setLt(org.springframework.graphql.data.ArgumentValue<Double> lt) {
        this.lt = lt;
    }

    public org.springframework.graphql.data.ArgumentValue<Double> getGe() {
        return ge;
    }
    public void setGe(org.springframework.graphql.data.ArgumentValue<Double> ge) {
        this.ge = ge;
    }

    public org.springframework.graphql.data.ArgumentValue<Double> getGt() {
        return gt;
    }
    public void setGt(org.springframework.graphql.data.ArgumentValue<Double> gt) {
        this.gt = gt;
    }

    public java.util.List<Double> getIn() {
        return in;
    }
    public void setIn(java.util.List<Double> in) {
        this.in = in;
    }

    public java.util.List<Double> getBetween() {
        return between;
    }
    public void setBetween(java.util.List<Double> between) {
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
        final FilterFloatInput that = (FilterFloatInput) obj;
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


    public static FilterFloatInput.Builder builder() {
        return new FilterFloatInput.Builder();
    }

    public static class Builder {

        private org.springframework.graphql.data.ArgumentValue<Double> ne = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<Double> eq = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<Double> le = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<Double> lt = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<Double> ge = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<Double> gt = org.springframework.graphql.data.ArgumentValue.omitted();
        private java.util.List<Double> in;
        private java.util.List<Double> between;
        private org.springframework.graphql.data.ArgumentValue<Boolean> attributeExists = org.springframework.graphql.data.ArgumentValue.omitted();

        public Builder() {
        }

        public Builder setNe(org.springframework.graphql.data.ArgumentValue<Double> ne) {
            this.ne = ne;
            return this;
        }

        public Builder setEq(org.springframework.graphql.data.ArgumentValue<Double> eq) {
            this.eq = eq;
            return this;
        }

        public Builder setLe(org.springframework.graphql.data.ArgumentValue<Double> le) {
            this.le = le;
            return this;
        }

        public Builder setLt(org.springframework.graphql.data.ArgumentValue<Double> lt) {
            this.lt = lt;
            return this;
        }

        public Builder setGe(org.springframework.graphql.data.ArgumentValue<Double> ge) {
            this.ge = ge;
            return this;
        }

        public Builder setGt(org.springframework.graphql.data.ArgumentValue<Double> gt) {
            this.gt = gt;
            return this;
        }

        public Builder setIn(java.util.List<Double> in) {
            this.in = in;
            return this;
        }

        public Builder setBetween(java.util.List<Double> between) {
            this.between = between;
            return this;
        }

        public Builder setAttributeExists(org.springframework.graphql.data.ArgumentValue<Boolean> attributeExists) {
            this.attributeExists = attributeExists;
            return this;
        }


        public FilterFloatInput build() {
            return new FilterFloatInput(ne, eq, le, lt, ge, gt, in, between, attributeExists);
        }

    }
}
