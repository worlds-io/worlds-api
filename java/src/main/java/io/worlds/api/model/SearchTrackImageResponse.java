package io.worlds.api.model;

import java.util.Objects;

/**
 * The single track from a `searchTrackImages` query.
 */
public class SearchTrackImageResponse implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private Track track;
    @jakarta.validation.constraints.NotNull
    private Detection detection;
    @jakarta.validation.constraints.NotNull
    private java.time.OffsetDateTime timestamp;
    private double confidence;

    public SearchTrackImageResponse() {
    }

    public SearchTrackImageResponse(Track track, Detection detection, java.time.OffsetDateTime timestamp, double confidence) {
        this.track = track;
        this.detection = detection;
        this.timestamp = timestamp;
        this.confidence = confidence;
    }

    /**
     * The track matching the search query.
     */
    public Track getTrack() {
        return track;
    }
    /**
     * The track matching the search query.
     */
    public void setTrack(Track track) {
        this.track = track;
    }

    /**
     * The detection at which the track best matched the search query.
     */
    public Detection getDetection() {
        return detection;
    }
    /**
     * The detection at which the track best matched the search query.
     */
    public void setDetection(Detection detection) {
        this.detection = detection;
    }

    /**
     * The timestamp at which the track best matched the search query.
     */
    public java.time.OffsetDateTime getTimestamp() {
        return timestamp;
    }
    /**
     * The timestamp at which the track best matched the search query.
     */
    public void setTimestamp(java.time.OffsetDateTime timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * The confidence score of the track to the query string, in the range [0, 1].
     */
    public double getConfidence() {
        return confidence;
    }
    /**
     * The confidence score of the track to the query string, in the range [0, 1].
     */
    public void setConfidence(double confidence) {
        this.confidence = confidence;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final SearchTrackImageResponse that = (SearchTrackImageResponse) obj;
        return Objects.equals(track, that.track)
            && Objects.equals(detection, that.detection)
            && Objects.equals(timestamp, that.timestamp)
            && Objects.equals(confidence, that.confidence);
    }

    @Override
    public int hashCode() {
        return Objects.hash(track, detection, timestamp, confidence);
    }


    public static SearchTrackImageResponse.Builder builder() {
        return new SearchTrackImageResponse.Builder();
    }

    public static class Builder {

        private Track track;
        private Detection detection;
        private java.time.OffsetDateTime timestamp;
        private double confidence;

        public Builder() {
        }

        /**
         * The track matching the search query.
         */
        public Builder setTrack(Track track) {
            this.track = track;
            return this;
        }

        /**
         * The detection at which the track best matched the search query.
         */
        public Builder setDetection(Detection detection) {
            this.detection = detection;
            return this;
        }

        /**
         * The timestamp at which the track best matched the search query.
         */
        public Builder setTimestamp(java.time.OffsetDateTime timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        /**
         * The confidence score of the track to the query string, in the range [0, 1].
         */
        public Builder setConfidence(double confidence) {
            this.confidence = confidence;
            return this;
        }


        public SearchTrackImageResponse build() {
            return new SearchTrackImageResponse(track, detection, timestamp, confidence);
        }

    }
}
