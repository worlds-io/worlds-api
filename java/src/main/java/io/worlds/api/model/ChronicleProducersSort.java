package io.worlds.api.model;


public class ChronicleProducersSort implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private ChronicleProducersSortField field;
    @jakarta.validation.constraints.NotNull
    private SortDirection direction;

    public ChronicleProducersSort() {
    }

    public ChronicleProducersSort(ChronicleProducersSortField field, SortDirection direction) {
        this.field = field;
        this.direction = direction;
    }

    public ChronicleProducersSortField getField() {
        return field;
    }
    public void setField(ChronicleProducersSortField field) {
        this.field = field;
    }

    public SortDirection getDirection() {
        return direction;
    }
    public void setDirection(SortDirection direction) {
        this.direction = direction;
    }



    public static ChronicleProducersSort.Builder builder() {
        return new ChronicleProducersSort.Builder();
    }

    public static class Builder {

        private ChronicleProducersSortField field;
        private SortDirection direction;

        public Builder() {
        }

        public Builder setField(ChronicleProducersSortField field) {
            this.field = field;
            return this;
        }

        public Builder setDirection(SortDirection direction) {
            this.direction = direction;
            return this;
        }


        public ChronicleProducersSort build() {
            return new ChronicleProducersSort(field, direction);
        }

    }
}
