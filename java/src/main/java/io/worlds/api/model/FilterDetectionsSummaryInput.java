package io.worlds.api.model;

import java.util.Objects;

/**
 * `FilterDetectionsSummaryInput` allows for filtering detections summarized by a `detectionsSummary` query based on criteria described below.
If multiple filters are provided, all must pass.
 */
public class FilterDetectionsSummaryInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private org.springframework.graphql.data.ArgumentValue<FilterTagInput> tag = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterDataSourceInput> dataSource = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterSiteInput> site = org.springframework.graphql.data.ArgumentValue.omitted();
    private java.util.List<FilterDetectionsSummaryInput> and;
    private java.util.List<FilterDetectionsSummaryInput> or;
    private org.springframework.graphql.data.ArgumentValue<FilterDetectionsSummaryInput> not = org.springframework.graphql.data.ArgumentValue.omitted();

    public FilterDetectionsSummaryInput() {
    }

    public FilterDetectionsSummaryInput(org.springframework.graphql.data.ArgumentValue<FilterTagInput> tag, org.springframework.graphql.data.ArgumentValue<FilterDataSourceInput> dataSource, org.springframework.graphql.data.ArgumentValue<FilterSiteInput> site, java.util.List<FilterDetectionsSummaryInput> and, java.util.List<FilterDetectionsSummaryInput> or, org.springframework.graphql.data.ArgumentValue<FilterDetectionsSummaryInput> not) {
        this.tag = tag;
        this.dataSource = dataSource;
        this.site = site;
        this.and = and;
        this.or = or;
        this.not = not;
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

    public java.util.List<FilterDetectionsSummaryInput> getAnd() {
        return and;
    }
    public void setAnd(java.util.List<FilterDetectionsSummaryInput> and) {
        this.and = and;
    }

    public java.util.List<FilterDetectionsSummaryInput> getOr() {
        return or;
    }
    public void setOr(java.util.List<FilterDetectionsSummaryInput> or) {
        this.or = or;
    }

    public org.springframework.graphql.data.ArgumentValue<FilterDetectionsSummaryInput> getNot() {
        return not;
    }
    public void setNot(org.springframework.graphql.data.ArgumentValue<FilterDetectionsSummaryInput> not) {
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
        final FilterDetectionsSummaryInput that = (FilterDetectionsSummaryInput) obj;
        return Objects.equals(tag, that.tag)
            && Objects.equals(dataSource, that.dataSource)
            && Objects.equals(site, that.site)
            && Objects.equals(and, that.and)
            && Objects.equals(or, that.or)
            && Objects.equals(not, that.not);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tag, dataSource, site, and, or, not);
    }


    public static FilterDetectionsSummaryInput.Builder builder() {
        return new FilterDetectionsSummaryInput.Builder();
    }

    public static class Builder {

        private org.springframework.graphql.data.ArgumentValue<FilterTagInput> tag = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterDataSourceInput> dataSource = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterSiteInput> site = org.springframework.graphql.data.ArgumentValue.omitted();
        private java.util.List<FilterDetectionsSummaryInput> and;
        private java.util.List<FilterDetectionsSummaryInput> or;
        private org.springframework.graphql.data.ArgumentValue<FilterDetectionsSummaryInput> not = org.springframework.graphql.data.ArgumentValue.omitted();

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

        public Builder setAnd(java.util.List<FilterDetectionsSummaryInput> and) {
            this.and = and;
            return this;
        }

        public Builder setOr(java.util.List<FilterDetectionsSummaryInput> or) {
            this.or = or;
            return this;
        }

        public Builder setNot(org.springframework.graphql.data.ArgumentValue<FilterDetectionsSummaryInput> not) {
            this.not = not;
            return this;
        }


        public FilterDetectionsSummaryInput build() {
            return new FilterDetectionsSummaryInput(tag, dataSource, site, and, or, not);
        }

    }
}
