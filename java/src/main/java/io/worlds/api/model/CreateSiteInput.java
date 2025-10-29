package io.worlds.api.model;


/**
 * Input type used to create a new [Site]({{Types.site}.
 */
public class CreateSiteInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private String name;
    private org.springframework.graphql.data.ArgumentValue<GeoJSONPointInput> position = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<GeoJSONMultiPolygonInput> polygon = org.springframework.graphql.data.ArgumentValue.omitted();

    public CreateSiteInput() {
    }

    public CreateSiteInput(String name, org.springframework.graphql.data.ArgumentValue<GeoJSONPointInput> position, org.springframework.graphql.data.ArgumentValue<GeoJSONMultiPolygonInput> polygon) {
        this.name = name;
        this.position = position;
        this.polygon = polygon;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
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



    public static CreateSiteInput.Builder builder() {
        return new CreateSiteInput.Builder();
    }

    public static class Builder {

        private String name;
        private org.springframework.graphql.data.ArgumentValue<GeoJSONPointInput> position = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<GeoJSONMultiPolygonInput> polygon = org.springframework.graphql.data.ArgumentValue.omitted();

        public Builder() {
        }

        public Builder setName(String name) {
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


        public CreateSiteInput build() {
            return new CreateSiteInput(name, position, polygon);
        }

    }
}
