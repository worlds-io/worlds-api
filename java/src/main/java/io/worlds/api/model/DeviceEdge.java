package io.worlds.api.model;


public class DeviceEdge implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private Device node;
    @jakarta.validation.constraints.NotNull
    private String cursor;

    public DeviceEdge() {
    }

    public DeviceEdge(Device node, String cursor) {
        this.node = node;
        this.cursor = cursor;
    }

    public Device getNode() {
        return node;
    }
    public void setNode(Device node) {
        this.node = node;
    }

    public String getCursor() {
        return cursor;
    }
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }



    public static DeviceEdge.Builder builder() {
        return new DeviceEdge.Builder();
    }

    public static class Builder {

        private Device node;
        private String cursor;

        public Builder() {
        }

        public Builder setNode(Device node) {
            this.node = node;
            return this;
        }

        public Builder setCursor(String cursor) {
            this.cursor = cursor;
            return this;
        }


        public DeviceEdge build() {
            return new DeviceEdge(node, cursor);
        }

    }
}
