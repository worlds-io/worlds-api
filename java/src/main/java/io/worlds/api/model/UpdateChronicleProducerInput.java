package io.worlds.api.model;


public class UpdateChronicleProducerInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private org.springframework.graphql.data.ArgumentValue<String> name = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<String> description = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<String> timezone = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<Boolean> active = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<java.lang.Object> metadata = org.springframework.graphql.data.ArgumentValue.omitted();
    private java.util.List<String> invalidReasons;

    public UpdateChronicleProducerInput() {
    }

    public UpdateChronicleProducerInput(org.springframework.graphql.data.ArgumentValue<String> name, org.springframework.graphql.data.ArgumentValue<String> description, org.springframework.graphql.data.ArgumentValue<String> timezone, org.springframework.graphql.data.ArgumentValue<Boolean> active, org.springframework.graphql.data.ArgumentValue<java.lang.Object> metadata, java.util.List<String> invalidReasons) {
        this.name = name;
        this.description = description;
        this.timezone = timezone;
        this.active = active;
        this.metadata = metadata;
        this.invalidReasons = invalidReasons;
    }

    public org.springframework.graphql.data.ArgumentValue<String> getName() {
        return name;
    }
    public void setName(org.springframework.graphql.data.ArgumentValue<String> name) {
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

    public org.springframework.graphql.data.ArgumentValue<Boolean> getActive() {
        return active;
    }
    public void setActive(org.springframework.graphql.data.ArgumentValue<Boolean> active) {
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



    public static UpdateChronicleProducerInput.Builder builder() {
        return new UpdateChronicleProducerInput.Builder();
    }

    public static class Builder {

        private org.springframework.graphql.data.ArgumentValue<String> name = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<String> description = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<String> timezone = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<Boolean> active = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<java.lang.Object> metadata = org.springframework.graphql.data.ArgumentValue.omitted();
        private java.util.List<String> invalidReasons;

        public Builder() {
        }

        public Builder setName(org.springframework.graphql.data.ArgumentValue<String> name) {
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

        public Builder setActive(org.springframework.graphql.data.ArgumentValue<Boolean> active) {
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


        public UpdateChronicleProducerInput build() {
            return new UpdateChronicleProducerInput(name, description, timezone, active, metadata, invalidReasons);
        }

    }
}
