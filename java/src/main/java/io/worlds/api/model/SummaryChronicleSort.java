package io.worlds.api.model;


/**
 * Indicates the field used for sorting an [`summaryProducers` query]({{Queries.summaryproducers}}).
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
