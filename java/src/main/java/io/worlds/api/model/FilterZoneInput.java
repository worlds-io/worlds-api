package io.worlds.api.model;


public class FilterZoneInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private org.springframework.graphql.data.ArgumentValue<FilterIDInput> id = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterStringInput> name = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterIDInput> dataSourceId = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterBooleanInput> active = org.springframework.graphql.data.ArgumentValue.omitted();
    private java.util.List<FilterZoneInput> and;
    private java.util.List<FilterZoneInput> or;
    private org.springframework.graphql.data.ArgumentValue<FilterZoneInput> not = org.springframework.graphql.data.ArgumentValue.omitted();

    public FilterZoneInput() {
    }

    public FilterZoneInput(org.springframework.graphql.data.ArgumentValue<FilterIDInput> id, org.springframework.graphql.data.ArgumentValue<FilterStringInput> name, org.springframework.graphql.data.ArgumentValue<FilterIDInput> dataSourceId, org.springframework.graphql.data.ArgumentValue<FilterBooleanInput> active, java.util.List<FilterZoneInput> and, java.util.List<FilterZoneInput> or, org.springframework.graphql.data.ArgumentValue<FilterZoneInput> not) {
        this.id = id;
        this.name = name;
        this.dataSourceId = dataSourceId;
        this.active = active;
        this.and = and;
        this.or = or;
        this.not = not;
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

    public org.springframework.graphql.data.ArgumentValue<FilterIDInput> getDataSourceId() {
        return dataSourceId;
    }
    public void setDataSourceId(org.springframework.graphql.data.ArgumentValue<FilterIDInput> dataSourceId) {
        this.dataSourceId = dataSourceId;
    }

    public org.springframework.graphql.data.ArgumentValue<FilterBooleanInput> getActive() {
        return active;
    }
    public void setActive(org.springframework.graphql.data.ArgumentValue<FilterBooleanInput> active) {
        this.active = active;
    }

    public java.util.List<FilterZoneInput> getAnd() {
        return and;
    }
    public void setAnd(java.util.List<FilterZoneInput> and) {
        this.and = and;
    }

    public java.util.List<FilterZoneInput> getOr() {
        return or;
    }
    public void setOr(java.util.List<FilterZoneInput> or) {
        this.or = or;
    }

    public org.springframework.graphql.data.ArgumentValue<FilterZoneInput> getNot() {
        return not;
    }
    public void setNot(org.springframework.graphql.data.ArgumentValue<FilterZoneInput> not) {
        this.not = not;
    }



    public static FilterZoneInput.Builder builder() {
        return new FilterZoneInput.Builder();
    }

    public static class Builder {

        private org.springframework.graphql.data.ArgumentValue<FilterIDInput> id = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterStringInput> name = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterIDInput> dataSourceId = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterBooleanInput> active = org.springframework.graphql.data.ArgumentValue.omitted();
        private java.util.List<FilterZoneInput> and;
        private java.util.List<FilterZoneInput> or;
        private org.springframework.graphql.data.ArgumentValue<FilterZoneInput> not = org.springframework.graphql.data.ArgumentValue.omitted();

        public Builder() {
        }

        public Builder setId(org.springframework.graphql.data.ArgumentValue<FilterIDInput> id) {
            this.id = id;
            return this;
        }

        public Builder setName(org.springframework.graphql.data.ArgumentValue<FilterStringInput> name) {
            this.name = name;
            return this;
        }

        public Builder setDataSourceId(org.springframework.graphql.data.ArgumentValue<FilterIDInput> dataSourceId) {
            this.dataSourceId = dataSourceId;
            return this;
        }

        public Builder setActive(org.springframework.graphql.data.ArgumentValue<FilterBooleanInput> active) {
            this.active = active;
            return this;
        }

        public Builder setAnd(java.util.List<FilterZoneInput> and) {
            this.and = and;
            return this;
        }

        public Builder setOr(java.util.List<FilterZoneInput> or) {
            this.or = or;
            return this;
        }

        public Builder setNot(org.springframework.graphql.data.ArgumentValue<FilterZoneInput> not) {
            this.not = not;
            return this;
        }


        public FilterZoneInput build() {
            return new FilterZoneInput(id, name, dataSourceId, active, and, or, not);
        }

    }
}
