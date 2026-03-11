package io.worlds.api.model;

import java.util.Objects;

/**
 * `FilterTracksSummaryInput` allows for filtering a tracks summarized by a `tracksSummary` query based on criteria described below.
If multiple filters are provided, all must pass.
 */
public class FilterTracksSummaryInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private org.springframework.graphql.data.ArgumentValue<FilterTagInput> tag = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterDataSourceInput> dataSource = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterSiteInput> site = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterPointOfInterestInput> pointOfInterest = org.springframework.graphql.data.ArgumentValue.omitted();

    public FilterTracksSummaryInput() {
    }

    public FilterTracksSummaryInput(org.springframework.graphql.data.ArgumentValue<FilterTagInput> tag, org.springframework.graphql.data.ArgumentValue<FilterDataSourceInput> dataSource, org.springframework.graphql.data.ArgumentValue<FilterSiteInput> site, org.springframework.graphql.data.ArgumentValue<FilterPointOfInterestInput> pointOfInterest) {
        this.tag = tag;
        this.dataSource = dataSource;
        this.site = site;
        this.pointOfInterest = pointOfInterest;
    }

    public org.springframework.graphql.data.ArgumentValue<FilterTagInput> getTag() {
        return tag;
    }
    public void setTag(org.springframework.graphql.data.ArgumentValue<FilterTagInput> tag) {
        this.tag = tag;
    }

    public org.springframework.graphql.data.ArgumentValue<FilterDataSourceInput> getDataSource() {
        return dataSource;
    }
    public void setDataSource(org.springframework.graphql.data.ArgumentValue<FilterDataSourceInput> dataSource) {
        this.dataSource = dataSource;
    }

    public org.springframework.graphql.data.ArgumentValue<FilterSiteInput> getSite() {
        return site;
    }
    public void setSite(org.springframework.graphql.data.ArgumentValue<FilterSiteInput> site) {
        this.site = site;
    }

    public org.springframework.graphql.data.ArgumentValue<FilterPointOfInterestInput> getPointOfInterest() {
        return pointOfInterest;
    }
    public void setPointOfInterest(org.springframework.graphql.data.ArgumentValue<FilterPointOfInterestInput> pointOfInterest) {
        this.pointOfInterest = pointOfInterest;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final FilterTracksSummaryInput that = (FilterTracksSummaryInput) obj;
        return Objects.equals(tag, that.tag)
            && Objects.equals(dataSource, that.dataSource)
            && Objects.equals(site, that.site)
            && Objects.equals(pointOfInterest, that.pointOfInterest);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tag, dataSource, site, pointOfInterest);
    }


    public static FilterTracksSummaryInput.Builder builder() {
        return new FilterTracksSummaryInput.Builder();
    }

    public static class Builder {

        private org.springframework.graphql.data.ArgumentValue<FilterTagInput> tag = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterDataSourceInput> dataSource = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterSiteInput> site = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterPointOfInterestInput> pointOfInterest = org.springframework.graphql.data.ArgumentValue.omitted();

        public Builder() {
        }

        public Builder setTag(org.springframework.graphql.data.ArgumentValue<FilterTagInput> tag) {
            this.tag = tag;
            return this;
        }

        public Builder setDataSource(org.springframework.graphql.data.ArgumentValue<FilterDataSourceInput> dataSource) {
            this.dataSource = dataSource;
            return this;
        }

        public Builder setSite(org.springframework.graphql.data.ArgumentValue<FilterSiteInput> site) {
            this.site = site;
            return this;
        }

        public Builder setPointOfInterest(org.springframework.graphql.data.ArgumentValue<FilterPointOfInterestInput> pointOfInterest) {
            this.pointOfInterest = pointOfInterest;
            return this;
        }


        public FilterTracksSummaryInput build() {
            return new FilterTracksSummaryInput(tag, dataSource, site, pointOfInterest);
        }

    }
}
