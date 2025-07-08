package io.worlds.api.model;


public class ChronicleDocumentProducerConnection implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private java.util.List<ChronicleDocumentProducerEdge> edges;
    @jakarta.validation.constraints.NotNull
    private PageInfo pageInfo;
    private int totalCount;

    public ChronicleDocumentProducerConnection() {
    }

    public ChronicleDocumentProducerConnection(java.util.List<ChronicleDocumentProducerEdge> edges, PageInfo pageInfo, int totalCount) {
        this.edges = edges;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public java.util.List<ChronicleDocumentProducerEdge> getEdges() {
        return edges;
    }
    public void setEdges(java.util.List<ChronicleDocumentProducerEdge> edges) {
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



    public static ChronicleDocumentProducerConnection.Builder builder() {
        return new ChronicleDocumentProducerConnection.Builder();
    }

    public static class Builder {

        private java.util.List<ChronicleDocumentProducerEdge> edges;
        private PageInfo pageInfo;
        private int totalCount;

        public Builder() {
        }

        public Builder setEdges(java.util.List<ChronicleDocumentProducerEdge> edges) {
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


        public ChronicleDocumentProducerConnection build() {
            return new ChronicleDocumentProducerConnection(edges, pageInfo, totalCount);
        }

    }
}
