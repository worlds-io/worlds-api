package io.worlds.api.model;


public class GeofenceIntersectionsSort implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private GeofenceIntersectionsSortField field;
    @jakarta.validation.constraints.NotNull
    private SortDirection direction;

    public GeofenceIntersectionsSort() {
    }

    public GeofenceIntersectionsSort(GeofenceIntersectionsSortField field, SortDirection direction) {
        this.field = field;
        this.direction = direction;
    }

    public GeofenceIntersectionsSortField getField() {
        return field;
    }
    public void setField(GeofenceIntersectionsSortField field) {
        this.field = field;
    }

    public SortDirection getDirection() {
        return direction;
    }
    public void setDirection(SortDirection direction) {
        this.direction = direction;
    }



    public static GeofenceIntersectionsSort.Builder builder() {
        return new GeofenceIntersectionsSort.Builder();
    }

    public static class Builder {

        private GeofenceIntersectionsSortField field;
        private SortDirection direction;

        public Builder() {
        }

        public Builder setField(GeofenceIntersectionsSortField field) {
            this.field = field;
            return this;
        }

        public Builder setDirection(SortDirection direction) {
            this.direction = direction;
            return this;
        }


        public GeofenceIntersectionsSort build() {
            return new GeofenceIntersectionsSort(field, direction);
        }

    }
}
