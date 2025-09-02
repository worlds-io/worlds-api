package io.worlds.api.model;

/**
 * Indicates the type of a [DataSource]({{Types.datasource}})
 */
public enum DataSourceType {

    /**
     * A data source that is simply meant to store videos or images
     */
    FOLDER("FOLDER"),
    /**
     * 
A data source that corresponds to a [Device]({{Types.device}}) that is generating video.
     */
    VIDEO_DEVICE("VIDEO_DEVICE"),
    /**
     * 
A data source that corresponds to a [Device]({{Types.device}}) that is generating images.
     */
    IMAGE_DEVICE("IMAGE_DEVICE"),
    /**
     * 
A data source that directly produces [Tracks]({{Types.track}}) and [detections]({{Types.detection}})
     */
    GEOPOSITION("GEOPOSITION");

    private final String graphqlName;

    private DataSourceType(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
