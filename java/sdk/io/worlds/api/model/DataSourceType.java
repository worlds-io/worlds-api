package io.worlds.api.model;

public enum DataSourceType {

    FOLDER("FOLDER"),
    VIDEO_DEVICE("VIDEO_DEVICE"),
    IMAGE_DEVICE("IMAGE_DEVICE"),
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
