package io.worlds.api.model;

import java.util.Objects;

/**
 * A pattern match or analyst link that involves a node, as returned by worldModelAssociations.
 */
public class WorldModelAssociationSummary implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private WorldModelNode association;
    private String kind;
    private String severity;
    private String origin;
    private String patternId;

    public WorldModelAssociationSummary() {
    }

    public WorldModelAssociationSummary(WorldModelNode association, String kind, String severity, String origin, String patternId) {
        this.association = association;
        this.kind = kind;
        this.severity = severity;
        this.origin = origin;
        this.patternId = patternId;
    }

    /**
     * The Association node.
     */
    public WorldModelNode getAssociation() {
        return association;
    }
    /**
     * The Association node.
     */
    public void setAssociation(WorldModelNode association) {
        this.association = association;
    }

    /**
     * The kind of association, e.g. `repeated_occurrence`, `dwell`, `co_presence`.
     */
    public String getKind() {
        return kind;
    }
    /**
     * The kind of association, e.g. `repeated_occurrence`, `dwell`, `co_presence`.
     */
    public void setKind(String kind) {
        this.kind = kind;
    }

    /**
     * `info`, `warn`, `alert` or `critical`.
     */
    public String getSeverity() {
        return severity;
    }
    /**
     * `info`, `warn`, `alert` or `critical`.
     */
    public void setSeverity(String severity) {
        this.severity = severity;
    }

    /**
     * `pattern` (raised by a pattern engine) or `analyst` (drawn by a person in a role).
     */
    public String getOrigin() {
        return origin;
    }
    /**
     * `pattern` (raised by a pattern engine) or `analyst` (drawn by a person in a role).
     */
    public void setOrigin(String origin) {
        this.origin = origin;
    }

    /**
     * The id of the PatternDef matched, for pattern-origin associations.
     */
    public String getPatternId() {
        return patternId;
    }
    /**
     * The id of the PatternDef matched, for pattern-origin associations.
     */
    public void setPatternId(String patternId) {
        this.patternId = patternId;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final WorldModelAssociationSummary that = (WorldModelAssociationSummary) obj;
        return Objects.equals(association, that.association)
            && Objects.equals(kind, that.kind)
            && Objects.equals(severity, that.severity)
            && Objects.equals(origin, that.origin)
            && Objects.equals(patternId, that.patternId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(association, kind, severity, origin, patternId);
    }


    public static WorldModelAssociationSummary.Builder builder() {
        return new WorldModelAssociationSummary.Builder();
    }

    public static class Builder {

        private WorldModelNode association;
        private String kind;
        private String severity;
        private String origin;
        private String patternId;

        public Builder() {
        }

        /**
         * The Association node.
         */
        public Builder setAssociation(WorldModelNode association) {
            this.association = association;
            return this;
        }

        /**
         * The kind of association, e.g. `repeated_occurrence`, `dwell`, `co_presence`.
         */
        public Builder setKind(String kind) {
            this.kind = kind;
            return this;
        }

        /**
         * `info`, `warn`, `alert` or `critical`.
         */
        public Builder setSeverity(String severity) {
            this.severity = severity;
            return this;
        }

        /**
         * `pattern` (raised by a pattern engine) or `analyst` (drawn by a person in a role).
         */
        public Builder setOrigin(String origin) {
            this.origin = origin;
            return this;
        }

        /**
         * The id of the PatternDef matched, for pattern-origin associations.
         */
        public Builder setPatternId(String patternId) {
            this.patternId = patternId;
            return this;
        }


        public WorldModelAssociationSummary build() {
            return new WorldModelAssociationSummary(association, kind, severity, origin, patternId);
        }

    }
}
