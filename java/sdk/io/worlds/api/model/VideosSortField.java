package io.worlds.api.model;

public enum VideosSortField {

    ID("ID"),
    DATA_SOURCE_ID("DATA_SOURCE_ID"),
    START_TIME("START_TIME"),
    END_TIME("END_TIME");

    private final String graphqlName;

    private VideosSortField(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
