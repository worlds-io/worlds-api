package io.worlds.api.model;


/**
 * This type represents the input data needed to initialize a [GeoJSON coordinate reference system]({{Types.geojsoncrs}}).
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
