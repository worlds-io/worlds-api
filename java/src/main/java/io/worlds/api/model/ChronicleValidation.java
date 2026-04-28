package io.worlds.api.model;

import java.util.Objects;

/**
 * This input type indicates whether an chronicle is valid and contains additional information about the validation.
 */
public class ChronicleValidation implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private ChronicleValidationStatus status;
    private String reason;
    private String details;
    private User validatedBy;

    public ChronicleValidation() {
    }

    public ChronicleValidation(ChronicleValidationStatus status, String reason, String details, User validatedBy) {
        this.status = status;
        this.reason = reason;
        this.details = details;
        this.validatedBy = validatedBy;
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

    /**
     * The user which last validated the event, if any.
     */
    public User getValidatedBy() {
        return validatedBy;
    }
    /**
     * The user which last validated the event, if any.
     */
    public void setValidatedBy(User validatedBy) {
        this.validatedBy = validatedBy;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final ChronicleValidation that = (ChronicleValidation) obj;
        return Objects.equals(status, that.status)
            && Objects.equals(reason, that.reason)
            && Objects.equals(details, that.details)
            && Objects.equals(validatedBy, that.validatedBy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, reason, details, validatedBy);
    }


    public static ChronicleValidation.Builder builder() {
        return new ChronicleValidation.Builder();
    }

    public static class Builder {

        private ChronicleValidationStatus status;
        private String reason;
        private String details;
        private User validatedBy;

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

        /**
         * The user which last validated the event, if any.
         */
        public Builder setValidatedBy(User validatedBy) {
            this.validatedBy = validatedBy;
            return this;
        }


        public ChronicleValidation build() {
            return new ChronicleValidation(status, reason, details, validatedBy);
        }

    }
}
