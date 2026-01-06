package io.worlds.api.model;

import java.util.Objects;

/**
 * Summary statistics for event fields, to be read from an `eventsSummary` or its buckets.
 */
public class EventsSummaryStatistics implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private DateTimeDurationSummaryStatistics duration;

    public EventsSummaryStatistics() {
    }

    public EventsSummaryStatistics(DateTimeDurationSummaryStatistics duration) {
        this.duration = duration;
    }

    /**
     * Summary statistics from the events' durations.  Does not include unfinished events.  Will be null if no events are finished.
     */
    public DateTimeDurationSummaryStatistics getDuration() {
        return duration;
    }
    /**
     * Summary statistics from the events' durations.  Does not include unfinished events.  Will be null if no events are finished.
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
        final EventsSummaryStatistics that = (EventsSummaryStatistics) obj;
        return Objects.equals(duration, that.duration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(duration);
    }


    public static EventsSummaryStatistics.Builder builder() {
        return new EventsSummaryStatistics.Builder();
    }

    public static class Builder {

        private DateTimeDurationSummaryStatistics duration;

        public Builder() {
        }

        /**
         * Summary statistics from the events' durations.  Does not include unfinished events.  Will be null if no events are finished.
         */
        public Builder setDuration(DateTimeDurationSummaryStatistics duration) {
            this.duration = duration;
            return this;
        }


        public EventsSummaryStatistics build() {
            return new EventsSummaryStatistics(duration);
        }

    }
}
