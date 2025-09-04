package io.worlds.api.model;


/**
 * DevicesSort allows for sorting a [`devices` query]({{Queries.devices}}) by field and direction.
 */
public class DevicesSort implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private DevicesSortField field;
    @jakarta.validation.constraints.NotNull
    private SortDirection direction;

    public DevicesSort() {
    }

    public DevicesSort(DevicesSortField field, SortDirection direction) {
        this.field = field;
        this.direction = direction;
    }

    public DevicesSortField getField() {
        return field;
    }
    public void setField(DevicesSortField field) {
        this.field = field;
    }

    public SortDirection getDirection() {
        return direction;
    }
    public void setDirection(SortDirection direction) {
        this.direction = direction;
    }



    public static DevicesSort.Builder builder() {
        return new DevicesSort.Builder();
    }

    public static class Builder {

        private DevicesSortField field;
        private SortDirection direction;

        public Builder() {
        }

        public Builder setField(DevicesSortField field) {
            this.field = field;
            return this;
        }

        public Builder setDirection(SortDirection direction) {
            this.direction = direction;
            return this;
        }


        public DevicesSort build() {
            return new DevicesSort(field, direction);
        }

    }
}
