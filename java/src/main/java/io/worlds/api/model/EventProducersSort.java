package io.worlds.api.model;


/**
 * EventProducersSort allows for sorting an event producer by a sort field and direction.
 */
public class EventProducersSort implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private EventProducersSortField field;
    @jakarta.validation.constraints.NotNull
    private SortDirection direction;

    public EventProducersSort() {
    }

    public EventProducersSort(EventProducersSortField field, SortDirection direction) {
        this.field = field;
        this.direction = direction;
    }

    public EventProducersSortField getField() {
        return field;
    }
    public void setField(EventProducersSortField field) {
        this.field = field;
    }

    public SortDirection getDirection() {
        return direction;
    }
    public void setDirection(SortDirection direction) {
        this.direction = direction;
    }



    public static EventProducersSort.Builder builder() {
        return new EventProducersSort.Builder();
    }

    public static class Builder {

        private EventProducersSortField field;
        private SortDirection direction;

        public Builder() {
        }

        public Builder setField(EventProducersSortField field) {
            this.field = field;
            return this;
        }

        public Builder setDirection(SortDirection direction) {
            this.direction = direction;
            return this;
        }


        public EventProducersSort build() {
            return new EventProducersSort(field, direction);
        }

    }
}
