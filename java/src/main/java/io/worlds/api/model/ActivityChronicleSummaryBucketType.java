package io.worlds.api.model;

import java.util.Objects;

/**
 * Input to indicate which field(s) to group activity chronicles by in an `activityChronicleSummary` query.
Any combination of up to three distinct fields may be provided.
If multiple fields are provided, the buckets will be sorted by time, then fields.
 */
public class ActivityChronicleSummaryBucketType implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private org.springframework.graphql.data.ArgumentValue<SummaryBucketSize> size = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<BucketingStrategy> bucketingStrategy = org.springframework.graphql.data.ArgumentValue.omitted();
    private java.util.List<ActivityChronicleSummaryBucketField> fields;
    private java.util.List<JSONFieldStringBucket> metadata;

    public ActivityChronicleSummaryBucketType() {
    }

    public ActivityChronicleSummaryBucketType(org.springframework.graphql.data.ArgumentValue<SummaryBucketSize> size, org.springframework.graphql.data.ArgumentValue<BucketingStrategy> bucketingStrategy, java.util.List<ActivityChronicleSummaryBucketField> fields, java.util.List<JSONFieldStringBucket> metadata) {
        this.size = size;
        this.bucketingStrategy = bucketingStrategy;
        this.fields = fields;
        this.metadata = metadata;
    }

    public org.springframework.graphql.data.ArgumentValue<SummaryBucketSize> getSize() {
        return size;
    }
    public void setSize(org.springframework.graphql.data.ArgumentValue<SummaryBucketSize> size) {
        this.size = size;
    }

    public org.springframework.graphql.data.ArgumentValue<BucketingStrategy> getBucketingStrategy() {
        return bucketingStrategy;
    }
    public void setBucketingStrategy(org.springframework.graphql.data.ArgumentValue<BucketingStrategy> bucketingStrategy) {
        this.bucketingStrategy = bucketingStrategy;
    }

    public java.util.List<ActivityChronicleSummaryBucketField> getFields() {
        return fields;
    }
    public void setFields(java.util.List<ActivityChronicleSummaryBucketField> fields) {
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
        final ActivityChronicleSummaryBucketType that = (ActivityChronicleSummaryBucketType) obj;
        return Objects.equals(size, that.size)
            && Objects.equals(bucketingStrategy, that.bucketingStrategy)
            && Objects.equals(fields, that.fields)
            && Objects.equals(metadata, that.metadata);
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, bucketingStrategy, fields, metadata);
    }


    public static ActivityChronicleSummaryBucketType.Builder builder() {
        return new ActivityChronicleSummaryBucketType.Builder();
    }

    public static class Builder {

        private org.springframework.graphql.data.ArgumentValue<SummaryBucketSize> size = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<BucketingStrategy> bucketingStrategy = org.springframework.graphql.data.ArgumentValue.omitted();
        private java.util.List<ActivityChronicleSummaryBucketField> fields;
        private java.util.List<JSONFieldStringBucket> metadata;

        public Builder() {
        }

        public Builder setSize(org.springframework.graphql.data.ArgumentValue<SummaryBucketSize> size) {
            this.size = size;
            return this;
        }

        public Builder setBucketingStrategy(org.springframework.graphql.data.ArgumentValue<BucketingStrategy> bucketingStrategy) {
            this.bucketingStrategy = bucketingStrategy;
            return this;
        }

        public Builder setFields(java.util.List<ActivityChronicleSummaryBucketField> fields) {
            this.fields = fields;
            return this;
        }

        public Builder setMetadata(java.util.List<JSONFieldStringBucket> metadata) {
            this.metadata = metadata;
            return this;
        }


        public ActivityChronicleSummaryBucketType build() {
            return new ActivityChronicleSummaryBucketType(size, bucketingStrategy, fields, metadata);
        }

    }
}
