package io.worlds.api.model;

import java.util.Objects;

/**
 * TagsSort allows for sorting a [`tags` query]({{Queries.tags}}) by field and direction.
 */
public class TagsSort implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private TagsSortField field;
    @jakarta.validation.constraints.NotNull
    private SortDirection direction;

    public TagsSort() {
    }

    public TagsSort(TagsSortField field, SortDirection direction) {
        this.field = field;
        this.direction = direction;
    }

    public TagsSortField getField() {
        return field;
    }
    public void setField(TagsSortField field) {
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
        final TagsSort that = (TagsSort) obj;
        return Objects.equals(field, that.field)
            && Objects.equals(direction, that.direction);
    }

    @Override
    public int hashCode() {
        return Objects.hash(field, direction);
    }


    public static TagsSort.Builder builder() {
        return new TagsSort.Builder();
    }

    public static class Builder {

        private TagsSortField field;
        private SortDirection direction;

        public Builder() {
        }

        public Builder setField(TagsSortField field) {
            this.field = field;
            return this;
        }

        public Builder setDirection(SortDirection direction) {
            this.direction = direction;
            return this;
        }


        public TagsSort build() {
            return new TagsSort(field, direction);
        }

    }
}
