package io.worlds.api.model;

public enum SensorsSortField {

    ID("ID"),
    NAME("NAME");

    private final String graphqlName;

    private SensorsSortField(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
