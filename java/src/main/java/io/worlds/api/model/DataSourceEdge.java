package io.worlds.api.model;

import java.util.Objects;

/**
 * A data source edge is the pairing of a [Data Source]({{Types.DataSource}}) with its query cursor.
See [about queries](/guides/types/#queries) for details on how "connection" and "edge" types are used with pagination.
 */
public class DataSourceEdge implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private DataSource node;
    @jakarta.validation.constraints.NotNull
    private String cursor;

    public DataSourceEdge() {
    }

    public DataSourceEdge(DataSource node, String cursor) {
        this.node = node;
        this.cursor = cursor;
    }

    /**
     * Information about a particular [Data Source]({{Types.DataSource}}).
     */
    public DataSource getNode() {
        return node;
    }
    /**
     * Information about a particular [Data Source]({{Types.DataSource}}).
     */
    public void setNode(DataSource node) {
        this.node = node;
    }

    /**
     * The cursor to use with the [`dataSources` query]({{Queries.dataSources}}) `after` argument.
     */
    public String getCursor() {
        return cursor;
    }
    /**
     * The cursor to use with the [`dataSources` query]({{Queries.dataSources}}) `after` argument.
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
        final DataSourceEdge that = (DataSourceEdge) obj;
        return Objects.equals(node, that.node)
            && Objects.equals(cursor, that.cursor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(node, cursor);
    }


    public static DataSourceEdge.Builder builder() {
        return new DataSourceEdge.Builder();
    }

    public static class Builder {

        private DataSource node;
        private String cursor;

        public Builder() {
        }

        /**
         * Information about a particular [Data Source]({{Types.DataSource}}).
         */
        public Builder setNode(DataSource node) {
            this.node = node;
            return this;
        }

        /**
         * The cursor to use with the [`dataSources` query]({{Queries.dataSources}}) `after` argument.
         */
        public Builder setCursor(String cursor) {
            this.cursor = cursor;
            return this;
        }


        public DataSourceEdge build() {
            return new DataSourceEdge(node, cursor);
        }

    }
}
