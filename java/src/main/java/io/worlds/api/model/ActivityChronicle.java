package io.worlds.api.model;


/**
 * An activity chronicle represents behavior which occurs over a period of time.
 */
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

    /**
     * The unique identifier for the activity.
     */
    public String getId() {
        return id;
    }
    /**
     * The unique identifier for the activity.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * The chronicle producer that created the activity.
     */
    public ChronicleProducer getChronicleProducer() {
        return chronicleProducer;
    }
    /**
     * The chronicle producer that created the activity.
     */
    public void setChronicleProducer(ChronicleProducer chronicleProducer) {
        this.chronicleProducer = chronicleProducer;
    }

    /**
     * The name of the activity
     */
    public String getName() {
        return name;
    }
    /**
     * The name of the activity
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * A text description of the activity.
     */
    public String getDescription() {
        return description;
    }
    /**
     * A text description of the activity.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * The time at which the activity started.
     */
    public java.time.OffsetDateTime getStartTime() {
        return startTime;
    }
    /**
     * The time at which the activity started.
     */
    public void setStartTime(java.time.OffsetDateTime startTime) {
        this.startTime = startTime;
    }

    /**
     * The time at which the activity ended.
     */
    public java.time.OffsetDateTime getEndTime() {
        return endTime;
    }
    /**
     * The time at which the activity ended.
     */
    public void setEndTime(java.time.OffsetDateTime endTime) {
        this.endTime = endTime;
    }

    /**
     * The timezone for the activity, if provided.
     */
    public String getTimezone() {
        return timezone;
    }
    /**
     * The timezone for the activity, if provided.
     */
    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    /**
     * Additional metadata associated with the activity. This may represent any JSON object structure.
     */
    public java.lang.Object getMetadata() {
        return metadata;
    }
    /**
     * Additional metadata associated with the activity. This may represent any JSON object structure.
     */
    public void setMetadata(java.lang.Object metadata) {
        this.metadata = metadata;
    }

    /**
     * Optional information to validate the accuracy of the activity.
     */
    public ChronicleValidation getValidation() {
        return validation;
    }
    /**
     * Optional information to validate the accuracy of the activity.
     */
    public void setValidation(ChronicleValidation validation) {
        this.validation = validation;
    }

    /**
     * User-defined priority of the activity.
     */
    public String getPriority() {
        return priority;
    }
    /**
     * User-defined priority of the activity.
     */
    public void setPriority(String priority) {
        this.priority = priority;
    }

    /**
     * User-defined status of the activity.
     */
    public String getStatus() {
        return status;
    }
    /**
     * User-defined status of the activity.
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Human-readable labels describing the activity.
     */
    public java.util.List<String> getLabels() {
        return labels;
    }
    /**
     * Human-readable labels describing the activity.
     */
    public void setLabels(java.util.List<String> labels) {
        this.labels = labels;
    }

    /**
     * Human-readable locations describing the activity.
     */
    public java.util.List<String> getLocations() {
        return locations;
    }
    /**
     * Human-readable locations describing the activity.
     */
    public void setLocations(java.util.List<String> locations) {
        this.locations = locations;
    }

    /**
     * Images associated with the activity.
     */
    public java.util.List<Image> getImages() {
        return images;
    }
    /**
     * Images associated with the activity.
     */
    public void setImages(java.util.List<Image> images) {
        this.images = images;
    }

    /**
     * Clips associated with the activity.
     */
    public java.util.List<DataSourceClip> getDataSourceClips() {
        return dataSourceClips;
    }
    /**
     * Clips associated with the activity.
     */
    public void setDataSourceClips(java.util.List<DataSourceClip> dataSourceClips) {
        this.dataSourceClips = dataSourceClips;
    }

    /**
     * Tracks associated with the activity.
     */
    public java.util.List<Track> getTracks() {
        return tracks;
    }
    /**
     * Tracks associated with the activity.
     */
    public void setTracks(java.util.List<Track> tracks) {
        this.tracks = tracks;
    }

    /**
     * Sites associated with the activity.
     */
    public java.util.List<Site> getSites() {
        return sites;
    }
    /**
     * Sites associated with the activity.
     */
    public void setSites(java.util.List<Site> sites) {
        this.sites = sites;
    }

    /**
     * Data Sources associated with the activity.
     */
    public java.util.List<DataSource> getDataSources() {
        return dataSources;
    }
    /**
     * Data Sources associated with the activity.
     */
    public void setDataSources(java.util.List<DataSource> dataSources) {
        this.dataSources = dataSources;
    }

    /**
     * Tags associated with the activity.
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }
    /**
     * Tags associated with the activity.
     */
    public void setTags(java.util.List<Tag> tags) {
        this.tags = tags;
    }

    /**
     * Points of Interest associated with the activity.
     */
    public java.util.List<PointOfInterest> getPointsOfInterest() {
        return pointsOfInterest;
    }
    /**
     * Points of Interest associated with the activity.
     */
    public void setPointsOfInterest(java.util.List<PointOfInterest> pointsOfInterest) {
        this.pointsOfInterest = pointsOfInterest;
    }

    /**
     * Timestamp that the activity was created.
     */
    public java.time.OffsetDateTime getCreatedAt() {
        return createdAt;
    }
    /**
     * Timestamp that the activity was created.
     */
    public void setCreatedAt(java.time.OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * Timestamp that the activity was most recently updated.
     */
    public java.time.OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }
    /**
     * Timestamp that the activity was most recently updated.
     */
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

        /**
         * The unique identifier for the activity.
         */
        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        /**
         * The chronicle producer that created the activity.
         */
        public Builder setChronicleProducer(ChronicleProducer chronicleProducer) {
            this.chronicleProducer = chronicleProducer;
            return this;
        }

        /**
         * The name of the activity
         */
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        /**
         * A text description of the activity.
         */
        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        /**
         * The time at which the activity started.
         */
        public Builder setStartTime(java.time.OffsetDateTime startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * The time at which the activity ended.
         */
        public Builder setEndTime(java.time.OffsetDateTime endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * The timezone for the activity, if provided.
         */
        public Builder setTimezone(String timezone) {
            this.timezone = timezone;
            return this;
        }

        /**
         * Additional metadata associated with the activity. This may represent any JSON object structure.
         */
        public Builder setMetadata(java.lang.Object metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * Optional information to validate the accuracy of the activity.
         */
        public Builder setValidation(ChronicleValidation validation) {
            this.validation = validation;
            return this;
        }

        /**
         * User-defined priority of the activity.
         */
        public Builder setPriority(String priority) {
            this.priority = priority;
            return this;
        }

        /**
         * User-defined status of the activity.
         */
        public Builder setStatus(String status) {
            this.status = status;
            return this;
        }

        /**
         * Human-readable labels describing the activity.
         */
        public Builder setLabels(java.util.List<String> labels) {
            this.labels = labels;
            return this;
        }

        /**
         * Human-readable locations describing the activity.
         */
        public Builder setLocations(java.util.List<String> locations) {
            this.locations = locations;
            return this;
        }

        /**
         * Images associated with the activity.
         */
        public Builder setImages(java.util.List<Image> images) {
            this.images = images;
            return this;
        }

        /**
         * Clips associated with the activity.
         */
        public Builder setDataSourceClips(java.util.List<DataSourceClip> dataSourceClips) {
            this.dataSourceClips = dataSourceClips;
            return this;
        }

        /**
         * Tracks associated with the activity.
         */
        public Builder setTracks(java.util.List<Track> tracks) {
            this.tracks = tracks;
            return this;
        }

        /**
         * Sites associated with the activity.
         */
        public Builder setSites(java.util.List<Site> sites) {
            this.sites = sites;
            return this;
        }

        /**
         * Data Sources associated with the activity.
         */
        public Builder setDataSources(java.util.List<DataSource> dataSources) {
            this.dataSources = dataSources;
            return this;
        }

        /**
         * Tags associated with the activity.
         */
        public Builder setTags(java.util.List<Tag> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * Points of Interest associated with the activity.
         */
        public Builder setPointsOfInterest(java.util.List<PointOfInterest> pointsOfInterest) {
            this.pointsOfInterest = pointsOfInterest;
            return this;
        }

        /**
         * Timestamp that the activity was created.
         */
        public Builder setCreatedAt(java.time.OffsetDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * Timestamp that the activity was most recently updated.
         */
        public Builder setUpdatedAt(java.time.OffsetDateTime updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }


        public ActivityChronicle build() {
            return new ActivityChronicle(id, chronicleProducer, name, description, startTime, endTime, timezone, metadata, validation, priority, status, labels, locations, images, dataSourceClips, tracks, sites, dataSources, tags, pointsOfInterest, createdAt, updatedAt);
        }

    }
}
