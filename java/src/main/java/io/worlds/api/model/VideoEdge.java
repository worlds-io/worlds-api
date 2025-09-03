package io.worlds.api.model;


/**
 * A video edge is the pairing of a [Video]({{Types.video}}) with its query cursor.
See [about queries](/reference/query/#about-queries) for details on how "connection" and "edge" types are used with pagination.
 */
public class VideoEdge implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private Video node;
    @jakarta.validation.constraints.NotNull
    private String cursor;

    public VideoEdge() {
    }

    public VideoEdge(Video node, String cursor) {
        this.node = node;
        this.cursor = cursor;
    }

    /**
     * Information about a particular [Video]({{Types.video}}).
     */
    public Video getNode() {
        return node;
    }
    /**
     * Information about a particular [Video]({{Types.video}}).
     */
    public void setNode(Video node) {
        this.node = node;
    }

    /**
     * The cursor to use with the [Query `videos` field]({{Queries.videos}}) `after` argument.
     */
    public String getCursor() {
        return cursor;
    }
    /**
     * The cursor to use with the [Query `videos` field]({{Queries.videos}}) `after` argument.
     */
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }



    public static VideoEdge.Builder builder() {
        return new VideoEdge.Builder();
    }

    public static class Builder {

        private Video node;
        private String cursor;

        public Builder() {
        }

        /**
         * Information about a particular [Video]({{Types.video}}).
         */
        public Builder setNode(Video node) {
            this.node = node;
            return this;
        }

        /**
         * The cursor to use with the [Query `videos` field]({{Queries.videos}}) `after` argument.
         */
        public Builder setCursor(String cursor) {
            this.cursor = cursor;
            return this;
        }


        public VideoEdge build() {
            return new VideoEdge(node, cursor);
        }

    }
}
