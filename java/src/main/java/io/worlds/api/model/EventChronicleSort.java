package io.worlds.api.model;

import java.util.Objects;

/**
 * Indicates the field used for sorting an [`eventChronicles` query]({{Queries.eventChronicles}}).
 */
public class EventChronicleSort implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private EventChronicleSortField field;
    @jakarta.validation.constraints.NotNull
    private SortDirection direction;

    public EventChronicleSort() {
    }

    public EventChronicleSort(EventChronicleSortField field, SortDirection direction) {
        this.field = field;
        this.direction = direction;
    }

    public EventChronicleSortField getField() {
        return field;
    }
    public void setField(EventChronicleSortField field) {
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
        final EventChronicleSort that = (EventChronicleSort) obj;
        return Objects.equals(field, that.field)
            && Objects.equals(direction, that.direction);
    }

    @Override
    public int hashCode() {
        return Objects.hash(field, direction);
    }


    public static EventChronicleSort.Builder builder() {
        return new EventChronicleSort.Builder();
    }

    public static class Builder {

        private EventChronicleSortField field;
        private SortDirection direction;

        public Builder() {
        }

        public Builder setField(EventChronicleSortField field) {
            this.field = field;
            return this;
        }

        public Builder setDirection(SortDirection direction) {
            this.direction = direction;
            return this;
        }


        public EventChronicleSort build() {
            return new EventChronicleSort(field, direction);
        }

    }
}
