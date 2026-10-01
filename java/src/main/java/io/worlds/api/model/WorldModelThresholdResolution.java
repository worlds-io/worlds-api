package io.worlds.api.model;

import java.util.Objects;

/**
 * The threshold in force for a step attempt and how the attempt measured against it.
 */
public class WorldModelThresholdResolution implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private String ruleId;
    @jakarta.validation.constraints.NotNull
    private String attachedAt;
    private Integer priority;
    private Double nominalSeconds;
    private Double observedSeconds;
    private String verdict;

    public WorldModelThresholdResolution() {
    }

    public WorldModelThresholdResolution(String ruleId, String attachedAt, Integer priority, Double nominalSeconds, Double observedSeconds, String verdict) {
        this.ruleId = ruleId;
        this.attachedAt = attachedAt;
        this.priority = priority;
        this.nominalSeconds = nominalSeconds;
        this.observedSeconds = observedSeconds;
        this.verdict = verdict;
    }

    /**
     * The id of the winning Threshold rule.
     */
    public String getRuleId() {
        return ruleId;
    }
    /**
     * The id of the winning Threshold rule.
     */
    public void setRuleId(String ruleId) {
        this.ruleId = ruleId;
    }

    /**
     * The node the rule is attached at (a zone, site, ...); the most specific attachment wins.
     */
    public String getAttachedAt() {
        return attachedAt;
    }
    /**
     * The node the rule is attached at (a zone, site, ...); the most specific attachment wins.
     */
    public void setAttachedAt(String attachedAt) {
        this.attachedAt = attachedAt;
    }

    /**
     * The rule's priority.
     */
    public Integer getPriority() {
        return priority;
    }
    /**
     * The rule's priority.
     */
    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * The definition's nominal duration, in seconds.
     */
    public Double getNominalSeconds() {
        return nominalSeconds;
    }
    /**
     * The definition's nominal duration, in seconds.
     */
    public void setNominalSeconds(Double nominalSeconds) {
        this.nominalSeconds = nominalSeconds;
    }

    /**
     * The observed duration, in seconds.
     */
    public Double getObservedSeconds() {
        return observedSeconds;
    }
    /**
     * The observed duration, in seconds.
     */
    public void setObservedSeconds(Double observedSeconds) {
        this.observedSeconds = observedSeconds;
    }

    /**
     * `ok`, `warn` or `alert`.
     */
    public String getVerdict() {
        return verdict;
    }
    /**
     * `ok`, `warn` or `alert`.
     */
    public void setVerdict(String verdict) {
        this.verdict = verdict;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final WorldModelThresholdResolution that = (WorldModelThresholdResolution) obj;
        return Objects.equals(ruleId, that.ruleId)
            && Objects.equals(attachedAt, that.attachedAt)
            && Objects.equals(priority, that.priority)
            && Objects.equals(nominalSeconds, that.nominalSeconds)
            && Objects.equals(observedSeconds, that.observedSeconds)
            && Objects.equals(verdict, that.verdict);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ruleId, attachedAt, priority, nominalSeconds, observedSeconds, verdict);
    }


    public static WorldModelThresholdResolution.Builder builder() {
        return new WorldModelThresholdResolution.Builder();
    }

    public static class Builder {

        private String ruleId;
        private String attachedAt;
        private Integer priority;
        private Double nominalSeconds;
        private Double observedSeconds;
        private String verdict;

        public Builder() {
        }

        /**
         * The id of the winning Threshold rule.
         */
        public Builder setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }

        /**
         * The node the rule is attached at (a zone, site, ...); the most specific attachment wins.
         */
        public Builder setAttachedAt(String attachedAt) {
            this.attachedAt = attachedAt;
            return this;
        }

        /**
         * The rule's priority.
         */
        public Builder setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }

        /**
         * The definition's nominal duration, in seconds.
         */
        public Builder setNominalSeconds(Double nominalSeconds) {
            this.nominalSeconds = nominalSeconds;
            return this;
        }

        /**
         * The observed duration, in seconds.
         */
        public Builder setObservedSeconds(Double observedSeconds) {
            this.observedSeconds = observedSeconds;
            return this;
        }

        /**
         * `ok`, `warn` or `alert`.
         */
        public Builder setVerdict(String verdict) {
            this.verdict = verdict;
            return this;
        }


        public WorldModelThresholdResolution build() {
            return new WorldModelThresholdResolution(ruleId, attachedAt, priority, nominalSeconds, observedSeconds, verdict);
        }

    }
}
