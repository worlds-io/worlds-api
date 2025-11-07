package io.worlds.api.model;

import java.util.Objects;

/**
 * A tag edge is the pairing of a [Tag]({{Types.Tag}}) with its query cursor.
See [about queries](/guides/types/#queries) for details on how "connection" and "edge" types are used with pagination.
 */
public class TagEdge implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private Tag node;
    @jakarta.validation.constraints.NotNull
    private String cursor;

    public TagEdge() {
    }

    public TagEdge(Tag node, String cursor) {
        this.node = node;
        this.cursor = cursor;
    }

    /**
     * Information about a particular [Tag]({{Types.Tag}}).
     */
    public Tag getNode() {
        return node;
    }
    /**
     * Information about a particular [Tag]({{Types.Tag}}).
     */
    public void setNode(Tag node) {
        this.node = node;
    }

    /**
     * The cursor to use with the [Query `tags` field]({{Queries.tags}}) `after` argument.
     */
    public String getCursor() {
        return cursor;
    }
    /**
     * The cursor to use with the [Query `tags` field]({{Queries.tags}}) `after` argument.
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
        final TagEdge that = (TagEdge) obj;
        return Objects.equals(node, that.node)
            && Objects.equals(cursor, that.cursor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(node, cursor);
    }


    public static TagEdge.Builder builder() {
        return new TagEdge.Builder();
    }

    public static class Builder {

        private Tag node;
        private String cursor;

        public Builder() {
        }

        /**
         * Information about a particular [Tag]({{Types.Tag}}).
         */
        public Builder setNode(Tag node) {
            this.node = node;
            return this;
        }

        /**
         * The cursor to use with the [Query `tags` field]({{Queries.tags}}) `after` argument.
         */
        public Builder setCursor(String cursor) {
            this.cursor = cursor;
            return this;
        }


        public TagEdge build() {
            return new TagEdge(node, cursor);
        }

    }
}
