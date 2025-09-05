package io.worlds.api.model;


/**
 * This input type indicates whether an chronicle is valid and contains additional information about the validation.
 */
public class ChronicleValidationInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private ChronicleValidationStatus status;
    private org.springframework.graphql.data.ArgumentValue<String> summary = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<String> details = org.springframework.graphql.data.ArgumentValue.omitted();

    public ChronicleValidationInput() {
    }

    public ChronicleValidationInput(ChronicleValidationStatus status, org.springframework.graphql.data.ArgumentValue<String> summary, org.springframework.graphql.data.ArgumentValue<String> details) {
        this.status = status;
        this.summary = summary;
        this.details = details;
    }

    public ChronicleValidationStatus getStatus() {
        return status;
    }
    public void setStatus(ChronicleValidationStatus status) {
        this.status = status;
    }

    public org.springframework.graphql.data.ArgumentValue<String> getSummary() {
        return summary;
    }
    public void setSummary(org.springframework.graphql.data.ArgumentValue<String> summary) {
        this.summary = summary;
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
        private org.springframework.graphql.data.ArgumentValue<String> summary = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<String> details = org.springframework.graphql.data.ArgumentValue.omitted();

        public Builder() {
        }

        public Builder setStatus(ChronicleValidationStatus status) {
            this.status = status;
            return this;
        }

        public Builder setSummary(org.springframework.graphql.data.ArgumentValue<String> summary) {
            this.summary = summary;
            return this;
        }

        public Builder setDetails(org.springframework.graphql.data.ArgumentValue<String> details) {
            this.details = details;
            return this;
        }


        public ChronicleValidationInput build() {
            return new ChronicleValidationInput(status, summary, details);
        }

    }
}
