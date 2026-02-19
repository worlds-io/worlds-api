package io.worlds.api.model;

import java.util.Objects;

/**
 * Input to indicate which field(s) to group videos by in an `videosSummary` query.
Any combination of up to three distinct fields may be provided.
If multiple fields are provided, the buckets will be sorted by time, then fields.
 */
public class VideosSummaryBucketType implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private java.util.List<VideosSummaryBucketField> fields;

    public VideosSummaryBucketType() {
    }

    public VideosSummaryBucketType(java.util.List<VideosSummaryBucketField> fields) {
        this.fields = fields;
    }

    public java.util.List<VideosSummaryBucketField> getFields() {
        return fields;
    }
    public void setFields(java.util.List<VideosSummaryBucketField> fields) {
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
        final VideosSummaryBucketType that = (VideosSummaryBucketType) obj;
        return Objects.equals(fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields);
    }


    public static VideosSummaryBucketType.Builder builder() {
        return new VideosSummaryBucketType.Builder();
    }

    public static class Builder {

        private java.util.List<VideosSummaryBucketField> fields;

        public Builder() {
        }

        public Builder setFields(java.util.List<VideosSummaryBucketField> fields) {
            this.fields = fields;
            return this;
        }


        public VideosSummaryBucketType build() {
            return new VideosSummaryBucketType(fields);
        }

    }
}
