package io.worlds.api.model;

public enum PointOfInterestSortField {

    ID("ID"),
    NAME("NAME");

    private final String graphqlName;

    private PointOfInterestSortField(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
