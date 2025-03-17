package io.worlds.api.model;


public class UpdateEventInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private String id;
    @jakarta.validation.constraints.NotNull
    private String type;
    private org.springframework.graphql.data.ArgumentValue<String> subType = org.springframework.graphql.data.ArgumentValue.omitted();
    @jakarta.validation.constraints.NotNull
    private java.time.OffsetDateTime startTime;
    private org.springframework.graphql.data.ArgumentValue<java.time.OffsetDateTime> endTime = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<GeoJSONPointInput> position = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<String> timezone = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<java.lang.Object> metadata = org.springframework.graphql.data.ArgumentValue.omitted();
    private java.util.List<CreateSnapshotInput> snapshots;
    private java.util.List<UploadImageInput> uploads;
    private java.util.List<CreateClipInput> clips;
    private java.util.List<String> trackIds;

    public UpdateEventInput() {
    }

    public UpdateEventInput(String id, String type, org.springframework.graphql.data.ArgumentValue<String> subType, java.time.OffsetDateTime startTime, org.springframework.graphql.data.ArgumentValue<java.time.OffsetDateTime> endTime, org.springframework.graphql.data.ArgumentValue<GeoJSONPointInput> position, org.springframework.graphql.data.ArgumentValue<String> timezone, org.springframework.graphql.data.ArgumentValue<java.lang.Object> metadata, java.util.List<CreateSnapshotInput> snapshots, java.util.List<UploadImageInput> uploads, java.util.List<CreateClipInput> clips, java.util.List<String> trackIds) {
        this.id = id;
        this.type = type;
        this.subType = subType;
        this.startTime = startTime;
        this.endTime = endTime;
        this.position = position;
        this.timezone = timezone;
        this.metadata = metadata;
        this.snapshots = snapshots;
        this.uploads = uploads;
        this.clips = clips;
        this.trackIds = trackIds;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public org.springframework.graphql.data.ArgumentValue<String> getSubType() {
        return subType;
    }
    public void setSubType(org.springframework.graphql.data.ArgumentValue<String> subType) {
        this.subType = subType;
    }

    public java.time.OffsetDateTime getStartTime() {
        return startTime;
    }
    public void setStartTime(java.time.OffsetDateTime startTime) {
        this.startTime = startTime;
    }

    public org.springframework.graphql.data.ArgumentValue<java.time.OffsetDateTime> getEndTime() {
        return endTime;
    }
    public void setEndTime(org.springframework.graphql.data.ArgumentValue<java.time.OffsetDateTime> endTime) {
        this.endTime = endTime;
    }

    public org.springframework.graphql.data.ArgumentValue<GeoJSONPointInput> getPosition() {
        return position;
    }
    public void setPosition(org.springframework.graphql.data.ArgumentValue<GeoJSONPointInput> position) {
        this.position = position;
    }

    public org.springframework.graphql.data.ArgumentValue<String> getTimezone() {
        return timezone;
    }
    public void setTimezone(org.springframework.graphql.data.ArgumentValue<String> timezone) {
        this.timezone = timezone;
    }

    public org.springframework.graphql.data.ArgumentValue<java.lang.Object> getMetadata() {
        return metadata;
    }
    public void setMetadata(org.springframework.graphql.data.ArgumentValue<java.lang.Object> metadata) {
        this.metadata = metadata;
    }

    public java.util.List<CreateSnapshotInput> getSnapshots() {
        return snapshots;
    }
    public void setSnapshots(java.util.List<CreateSnapshotInput> snapshots) {
        this.snapshots = snapshots;
    }

    public java.util.List<UploadImageInput> getUploads() {
        return uploads;
    }
    public void setUploads(java.util.List<UploadImageInput> uploads) {
        this.uploads = uploads;
    }

    public java.util.List<CreateClipInput> getClips() {
        return clips;
    }
    public void setClips(java.util.List<CreateClipInput> clips) {
        this.clips = clips;
    }

    public java.util.List<String> getTrackIds() {
        return trackIds;
    }
    public void setTrackIds(java.util.List<String> trackIds) {
        this.trackIds = trackIds;
    }



    public static UpdateEventInput.Builder builder() {
        return new UpdateEventInput.Builder();
    }

    public static class Builder {

        private String id;
        private String type;
        private org.springframework.graphql.data.ArgumentValue<String> subType = org.springframework.graphql.data.ArgumentValue.omitted();
        private java.time.OffsetDateTime startTime;
        private org.springframework.graphql.data.ArgumentValue<java.time.OffsetDateTime> endTime = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<GeoJSONPointInput> position = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<String> timezone = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<java.lang.Object> metadata = org.springframework.graphql.data.ArgumentValue.omitted();
        private java.util.List<CreateSnapshotInput> snapshots;
        private java.util.List<UploadImageInput> uploads;
        private java.util.List<CreateClipInput> clips;
        private java.util.List<String> trackIds;

        public Builder() {
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setType(String type) {
            this.type = type;
            return this;
        }

        public Builder setSubType(org.springframework.graphql.data.ArgumentValue<String> subType) {
            this.subType = subType;
            return this;
        }

        public Builder setStartTime(java.time.OffsetDateTime startTime) {
            this.startTime = startTime;
            return this;
        }

        public Builder setEndTime(org.springframework.graphql.data.ArgumentValue<java.time.OffsetDateTime> endTime) {
            this.endTime = endTime;
            return this;
        }

        public Builder setPosition(org.springframework.graphql.data.ArgumentValue<GeoJSONPointInput> position) {
            this.position = position;
            return this;
        }

        public Builder setTimezone(org.springframework.graphql.data.ArgumentValue<String> timezone) {
            this.timezone = timezone;
            return this;
        }

        public Builder setMetadata(org.springframework.graphql.data.ArgumentValue<java.lang.Object> metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder setSnapshots(java.util.List<CreateSnapshotInput> snapshots) {
            this.snapshots = snapshots;
            return this;
        }

        public Builder setUploads(java.util.List<UploadImageInput> uploads) {
            this.uploads = uploads;
            return this;
        }

        public Builder setClips(java.util.List<CreateClipInput> clips) {
            this.clips = clips;
            return this;
        }

        public Builder setTrackIds(java.util.List<String> trackIds) {
            this.trackIds = trackIds;
            return this;
        }


        public UpdateEventInput build() {
            return new UpdateEventInput(id, type, subType, startTime, endTime, position, timezone, metadata, snapshots, uploads, clips, trackIds);
        }

    }
}
