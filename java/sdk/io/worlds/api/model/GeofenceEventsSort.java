package io.worlds.api.model;


public class GeofenceEventsSort implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private GeofenceEventsSortField field;
    @jakarta.validation.constraints.NotNull
    private SortDirection direction;

    public GeofenceEventsSort() {
    }

    public GeofenceEventsSort(GeofenceEventsSortField field, SortDirection direction) {
        this.field = field;
        this.direction = direction;
    }

    public GeofenceEventsSortField getField() {
        return field;
    }
    public void setField(GeofenceEventsSortField field) {
        this.field = field;
    }

    public SortDirection getDirection() {
        return direction;
    }
    public void setDirection(SortDirection direction) {
        this.direction = direction;
    }



    public static GeofenceEventsSort.Builder builder() {
        return new GeofenceEventsSort.Builder();
    }

    public static class Builder {

        private GeofenceEventsSortField field;
        private SortDirection direction;

        public Builder() {
        }

        public Builder setField(GeofenceEventsSortField field) {
            this.field = field;
            return this;
        }

        public Builder setDirection(SortDirection direction) {
            this.direction = direction;
            return this;
        }


        public GeofenceEventsSort build() {
            return new GeofenceEventsSort(field, direction);
        }

    }
}
