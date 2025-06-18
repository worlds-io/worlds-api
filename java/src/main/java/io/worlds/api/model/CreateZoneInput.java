package io.worlds.api.model;


public class CreateZoneInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private String dataSourceId;
    @jakarta.validation.constraints.NotNull
    private String name;
    @jakarta.validation.constraints.NotNull
    private GeoJSONPolygonInput polygon;
    private org.springframework.graphql.data.ArgumentValue<Boolean> active = org.springframework.graphql.data.ArgumentValue.omitted();

    public CreateZoneInput() {
    }

    public CreateZoneInput(String dataSourceId, String name, GeoJSONPolygonInput polygon, org.springframework.graphql.data.ArgumentValue<Boolean> active) {
        this.dataSourceId = dataSourceId;
        this.name = name;
        this.polygon = polygon;
        this.active = active;
    }

    public String getDataSourceId() {
        return dataSourceId;
    }
    public void setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public GeoJSONPolygonInput getPolygon() {
        return polygon;
    }
    public void setPolygon(GeoJSONPolygonInput polygon) {
        this.polygon = polygon;
    }

    public org.springframework.graphql.data.ArgumentValue<Boolean> getActive() {
        return active;
    }
    public void setActive(org.springframework.graphql.data.ArgumentValue<Boolean> active) {
        this.active = active;
    }



    public static CreateZoneInput.Builder builder() {
        return new CreateZoneInput.Builder();
    }

    public static class Builder {

        private String dataSourceId;
        private String name;
        private GeoJSONPolygonInput polygon;
        private org.springframework.graphql.data.ArgumentValue<Boolean> active = org.springframework.graphql.data.ArgumentValue.omitted();

        public Builder() {
        }

        public Builder setDataSourceId(String dataSourceId) {
            this.dataSourceId = dataSourceId;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setPolygon(GeoJSONPolygonInput polygon) {
            this.polygon = polygon;
            return this;
        }

        public Builder setActive(org.springframework.graphql.data.ArgumentValue<Boolean> active) {
            this.active = active;
            return this;
        }


        public CreateZoneInput build() {
            return new CreateZoneInput(dataSourceId, name, polygon, active);
        }

    }
}
