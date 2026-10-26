package io.worlds.api.model;

import java.util.Objects;

/**
 * Summary statistics for summary chronicle fields, to be read from a `summaryChronicleSummary` or its buckets.
 */
public class SummaryChronicleSummaryStatistics implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private DateTimeDurationSummaryStatistics duration;

    public SummaryChronicleSummaryStatistics() {
    }

    public SummaryChronicleSummaryStatistics(DateTimeDurationSummaryStatistics duration) {
        this.duration = duration;
    }

    /**
     * Summary statistics from the summary chronicles' durations.  Does not include summary chronicles without an end time.  Will be null if none have ended.
     */
    public DateTimeDurationSummaryStatistics getDuration() {
        return duration;
    }
    /**
     * Summary statistics from the summary chronicles' durations.  Does not include summary chronicles without an end time.  Will be null if none have ended.
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
        final SummaryChronicleSummaryStatistics that = (SummaryChronicleSummaryStatistics) obj;
        return Objects.equals(duration, that.duration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(duration);
    }


    public static SummaryChronicleSummaryStatistics.Builder builder() {
        return new SummaryChronicleSummaryStatistics.Builder();
    }

    public static class Builder {

        private DateTimeDurationSummaryStatistics duration;

        public Builder() {
        }

        /**
         * Summary statistics from the summary chronicles' durations.  Does not include summary chronicles without an end time.  Will be null if none have ended.
         */
        public Builder setDuration(DateTimeDurationSummaryStatistics duration) {
            this.duration = duration;
            return this;
        }


        public SummaryChronicleSummaryStatistics build() {
            return new SummaryChronicleSummaryStatistics(duration);
        }

    }
}
