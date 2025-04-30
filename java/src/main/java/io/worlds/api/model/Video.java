package io.worlds.api.model;


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

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public DataSource getDataSource() {
        return dataSource;
    }
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public java.time.OffsetDateTime getStartTime() {
        return startTime;
    }
    public void setStartTime(java.time.OffsetDateTime startTime) {
        this.startTime = startTime;
    }

    public java.time.OffsetDateTime getEndTime() {
        return endTime;
    }
    public void setEndTime(java.time.OffsetDateTime endTime) {
        this.endTime = endTime;
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

    public String getDisplayName() {
        return displayName;
    }
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getResolutionHeight() {
        return resolutionHeight;
    }
    public void setResolutionHeight(String resolutionHeight) {
        this.resolutionHeight = resolutionHeight;
    }

    public String getResolutionWidth() {
        return resolutionWidth;
    }
    public void setResolutionWidth(String resolutionWidth) {
        this.resolutionWidth = resolutionWidth;
    }

    public Double getFrameRate() {
        return frameRate;
    }
    public void setFrameRate(Double frameRate) {
        this.frameRate = frameRate;
    }

    public User getCreatedBy() {
        return createdBy;
    }
    public void setCreatedBy(User createdBy) {
        this.createdBy = createdBy;
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

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setDataSource(DataSource dataSource) {
            this.dataSource = dataSource;
            return this;
        }

        public Builder setStartTime(java.time.OffsetDateTime startTime) {
            this.startTime = startTime;
            return this;
        }

        public Builder setEndTime(java.time.OffsetDateTime endTime) {
            this.endTime = endTime;
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

        public Builder setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setResolutionHeight(String resolutionHeight) {
            this.resolutionHeight = resolutionHeight;
            return this;
        }

        public Builder setResolutionWidth(String resolutionWidth) {
            this.resolutionWidth = resolutionWidth;
            return this;
        }

        public Builder setFrameRate(Double frameRate) {
            this.frameRate = frameRate;
            return this;
        }

        public Builder setCreatedBy(User createdBy) {
            this.createdBy = createdBy;
            return this;
        }


        public Video build() {
            return new Video(id, dataSource, startTime, endTime, url, thumbnailUrl, displayName, resolutionHeight, resolutionWidth, frameRate, createdBy);
        }

    }
}
