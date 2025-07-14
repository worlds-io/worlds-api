package io.worlds.api.model;


public class CreateChronicleProducerInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private String name;
    private org.springframework.graphql.data.ArgumentValue<String> description = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<String> timezone = org.springframework.graphql.data.ArgumentValue.omitted();
    private boolean active;
    private org.springframework.graphql.data.ArgumentValue<java.lang.Object> metadata = org.springframework.graphql.data.ArgumentValue.omitted();
    private java.util.List<String> invalidReasons;

    public CreateChronicleProducerInput() {
    }

    public CreateChronicleProducerInput(String name, org.springframework.graphql.data.ArgumentValue<String> description, org.springframework.graphql.data.ArgumentValue<String> timezone, boolean active, org.springframework.graphql.data.ArgumentValue<java.lang.Object> metadata, java.util.List<String> invalidReasons) {
        this.name = name;
        this.description = description;
        this.timezone = timezone;
        this.active = active;
        this.metadata = metadata;
        this.invalidReasons = invalidReasons;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public org.springframework.graphql.data.ArgumentValue<String> getDescription() {
        return description;
    }
    public void setDescription(org.springframework.graphql.data.ArgumentValue<String> description) {
        this.description = description;
    }

    public org.springframework.graphql.data.ArgumentValue<String> getTimezone() {
        return timezone;
    }
    public void setTimezone(org.springframework.graphql.data.ArgumentValue<String> timezone) {
        this.timezone = timezone;
    }

    public boolean getActive() {
        return active;
    }
    public void setActive(boolean active) {
        this.active = active;
    }

    public org.springframework.graphql.data.ArgumentValue<java.lang.Object> getMetadata() {
        return metadata;
    }
    public void setMetadata(org.springframework.graphql.data.ArgumentValue<java.lang.Object> metadata) {
        this.metadata = metadata;
    }

    public java.util.List<String> getInvalidReasons() {
        return invalidReasons;
    }
    public void setInvalidReasons(java.util.List<String> invalidReasons) {
        this.invalidReasons = invalidReasons;
    }



    public static CreateChronicleProducerInput.Builder builder() {
        return new CreateChronicleProducerInput.Builder();
    }

    public static class Builder {

        private String name;
        private org.springframework.graphql.data.ArgumentValue<String> description = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<String> timezone = org.springframework.graphql.data.ArgumentValue.omitted();
        private boolean active;
        private org.springframework.graphql.data.ArgumentValue<java.lang.Object> metadata = org.springframework.graphql.data.ArgumentValue.omitted();
        private java.util.List<String> invalidReasons;

        public Builder() {
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setDescription(org.springframework.graphql.data.ArgumentValue<String> description) {
            this.description = description;
            return this;
        }

        public Builder setTimezone(org.springframework.graphql.data.ArgumentValue<String> timezone) {
            this.timezone = timezone;
            return this;
        }

        public Builder setActive(boolean active) {
            this.active = active;
            return this;
        }

        public Builder setMetadata(org.springframework.graphql.data.ArgumentValue<java.lang.Object> metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder setInvalidReasons(java.util.List<String> invalidReasons) {
            this.invalidReasons = invalidReasons;
            return this;
        }


        public CreateChronicleProducerInput build() {
            return new CreateChronicleProducerInput(name, description, timezone, active, metadata, invalidReasons);
        }

    }
}
