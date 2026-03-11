package io.worlds.api.model;

import java.util.Objects;

/**
 * FilterActivityChronicleSummaryInput filters activity chronicles summarized by an `activityChronicleSummary` query.
Only one field should be provided per Filter object unless using an operator (`and` `or` `not`) as specified below.
 */
public class FilterActivityChronicleSummaryInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private org.springframework.graphql.data.ArgumentValue<FilterIDInput> chronicleProducerId = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterIDListInput> dataSourceIds = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterIDListInput> siteIds = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterStringInput> priority = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterStringInput> status = org.springframework.graphql.data.ArgumentValue.omitted();
    private java.util.List<FilterActivityChronicleSummaryInput> and;
    private java.util.List<FilterActivityChronicleSummaryInput> or;
    private org.springframework.graphql.data.ArgumentValue<FilterActivityChronicleSummaryInput> not = org.springframework.graphql.data.ArgumentValue.omitted();

    public FilterActivityChronicleSummaryInput() {
    }

    public FilterActivityChronicleSummaryInput(org.springframework.graphql.data.ArgumentValue<FilterIDInput> chronicleProducerId, org.springframework.graphql.data.ArgumentValue<FilterIDListInput> dataSourceIds, org.springframework.graphql.data.ArgumentValue<FilterIDListInput> siteIds, org.springframework.graphql.data.ArgumentValue<FilterStringInput> priority, org.springframework.graphql.data.ArgumentValue<FilterStringInput> status, java.util.List<FilterActivityChronicleSummaryInput> and, java.util.List<FilterActivityChronicleSummaryInput> or, org.springframework.graphql.data.ArgumentValue<FilterActivityChronicleSummaryInput> not) {
        this.chronicleProducerId = chronicleProducerId;
        this.dataSourceIds = dataSourceIds;
        this.siteIds = siteIds;
        this.priority = priority;
        this.status = status;
        this.and = and;
        this.or = or;
        this.not = not;
    }

    public org.springframework.graphql.data.ArgumentValue<FilterIDInput> getChronicleProducerId() {
        return chronicleProducerId;
    }
    public void setChronicleProducerId(org.springframework.graphql.data.ArgumentValue<FilterIDInput> chronicleProducerId) {
        this.chronicleProducerId = chronicleProducerId;
    }

    public org.springframework.graphql.data.ArgumentValue<FilterIDListInput> getDataSourceIds() {
        return dataSourceIds;
    }
    public void setDataSourceIds(org.springframework.graphql.data.ArgumentValue<FilterIDListInput> dataSourceIds) {
        this.dataSourceIds = dataSourceIds;
    }

    public org.springframework.graphql.data.ArgumentValue<FilterIDListInput> getSiteIds() {
        return siteIds;
    }
    public void setSiteIds(org.springframework.graphql.data.ArgumentValue<FilterIDListInput> siteIds) {
        this.siteIds = siteIds;
    }

    public org.springframework.graphql.data.ArgumentValue<FilterStringInput> getPriority() {
        return priority;
    }
    public void setPriority(org.springframework.graphql.data.ArgumentValue<FilterStringInput> priority) {
        this.priority = priority;
    }

    public org.springframework.graphql.data.ArgumentValue<FilterStringInput> getStatus() {
        return status;
    }
    public void setStatus(org.springframework.graphql.data.ArgumentValue<FilterStringInput> status) {
        this.status = status;
    }

    public java.util.List<FilterActivityChronicleSummaryInput> getAnd() {
        return and;
    }
    public void setAnd(java.util.List<FilterActivityChronicleSummaryInput> and) {
        this.and = and;
    }

    public java.util.List<FilterActivityChronicleSummaryInput> getOr() {
        return or;
    }
    public void setOr(java.util.List<FilterActivityChronicleSummaryInput> or) {
        this.or = or;
    }

    public org.springframework.graphql.data.ArgumentValue<FilterActivityChronicleSummaryInput> getNot() {
        return not;
    }
    public void setNot(org.springframework.graphql.data.ArgumentValue<FilterActivityChronicleSummaryInput> not) {
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
        final FilterActivityChronicleSummaryInput that = (FilterActivityChronicleSummaryInput) obj;
        return Objects.equals(chronicleProducerId, that.chronicleProducerId)
            && Objects.equals(dataSourceIds, that.dataSourceIds)
            && Objects.equals(siteIds, that.siteIds)
            && Objects.equals(priority, that.priority)
            && Objects.equals(status, that.status)
            && Objects.equals(and, that.and)
            && Objects.equals(or, that.or)
            && Objects.equals(not, that.not);
    }

    @Override
    public int hashCode() {
        return Objects.hash(chronicleProducerId, dataSourceIds, siteIds, priority, status, and, or, not);
    }


    public static FilterActivityChronicleSummaryInput.Builder builder() {
        return new FilterActivityChronicleSummaryInput.Builder();
    }

    public static class Builder {

        private org.springframework.graphql.data.ArgumentValue<FilterIDInput> chronicleProducerId = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterIDListInput> dataSourceIds = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterIDListInput> siteIds = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterStringInput> priority = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterStringInput> status = org.springframework.graphql.data.ArgumentValue.omitted();
        private java.util.List<FilterActivityChronicleSummaryInput> and;
        private java.util.List<FilterActivityChronicleSummaryInput> or;
        private org.springframework.graphql.data.ArgumentValue<FilterActivityChronicleSummaryInput> not = org.springframework.graphql.data.ArgumentValue.omitted();

        public Builder() {
        }

        public Builder setChronicleProducerId(org.springframework.graphql.data.ArgumentValue<FilterIDInput> chronicleProducerId) {
            this.chronicleProducerId = chronicleProducerId;
            return this;
        }

        public Builder setDataSourceIds(org.springframework.graphql.data.ArgumentValue<FilterIDListInput> dataSourceIds) {
            this.dataSourceIds = dataSourceIds;
            return this;
        }

        public Builder setSiteIds(org.springframework.graphql.data.ArgumentValue<FilterIDListInput> siteIds) {
            this.siteIds = siteIds;
            return this;
        }

        public Builder setPriority(org.springframework.graphql.data.ArgumentValue<FilterStringInput> priority) {
            this.priority = priority;
            return this;
        }

        public Builder setStatus(org.springframework.graphql.data.ArgumentValue<FilterStringInput> status) {
            this.status = status;
            return this;
        }

        public Builder setAnd(java.util.List<FilterActivityChronicleSummaryInput> and) {
            this.and = and;
            return this;
        }

        public Builder setOr(java.util.List<FilterActivityChronicleSummaryInput> or) {
            this.or = or;
            return this;
        }

        public Builder setNot(org.springframework.graphql.data.ArgumentValue<FilterActivityChronicleSummaryInput> not) {
            this.not = not;
            return this;
        }


        public FilterActivityChronicleSummaryInput build() {
            return new FilterActivityChronicleSummaryInput(chronicleProducerId, dataSourceIds, siteIds, priority, status, and, or, not);
        }

    }
}
