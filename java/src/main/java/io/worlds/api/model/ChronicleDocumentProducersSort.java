package io.worlds.api.model;


public class ChronicleDocumentProducersSort implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private ChronicleDocumentProducersSortField field;
    @jakarta.validation.constraints.NotNull
    private SortDirection direction;

    public ChronicleDocumentProducersSort() {
    }

    public ChronicleDocumentProducersSort(ChronicleDocumentProducersSortField field, SortDirection direction) {
        this.field = field;
        this.direction = direction;
    }

    public ChronicleDocumentProducersSortField getField() {
        return field;
    }
    public void setField(ChronicleDocumentProducersSortField field) {
        this.field = field;
    }

    public SortDirection getDirection() {
        return direction;
    }
    public void setDirection(SortDirection direction) {
        this.direction = direction;
    }



    public static ChronicleDocumentProducersSort.Builder builder() {
        return new ChronicleDocumentProducersSort.Builder();
    }

    public static class Builder {

        private ChronicleDocumentProducersSortField field;
        private SortDirection direction;

        public Builder() {
        }

        public Builder setField(ChronicleDocumentProducersSortField field) {
            this.field = field;
            return this;
        }

        public Builder setDirection(SortDirection direction) {
            this.direction = direction;
            return this;
        }


        public ChronicleDocumentProducersSort build() {
            return new ChronicleDocumentProducersSort(field, direction);
        }

    }
}
