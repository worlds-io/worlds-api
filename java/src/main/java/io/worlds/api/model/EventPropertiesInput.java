package io.worlds.api.model;


public class EventPropertiesInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private java.util.List<String> siteIds;
    private java.util.List<String> dataSourceIds;
    private java.util.List<String> tags;

    public EventPropertiesInput() {
    }

    public EventPropertiesInput(java.util.List<String> siteIds, java.util.List<String> dataSourceIds, java.util.List<String> tags) {
        this.siteIds = siteIds;
        this.dataSourceIds = dataSourceIds;
        this.tags = tags;
    }

    public java.util.List<String> getSiteIds() {
        return siteIds;
    }
    public void setSiteIds(java.util.List<String> siteIds) {
        this.siteIds = siteIds;
    }

    public java.util.List<String> getDataSourceIds() {
        return dataSourceIds;
    }
    public void setDataSourceIds(java.util.List<String> dataSourceIds) {
        this.dataSourceIds = dataSourceIds;
    }

    public java.util.List<String> getTags() {
        return tags;
    }
    public void setTags(java.util.List<String> tags) {
        this.tags = tags;
    }



    public static EventPropertiesInput.Builder builder() {
        return new EventPropertiesInput.Builder();
    }

    public static class Builder {

        private java.util.List<String> siteIds;
        private java.util.List<String> dataSourceIds;
        private java.util.List<String> tags;

        public Builder() {
        }

        public Builder setSiteIds(java.util.List<String> siteIds) {
            this.siteIds = siteIds;
            return this;
        }

        public Builder setDataSourceIds(java.util.List<String> dataSourceIds) {
            this.dataSourceIds = dataSourceIds;
            return this;
        }

        public Builder setTags(java.util.List<String> tags) {
            this.tags = tags;
            return this;
        }


        public EventPropertiesInput build() {
            return new EventPropertiesInput(siteIds, dataSourceIds, tags);
        }

    }
}
