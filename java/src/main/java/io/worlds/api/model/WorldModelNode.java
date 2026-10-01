package io.worlds.api.model;

import java.util.Objects;

/**
 * A node of the World Model: one typed thing, such as a step definition, a dock door, a run, or a
deviation found on a run. Its type decides its plane and which properties it carries.
 */
public class WorldModelNode implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private String id;
    @jakarta.validation.constraints.NotNull
    private String type;
    @jakarta.validation.constraints.NotNull
    private WorldModelPlane plane;
    private String label;
    @jakarta.validation.constraints.NotNull
    private java.lang.Object properties;
    @jakarta.validation.constraints.NotNull
    private java.util.List<WorldModelEdge> edges;

    public WorldModelNode() {
    }

    public WorldModelNode(String id, String type, WorldModelPlane plane, String label, java.lang.Object properties, java.util.List<WorldModelEdge> edges) {
        this.id = id;
        this.type = type;
        this.plane = plane;
        this.label = label;
        this.properties = properties;
        this.edges = edges;
    }

    /**
     * The node's stable identifier, e.g. `pdef:trailer-turn@1`. Safe to hold in client code.
     */
    public String getId() {
        return id;
    }
    /**
     * The node's stable identifier, e.g. `pdef:trailer-turn@1`. Safe to hold in client code.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * The node's World Model type, e.g. `ProcessExecution`. Described by [worldModelTypes]({{Queries.worldModelTypes}}).
     */
    public String getType() {
        return type;
    }
    /**
     * The node's World Model type, e.g. `ProcessExecution`. Described by [worldModelTypes]({{Queries.worldModelTypes}}).
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * The plane the node's type belongs to.
     */
    public WorldModelPlane getPlane() {
        return plane;
    }
    /**
     * The plane the node's type belongs to.
     */
    public void setPlane(WorldModelPlane plane) {
        this.plane = plane;
    }

    /**
     * A human-readable name, when the node has one.
     */
    public String getLabel() {
        return label;
    }
    /**
     * A human-readable name, when the node has one.
     */
    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * The node's properties as a JSON object, keyed by property name. Which properties exist is
described by the node's type. Properties marked below the trust boundary are never returned.
     */
    public java.lang.Object getProperties() {
        return properties;
    }
    /**
     * The node's properties as a JSON object, keyed by property name. Which properties exist is
described by the node's type. Properties marked below the trust boundary are never returned.
     */
    public void setProperties(java.lang.Object properties) {
        this.properties = properties;
    }

    /**
     * The node's edges, optionally restricted by direction and edge type.
     */
    public java.util.List<WorldModelEdge> getEdges() {
        return edges;
    }
    /**
     * The node's edges, optionally restricted by direction and edge type.
     */
    public void setEdges(java.util.List<WorldModelEdge> edges) {
        this.edges = edges;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final WorldModelNode that = (WorldModelNode) obj;
        return Objects.equals(id, that.id)
            && Objects.equals(type, that.type)
            && Objects.equals(plane, that.plane)
            && Objects.equals(label, that.label)
            && Objects.equals(properties, that.properties)
            && Objects.equals(edges, that.edges);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, type, plane, label, properties, edges);
    }


    public static WorldModelNode.Builder builder() {
        return new WorldModelNode.Builder();
    }

    public static class Builder {

        private String id;
        private String type;
        private WorldModelPlane plane;
        private String label;
        private java.lang.Object properties;
        private java.util.List<WorldModelEdge> edges;

        public Builder() {
        }

        /**
         * The node's stable identifier, e.g. `pdef:trailer-turn@1`. Safe to hold in client code.
         */
        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        /**
         * The node's World Model type, e.g. `ProcessExecution`. Described by [worldModelTypes]({{Queries.worldModelTypes}}).
         */
        public Builder setType(String type) {
            this.type = type;
            return this;
        }

        /**
         * The plane the node's type belongs to.
         */
        public Builder setPlane(WorldModelPlane plane) {
            this.plane = plane;
            return this;
        }

        /**
         * A human-readable name, when the node has one.
         */
        public Builder setLabel(String label) {
            this.label = label;
            return this;
        }

        /**
         * The node's properties as a JSON object, keyed by property name. Which properties exist is
described by the node's type. Properties marked below the trust boundary are never returned.
         */
        public Builder setProperties(java.lang.Object properties) {
            this.properties = properties;
            return this;
        }

        /**
         * The node's edges, optionally restricted by direction and edge type.
         */
        public Builder setEdges(java.util.List<WorldModelEdge> edges) {
            this.edges = edges;
            return this;
        }


        public WorldModelNode build() {
            return new WorldModelNode(id, type, plane, label, properties, edges);
        }

    }
}
