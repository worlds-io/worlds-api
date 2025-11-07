package io.worlds.api.model;

import java.util.Objects;

/**
 * This input type is used to create a new [`Image`]({{Types.Image}}) for an event. See [`Event`]({{Types.Event}}) for more details.
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

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final CreateSnapshotInput that = (CreateSnapshotInput) obj;
        return Objects.equals(dataSourceId, that.dataSourceId)
            && Objects.equals(timestamp, that.timestamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dataSourceId, timestamp);
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
