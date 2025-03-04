package io.worlds.api.model;


public class GeofencesSort implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private GeofencesSortField field;
    @jakarta.validation.constraints.NotNull
    private SortDirection direction;

    public GeofencesSort() {
    }

    public GeofencesSort(GeofencesSortField field, SortDirection direction) {
        this.field = field;
        this.direction = direction;
    }

    public GeofencesSortField getField() {
        return field;
    }
    public void setField(GeofencesSortField field) {
        this.field = field;
    }

    public SortDirection getDirection() {
        return direction;
    }
    public void setDirection(SortDirection direction) {
        this.direction = direction;
    }



    public static GeofencesSort.Builder builder() {
        return new GeofencesSort.Builder();
    }

    public static class Builder {

        private GeofencesSortField field;
        private SortDirection direction;

        public Builder() {
        }

        public Builder setField(GeofencesSortField field) {
            this.field = field;
            return this;
        }

        public Builder setDirection(SortDirection direction) {
            this.direction = direction;
            return this;
        }


        public GeofencesSort build() {
            return new GeofencesSort(field, direction);
        }

    }
}
