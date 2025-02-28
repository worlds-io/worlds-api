package io.worlds.api.model;


public class FilterZoneCollisionMessageInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private org.springframework.graphql.data.ArgumentValue<FilterIDInput> zoneId = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterIDInput> dataSourceId = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterMessageStateInput> state = org.springframework.graphql.data.ArgumentValue.omitted();
    private java.util.List<FilterZoneCollisionMessageInput> and;
    private java.util.List<FilterZoneCollisionMessageInput> or;
    private org.springframework.graphql.data.ArgumentValue<FilterZoneCollisionMessageInput> not = org.springframework.graphql.data.ArgumentValue.omitted();

    public FilterZoneCollisionMessageInput() {
    }

    public FilterZoneCollisionMessageInput(org.springframework.graphql.data.ArgumentValue<FilterIDInput> zoneId, org.springframework.graphql.data.ArgumentValue<FilterIDInput> dataSourceId, org.springframework.graphql.data.ArgumentValue<FilterMessageStateInput> state, java.util.List<FilterZoneCollisionMessageInput> and, java.util.List<FilterZoneCollisionMessageInput> or, org.springframework.graphql.data.ArgumentValue<FilterZoneCollisionMessageInput> not) {
        this.zoneId = zoneId;
        this.dataSourceId = dataSourceId;
        this.state = state;
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

    public org.springframework.graphql.data.ArgumentValue<FilterIDInput> getDataSourceId() {
        return dataSourceId;
    }
    public void setDataSourceId(org.springframework.graphql.data.ArgumentValue<FilterIDInput> dataSourceId) {
        this.dataSourceId = dataSourceId;
    }

    public org.springframework.graphql.data.ArgumentValue<FilterMessageStateInput> getState() {
        return state;
    }
    public void setState(org.springframework.graphql.data.ArgumentValue<FilterMessageStateInput> state) {
        this.state = state;
    }

    public java.util.List<FilterZoneCollisionMessageInput> getAnd() {
        return and;
    }
    public void setAnd(java.util.List<FilterZoneCollisionMessageInput> and) {
        this.and = and;
    }

    public java.util.List<FilterZoneCollisionMessageInput> getOr() {
        return or;
    }
    public void setOr(java.util.List<FilterZoneCollisionMessageInput> or) {
        this.or = or;
    }

    public org.springframework.graphql.data.ArgumentValue<FilterZoneCollisionMessageInput> getNot() {
        return not;
    }
    public void setNot(org.springframework.graphql.data.ArgumentValue<FilterZoneCollisionMessageInput> not) {
        this.not = not;
    }



    public static FilterZoneCollisionMessageInput.Builder builder() {
        return new FilterZoneCollisionMessageInput.Builder();
    }

    public static class Builder {

        private org.springframework.graphql.data.ArgumentValue<FilterIDInput> zoneId = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterIDInput> dataSourceId = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterMessageStateInput> state = org.springframework.graphql.data.ArgumentValue.omitted();
        private java.util.List<FilterZoneCollisionMessageInput> and;
        private java.util.List<FilterZoneCollisionMessageInput> or;
        private org.springframework.graphql.data.ArgumentValue<FilterZoneCollisionMessageInput> not = org.springframework.graphql.data.ArgumentValue.omitted();

        public Builder() {
        }

        public Builder setZoneId(org.springframework.graphql.data.ArgumentValue<FilterIDInput> zoneId) {
            this.zoneId = zoneId;
            return this;
        }

        public Builder setDataSourceId(org.springframework.graphql.data.ArgumentValue<FilterIDInput> dataSourceId) {
            this.dataSourceId = dataSourceId;
            return this;
        }

        public Builder setState(org.springframework.graphql.data.ArgumentValue<FilterMessageStateInput> state) {
            this.state = state;
            return this;
        }

        public Builder setAnd(java.util.List<FilterZoneCollisionMessageInput> and) {
            this.and = and;
            return this;
        }

        public Builder setOr(java.util.List<FilterZoneCollisionMessageInput> or) {
            this.or = or;
            return this;
        }

        public Builder setNot(org.springframework.graphql.data.ArgumentValue<FilterZoneCollisionMessageInput> not) {
            this.not = not;
            return this;
        }


        public FilterZoneCollisionMessageInput build() {
            return new FilterZoneCollisionMessageInput(zoneId, dataSourceId, state, and, or, not);
        }

    }
}
