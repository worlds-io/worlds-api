package io.worlds.api.model;

import java.util.Objects;

public class UpdateZoneInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private String id;
    private org.springframework.graphql.data.ArgumentValue<String> dataSourceId = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<String> name = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<GeoJSONPolygonInput> polygon = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<Boolean> active = org.springframework.graphql.data.ArgumentValue.omitted();

    public UpdateZoneInput() {
    }

    public UpdateZoneInput(String id, org.springframework.graphql.data.ArgumentValue<String> dataSourceId, org.springframework.graphql.data.ArgumentValue<String> name, org.springframework.graphql.data.ArgumentValue<GeoJSONPolygonInput> polygon, org.springframework.graphql.data.ArgumentValue<Boolean> active) {
        this.id = id;
        this.dataSourceId = dataSourceId;
        this.name = name;
        this.polygon = polygon;
        this.active = active;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public org.springframework.graphql.data.ArgumentValue<String> getDataSourceId() {
        return dataSourceId;
    }
    public void setDataSourceId(org.springframework.graphql.data.ArgumentValue<String> dataSourceId) {
        this.dataSourceId = dataSourceId;
    }

    public org.springframework.graphql.data.ArgumentValue<String> getName() {
        return name;
    }
    public void setName(org.springframework.graphql.data.ArgumentValue<String> name) {
        this.name = name;
    }

    public org.springframework.graphql.data.ArgumentValue<GeoJSONPolygonInput> getPolygon() {
        return polygon;
    }
    public void setPolygon(org.springframework.graphql.data.ArgumentValue<GeoJSONPolygonInput> polygon) {
        this.polygon = polygon;
    }

    public org.springframework.graphql.data.ArgumentValue<Boolean> getActive() {
        return active;
    }
    public void setActive(org.springframework.graphql.data.ArgumentValue<Boolean> active) {
        this.active = active;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final UpdateZoneInput that = (UpdateZoneInput) obj;
        return Objects.equals(id, that.id)
            && Objects.equals(dataSourceId, that.dataSourceId)
            && Objects.equals(name, that.name)
            && Objects.equals(polygon, that.polygon)
            && Objects.equals(active, that.active);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, dataSourceId, name, polygon, active);
    }


    public static UpdateZoneInput.Builder builder() {
        return new UpdateZoneInput.Builder();
    }

    public static class Builder {

        private String id;
        private org.springframework.graphql.data.ArgumentValue<String> dataSourceId = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<String> name = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<GeoJSONPolygonInput> polygon = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<Boolean> active = org.springframework.graphql.data.ArgumentValue.omitted();

        public Builder() {
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setDataSourceId(org.springframework.graphql.data.ArgumentValue<String> dataSourceId) {
            this.dataSourceId = dataSourceId;
            return this;
        }

        public Builder setName(org.springframework.graphql.data.ArgumentValue<String> name) {
            this.name = name;
            return this;
        }

        public Builder setPolygon(org.springframework.graphql.data.ArgumentValue<GeoJSONPolygonInput> polygon) {
            this.polygon = polygon;
            return this;
        }

        public Builder setActive(org.springframework.graphql.data.ArgumentValue<Boolean> active) {
            this.active = active;
            return this;
        }


        public UpdateZoneInput build() {
            return new UpdateZoneInput(id, dataSourceId, name, polygon, active);
        }

    }
}
