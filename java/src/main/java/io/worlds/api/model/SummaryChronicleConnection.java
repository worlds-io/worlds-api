package io.worlds.api.model;


public class SummaryChronicleConnection implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private java.util.List<SummaryChronicleEdge> edges;
    @jakarta.validation.constraints.NotNull
    private PageInfo pageInfo;

    public SummaryChronicleConnection() {
    }

    public SummaryChronicleConnection(java.util.List<SummaryChronicleEdge> edges, PageInfo pageInfo) {
        this.edges = edges;
        this.pageInfo = pageInfo;
    }

    public java.util.List<SummaryChronicleEdge> getEdges() {
        return edges;
    }
    public void setEdges(java.util.List<SummaryChronicleEdge> edges) {
        this.edges = edges;
    }

    public PageInfo getPageInfo() {
        return pageInfo;
    }
    public void setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }



    public static SummaryChronicleConnection.Builder builder() {
        return new SummaryChronicleConnection.Builder();
    }

    public static class Builder {

        private java.util.List<SummaryChronicleEdge> edges;
        private PageInfo pageInfo;

        public Builder() {
        }

        public Builder setEdges(java.util.List<SummaryChronicleEdge> edges) {
            this.edges = edges;
            return this;
        }

        public Builder setPageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }


        public SummaryChronicleConnection build() {
            return new SummaryChronicleConnection(edges, pageInfo);
        }

    }
}
