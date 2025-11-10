package io.worlds.api.model;

import java.util.Objects;

/**
 * DataSourceSort allows for sorting a [`dataSources` query]({{Queries.dataSources}}) by field and direction.
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

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final DataSourceSort that = (DataSourceSort) obj;
        return Objects.equals(field, that.field)
            && Objects.equals(direction, that.direction);
    }

    @Override
    public int hashCode() {
        return Objects.hash(field, direction);
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
