package io.worlds.api.model;

public enum ZonesSortField {

    ID("ID"),
    NAME("NAME");

    private final String graphqlName;

    private ZonesSortField(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
