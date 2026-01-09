package io.worlds.api.model;

import java.util.Objects;

/**
 * The single track from a `searchTrackImages` query.
 */
public class SearchTrackImageResponse implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private Track track;

    public SearchTrackImageResponse() {
    }

    public SearchTrackImageResponse(Track track) {
        this.track = track;
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

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final SearchTrackImageResponse that = (SearchTrackImageResponse) obj;
        return Objects.equals(track, that.track);
    }

    @Override
    public int hashCode() {
        return Objects.hash(track);
    }


    public static SearchTrackImageResponse.Builder builder() {
        return new SearchTrackImageResponse.Builder();
    }

    public static class Builder {

        private Track track;

        public Builder() {
        }

        /**
         * The track matching the search query.
         */
        public Builder setTrack(Track track) {
            this.track = track;
            return this;
        }


        public SearchTrackImageResponse build() {
            return new SearchTrackImageResponse(track);
        }

    }
}
