package io.worlds.api.model;


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

    public SummaryChronicle getNode() {
        return node;
    }
    public void setNode(SummaryChronicle node) {
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
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

        public Builder setNode(SummaryChronicle node) {
            this.node = node;
            return this;
        }

        public Builder setCursor(String cursor) {
            this.cursor = cursor;
            return this;
        }


        public SummaryChronicleEdge build() {
            return new SummaryChronicleEdge(node, cursor);
        }

    }
}
