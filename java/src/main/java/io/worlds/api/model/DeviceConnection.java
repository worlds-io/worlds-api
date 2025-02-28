package io.worlds.api.model;


public class DeviceConnection implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private PageInfo pageInfo;
    @jakarta.validation.constraints.NotNull
    private java.util.List<DeviceEdge> edges;

    public DeviceConnection() {
    }

    public DeviceConnection(PageInfo pageInfo, java.util.List<DeviceEdge> edges) {
        this.pageInfo = pageInfo;
        this.edges = edges;
    }

    public PageInfo getPageInfo() {
        return pageInfo;
    }
    public void setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }

    public java.util.List<DeviceEdge> getEdges() {
        return edges;
    }
    public void setEdges(java.util.List<DeviceEdge> edges) {
        this.edges = edges;
    }



    public static DeviceConnection.Builder builder() {
        return new DeviceConnection.Builder();
    }

    public static class Builder {

        private PageInfo pageInfo;
        private java.util.List<DeviceEdge> edges;

        public Builder() {
        }

        public Builder setPageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        public Builder setEdges(java.util.List<DeviceEdge> edges) {
            this.edges = edges;
            return this;
        }


        public DeviceConnection build() {
            return new DeviceConnection(pageInfo, edges);
        }

    }
}
