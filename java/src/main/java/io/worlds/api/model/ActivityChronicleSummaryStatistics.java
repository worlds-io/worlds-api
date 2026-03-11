package io.worlds.api.model;

import java.util.Objects;

/**
 * Summary statistics for activity chronicle fields, to be read from an `activityChronicleSummary` or its buckets.
 */
public class ActivityChronicleSummaryStatistics implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private DateTimeDurationSummaryStatistics duration;

    public ActivityChronicleSummaryStatistics() {
    }

    public ActivityChronicleSummaryStatistics(DateTimeDurationSummaryStatistics duration) {
        this.duration = duration;
    }

    /**
     * Summary statistics from the activity chronicles' durations.  Does not include unfinished activities.  Will be null if no activities are finished.
     */
    public DateTimeDurationSummaryStatistics getDuration() {
        return duration;
    }
    /**
     * Summary statistics from the activity chronicles' durations.  Does not include unfinished activities.  Will be null if no activities are finished.
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
        final ActivityChronicleSummaryStatistics that = (ActivityChronicleSummaryStatistics) obj;
        return Objects.equals(duration, that.duration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(duration);
    }


    public static ActivityChronicleSummaryStatistics.Builder builder() {
        return new ActivityChronicleSummaryStatistics.Builder();
    }

    public static class Builder {

        private DateTimeDurationSummaryStatistics duration;

        public Builder() {
        }

        /**
         * Summary statistics from the activity chronicles' durations.  Does not include unfinished activities.  Will be null if no activities are finished.
         */
        public Builder setDuration(DateTimeDurationSummaryStatistics duration) {
            this.duration = duration;
            return this;
        }


        public ActivityChronicleSummaryStatistics build() {
            return new ActivityChronicleSummaryStatistics(duration);
        }

    }
}
