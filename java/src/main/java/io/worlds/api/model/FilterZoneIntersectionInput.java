package io.worlds.api.model;


public class FilterZoneIntersectionInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private org.springframework.graphql.data.ArgumentValue<FilterIDInput> zoneId = org.springframework.graphql.data.ArgumentValue.omitted();
    @jakarta.validation.constraints.NotNull
    private FilterDateTimeOffsetInput time;
    private java.util.List<FilterZoneIntersectionInput> and;
    private java.util.List<FilterZoneIntersectionInput> or;
    private org.springframework.graphql.data.ArgumentValue<FilterZoneIntersectionInput> not = org.springframework.graphql.data.ArgumentValue.omitted();

    public FilterZoneIntersectionInput() {
    }

    public FilterZoneIntersectionInput(org.springframework.graphql.data.ArgumentValue<FilterIDInput> zoneId, FilterDateTimeOffsetInput time, java.util.List<FilterZoneIntersectionInput> and, java.util.List<FilterZoneIntersectionInput> or, org.springframework.graphql.data.ArgumentValue<FilterZoneIntersectionInput> not) {
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

    public java.util.List<FilterZoneIntersectionInput> getAnd() {
        return and;
    }
    public void setAnd(java.util.List<FilterZoneIntersectionInput> and) {
        this.and = and;
    }

    public java.util.List<FilterZoneIntersectionInput> getOr() {
        return or;
    }
    public void setOr(java.util.List<FilterZoneIntersectionInput> or) {
        this.or = or;
    }

    public org.springframework.graphql.data.ArgumentValue<FilterZoneIntersectionInput> getNot() {
        return not;
    }
    public void setNot(org.springframework.graphql.data.ArgumentValue<FilterZoneIntersectionInput> not) {
        this.not = not;
    }



    public static FilterZoneIntersectionInput.Builder builder() {
        return new FilterZoneIntersectionInput.Builder();
    }

    public static class Builder {

        private org.springframework.graphql.data.ArgumentValue<FilterIDInput> zoneId = org.springframework.graphql.data.ArgumentValue.omitted();
        private FilterDateTimeOffsetInput time;
        private java.util.List<FilterZoneIntersectionInput> and;
        private java.util.List<FilterZoneIntersectionInput> or;
        private org.springframework.graphql.data.ArgumentValue<FilterZoneIntersectionInput> not = org.springframework.graphql.data.ArgumentValue.omitted();

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

        public Builder setAnd(java.util.List<FilterZoneIntersectionInput> and) {
            this.and = and;
            return this;
        }

        public Builder setOr(java.util.List<FilterZoneIntersectionInput> or) {
            this.or = or;
            return this;
        }

        public Builder setNot(org.springframework.graphql.data.ArgumentValue<FilterZoneIntersectionInput> not) {
            this.not = not;
            return this;
        }


        public FilterZoneIntersectionInput build() {
            return new FilterZoneIntersectionInput(zoneId, time, and, or, not);
        }

    }
}
