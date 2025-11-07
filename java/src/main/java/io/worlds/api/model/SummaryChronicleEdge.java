package io.worlds.api.model;

import java.util.Objects;

/**
 * An summary edge is the pairing of an [Summary]({{Types.Summary}}) with its query cursor.
See [about queries](/guides/types/#queries) for details on how "connection" and "edge" types are used with pagination.
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
     * Information about a particular [Summary]({{Types.Summary}}).
     */
    public SummaryChronicle getNode() {
        return node;
    }
    /**
     * Information about a particular [Summary]({{Types.Summary}}).
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

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final SummaryChronicleEdge that = (SummaryChronicleEdge) obj;
        return Objects.equals(node, that.node)
            && Objects.equals(cursor, that.cursor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(node, cursor);
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
         * Information about a particular [Summary]({{Types.Summary}}).
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
