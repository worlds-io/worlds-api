package io.worlds.api.model;

import java.util.Objects;

/**
 * A World Model node type, with the properties its nodes may carry.
 */
public class WorldModelType implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private String name;
    @jakarta.validation.constraints.NotNull
    private WorldModelPlane plane;
    private String description;
    @jakarta.validation.constraints.NotNull
    private java.util.List<WorldModelTypeProperty> properties;

    public WorldModelType() {
    }

    public WorldModelType(String name, WorldModelPlane plane, String description, java.util.List<WorldModelTypeProperty> properties) {
        this.name = name;
        this.plane = plane;
        this.description = description;
        this.properties = properties;
    }

    /**
     * The type's name, e.g. `StepDef`.
     */
    public String getName() {
        return name;
    }
    /**
     * The type's name, e.g. `StepDef`.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * The plane the type belongs to.
     */
    public WorldModelPlane getPlane() {
        return plane;
    }
    /**
     * The plane the type belongs to.
     */
    public void setPlane(WorldModelPlane plane) {
        this.plane = plane;
    }

    /**
     * What the type means, when the ontology provides a description.
     */
    public String getDescription() {
        return description;
    }
    /**
     * What the type means, when the ontology provides a description.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * The properties nodes of this type may carry. Properties below the trust boundary are omitted.
     */
    public java.util.List<WorldModelTypeProperty> getProperties() {
        return properties;
    }
    /**
     * The properties nodes of this type may carry. Properties below the trust boundary are omitted.
     */
    public void setProperties(java.util.List<WorldModelTypeProperty> properties) {
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
        final WorldModelType that = (WorldModelType) obj;
        return Objects.equals(name, that.name)
            && Objects.equals(plane, that.plane)
            && Objects.equals(description, that.description)
            && Objects.equals(properties, that.properties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, plane, description, properties);
    }


    public static WorldModelType.Builder builder() {
        return new WorldModelType.Builder();
    }

    public static class Builder {

        private String name;
        private WorldModelPlane plane;
        private String description;
        private java.util.List<WorldModelTypeProperty> properties;

        public Builder() {
        }

        /**
         * The type's name, e.g. `StepDef`.
         */
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        /**
         * The plane the type belongs to.
         */
        public Builder setPlane(WorldModelPlane plane) {
            this.plane = plane;
            return this;
        }

        /**
         * What the type means, when the ontology provides a description.
         */
        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        /**
         * The properties nodes of this type may carry. Properties below the trust boundary are omitted.
         */
        public Builder setProperties(java.util.List<WorldModelTypeProperty> properties) {
            this.properties = properties;
            return this;
        }


        public WorldModelType build() {
            return new WorldModelType(name, plane, description, properties);
        }

    }
}
