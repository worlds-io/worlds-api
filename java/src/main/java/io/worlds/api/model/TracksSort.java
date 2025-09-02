package io.worlds.api.model;


/**
 * TracksSort allows for sorting a [`tracks` query]({{Query.tracks}}) by field and direction.
 */
public class TracksSort implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private TracksSortField field;
    @jakarta.validation.constraints.NotNull
    private SortDirection direction;

    public TracksSort() {
    }

    public TracksSort(TracksSortField field, SortDirection direction) {
        this.field = field;
        this.direction = direction;
    }

    public TracksSortField getField() {
        return field;
    }
    public void setField(TracksSortField field) {
        this.field = field;
    }

    public SortDirection getDirection() {
        return direction;
    }
    public void setDirection(SortDirection direction) {
        this.direction = direction;
    }



    public static TracksSort.Builder builder() {
        return new TracksSort.Builder();
    }

    public static class Builder {

        private TracksSortField field;
        private SortDirection direction;

        public Builder() {
        }

        public Builder setField(TracksSortField field) {
            this.field = field;
            return this;
        }

        public Builder setDirection(SortDirection direction) {
            this.direction = direction;
            return this;
        }


        public TracksSort build() {
            return new TracksSort(field, direction);
        }

    }
}
