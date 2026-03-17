package io.worlds.api.model;

import java.util.Objects;

/**
 * FilterZoneIntersectionSummaryInput filters zone intersections summarized by a `zoneIntersectionSummary` query.
Only one field should be provided per Filter object unless using an operator (`and` `or` `not`) as specified below.
 */
public class FilterZoneIntersectionSummaryInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private org.springframework.graphql.data.ArgumentValue<FilterIDInput> zoneId = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterIDInput> classId = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterIDInput> dataSourceId = org.springframework.graphql.data.ArgumentValue.omitted();
    private java.util.List<FilterZoneIntersectionSummaryInput> and;
    private java.util.List<FilterZoneIntersectionSummaryInput> or;
    private org.springframework.graphql.data.ArgumentValue<FilterZoneIntersectionSummaryInput> not = org.springframework.graphql.data.ArgumentValue.omitted();

    public FilterZoneIntersectionSummaryInput() {
    }

    public FilterZoneIntersectionSummaryInput(org.springframework.graphql.data.ArgumentValue<FilterIDInput> zoneId, org.springframework.graphql.data.ArgumentValue<FilterIDInput> classId, org.springframework.graphql.data.ArgumentValue<FilterIDInput> dataSourceId, java.util.List<FilterZoneIntersectionSummaryInput> and, java.util.List<FilterZoneIntersectionSummaryInput> or, org.springframework.graphql.data.ArgumentValue<FilterZoneIntersectionSummaryInput> not) {
        this.zoneId = zoneId;
        this.classId = classId;
        this.dataSourceId = dataSourceId;
        this.and = and;
        this.or = or;
        this.not = not;
    }

    public org.springframework.graphql.data.ArgumentValue<FilterIDInput> getZoneId() {
        return zoneId;
    }
    public void setZoneId(org.springframework.graphql.data.ArgumentValue<FilterIDInput> zoneId) {
        this.zoneId = zoneId;
    }

    public org.springframework.graphql.data.ArgumentValue<FilterIDInput> getClassId() {
        return classId;
    }
    public void setClassId(org.springframework.graphql.data.ArgumentValue<FilterIDInput> classId) {
        this.classId = classId;
    }

    public org.springframework.graphql.data.ArgumentValue<FilterIDInput> getDataSourceId() {
        return dataSourceId;
    }
    public void setDataSourceId(org.springframework.graphql.data.ArgumentValue<FilterIDInput> dataSourceId) {
        this.dataSourceId = dataSourceId;
    }

    public java.util.List<FilterZoneIntersectionSummaryInput> getAnd() {
        return and;
    }
    public void setAnd(java.util.List<FilterZoneIntersectionSummaryInput> and) {
        this.and = and;
    }

    public java.util.List<FilterZoneIntersectionSummaryInput> getOr() {
        return or;
    }
    public void setOr(java.util.List<FilterZoneIntersectionSummaryInput> or) {
        this.or = or;
    }

    public org.springframework.graphql.data.ArgumentValue<FilterZoneIntersectionSummaryInput> getNot() {
        return not;
    }
    public void setNot(org.springframework.graphql.data.ArgumentValue<FilterZoneIntersectionSummaryInput> not) {
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
        final FilterZoneIntersectionSummaryInput that = (FilterZoneIntersectionSummaryInput) obj;
        return Objects.equals(zoneId, that.zoneId)
            && Objects.equals(classId, that.classId)
            && Objects.equals(dataSourceId, that.dataSourceId)
            && Objects.equals(and, that.and)
            && Objects.equals(or, that.or)
            && Objects.equals(not, that.not);
    }

    @Override
    public int hashCode() {
        return Objects.hash(zoneId, classId, dataSourceId, and, or, not);
    }


    public static FilterZoneIntersectionSummaryInput.Builder builder() {
        return new FilterZoneIntersectionSummaryInput.Builder();
    }

    public static class Builder {

        private org.springframework.graphql.data.ArgumentValue<FilterIDInput> zoneId = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterIDInput> classId = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterIDInput> dataSourceId = org.springframework.graphql.data.ArgumentValue.omitted();
        private java.util.List<FilterZoneIntersectionSummaryInput> and;
        private java.util.List<FilterZoneIntersectionSummaryInput> or;
        private org.springframework.graphql.data.ArgumentValue<FilterZoneIntersectionSummaryInput> not = org.springframework.graphql.data.ArgumentValue.omitted();

        public Builder() {
        }

        public Builder setZoneId(org.springframework.graphql.data.ArgumentValue<FilterIDInput> zoneId) {
            this.zoneId = zoneId;
            return this;
        }

        public Builder setClassId(org.springframework.graphql.data.ArgumentValue<FilterIDInput> classId) {
            this.classId = classId;
            return this;
        }

        public Builder setDataSourceId(org.springframework.graphql.data.ArgumentValue<FilterIDInput> dataSourceId) {
            this.dataSourceId = dataSourceId;
            return this;
        }

        public Builder setAnd(java.util.List<FilterZoneIntersectionSummaryInput> and) {
            this.and = and;
            return this;
        }

        public Builder setOr(java.util.List<FilterZoneIntersectionSummaryInput> or) {
            this.or = or;
            return this;
        }

        public Builder setNot(org.springframework.graphql.data.ArgumentValue<FilterZoneIntersectionSummaryInput> not) {
            this.not = not;
            return this;
        }


        public FilterZoneIntersectionSummaryInput build() {
            return new FilterZoneIntersectionSummaryInput(zoneId, classId, dataSourceId, and, or, not);
        }

    }
}
