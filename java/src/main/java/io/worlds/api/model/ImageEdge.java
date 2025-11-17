package io.worlds.api.model;

import java.util.Objects;

/**
 * A image edge is the pairing of a [Image]({{Types.Image}}) with its query cursor.
See [about queries](/guides/types/#queries) for details on how "connection" and "edge" types are used with pagination.
 */
public class ImageEdge implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private Image node;
    @jakarta.validation.constraints.NotNull
    private String cursor;

    public ImageEdge() {
    }

    public ImageEdge(Image node, String cursor) {
        this.node = node;
        this.cursor = cursor;
    }

    /**
     * Information about a particular [Image]({{Types.Image}}).
     */
    public Image getNode() {
        return node;
    }
    /**
     * Information about a particular [Image]({{Types.Image}}).
     */
    public void setNode(Image node) {
        this.node = node;
    }

    /**
     * The cursor to use with the [`images` query]({{Queries.images}}) `after` argument.
     */
    public String getCursor() {
        return cursor;
    }
    /**
     * The cursor to use with the [`images` query]({{Queries.images}}) `after` argument.
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
        final ImageEdge that = (ImageEdge) obj;
        return Objects.equals(node, that.node)
            && Objects.equals(cursor, that.cursor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(node, cursor);
    }


    public static ImageEdge.Builder builder() {
        return new ImageEdge.Builder();
    }

    public static class Builder {

        private Image node;
        private String cursor;

        public Builder() {
        }

        /**
         * Information about a particular [Image]({{Types.Image}}).
         */
        public Builder setNode(Image node) {
            this.node = node;
            return this;
        }

        /**
         * The cursor to use with the [`images` query]({{Queries.images}}) `after` argument.
         */
        public Builder setCursor(String cursor) {
            this.cursor = cursor;
            return this;
        }


        public ImageEdge build() {
            return new ImageEdge(node, cursor);
        }

    }
}
