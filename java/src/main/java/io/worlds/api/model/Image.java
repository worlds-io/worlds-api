package io.worlds.api.model;


public class Image implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private String id;
    private String dataSourceId;
    private java.time.OffsetDateTime timestamp;
    @jakarta.validation.constraints.NotNull
    private String url;
    private String thumbnailUrl;

    public Image() {
    }

    public Image(String id, String dataSourceId, java.time.OffsetDateTime timestamp, String url, String thumbnailUrl) {
        this.id = id;
        this.dataSourceId = dataSourceId;
        this.timestamp = timestamp;
        this.url = url;
        this.thumbnailUrl = thumbnailUrl;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
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

    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }

    public String getThumbnailUrl() {
        return thumbnailUrl;
    }
    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }



    public static Image.Builder builder() {
        return new Image.Builder();
    }

    public static class Builder {

        private String id;
        private String dataSourceId;
        private java.time.OffsetDateTime timestamp;
        private String url;
        private String thumbnailUrl;

        public Builder() {
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setDataSourceId(String dataSourceId) {
            this.dataSourceId = dataSourceId;
            return this;
        }

        public Builder setTimestamp(java.time.OffsetDateTime timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        public Builder setUrl(String url) {
            this.url = url;
            return this;
        }

        public Builder setThumbnailUrl(String thumbnailUrl) {
            this.thumbnailUrl = thumbnailUrl;
            return this;
        }


        public Image build() {
            return new Image(id, dataSourceId, timestamp, url, thumbnailUrl);
        }

    }
}
