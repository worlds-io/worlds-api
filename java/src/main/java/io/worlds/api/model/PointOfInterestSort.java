package io.worlds.api.model;


public class PointOfInterestSort implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private PointOfInterestSortField field;
    @jakarta.validation.constraints.NotNull
    private SortDirection direction;

    public PointOfInterestSort() {
    }

    public PointOfInterestSort(PointOfInterestSortField field, SortDirection direction) {
        this.field = field;
        this.direction = direction;
    }

    public PointOfInterestSortField getField() {
        return field;
    }
    public void setField(PointOfInterestSortField field) {
        this.field = field;
    }

    public SortDirection getDirection() {
        return direction;
    }
    public void setDirection(SortDirection direction) {
        this.direction = direction;
    }



    public static PointOfInterestSort.Builder builder() {
        return new PointOfInterestSort.Builder();
    }

    public static class Builder {

        private PointOfInterestSortField field;
        private SortDirection direction;

        public Builder() {
        }

        public Builder setField(PointOfInterestSortField field) {
            this.field = field;
            return this;
        }

        public Builder setDirection(SortDirection direction) {
            this.direction = direction;
            return this;
        }


        public PointOfInterestSort build() {
            return new PointOfInterestSort(field, direction);
        }

    }
}
