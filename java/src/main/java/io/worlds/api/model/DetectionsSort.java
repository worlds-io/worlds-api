package io.worlds.api.model;


/**
 * DetectionsSort allows for sorting a detection by detection sort field and direction.
 */
public class DetectionsSort implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private DetectionsSortField field;
    @jakarta.validation.constraints.NotNull
    private SortDirection direction;

    public DetectionsSort() {
    }

    public DetectionsSort(DetectionsSortField field, SortDirection direction) {
        this.field = field;
        this.direction = direction;
    }

    public DetectionsSortField getField() {
        return field;
    }
    public void setField(DetectionsSortField field) {
        this.field = field;
    }

    public SortDirection getDirection() {
        return direction;
    }
    public void setDirection(SortDirection direction) {
        this.direction = direction;
    }



    public static DetectionsSort.Builder builder() {
        return new DetectionsSort.Builder();
    }

    public static class Builder {

        private DetectionsSortField field;
        private SortDirection direction;

        public Builder() {
        }

        public Builder setField(DetectionsSortField field) {
            this.field = field;
            return this;
        }

        public Builder setDirection(SortDirection direction) {
            this.direction = direction;
            return this;
        }


        public DetectionsSort build() {
            return new DetectionsSort(field, direction);
        }

    }
}
