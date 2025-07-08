package io.worlds.api.model;


public class ChronicleDocumentValidation implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private ChronicleDocumentValidationStatus status;
    private String reason;
    private String details;

    public ChronicleDocumentValidation() {
    }

    public ChronicleDocumentValidation(ChronicleDocumentValidationStatus status, String reason, String details) {
        this.status = status;
        this.reason = reason;
        this.details = details;
    }

    public ChronicleDocumentValidationStatus getStatus() {
        return status;
    }
    public void setStatus(ChronicleDocumentValidationStatus status) {
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



    public static ChronicleDocumentValidation.Builder builder() {
        return new ChronicleDocumentValidation.Builder();
    }

    public static class Builder {

        private ChronicleDocumentValidationStatus status;
        private String reason;
        private String details;

        public Builder() {
        }

        public Builder setStatus(ChronicleDocumentValidationStatus status) {
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


        public ChronicleDocumentValidation build() {
            return new ChronicleDocumentValidation(status, reason, details);
        }

    }
}
