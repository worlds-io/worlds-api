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
    @jakarta.validation.constraints.NotNull
    private java.util.List<Video> videos;

    public Event() {
    }

    public Event(String id, EventProducer eventProducer, String type, String subType, java.time.OffsetDateTime startTime, java.time.OffsetDateTime endTime, GeoJSONPoint position, String timezone, java.lang.Object metadata, java.util.List<Image> images, java.util.List<Video> videos) {
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

    public java.util.List<Video> getVideos() {
        return videos;
    }
    public void setVideos(java.util.List<Video> videos) {
        this.videos = videos;
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

        public Builder setVideos(java.util.List<Video> videos) {
            this.videos = videos;
            return this;
        }


        public Event build() {
            return new Event(id, eventProducer, type, subType, startTime, endTime, position, timezone, metadata, images, videos);
        }

    }
}
