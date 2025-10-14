package io.worlds.api.model;


/**
 * `FilterDeviceMessageStateInput` allows for filtering based on a [DeviceMessageState]({{Types.messagemessagestate}}) parameter. Only one field should be provided per filter object.
Note that the `UPDATE` state alone will not include `CREATE` and `HEARTBEAT` messages.
 */
public class FilterDeviceMessageStateInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private org.springframework.graphql.data.ArgumentValue<DeviceMessageState> eq = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<DeviceMessageState> ne = org.springframework.graphql.data.ArgumentValue.omitted();
    private java.util.List<DeviceMessageState> in;

    public FilterDeviceMessageStateInput() {
    }

    public FilterDeviceMessageStateInput(org.springframework.graphql.data.ArgumentValue<DeviceMessageState> eq, org.springframework.graphql.data.ArgumentValue<DeviceMessageState> ne, java.util.List<DeviceMessageState> in) {
        this.eq = eq;
        this.ne = ne;
        this.in = in;
    }

    public org.springframework.graphql.data.ArgumentValue<DeviceMessageState> getEq() {
        return eq;
    }
    public void setEq(org.springframework.graphql.data.ArgumentValue<DeviceMessageState> eq) {
        this.eq = eq;
    }

    public org.springframework.graphql.data.ArgumentValue<DeviceMessageState> getNe() {
        return ne;
    }
    public void setNe(org.springframework.graphql.data.ArgumentValue<DeviceMessageState> ne) {
        this.ne = ne;
    }

    public java.util.List<DeviceMessageState> getIn() {
        return in;
    }
    public void setIn(java.util.List<DeviceMessageState> in) {
        this.in = in;
    }



    public static FilterDeviceMessageStateInput.Builder builder() {
        return new FilterDeviceMessageStateInput.Builder();
    }

    public static class Builder {

        private org.springframework.graphql.data.ArgumentValue<DeviceMessageState> eq = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<DeviceMessageState> ne = org.springframework.graphql.data.ArgumentValue.omitted();
        private java.util.List<DeviceMessageState> in;

        public Builder() {
        }

        public Builder setEq(org.springframework.graphql.data.ArgumentValue<DeviceMessageState> eq) {
            this.eq = eq;
            return this;
        }

        public Builder setNe(org.springframework.graphql.data.ArgumentValue<DeviceMessageState> ne) {
            this.ne = ne;
            return this;
        }

        public Builder setIn(java.util.List<DeviceMessageState> in) {
            this.in = in;
            return this;
        }


        public FilterDeviceMessageStateInput build() {
            return new FilterDeviceMessageStateInput(eq, ne, in);
        }

    }
}
