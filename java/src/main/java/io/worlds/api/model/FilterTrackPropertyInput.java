package io.worlds.api.model;


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
