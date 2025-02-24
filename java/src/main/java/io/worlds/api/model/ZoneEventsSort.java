package io.worlds.api.model;


public class ZoneEventsSort implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private ZoneEventsSortField field;
    @jakarta.validation.constraints.NotNull
    private SortDirection direction;

    public ZoneEventsSort() {
    }

    public ZoneEventsSort(ZoneEventsSortField field, SortDirection direction) {
        this.field = field;
        this.direction = direction;
    }

    public ZoneEventsSortField getField() {
        return field;
    }
    public void setField(ZoneEventsSortField field) {
        this.field = field;
    }

    public SortDirection getDirection() {
        return direction;
    }
    public void setDirection(SortDirection direction) {
        this.direction = direction;
    }



    public static ZoneEventsSort.Builder builder() {
        return new ZoneEventsSort.Builder();
    }

    public static class Builder {

        private ZoneEventsSortField field;
        private SortDirection direction;

        public Builder() {
        }

        public Builder setField(ZoneEventsSortField field) {
            this.field = field;
            return this;
        }

        public Builder setDirection(SortDirection direction) {
            this.direction = direction;
            return this;
        }


        public ZoneEventsSort build() {
            return new ZoneEventsSort(field, direction);
        }

    }
}
