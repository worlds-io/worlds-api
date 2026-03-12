package io.worlds.api.model;

import java.util.Objects;

/**
 * Input to indicate which field(s) to group zone intersections by in a `zoneIntersectionSummary` query.
Any combination of up to three distinct fields may be provided.
If multiple fields are provided, the buckets will be sorted by time, then fields.
 */
public class ZoneIntersectionSummaryBucketType implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private org.springframework.graphql.data.ArgumentValue<SummaryBucketSize> size = org.springframework.graphql.data.ArgumentValue.omitted();
    private java.util.List<ZoneIntersectionSummaryBucketField> fields;

    public ZoneIntersectionSummaryBucketType() {
    }

    public ZoneIntersectionSummaryBucketType(org.springframework.graphql.data.ArgumentValue<SummaryBucketSize> size, java.util.List<ZoneIntersectionSummaryBucketField> fields) {
        this.size = size;
        this.fields = fields;
    }

    public org.springframework.graphql.data.ArgumentValue<SummaryBucketSize> getSize() {
        return size;
    }
    public void setSize(org.springframework.graphql.data.ArgumentValue<SummaryBucketSize> size) {
        this.size = size;
    }

    public java.util.List<ZoneIntersectionSummaryBucketField> getFields() {
        return fields;
    }
    public void setFields(java.util.List<ZoneIntersectionSummaryBucketField> fields) {
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
        final ZoneIntersectionSummaryBucketType that = (ZoneIntersectionSummaryBucketType) obj;
        return Objects.equals(size, that.size)
            && Objects.equals(fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, fields);
    }


    public static ZoneIntersectionSummaryBucketType.Builder builder() {
        return new ZoneIntersectionSummaryBucketType.Builder();
    }

    public static class Builder {

        private org.springframework.graphql.data.ArgumentValue<SummaryBucketSize> size = org.springframework.graphql.data.ArgumentValue.omitted();
        private java.util.List<ZoneIntersectionSummaryBucketField> fields;

        public Builder() {
        }

        public Builder setSize(org.springframework.graphql.data.ArgumentValue<SummaryBucketSize> size) {
            this.size = size;
            return this;
        }

        public Builder setFields(java.util.List<ZoneIntersectionSummaryBucketField> fields) {
            this.fields = fields;
            return this;
        }


        public ZoneIntersectionSummaryBucketType build() {
            return new ZoneIntersectionSummaryBucketType(size, fields);
        }

    }
}
