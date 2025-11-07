package io.worlds.api.model;

import java.util.Objects;

/**
 * FilterDataSourceInput filters [DataSources]({{Types.DataSource}}) based on criteria described below.
Only one field should be provided per Filter object unless using an operator (`and` `or` `not`) as specified below.
 */
public class FilterDataSourceInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private org.springframework.graphql.data.ArgumentValue<FilterStringInput> type = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterPointInput> position = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterIDInput> id = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterStringInput> name = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterStringListInput> labels = org.springframework.graphql.data.ArgumentValue.omitted();
    private java.util.List<FilterDataSourceInput> and;
    private java.util.List<FilterDataSourceInput> or;
    private org.springframework.graphql.data.ArgumentValue<FilterDataSourceInput> not = org.springframework.graphql.data.ArgumentValue.omitted();

    public FilterDataSourceInput() {
    }

    public FilterDataSourceInput(org.springframework.graphql.data.ArgumentValue<FilterStringInput> type, org.springframework.graphql.data.ArgumentValue<FilterPointInput> position, org.springframework.graphql.data.ArgumentValue<FilterIDInput> id, org.springframework.graphql.data.ArgumentValue<FilterStringInput> name, org.springframework.graphql.data.ArgumentValue<FilterStringListInput> labels, java.util.List<FilterDataSourceInput> and, java.util.List<FilterDataSourceInput> or, org.springframework.graphql.data.ArgumentValue<FilterDataSourceInput> not) {
        this.type = type;
        this.position = position;
        this.id = id;
        this.name = name;
        this.labels = labels;
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

    public org.springframework.graphql.data.ArgumentValue<FilterStringListInput> getLabels() {
        return labels;
    }
    public void setLabels(org.springframework.graphql.data.ArgumentValue<FilterStringListInput> labels) {
        this.labels = labels;
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

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final FilterDataSourceInput that = (FilterDataSourceInput) obj;
        return Objects.equals(type, that.type)
            && Objects.equals(position, that.position)
            && Objects.equals(id, that.id)
            && Objects.equals(name, that.name)
            && Objects.equals(labels, that.labels)
            && Objects.equals(and, that.and)
            && Objects.equals(or, that.or)
            && Objects.equals(not, that.not);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, position, id, name, labels, and, or, not);
    }


    public static FilterDataSourceInput.Builder builder() {
        return new FilterDataSourceInput.Builder();
    }

    public static class Builder {

        private org.springframework.graphql.data.ArgumentValue<FilterStringInput> type = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterPointInput> position = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterIDInput> id = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterStringInput> name = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterStringListInput> labels = org.springframework.graphql.data.ArgumentValue.omitted();
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

        public Builder setLabels(org.springframework.graphql.data.ArgumentValue<FilterStringListInput> labels) {
            this.labels = labels;
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
            return new FilterDataSourceInput(type, position, id, name, labels, and, or, not);
        }

    }
}
