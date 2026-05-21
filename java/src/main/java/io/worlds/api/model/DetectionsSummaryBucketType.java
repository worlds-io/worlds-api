package io.worlds.api.model;

import java.util.Objects;

/**
 * Input to indicate which field(s) to group detections by in a `detectionsSummary` query.
Any combination of up to three distinct fields may be provided.
If multiple fields are provided, the buckets will be sorted by time, then fields.
 */
public class DetectionsSummaryBucketType implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private org.springframework.graphql.data.ArgumentValue<SummaryBucketSize> size = org.springframework.graphql.data.ArgumentValue.omitted();
    private java.util.List<DetectionsSummaryBucketField> fields;

    public DetectionsSummaryBucketType() {
    }

    public DetectionsSummaryBucketType(org.springframework.graphql.data.ArgumentValue<SummaryBucketSize> size, java.util.List<DetectionsSummaryBucketField> fields) {
        this.size = size;
        this.fields = fields;
    }

    public org.springframework.graphql.data.ArgumentValue<SummaryBucketSize> getSize() {
        return size;
    }
    public void setSize(org.springframework.graphql.data.ArgumentValue<SummaryBucketSize> size) {
        this.size = size;
    }

    public java.util.List<DetectionsSummaryBucketField> getFields() {
        return fields;
    }
    public void setFields(java.util.List<DetectionsSummaryBucketField> fields) {
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
        final DetectionsSummaryBucketType that = (DetectionsSummaryBucketType) obj;
        return Objects.equals(size, that.size)
            && Objects.equals(fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, fields);
    }


    public static DetectionsSummaryBucketType.Builder builder() {
        return new DetectionsSummaryBucketType.Builder();
    }

    public static class Builder {

        private org.springframework.graphql.data.ArgumentValue<SummaryBucketSize> size = org.springframework.graphql.data.ArgumentValue.omitted();
        private java.util.List<DetectionsSummaryBucketField> fields;

        public Builder() {
        }

        public Builder setSize(org.springframework.graphql.data.ArgumentValue<SummaryBucketSize> size) {
            this.size = size;
            return this;
        }

        public Builder setFields(java.util.List<DetectionsSummaryBucketField> fields) {
            this.fields = fields;
            return this;
        }


        public DetectionsSummaryBucketType build() {
            return new DetectionsSummaryBucketType(size, fields);
        }

    }
}
