package io.worlds.api.model;

import java.util.Objects;

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

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final ChronicleValidationInput that = (ChronicleValidationInput) obj;
        return Objects.equals(status, that.status)
            && Objects.equals(summary, that.summary)
            && Objects.equals(details, that.details);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, summary, details);
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
