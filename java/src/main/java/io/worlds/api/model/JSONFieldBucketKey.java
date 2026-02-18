package io.worlds.api.model;

import java.util.Objects;

/**
 * A bucket key for a JSON string value.
 */
public class JSONFieldBucketKey implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private java.util.List<String> path;
    private String string;

    public JSONFieldBucketKey() {
    }

    public JSONFieldBucketKey(java.util.List<String> path, String string) {
        this.path = path;
        this.string = string;
    }

    /**
     * The path to the bucketed metadata field.
     */
    public java.util.List<String> getPath() {
        return path;
    }
    /**
     * The path to the bucketed metadata field.
     */
    public void setPath(java.util.List<String> path) {
        this.path = path;
    }

    /**
     * The string value of the path.
     */
    public String getString() {
        return string;
    }
    /**
     * The string value of the path.
     */
    public void setString(String string) {
        this.string = string;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final JSONFieldBucketKey that = (JSONFieldBucketKey) obj;
        return Objects.equals(path, that.path)
            && Objects.equals(string, that.string);
    }

    @Override
    public int hashCode() {
        return Objects.hash(path, string);
    }


    public static JSONFieldBucketKey.Builder builder() {
        return new JSONFieldBucketKey.Builder();
    }

    public static class Builder {

        private java.util.List<String> path;
        private String string;

        public Builder() {
        }

        /**
         * The path to the bucketed metadata field.
         */
        public Builder setPath(java.util.List<String> path) {
            this.path = path;
            return this;
        }

        /**
         * The string value of the path.
         */
        public Builder setString(String string) {
            this.string = string;
            return this;
        }


        public JSONFieldBucketKey build() {
            return new JSONFieldBucketKey(path, string);
        }

    }
}
