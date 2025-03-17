package io.worlds.api.model;


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

    public Site getNode() {
        return node;
    }
    public void setNode(Site node) {
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
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

        public Builder setNode(Site node) {
            this.node = node;
            return this;
        }

        public Builder setCursor(String cursor) {
            this.cursor = cursor;
            return this;
        }


        public SiteEdge build() {
            return new SiteEdge(node, cursor);
        }

    }
}
