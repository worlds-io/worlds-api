package io.worlds.api.model;

public enum ZoneIntersectionsSortField {

    ID("ID"),
    START_TIME("START_TIME");

    private final String graphqlName;

    private ZoneIntersectionsSortField(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
