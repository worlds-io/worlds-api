package io.worlds.api.model;

import java.util.Objects;

/**
 * A filter for a JSON value.  The value will be cast to the relevant type if present.
 */
public class FilterJSONFieldMode implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private org.springframework.graphql.data.ArgumentValue<FilterIntInput> integer = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterFloatInput> Float = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterBooleanInput> Boolean = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterStringInput> string = org.springframework.graphql.data.ArgumentValue.omitted();

    public FilterJSONFieldMode() {
    }

    public FilterJSONFieldMode(org.springframework.graphql.data.ArgumentValue<FilterIntInput> integer, org.springframework.graphql.data.ArgumentValue<FilterFloatInput> Float, org.springframework.graphql.data.ArgumentValue<FilterBooleanInput> Boolean, org.springframework.graphql.data.ArgumentValue<FilterStringInput> string) {
        this.integer = integer;
        this.Float = Float;
        this.Boolean = Boolean;
        this.string = string;
    }

    public org.springframework.graphql.data.ArgumentValue<FilterIntInput> getInteger() {
        return integer;
    }
    public void setInteger(org.springframework.graphql.data.ArgumentValue<FilterIntInput> integer) {
        this.integer = integer;
    }

    public org.springframework.graphql.data.ArgumentValue<FilterFloatInput> getFloat() {
        return Float;
    }
    public void setFloat(org.springframework.graphql.data.ArgumentValue<FilterFloatInput> Float) {
        this.Float = Float;
    }

    public org.springframework.graphql.data.ArgumentValue<FilterBooleanInput> getBoolean() {
        return Boolean;
    }
    public void setBoolean(org.springframework.graphql.data.ArgumentValue<FilterBooleanInput> Boolean) {
        this.Boolean = Boolean;
    }

    public org.springframework.graphql.data.ArgumentValue<FilterStringInput> getString() {
        return string;
    }
    public void setString(org.springframework.graphql.data.ArgumentValue<FilterStringInput> string) {
        this.string = string;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final FilterJSONFieldMode that = (FilterJSONFieldMode) obj;
        return Objects.equals(integer, that.integer)
            && Objects.equals(Float, that.Float)
            && Objects.equals(Boolean, that.Boolean)
            && Objects.equals(string, that.string);
    }

    @Override
    public int hashCode() {
        return Objects.hash(integer, Float, Boolean, string);
    }


    public static FilterJSONFieldMode.Builder builder() {
        return new FilterJSONFieldMode.Builder();
    }

    public static class Builder {

        private org.springframework.graphql.data.ArgumentValue<FilterIntInput> integer = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterFloatInput> Float = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterBooleanInput> Boolean = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterStringInput> string = org.springframework.graphql.data.ArgumentValue.omitted();

        public Builder() {
        }

        public Builder setInteger(org.springframework.graphql.data.ArgumentValue<FilterIntInput> integer) {
            this.integer = integer;
            return this;
        }

        public Builder setFloat(org.springframework.graphql.data.ArgumentValue<FilterFloatInput> Float) {
            this.Float = Float;
            return this;
        }

        public Builder setBoolean(org.springframework.graphql.data.ArgumentValue<FilterBooleanInput> Boolean) {
            this.Boolean = Boolean;
            return this;
        }

        public Builder setString(org.springframework.graphql.data.ArgumentValue<FilterStringInput> string) {
            this.string = string;
            return this;
        }


        public FilterJSONFieldMode build() {
            return new FilterJSONFieldMode(integer, Float, Boolean, string);
        }

    }
}
