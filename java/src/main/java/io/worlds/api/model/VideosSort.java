package io.worlds.api.model;

import java.util.Objects;

/**
 * VideosSort allows for sorting a [`videos` query]({{Queries.videos}}) by field and direction.
 */
public class VideosSort implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private VideosSortField field;
    @jakarta.validation.constraints.NotNull
    private SortDirection direction;

    public VideosSort() {
    }

    public VideosSort(VideosSortField field, SortDirection direction) {
        this.field = field;
        this.direction = direction;
    }

    public VideosSortField getField() {
        return field;
    }
    public void setField(VideosSortField field) {
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
        final VideosSort that = (VideosSort) obj;
        return Objects.equals(field, that.field)
            && Objects.equals(direction, that.direction);
    }

    @Override
    public int hashCode() {
        return Objects.hash(field, direction);
    }


    public static VideosSort.Builder builder() {
        return new VideosSort.Builder();
    }

    public static class Builder {

        private VideosSortField field;
        private SortDirection direction;

        public Builder() {
        }

        public Builder setField(VideosSortField field) {
            this.field = field;
            return this;
        }

        public Builder setDirection(SortDirection direction) {
            this.direction = direction;
            return this;
        }


        public VideosSort build() {
            return new VideosSort(field, direction);
        }

    }
}
