package io.worlds.api.model;


public class CreateClipInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private String dataSourceId;
    @jakarta.validation.constraints.NotNull
    private java.time.OffsetDateTime startTime;
    @jakarta.validation.constraints.NotNull
    private java.time.OffsetDateTime endTime;

    public CreateClipInput() {
    }

    public CreateClipInput(String dataSourceId, java.time.OffsetDateTime startTime, java.time.OffsetDateTime endTime) {
        this.dataSourceId = dataSourceId;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public String getDataSourceId() {
        return dataSourceId;
    }
    public void setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
    }

    public java.time.OffsetDateTime getStartTime() {
        return startTime;
    }
    public void setStartTime(java.time.OffsetDateTime startTime) {
        this.startTime = startTime;
    }

    public java.time.OffsetDateTime getEndTime() {
        return endTime;
    }
    public void setEndTime(java.time.OffsetDateTime endTime) {
        this.endTime = endTime;
    }



    public static CreateClipInput.Builder builder() {
        return new CreateClipInput.Builder();
    }

    public static class Builder {

        private String dataSourceId;
        private java.time.OffsetDateTime startTime;
        private java.time.OffsetDateTime endTime;

        public Builder() {
        }

        public Builder setDataSourceId(String dataSourceId) {
            this.dataSourceId = dataSourceId;
            return this;
        }

        public Builder setStartTime(java.time.OffsetDateTime startTime) {
            this.startTime = startTime;
            return this;
        }

        public Builder setEndTime(java.time.OffsetDateTime endTime) {
            this.endTime = endTime;
            return this;
        }


        public CreateClipInput build() {
            return new CreateClipInput(dataSourceId, startTime, endTime);
        }

    }
}
