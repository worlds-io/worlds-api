package io.worlds.api.model;

/**
 * Indicates the field used for sorting an `sensors` query.
 */
public enum SensorsSortField {

    /**
     * Sort the resulting list by the `sensor`'s unique identifier.
     */
    ID("ID"),
    /**
     * Sort the resulting list by the `sensor`'s name.
     */
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
