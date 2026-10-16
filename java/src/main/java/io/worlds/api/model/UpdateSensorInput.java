package io.worlds.api.model;

import java.util.Objects;

/**
 * This input type is used update an existing `Sensor`.
 */
public class UpdateSensorInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private String id;
    private org.springframework.graphql.data.ArgumentValue<String> name = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<String> description = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<SensorType> type = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<GeoJSONPointInput> position = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<String> address = org.springframework.graphql.data.ArgumentValue.omitted();
    @Deprecated
    private org.springframework.graphql.data.ArgumentValue<java.lang.Object> metadata = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<JSONUpdateInput> metadataUpdate = org.springframework.graphql.data.ArgumentValue.omitted();

    public UpdateSensorInput() {
    }

    public UpdateSensorInput(String id, org.springframework.graphql.data.ArgumentValue<String> name, org.springframework.graphql.data.ArgumentValue<String> description, org.springframework.graphql.data.ArgumentValue<SensorType> type, org.springframework.graphql.data.ArgumentValue<GeoJSONPointInput> position, org.springframework.graphql.data.ArgumentValue<String> address, org.springframework.graphql.data.ArgumentValue<java.lang.Object> metadata, org.springframework.graphql.data.ArgumentValue<JSONUpdateInput> metadataUpdate) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.type = type;
        this.position = position;
        this.address = address;
        this.metadata = metadata;
        this.metadataUpdate = metadataUpdate;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
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

    public org.springframework.graphql.data.ArgumentValue<SensorType> getType() {
        return type;
    }
    public void setType(org.springframework.graphql.data.ArgumentValue<SensorType> type) {
        this.type = type;
    }

    public org.springframework.graphql.data.ArgumentValue<GeoJSONPointInput> getPosition() {
        return position;
    }
    public void setPosition(org.springframework.graphql.data.ArgumentValue<GeoJSONPointInput> position) {
        this.position = position;
    }

    public org.springframework.graphql.data.ArgumentValue<String> getAddress() {
        return address;
    }
    public void setAddress(org.springframework.graphql.data.ArgumentValue<String> address) {
        this.address = address;
    }

    @Deprecated
    public org.springframework.graphql.data.ArgumentValue<java.lang.Object> getMetadata() {
        return metadata;
    }
    @Deprecated
    public void setMetadata(org.springframework.graphql.data.ArgumentValue<java.lang.Object> metadata) {
        this.metadata = metadata;
    }

    public org.springframework.graphql.data.ArgumentValue<JSONUpdateInput> getMetadataUpdate() {
        return metadataUpdate;
    }
    public void setMetadataUpdate(org.springframework.graphql.data.ArgumentValue<JSONUpdateInput> metadataUpdate) {
        this.metadataUpdate = metadataUpdate;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final UpdateSensorInput that = (UpdateSensorInput) obj;
        return Objects.equals(id, that.id)
            && Objects.equals(name, that.name)
            && Objects.equals(description, that.description)
            && Objects.equals(type, that.type)
            && Objects.equals(position, that.position)
            && Objects.equals(address, that.address)
            && Objects.equals(metadata, that.metadata)
            && Objects.equals(metadataUpdate, that.metadataUpdate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, type, position, address, metadata, metadataUpdate);
    }


    public static UpdateSensorInput.Builder builder() {
        return new UpdateSensorInput.Builder();
    }

    public static class Builder {

        private String id;
        private org.springframework.graphql.data.ArgumentValue<String> name = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<String> description = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<SensorType> type = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<GeoJSONPointInput> position = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<String> address = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<java.lang.Object> metadata = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<JSONUpdateInput> metadataUpdate = org.springframework.graphql.data.ArgumentValue.omitted();

        public Builder() {
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setName(org.springframework.graphql.data.ArgumentValue<String> name) {
            this.name = name;
            return this;
        }

        public Builder setDescription(org.springframework.graphql.data.ArgumentValue<String> description) {
            this.description = description;
            return this;
        }

        public Builder setType(org.springframework.graphql.data.ArgumentValue<SensorType> type) {
            this.type = type;
            return this;
        }

        public Builder setPosition(org.springframework.graphql.data.ArgumentValue<GeoJSONPointInput> position) {
            this.position = position;
            return this;
        }

        public Builder setAddress(org.springframework.graphql.data.ArgumentValue<String> address) {
            this.address = address;
            return this;
        }

        @Deprecated
        public Builder setMetadata(org.springframework.graphql.data.ArgumentValue<java.lang.Object> metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder setMetadataUpdate(org.springframework.graphql.data.ArgumentValue<JSONUpdateInput> metadataUpdate) {
            this.metadataUpdate = metadataUpdate;
            return this;
        }


        public UpdateSensorInput build() {
            return new UpdateSensorInput(id, name, description, type, position, address, metadata, metadataUpdate);
        }

    }
}
