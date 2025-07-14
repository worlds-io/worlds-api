package io.worlds.api.model;


public class ActivityChronicleEdge implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private ActivityChronicle node;
    @jakarta.validation.constraints.NotNull
    private String cursor;

    public ActivityChronicleEdge() {
    }

    public ActivityChronicleEdge(ActivityChronicle node, String cursor) {
        this.node = node;
        this.cursor = cursor;
    }

    public ActivityChronicle getNode() {
        return node;
    }
    public void setNode(ActivityChronicle node) {
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }



    public static ActivityChronicleEdge.Builder builder() {
        return new ActivityChronicleEdge.Builder();
    }

    public static class Builder {

        private ActivityChronicle node;
        private String cursor;

        public Builder() {
        }

        public Builder setNode(ActivityChronicle node) {
            this.node = node;
            return this;
        }

        public Builder setCursor(String cursor) {
            this.cursor = cursor;
            return this;
        }


        public ActivityChronicleEdge build() {
            return new ActivityChronicleEdge(node, cursor);
        }

    }
}
