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

    public EventsSummaryBucketType() {
    }

    public EventsSummaryBucketType(org.springframework.graphql.data.ArgumentValue<SummaryBucketSize> size, java.util.List<EventsSummaryBucketField> fields) {
        this.size = size;
        this.fields = fields;
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
            && Objects.equals(fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, fields);
    }


    public static EventsSummaryBucketType.Builder builder() {
        return new EventsSummaryBucketType.Builder();
    }

    public static class Builder {

        private org.springframework.graphql.data.ArgumentValue<SummaryBucketSize> size = org.springframework.graphql.data.ArgumentValue.omitted();
        private java.util.List<EventsSummaryBucketField> fields;

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


        public EventsSummaryBucketType build() {
            return new EventsSummaryBucketType(size, fields);
        }

    }
}
