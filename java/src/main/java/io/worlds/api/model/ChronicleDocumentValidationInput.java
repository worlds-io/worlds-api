package io.worlds.api.model;


/**
 * Supporting input for validation
 */
public class ChronicleDocumentValidationInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private ChronicleDocumentValidationStatus status;
    private org.springframework.graphql.data.ArgumentValue<String> reason = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<String> details = org.springframework.graphql.data.ArgumentValue.omitted();

    public ChronicleDocumentValidationInput() {
    }

    public ChronicleDocumentValidationInput(ChronicleDocumentValidationStatus status, org.springframework.graphql.data.ArgumentValue<String> reason, org.springframework.graphql.data.ArgumentValue<String> details) {
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



    public static ChronicleDocumentValidationInput.Builder builder() {
        return new ChronicleDocumentValidationInput.Builder();
    }

    public static class Builder {

        private ChronicleDocumentValidationStatus status;
        private org.springframework.graphql.data.ArgumentValue<String> reason = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<String> details = org.springframework.graphql.data.ArgumentValue.omitted();

        public Builder() {
        }

        public Builder setStatus(ChronicleDocumentValidationStatus status) {
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


        public ChronicleDocumentValidationInput build() {
            return new ChronicleDocumentValidationInput(status, reason, details);
        }

    }
}
