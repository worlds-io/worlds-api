package io.worlds.api.model;


public class ZoneCollisionsSort implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private ZoneCollisionsSortField field;
    @jakarta.validation.constraints.NotNull
    private SortDirection direction;

    public ZoneCollisionsSort() {
    }

    public ZoneCollisionsSort(ZoneCollisionsSortField field, SortDirection direction) {
        this.field = field;
        this.direction = direction;
    }

    public ZoneCollisionsSortField getField() {
        return field;
    }
    public void setField(ZoneCollisionsSortField field) {
        this.field = field;
    }

    public SortDirection getDirection() {
        return direction;
    }
    public void setDirection(SortDirection direction) {
        this.direction = direction;
    }



    public static ZoneCollisionsSort.Builder builder() {
        return new ZoneCollisionsSort.Builder();
    }

    public static class Builder {

        private ZoneCollisionsSortField field;
        private SortDirection direction;

        public Builder() {
        }

        public Builder setField(ZoneCollisionsSortField field) {
            this.field = field;
            return this;
        }

        public Builder setDirection(SortDirection direction) {
            this.direction = direction;
            return this;
        }


        public ZoneCollisionsSort build() {
            return new ZoneCollisionsSort(field, direction);
        }

    }
}
