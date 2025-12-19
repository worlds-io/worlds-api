package io.worlds.api.model;

import java.util.Objects;

/**
 * Summary statistics for a `DateTimeDuration` input type.
 */
public class DateTimeDurationSummaryStatistics implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private java.time.Duration min;
    @jakarta.validation.constraints.NotNull
    private java.time.Duration average;
    @jakarta.validation.constraints.NotNull
    private java.time.Duration max;

    public DateTimeDurationSummaryStatistics() {
    }

    public DateTimeDurationSummaryStatistics(java.time.Duration min, java.time.Duration average, java.time.Duration max) {
        this.min = min;
        this.average = average;
        this.max = max;
    }

    /**
     * The minimum duration in the group.
     */
    public java.time.Duration getMin() {
        return min;
    }
    /**
     * The minimum duration in the group.
     */
    public void setMin(java.time.Duration min) {
        this.min = min;
    }

    /**
     * The average duration in the group.
     */
    public java.time.Duration getAverage() {
        return average;
    }
    /**
     * The average duration in the group.
     */
    public void setAverage(java.time.Duration average) {
        this.average = average;
    }

    /**
     * The maximum duration in the group.
     */
    public java.time.Duration getMax() {
        return max;
    }
    /**
     * The maximum duration in the group.
     */
    public void setMax(java.time.Duration max) {
        this.max = max;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final DateTimeDurationSummaryStatistics that = (DateTimeDurationSummaryStatistics) obj;
        return Objects.equals(min, that.min)
            && Objects.equals(average, that.average)
            && Objects.equals(max, that.max);
    }

    @Override
    public int hashCode() {
        return Objects.hash(min, average, max);
    }


    public static DateTimeDurationSummaryStatistics.Builder builder() {
        return new DateTimeDurationSummaryStatistics.Builder();
    }

    public static class Builder {

        private java.time.Duration min;
        private java.time.Duration average;
        private java.time.Duration max;

        public Builder() {
        }

        /**
         * The minimum duration in the group.
         */
        public Builder setMin(java.time.Duration min) {
            this.min = min;
            return this;
        }

        /**
         * The average duration in the group.
         */
        public Builder setAverage(java.time.Duration average) {
            this.average = average;
            return this;
        }

        /**
         * The maximum duration in the group.
         */
        public Builder setMax(java.time.Duration max) {
            this.max = max;
            return this;
        }


        public DateTimeDurationSummaryStatistics build() {
            return new DateTimeDurationSummaryStatistics(min, average, max);
        }

    }
}
