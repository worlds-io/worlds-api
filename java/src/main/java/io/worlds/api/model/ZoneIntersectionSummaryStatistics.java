package io.worlds.api.model;

import java.util.Objects;

/**
 * Summary statistics for zone intersection fields, to be read from a `zoneIntersectionSummary` or its buckets.
 */
public class ZoneIntersectionSummaryStatistics implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private DateTimeDurationSummaryStatistics duration;

    public ZoneIntersectionSummaryStatistics() {
    }

    public ZoneIntersectionSummaryStatistics(DateTimeDurationSummaryStatistics duration) {
        this.duration = duration;
    }

    /**
     * Summary statistics from the zone intersections' durations.  Does not include unfinished intersections.  Will be null if no intersections are finished.
     */
    public DateTimeDurationSummaryStatistics getDuration() {
        return duration;
    }
    /**
     * Summary statistics from the zone intersections' durations.  Does not include unfinished intersections.  Will be null if no intersections are finished.
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
        final ZoneIntersectionSummaryStatistics that = (ZoneIntersectionSummaryStatistics) obj;
        return Objects.equals(duration, that.duration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(duration);
    }


    public static ZoneIntersectionSummaryStatistics.Builder builder() {
        return new ZoneIntersectionSummaryStatistics.Builder();
    }

    public static class Builder {

        private DateTimeDurationSummaryStatistics duration;

        public Builder() {
        }

        /**
         * Summary statistics from the zone intersections' durations.  Does not include unfinished intersections.  Will be null if no intersections are finished.
         */
        public Builder setDuration(DateTimeDurationSummaryStatistics duration) {
            this.duration = duration;
            return this;
        }


        public ZoneIntersectionSummaryStatistics build() {
            return new ZoneIntersectionSummaryStatistics(duration);
        }

    }
}
