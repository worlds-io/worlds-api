package io.worlds.api.model;

public enum SitesSortField {

    ID("ID"),
    NAME("NAME");

    private final String graphqlName;

    private SitesSortField(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
