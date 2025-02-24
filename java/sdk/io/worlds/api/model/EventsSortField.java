package io.worlds.api.model;

public enum EventsSortField {

    ID("ID"),
    START_TIME("START_TIME");

    private final String graphqlName;

    private EventsSortField(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
