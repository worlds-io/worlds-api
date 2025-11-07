package io.worlds.api.model;

import java.util.Objects;

/**
 * This input type contains additional details and related information for an event. For more details on event producers and events, see [`EventProducer`]({{Types.EventProducer}}).
 */
public class EventPropertiesInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private java.util.List<String> siteIds;
    private java.util.List<String> dataSourceIds;
    private java.util.List<String> tags;
    private java.util.List<String> pointOfInterestIds;

    public EventPropertiesInput() {
    }

    public EventPropertiesInput(java.util.List<String> siteIds, java.util.List<String> dataSourceIds, java.util.List<String> tags, java.util.List<String> pointOfInterestIds) {
        this.siteIds = siteIds;
        this.dataSourceIds = dataSourceIds;
        this.tags = tags;
        this.pointOfInterestIds = pointOfInterestIds;
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

    public java.util.List<String> getPointOfInterestIds() {
        return pointOfInterestIds;
    }
    public void setPointOfInterestIds(java.util.List<String> pointOfInterestIds) {
        this.pointOfInterestIds = pointOfInterestIds;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final EventPropertiesInput that = (EventPropertiesInput) obj;
        return Objects.equals(siteIds, that.siteIds)
            && Objects.equals(dataSourceIds, that.dataSourceIds)
            && Objects.equals(tags, that.tags)
            && Objects.equals(pointOfInterestIds, that.pointOfInterestIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(siteIds, dataSourceIds, tags, pointOfInterestIds);
    }


    public static EventPropertiesInput.Builder builder() {
        return new EventPropertiesInput.Builder();
    }

    public static class Builder {

        private java.util.List<String> siteIds;
        private java.util.List<String> dataSourceIds;
        private java.util.List<String> tags;
        private java.util.List<String> pointOfInterestIds;

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

        public Builder setPointOfInterestIds(java.util.List<String> pointOfInterestIds) {
            this.pointOfInterestIds = pointOfInterestIds;
            return this;
        }


        public EventPropertiesInput build() {
            return new EventPropertiesInput(siteIds, dataSourceIds, tags, pointOfInterestIds);
        }

    }
}
