package io.worlds.api.model;


public class SitesSort implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private SitesSortField field;
    @jakarta.validation.constraints.NotNull
    private SortDirection direction;

    public SitesSort() {
    }

    public SitesSort(SitesSortField field, SortDirection direction) {
        this.field = field;
        this.direction = direction;
    }

    public SitesSortField getField() {
        return field;
    }
    public void setField(SitesSortField field) {
        this.field = field;
    }

    public SortDirection getDirection() {
        return direction;
    }
    public void setDirection(SortDirection direction) {
        this.direction = direction;
    }



    public static SitesSort.Builder builder() {
        return new SitesSort.Builder();
    }

    public static class Builder {

        private SitesSortField field;
        private SortDirection direction;

        public Builder() {
        }

        public Builder setField(SitesSortField field) {
            this.field = field;
            return this;
        }

        public Builder setDirection(SortDirection direction) {
            this.direction = direction;
            return this;
        }


        public SitesSort build() {
            return new SitesSort(field, direction);
        }

    }
}
