package io.worlds.api.model;


/**
 * FilterDataSourceInput filters [DataSources]({{Types.datasource}}) based on criteria described below.
Only one field should be provided per Filter object unless using an operator (`and` `or` `not`) as specified below.
 */
public class FilterDataSourceInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private org.springframework.graphql.data.ArgumentValue<FilterStringInput> type = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterPointInput> position = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterIDInput> id = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterStringInput> name = org.springframework.graphql.data.ArgumentValue.omitted();
    private java.util.List<FilterDataSourceInput> and;
    private java.util.List<FilterDataSourceInput> or;
    private org.springframework.graphql.data.ArgumentValue<FilterDataSourceInput> not = org.springframework.graphql.data.ArgumentValue.omitted();

    public FilterDataSourceInput() {
    }

    public FilterDataSourceInput(org.springframework.graphql.data.ArgumentValue<FilterStringInput> type, org.springframework.graphql.data.ArgumentValue<FilterPointInput> position, org.springframework.graphql.data.ArgumentValue<FilterIDInput> id, org.springframework.graphql.data.ArgumentValue<FilterStringInput> name, java.util.List<FilterDataSourceInput> and, java.util.List<FilterDataSourceInput> or, org.springframework.graphql.data.ArgumentValue<FilterDataSourceInput> not) {
        this.type = type;
        this.position = position;
        this.id = id;
        this.name = name;
        this.and = and;
        this.or = or;
        this.not = not;
    }

    public org.springframework.graphql.data.ArgumentValue<FilterStringInput> getType() {
        return type;
    }
    public void setType(org.springframework.graphql.data.ArgumentValue<FilterStringInput> type) {
        this.type = type;
    }

    public org.springframework.graphql.data.ArgumentValue<FilterPointInput> getPosition() {
        return position;
    }
    public void setPosition(org.springframework.graphql.data.ArgumentValue<FilterPointInput> position) {
        this.position = position;
    }

    public org.springframework.graphql.data.ArgumentValue<FilterIDInput> getId() {
        return id;
    }
    public void setId(org.springframework.graphql.data.ArgumentValue<FilterIDInput> id) {
        this.id = id;
    }

    public org.springframework.graphql.data.ArgumentValue<FilterStringInput> getName() {
        return name;
    }
    public void setName(org.springframework.graphql.data.ArgumentValue<FilterStringInput> name) {
        this.name = name;
    }

    public java.util.List<FilterDataSourceInput> getAnd() {
        return and;
    }
    public void setAnd(java.util.List<FilterDataSourceInput> and) {
        this.and = and;
    }

    public java.util.List<FilterDataSourceInput> getOr() {
        return or;
    }
    public void setOr(java.util.List<FilterDataSourceInput> or) {
        this.or = or;
    }

    public org.springframework.graphql.data.ArgumentValue<FilterDataSourceInput> getNot() {
        return not;
    }
    public void setNot(org.springframework.graphql.data.ArgumentValue<FilterDataSourceInput> not) {
        this.not = not;
    }



    public static FilterDataSourceInput.Builder builder() {
        return new FilterDataSourceInput.Builder();
    }

    public static class Builder {

        private org.springframework.graphql.data.ArgumentValue<FilterStringInput> type = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterPointInput> position = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterIDInput> id = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterStringInput> name = org.springframework.graphql.data.ArgumentValue.omitted();
        private java.util.List<FilterDataSourceInput> and;
        private java.util.List<FilterDataSourceInput> or;
        private org.springframework.graphql.data.ArgumentValue<FilterDataSourceInput> not = org.springframework.graphql.data.ArgumentValue.omitted();

        public Builder() {
        }

        public Builder setType(org.springframework.graphql.data.ArgumentValue<FilterStringInput> type) {
            this.type = type;
            return this;
        }

        public Builder setPosition(org.springframework.graphql.data.ArgumentValue<FilterPointInput> position) {
            this.position = position;
            return this;
        }

        public Builder setId(org.springframework.graphql.data.ArgumentValue<FilterIDInput> id) {
            this.id = id;
            return this;
        }

        public Builder setName(org.springframework.graphql.data.ArgumentValue<FilterStringInput> name) {
            this.name = name;
            return this;
        }

        public Builder setAnd(java.util.List<FilterDataSourceInput> and) {
            this.and = and;
            return this;
        }

        public Builder setOr(java.util.List<FilterDataSourceInput> or) {
            this.or = or;
            return this;
        }

        public Builder setNot(org.springframework.graphql.data.ArgumentValue<FilterDataSourceInput> not) {
            this.not = not;
            return this;
        }


        public FilterDataSourceInput build() {
            return new FilterDataSourceInput(type, position, id, name, and, or, not);
        }

    }
}
