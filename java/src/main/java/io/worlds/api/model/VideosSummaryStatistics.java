package io.worlds.api.model;

import java.util.Objects;

/**
 * Summary statistics for video fields, to be read from an `videosSummary` or its buckets.
 */
public class VideosSummaryStatistics implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private DateTimeDurationSummaryStatistics duration;

    public VideosSummaryStatistics() {
    }

    public VideosSummaryStatistics(DateTimeDurationSummaryStatistics duration) {
        this.duration = duration;
    }

    /**
     * Summary statistics from the videos' durations.
     */
    public DateTimeDurationSummaryStatistics getDuration() {
        return duration;
    }
    /**
     * Summary statistics from the videos' durations.
     */
    public void setDuration(DateTimeDurationSummaryStatistics duration) {
        this.duration = duration;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final VideosSummaryStatistics that = (VideosSummaryStatistics) obj;
        return Objects.equals(duration, that.duration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(duration);
    }


    public static VideosSummaryStatistics.Builder builder() {
        return new VideosSummaryStatistics.Builder();
    }

    public static class Builder {

        private DateTimeDurationSummaryStatistics duration;

        public Builder() {
        }

        /**
         * Summary statistics from the videos' durations.
         */
        public Builder setDuration(DateTimeDurationSummaryStatistics duration) {
            this.duration = duration;
            return this;
        }


        public VideosSummaryStatistics build() {
            return new VideosSummaryStatistics(duration);
        }

    }
}
