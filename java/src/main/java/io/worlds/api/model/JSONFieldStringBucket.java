package io.worlds.api.model;

import java.util.Objects;

/**
 * Request to bucket by string data at a specified JSON path.
If no data exists at the path, it will be treated as null.
 */
public class JSONFieldStringBucket implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private java.util.List<String> path;

    public JSONFieldStringBucket() {
    }

    public JSONFieldStringBucket(java.util.List<String> path) {
        this.path = path;
    }

    public java.util.List<String> getPath() {
        return path;
    }
    public void setPath(java.util.List<String> path) {
        this.path = path;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final JSONFieldStringBucket that = (JSONFieldStringBucket) obj;
        return Objects.equals(path, that.path);
    }

    @Override
    public int hashCode() {
        return Objects.hash(path);
    }


    public static JSONFieldStringBucket.Builder builder() {
        return new JSONFieldStringBucket.Builder();
    }

    public static class Builder {

        private java.util.List<String> path;

        public Builder() {
        }

        public Builder setPath(java.util.List<String> path) {
            this.path = path;
            return this;
        }


        public JSONFieldStringBucket build() {
            return new JSONFieldStringBucket(path);
        }

    }
}
