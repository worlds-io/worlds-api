package io.worlds.api.model;

import java.util.Objects;

/**
 * One property of a WorldModelType.
 */
public class WorldModelTypeProperty implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private String name;
    @jakarta.validation.constraints.NotNull
    private String dataType;
    private boolean required;
    private java.util.List<String> enumValues;
    private String description;

    public WorldModelTypeProperty() {
    }

    public WorldModelTypeProperty(String name, String dataType, boolean required, java.util.List<String> enumValues, String description) {
        this.name = name;
        this.dataType = dataType;
        this.required = required;
        this.enumValues = enumValues;
        this.description = description;
    }

    /**
     * The property name, as used in a node's `properties` object.
     */
    public String getName() {
        return name;
    }
    /**
     * The property name, as used in a node's `properties` object.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * The property's data type, e.g. `string`, `timestamp`, `enum`, `node_ref`, `json`.
     */
    public String getDataType() {
        return dataType;
    }
    /**
     * The property's data type, e.g. `string`, `timestamp`, `enum`, `node_ref`, `json`.
     */
    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    /**
     * Whether every node of the type carries the property.
     */
    public boolean getRequired() {
        return required;
    }
    /**
     * Whether every node of the type carries the property.
     */
    public void setRequired(boolean required) {
        this.required = required;
    }

    /**
     * For enum properties: the allowed values.
     */
    public java.util.List<String> getEnumValues() {
        return enumValues;
    }
    /**
     * For enum properties: the allowed values.
     */
    public void setEnumValues(java.util.List<String> enumValues) {
        this.enumValues = enumValues;
    }

    /**
     * What the property means.
     */
    public String getDescription() {
        return description;
    }
    /**
     * What the property means.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final WorldModelTypeProperty that = (WorldModelTypeProperty) obj;
        return Objects.equals(name, that.name)
            && Objects.equals(dataType, that.dataType)
            && Objects.equals(required, that.required)
            && Objects.equals(enumValues, that.enumValues)
            && Objects.equals(description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, dataType, required, enumValues, description);
    }


    public static WorldModelTypeProperty.Builder builder() {
        return new WorldModelTypeProperty.Builder();
    }

    public static class Builder {

        private String name;
        private String dataType;
        private boolean required;
        private java.util.List<String> enumValues;
        private String description;

        public Builder() {
        }

        /**
         * The property name, as used in a node's `properties` object.
         */
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        /**
         * The property's data type, e.g. `string`, `timestamp`, `enum`, `node_ref`, `json`.
         */
        public Builder setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }

        /**
         * Whether every node of the type carries the property.
         */
        public Builder setRequired(boolean required) {
            this.required = required;
            return this;
        }

        /**
         * For enum properties: the allowed values.
         */
        public Builder setEnumValues(java.util.List<String> enumValues) {
            this.enumValues = enumValues;
            return this;
        }

        /**
         * What the property means.
         */
        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }


        public WorldModelTypeProperty build() {
            return new WorldModelTypeProperty(name, dataType, required, enumValues, description);
        }

    }
}
