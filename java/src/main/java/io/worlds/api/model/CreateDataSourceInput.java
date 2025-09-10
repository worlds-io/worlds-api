package io.worlds.api.model;


/**
 * This type is used to create a new [`DataSource`]({{Types.datasource}})
 */
public class CreateDataSourceInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private String name;
    @jakarta.validation.constraints.NotNull
    private DataSourceType type;
    private java.util.List<String> labels;

    public CreateDataSourceInput() {
    }

    public CreateDataSourceInput(String name, DataSourceType type, java.util.List<String> labels) {
        this.name = name;
        this.type = type;
        this.labels = labels;
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

    public java.util.List<String> getLabels() {
        return labels;
    }
    public void setLabels(java.util.List<String> labels) {
        this.labels = labels;
    }



    public static CreateDataSourceInput.Builder builder() {
        return new CreateDataSourceInput.Builder();
    }

    public static class Builder {

        private String name;
        private DataSourceType type;
        private java.util.List<String> labels;

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

        public Builder setLabels(java.util.List<String> labels) {
            this.labels = labels;
            return this;
        }


        public CreateDataSourceInput build() {
            return new CreateDataSourceInput(name, type, labels);
        }

    }
}
