package io.worlds.api.model;


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

    public DataSource getNode() {
        return node;
    }
    public void setNode(DataSource node) {
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }



    public static DataSourceEdge.Builder builder() {
        return new DataSourceEdge.Builder();
    }

    public static class Builder {

        private DataSource node;
        private String cursor;

        public Builder() {
        }

        public Builder setNode(DataSource node) {
            this.node = node;
            return this;
        }

        public Builder setCursor(String cursor) {
            this.cursor = cursor;
            return this;
        }


        public DataSourceEdge build() {
            return new DataSourceEdge(node, cursor);
        }

    }
}
