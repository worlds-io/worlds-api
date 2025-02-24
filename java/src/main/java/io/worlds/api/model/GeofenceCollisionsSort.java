package io.worlds.api.model;


public class GeofenceCollisionsSort implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private GeofenceCollisionsSortField field;
    @jakarta.validation.constraints.NotNull
    private SortDirection direction;

    public GeofenceCollisionsSort() {
    }

    public GeofenceCollisionsSort(GeofenceCollisionsSortField field, SortDirection direction) {
        this.field = field;
        this.direction = direction;
    }

    public GeofenceCollisionsSortField getField() {
        return field;
    }
    public void setField(GeofenceCollisionsSortField field) {
        this.field = field;
    }

    public SortDirection getDirection() {
        return direction;
    }
    public void setDirection(SortDirection direction) {
        this.direction = direction;
    }



    public static GeofenceCollisionsSort.Builder builder() {
        return new GeofenceCollisionsSort.Builder();
    }

    public static class Builder {

        private GeofenceCollisionsSortField field;
        private SortDirection direction;

        public Builder() {
        }

        public Builder setField(GeofenceCollisionsSortField field) {
            this.field = field;
            return this;
        }

        public Builder setDirection(SortDirection direction) {
            this.direction = direction;
            return this;
        }


        public GeofenceCollisionsSort build() {
            return new GeofenceCollisionsSort(field, direction);
        }

    }
}
