package io.worlds.api.model;


public class UploadImageInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private org.springframework.graphql.data.ArgumentValue<String> dataSourceId = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<String> fileName = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<java.time.OffsetDateTime> timestamp = org.springframework.graphql.data.ArgumentValue.omitted();
    @jakarta.validation.constraints.NotNull
    private String data;

    public UploadImageInput() {
    }

    public UploadImageInput(org.springframework.graphql.data.ArgumentValue<String> dataSourceId, org.springframework.graphql.data.ArgumentValue<String> fileName, org.springframework.graphql.data.ArgumentValue<java.time.OffsetDateTime> timestamp, String data) {
        this.dataSourceId = dataSourceId;
        this.fileName = fileName;
        this.timestamp = timestamp;
        this.data = data;
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



    public static UploadImageInput.Builder builder() {
        return new UploadImageInput.Builder();
    }

    public static class Builder {

        private org.springframework.graphql.data.ArgumentValue<String> dataSourceId = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<String> fileName = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<java.time.OffsetDateTime> timestamp = org.springframework.graphql.data.ArgumentValue.omitted();
        private String data;

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


        public UploadImageInput build() {
            return new UploadImageInput(dataSourceId, fileName, timestamp, data);
        }

    }
}
