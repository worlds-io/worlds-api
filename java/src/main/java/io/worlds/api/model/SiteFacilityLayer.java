package io.worlds.api.model;

import java.util.Objects;

/**
 * A georeferenced image layer belonging to a [SiteFacility]({{Types.SiteFacility}}).
 */
public class SiteFacilityLayer implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @jakarta.validation.constraints.NotNull
    private String id;
    @jakarta.validation.constraints.NotNull
    private String name;
    @jakarta.validation.constraints.NotNull
    private SiteFacility facility;
    private String imageUrl;
    private GeoJSONPolygon imageBounds;
    private java.lang.Object metadata;

    public SiteFacilityLayer() {
    }

    public SiteFacilityLayer(String id, String name, SiteFacility facility, String imageUrl, GeoJSONPolygon imageBounds, java.lang.Object metadata) {
        this.id = id;
        this.name = name;
        this.facility = facility;
        this.imageUrl = imageUrl;
        this.imageBounds = imageBounds;
        this.metadata = metadata;
    }

    /**
     * The unique identifier of the layer.
     */
    public String getId() {
        return id;
    }
    /**
     * The unique identifier of the layer.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * The name of the layer. Unique within its facility, case-insensitively.
     */
    public String getName() {
        return name;
    }
    /**
     * The name of the layer. Unique within its facility, case-insensitively.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * The facility that the layer belongs to.
     */
    public SiteFacility getFacility() {
        return facility;
    }
    /**
     * The facility that the layer belongs to.
     */
    public void setFacility(SiteFacility facility) {
        this.facility = facility;
    }

    /**
     * The URL of the layer image. Short-lived. Null until an image has been uploaded for the layer.
     */
    public String getImageUrl() {
        return imageUrl;
    }
    /**
     * The URL of the layer image. Short-lived. Null until an image has been uploaded for the layer.
     */
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    /**
     * The geographic bounds that the layer image is stretched to.
     */
    public GeoJSONPolygon getImageBounds() {
        return imageBounds;
    }
    /**
     * The geographic bounds that the layer image is stretched to.
     */
    public void setImageBounds(GeoJSONPolygon imageBounds) {
        this.imageBounds = imageBounds;
    }

    /**
     * Additional metadata associated with the layer. This may represent any JSON object structure.
     */
    public java.lang.Object getMetadata() {
        return metadata;
    }
    /**
     * Additional metadata associated with the layer. This may represent any JSON object structure.
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
        final SiteFacilityLayer that = (SiteFacilityLayer) obj;
        return Objects.equals(id, that.id)
            && Objects.equals(name, that.name)
            && Objects.equals(facility, that.facility)
            && Objects.equals(imageUrl, that.imageUrl)
            && Objects.equals(imageBounds, that.imageBounds)
            && Objects.equals(metadata, that.metadata);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, facility, imageUrl, imageBounds, metadata);
    }


    public static SiteFacilityLayer.Builder builder() {
        return new SiteFacilityLayer.Builder();
    }

    public static class Builder {

        private String id;
        private String name;
        private SiteFacility facility;
        private String imageUrl;
        private GeoJSONPolygon imageBounds;
        private java.lang.Object metadata;

        public Builder() {
        }

        /**
         * The unique identifier of the layer.
         */
        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        /**
         * The name of the layer. Unique within its facility, case-insensitively.
         */
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        /**
         * The facility that the layer belongs to.
         */
        public Builder setFacility(SiteFacility facility) {
            this.facility = facility;
            return this;
        }

        /**
         * The URL of the layer image. Short-lived. Null until an image has been uploaded for the layer.
         */
        public Builder setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }

        /**
         * The geographic bounds that the layer image is stretched to.
         */
        public Builder setImageBounds(GeoJSONPolygon imageBounds) {
            this.imageBounds = imageBounds;
            return this;
        }

        /**
         * Additional metadata associated with the layer. This may represent any JSON object structure.
         */
        public Builder setMetadata(java.lang.Object metadata) {
            this.metadata = metadata;
            return this;
        }


        public SiteFacilityLayer build() {
            return new SiteFacilityLayer(id, name, facility, imageUrl, imageBounds, metadata);
        }

    }
}
