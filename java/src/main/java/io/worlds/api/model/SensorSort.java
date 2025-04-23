package io.worlds.api.model;


public class SensorSort implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private SensorSortField field;
    @jakarta.validation.constraints.NotNull
    private SortDirection direction;

    public SensorSort() {
    }

    public SensorSort(SensorSortField field, SortDirection direction) {
        this.field = field;
        this.direction = direction;
    }

    public SensorSortField getField() {
        return field;
    }
    public void setField(SensorSortField field) {
        this.field = field;
    }

    public SortDirection getDirection() {
        return direction;
    }
    public void setDirection(SortDirection direction) {
        this.direction = direction;
    }



    public static SensorSort.Builder builder() {
        return new SensorSort.Builder();
    }

    public static class Builder {

        private SensorSortField field;
        private SortDirection direction;

        public Builder() {
        }

        public Builder setField(SensorSortField field) {
            this.field = field;
            return this;
        }

        public Builder setDirection(SortDirection direction) {
            this.direction = direction;
            return this;
        }


        public SensorSort build() {
            return new SensorSort(field, direction);
        }

    }
}
