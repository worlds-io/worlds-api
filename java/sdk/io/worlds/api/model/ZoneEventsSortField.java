package io.worlds.api.model;

public enum ZoneEventsSortField {

    ID("ID"),
    START_TIME("START_TIME");

    private final String graphqlName;

    private ZoneEventsSortField(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
