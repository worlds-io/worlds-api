package io.worlds.api.model;

import java.util.Objects;

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

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final EventProducersSort that = (EventProducersSort) obj;
        return Objects.equals(field, that.field)
            && Objects.equals(direction, that.direction);
    }

    @Override
    public int hashCode() {
        return Objects.hash(field, direction);
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
