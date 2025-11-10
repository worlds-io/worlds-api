package io.worlds.api.model;

import java.util.Objects;

/**
 * A video edge is the pairing of a [Video]({{Types.Video}}) with its query cursor.
See [about queries](/guides/types/#queries) for details on how "connection" and "edge" types are used with pagination.
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
     * Information about a particular [Video]({{Types.Video}}).
     */
    public Video getNode() {
        return node;
    }
    /**
     * Information about a particular [Video]({{Types.Video}}).
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

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final VideoEdge that = (VideoEdge) obj;
        return Objects.equals(node, that.node)
            && Objects.equals(cursor, that.cursor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(node, cursor);
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
         * Information about a particular [Video]({{Types.Video}}).
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
