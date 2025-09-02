package io.worlds.api.model;


/**
 * MeasurementsSort allows for sorting measurements by a sort field and direction.
 */
public class MeasurementsSort implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private MeasurementsSortField field;
    @jakarta.validation.constraints.NotNull
    private SortDirection direction;

    public MeasurementsSort() {
    }

    public MeasurementsSort(MeasurementsSortField field, SortDirection direction) {
        this.field = field;
        this.direction = direction;
    }

    public MeasurementsSortField getField() {
        return field;
    }
    public void setField(MeasurementsSortField field) {
        this.field = field;
    }

    public SortDirection getDirection() {
        return direction;
    }
    public void setDirection(SortDirection direction) {
        this.direction = direction;
    }



    public static MeasurementsSort.Builder builder() {
        return new MeasurementsSort.Builder();
    }

    public static class Builder {

        private MeasurementsSortField field;
        private SortDirection direction;

        public Builder() {
        }

        public Builder setField(MeasurementsSortField field) {
            this.field = field;
            return this;
        }

        public Builder setDirection(SortDirection direction) {
            this.direction = direction;
            return this;
        }


        public MeasurementsSort build() {
            return new MeasurementsSort(field, direction);
        }

    }
}
