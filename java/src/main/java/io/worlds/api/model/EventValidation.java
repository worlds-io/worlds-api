package io.worlds.api.model;

import java.util.Objects;

/**
 * This type indicates whether an event is valid and contains additional information about the validation.
 */
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

    /**
     * Whether the event is `VALID` or `INVALID`.
     */
    public EventValidationStatus getStatus() {
        return status;
    }
    /**
     * Whether the event is `VALID` or `INVALID`.
     */
    public void setStatus(EventValidationStatus status) {
        this.status = status;
    }

    /**
     * The reason for the event's validation status. Required if the `status` is `INVALID`.
     */
    public String getReason() {
        return reason;
    }
    /**
     * The reason for the event's validation status. Required if the `status` is `INVALID`.
     */
    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * Optional details for the event's validation status.
     */
    public String getDetails() {
        return details;
    }
    /**
     * Optional details for the event's validation status.
     */
    public void setDetails(String details) {
        this.details = details;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final EventValidation that = (EventValidation) obj;
        return Objects.equals(status, that.status)
            && Objects.equals(reason, that.reason)
            && Objects.equals(details, that.details);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, reason, details);
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

        /**
         * Whether the event is `VALID` or `INVALID`.
         */
        public Builder setStatus(EventValidationStatus status) {
            this.status = status;
            return this;
        }

        /**
         * The reason for the event's validation status. Required if the `status` is `INVALID`.
         */
        public Builder setReason(String reason) {
            this.reason = reason;
            return this;
        }

        /**
         * Optional details for the event's validation status.
         */
        public Builder setDetails(String details) {
            this.details = details;
            return this;
        }


        public EventValidation build() {
            return new EventValidation(status, reason, details);
        }

    }
}
