package io.worlds.api.model;

import java.util.Objects;

/**
 * ImagesSort allows for sorting an [`images` query]({{Queries.images}}) by field and direction.
 */
public class ImagesSort implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private ImagesSortField field;
    @jakarta.validation.constraints.NotNull
    private SortDirection direction;

    public ImagesSort() {
    }

    public ImagesSort(ImagesSortField field, SortDirection direction) {
        this.field = field;
        this.direction = direction;
    }

    public ImagesSortField getField() {
        return field;
    }
    public void setField(ImagesSortField field) {
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
        final ImagesSort that = (ImagesSort) obj;
        return Objects.equals(field, that.field)
            && Objects.equals(direction, that.direction);
    }

    @Override
    public int hashCode() {
        return Objects.hash(field, direction);
    }


    public static ImagesSort.Builder builder() {
        return new ImagesSort.Builder();
    }

    public static class Builder {

        private ImagesSortField field;
        private SortDirection direction;

        public Builder() {
        }

        public Builder setField(ImagesSortField field) {
            this.field = field;
            return this;
        }

        public Builder setDirection(SortDirection direction) {
            this.direction = direction;
            return this;
        }


        public ImagesSort build() {
            return new ImagesSort(field, direction);
        }

    }
}
