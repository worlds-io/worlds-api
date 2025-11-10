package io.worlds.api.model;

import java.util.Objects;

/**
 * A video represents a video from a data source, including its start and end time.
 */
public class Video implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private String id;
    @jakarta.validation.constraints.NotNull
    private DataSource dataSource;
    @jakarta.validation.constraints.NotNull
    private java.time.OffsetDateTime startTime;
    private java.time.OffsetDateTime endTime;
    @jakarta.validation.constraints.NotNull
    private String url;
    private String thumbnailUrl;
    private String displayName;
    private String resolutionHeight;
    private String resolutionWidth;
    private Double frameRate;
    private User createdBy;

    public Video() {
    }

    public Video(String id, DataSource dataSource, java.time.OffsetDateTime startTime, java.time.OffsetDateTime endTime, String url, String thumbnailUrl, String displayName, String resolutionHeight, String resolutionWidth, Double frameRate, User createdBy) {
        this.id = id;
        this.dataSource = dataSource;
        this.startTime = startTime;
        this.endTime = endTime;
        this.url = url;
        this.thumbnailUrl = thumbnailUrl;
        this.displayName = displayName;
        this.resolutionHeight = resolutionHeight;
        this.resolutionWidth = resolutionWidth;
        this.frameRate = frameRate;
        this.createdBy = createdBy;
    }

    /**
     * The unique identifier for the video.
     */
    public String getId() {
        return id;
    }
    /**
     * The unique identifier for the video.
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
     * The time at which the video started.
     */
    public java.time.OffsetDateTime getStartTime() {
        return startTime;
    }
    /**
     * The time at which the video started.
     */
    public void setStartTime(java.time.OffsetDateTime startTime) {
        this.startTime = startTime;
    }

    /**
     * The time at which the video ended. If not provided, the video is still ongoing.
     */
    public java.time.OffsetDateTime getEndTime() {
        return endTime;
    }
    /**
     * The time at which the video ended. If not provided, the video is still ongoing.
     */
    public void setEndTime(java.time.OffsetDateTime endTime) {
        this.endTime = endTime;
    }

    /**
     * The signed URL to be used to stream the video.
     */
    public String getUrl() {
        return url;
    }
    /**
     * The signed URL to be used to stream the video.
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * The signed URL to be used to retrieve the video thumbnail.
     */
    public String getThumbnailUrl() {
        return thumbnailUrl;
    }
    /**
     * The signed URL to be used to retrieve the video thumbnail.
     */
    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }

    /**
     * The display name of the video.
     */
    public String getDisplayName() {
        return displayName;
    }
    /**
     * The display name of the video.
     */
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * The resolution height of the video.
     */
    public String getResolutionHeight() {
        return resolutionHeight;
    }
    /**
     * The resolution height of the video.
     */
    public void setResolutionHeight(String resolutionHeight) {
        this.resolutionHeight = resolutionHeight;
    }

    /**
     * The resolution width of the video.
     */
    public String getResolutionWidth() {
        return resolutionWidth;
    }
    /**
     * The resolution width of the video.
     */
    public void setResolutionWidth(String resolutionWidth) {
        this.resolutionWidth = resolutionWidth;
    }

    /**
     * The frame rate of the video.
     */
    public Double getFrameRate() {
        return frameRate;
    }
    /**
     * The frame rate of the video.
     */
    public void setFrameRate(Double frameRate) {
        this.frameRate = frameRate;
    }

    /**
     * The user the video was created by.
     */
    public User getCreatedBy() {
        return createdBy;
    }
    /**
     * The user the video was created by.
     */
    public void setCreatedBy(User createdBy) {
        this.createdBy = createdBy;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final Video that = (Video) obj;
        return Objects.equals(id, that.id)
            && Objects.equals(dataSource, that.dataSource)
            && Objects.equals(startTime, that.startTime)
            && Objects.equals(endTime, that.endTime)
            && Objects.equals(url, that.url)
            && Objects.equals(thumbnailUrl, that.thumbnailUrl)
            && Objects.equals(displayName, that.displayName)
            && Objects.equals(resolutionHeight, that.resolutionHeight)
            && Objects.equals(resolutionWidth, that.resolutionWidth)
            && Objects.equals(frameRate, that.frameRate)
            && Objects.equals(createdBy, that.createdBy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, dataSource, startTime, endTime, url, thumbnailUrl, displayName, resolutionHeight, resolutionWidth, frameRate, createdBy);
    }


    public static Video.Builder builder() {
        return new Video.Builder();
    }

    public static class Builder {

        private String id;
        private DataSource dataSource;
        private java.time.OffsetDateTime startTime;
        private java.time.OffsetDateTime endTime;
        private String url;
        private String thumbnailUrl;
        private String displayName;
        private String resolutionHeight;
        private String resolutionWidth;
        private Double frameRate;
        private User createdBy;

        public Builder() {
        }

        /**
         * The unique identifier for the video.
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
         * The time at which the video started.
         */
        public Builder setStartTime(java.time.OffsetDateTime startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * The time at which the video ended. If not provided, the video is still ongoing.
         */
        public Builder setEndTime(java.time.OffsetDateTime endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * The signed URL to be used to stream the video.
         */
        public Builder setUrl(String url) {
            this.url = url;
            return this;
        }

        /**
         * The signed URL to be used to retrieve the video thumbnail.
         */
        public Builder setThumbnailUrl(String thumbnailUrl) {
            this.thumbnailUrl = thumbnailUrl;
            return this;
        }

        /**
         * The display name of the video.
         */
        public Builder setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        /**
         * The resolution height of the video.
         */
        public Builder setResolutionHeight(String resolutionHeight) {
            this.resolutionHeight = resolutionHeight;
            return this;
        }

        /**
         * The resolution width of the video.
         */
        public Builder setResolutionWidth(String resolutionWidth) {
            this.resolutionWidth = resolutionWidth;
            return this;
        }

        /**
         * The frame rate of the video.
         */
        public Builder setFrameRate(Double frameRate) {
            this.frameRate = frameRate;
            return this;
        }

        /**
         * The user the video was created by.
         */
        public Builder setCreatedBy(User createdBy) {
            this.createdBy = createdBy;
            return this;
        }


        public Video build() {
            return new Video(id, dataSource, startTime, endTime, url, thumbnailUrl, displayName, resolutionHeight, resolutionWidth, frameRate, createdBy);
        }

    }
}
