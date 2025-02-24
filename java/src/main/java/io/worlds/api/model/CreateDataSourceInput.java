package io.worlds.api.model;


public class CreateDataSourceInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private String name;
    @jakarta.validation.constraints.NotNull
    private DataSourceType type;

    public CreateDataSourceInput() {
    }

    public CreateDataSourceInput(String name, DataSourceType type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public DataSourceType getType() {
        return type;
    }
    public void setType(DataSourceType type) {
        this.type = type;
    }



    public static CreateDataSourceInput.Builder builder() {
        return new CreateDataSourceInput.Builder();
    }

    public static class Builder {

        private String name;
        private DataSourceType type;

        public Builder() {
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setType(DataSourceType type) {
            this.type = type;
            return this;
        }


        public CreateDataSourceInput build() {
            return new CreateDataSourceInput(name, type);
        }

    }
}
