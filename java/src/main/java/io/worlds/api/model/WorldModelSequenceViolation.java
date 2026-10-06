package io.worlds.api.model;

import java.util.Objects;

/**
 * A step attempt that ran out of the order its process definition allows.
 */
public class WorldModelSequenceViolation implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private String attemptId;
    private String step;
    private java.time.OffsetDateTime startTime;
    private String reason;

    public WorldModelSequenceViolation() {
    }

    public WorldModelSequenceViolation(String attemptId, String step, java.time.OffsetDateTime startTime, String reason) {
        this.attemptId = attemptId;
        this.step = step;
        this.startTime = startTime;
        this.reason = reason;
    }

    /**
     * The id of the offending step attempt.
     */
    public String getAttemptId() {
        return attemptId;
    }
    /**
     * The id of the offending step attempt.
     */
    public void setAttemptId(String attemptId) {
        this.attemptId = attemptId;
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
     * Why it is out of order.
     */
    public String getReason() {
        return reason;
    }
    /**
     * Why it is out of order.
     */
    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final WorldModelSequenceViolation that = (WorldModelSequenceViolation) obj;
        return Objects.equals(attemptId, that.attemptId)
            && Objects.equals(step, that.step)
            && Objects.equals(startTime, that.startTime)
            && Objects.equals(reason, that.reason);
    }

    @Override
    public int hashCode() {
        return Objects.hash(attemptId, step, startTime, reason);
    }


    public static WorldModelSequenceViolation.Builder builder() {
        return new WorldModelSequenceViolation.Builder();
    }

    public static class Builder {

        private String attemptId;
        private String step;
        private java.time.OffsetDateTime startTime;
        private String reason;

        public Builder() {
        }

        /**
         * The id of the offending step attempt.
         */
        public Builder setAttemptId(String attemptId) {
            this.attemptId = attemptId;
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
         * When the attempt started.
         */
        public Builder setStartTime(java.time.OffsetDateTime startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * Why it is out of order.
         */
        public Builder setReason(String reason) {
            this.reason = reason;
            return this;
        }


        public WorldModelSequenceViolation build() {
            return new WorldModelSequenceViolation(attemptId, step, startTime, reason);
        }

    }
}
