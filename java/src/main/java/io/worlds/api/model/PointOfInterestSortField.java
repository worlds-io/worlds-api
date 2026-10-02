package io.worlds.api.model;

/**
 * Indicates the field used for sorting a `pointsOfInterest` query.
 */
public enum PointOfInterestSortField {

    /**
     * Sort the resulting list by the `Point of Interest`'s unique identifier.
     */
    ID("ID"),
    /**
     * Sort the resulting list by the `Point of Interest`'s name.
     */
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
