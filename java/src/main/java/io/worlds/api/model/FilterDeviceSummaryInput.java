package io.worlds.api.model;

import java.util.Objects;

/**
 * FilterDeviceSummaryInput filters devices summarized by a `deviceSummary` query.
Only one field should be provided per Filter object unless using an operator (`and` `or` `not`) as specified below.
 */
public class FilterDeviceSummaryInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private org.springframework.graphql.data.ArgumentValue<FilterIDInput> siteId = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterIDInput> pointOfInterestId = org.springframework.graphql.data.ArgumentValue.omitted();
    private java.util.List<FilterDeviceSummaryInput> and;
    private java.util.List<FilterDeviceSummaryInput> or;
    private org.springframework.graphql.data.ArgumentValue<FilterDeviceSummaryInput> not = org.springframework.graphql.data.ArgumentValue.omitted();

    public FilterDeviceSummaryInput() {
    }

    public FilterDeviceSummaryInput(org.springframework.graphql.data.ArgumentValue<FilterIDInput> siteId, org.springframework.graphql.data.ArgumentValue<FilterIDInput> pointOfInterestId, java.util.List<FilterDeviceSummaryInput> and, java.util.List<FilterDeviceSummaryInput> or, org.springframework.graphql.data.ArgumentValue<FilterDeviceSummaryInput> not) {
        this.siteId = siteId;
        this.pointOfInterestId = pointOfInterestId;
        this.and = and;
        this.or = or;
        this.not = not;
    }

    public org.springframework.graphql.data.ArgumentValue<FilterIDInput> getSiteId() {
        return siteId;
    }
    public void setSiteId(org.springframework.graphql.data.ArgumentValue<FilterIDInput> siteId) {
        this.siteId = siteId;
    }

    public org.springframework.graphql.data.ArgumentValue<FilterIDInput> getPointOfInterestId() {
        return pointOfInterestId;
    }
    public void setPointOfInterestId(org.springframework.graphql.data.ArgumentValue<FilterIDInput> pointOfInterestId) {
        this.pointOfInterestId = pointOfInterestId;
    }

    public java.util.List<FilterDeviceSummaryInput> getAnd() {
        return and;
    }
    public void setAnd(java.util.List<FilterDeviceSummaryInput> and) {
        this.and = and;
    }

    public java.util.List<FilterDeviceSummaryInput> getOr() {
        return or;
    }
    public void setOr(java.util.List<FilterDeviceSummaryInput> or) {
        this.or = or;
    }

    public org.springframework.graphql.data.ArgumentValue<FilterDeviceSummaryInput> getNot() {
        return not;
    }
    public void setNot(org.springframework.graphql.data.ArgumentValue<FilterDeviceSummaryInput> not) {
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
        final FilterDeviceSummaryInput that = (FilterDeviceSummaryInput) obj;
        return Objects.equals(siteId, that.siteId)
            && Objects.equals(pointOfInterestId, that.pointOfInterestId)
            && Objects.equals(and, that.and)
            && Objects.equals(or, that.or)
            && Objects.equals(not, that.not);
    }

    @Override
    public int hashCode() {
        return Objects.hash(siteId, pointOfInterestId, and, or, not);
    }


    public static FilterDeviceSummaryInput.Builder builder() {
        return new FilterDeviceSummaryInput.Builder();
    }

    public static class Builder {

        private org.springframework.graphql.data.ArgumentValue<FilterIDInput> siteId = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterIDInput> pointOfInterestId = org.springframework.graphql.data.ArgumentValue.omitted();
        private java.util.List<FilterDeviceSummaryInput> and;
        private java.util.List<FilterDeviceSummaryInput> or;
        private org.springframework.graphql.data.ArgumentValue<FilterDeviceSummaryInput> not = org.springframework.graphql.data.ArgumentValue.omitted();

        public Builder() {
        }

        public Builder setSiteId(org.springframework.graphql.data.ArgumentValue<FilterIDInput> siteId) {
            this.siteId = siteId;
            return this;
        }

        public Builder setPointOfInterestId(org.springframework.graphql.data.ArgumentValue<FilterIDInput> pointOfInterestId) {
            this.pointOfInterestId = pointOfInterestId;
            return this;
        }

        public Builder setAnd(java.util.List<FilterDeviceSummaryInput> and) {
            this.and = and;
            return this;
        }

        public Builder setOr(java.util.List<FilterDeviceSummaryInput> or) {
            this.or = or;
            return this;
        }

        public Builder setNot(org.springframework.graphql.data.ArgumentValue<FilterDeviceSummaryInput> not) {
            this.not = not;
            return this;
        }


        public FilterDeviceSummaryInput build() {
            return new FilterDeviceSummaryInput(siteId, pointOfInterestId, and, or, not);
        }

    }
}
