package io.worlds.api.model;

import java.util.Objects;

public class TrackEdge implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private Track node;
    @jakarta.validation.constraints.NotNull
    private String cursor;

    public TrackEdge() {
    }

    public TrackEdge(Track node, String cursor) {
        this.node = node;
        this.cursor = cursor;
    }

    /**
     * Information about a particular track.
     */
    public Track getNode() {
        return node;
    }
    /**
     * Information about a particular track.
     */
    public void setNode(Track node) {
        this.node = node;
    }

    /**
     * The cursor to use with the [`tracks` query]({{Queries.tracks}}) `after` argument.
     */
    public String getCursor() {
        return cursor;
    }
    /**
     * The cursor to use with the [`tracks` query]({{Queries.tracks}}) `after` argument.
     */
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final TrackEdge that = (TrackEdge) obj;
        return Objects.equals(node, that.node)
            && Objects.equals(cursor, that.cursor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(node, cursor);
    }


    public static TrackEdge.Builder builder() {
        return new TrackEdge.Builder();
    }

    public static class Builder {

        private Track node;
        private String cursor;

        public Builder() {
        }

        /**
         * Information about a particular track.
         */
        public Builder setNode(Track node) {
            this.node = node;
            return this;
        }

        /**
         * The cursor to use with the [`tracks` query]({{Queries.tracks}}) `after` argument.
         */
        public Builder setCursor(String cursor) {
            this.cursor = cursor;
            return this;
        }


        public TrackEdge build() {
            return new TrackEdge(node, cursor);
        }

    }
}
