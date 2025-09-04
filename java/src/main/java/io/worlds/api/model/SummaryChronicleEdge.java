package io.worlds.api.model;


/**
 * An summary edge is the pairing of an [Summary]({{Types.summary}}) with its query cursor.
See [about queries](/reference/query/#about-queries) for details on how "connection" and "edge" types are used with pagination.
 */
public class SummaryChronicleEdge implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private SummaryChronicle node;
    @jakarta.validation.constraints.NotNull
    private String cursor;

    public SummaryChronicleEdge() {
    }

    public SummaryChronicleEdge(SummaryChronicle node, String cursor) {
        this.node = node;
        this.cursor = cursor;
    }

    /**
     * Information about a particular [Summary]({{Types.summary}}).
     */
    public SummaryChronicle getNode() {
        return node;
    }
    /**
     * Information about a particular [Summary]({{Types.summary}}).
     */
    public void setNode(SummaryChronicle node) {
        this.node = node;
    }

    /**
     * The cursor to use with the [Query `summaries` field]({{Queries.summaryChronicles}}) `after` argument.
     */
    public String getCursor() {
        return cursor;
    }
    /**
     * The cursor to use with the [Query `summaries` field]({{Queries.summaryChronicles}}) `after` argument.
     */
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }



    public static SummaryChronicleEdge.Builder builder() {
        return new SummaryChronicleEdge.Builder();
    }

    public static class Builder {

        private SummaryChronicle node;
        private String cursor;

        public Builder() {
        }

        /**
         * Information about a particular [Summary]({{Types.summary}}).
         */
        public Builder setNode(SummaryChronicle node) {
            this.node = node;
            return this;
        }

        /**
         * The cursor to use with the [Query `summaries` field]({{Queries.summaryChronicles}}) `after` argument.
         */
        public Builder setCursor(String cursor) {
            this.cursor = cursor;
            return this;
        }


        public SummaryChronicleEdge build() {
            return new SummaryChronicleEdge(node, cursor);
        }

    }
}
