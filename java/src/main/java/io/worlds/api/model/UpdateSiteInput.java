package io.worlds.api.model;


/**
 * Input type used to update an existing [Site]({{Types.site}.
 */
public class UpdateSiteInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private String id;
    private org.springframework.graphql.data.ArgumentValue<String> name = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<GeoJSONPointInput> position = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<GeoJSONMultiPolygonInput> polygon = org.springframework.graphql.data.ArgumentValue.omitted();

    public UpdateSiteInput() {
    }

    public UpdateSiteInput(String id, org.springframework.graphql.data.ArgumentValue<String> name, org.springframework.graphql.data.ArgumentValue<GeoJSONPointInput> position, org.springframework.graphql.data.ArgumentValue<GeoJSONMultiPolygonInput> polygon) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.polygon = polygon;
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

    public org.springframework.graphql.data.ArgumentValue<GeoJSONPointInput> getPosition() {
        return position;
    }
    public void setPosition(org.springframework.graphql.data.ArgumentValue<GeoJSONPointInput> position) {
        this.position = position;
    }

    public org.springframework.graphql.data.ArgumentValue<GeoJSONMultiPolygonInput> getPolygon() {
        return polygon;
    }
    public void setPolygon(org.springframework.graphql.data.ArgumentValue<GeoJSONMultiPolygonInput> polygon) {
        this.polygon = polygon;
    }



    public static UpdateSiteInput.Builder builder() {
        return new UpdateSiteInput.Builder();
    }

    public static class Builder {

        private String id;
        private org.springframework.graphql.data.ArgumentValue<String> name = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<GeoJSONPointInput> position = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<GeoJSONMultiPolygonInput> polygon = org.springframework.graphql.data.ArgumentValue.omitted();

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

        public Builder setPosition(org.springframework.graphql.data.ArgumentValue<GeoJSONPointInput> position) {
            this.position = position;
            return this;
        }

        public Builder setPolygon(org.springframework.graphql.data.ArgumentValue<GeoJSONMultiPolygonInput> polygon) {
            this.polygon = polygon;
            return this;
        }


        public UpdateSiteInput build() {
            return new UpdateSiteInput(id, name, position, polygon);
        }

    }
}
