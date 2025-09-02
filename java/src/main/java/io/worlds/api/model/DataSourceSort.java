package io.worlds.api.model;


/**
 * DataSourceSort allows for sorting a [`dataSources` query]({{Query.datasources}}) by field and direction.
 */
public class DataSourceSort implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private DataSourceSortField field;
    @jakarta.validation.constraints.NotNull
    private SortDirection direction;

    public DataSourceSort() {
    }

    public DataSourceSort(DataSourceSortField field, SortDirection direction) {
        this.field = field;
        this.direction = direction;
    }

    public DataSourceSortField getField() {
        return field;
    }
    public void setField(DataSourceSortField field) {
        this.field = field;
    }

    public SortDirection getDirection() {
        return direction;
    }
    public void setDirection(SortDirection direction) {
        this.direction = direction;
    }



    public static DataSourceSort.Builder builder() {
        return new DataSourceSort.Builder();
    }

    public static class Builder {

        private DataSourceSortField field;
        private SortDirection direction;

        public Builder() {
        }

        public Builder setField(DataSourceSortField field) {
            this.field = field;
            return this;
        }

        public Builder setDirection(SortDirection direction) {
            this.direction = direction;
            return this;
        }


        public DataSourceSort build() {
            return new DataSourceSort(field, direction);
        }

    }
}
