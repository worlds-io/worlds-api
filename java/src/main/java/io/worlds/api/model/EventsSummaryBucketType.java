package io.worlds.api.model;

import java.util.Objects;

/**
 * Input to indicate which field(s) to group events by in an `eventsSummary` query.
Any combination of up to three distinct fields may be provided.
If multiple fields are provided, the buckets will be sorted by time, then fields.
 */
public class EventsSummaryBucketType implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private org.springframework.graphql.data.ArgumentValue<SummaryBucketSize> size = org.springframework.graphql.data.ArgumentValue.omitted();
    private java.util.List<EventsSummaryBucketField> fields;
    private java.util.List<JSONFieldStringBucket> metadata;

    public EventsSummaryBucketType() {
    }

    public EventsSummaryBucketType(org.springframework.graphql.data.ArgumentValue<SummaryBucketSize> size, java.util.List<EventsSummaryBucketField> fields, java.util.List<JSONFieldStringBucket> metadata) {
        this.size = size;
        this.fields = fields;
        this.metadata = metadata;
    }

    public org.springframework.graphql.data.ArgumentValue<SummaryBucketSize> getSize() {
        return size;
    }
    public void setSize(org.springframework.graphql.data.ArgumentValue<SummaryBucketSize> size) {
        this.size = size;
    }

    public java.util.List<EventsSummaryBucketField> getFields() {
        return fields;
    }
    public void setFields(java.util.List<EventsSummaryBucketField> fields) {
        this.fields = fields;
    }

    public java.util.List<JSONFieldStringBucket> getMetadata() {
        return metadata;
    }
    public void setMetadata(java.util.List<JSONFieldStringBucket> metadata) {
        this.metadata = metadata;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final EventsSummaryBucketType that = (EventsSummaryBucketType) obj;
        return Objects.equals(size, that.size)
            && Objects.equals(fields, that.fields)
            && Objects.equals(metadata, that.metadata);
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, fields, metadata);
    }


    public static EventsSummaryBucketType.Builder builder() {
        return new EventsSummaryBucketType.Builder();
    }

    public static class Builder {

        private org.springframework.graphql.data.ArgumentValue<SummaryBucketSize> size = org.springframework.graphql.data.ArgumentValue.omitted();
        private java.util.List<EventsSummaryBucketField> fields;
        private java.util.List<JSONFieldStringBucket> metadata;

        public Builder() {
        }

        public Builder setSize(org.springframework.graphql.data.ArgumentValue<SummaryBucketSize> size) {
            this.size = size;
            return this;
        }

        public Builder setFields(java.util.List<EventsSummaryBucketField> fields) {
            this.fields = fields;
            return this;
        }

        public Builder setMetadata(java.util.List<JSONFieldStringBucket> metadata) {
            this.metadata = metadata;
            return this;
        }


        public EventsSummaryBucketType build() {
            return new EventsSummaryBucketType(size, fields, metadata);
        }

    }
}
