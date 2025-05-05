package io.worlds.api.model;


public class EventValidation implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private EventValidationStatus status;
    private String invalidReason;
    private String invalidDetails;

    public EventValidation() {
    }

    public EventValidation(EventValidationStatus status, String invalidReason, String invalidDetails) {
        this.status = status;
        this.invalidReason = invalidReason;
        this.invalidDetails = invalidDetails;
    }

    public EventValidationStatus getStatus() {
        return status;
    }
    public void setStatus(EventValidationStatus status) {
        this.status = status;
    }

    public String getInvalidReason() {
        return invalidReason;
    }
    public void setInvalidReason(String invalidReason) {
        this.invalidReason = invalidReason;
    }

    public String getInvalidDetails() {
        return invalidDetails;
    }
    public void setInvalidDetails(String invalidDetails) {
        this.invalidDetails = invalidDetails;
    }



    public static EventValidation.Builder builder() {
        return new EventValidation.Builder();
    }

    public static class Builder {

        private EventValidationStatus status;
        private String invalidReason;
        private String invalidDetails;

        public Builder() {
        }

        public Builder setStatus(EventValidationStatus status) {
            this.status = status;
            return this;
        }

        public Builder setInvalidReason(String invalidReason) {
            this.invalidReason = invalidReason;
            return this;
        }

        public Builder setInvalidDetails(String invalidDetails) {
            this.invalidDetails = invalidDetails;
            return this;
        }


        public EventValidation build() {
            return new EventValidation(status, invalidReason, invalidDetails);
        }

    }
}
