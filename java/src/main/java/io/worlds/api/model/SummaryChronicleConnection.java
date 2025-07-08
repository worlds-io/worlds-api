package io.worlds.api.model;


public class SummaryChronicleConnection implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private java.util.List<SummaryChronicleEdge> edges;
    @jakarta.validation.constraints.NotNull
    private PageInfo pageInfo;
    private int totalCount;

    public SummaryChronicleConnection() {
    }

    public SummaryChronicleConnection(java.util.List<SummaryChronicleEdge> edges, PageInfo pageInfo, int totalCount) {
        this.edges = edges;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
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

    public int getTotalCount() {
        return totalCount;
    }
    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }



    public static SummaryChronicleConnection.Builder builder() {
        return new SummaryChronicleConnection.Builder();
    }

    public static class Builder {

        private java.util.List<SummaryChronicleEdge> edges;
        private PageInfo pageInfo;
        private int totalCount;

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

        public Builder setTotalCount(int totalCount) {
            this.totalCount = totalCount;
            return this;
        }


        public SummaryChronicleConnection build() {
            return new SummaryChronicleConnection(edges, pageInfo, totalCount);
        }

    }
}
