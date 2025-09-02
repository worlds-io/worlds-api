package io.worlds.api.model;


/**
 * This input type is used to create a new [`Image`](/references/objects/image) for an event. See [About Events](/reference/objects/#about-events) for more details.
 */
public class CreateSnapshotInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private String dataSourceId;
    @jakarta.validation.constraints.NotNull
    private java.time.OffsetDateTime timestamp;

    public CreateSnapshotInput() {
    }

    public CreateSnapshotInput(String dataSourceId, java.time.OffsetDateTime timestamp) {
        this.dataSourceId = dataSourceId;
        this.timestamp = timestamp;
    }

    public String getDataSourceId() {
        return dataSourceId;
    }
    public void setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
    }

    public java.time.OffsetDateTime getTimestamp() {
        return timestamp;
    }
    public void setTimestamp(java.time.OffsetDateTime timestamp) {
        this.timestamp = timestamp;
    }



    public static CreateSnapshotInput.Builder builder() {
        return new CreateSnapshotInput.Builder();
    }

    public static class Builder {

        private String dataSourceId;
        private java.time.OffsetDateTime timestamp;

        public Builder() {
        }

        public Builder setDataSourceId(String dataSourceId) {
            this.dataSourceId = dataSourceId;
            return this;
        }

        public Builder setTimestamp(java.time.OffsetDateTime timestamp) {
            this.timestamp = timestamp;
            return this;
        }


        public CreateSnapshotInput build() {
            return new CreateSnapshotInput(dataSourceId, timestamp);
        }

    }
}
