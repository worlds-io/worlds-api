package io.worlds.api.model;

import java.util.Objects;

/**
 * Summary statistics for event fields, to be read from an `eventsSummary` or its buckets.
 */
public class EventsSummaryStatistics implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private DateTimeDurationSummaryStatistics duration;
    private TimeRangeCounts counts;

    public EventsSummaryStatistics() {
    }

    public EventsSummaryStatistics(DateTimeDurationSummaryStatistics duration, TimeRangeCounts counts) {
        this.duration = duration;
        this.counts = counts;
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

    /**
     * Counts of events that started or ended within the summary group.
     */
    public TimeRangeCounts getCounts() {
        return counts;
    }
    /**
     * Counts of events that started or ended within the summary group.
     */
    public void setCounts(TimeRangeCounts counts) {
        this.counts = counts;
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
        return Objects.equals(duration, that.duration)
            && Objects.equals(counts, that.counts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(duration, counts);
    }


    public static EventsSummaryStatistics.Builder builder() {
        return new EventsSummaryStatistics.Builder();
    }

    public static class Builder {

        private DateTimeDurationSummaryStatistics duration;
        private TimeRangeCounts counts;

        public Builder() {
        }

        /**
         * Summary statistics from the events' durations.  Does not include unfinished events.  Will be null if no events are finished.
         */
        public Builder setDuration(DateTimeDurationSummaryStatistics duration) {
            this.duration = duration;
            return this;
        }

        /**
         * Counts of events that started or ended within the summary group.
         */
        public Builder setCounts(TimeRangeCounts counts) {
            this.counts = counts;
            return this;
        }


        public EventsSummaryStatistics build() {
            return new EventsSummaryStatistics(duration, counts);
        }

    }
}
