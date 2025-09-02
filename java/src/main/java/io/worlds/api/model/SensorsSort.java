package io.worlds.api.model;


/**
 * SensorsSort allows for sorting a [`sensors` query]({{Query.sensors}}) by field and direction.
 */
public class SensorsSort implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private SensorsSortField field;
    @jakarta.validation.constraints.NotNull
    private SortDirection direction;

    public SensorsSort() {
    }

    public SensorsSort(SensorsSortField field, SortDirection direction) {
        this.field = field;
        this.direction = direction;
    }

    public SensorsSortField getField() {
        return field;
    }
    public void setField(SensorsSortField field) {
        this.field = field;
    }

    public SortDirection getDirection() {
        return direction;
    }
    public void setDirection(SortDirection direction) {
        this.direction = direction;
    }



    public static SensorsSort.Builder builder() {
        return new SensorsSort.Builder();
    }

    public static class Builder {

        private SensorsSortField field;
        private SortDirection direction;

        public Builder() {
        }

        public Builder setField(SensorsSortField field) {
            this.field = field;
            return this;
        }

        public Builder setDirection(SortDirection direction) {
            this.direction = direction;
            return this;
        }


        public SensorsSort build() {
            return new SensorsSort(field, direction);
        }

    }
}
