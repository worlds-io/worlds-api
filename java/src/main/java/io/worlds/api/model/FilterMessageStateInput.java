package io.worlds.api.model;

import java.util.Objects;

/**
 * `FilterMessageStateInput` allows for filtering based on a [MessageState]({{Types.MessageState}}) parameter. Only one field should be provided per filter object.
Note that the `UPDATE` state will exclude `START` and `END` messages.
 */
public class FilterMessageStateInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private org.springframework.graphql.data.ArgumentValue<MessageState> eq = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<MessageState> ne = org.springframework.graphql.data.ArgumentValue.omitted();
    private java.util.List<MessageState> in;

    public FilterMessageStateInput() {
    }

    public FilterMessageStateInput(org.springframework.graphql.data.ArgumentValue<MessageState> eq, org.springframework.graphql.data.ArgumentValue<MessageState> ne, java.util.List<MessageState> in) {
        this.eq = eq;
        this.ne = ne;
        this.in = in;
    }

    public org.springframework.graphql.data.ArgumentValue<MessageState> getEq() {
        return eq;
    }
    public void setEq(org.springframework.graphql.data.ArgumentValue<MessageState> eq) {
        this.eq = eq;
    }

    public org.springframework.graphql.data.ArgumentValue<MessageState> getNe() {
        return ne;
    }
    public void setNe(org.springframework.graphql.data.ArgumentValue<MessageState> ne) {
        this.ne = ne;
    }

    public java.util.List<MessageState> getIn() {
        return in;
    }
    public void setIn(java.util.List<MessageState> in) {
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
        final FilterMessageStateInput that = (FilterMessageStateInput) obj;
        return Objects.equals(eq, that.eq)
            && Objects.equals(ne, that.ne)
            && Objects.equals(in, that.in);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eq, ne, in);
    }


    public static FilterMessageStateInput.Builder builder() {
        return new FilterMessageStateInput.Builder();
    }

    public static class Builder {

        private org.springframework.graphql.data.ArgumentValue<MessageState> eq = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<MessageState> ne = org.springframework.graphql.data.ArgumentValue.omitted();
        private java.util.List<MessageState> in;

        public Builder() {
        }

        public Builder setEq(org.springframework.graphql.data.ArgumentValue<MessageState> eq) {
            this.eq = eq;
            return this;
        }

        public Builder setNe(org.springframework.graphql.data.ArgumentValue<MessageState> ne) {
            this.ne = ne;
            return this;
        }

        public Builder setIn(java.util.List<MessageState> in) {
            this.in = in;
            return this;
        }


        public FilterMessageStateInput build() {
            return new FilterMessageStateInput(eq, ne, in);
        }

    }
}
