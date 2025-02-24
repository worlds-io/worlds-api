package io.worlds.api.model;

public enum DataSourceSortField {

    ID("ID"),
    NAME("NAME");

    private final String graphqlName;

    private DataSourceSortField(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
