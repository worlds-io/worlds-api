package io.worlds.api.model;


public class SensorConnection implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private PageInfo pageInfo;
    @jakarta.validation.constraints.NotNull
    private java.util.List<MeasurementEdge> edges;

    public SensorConnection() {
    }

    public SensorConnection(PageInfo pageInfo, java.util.List<MeasurementEdge> edges) {
        this.pageInfo = pageInfo;
        this.edges = edges;
    }

    public PageInfo getPageInfo() {
        return pageInfo;
    }
    public void setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }

    public java.util.List<MeasurementEdge> getEdges() {
        return edges;
    }
    public void setEdges(java.util.List<MeasurementEdge> edges) {
        this.edges = edges;
    }



    public static SensorConnection.Builder builder() {
        return new SensorConnection.Builder();
    }

    public static class Builder {

        private PageInfo pageInfo;
        private java.util.List<MeasurementEdge> edges;

        public Builder() {
        }

        public Builder setPageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        public Builder setEdges(java.util.List<MeasurementEdge> edges) {
            this.edges = edges;
            return this;
        }


        public SensorConnection build() {
            return new SensorConnection(pageInfo, edges);
        }

    }
}
