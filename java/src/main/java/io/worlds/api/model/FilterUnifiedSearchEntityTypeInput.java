package io.worlds.api.model;

import java.util.Objects;

/**
 * `FilterUnifiedSearchEntityTypeInput` allows for filtering the type of on a [UnifiedSearchEntityType]({{Types.UnifiedSearchEntityType}}) parameter. Only one field should be provided per filter object.
 */
public class FilterUnifiedSearchEntityTypeInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private org.springframework.graphql.data.ArgumentValue<UnifiedSearchEntityType> eq = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<UnifiedSearchEntityType> ne = org.springframework.graphql.data.ArgumentValue.omitted();
    private java.util.List<UnifiedSearchEntityType> in;

    public FilterUnifiedSearchEntityTypeInput() {
    }

    public FilterUnifiedSearchEntityTypeInput(org.springframework.graphql.data.ArgumentValue<UnifiedSearchEntityType> eq, org.springframework.graphql.data.ArgumentValue<UnifiedSearchEntityType> ne, java.util.List<UnifiedSearchEntityType> in) {
        this.eq = eq;
        this.ne = ne;
        this.in = in;
    }

    public org.springframework.graphql.data.ArgumentValue<UnifiedSearchEntityType> getEq() {
        return eq;
    }
    public void setEq(org.springframework.graphql.data.ArgumentValue<UnifiedSearchEntityType> eq) {
        this.eq = eq;
    }

    public org.springframework.graphql.data.ArgumentValue<UnifiedSearchEntityType> getNe() {
        return ne;
    }
    public void setNe(org.springframework.graphql.data.ArgumentValue<UnifiedSearchEntityType> ne) {
        this.ne = ne;
    }

    public java.util.List<UnifiedSearchEntityType> getIn() {
        return in;
    }
    public void setIn(java.util.List<UnifiedSearchEntityType> in) {
        this.in = in;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final FilterUnifiedSearchEntityTypeInput that = (FilterUnifiedSearchEntityTypeInput) obj;
        return Objects.equals(eq, that.eq)
            && Objects.equals(ne, that.ne)
            && Objects.equals(in, that.in);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eq, ne, in);
    }


    public static FilterUnifiedSearchEntityTypeInput.Builder builder() {
        return new FilterUnifiedSearchEntityTypeInput.Builder();
    }

    public static class Builder {

        private org.springframework.graphql.data.ArgumentValue<UnifiedSearchEntityType> eq = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<UnifiedSearchEntityType> ne = org.springframework.graphql.data.ArgumentValue.omitted();
        private java.util.List<UnifiedSearchEntityType> in;

        public Builder() {
        }

        public Builder setEq(org.springframework.graphql.data.ArgumentValue<UnifiedSearchEntityType> eq) {
            this.eq = eq;
            return this;
        }

        public Builder setNe(org.springframework.graphql.data.ArgumentValue<UnifiedSearchEntityType> ne) {
            this.ne = ne;
            return this;
        }

        public Builder setIn(java.util.List<UnifiedSearchEntityType> in) {
            this.in = in;
            return this;
        }


        public FilterUnifiedSearchEntityTypeInput build() {
            return new FilterUnifiedSearchEntityTypeInput(eq, ne, in);
        }

    }
}
