package io.worlds.api.model;

public enum GeofenceIntersectionsSortField {

    ID("ID"),
    START_TIME("START_TIME");

    private final String graphqlName;

    private GeofenceIntersectionsSortField(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
