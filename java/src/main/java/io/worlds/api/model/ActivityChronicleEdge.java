package io.worlds.api.model;

import java.util.Objects;

/**
 * An activity edge is the pairing of an [Activity]({{Types.Activity}}) with its query cursor.
See [about queries](/guides/types/#queries) for details on how "connection" and "edge" types are used with pagination.
 */
public class ActivityChronicleEdge implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private ActivityChronicle node;
    @jakarta.validation.constraints.NotNull
    private String cursor;

    public ActivityChronicleEdge() {
    }

    public ActivityChronicleEdge(ActivityChronicle node, String cursor) {
        this.node = node;
        this.cursor = cursor;
    }

    /**
     * Information about a particular [Activity]({{Types.Activity}}).
     */
    public ActivityChronicle getNode() {
        return node;
    }
    /**
     * Information about a particular [Activity]({{Types.Activity}}).
     */
    public void setNode(ActivityChronicle node) {
        this.node = node;
    }

    /**
     * The cursor to use with the [Query `activities` field]({{Queries.activityChronicles}}) `after` argument.
     */
    public String getCursor() {
        return cursor;
    }
    /**
     * The cursor to use with the [Query `activities` field]({{Queries.activityChronicles}}) `after` argument.
     */
    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final ActivityChronicleEdge that = (ActivityChronicleEdge) obj;
        return Objects.equals(node, that.node)
            && Objects.equals(cursor, that.cursor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(node, cursor);
    }


    public static ActivityChronicleEdge.Builder builder() {
        return new ActivityChronicleEdge.Builder();
    }

    public static class Builder {

        private ActivityChronicle node;
        private String cursor;

        public Builder() {
        }

        /**
         * Information about a particular [Activity]({{Types.Activity}}).
         */
        public Builder setNode(ActivityChronicle node) {
            this.node = node;
            return this;
        }

        /**
         * The cursor to use with the [Query `activities` field]({{Queries.activityChronicles}}) `after` argument.
         */
        public Builder setCursor(String cursor) {
            this.cursor = cursor;
            return this;
        }


        public ActivityChronicleEdge build() {
            return new ActivityChronicleEdge(node, cursor);
        }

    }
}
