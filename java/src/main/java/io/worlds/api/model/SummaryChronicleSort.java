package io.worlds.api.model;

import java.util.Objects;

/**
 * Indicates the field used for sorting a [`summaryChronicles` query]({{Queries.summaryChronicles}}).
 */
public class SummaryChronicleSort implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private SummaryChronicleSortField field;
    @jakarta.validation.constraints.NotNull
    private SortDirection direction;

    public SummaryChronicleSort() {
    }

    public SummaryChronicleSort(SummaryChronicleSortField field, SortDirection direction) {
        this.field = field;
        this.direction = direction;
    }

    public SummaryChronicleSortField getField() {
        return field;
    }
    public void setField(SummaryChronicleSortField field) {
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
        final SummaryChronicleSort that = (SummaryChronicleSort) obj;
        return Objects.equals(field, that.field)
            && Objects.equals(direction, that.direction);
    }

    @Override
    public int hashCode() {
        return Objects.hash(field, direction);
    }


    public static SummaryChronicleSort.Builder builder() {
        return new SummaryChronicleSort.Builder();
    }

    public static class Builder {

        private SummaryChronicleSortField field;
        private SortDirection direction;

        public Builder() {
        }

        public Builder setField(SummaryChronicleSortField field) {
            this.field = field;
            return this;
        }

        public Builder setDirection(SortDirection direction) {
            this.direction = direction;
            return this;
        }


        public SummaryChronicleSort build() {
            return new SummaryChronicleSort(field, direction);
        }

    }
}
