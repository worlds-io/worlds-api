package io.worlds.api.model;


/**
 * ZoneIntersectionsSort allows for sorting zone intersections by a sort field and direction.
 */
public class ZoneIntersectionsSort implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private ZoneIntersectionsSortField field;
    @jakarta.validation.constraints.NotNull
    private SortDirection direction;

    public ZoneIntersectionsSort() {
    }

    public ZoneIntersectionsSort(ZoneIntersectionsSortField field, SortDirection direction) {
        this.field = field;
        this.direction = direction;
    }

    public ZoneIntersectionsSortField getField() {
        return field;
    }
    public void setField(ZoneIntersectionsSortField field) {
        this.field = field;
    }

    public SortDirection getDirection() {
        return direction;
    }
    public void setDirection(SortDirection direction) {
        this.direction = direction;
    }



    public static ZoneIntersectionsSort.Builder builder() {
        return new ZoneIntersectionsSort.Builder();
    }

    public static class Builder {

        private ZoneIntersectionsSortField field;
        private SortDirection direction;

        public Builder() {
        }

        public Builder setField(ZoneIntersectionsSortField field) {
            this.field = field;
            return this;
        }

        public Builder setDirection(SortDirection direction) {
            this.direction = direction;
            return this;
        }


        public ZoneIntersectionsSort build() {
            return new ZoneIntersectionsSort(field, direction);
        }

    }
}
