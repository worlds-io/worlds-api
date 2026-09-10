package io.worlds.api.model;

import java.util.Objects;

/**
 * A facility is a structure within a [Site]({{Types.Site}}).
A facility owns one or more [SiteFacilityLayers]({{Types.SiteFacilityLayer}}), each a georeferenced
image that can be drawn over the site's map.
 */
public class SiteFacility implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private String id;
    @jakarta.validation.constraints.NotNull
    private String name;
    @jakarta.validation.constraints.NotNull
    private Site site;
    @jakarta.validation.constraints.NotNull
    private java.util.List<SiteFacilityLayer> layers;
    private java.lang.Object metadata;

    public SiteFacility() {
    }

    public SiteFacility(String id, String name, Site site, java.util.List<SiteFacilityLayer> layers, java.lang.Object metadata) {
        this.id = id;
        this.name = name;
        this.site = site;
        this.layers = layers;
        this.metadata = metadata;
    }

    /**
     * The unique identifier of the facility.
     */
    public String getId() {
        return id;
    }
    /**
     * The unique identifier of the facility.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * The name of the facility. Unique within its site.
     */
    public String getName() {
        return name;
    }
    /**
     * The name of the facility. Unique within its site.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * The site that the facility belongs to.
     */
    public Site getSite() {
        return site;
    }
    /**
     * The site that the facility belongs to.
     */
    public void setSite(Site site) {
        this.site = site;
    }

    /**
     * The image layers that make up this facility.
     */
    public java.util.List<SiteFacilityLayer> getLayers() {
        return layers;
    }
    /**
     * The image layers that make up this facility.
     */
    public void setLayers(java.util.List<SiteFacilityLayer> layers) {
        this.layers = layers;
    }

    /**
     * Additional metadata associated with the facility. This may represent any JSON object structure.
     */
    public java.lang.Object getMetadata() {
        return metadata;
    }
    /**
     * Additional metadata associated with the facility. This may represent any JSON object structure.
     */
    public void setMetadata(java.lang.Object metadata) {
        this.metadata = metadata;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final SiteFacility that = (SiteFacility) obj;
        return Objects.equals(id, that.id)
            && Objects.equals(name, that.name)
            && Objects.equals(site, that.site)
            && Objects.equals(layers, that.layers)
            && Objects.equals(metadata, that.metadata);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, site, layers, metadata);
    }


    public static SiteFacility.Builder builder() {
        return new SiteFacility.Builder();
    }

    public static class Builder {

        private String id;
        private String name;
        private Site site;
        private java.util.List<SiteFacilityLayer> layers;
        private java.lang.Object metadata;

        public Builder() {
        }

        /**
         * The unique identifier of the facility.
         */
        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        /**
         * The name of the facility. Unique within its site.
         */
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        /**
         * The site that the facility belongs to.
         */
        public Builder setSite(Site site) {
            this.site = site;
            return this;
        }

        /**
         * The image layers that make up this facility.
         */
        public Builder setLayers(java.util.List<SiteFacilityLayer> layers) {
            this.layers = layers;
            return this;
        }

        /**
         * Additional metadata associated with the facility. This may represent any JSON object structure.
         */
        public Builder setMetadata(java.lang.Object metadata) {
            this.metadata = metadata;
            return this;
        }


        public SiteFacility build() {
            return new SiteFacility(id, name, site, layers, metadata);
        }

    }
}
