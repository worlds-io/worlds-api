package io.worlds.api.model;

import java.util.Objects;

/**
 * Input type used to create a new [Site]({{Types.Site}.
 */
public class CreateSiteInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private String name;
    private org.springframework.graphql.data.ArgumentValue<String> timezone = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<GeoJSONPointInput> position = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<GeoJSONMultiPolygonInput> polygon = org.springframework.graphql.data.ArgumentValue.omitted();

    public CreateSiteInput() {
    }

    public CreateSiteInput(String name, org.springframework.graphql.data.ArgumentValue<String> timezone, org.springframework.graphql.data.ArgumentValue<GeoJSONPointInput> position, org.springframework.graphql.data.ArgumentValue<GeoJSONMultiPolygonInput> polygon) {
        this.name = name;
        this.timezone = timezone;
        this.position = position;
        this.polygon = polygon;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public org.springframework.graphql.data.ArgumentValue<String> getTimezone() {
        return timezone;
    }
    public void setTimezone(org.springframework.graphql.data.ArgumentValue<String> timezone) {
        this.timezone = timezone;
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

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final CreateSiteInput that = (CreateSiteInput) obj;
        return Objects.equals(name, that.name)
            && Objects.equals(timezone, that.timezone)
            && Objects.equals(position, that.position)
            && Objects.equals(polygon, that.polygon);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, timezone, position, polygon);
    }


    public static CreateSiteInput.Builder builder() {
        return new CreateSiteInput.Builder();
    }

    public static class Builder {

        private String name;
        private org.springframework.graphql.data.ArgumentValue<String> timezone = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<GeoJSONPointInput> position = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<GeoJSONMultiPolygonInput> polygon = org.springframework.graphql.data.ArgumentValue.omitted();

        public Builder() {
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setTimezone(org.springframework.graphql.data.ArgumentValue<String> timezone) {
            this.timezone = timezone;
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
            return new CreateSiteInput(name, timezone, position, polygon);
        }

    }
}
