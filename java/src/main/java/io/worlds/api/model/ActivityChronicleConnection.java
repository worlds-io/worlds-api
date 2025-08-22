package io.worlds.api.model;


public class ActivityChronicleConnection implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private java.util.List<ActivityChronicleEdge> edges;
    @jakarta.validation.constraints.NotNull
    private PageInfo pageInfo;
    private int totalCount;

    public ActivityChronicleConnection() {
    }

    public ActivityChronicleConnection(java.util.List<ActivityChronicleEdge> edges, PageInfo pageInfo, int totalCount) {
        this.edges = edges;
        this.pageInfo = pageInfo;
        this.totalCount = totalCount;
    }

    public java.util.List<ActivityChronicleEdge> getEdges() {
        return edges;
    }
    public void setEdges(java.util.List<ActivityChronicleEdge> edges) {
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



    public static ActivityChronicleConnection.Builder builder() {
        return new ActivityChronicleConnection.Builder();
    }

    public static class Builder {

        private java.util.List<ActivityChronicleEdge> edges;
        private PageInfo pageInfo;
        private int totalCount;

        public Builder() {
        }

        public Builder setEdges(java.util.List<ActivityChronicleEdge> edges) {
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


        public ActivityChronicleConnection build() {
            return new ActivityChronicleConnection(edges, pageInfo, totalCount);
        }

    }
}
