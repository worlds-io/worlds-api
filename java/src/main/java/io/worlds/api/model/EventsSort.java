package io.worlds.api.model;

import java.util.Objects;

/**
 * EventsSort allows for sorting an event by a sort field and direction.
 */
public class EventsSort implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private EventsSortField field;
    @jakarta.validation.constraints.NotNull
    private SortDirection direction;

    public EventsSort() {
    }

    public EventsSort(EventsSortField field, SortDirection direction) {
        this.field = field;
        this.direction = direction;
    }

    public EventsSortField getField() {
        return field;
    }
    public void setField(EventsSortField field) {
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
        final EventsSort that = (EventsSort) obj;
        return Objects.equals(field, that.field)
            && Objects.equals(direction, that.direction);
    }

    @Override
    public int hashCode() {
        return Objects.hash(field, direction);
    }


    public static EventsSort.Builder builder() {
        return new EventsSort.Builder();
    }

    public static class Builder {

        private EventsSortField field;
        private SortDirection direction;

        public Builder() {
        }

        public Builder setField(EventsSortField field) {
            this.field = field;
            return this;
        }

        public Builder setDirection(SortDirection direction) {
            this.direction = direction;
            return this;
        }


        public EventsSort build() {
            return new EventsSort(field, direction);
        }

    }
}
