package io.worlds.api.model;


/**
 * Supporting input for validation
 */
public class ChronicleValidationInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private ChronicleValidationStatus status;
    private org.springframework.graphql.data.ArgumentValue<String> reason = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<String> details = org.springframework.graphql.data.ArgumentValue.omitted();

    public ChronicleValidationInput() {
    }

    public ChronicleValidationInput(ChronicleValidationStatus status, org.springframework.graphql.data.ArgumentValue<String> reason, org.springframework.graphql.data.ArgumentValue<String> details) {
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



    public static ChronicleValidationInput.Builder builder() {
        return new ChronicleValidationInput.Builder();
    }

    public static class Builder {

        private ChronicleValidationStatus status;
        private org.springframework.graphql.data.ArgumentValue<String> reason = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<String> details = org.springframework.graphql.data.ArgumentValue.omitted();

        public Builder() {
        }

        public Builder setStatus(ChronicleValidationStatus status) {
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


        public ChronicleValidationInput build() {
            return new ChronicleValidationInput(status, reason, details);
        }

    }
}
