package io.worlds.api.model;

import java.util.Objects;

/**
 * Input to indicate which field(s) to group devices by in a `deviceSummary` query.
Any combination of up to three distinct fields may be provided.
If multiple fields are provided, the buckets will be sorted by time, then fields.
 */
public class DeviceSummaryBucketType implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private org.springframework.graphql.data.ArgumentValue<SummaryBucketSize> size = org.springframework.graphql.data.ArgumentValue.omitted();
    private java.util.List<DeviceSummaryBucketField> fields;

    public DeviceSummaryBucketType() {
    }

    public DeviceSummaryBucketType(org.springframework.graphql.data.ArgumentValue<SummaryBucketSize> size, java.util.List<DeviceSummaryBucketField> fields) {
        this.size = size;
        this.fields = fields;
    }

    public org.springframework.graphql.data.ArgumentValue<SummaryBucketSize> getSize() {
        return size;
    }
    public void setSize(org.springframework.graphql.data.ArgumentValue<SummaryBucketSize> size) {
        this.size = size;
    }

    public java.util.List<DeviceSummaryBucketField> getFields() {
        return fields;
    }
    public void setFields(java.util.List<DeviceSummaryBucketField> fields) {
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
        final DeviceSummaryBucketType that = (DeviceSummaryBucketType) obj;
        return Objects.equals(size, that.size)
            && Objects.equals(fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, fields);
    }


    public static DeviceSummaryBucketType.Builder builder() {
        return new DeviceSummaryBucketType.Builder();
    }

    public static class Builder {

        private org.springframework.graphql.data.ArgumentValue<SummaryBucketSize> size = org.springframework.graphql.data.ArgumentValue.omitted();
        private java.util.List<DeviceSummaryBucketField> fields;

        public Builder() {
        }

        public Builder setSize(org.springframework.graphql.data.ArgumentValue<SummaryBucketSize> size) {
            this.size = size;
            return this;
        }

        public Builder setFields(java.util.List<DeviceSummaryBucketField> fields) {
            this.fields = fields;
            return this;
        }


        public DeviceSummaryBucketType build() {
            return new DeviceSummaryBucketType(size, fields);
        }

    }
}
