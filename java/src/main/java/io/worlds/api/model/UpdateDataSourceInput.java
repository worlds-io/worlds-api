package io.worlds.api.model;


public class UpdateDataSourceInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private String id;
    private org.springframework.graphql.data.ArgumentValue<String> name = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<DataSourceType> type = org.springframework.graphql.data.ArgumentValue.omitted();

    public UpdateDataSourceInput() {
    }

    public UpdateDataSourceInput(String id, org.springframework.graphql.data.ArgumentValue<String> name, org.springframework.graphql.data.ArgumentValue<DataSourceType> type) {
        this.id = id;
        this.name = name;
        this.type = type;
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

    public org.springframework.graphql.data.ArgumentValue<DataSourceType> getType() {
        return type;
    }
    public void setType(org.springframework.graphql.data.ArgumentValue<DataSourceType> type) {
        this.type = type;
    }



    public static UpdateDataSourceInput.Builder builder() {
        return new UpdateDataSourceInput.Builder();
    }

    public static class Builder {

        private String id;
        private org.springframework.graphql.data.ArgumentValue<String> name = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<DataSourceType> type = org.springframework.graphql.data.ArgumentValue.omitted();

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

        public Builder setType(org.springframework.graphql.data.ArgumentValue<DataSourceType> type) {
            this.type = type;
            return this;
        }


        public UpdateDataSourceInput build() {
            return new UpdateDataSourceInput(id, name, type);
        }

    }
}
