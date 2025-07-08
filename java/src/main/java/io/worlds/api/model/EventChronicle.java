package io.worlds.api.model;


public class EventChronicle implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private String id;
    @jakarta.validation.constraints.NotNull
    private String name;
    private String description;
    @jakarta.validation.constraints.NotNull
    private java.time.OffsetDateTime startTime;
    private java.time.OffsetDateTime endTime;
    private GeoJSONPoint position;
    private String timezone;
    private java.lang.Object metadata;
    private ChronicleDocumentValidation validation;
    private String priority;
    private String status;
    private java.util.List<String> labels;
    @jakarta.validation.constraints.NotNull
    private ChronicleDocumentProducer documentProducer;
    @jakarta.validation.constraints.NotNull
    private java.util.List<Image> images;
    @jakarta.validation.constraints.NotNull
    private java.util.List<Video> videos;
    private java.util.List<Track> tracks;
    private java.util.List<Site> sites;
    private java.util.List<DataSource> dataSources;
    private java.util.List<Tag> tags;
    private java.util.List<PointOfInterest> pointsOfInterest;
    @jakarta.validation.constraints.NotNull
    private java.util.List<ActivityChronicle> activityChronicles;
    @jakarta.validation.constraints.NotNull
    private java.time.OffsetDateTime createdAt;
    @jakarta.validation.constraints.NotNull
    private java.time.OffsetDateTime updatedAt;

    public EventChronicle() {
    }

    public EventChronicle(String id, String name, String description, java.time.OffsetDateTime startTime, java.time.OffsetDateTime endTime, GeoJSONPoint position, String timezone, java.lang.Object metadata, ChronicleDocumentValidation validation, String priority, String status, java.util.List<String> labels, ChronicleDocumentProducer documentProducer, java.util.List<Image> images, java.util.List<Video> videos, java.util.List<Track> tracks, java.util.List<Site> sites, java.util.List<DataSource> dataSources, java.util.List<Tag> tags, java.util.List<PointOfInterest> pointsOfInterest, java.util.List<ActivityChronicle> activityChronicles, java.time.OffsetDateTime createdAt, java.time.OffsetDateTime updatedAt) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.startTime = startTime;
        this.endTime = endTime;
        this.position = position;
        this.timezone = timezone;
        this.metadata = metadata;
        this.validation = validation;
        this.priority = priority;
        this.status = status;
        this.labels = labels;
        this.documentProducer = documentProducer;
        this.images = images;
        this.videos = videos;
        this.tracks = tracks;
        this.sites = sites;
        this.dataSources = dataSources;
        this.tags = tags;
        this.pointsOfInterest = pointsOfInterest;
        this.activityChronicles = activityChronicles;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
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

    public ChronicleDocumentValidation getValidation() {
        return validation;
    }
    public void setValidation(ChronicleDocumentValidation validation) {
        this.validation = validation;
    }

    public String getPriority() {
        return priority;
    }
    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    public java.util.List<String> getLabels() {
        return labels;
    }
    public void setLabels(java.util.List<String> labels) {
        this.labels = labels;
    }

    public ChronicleDocumentProducer getDocumentProducer() {
        return documentProducer;
    }
    public void setDocumentProducer(ChronicleDocumentProducer documentProducer) {
        this.documentProducer = documentProducer;
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

    public java.util.List<Track> getTracks() {
        return tracks;
    }
    public void setTracks(java.util.List<Track> tracks) {
        this.tracks = tracks;
    }

    public java.util.List<Site> getSites() {
        return sites;
    }
    public void setSites(java.util.List<Site> sites) {
        this.sites = sites;
    }

    public java.util.List<DataSource> getDataSources() {
        return dataSources;
    }
    public void setDataSources(java.util.List<DataSource> dataSources) {
        this.dataSources = dataSources;
    }

    public java.util.List<Tag> getTags() {
        return tags;
    }
    public void setTags(java.util.List<Tag> tags) {
        this.tags = tags;
    }

    public java.util.List<PointOfInterest> getPointsOfInterest() {
        return pointsOfInterest;
    }
    public void setPointsOfInterest(java.util.List<PointOfInterest> pointsOfInterest) {
        this.pointsOfInterest = pointsOfInterest;
    }

    public java.util.List<ActivityChronicle> getActivityChronicles() {
        return activityChronicles;
    }
    public void setActivityChronicles(java.util.List<ActivityChronicle> activityChronicles) {
        this.activityChronicles = activityChronicles;
    }

    public java.time.OffsetDateTime getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(java.time.OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public java.time.OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }
    public void setUpdatedAt(java.time.OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }



    public static EventChronicle.Builder builder() {
        return new EventChronicle.Builder();
    }

    public static class Builder {

        private String id;
        private String name;
        private String description;
        private java.time.OffsetDateTime startTime;
        private java.time.OffsetDateTime endTime;
        private GeoJSONPoint position;
        private String timezone;
        private java.lang.Object metadata;
        private ChronicleDocumentValidation validation;
        private String priority;
        private String status;
        private java.util.List<String> labels;
        private ChronicleDocumentProducer documentProducer;
        private java.util.List<Image> images;
        private java.util.List<Video> videos;
        private java.util.List<Track> tracks;
        private java.util.List<Site> sites;
        private java.util.List<DataSource> dataSources;
        private java.util.List<Tag> tags;
        private java.util.List<PointOfInterest> pointsOfInterest;
        private java.util.List<ActivityChronicle> activityChronicles;
        private java.time.OffsetDateTime createdAt;
        private java.time.OffsetDateTime updatedAt;

        public Builder() {
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
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

        public Builder setValidation(ChronicleDocumentValidation validation) {
            this.validation = validation;
            return this;
        }

        public Builder setPriority(String priority) {
            this.priority = priority;
            return this;
        }

        public Builder setStatus(String status) {
            this.status = status;
            return this;
        }

        public Builder setLabels(java.util.List<String> labels) {
            this.labels = labels;
            return this;
        }

        public Builder setDocumentProducer(ChronicleDocumentProducer documentProducer) {
            this.documentProducer = documentProducer;
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

        public Builder setTracks(java.util.List<Track> tracks) {
            this.tracks = tracks;
            return this;
        }

        public Builder setSites(java.util.List<Site> sites) {
            this.sites = sites;
            return this;
        }

        public Builder setDataSources(java.util.List<DataSource> dataSources) {
            this.dataSources = dataSources;
            return this;
        }

        public Builder setTags(java.util.List<Tag> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setPointsOfInterest(java.util.List<PointOfInterest> pointsOfInterest) {
            this.pointsOfInterest = pointsOfInterest;
            return this;
        }

        public Builder setActivityChronicles(java.util.List<ActivityChronicle> activityChronicles) {
            this.activityChronicles = activityChronicles;
            return this;
        }

        public Builder setCreatedAt(java.time.OffsetDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public Builder setUpdatedAt(java.time.OffsetDateTime updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }


        public EventChronicle build() {
            return new EventChronicle(id, name, description, startTime, endTime, position, timezone, metadata, validation, priority, status, labels, documentProducer, images, videos, tracks, sites, dataSources, tags, pointsOfInterest, activityChronicles, createdAt, updatedAt);
        }

    }
}
