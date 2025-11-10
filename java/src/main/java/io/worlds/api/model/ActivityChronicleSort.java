package io.worlds.api.model;

import java.util.Objects;

/**
 * Indicates the field used for sorting an [`activityChronicles` query]({{Queries.activityChronicles}}).
 */
public class ActivityChronicleSort implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private ActivityChronicleSortField field;
    @jakarta.validation.constraints.NotNull
    private SortDirection direction;

    public ActivityChronicleSort() {
    }

    public ActivityChronicleSort(ActivityChronicleSortField field, SortDirection direction) {
        this.field = field;
        this.direction = direction;
    }

    public ActivityChronicleSortField getField() {
        return field;
    }
    public void setField(ActivityChronicleSortField field) {
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
        final ActivityChronicleSort that = (ActivityChronicleSort) obj;
        return Objects.equals(field, that.field)
            && Objects.equals(direction, that.direction);
    }

    @Override
    public int hashCode() {
        return Objects.hash(field, direction);
    }


    public static ActivityChronicleSort.Builder builder() {
        return new ActivityChronicleSort.Builder();
    }

    public static class Builder {

        private ActivityChronicleSortField field;
        private SortDirection direction;

        public Builder() {
        }

        public Builder setField(ActivityChronicleSortField field) {
            this.field = field;
            return this;
        }

        public Builder setDirection(SortDirection direction) {
            this.direction = direction;
            return this;
        }


        public ActivityChronicleSort build() {
            return new ActivityChronicleSort(field, direction);
        }

    }
}
