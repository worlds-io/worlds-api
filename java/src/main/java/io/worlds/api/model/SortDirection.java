package io.worlds.api.model;

public enum SortDirection {

    ASC("ASC"),
    DESC("DESC");

    private final String graphqlName;

    private SortDirection(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
