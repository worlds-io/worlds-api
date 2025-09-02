package io.worlds.api.model;


/**
 * An Image represents a stored image asset. It contains information about the datasource it belongs to and the URLs that can be used to access the image and its thumbnail.
 */
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

    /**
     * The unique identifier of the iamge
     */
    public String getId() {
        return id;
    }
    /**
     * The unique identifier of the iamge
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * When applicable, the unique identifier of the datasource or device that generated this image.
     */
    public String getDataSourceId() {
        return dataSourceId;
    }
    /**
     * When applicable, the unique identifier of the datasource or device that generated this image.
     */
    public void setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
    }

    /**
     * When applicable, the time when the image was taken
     */
    public java.time.OffsetDateTime getTimestamp() {
        return timestamp;
    }
    /**
     * When applicable, the time when the image was taken
     */
    public void setTimestamp(java.time.OffsetDateTime timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * The URL of the image
     */
    public String getUrl() {
        return url;
    }
    /**
     * The URL of the image
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * The URL of the image's thumbnail
     */
    public String getThumbnailUrl() {
        return thumbnailUrl;
    }
    /**
     * The URL of the image's thumbnail
     */
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

        /**
         * The unique identifier of the iamge
         */
        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        /**
         * When applicable, the unique identifier of the datasource or device that generated this image.
         */
        public Builder setDataSourceId(String dataSourceId) {
            this.dataSourceId = dataSourceId;
            return this;
        }

        /**
         * When applicable, the time when the image was taken
         */
        public Builder setTimestamp(java.time.OffsetDateTime timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        /**
         * The URL of the image
         */
        public Builder setUrl(String url) {
            this.url = url;
            return this;
        }

        /**
         * The URL of the image's thumbnail
         */
        public Builder setThumbnailUrl(String thumbnailUrl) {
            this.thumbnailUrl = thumbnailUrl;
            return this;
        }


        public Image build() {
            return new Image(id, dataSourceId, timestamp, url, thumbnailUrl);
        }

    }
}
