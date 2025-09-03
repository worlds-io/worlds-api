package io.worlds.api.model;


/**
 * An event represents a custom event, including its start time, location, and duration. For more details on event producers and events, see [About EventProducers](/reference/objects/eventproducer/#about-event-producers).
 */
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

    /**
     * The unique identifier for the event.
     */
    public String getId() {
        return id;
    }
    /**
     * The unique identifier for the event.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * The event producer that owns the event.
     */
    public EventProducer getEventProducer() {
        return eventProducer;
    }
    /**
     * The event producer that owns the event.
     */
    public void setEventProducer(EventProducer eventProducer) {
        this.eventProducer = eventProducer;
    }

    /**
     * The type of the event, which should convey the broad category of the event.
     */
    public String getType() {
        return type;
    }
    /**
     * The type of the event, which should convey the broad category of the event.
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * The subtype of the event, if provided, which should provide more context on the
category of the event.
     */
    public String getSubType() {
        return subType;
    }
    /**
     * The subtype of the event, if provided, which should provide more context on the
category of the event.
     */
    public void setSubType(String subType) {
        this.subType = subType;
    }

    /**
     * The time at which the event started.
     */
    public java.time.OffsetDateTime getStartTime() {
        return startTime;
    }
    /**
     * The time at which the event started.
     */
    public void setStartTime(java.time.OffsetDateTime startTime) {
        this.startTime = startTime;
    }

    /**
     * The time at which the event ended. If not provided, the event is still ongoing.
     */
    public java.time.OffsetDateTime getEndTime() {
        return endTime;
    }
    /**
     * The time at which the event ended. If not provided, the event is still ongoing.
     */
    public void setEndTime(java.time.OffsetDateTime endTime) {
        this.endTime = endTime;
    }

    /**
     * The GeoJSON point recorded with the event, if any.
     */
    public GeoJSONPoint getPosition() {
        return position;
    }
    /**
     * The GeoJSON point recorded with the event, if any.
     */
    public void setPosition(GeoJSONPoint position) {
        this.position = position;
    }

    /**
     * The timezone for the event, if provided.
     */
    public String getTimezone() {
        return timezone;
    }
    /**
     * The timezone for the event, if provided.
     */
    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    /**
     * Additional metadata associated with the event. This may represent any JSON
object structure.
     */
    public java.lang.Object getMetadata() {
        return metadata;
    }
    /**
     * Additional metadata associated with the event. This may represent any JSON
object structure.
     */
    public void setMetadata(java.lang.Object metadata) {
        this.metadata = metadata;
    }

    /**
     * The images that are associated with this event.
     */
    public java.util.List<Image> getImages() {
        return images;
    }
    /**
     * The images that are associated with this event.
     */
    public void setImages(java.util.List<Image> images) {
        this.images = images;
    }

    /**
     * The videos that are associated with this event.
     */
    @Deprecated
    public java.util.List<Video> getVideos() {
        return videos;
    }
    /**
     * The videos that are associated with this event.
     */
    @Deprecated
    public void setVideos(java.util.List<Video> videos) {
        this.videos = videos;
    }

    /**
     * Video clips that are associated with this event.
     */
    public java.util.List<DataSourceClip> getDataSourceClips() {
        return dataSourceClips;
    }
    /**
     * Video clips that are associated with this event.
     */
    public void setDataSourceClips(java.util.List<DataSourceClip> dataSourceClips) {
        this.dataSourceClips = dataSourceClips;
    }

    /**
     * Optional additional information associated with this event, including related data sources, sites, and tags.
     */
    public EventProperties getProperties() {
        return properties;
    }
    /**
     * Optional additional information associated with this event, including related data sources, sites, and tags.
     */
    public void setProperties(EventProperties properties) {
        this.properties = properties;
    }

    /**
     * Indicate that the event is a draft.  Defaults to false.
     */
    public Boolean getDraft() {
        return draft;
    }
    /**
     * Indicate that the event is a draft.  Defaults to false.
     */
    public void setDraft(Boolean draft) {
        this.draft = draft;
    }

    /**
     * Optional information to validate the accuracy of the event.
     */
    public EventValidation getValidation() {
        return validation;
    }
    /**
     * Optional information to validate the accuracy of the event.
     */
    public void setValidation(EventValidation validation) {
        this.validation = validation;
    }

    /**
     * Optional string to indicate the priority of an event.
     */
    public String getPriority() {
        return priority;
    }
    /**
     * Optional string to indicate the priority of an event.
     */
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

        /**
         * The unique identifier for the event.
         */
        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        /**
         * The event producer that owns the event.
         */
        public Builder setEventProducer(EventProducer eventProducer) {
            this.eventProducer = eventProducer;
            return this;
        }

        /**
         * The type of the event, which should convey the broad category of the event.
         */
        public Builder setType(String type) {
            this.type = type;
            return this;
        }

        /**
         * The subtype of the event, if provided, which should provide more context on the
category of the event.
         */
        public Builder setSubType(String subType) {
            this.subType = subType;
            return this;
        }

        /**
         * The time at which the event started.
         */
        public Builder setStartTime(java.time.OffsetDateTime startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * The time at which the event ended. If not provided, the event is still ongoing.
         */
        public Builder setEndTime(java.time.OffsetDateTime endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * The GeoJSON point recorded with the event, if any.
         */
        public Builder setPosition(GeoJSONPoint position) {
            this.position = position;
            return this;
        }

        /**
         * The timezone for the event, if provided.
         */
        public Builder setTimezone(String timezone) {
            this.timezone = timezone;
            return this;
        }

        /**
         * Additional metadata associated with the event. This may represent any JSON
object structure.
         */
        public Builder setMetadata(java.lang.Object metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * The images that are associated with this event.
         */
        public Builder setImages(java.util.List<Image> images) {
            this.images = images;
            return this;
        }

        /**
         * The videos that are associated with this event.
         */
        @Deprecated
        public Builder setVideos(java.util.List<Video> videos) {
            this.videos = videos;
            return this;
        }

        /**
         * Video clips that are associated with this event.
         */
        public Builder setDataSourceClips(java.util.List<DataSourceClip> dataSourceClips) {
            this.dataSourceClips = dataSourceClips;
            return this;
        }

        /**
         * Optional additional information associated with this event, including related data sources, sites, and tags.
         */
        public Builder setProperties(EventProperties properties) {
            this.properties = properties;
            return this;
        }

        /**
         * Indicate that the event is a draft.  Defaults to false.
         */
        public Builder setDraft(Boolean draft) {
            this.draft = draft;
            return this;
        }

        /**
         * Optional information to validate the accuracy of the event.
         */
        public Builder setValidation(EventValidation validation) {
            this.validation = validation;
            return this;
        }

        /**
         * Optional string to indicate the priority of an event.
         */
        public Builder setPriority(String priority) {
            this.priority = priority;
            return this;
        }


        public Event build() {
            return new Event(id, eventProducer, type, subType, startTime, endTime, position, timezone, metadata, images, videos, dataSourceClips, properties, draft, validation, priority);
        }

    }
}
