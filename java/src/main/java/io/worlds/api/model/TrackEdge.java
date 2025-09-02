package io.worlds.api.model;


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
