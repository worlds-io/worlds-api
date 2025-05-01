package io.worlds.api.model;


public class EventValidationInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private EventValidationStatus status;
    private org.springframework.graphql.data.ArgumentValue<String> invalidReason = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<String> invalidDetails = org.springframework.graphql.data.ArgumentValue.omitted();

    public EventValidationInput() {
    }

    public EventValidationInput(EventValidationStatus status, org.springframework.graphql.data.ArgumentValue<String> invalidReason, org.springframework.graphql.data.ArgumentValue<String> invalidDetails) {
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

    public org.springframework.graphql.data.ArgumentValue<String> getInvalidReason() {
        return invalidReason;
    }
    public void setInvalidReason(org.springframework.graphql.data.ArgumentValue<String> invalidReason) {
        this.invalidReason = invalidReason;
    }

    public org.springframework.graphql.data.ArgumentValue<String> getInvalidDetails() {
        return invalidDetails;
    }
    public void setInvalidDetails(org.springframework.graphql.data.ArgumentValue<String> invalidDetails) {
        this.invalidDetails = invalidDetails;
    }



    public static EventValidationInput.Builder builder() {
        return new EventValidationInput.Builder();
    }

    public static class Builder {

        private EventValidationStatus status;
        private org.springframework.graphql.data.ArgumentValue<String> invalidReason = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<String> invalidDetails = org.springframework.graphql.data.ArgumentValue.omitted();

        public Builder() {
        }

        public Builder setStatus(EventValidationStatus status) {
            this.status = status;
            return this;
        }

        public Builder setInvalidReason(org.springframework.graphql.data.ArgumentValue<String> invalidReason) {
            this.invalidReason = invalidReason;
            return this;
        }

        public Builder setInvalidDetails(org.springframework.graphql.data.ArgumentValue<String> invalidDetails) {
            this.invalidDetails = invalidDetails;
            return this;
        }


        public EventValidationInput build() {
            return new EventValidationInput(status, invalidReason, invalidDetails);
        }

    }
}
