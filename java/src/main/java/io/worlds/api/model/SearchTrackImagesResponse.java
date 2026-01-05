package io.worlds.api.model;

import java.util.Objects;

/**
 * The response from a `searchTrackImages` query.
 */
public class SearchTrackImagesResponse implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private java.util.List<SearchTrackImageResponse> tracks;

    public SearchTrackImagesResponse() {
    }

    public SearchTrackImagesResponse(java.util.List<SearchTrackImageResponse> tracks) {
        this.tracks = tracks;
    }

    /**
     * The tracks matching the search query.
     */
    public java.util.List<SearchTrackImageResponse> getTracks() {
        return tracks;
    }
    /**
     * The tracks matching the search query.
     */
    public void setTracks(java.util.List<SearchTrackImageResponse> tracks) {
        this.tracks = tracks;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final SearchTrackImagesResponse that = (SearchTrackImagesResponse) obj;
        return Objects.equals(tracks, that.tracks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tracks);
    }


    public static SearchTrackImagesResponse.Builder builder() {
        return new SearchTrackImagesResponse.Builder();
    }

    public static class Builder {

        private java.util.List<SearchTrackImageResponse> tracks;

        public Builder() {
        }

        /**
         * The tracks matching the search query.
         */
        public Builder setTracks(java.util.List<SearchTrackImageResponse> tracks) {
            this.tracks = tracks;
            return this;
        }


        public SearchTrackImagesResponse build() {
            return new SearchTrackImagesResponse(tracks);
        }

    }
}
