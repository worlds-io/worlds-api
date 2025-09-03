package io.worlds.api.model;


/**
 * A data source clip represents a video from a data source, bounded by a start and end time.
 */
public class DataSourceClip implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private String id;
    @jakarta.validation.constraints.NotNull
    private DataSource dataSource;
    @jakarta.validation.constraints.NotNull
    private java.time.OffsetDateTime startTime;
    @jakarta.validation.constraints.NotNull
    private java.time.OffsetDateTime endTime;
    @jakarta.validation.constraints.NotNull
    private String url;
    private String thumbnailUrl;
    private String displayName;

    public DataSourceClip() {
    }

    public DataSourceClip(String id, DataSource dataSource, java.time.OffsetDateTime startTime, java.time.OffsetDateTime endTime, String url, String thumbnailUrl, String displayName) {
        this.id = id;
        this.dataSource = dataSource;
        this.startTime = startTime;
        this.endTime = endTime;
        this.url = url;
        this.thumbnailUrl = thumbnailUrl;
        this.displayName = displayName;
    }

    /**
     * The unique identifier of the data source clip.
     */
    public String getId() {
        return id;
    }
    /**
     * The unique identifier of the data source clip.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * The data source that created the video.
     */
    public DataSource getDataSource() {
        return dataSource;
    }
    /**
     * The data source that created the video.
     */
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    /**
     * Start time of the clip
     */
    public java.time.OffsetDateTime getStartTime() {
        return startTime;
    }
    /**
     * Start time of the clip
     */
    public void setStartTime(java.time.OffsetDateTime startTime) {
        this.startTime = startTime;
    }

    /**
     * End time of the clip
     */
    public java.time.OffsetDateTime getEndTime() {
        return endTime;
    }
    /**
     * End time of the clip
     */
    public void setEndTime(java.time.OffsetDateTime endTime) {
        this.endTime = endTime;
    }

    /**
     * The signed URL to be used to stream the clip.
     */
    public String getUrl() {
        return url;
    }
    /**
     * The signed URL to be used to stream the clip.
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * The signed URL to be used to retrieve the clip thumbnail.
     */
    public String getThumbnailUrl() {
        return thumbnailUrl;
    }
    /**
     * The signed URL to be used to retrieve the clip thumbnail.
     */
    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }

    /**
     * Optional display name for a clip
     */
    public String getDisplayName() {
        return displayName;
    }
    /**
     * Optional display name for a clip
     */
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }



    public static DataSourceClip.Builder builder() {
        return new DataSourceClip.Builder();
    }

    public static class Builder {

        private String id;
        private DataSource dataSource;
        private java.time.OffsetDateTime startTime;
        private java.time.OffsetDateTime endTime;
        private String url;
        private String thumbnailUrl;
        private String displayName;

        public Builder() {
        }

        /**
         * The unique identifier of the data source clip.
         */
        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        /**
         * The data source that created the video.
         */
        public Builder setDataSource(DataSource dataSource) {
            this.dataSource = dataSource;
            return this;
        }

        /**
         * Start time of the clip
         */
        public Builder setStartTime(java.time.OffsetDateTime startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * End time of the clip
         */
        public Builder setEndTime(java.time.OffsetDateTime endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * The signed URL to be used to stream the clip.
         */
        public Builder setUrl(String url) {
            this.url = url;
            return this;
        }

        /**
         * The signed URL to be used to retrieve the clip thumbnail.
         */
        public Builder setThumbnailUrl(String thumbnailUrl) {
            this.thumbnailUrl = thumbnailUrl;
            return this;
        }

        /**
         * Optional display name for a clip
         */
        public Builder setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }


        public DataSourceClip build() {
            return new DataSourceClip(id, dataSource, startTime, endTime, url, thumbnailUrl, displayName);
        }

    }
}
