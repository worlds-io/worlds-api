package io.worlds.api.model;


public class ChronicleValidation implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private ChronicleValidationStatus status;
    private String reason;
    private String details;

    public ChronicleValidation() {
    }

    public ChronicleValidation(ChronicleValidationStatus status, String reason, String details) {
        this.status = status;
        this.reason = reason;
        this.details = details;
    }

    public ChronicleValidationStatus getStatus() {
        return status;
    }
    public void setStatus(ChronicleValidationStatus status) {
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



    public static ChronicleValidation.Builder builder() {
        return new ChronicleValidation.Builder();
    }

    public static class Builder {

        private ChronicleValidationStatus status;
        private String reason;
        private String details;

        public Builder() {
        }

        public Builder setStatus(ChronicleValidationStatus status) {
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


        public ChronicleValidation build() {
            return new ChronicleValidation(status, reason, details);
        }

    }
}
