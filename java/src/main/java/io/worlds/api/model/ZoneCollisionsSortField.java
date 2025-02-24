package io.worlds.api.model;

public enum ZoneCollisionsSortField {

    ID("ID"),
    START_TIME("START_TIME");

    private final String graphqlName;

    private ZoneCollisionsSortField(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
