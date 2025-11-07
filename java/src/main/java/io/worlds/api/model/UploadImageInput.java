package io.worlds.api.model;

import java.util.Objects;

/**
 * This input type is used to upload an image to worlds.
 */
public class UploadImageInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private org.springframework.graphql.data.ArgumentValue<String> dataSourceId = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<String> fileName = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<java.time.OffsetDateTime> timestamp = org.springframework.graphql.data.ArgumentValue.omitted();
    @jakarta.validation.constraints.NotNull
    private String data;
    private java.util.List<String> eventIds;
    private java.util.List<String> activityChronicleIds;

    public UploadImageInput() {
    }

    public UploadImageInput(org.springframework.graphql.data.ArgumentValue<String> dataSourceId, org.springframework.graphql.data.ArgumentValue<String> fileName, org.springframework.graphql.data.ArgumentValue<java.time.OffsetDateTime> timestamp, String data, java.util.List<String> eventIds, java.util.List<String> activityChronicleIds) {
        this.dataSourceId = dataSourceId;
        this.fileName = fileName;
        this.timestamp = timestamp;
        this.data = data;
        this.eventIds = eventIds;
        this.activityChronicleIds = activityChronicleIds;
    }

    public org.springframework.graphql.data.ArgumentValue<String> getDataSourceId() {
        return dataSourceId;
    }
    public void setDataSourceId(org.springframework.graphql.data.ArgumentValue<String> dataSourceId) {
        this.dataSourceId = dataSourceId;
    }

    public org.springframework.graphql.data.ArgumentValue<String> getFileName() {
        return fileName;
    }
    public void setFileName(org.springframework.graphql.data.ArgumentValue<String> fileName) {
        this.fileName = fileName;
    }

    public org.springframework.graphql.data.ArgumentValue<java.time.OffsetDateTime> getTimestamp() {
        return timestamp;
    }
    public void setTimestamp(org.springframework.graphql.data.ArgumentValue<java.time.OffsetDateTime> timestamp) {
        this.timestamp = timestamp;
    }

    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }

    public java.util.List<String> getEventIds() {
        return eventIds;
    }
    public void setEventIds(java.util.List<String> eventIds) {
        this.eventIds = eventIds;
    }

    public java.util.List<String> getActivityChronicleIds() {
        return activityChronicleIds;
    }
    public void setActivityChronicleIds(java.util.List<String> activityChronicleIds) {
        this.activityChronicleIds = activityChronicleIds;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final UploadImageInput that = (UploadImageInput) obj;
        return Objects.equals(dataSourceId, that.dataSourceId)
            && Objects.equals(fileName, that.fileName)
            && Objects.equals(timestamp, that.timestamp)
            && Objects.equals(data, that.data)
            && Objects.equals(eventIds, that.eventIds)
            && Objects.equals(activityChronicleIds, that.activityChronicleIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dataSourceId, fileName, timestamp, data, eventIds, activityChronicleIds);
    }


    public static UploadImageInput.Builder builder() {
        return new UploadImageInput.Builder();
    }

    public static class Builder {

        private org.springframework.graphql.data.ArgumentValue<String> dataSourceId = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<String> fileName = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<java.time.OffsetDateTime> timestamp = org.springframework.graphql.data.ArgumentValue.omitted();
        private String data;
        private java.util.List<String> eventIds;
        private java.util.List<String> activityChronicleIds;

        public Builder() {
        }

        public Builder setDataSourceId(org.springframework.graphql.data.ArgumentValue<String> dataSourceId) {
            this.dataSourceId = dataSourceId;
            return this;
        }

        public Builder setFileName(org.springframework.graphql.data.ArgumentValue<String> fileName) {
            this.fileName = fileName;
            return this;
        }

        public Builder setTimestamp(org.springframework.graphql.data.ArgumentValue<java.time.OffsetDateTime> timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        public Builder setData(String data) {
            this.data = data;
            return this;
        }

        public Builder setEventIds(java.util.List<String> eventIds) {
            this.eventIds = eventIds;
            return this;
        }

        public Builder setActivityChronicleIds(java.util.List<String> activityChronicleIds) {
            this.activityChronicleIds = activityChronicleIds;
            return this;
        }


        public UploadImageInput build() {
            return new UploadImageInput(dataSourceId, fileName, timestamp, data, eventIds, activityChronicleIds);
        }

    }
}
