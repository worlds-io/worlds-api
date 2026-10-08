package io.worlds.api.model;

import java.util.Objects;

/**
 * One step attempt in a run's timeline, as returned by [worldModelRunTimeline]({{Queries.worldModelRunTimeline}}).
 */
public class WorldModelTimelineEntry implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private java.time.OffsetDateTime startTime;
    private String step;
    private Integer attempt;
    private String outcome;
    private java.time.Duration duration;
    private java.time.Duration waitBefore;
    private String place;

    public WorldModelTimelineEntry() {
    }

    public WorldModelTimelineEntry(java.time.OffsetDateTime startTime, String step, Integer attempt, String outcome, java.time.Duration duration, java.time.Duration waitBefore, String place) {
        this.startTime = startTime;
        this.step = step;
        this.attempt = attempt;
        this.outcome = outcome;
        this.duration = duration;
        this.waitBefore = waitBefore;
        this.place = place;
    }

    /**
     * When the attempt started.
     */
    public java.time.OffsetDateTime getStartTime() {
        return startTime;
    }
    /**
     * When the attempt started.
     */
    public void setStartTime(java.time.OffsetDateTime startTime) {
        this.startTime = startTime;
    }

    /**
     * The step's name.
     */
    public String getStep() {
        return step;
    }
    /**
     * The step's name.
     */
    public void setStep(String step) {
        this.step = step;
    }

    /**
     * The attempt number (1 for the first try; higher after rework).
     */
    public Integer getAttempt() {
        return attempt;
    }
    /**
     * The attempt number (1 for the first try; higher after rework).
     */
    public void setAttempt(Integer attempt) {
        this.attempt = attempt;
    }

    /**
     * The attempt's outcome, if recorded.
     */
    public String getOutcome() {
        return outcome;
    }
    /**
     * The attempt's outcome, if recorded.
     */
    public void setOutcome(String outcome) {
        this.outcome = outcome;
    }

    /**
     * How long the attempt took.
     */
    public java.time.Duration getDuration() {
        return duration;
    }
    /**
     * How long the attempt took.
     */
    public void setDuration(java.time.Duration duration) {
        this.duration = duration;
    }

    /**
     * The wait between the previous attempt's end and this one's start. Null for the first attempt;
negative when attempts overlap.
     */
    public java.time.Duration getWaitBefore() {
        return waitBefore;
    }
    /**
     * The wait between the previous attempt's end and this one's start. Null for the first attempt;
negative when attempts overlap.
     */
    public void setWaitBefore(java.time.Duration waitBefore) {
        this.waitBefore = waitBefore;
    }

    /**
     * Where the attempt happened.
     */
    public String getPlace() {
        return place;
    }
    /**
     * Where the attempt happened.
     */
    public void setPlace(String place) {
        this.place = place;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final WorldModelTimelineEntry that = (WorldModelTimelineEntry) obj;
        return Objects.equals(startTime, that.startTime)
            && Objects.equals(step, that.step)
            && Objects.equals(attempt, that.attempt)
            && Objects.equals(outcome, that.outcome)
            && Objects.equals(duration, that.duration)
            && Objects.equals(waitBefore, that.waitBefore)
            && Objects.equals(place, that.place);
    }

    @Override
    public int hashCode() {
        return Objects.hash(startTime, step, attempt, outcome, duration, waitBefore, place);
    }


    public static WorldModelTimelineEntry.Builder builder() {
        return new WorldModelTimelineEntry.Builder();
    }

    public static class Builder {

        private java.time.OffsetDateTime startTime;
        private String step;
        private Integer attempt;
        private String outcome;
        private java.time.Duration duration;
        private java.time.Duration waitBefore;
        private String place;

        public Builder() {
        }

        /**
         * When the attempt started.
         */
        public Builder setStartTime(java.time.OffsetDateTime startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * The step's name.
         */
        public Builder setStep(String step) {
            this.step = step;
            return this;
        }

        /**
         * The attempt number (1 for the first try; higher after rework).
         */
        public Builder setAttempt(Integer attempt) {
            this.attempt = attempt;
            return this;
        }

        /**
         * The attempt's outcome, if recorded.
         */
        public Builder setOutcome(String outcome) {
            this.outcome = outcome;
            return this;
        }

        /**
         * How long the attempt took.
         */
        public Builder setDuration(java.time.Duration duration) {
            this.duration = duration;
            return this;
        }

        /**
         * The wait between the previous attempt's end and this one's start. Null for the first attempt;
negative when attempts overlap.
         */
        public Builder setWaitBefore(java.time.Duration waitBefore) {
            this.waitBefore = waitBefore;
            return this;
        }

        /**
         * Where the attempt happened.
         */
        public Builder setPlace(String place) {
            this.place = place;
            return this;
        }


        public WorldModelTimelineEntry build() {
            return new WorldModelTimelineEntry(startTime, step, attempt, outcome, duration, waitBefore, place);
        }

    }
}
