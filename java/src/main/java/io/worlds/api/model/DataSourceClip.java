package io.worlds.api.model;


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


        public DataSourceClip build() {
            return new DataSourceClip(id, dataSource, startTime, endTime, url, thumbnailUrl, displayName);
        }

    }
}
