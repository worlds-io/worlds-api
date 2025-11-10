package io.worlds.api.model;

import java.util.Objects;

/**
 * `FilterTrackPropertyInput` allows for filtering a [`tracks` query]({{Queries.tracks}}) based on criteria described below
 */
public class FilterTrackPropertyInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private org.springframework.graphql.data.ArgumentValue<FilterStringInput> type = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterStringInput> value = org.springframework.graphql.data.ArgumentValue.omitted();

    public FilterTrackPropertyInput() {
    }

    public FilterTrackPropertyInput(org.springframework.graphql.data.ArgumentValue<FilterStringInput> type, org.springframework.graphql.data.ArgumentValue<FilterStringInput> value) {
        this.type = type;
        this.value = value;
    }

    public org.springframework.graphql.data.ArgumentValue<FilterStringInput> getType() {
        return type;
    }
    public void setType(org.springframework.graphql.data.ArgumentValue<FilterStringInput> type) {
        this.type = type;
    }

    public org.springframework.graphql.data.ArgumentValue<FilterStringInput> getValue() {
        return value;
    }
    public void setValue(org.springframework.graphql.data.ArgumentValue<FilterStringInput> value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final FilterTrackPropertyInput that = (FilterTrackPropertyInput) obj;
        return Objects.equals(type, that.type)
            && Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, value);
    }


    public static FilterTrackPropertyInput.Builder builder() {
        return new FilterTrackPropertyInput.Builder();
    }

    public static class Builder {

        private org.springframework.graphql.data.ArgumentValue<FilterStringInput> type = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterStringInput> value = org.springframework.graphql.data.ArgumentValue.omitted();

        public Builder() {
        }

        public Builder setType(org.springframework.graphql.data.ArgumentValue<FilterStringInput> type) {
            this.type = type;
            return this;
        }

        public Builder setValue(org.springframework.graphql.data.ArgumentValue<FilterStringInput> value) {
            this.value = value;
            return this;
        }


        public FilterTrackPropertyInput build() {
            return new FilterTrackPropertyInput(type, value);
        }

    }
}
