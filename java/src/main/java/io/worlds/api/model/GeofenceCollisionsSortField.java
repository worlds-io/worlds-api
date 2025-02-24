package io.worlds.api.model;

public enum GeofenceCollisionsSortField {

    ID("ID"),
    START_TIME("START_TIME");

    private final String graphqlName;

    private GeofenceCollisionsSortField(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
