package io.worlds.api.model;

import java.util.Objects;

/**
 * A typed, directed relationship between two [WorldModelNodes]({{Types.WorldModelNode}}).
 */
public class WorldModelEdge implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private String id;
    @jakarta.validation.constraints.NotNull
    private String type;
    @jakarta.validation.constraints.NotNull
    private WorldModelNode from;
    @jakarta.validation.constraints.NotNull
    private WorldModelNode to;
    private java.time.OffsetDateTime validFrom;
    private java.time.OffsetDateTime validTo;
    private Integer priority;
    private java.lang.Object properties;

    public WorldModelEdge() {
    }

    public WorldModelEdge(String id, String type, WorldModelNode from, WorldModelNode to, java.time.OffsetDateTime validFrom, java.time.OffsetDateTime validTo, Integer priority, java.lang.Object properties) {
        this.id = id;
        this.type = type;
        this.from = from;
        this.to = to;
        this.validFrom = validFrom;
        this.validTo = validTo;
        this.priority = priority;
        this.properties = properties;
    }

    /**
     * The edge's identifier.
     */
    public String getId() {
        return id;
    }
    /**
     * The edge's identifier.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * The edge type, e.g. `contains`, `precedes`, `works_on`, `derives_from`.
     */
    public String getType() {
        return type;
    }
    /**
     * The edge type, e.g. `contains`, `precedes`, `works_on`, `derives_from`.
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * The node the edge starts at.
     */
    public WorldModelNode getFrom() {
        return from;
    }
    /**
     * The node the edge starts at.
     */
    public void setFrom(WorldModelNode from) {
        this.from = from;
    }

    /**
     * The node the edge ends at.
     */
    public WorldModelNode getTo() {
        return to;
    }
    /**
     * The node the edge ends at.
     */
    public void setTo(WorldModelNode to) {
        this.to = to;
    }

    /**
     * For edges that hold over an interval (e.g. `scopes`, `installed_in`): when it starts to hold (inclusive).
     */
    public java.time.OffsetDateTime getValidFrom() {
        return validFrom;
    }
    /**
     * For edges that hold over an interval (e.g. `scopes`, `installed_in`): when it starts to hold (inclusive).
     */
    public void setValidFrom(java.time.OffsetDateTime validFrom) {
        this.validFrom = validFrom;
    }

    /**
     * For edges that hold over an interval: when it stops holding (exclusive). Null while it still holds.
     */
    public java.time.OffsetDateTime getValidTo() {
        return validTo;
    }
    /**
     * For edges that hold over an interval: when it stops holding (exclusive). Null while it still holds.
     */
    public void setValidTo(java.time.OffsetDateTime validTo) {
        this.validTo = validTo;
    }

    /**
     * For `scopes` edges: the rule's priority when several apply.
     */
    public Integer getPriority() {
        return priority;
    }
    /**
     * For `scopes` edges: the rule's priority when several apply.
     */
    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * Any further edge properties as a JSON object.
     */
    public java.lang.Object getProperties() {
        return properties;
    }
    /**
     * Any further edge properties as a JSON object.
     */
    public void setProperties(java.lang.Object properties) {
        this.properties = properties;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final WorldModelEdge that = (WorldModelEdge) obj;
        return Objects.equals(id, that.id)
            && Objects.equals(type, that.type)
            && Objects.equals(from, that.from)
            && Objects.equals(to, that.to)
            && Objects.equals(validFrom, that.validFrom)
            && Objects.equals(validTo, that.validTo)
            && Objects.equals(priority, that.priority)
            && Objects.equals(properties, that.properties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, type, from, to, validFrom, validTo, priority, properties);
    }


    public static WorldModelEdge.Builder builder() {
        return new WorldModelEdge.Builder();
    }

    public static class Builder {

        private String id;
        private String type;
        private WorldModelNode from;
        private WorldModelNode to;
        private java.time.OffsetDateTime validFrom;
        private java.time.OffsetDateTime validTo;
        private Integer priority;
        private java.lang.Object properties;

        public Builder() {
        }

        /**
         * The edge's identifier.
         */
        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        /**
         * The edge type, e.g. `contains`, `precedes`, `works_on`, `derives_from`.
         */
        public Builder setType(String type) {
            this.type = type;
            return this;
        }

        /**
         * The node the edge starts at.
         */
        public Builder setFrom(WorldModelNode from) {
            this.from = from;
            return this;
        }

        /**
         * The node the edge ends at.
         */
        public Builder setTo(WorldModelNode to) {
            this.to = to;
            return this;
        }

        /**
         * For edges that hold over an interval (e.g. `scopes`, `installed_in`): when it starts to hold (inclusive).
         */
        public Builder setValidFrom(java.time.OffsetDateTime validFrom) {
            this.validFrom = validFrom;
            return this;
        }

        /**
         * For edges that hold over an interval: when it stops holding (exclusive). Null while it still holds.
         */
        public Builder setValidTo(java.time.OffsetDateTime validTo) {
            this.validTo = validTo;
            return this;
        }

        /**
         * For `scopes` edges: the rule's priority when several apply.
         */
        public Builder setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }

        /**
         * Any further edge properties as a JSON object.
         */
        public Builder setProperties(java.lang.Object properties) {
            this.properties = properties;
            return this;
        }


        public WorldModelEdge build() {
            return new WorldModelEdge(id, type, from, to, validFrom, validTo, priority, properties);
        }

    }
}
