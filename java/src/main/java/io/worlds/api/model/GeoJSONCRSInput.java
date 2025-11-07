package io.worlds.api.model;

import java.util.Objects;

/**
 * This type represents the input data needed to initialize a [GeoJSON coordinate reference system]({{Types.GeoJSONCRS}}).
 */
public class GeoJSONCRSInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private org.springframework.graphql.data.ArgumentValue<String> type = org.springframework.graphql.data.ArgumentValue.ofNullable("name");
    private org.springframework.graphql.data.ArgumentValue<java.lang.Object> properties = org.springframework.graphql.data.ArgumentValue.omitted();

    public GeoJSONCRSInput() {
    }

    public GeoJSONCRSInput(org.springframework.graphql.data.ArgumentValue<String> type, org.springframework.graphql.data.ArgumentValue<java.lang.Object> properties) {
        this.type = type;
        this.properties = properties;
    }

    public org.springframework.graphql.data.ArgumentValue<String> getType() {
        return type;
    }
    public void setType(org.springframework.graphql.data.ArgumentValue<String> type) {
        this.type = type;
    }

    public org.springframework.graphql.data.ArgumentValue<java.lang.Object> getProperties() {
        return properties;
    }
    public void setProperties(org.springframework.graphql.data.ArgumentValue<java.lang.Object> properties) {
        this.properties = properties;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final GeoJSONCRSInput that = (GeoJSONCRSInput) obj;
        return Objects.equals(type, that.type)
            && Objects.equals(properties, that.properties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, properties);
    }


    public static GeoJSONCRSInput.Builder builder() {
        return new GeoJSONCRSInput.Builder();
    }

    public static class Builder {

        private org.springframework.graphql.data.ArgumentValue<String> type = org.springframework.graphql.data.ArgumentValue.ofNullable("name");
        private org.springframework.graphql.data.ArgumentValue<java.lang.Object> properties = org.springframework.graphql.data.ArgumentValue.omitted();

        public Builder() {
        }

        public Builder setType(org.springframework.graphql.data.ArgumentValue<String> type) {
            this.type = type;
            return this;
        }

        public Builder setProperties(org.springframework.graphql.data.ArgumentValue<java.lang.Object> properties) {
            this.properties = properties;
            return this;
        }


        public GeoJSONCRSInput build() {
            return new GeoJSONCRSInput(type, properties);
        }

    }
}
