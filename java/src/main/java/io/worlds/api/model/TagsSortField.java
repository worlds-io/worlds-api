package io.worlds.api.model;

public enum TagsSortField {

    ID("ID"),
    LABEL_NAME("LABEL_NAME");

    private final String graphqlName;

    private TagsSortField(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
