package io.worlds.api.model;


public class EventValidation implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private EventValidationStatus status;
    private String reason;
    private String details;

    public EventValidation() {
    }

    public EventValidation(EventValidationStatus status, String reason, String details) {
        this.status = status;
        this.reason = reason;
        this.details = details;
    }

    public EventValidationStatus getStatus() {
        return status;
    }
    public void setStatus(EventValidationStatus status) {
        this.status = status;
    }

    public String getReason() {
        return reason;
    }
    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getDetails() {
        return details;
    }
    public void setDetails(String details) {
        this.details = details;
    }



    public static EventValidation.Builder builder() {
        return new EventValidation.Builder();
    }

    public static class Builder {

        private EventValidationStatus status;
        private String reason;
        private String details;

        public Builder() {
        }

        public Builder setStatus(EventValidationStatus status) {
            this.status = status;
            return this;
        }

        public Builder setReason(String reason) {
            this.reason = reason;
            return this;
        }

        public Builder setDetails(String details) {
            this.details = details;
            return this;
        }


        public EventValidation build() {
            return new EventValidation(status, reason, details);
        }

    }
}
