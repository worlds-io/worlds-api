package io.worlds.api.model;


public class FilterActivityChronicleInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private org.springframework.graphql.data.ArgumentValue<FilterIDInput> id = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterStringInput> name = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterDateTimeOffsetInput> startTim = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterDateTimeOffsetInput> endTime = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterStringInput> timezone = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterStringInput> priority = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterStringInput> status = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterStringInput> validation = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterStringListInput> labels = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterStringListInput> locations = org.springframework.graphql.data.ArgumentValue.omitted();
    private org.springframework.graphql.data.ArgumentValue<FilterIDInput> chronicleProducerId = org.springframework.graphql.data.ArgumentValue.omitted();
    private java.util.List<FilterIDInput> videoIds;
    private java.util.List<FilterIDInput> tagIds;
    private java.util.List<FilterIDInput> siteIds;
    private java.util.List<FilterIDInput> dataSourceIds;
    private java.util.List<FilterIDInput> pointOfInterestIds;
    private java.util.List<FilterActivityChronicleInput> and;
    private java.util.List<FilterActivityChronicleInput> or;
    private org.springframework.graphql.data.ArgumentValue<FilterActivityChronicleInput> not = org.springframework.graphql.data.ArgumentValue.omitted();

    public FilterActivityChronicleInput() {
    }

    public FilterActivityChronicleInput(org.springframework.graphql.data.ArgumentValue<FilterIDInput> id, org.springframework.graphql.data.ArgumentValue<FilterStringInput> name, org.springframework.graphql.data.ArgumentValue<FilterDateTimeOffsetInput> startTim, org.springframework.graphql.data.ArgumentValue<FilterDateTimeOffsetInput> endTime, org.springframework.graphql.data.ArgumentValue<FilterStringInput> timezone, org.springframework.graphql.data.ArgumentValue<FilterStringInput> priority, org.springframework.graphql.data.ArgumentValue<FilterStringInput> status, org.springframework.graphql.data.ArgumentValue<FilterStringInput> validation, org.springframework.graphql.data.ArgumentValue<FilterStringListInput> labels, org.springframework.graphql.data.ArgumentValue<FilterStringListInput> locations, org.springframework.graphql.data.ArgumentValue<FilterIDInput> chronicleProducerId, java.util.List<FilterIDInput> videoIds, java.util.List<FilterIDInput> tagIds, java.util.List<FilterIDInput> siteIds, java.util.List<FilterIDInput> dataSourceIds, java.util.List<FilterIDInput> pointOfInterestIds, java.util.List<FilterActivityChronicleInput> and, java.util.List<FilterActivityChronicleInput> or, org.springframework.graphql.data.ArgumentValue<FilterActivityChronicleInput> not) {
        this.id = id;
        this.name = name;
        this.startTim = startTim;
        this.endTime = endTime;
        this.timezone = timezone;
        this.priority = priority;
        this.status = status;
        this.validation = validation;
        this.labels = labels;
        this.locations = locations;
        this.chronicleProducerId = chronicleProducerId;
        this.videoIds = videoIds;
        this.tagIds = tagIds;
        this.siteIds = siteIds;
        this.dataSourceIds = dataSourceIds;
        this.pointOfInterestIds = pointOfInterestIds;
        this.and = and;
        this.or = or;
        this.not = not;
    }

    public org.springframework.graphql.data.ArgumentValue<FilterIDInput> getId() {
        return id;
    }
    public void setId(org.springframework.graphql.data.ArgumentValue<FilterIDInput> id) {
        this.id = id;
    }

    public org.springframework.graphql.data.ArgumentValue<FilterStringInput> getName() {
        return name;
    }
    public void setName(org.springframework.graphql.data.ArgumentValue<FilterStringInput> name) {
        this.name = name;
    }

    public org.springframework.graphql.data.ArgumentValue<FilterDateTimeOffsetInput> getStartTim() {
        return startTim;
    }
    public void setStartTim(org.springframework.graphql.data.ArgumentValue<FilterDateTimeOffsetInput> startTim) {
        this.startTim = startTim;
    }

    public org.springframework.graphql.data.ArgumentValue<FilterDateTimeOffsetInput> getEndTime() {
        return endTime;
    }
    public void setEndTime(org.springframework.graphql.data.ArgumentValue<FilterDateTimeOffsetInput> endTime) {
        this.endTime = endTime;
    }

    public org.springframework.graphql.data.ArgumentValue<FilterStringInput> getTimezone() {
        return timezone;
    }
    public void setTimezone(org.springframework.graphql.data.ArgumentValue<FilterStringInput> timezone) {
        this.timezone = timezone;
    }

    public org.springframework.graphql.data.ArgumentValue<FilterStringInput> getPriority() {
        return priority;
    }
    public void setPriority(org.springframework.graphql.data.ArgumentValue<FilterStringInput> priority) {
        this.priority = priority;
    }

    public org.springframework.graphql.data.ArgumentValue<FilterStringInput> getStatus() {
        return status;
    }
    public void setStatus(org.springframework.graphql.data.ArgumentValue<FilterStringInput> status) {
        this.status = status;
    }

    public org.springframework.graphql.data.ArgumentValue<FilterStringInput> getValidation() {
        return validation;
    }
    public void setValidation(org.springframework.graphql.data.ArgumentValue<FilterStringInput> validation) {
        this.validation = validation;
    }

    public org.springframework.graphql.data.ArgumentValue<FilterStringListInput> getLabels() {
        return labels;
    }
    public void setLabels(org.springframework.graphql.data.ArgumentValue<FilterStringListInput> labels) {
        this.labels = labels;
    }

    public org.springframework.graphql.data.ArgumentValue<FilterStringListInput> getLocations() {
        return locations;
    }
    public void setLocations(org.springframework.graphql.data.ArgumentValue<FilterStringListInput> locations) {
        this.locations = locations;
    }

    public org.springframework.graphql.data.ArgumentValue<FilterIDInput> getChronicleProducerId() {
        return chronicleProducerId;
    }
    public void setChronicleProducerId(org.springframework.graphql.data.ArgumentValue<FilterIDInput> chronicleProducerId) {
        this.chronicleProducerId = chronicleProducerId;
    }

    public java.util.List<FilterIDInput> getVideoIds() {
        return videoIds;
    }
    public void setVideoIds(java.util.List<FilterIDInput> videoIds) {
        this.videoIds = videoIds;
    }

    public java.util.List<FilterIDInput> getTagIds() {
        return tagIds;
    }
    public void setTagIds(java.util.List<FilterIDInput> tagIds) {
        this.tagIds = tagIds;
    }

    public java.util.List<FilterIDInput> getSiteIds() {
        return siteIds;
    }
    public void setSiteIds(java.util.List<FilterIDInput> siteIds) {
        this.siteIds = siteIds;
    }

    public java.util.List<FilterIDInput> getDataSourceIds() {
        return dataSourceIds;
    }
    public void setDataSourceIds(java.util.List<FilterIDInput> dataSourceIds) {
        this.dataSourceIds = dataSourceIds;
    }

    public java.util.List<FilterIDInput> getPointOfInterestIds() {
        return pointOfInterestIds;
    }
    public void setPointOfInterestIds(java.util.List<FilterIDInput> pointOfInterestIds) {
        this.pointOfInterestIds = pointOfInterestIds;
    }

    public java.util.List<FilterActivityChronicleInput> getAnd() {
        return and;
    }
    public void setAnd(java.util.List<FilterActivityChronicleInput> and) {
        this.and = and;
    }

    public java.util.List<FilterActivityChronicleInput> getOr() {
        return or;
    }
    public void setOr(java.util.List<FilterActivityChronicleInput> or) {
        this.or = or;
    }

    public org.springframework.graphql.data.ArgumentValue<FilterActivityChronicleInput> getNot() {
        return not;
    }
    public void setNot(org.springframework.graphql.data.ArgumentValue<FilterActivityChronicleInput> not) {
        this.not = not;
    }



    public static FilterActivityChronicleInput.Builder builder() {
        return new FilterActivityChronicleInput.Builder();
    }

    public static class Builder {

        private org.springframework.graphql.data.ArgumentValue<FilterIDInput> id = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterStringInput> name = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterDateTimeOffsetInput> startTim = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterDateTimeOffsetInput> endTime = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterStringInput> timezone = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterStringInput> priority = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterStringInput> status = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterStringInput> validation = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterStringListInput> labels = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterStringListInput> locations = org.springframework.graphql.data.ArgumentValue.omitted();
        private org.springframework.graphql.data.ArgumentValue<FilterIDInput> chronicleProducerId = org.springframework.graphql.data.ArgumentValue.omitted();
        private java.util.List<FilterIDInput> videoIds;
        private java.util.List<FilterIDInput> tagIds;
        private java.util.List<FilterIDInput> siteIds;
        private java.util.List<FilterIDInput> dataSourceIds;
        private java.util.List<FilterIDInput> pointOfInterestIds;
        private java.util.List<FilterActivityChronicleInput> and;
        private java.util.List<FilterActivityChronicleInput> or;
        private org.springframework.graphql.data.ArgumentValue<FilterActivityChronicleInput> not = org.springframework.graphql.data.ArgumentValue.omitted();

        public Builder() {
        }

        public Builder setId(org.springframework.graphql.data.ArgumentValue<FilterIDInput> id) {
            this.id = id;
            return this;
        }

        public Builder setName(org.springframework.graphql.data.ArgumentValue<FilterStringInput> name) {
            this.name = name;
            return this;
        }

        public Builder setStartTim(org.springframework.graphql.data.ArgumentValue<FilterDateTimeOffsetInput> startTim) {
            this.startTim = startTim;
            return this;
        }

        public Builder setEndTime(org.springframework.graphql.data.ArgumentValue<FilterDateTimeOffsetInput> endTime) {
            this.endTime = endTime;
            return this;
        }

        public Builder setTimezone(org.springframework.graphql.data.ArgumentValue<FilterStringInput> timezone) {
            this.timezone = timezone;
            return this;
        }

        public Builder setPriority(org.springframework.graphql.data.ArgumentValue<FilterStringInput> priority) {
            this.priority = priority;
            return this;
        }

        public Builder setStatus(org.springframework.graphql.data.ArgumentValue<FilterStringInput> status) {
            this.status = status;
            return this;
        }

        public Builder setValidation(org.springframework.graphql.data.ArgumentValue<FilterStringInput> validation) {
            this.validation = validation;
            return this;
        }

        public Builder setLabels(org.springframework.graphql.data.ArgumentValue<FilterStringListInput> labels) {
            this.labels = labels;
            return this;
        }

        public Builder setLocations(org.springframework.graphql.data.ArgumentValue<FilterStringListInput> locations) {
            this.locations = locations;
            return this;
        }

        public Builder setChronicleProducerId(org.springframework.graphql.data.ArgumentValue<FilterIDInput> chronicleProducerId) {
            this.chronicleProducerId = chronicleProducerId;
            return this;
        }

        public Builder setVideoIds(java.util.List<FilterIDInput> videoIds) {
            this.videoIds = videoIds;
            return this;
        }

        public Builder setTagIds(java.util.List<FilterIDInput> tagIds) {
            this.tagIds = tagIds;
            return this;
        }

        public Builder setSiteIds(java.util.List<FilterIDInput> siteIds) {
            this.siteIds = siteIds;
            return this;
        }

        public Builder setDataSourceIds(java.util.List<FilterIDInput> dataSourceIds) {
            this.dataSourceIds = dataSourceIds;
            return this;
        }

        public Builder setPointOfInterestIds(java.util.List<FilterIDInput> pointOfInterestIds) {
            this.pointOfInterestIds = pointOfInterestIds;
            return this;
        }

        public Builder setAnd(java.util.List<FilterActivityChronicleInput> and) {
            this.and = and;
            return this;
        }

        public Builder setOr(java.util.List<FilterActivityChronicleInput> or) {
            this.or = or;
            return this;
        }

        public Builder setNot(org.springframework.graphql.data.ArgumentValue<FilterActivityChronicleInput> not) {
            this.not = not;
            return this;
        }


        public FilterActivityChronicleInput build() {
            return new FilterActivityChronicleInput(id, name, startTim, endTime, timezone, priority, status, validation, labels, locations, chronicleProducerId, videoIds, tagIds, siteIds, dataSourceIds, pointOfInterestIds, and, or, not);
        }

    }
}
