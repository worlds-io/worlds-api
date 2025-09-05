package io.worlds.api.model;


/**
 * This input type indicates whether an chronicle is valid and contains additional information about the validation.
 */
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

    /**
     * Whether the chronicle is `VALID` or `INVALID`.
     */
    public ChronicleValidationStatus getStatus() {
        return status;
    }
    /**
     * Whether the chronicle is `VALID` or `INVALID`.
     */
    public void setStatus(ChronicleValidationStatus status) {
        this.status = status;
    }

    /**
     * The reason for the chronicle's validation status.  Required if the `status` is `INVALID`.
     */
    public String getReason() {
        return reason;
    }
    /**
     * The reason for the chronicle's validation status.  Required if the `status` is `INVALID`.
     */
    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * Additional details for the chronicle's validation status.
     */
    public String getDetails() {
        return details;
    }
    /**
     * Additional details for the chronicle's validation status.
     */
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

        /**
         * Whether the chronicle is `VALID` or `INVALID`.
         */
        public Builder setStatus(ChronicleValidationStatus status) {
            this.status = status;
            return this;
        }

        /**
         * The reason for the chronicle's validation status.  Required if the `status` is `INVALID`.
         */
        public Builder setReason(String reason) {
            this.reason = reason;
            return this;
        }

        /**
         * Additional details for the chronicle's validation status.
         */
        public Builder setDetails(String details) {
            this.details = details;
            return this;
        }


        public ChronicleValidation build() {
            return new ChronicleValidation(status, reason, details);
        }

    }
}
