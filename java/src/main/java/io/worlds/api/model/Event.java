package io.worlds.api.model;


public class Event implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private String id;
    @jakarta.validation.constraints.NotNull
    private EventProducer eventProducer;
    @jakarta.validation.constraints.NotNull
    private String type;
    private String subType;
    @jakarta.validation.constraints.NotNull
    private java.time.OffsetDateTime startTime;
    private java.time.OffsetDateTime endTime;
    private GeoJSONPoint position;
    private String timezone;
    private java.lang.Object metadata;
    @jakarta.validation.constraints.NotNull
    private java.util.List<Image> images;
    @Deprecated
    @jakarta.validation.constraints.NotNull
    private java.util.List<Video> videos;
    @jakarta.validation.constraints.NotNull
    private java.util.List<DataSourceClip> dataSourceClips;
    private EventProperties properties;
    private Boolean draft;
    private EventValidation validation;
    private String priority;

    public Event() {
    }

    public Event(String id, EventProducer eventProducer, String type, String subType, java.time.OffsetDateTime startTime, java.time.OffsetDateTime endTime, GeoJSONPoint position, String timezone, java.lang.Object metadata, java.util.List<Image> images, java.util.List<Video> videos, java.util.List<DataSourceClip> dataSourceClips, EventProperties properties, Boolean draft, EventValidation validation, String priority) {
        this.id = id;
        this.eventProducer = eventProducer;
        this.type = type;
        this.subType = subType;
        this.startTime = startTime;
        this.endTime = endTime;
        this.position = position;
        this.timezone = timezone;
        this.metadata = metadata;
        this.images = images;
        this.videos = videos;
        this.dataSourceClips = dataSourceClips;
        this.properties = properties;
        this.draft = draft;
        this.validation = validation;
        this.priority = priority;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public EventProducer getEventProducer() {
        return eventProducer;
    }
    public void setEventProducer(EventProducer eventProducer) {
        this.eventProducer = eventProducer;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public String getSubType() {
        return subType;
    }
    public void setSubType(String subType) {
        this.subType = subType;
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

    public GeoJSONPoint getPosition() {
        return position;
    }
    public void setPosition(GeoJSONPoint position) {
        this.position = position;
    }

    public String getTimezone() {
        return timezone;
    }
    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public java.lang.Object getMetadata() {
        return metadata;
    }
    public void setMetadata(java.lang.Object metadata) {
        this.metadata = metadata;
    }

    public java.util.List<Image> getImages() {
        return images;
    }
    public void setImages(java.util.List<Image> images) {
        this.images = images;
    }

    @Deprecated
    public java.util.List<Video> getVideos() {
        return videos;
    }
    @Deprecated
    public void setVideos(java.util.List<Video> videos) {
        this.videos = videos;
    }

    public java.util.List<DataSourceClip> getDataSourceClips() {
        return dataSourceClips;
    }
    public void setDataSourceClips(java.util.List<DataSourceClip> dataSourceClips) {
        this.dataSourceClips = dataSourceClips;
    }

    public EventProperties getProperties() {
        return properties;
    }
    public void setProperties(EventProperties properties) {
        this.properties = properties;
    }

    public Boolean getDraft() {
        return draft;
    }
    public void setDraft(Boolean draft) {
        this.draft = draft;
    }

    public EventValidation getValidation() {
        return validation;
    }
    public void setValidation(EventValidation validation) {
        this.validation = validation;
    }

    public String getPriority() {
        return priority;
    }
    public void setPriority(String priority) {
        this.priority = priority;
    }



    public static Event.Builder builder() {
        return new Event.Builder();
    }

    public static class Builder {

        private String id;
        private EventProducer eventProducer;
        private String type;
        private String subType;
        private java.time.OffsetDateTime startTime;
        private java.time.OffsetDateTime endTime;
        private GeoJSONPoint position;
        private String timezone;
        private java.lang.Object metadata;
        private java.util.List<Image> images;
        private java.util.List<Video> videos;
        private java.util.List<DataSourceClip> dataSourceClips;
        private EventProperties properties;
        private Boolean draft;
        private EventValidation validation;
        private String priority;

        public Builder() {
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setEventProducer(EventProducer eventProducer) {
            this.eventProducer = eventProducer;
            return this;
        }

        public Builder setType(String type) {
            this.type = type;
            return this;
        }

        public Builder setSubType(String subType) {
            this.subType = subType;
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

        public Builder setPosition(GeoJSONPoint position) {
            this.position = position;
            return this;
        }

        public Builder setTimezone(String timezone) {
            this.timezone = timezone;
            return this;
        }

        public Builder setMetadata(java.lang.Object metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder setImages(java.util.List<Image> images) {
            this.images = images;
            return this;
        }

        @Deprecated
        public Builder setVideos(java.util.List<Video> videos) {
            this.videos = videos;
            return this;
        }

        public Builder setDataSourceClips(java.util.List<DataSourceClip> dataSourceClips) {
            this.dataSourceClips = dataSourceClips;
            return this;
        }

        public Builder setProperties(EventProperties properties) {
            this.properties = properties;
            return this;
        }

        public Builder setDraft(Boolean draft) {
            this.draft = draft;
            return this;
        }

        public Builder setValidation(EventValidation validation) {
            this.validation = validation;
            return this;
        }

        public Builder setPriority(String priority) {
            this.priority = priority;
            return this;
        }


        public Event build() {
            return new Event(id, eventProducer, type, subType, startTime, endTime, position, timezone, metadata, images, videos, dataSourceClips, properties, draft, validation, priority);
        }

    }
}
