package io.worlds.api.model;

import java.util.Objects;

/**
 * This input type indicates whether an event is valid and contains additional information about the validation.
 */
public class EventValidationInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private EventValidationStatus status;
    private org.springframework.graphql.data.ArgumentValue<String> reason = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<String> details = org.springframework.graphql.data.ArgumentValue.omitted();

    public EventValidationInput() {
    }

    public EventValidationInput(EventValidationStatus status, org.springframework.graphql.data.ArgumentValue<String> reason, org.springframework.graphql.data.ArgumentValue<String> details) {
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

    public org.springframework.graphql.data.ArgumentValue<String> getReason() {
        return reason;
    }
    public void setReason(org.springframework.graphql.data.ArgumentValue<String> reason) {
        this.reason = reason;
    }

    public org.springframework.graphql.data.ArgumentValue<String> getDetails() {
        return details;
    }
    public void setDetails(org.springframework.graphql.data.ArgumentValue<String> details) {
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
        final EventValidationInput that = (EventValidationInput) obj;
        return Objects.equals(status, that.status)
            && Objects.equals(reason, that.reason)
            && Objects.equals(details, that.details);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, reason, details);
    }


    public static EventValidationInput.Builder builder() {
        return new EventValidationInput.Builder();
    }

    public static class Builder {

        private EventValidationStatus status;
        private org.springframework.graphql.data.ArgumentValue<String> reason = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<String> details = org.springframework.graphql.data.ArgumentValue.omitted();

        public Builder() {
        }

        public Builder setStatus(EventValidationStatus status) {
            this.status = status;
            return this;
        }

        public Builder setReason(org.springframework.graphql.data.ArgumentValue<String> reason) {
            this.reason = reason;
            return this;
        }

        public Builder setDetails(org.springframework.graphql.data.ArgumentValue<String> details) {
            this.details = details;
            return this;
        }


        public EventValidationInput build() {
            return new EventValidationInput(status, reason, details);
        }

    }
}
