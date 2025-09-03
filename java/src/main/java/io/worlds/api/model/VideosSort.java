package io.worlds.api.model;


/**
 * VideosSort allows for sorting a [`videos` query]({{Query.videos}}) by field and direction.
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
