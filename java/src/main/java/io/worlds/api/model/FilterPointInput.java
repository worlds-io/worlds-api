package io.worlds.api.model;

import java.util.Objects;

/**
 * FilterPoinInput is used to filter records by their positional values
 */
public class FilterPointInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private org.springframework.graphql.data.ArgumentValue<GeoJSONPolygonInput> in = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterPointNearInput> near = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<Boolean> attributeExists = org.springframework.graphql.data.ArgumentValue.omitted();

    public FilterPointInput() {
    }

    public FilterPointInput(org.springframework.graphql.data.ArgumentValue<GeoJSONPolygonInput> in, org.springframework.graphql.data.ArgumentValue<FilterPointNearInput> near, org.springframework.graphql.data.ArgumentValue<Boolean> attributeExists) {
        this.in = in;
        this.near = near;
        this.attributeExists = attributeExists;
    }

    public org.springframework.graphql.data.ArgumentValue<GeoJSONPolygonInput> getIn() {
        return in;
    }
    public void setIn(org.springframework.graphql.data.ArgumentValue<GeoJSONPolygonInput> in) {
        this.in = in;
    }

    public org.springframework.graphql.data.ArgumentValue<FilterPointNearInput> getNear() {
        return near;
    }
    public void setNear(org.springframework.graphql.data.ArgumentValue<FilterPointNearInput> near) {
        this.near = near;
    }

    public org.springframework.graphql.data.ArgumentValue<Boolean> getAttributeExists() {
        return attributeExists;
    }
    public void setAttributeExists(org.springframework.graphql.data.ArgumentValue<Boolean> attributeExists) {
        this.attributeExists = attributeExists;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final FilterPointInput that = (FilterPointInput) obj;
        return Objects.equals(in, that.in)
            && Objects.equals(near, that.near)
            && Objects.equals(attributeExists, that.attributeExists);
    }

    @Override
    public int hashCode() {
        return Objects.hash(in, near, attributeExists);
    }


    public static FilterPointInput.Builder builder() {
        return new FilterPointInput.Builder();
    }

    public static class Builder {

        private org.springframework.graphql.data.ArgumentValue<GeoJSONPolygonInput> in = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterPointNearInput> near = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<Boolean> attributeExists = org.springframework.graphql.data.ArgumentValue.omitted();

        public Builder() {
        }

        public Builder setIn(org.springframework.graphql.data.ArgumentValue<GeoJSONPolygonInput> in) {
            this.in = in;
            return this;
        }

        public Builder setNear(org.springframework.graphql.data.ArgumentValue<FilterPointNearInput> near) {
            this.near = near;
            return this;
        }

        public Builder setAttributeExists(org.springframework.graphql.data.ArgumentValue<Boolean> attributeExists) {
            this.attributeExists = attributeExists;
            return this;
        }


        public FilterPointInput build() {
            return new FilterPointInput(in, near, attributeExists);
        }

    }
}
