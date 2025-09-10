package io.worlds.api.model;


/**
 * FilterDeviceMessageInput allows for filtering device messages based on criteria described below.
Only one field should be provided per Filter object unless using an operator (`and` `or` `not`) as specified below
 */
public class FilterDeviceMessageInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private org.springframework.graphql.data.ArgumentValue<FilterIDInput> id = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterIDInput> uuid = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterStringInput> name = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterStringInput> externalId = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterStringInput> address = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterBooleanInput> enabled = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterDeviceMessageStateInput> state = org.springframework.graphql.data.ArgumentValue.omitted();
    private java.util.List<FilterDeviceMessageInput> and;
    private java.util.List<FilterDeviceMessageInput> or;
    private org.springframework.graphql.data.ArgumentValue<FilterDeviceMessageInput> not = org.springframework.graphql.data.ArgumentValue.omitted();

    public FilterDeviceMessageInput() {
    }

    public FilterDeviceMessageInput(org.springframework.graphql.data.ArgumentValue<FilterIDInput> id, org.springframework.graphql.data.ArgumentValue<FilterIDInput> uuid, org.springframework.graphql.data.ArgumentValue<FilterStringInput> name, org.springframework.graphql.data.ArgumentValue<FilterStringInput> externalId, org.springframework.graphql.data.ArgumentValue<FilterStringInput> address, org.springframework.graphql.data.ArgumentValue<FilterBooleanInput> enabled, org.springframework.graphql.data.ArgumentValue<FilterDeviceMessageStateInput> state, java.util.List<FilterDeviceMessageInput> and, java.util.List<FilterDeviceMessageInput> or, org.springframework.graphql.data.ArgumentValue<FilterDeviceMessageInput> not) {
        this.id = id;
        this.uuid = uuid;
        this.name = name;
        this.externalId = externalId;
        this.address = address;
        this.enabled = enabled;
        this.state = state;
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

    public org.springframework.graphql.data.ArgumentValue<FilterIDInput> getUuid() {
        return uuid;
    }
    public void setUuid(org.springframework.graphql.data.ArgumentValue<FilterIDInput> uuid) {
        this.uuid = uuid;
    }

    public org.springframework.graphql.data.ArgumentValue<FilterStringInput> getName() {
        return name;
    }
    public void setName(org.springframework.graphql.data.ArgumentValue<FilterStringInput> name) {
        this.name = name;
    }

    public org.springframework.graphql.data.ArgumentValue<FilterStringInput> getExternalId() {
        return externalId;
    }
    public void setExternalId(org.springframework.graphql.data.ArgumentValue<FilterStringInput> externalId) {
        this.externalId = externalId;
    }

    public org.springframework.graphql.data.ArgumentValue<FilterStringInput> getAddress() {
        return address;
    }
    public void setAddress(org.springframework.graphql.data.ArgumentValue<FilterStringInput> address) {
        this.address = address;
    }

    public org.springframework.graphql.data.ArgumentValue<FilterBooleanInput> getEnabled() {
        return enabled;
    }
    public void setEnabled(org.springframework.graphql.data.ArgumentValue<FilterBooleanInput> enabled) {
        this.enabled = enabled;
    }

    public org.springframework.graphql.data.ArgumentValue<FilterDeviceMessageStateInput> getState() {
        return state;
    }
    public void setState(org.springframework.graphql.data.ArgumentValue<FilterDeviceMessageStateInput> state) {
        this.state = state;
    }

    public java.util.List<FilterDeviceMessageInput> getAnd() {
        return and;
    }
    public void setAnd(java.util.List<FilterDeviceMessageInput> and) {
        this.and = and;
    }

    public java.util.List<FilterDeviceMessageInput> getOr() {
        return or;
    }
    public void setOr(java.util.List<FilterDeviceMessageInput> or) {
        this.or = or;
    }

    public org.springframework.graphql.data.ArgumentValue<FilterDeviceMessageInput> getNot() {
        return not;
    }
    public void setNot(org.springframework.graphql.data.ArgumentValue<FilterDeviceMessageInput> not) {
        this.not = not;
    }



    public static FilterDeviceMessageInput.Builder builder() {
        return new FilterDeviceMessageInput.Builder();
    }

    public static class Builder {

        private org.springframework.graphql.data.ArgumentValue<FilterIDInput> id = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterIDInput> uuid = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterStringInput> name = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterStringInput> externalId = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterStringInput> address = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterBooleanInput> enabled = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterDeviceMessageStateInput> state = org.springframework.graphql.data.ArgumentValue.omitted();
        private java.util.List<FilterDeviceMessageInput> and;
        private java.util.List<FilterDeviceMessageInput> or;
        private org.springframework.graphql.data.ArgumentValue<FilterDeviceMessageInput> not = org.springframework.graphql.data.ArgumentValue.omitted();

        public Builder() {
        }

        public Builder setId(org.springframework.graphql.data.ArgumentValue<FilterIDInput> id) {
            this.id = id;
            return this;
        }

        public Builder setUuid(org.springframework.graphql.data.ArgumentValue<FilterIDInput> uuid) {
            this.uuid = uuid;
            return this;
        }

        public Builder setName(org.springframework.graphql.data.ArgumentValue<FilterStringInput> name) {
            this.name = name;
            return this;
        }

        public Builder setExternalId(org.springframework.graphql.data.ArgumentValue<FilterStringInput> externalId) {
            this.externalId = externalId;
            return this;
        }

        public Builder setAddress(org.springframework.graphql.data.ArgumentValue<FilterStringInput> address) {
            this.address = address;
            return this;
        }

        public Builder setEnabled(org.springframework.graphql.data.ArgumentValue<FilterBooleanInput> enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder setState(org.springframework.graphql.data.ArgumentValue<FilterDeviceMessageStateInput> state) {
            this.state = state;
            return this;
        }

        public Builder setAnd(java.util.List<FilterDeviceMessageInput> and) {
            this.and = and;
            return this;
        }

        public Builder setOr(java.util.List<FilterDeviceMessageInput> or) {
            this.or = or;
            return this;
        }

        public Builder setNot(org.springframework.graphql.data.ArgumentValue<FilterDeviceMessageInput> not) {
            this.not = not;
            return this;
        }


        public FilterDeviceMessageInput build() {
            return new FilterDeviceMessageInput(id, uuid, name, externalId, address, enabled, state, and, or, not);
        }

    }
}
