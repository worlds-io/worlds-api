package io.worlds.api.model;


public class FilterZoneIntersectionQueryInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private org.springframework.graphql.data.ArgumentValue<FilterIDInput> zoneId = org.springframework.graphql.data.ArgumentValue.omitted();
    @jakarta.validation.constraints.NotNull
    private FilterDateTimeOffsetInput time;
    private java.util.List<FilterZoneIntersectionQueryInput> and;
    private java.util.List<FilterZoneIntersectionQueryInput> or;
    private org.springframework.graphql.data.ArgumentValue<FilterZoneIntersectionQueryInput> not = org.springframework.graphql.data.ArgumentValue.omitted();

    public FilterZoneIntersectionQueryInput() {
    }

    public FilterZoneIntersectionQueryInput(org.springframework.graphql.data.ArgumentValue<FilterIDInput> zoneId, FilterDateTimeOffsetInput time, java.util.List<FilterZoneIntersectionQueryInput> and, java.util.List<FilterZoneIntersectionQueryInput> or, org.springframework.graphql.data.ArgumentValue<FilterZoneIntersectionQueryInput> not) {
        this.zoneId = zoneId;
        this.time = time;
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

    public FilterDateTimeOffsetInput getTime() {
        return time;
    }
    public void setTime(FilterDateTimeOffsetInput time) {
        this.time = time;
    }

    public java.util.List<FilterZoneIntersectionQueryInput> getAnd() {
        return and;
    }
    public void setAnd(java.util.List<FilterZoneIntersectionQueryInput> and) {
        this.and = and;
    }

    public java.util.List<FilterZoneIntersectionQueryInput> getOr() {
        return or;
    }
    public void setOr(java.util.List<FilterZoneIntersectionQueryInput> or) {
        this.or = or;
    }

    public org.springframework.graphql.data.ArgumentValue<FilterZoneIntersectionQueryInput> getNot() {
        return not;
    }
    public void setNot(org.springframework.graphql.data.ArgumentValue<FilterZoneIntersectionQueryInput> not) {
        this.not = not;
    }



    public static FilterZoneIntersectionQueryInput.Builder builder() {
        return new FilterZoneIntersectionQueryInput.Builder();
    }

    public static class Builder {

        private org.springframework.graphql.data.ArgumentValue<FilterIDInput> zoneId = org.springframework.graphql.data.ArgumentValue.omitted();
        private FilterDateTimeOffsetInput time;
        private java.util.List<FilterZoneIntersectionQueryInput> and;
        private java.util.List<FilterZoneIntersectionQueryInput> or;
        private org.springframework.graphql.data.ArgumentValue<FilterZoneIntersectionQueryInput> not = org.springframework.graphql.data.ArgumentValue.omitted();

        public Builder() {
        }

        public Builder setZoneId(org.springframework.graphql.data.ArgumentValue<FilterIDInput> zoneId) {
            this.zoneId = zoneId;
            return this;
        }

        public Builder setTime(FilterDateTimeOffsetInput time) {
            this.time = time;
            return this;
        }

        public Builder setAnd(java.util.List<FilterZoneIntersectionQueryInput> and) {
            this.and = and;
            return this;
        }

        public Builder setOr(java.util.List<FilterZoneIntersectionQueryInput> or) {
            this.or = or;
            return this;
        }

        public Builder setNot(org.springframework.graphql.data.ArgumentValue<FilterZoneIntersectionQueryInput> not) {
            this.not = not;
            return this;
        }


        public FilterZoneIntersectionQueryInput build() {
            return new FilterZoneIntersectionQueryInput(zoneId, time, and, or, not);
        }

    }
}
