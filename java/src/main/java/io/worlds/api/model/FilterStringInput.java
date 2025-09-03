package io.worlds.api.model;


/**
 * `FilterStringInput` allows for filtering based on a string parameter. Only one field should be provided per filter object.
 */
public class FilterStringInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private org.springframework.graphql.data.ArgumentValue<String> ne = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<String> eq = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<String> like = org.springframework.graphql.data.ArgumentValue.omitted();
    private java.util.List<String> in;
    private org.springframework.graphql.data.ArgumentValue<Boolean> attributeExists = org.springframework.graphql.data.ArgumentValue.omitted();

    public FilterStringInput() {
    }

    public FilterStringInput(org.springframework.graphql.data.ArgumentValue<String> ne, org.springframework.graphql.data.ArgumentValue<String> eq, org.springframework.graphql.data.ArgumentValue<String> like, java.util.List<String> in, org.springframework.graphql.data.ArgumentValue<Boolean> attributeExists) {
        this.ne = ne;
        this.eq = eq;
        this.like = like;
        this.in = in;
        this.attributeExists = attributeExists;
    }

    public org.springframework.graphql.data.ArgumentValue<String> getNe() {
        return ne;
    }
    public void setNe(org.springframework.graphql.data.ArgumentValue<String> ne) {
        this.ne = ne;
    }

    public org.springframework.graphql.data.ArgumentValue<String> getEq() {
        return eq;
    }
    public void setEq(org.springframework.graphql.data.ArgumentValue<String> eq) {
        this.eq = eq;
    }

    public org.springframework.graphql.data.ArgumentValue<String> getLike() {
        return like;
    }
    public void setLike(org.springframework.graphql.data.ArgumentValue<String> like) {
        this.like = like;
    }

    public java.util.List<String> getIn() {
        return in;
    }
    public void setIn(java.util.List<String> in) {
        this.in = in;
    }

    public org.springframework.graphql.data.ArgumentValue<Boolean> getAttributeExists() {
        return attributeExists;
    }
    public void setAttributeExists(org.springframework.graphql.data.ArgumentValue<Boolean> attributeExists) {
        this.attributeExists = attributeExists;
    }



    public static FilterStringInput.Builder builder() {
        return new FilterStringInput.Builder();
    }

    public static class Builder {

        private org.springframework.graphql.data.ArgumentValue<String> ne = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<String> eq = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<String> like = org.springframework.graphql.data.ArgumentValue.omitted();
        private java.util.List<String> in;
        private org.springframework.graphql.data.ArgumentValue<Boolean> attributeExists = org.springframework.graphql.data.ArgumentValue.omitted();

        public Builder() {
        }

        public Builder setNe(org.springframework.graphql.data.ArgumentValue<String> ne) {
            this.ne = ne;
            return this;
        }

        public Builder setEq(org.springframework.graphql.data.ArgumentValue<String> eq) {
            this.eq = eq;
            return this;
        }

        public Builder setLike(org.springframework.graphql.data.ArgumentValue<String> like) {
            this.like = like;
            return this;
        }

        public Builder setIn(java.util.List<String> in) {
            this.in = in;
            return this;
        }

        public Builder setAttributeExists(org.springframework.graphql.data.ArgumentValue<Boolean> attributeExists) {
            this.attributeExists = attributeExists;
            return this;
        }


        public FilterStringInput build() {
            return new FilterStringInput(ne, eq, like, in, attributeExists);
        }

    }
}
