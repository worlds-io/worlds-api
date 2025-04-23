package io.worlds.api.model;

public enum SensorSortField {

    ID("ID"),
    NAME("NAME");

    private final String graphqlName;

    private SensorSortField(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
