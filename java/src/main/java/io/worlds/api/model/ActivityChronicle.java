package io.worlds.api.model;


public class ActivityChronicle implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private String id;
    @jakarta.validation.constraints.NotNull
    private ChronicleProducer chronicleProducer;
    @jakarta.validation.constraints.NotNull
    private String name;
    private String description;
    @jakarta.validation.constraints.NotNull
    private java.time.OffsetDateTime startTime;
    private java.time.OffsetDateTime endTime;
    private String timezone;
    private java.lang.Object metadata;
    private ChronicleValidation validation;
    private String priority;
    private String status;
    private java.util.List<String> labels;
    private java.util.List<String> locations;
    @jakarta.validation.constraints.NotNull
    private java.util.List<Image> images;
    @jakarta.validation.constraints.NotNull
    private java.util.List<DataSourceClip> dataSourceClips;
    private java.util.List<Track> tracks;
    private java.util.List<Site> sites;
    private java.util.List<DataSource> dataSources;
    private java.util.List<Tag> tags;
    private java.util.List<PointOfInterest> pointsOfInterest;
    @jakarta.validation.constraints.NotNull
    private java.time.OffsetDateTime createdAt;
    @jakarta.validation.constraints.NotNull
    private java.time.OffsetDateTime updatedAt;

    public ActivityChronicle() {
    }

    public ActivityChronicle(String id, ChronicleProducer chronicleProducer, String name, String description, java.time.OffsetDateTime startTime, java.time.OffsetDateTime endTime, String timezone, java.lang.Object metadata, ChronicleValidation validation, String priority, String status, java.util.List<String> labels, java.util.List<String> locations, java.util.List<Image> images, java.util.List<DataSourceClip> dataSourceClips, java.util.List<Track> tracks, java.util.List<Site> sites, java.util.List<DataSource> dataSources, java.util.List<Tag> tags, java.util.List<PointOfInterest> pointsOfInterest, java.time.OffsetDateTime createdAt, java.time.OffsetDateTime updatedAt) {
        this.id = id;
        this.chronicleProducer = chronicleProducer;
        this.name = name;
        this.description = description;
        this.startTime = startTime;
        this.endTime = endTime;
        this.timezone = timezone;
        this.metadata = metadata;
        this.validation = validation;
        this.priority = priority;
        this.status = status;
        this.labels = labels;
        this.locations = locations;
        this.images = images;
        this.dataSourceClips = dataSourceClips;
        this.tracks = tracks;
        this.sites = sites;
        this.dataSources = dataSources;
        this.tags = tags;
        this.pointsOfInterest = pointsOfInterest;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public ChronicleProducer getChronicleProducer() {
        return chronicleProducer;
    }
    public void setChronicleProducer(ChronicleProducer chronicleProducer) {
        this.chronicleProducer = chronicleProducer;
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

    public ChronicleValidation getValidation() {
        return validation;
    }
    public void setValidation(ChronicleValidation validation) {
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

    public java.util.List<String> getLocations() {
        return locations;
    }
    public void setLocations(java.util.List<String> locations) {
        this.locations = locations;
    }

    public java.util.List<Image> getImages() {
        return images;
    }
    public void setImages(java.util.List<Image> images) {
        this.images = images;
    }

    public java.util.List<DataSourceClip> getDataSourceClips() {
        return dataSourceClips;
    }
    public void setDataSourceClips(java.util.List<DataSourceClip> dataSourceClips) {
        this.dataSourceClips = dataSourceClips;
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



    public static ActivityChronicle.Builder builder() {
        return new ActivityChronicle.Builder();
    }

    public static class Builder {

        private String id;
        private ChronicleProducer chronicleProducer;
        private String name;
        private String description;
        private java.time.OffsetDateTime startTime;
        private java.time.OffsetDateTime endTime;
        private String timezone;
        private java.lang.Object metadata;
        private ChronicleValidation validation;
        private String priority;
        private String status;
        private java.util.List<String> labels;
        private java.util.List<String> locations;
        private java.util.List<Image> images;
        private java.util.List<DataSourceClip> dataSourceClips;
        private java.util.List<Track> tracks;
        private java.util.List<Site> sites;
        private java.util.List<DataSource> dataSources;
        private java.util.List<Tag> tags;
        private java.util.List<PointOfInterest> pointsOfInterest;
        private java.time.OffsetDateTime createdAt;
        private java.time.OffsetDateTime updatedAt;

        public Builder() {
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setChronicleProducer(ChronicleProducer chronicleProducer) {
            this.chronicleProducer = chronicleProducer;
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

        public Builder setTimezone(String timezone) {
            this.timezone = timezone;
            return this;
        }

        public Builder setMetadata(java.lang.Object metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder setValidation(ChronicleValidation validation) {
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

        public Builder setLocations(java.util.List<String> locations) {
            this.locations = locations;
            return this;
        }

        public Builder setImages(java.util.List<Image> images) {
            this.images = images;
            return this;
        }

        public Builder setDataSourceClips(java.util.List<DataSourceClip> dataSourceClips) {
            this.dataSourceClips = dataSourceClips;
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

        public Builder setCreatedAt(java.time.OffsetDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public Builder setUpdatedAt(java.time.OffsetDateTime updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }


        public ActivityChronicle build() {
            return new ActivityChronicle(id, chronicleProducer, name, description, startTime, endTime, timezone, metadata, validation, priority, status, labels, locations, images, dataSourceClips, tracks, sites, dataSources, tags, pointsOfInterest, createdAt, updatedAt);
        }

    }
}
