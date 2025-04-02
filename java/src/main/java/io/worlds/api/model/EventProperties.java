package io.worlds.api.model;


public class EventProperties implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private java.util.List<Site> sites;
    private java.util.List<DataSource> dataSources;
    private java.util.List<Tag> tags;

    public EventProperties() {
    }

    public EventProperties(java.util.List<Site> sites, java.util.List<DataSource> dataSources, java.util.List<Tag> tags) {
        this.sites = sites;
        this.dataSources = dataSources;
        this.tags = tags;
    }

    public java.util.List<Site> getSites() {
        return sites;
    }
    public void setSites(java.util.List<Site> sites) {
        this.sites = sites;
    }

    public java.util.List<DataSource> getDataSources() {
        return dataSources;
    }
    public void setDataSources(java.util.List<DataSource> dataSources) {
        this.dataSources = dataSources;
    }

    public java.util.List<Tag> getTags() {
        return tags;
    }
    public void setTags(java.util.List<Tag> tags) {
        this.tags = tags;
    }



    public static EventProperties.Builder builder() {
        return new EventProperties.Builder();
    }

    public static class Builder {

        private java.util.List<Site> sites;
        private java.util.List<DataSource> dataSources;
        private java.util.List<Tag> tags;

        public Builder() {
        }

        public Builder setSites(java.util.List<Site> sites) {
            this.sites = sites;
            return this;
        }

        public Builder setDataSources(java.util.List<DataSource> dataSources) {
            this.dataSources = dataSources;
            return this;
        }

        public Builder setTags(java.util.List<Tag> tags) {
            this.tags = tags;
            return this;
        }


        public EventProperties build() {
            return new EventProperties(sites, dataSources, tags);
        }

    }
}
