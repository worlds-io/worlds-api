package io.worlds.api.model;

import java.util.Objects;

/**
 * Tags are descriptive labels used to classify and group both detections and training data for models.
 */
public class Tag implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private String id;
    @jakarta.validation.constraints.NotNull
    private String name;
    private String color;

    public Tag() {
    }

    public Tag(String id, String name, String color) {
        this.id = id;
        this.name = name;
        this.color = color;
    }

    /**
     * The unique identifier for a tag.
     */
    public String getId() {
        return id;
    }
    /**
     * The unique identifier for a tag.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * The name of the tag. The name is not case-sensitive, and this field will always return as lowercase.
     */
    public String getName() {
        return name;
    }
    /**
     * The name of the tag. The name is not case-sensitive, and this field will always return as lowercase.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * The bounding box color used for detections of this tag type.
     */
    public String getColor() {
        return color;
    }
    /**
     * The bounding box color used for detections of this tag type.
     */
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final Tag that = (Tag) obj;
        return Objects.equals(id, that.id)
            && Objects.equals(name, that.name)
            && Objects.equals(color, that.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, color);
    }


    public static Tag.Builder builder() {
        return new Tag.Builder();
    }

    public static class Builder {

        private String id;
        private String name;
        private String color;

        public Builder() {
        }

        /**
         * The unique identifier for a tag.
         */
        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        /**
         * The name of the tag. The name is not case-sensitive, and this field will always return as lowercase.
         */
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        /**
         * The bounding box color used for detections of this tag type.
         */
        public Builder setColor(String color) {
            this.color = color;
            return this;
        }


        public Tag build() {
            return new Tag(id, name, color);
        }

    }
}
