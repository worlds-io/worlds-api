package io.worlds.api.model;


public class EventValidation implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private EventValidationStatus status;
    private String invalidReason;
    private String invalidDescription;

    public EventValidation() {
    }

    public EventValidation(EventValidationStatus status, String invalidReason, String invalidDescription) {
        this.status = status;
        this.invalidReason = invalidReason;
        this.invalidDescription = invalidDescription;
    }

    public EventValidationStatus getStatus() {
        return status;
    }
    public void setStatus(EventValidationStatus status) {
        this.status = status;
    }

    public String getInvalidReason() {
        return invalidReason;
    }
    public void setInvalidReason(String invalidReason) {
        this.invalidReason = invalidReason;
    }

    public String getInvalidDescription() {
        return invalidDescription;
    }
    public void setInvalidDescription(String invalidDescription) {
        this.invalidDescription = invalidDescription;
    }



    public static EventValidation.Builder builder() {
        return new EventValidation.Builder();
    }

    public static class Builder {

        private EventValidationStatus status;
        private String invalidReason;
        private String invalidDescription;

        public Builder() {
        }

        public Builder setStatus(EventValidationStatus status) {
            this.status = status;
            return this;
        }

        public Builder setInvalidReason(String invalidReason) {
            this.invalidReason = invalidReason;
            return this;
        }

        public Builder setInvalidDescription(String invalidDescription) {
            this.invalidDescription = invalidDescription;
            return this;
        }


        public EventValidation build() {
            return new EventValidation(status, invalidReason, invalidDescription);
        }

    }
}
