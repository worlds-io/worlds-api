package io.worlds.api.model;

import java.util.Objects;

/**
 * The state of copying a [video]({{Types.Video}})'s footage from the edge that recorded it up to the hub.

Distinct from [`Video.cloudAvailable`]({{Types.Video}}), which reports whether the footage can be played
now.
 */
public class VideoSync implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private VideoSyncState state;
    private Integer segmentsDone;
    private Integer segmentsTotal;
    private int attempts;
    private java.time.OffsetDateTime lastEventAt;
    private String error;

    public VideoSync() {
    }

    public VideoSync(VideoSyncState state, Integer segmentsDone, Integer segmentsTotal, int attempts, java.time.OffsetDateTime lastEventAt, String error) {
        this.state = state;
        this.segmentsDone = segmentsDone;
        this.segmentsTotal = segmentsTotal;
        this.attempts = attempts;
        this.lastEventAt = lastEventAt;
        this.error = error;
    }

    /**
     * The state of the most recent sync request for the video.
     */
    public VideoSyncState getState() {
        return state;
    }
    /**
     * The state of the most recent sync request for the video.
     */
    public void setState(VideoSyncState state) {
        this.state = state;
    }

    /**
     * The number of video segments copied so far. Null until the edge reports progress, and on a request
that never got that far.
     */
    public Integer getSegmentsDone() {
        return segmentsDone;
    }
    /**
     * The number of video segments copied so far. Null until the edge reports progress, and on a request
that never got that far.
     */
    public void setSegmentsDone(Integer segmentsDone) {
        this.segmentsDone = segmentsDone;
    }

    /**
     * The number of video segments to be copied. Null until the edge reports progress.
     */
    public Integer getSegmentsTotal() {
        return segmentsTotal;
    }
    /**
     * The number of video segments to be copied. Null until the edge reports progress.
     */
    public void setSegmentsTotal(Integer segmentsTotal) {
        this.segmentsTotal = segmentsTotal;
    }

    /**
     * The number of times the request has been sent to the edge.
     */
    public int getAttempts() {
        return attempts;
    }
    /**
     * The number of times the request has been sent to the edge.
     */
    public void setAttempts(int attempts) {
        this.attempts = attempts;
    }

    /**
     * The time at which the sync last reported progress. Refreshed by every event, so a stale value on an
active state is the caller's staleness signal. Null when no sync has been requested.
     */
    public java.time.OffsetDateTime getLastEventAt() {
        return lastEventAt;
    }
    /**
     * The time at which the sync last reported progress. Refreshed by every event, so a stale value on an
active state is the caller's staleness signal. Null when no sync has been requested.
     */
    public void setLastEventAt(java.time.OffsetDateTime lastEventAt) {
        this.lastEventAt = lastEventAt;
    }

    /**
     * The reason the sync failed, when it did.
     */
    public String getError() {
        return error;
    }
    /**
     * The reason the sync failed, when it did.
     */
    public void setError(String error) {
        this.error = error;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final VideoSync that = (VideoSync) obj;
        return Objects.equals(state, that.state)
            && Objects.equals(segmentsDone, that.segmentsDone)
            && Objects.equals(segmentsTotal, that.segmentsTotal)
            && Objects.equals(attempts, that.attempts)
            && Objects.equals(lastEventAt, that.lastEventAt)
            && Objects.equals(error, that.error);
    }

    @Override
    public int hashCode() {
        return Objects.hash(state, segmentsDone, segmentsTotal, attempts, lastEventAt, error);
    }


    public static VideoSync.Builder builder() {
        return new VideoSync.Builder();
    }

    public static class Builder {

        private VideoSyncState state;
        private Integer segmentsDone;
        private Integer segmentsTotal;
        private int attempts;
        private java.time.OffsetDateTime lastEventAt;
        private String error;

        public Builder() {
        }

        /**
         * The state of the most recent sync request for the video.
         */
        public Builder setState(VideoSyncState state) {
            this.state = state;
            return this;
        }

        /**
         * The number of video segments copied so far. Null until the edge reports progress, and on a request
that never got that far.
         */
        public Builder setSegmentsDone(Integer segmentsDone) {
            this.segmentsDone = segmentsDone;
            return this;
        }

        /**
         * The number of video segments to be copied. Null until the edge reports progress.
         */
        public Builder setSegmentsTotal(Integer segmentsTotal) {
            this.segmentsTotal = segmentsTotal;
            return this;
        }

        /**
         * The number of times the request has been sent to the edge.
         */
        public Builder setAttempts(int attempts) {
            this.attempts = attempts;
            return this;
        }

        /**
         * The time at which the sync last reported progress. Refreshed by every event, so a stale value on an
active state is the caller's staleness signal. Null when no sync has been requested.
         */
        public Builder setLastEventAt(java.time.OffsetDateTime lastEventAt) {
            this.lastEventAt = lastEventAt;
            return this;
        }

        /**
         * The reason the sync failed, when it did.
         */
        public Builder setError(String error) {
            this.error = error;
            return this;
        }


        public VideoSync build() {
            return new VideoSync(state, segmentsDone, segmentsTotal, attempts, lastEventAt, error);
        }

    }
}
