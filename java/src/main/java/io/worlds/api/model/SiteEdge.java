package io.worlds.api.model;

import java.util.Objects;

/**
 * A site edge is the pairing of a [Site]({{Types.Site}}) with its query cursor.
See [about queries](/guides/types/#queries) for details on how "connection" and "edge" types are used with pagination.
 */
public class SiteEdge implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private Site node;
    @jakarta.validation.constraints.NotNull
    private String cursor;

    public SiteEdge() {
    }

    public SiteEdge(Site node, String cursor) {
        this.node = node;
        this.cursor = cursor;
    }

    /**
     * Information about a particular [Site]({{Types.Site}}).
     */
    public Site getNode() {
        return node;
    }
    /**
     * Information about a particular [Site]({{Types.Site}}).
     */
    public void setNode(Site node) {
        this.node = node;
    }

    /**
     * The cursor to use with the [`sites` query]({{Queries.sites}}) `after` argument.
     */
    public String getCursor() {
        return cursor;
    }
    /**
     * The cursor to use with the [`sites` query]({{Queries.sites}}) `after` argument.
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
        final SiteEdge that = (SiteEdge) obj;
        return Objects.equals(node, that.node)
            && Objects.equals(cursor, that.cursor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(node, cursor);
    }


    public static SiteEdge.Builder builder() {
        return new SiteEdge.Builder();
    }

    public static class Builder {

        private Site node;
        private String cursor;

        public Builder() {
        }

        /**
         * Information about a particular [Site]({{Types.Site}}).
         */
        public Builder setNode(Site node) {
            this.node = node;
            return this;
        }

        /**
         * The cursor to use with the [`sites` query]({{Queries.sites}}) `after` argument.
         */
        public Builder setCursor(String cursor) {
            this.cursor = cursor;
            return this;
        }


        public SiteEdge build() {
            return new SiteEdge(node, cursor);
        }

    }
}
