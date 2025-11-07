package io.worlds.api.model;

import java.util.Objects;

/**
 * Event Properties contain additional details and related information for an event. For more details on event producers and events, see [`EventProducer`]({{Types.EventProducer}}).
 */
public class EventProperties implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private java.util.List<Track> tracks;
    private java.util.List<Site> sites;
    private java.util.List<DataSource> dataSources;
    private java.util.List<Tag> tags;
    private java.util.List<PointOfInterest> pointsOfInterest;

    public EventProperties() {
    }

    public EventProperties(java.util.List<Track> tracks, java.util.List<Site> sites, java.util.List<DataSource> dataSources, java.util.List<Tag> tags, java.util.List<PointOfInterest> pointsOfInterest) {
        this.tracks = tracks;
        this.sites = sites;
        this.dataSources = dataSources;
        this.tags = tags;
        this.pointsOfInterest = pointsOfInterest;
    }

    /**
     * The tracks associated with the event.
     */
    public java.util.List<Track> getTracks() {
        return tracks;
    }
    /**
     * The tracks associated with the event.
     */
    public void setTracks(java.util.List<Track> tracks) {
        this.tracks = tracks;
    }

    /**
     * The sites associated with the event.
     */
    public java.util.List<Site> getSites() {
        return sites;
    }
    /**
     * The sites associated with the event.
     */
    public void setSites(java.util.List<Site> sites) {
        this.sites = sites;
    }

    /**
     * The data sources associated with the event.
     */
    public java.util.List<DataSource> getDataSources() {
        return dataSources;
    }
    /**
     * The data sources associated with the event.
     */
    public void setDataSources(java.util.List<DataSource> dataSources) {
        this.dataSources = dataSources;
    }

    /**
     * The tag labels of detections associated with the event.
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }
    /**
     * The tag labels of detections associated with the event.
     */
    public void setTags(java.util.List<Tag> tags) {
        this.tags = tags;
    }

    /**
     * The points of interest associated with the event.
     */
    public java.util.List<PointOfInterest> getPointsOfInterest() {
        return pointsOfInterest;
    }
    /**
     * The points of interest associated with the event.
     */
    public void setPointsOfInterest(java.util.List<PointOfInterest> pointsOfInterest) {
        this.pointsOfInterest = pointsOfInterest;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final EventProperties that = (EventProperties) obj;
        return Objects.equals(tracks, that.tracks)
            && Objects.equals(sites, that.sites)
            && Objects.equals(dataSources, that.dataSources)
            && Objects.equals(tags, that.tags)
            && Objects.equals(pointsOfInterest, that.pointsOfInterest);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tracks, sites, dataSources, tags, pointsOfInterest);
    }


    public static EventProperties.Builder builder() {
        return new EventProperties.Builder();
    }

    public static class Builder {

        private java.util.List<Track> tracks;
        private java.util.List<Site> sites;
        private java.util.List<DataSource> dataSources;
        private java.util.List<Tag> tags;
        private java.util.List<PointOfInterest> pointsOfInterest;

        public Builder() {
        }

        /**
         * The tracks associated with the event.
         */
        public Builder setTracks(java.util.List<Track> tracks) {
            this.tracks = tracks;
            return this;
        }

        /**
         * The sites associated with the event.
         */
        public Builder setSites(java.util.List<Site> sites) {
            this.sites = sites;
            return this;
        }

        /**
         * The data sources associated with the event.
         */
        public Builder setDataSources(java.util.List<DataSource> dataSources) {
            this.dataSources = dataSources;
            return this;
        }

        /**
         * The tag labels of detections associated with the event.
         */
        public Builder setTags(java.util.List<Tag> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * The points of interest associated with the event.
         */
        public Builder setPointsOfInterest(java.util.List<PointOfInterest> pointsOfInterest) {
            this.pointsOfInterest = pointsOfInterest;
            return this;
        }


        public EventProperties build() {
            return new EventProperties(tracks, sites, dataSources, tags, pointsOfInterest);
        }

    }
}
