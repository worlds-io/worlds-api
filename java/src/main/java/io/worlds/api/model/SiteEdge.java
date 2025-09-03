package io.worlds.api.model;


/**
 * A site edge is the pairing of a [Site]({{Types.site}}) with its query cursor.
See [about queries](/reference/query/#about-queries) for details on how "connection" and "edge" types are used with pagination.
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
     * Information about a particular [Site]({{Types.site}}).
     */
    public Site getNode() {
        return node;
    }
    /**
     * Information about a particular [Site]({{Types.site}}).
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



    public static SiteEdge.Builder builder() {
        return new SiteEdge.Builder();
    }

    public static class Builder {

        private Site node;
        private String cursor;

        public Builder() {
        }

        /**
         * Information about a particular [Site]({{Types.site}}).
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
