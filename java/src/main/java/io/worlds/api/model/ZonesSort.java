package io.worlds.api.model;


/**
 * ZonesSort allows for sorting zones by a sort field and direction.
 */
public class ZonesSort implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private ZonesSortField field;
    @jakarta.validation.constraints.NotNull
    private SortDirection direction;

    public ZonesSort() {
    }

    public ZonesSort(ZonesSortField field, SortDirection direction) {
        this.field = field;
        this.direction = direction;
    }

    public ZonesSortField getField() {
        return field;
    }
    public void setField(ZonesSortField field) {
        this.field = field;
    }

    public SortDirection getDirection() {
        return direction;
    }
    public void setDirection(SortDirection direction) {
        this.direction = direction;
    }



    public static ZonesSort.Builder builder() {
        return new ZonesSort.Builder();
    }

    public static class Builder {

        private ZonesSortField field;
        private SortDirection direction;

        public Builder() {
        }

        public Builder setField(ZonesSortField field) {
            this.field = field;
            return this;
        }

        public Builder setDirection(SortDirection direction) {
            this.direction = direction;
            return this;
        }


        public ZonesSort build() {
            return new ZonesSort(field, direction);
        }

    }
}
