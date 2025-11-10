package io.worlds.api.model;

import java.util.Objects;

public class TracksCountByTag implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private String tag;
    private int count;

    public TracksCountByTag() {
    }

    public TracksCountByTag(String tag, int count) {
        this.tag = tag;
        this.count = count;
    }

    /**
     * The name of the [tag]({{Types.Tag}}).
     */
    public String getTag() {
        return tag;
    }
    /**
     * The name of the [tag]({{Types.Tag}}).
     */
    public void setTag(String tag) {
        this.tag = tag;
    }

    /**
     * The total count of [Tracks]({{Types.Track}}) within the time range with a matching tag.
     */
    public int getCount() {
        return count;
    }
    /**
     * The total count of [Tracks]({{Types.Track}}) within the time range with a matching tag.
     */
    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final TracksCountByTag that = (TracksCountByTag) obj;
        return Objects.equals(tag, that.tag)
            && Objects.equals(count, that.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tag, count);
    }


    public static TracksCountByTag.Builder builder() {
        return new TracksCountByTag.Builder();
    }

    public static class Builder {

        private String tag;
        private int count;

        public Builder() {
        }

        /**
         * The name of the [tag]({{Types.Tag}}).
         */
        public Builder setTag(String tag) {
            this.tag = tag;
            return this;
        }

        /**
         * The total count of [Tracks]({{Types.Track}}) within the time range with a matching tag.
         */
        public Builder setCount(int count) {
            this.count = count;
            return this;
        }


        public TracksCountByTag build() {
            return new TracksCountByTag(tag, count);
        }

    }
}
